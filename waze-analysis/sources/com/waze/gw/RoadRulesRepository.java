package com.waze.gw;

import android.content.Context;
import android.util.Log;
import androidx.media3.muxer.MuxerUtil;
import com.waze.gw.RoadNoticeDatabase;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class RoadRulesRepository {
    private static final String MOD_PREFS = "waze_hud_gw";
    private static final String PREF_TTS = "road_notice_tts";
    private static final String TAG = "WazeGW-Rules";
    private static volatile long segmentGeneration;
    private static final TimeZone VIETNAM = TimeZone.getTimeZone("Asia/Ho_Chi_Minh");
    private static final ScheduledExecutorService WORKER = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.waze.gw.RoadRulesRepository.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "WazeGW-road-rules");
            thread.setDaemon(true);
            return thread;
        }
    });
    private static final Map<String, Integer> tripRepeats = new HashMap();
    private static final Map<String, Long> lastSpokenAt = new HashMap();
    private static volatile long currentSegmentId = -1;

    private RoadRulesRepository() {
    }

    public static final class SegmentSnapshot {
        public final int clientId;
        public final long nodePair;
        public final int routeIndex;
        public final long segmentId;
        public final String source;
        public final String streetName;
        public final int tileId;

        public SegmentSnapshot(long j2, long j3, int i2, int i3, int i4, String str, String str2) {
            this.segmentId = j2;
            this.nodePair = j3;
            this.routeIndex = i2;
            this.tileId = i3;
            this.clientId = i4;
            this.streetName = str == null ? "" : str;
            this.source = str2 == null ? "" : str2;
        }

        public long fromNodeId() {
            if (this.nodePair > 0) {
                return this.nodePair >>> 32;
            }
            return -1L;
        }

        public long toNodeId() {
            if (this.nodePair > 0) {
                return this.nodePair & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            }
            return -1L;
        }
    }

    static void onSegmentChanged(Context context, final SegmentSnapshot segmentSnapshot) {
        if (segmentSnapshot == null || segmentSnapshot.segmentId <= 0) {
            return;
        }
        currentSegmentId = segmentSnapshot.segmentId;
        final long j2 = segmentGeneration + 1;
        segmentGeneration = j2;
        Gateway.parkingRestriction = 0;
        MinimumSpeedPolicy.publishBackendMinimumSpeed(segmentSnapshot.segmentId, null);
        final Context applicationContext = context != null ? context.getApplicationContext() : null;
        WORKER.execute(new Runnable() { // from class: com.waze.gw.RoadRulesRepository.2
            @Override // java.lang.Runnable
            public void run() {
                if (RoadRulesRepository.stillCurrent(segmentSnapshot.segmentId, j2)) {
                    RoadNoticeDatabase roadNoticeDatabase = RoadNoticeClient.get(applicationContext);
                    RoadNoticeDatabase.SegmentRecord segmentRecordFind = roadNoticeDatabase == null ? null : roadNoticeDatabase.find(segmentSnapshot.segmentId);
                    Evaluation evaluationEvaluate = RoadRulesRepository.evaluate(segmentRecordFind, segmentSnapshot, System.currentTimeMillis());
                    RoadRulesRepository.applyIfCurrent(segmentSnapshot.segmentId, j2, evaluationEvaluate);
                    RoadRulesRepository.maybeSpeak(applicationContext, segmentSnapshot.segmentId, j2, evaluationEvaluate.voice);
                    Log.i(RoadRulesRepository.TAG, "segment=" + segmentSnapshot.segmentId + " dataset=" + (roadNoticeDatabase == null ? "none" : Long.toString(roadNoticeDatabase.datasetVersion)) + " notices=" + (segmentRecordFind == null ? 0 : segmentRecordFind.notices.size()));
                }
            }
        });
    }

    static void onSegmentCleared(long j2) {
        currentSegmentId = -1L;
        segmentGeneration++;
        Gateway.parkingRestriction = 0;
        MinimumSpeedPolicy.clearBackendState();
        Log.i(TAG, "segment cleared previous=" + j2);
    }

    static void onTripReset() {
        RoadPointNoticeRepository.onTripReset();
        WORKER.execute(new Runnable() { // from class: com.waze.gw.RoadRulesRepository.3
            @Override // java.lang.Runnable
            public void run() {
                RoadRulesRepository.tripRepeats.clear();
                Log.i(RoadRulesRepository.TAG, "road notice trip counters reset");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Evaluation evaluate(RoadNoticeDatabase.SegmentRecord segmentRecord, SegmentSnapshot segmentSnapshot, long j2) {
        Evaluation evaluation = new Evaluation();
        if (segmentRecord == null) {
            return evaluation;
        }
        for (RoadNoticeDatabase.Notice notice : segmentRecord.notices) {
            if (applies(segmentRecord, notice, segmentSnapshot, j2)) {
                if (notice.type == 1 && notice.hasValueKmh && notice.valueKmh >= 0 && better(notice, evaluation.minimumNotice)) {
                    evaluation.minimumNotice = notice;
                    evaluation.minimumSpeed = Integer.valueOf(notice.valueKmh);
                }
                if ((notice.type == 2 || notice.type == 3) && scheduleActive(notice.schedule, j2) && better(notice, evaluation.parkingNotice)) {
                    evaluation.parkingNotice = notice;
                    evaluation.parkingRestriction = notice.type != 3 ? 1 : 2;
                }
                if (notice.triggerMode == 1 && voiceText(notice) != null && better(notice, evaluation.voice)) {
                    evaluation.voice = notice;
                }
            }
        }
        return evaluation;
    }

    static boolean applies(RoadNoticeDatabase.SegmentRecord segmentRecord, RoadNoticeDatabase.Notice notice, SegmentSnapshot segmentSnapshot, long j2) {
        if (!notice.enabled) {
            return false;
        }
        if (notice.hasValidFrom && j2 < notice.validFromMs) {
            return false;
        }
        if (notice.hasValidUntil && j2 >= notice.validUntilMs) {
            return false;
        }
        if (notice.direction == 1) {
            return true;
        }
        long jFromNodeId = segmentSnapshot.fromNodeId();
        long nodeId = segmentSnapshot.toNodeId();
        if (jFromNodeId < 0 || nodeId < 0 || segmentRecord.fromNodeId < 0 || segmentRecord.toNodeId < 0) {
            return false;
        }
        return notice.direction == 2 ? jFromNodeId == segmentRecord.fromNodeId && nodeId == segmentRecord.toNodeId : notice.direction == 3 && jFromNodeId == segmentRecord.toNodeId && nodeId == segmentRecord.fromNodeId;
    }

    static boolean better(RoadNoticeDatabase.Notice notice, RoadNoticeDatabase.Notice notice2) {
        if (notice2 == null) {
            return true;
        }
        return notice.priority != notice2.priority ? notice.priority > notice2.priority : notice.noticeId.compareTo(notice2.noticeId) < 0;
    }

    static boolean scheduleActive(RoadNoticeDatabase.RestrictionSchedule restrictionSchedule, long j2) {
        if (restrictionSchedule == null) {
            return true;
        }
        Calendar calendar = Calendar.getInstance(VIETNAM);
        calendar.setTimeInMillis(j2);
        int i2 = calendar.get(5);
        if (restrictionSchedule.dayRule == 2 && (i2 & 1) == 0) {
            return false;
        }
        if (restrictionSchedule.dayRule == 3 && (i2 & 1) != 0) {
            return false;
        }
        if (restrictionSchedule.dayRule != 0 && restrictionSchedule.dayRule != 1 && restrictionSchedule.dayRule != 2 && restrictionSchedule.dayRule != 3) {
            return false;
        }
        int i3 = (calendar.get(11) * 60) + calendar.get(12);
        List<RoadNoticeDatabase.TimeRange> list = restrictionSchedule.ranges;
        if (list.isEmpty()) {
            return !restrictionSchedule.hasLegacyRange || inRange(i3, restrictionSchedule.startMinute, restrictionSchedule.endMinute);
        }
        for (RoadNoticeDatabase.TimeRange timeRange : list) {
            if (inRange(i3, timeRange.startMinute, timeRange.endMinute)) {
                return true;
            }
        }
        return false;
    }

    static boolean inRange(int i2, int i3, int i4) {
        if (i3 < 0 || i3 > 1439 || i4 < 0 || i4 > 1439 || i3 == i4) {
            return false;
        }
        return i3 < i4 ? i2 >= i3 && i2 < i4 : i2 >= i3 || i2 < i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyIfCurrent(long j2, long j3, Evaluation evaluation) {
        if (!stillCurrent(j2, j3) || Gateway.hudRoadSegmentId != j2) {
            return;
        }
        MinimumSpeedPolicy.publishBackendMinimumSpeed(j2, evaluation.minimumSpeed);
        Gateway.parkingRestriction = evaluation.parkingRestriction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void maybeSpeak(final Context context, final long j2, final long j3, final RoadNoticeDatabase.Notice notice) {
        final String strVoiceText;
        if (notice == null || context == null || !Gateway.modEnabled(context) || !context.getSharedPreferences(MOD_PREFS, 0).getBoolean(PREF_TTS, true) || (strVoiceText = voiceText(notice)) == null || !maySpeak(j2, notice, System.currentTimeMillis())) {
            return;
        }
        if (WazeTtsBridge.speak(strVoiceText)) {
            markSpoken(j2, notice, System.currentTimeMillis());
            Log.i(TAG, "TTS segment=" + j2 + " notice=" + notice.noticeId);
        } else {
            WORKER.schedule(new Runnable() { // from class: com.waze.gw.RoadRulesRepository.4
                @Override // java.lang.Runnable
                public void run() {
                    if (RoadRulesRepository.stillCurrent(j2, j3) && Gateway.hudRoadSegmentId == j2 && Gateway.modEnabled(context) && context.getSharedPreferences(RoadRulesRepository.MOD_PREFS, 0).getBoolean(RoadRulesRepository.PREF_TTS, true)) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (RoadRulesRepository.maySpeak(j2, notice, jCurrentTimeMillis) && WazeTtsBridge.speak(strVoiceText)) {
                            RoadRulesRepository.markSpoken(j2, notice, jCurrentTimeMillis);
                            Log.i(RoadRulesRepository.TAG, "TTS retry segment=" + j2 + " notice=" + notice.noticeId);
                        }
                    }
                }
            }, 1L, TimeUnit.SECONDS);
        }
    }

    static String voiceText(RoadNoticeDatabase.Notice notice) {
        String strTrim;
        StringBuilder sb;
        String str;
        if (notice.type == 9) {
            strTrim = notice.title != null ? notice.title.trim() : "";
            if (strTrim.isEmpty()) {
                return null;
            }
            if (strTrim.toLowerCase(Locale.ROOT).startsWith("lối ra")) {
                sb = new StringBuilder();
                str = "Sắp đến ";
            } else {
                sb = new StringBuilder();
                str = "Sắp đến lối ra ";
            }
            return sb.append(str).append(strTrim).toString();
        }
        if (notice.type == 8) {
            return "Phía trước có trạm DỪNG cao tốc";
        }
        if (notice.type == 7) {
            return "Phía trước có trạm DỪNG";
        }
        if (notice.type != 4) {
            return null;
        }
        strTrim = notice.voiceText != null ? notice.voiceText.trim() : "";
        if (strTrim.isEmpty()) {
            return null;
        }
        return strTrim;
    }

    static boolean maySpeak(long j2, RoadNoticeDatabase.Notice notice, long j3) {
        String strKey = key(j2, notice.noticeId);
        Integer num = tripRepeats.get(strKey);
        if (notice.maxRepeatsPerTrip > 0 && num != null && num.intValue() >= notice.maxRepeatsPerTrip) {
            return false;
        }
        Long l2 = lastSpokenAt.get(strKey);
        long jMax = Math.max(0L, notice.cooldownSeconds) * 1000;
        return jMax == 0 || l2 == null || j3 - l2.longValue() >= jMax;
    }

    static void markSpoken(long j2, RoadNoticeDatabase.Notice notice, long j3) {
        String strKey = key(j2, notice.noticeId);
        Integer num = tripRepeats.get(strKey);
        tripRepeats.put(strKey, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        lastSpokenAt.put(strKey, Long.valueOf(j3));
    }

    private static String key(long j2, String str) {
        if (str == null) {
            str = "";
        }
        return j2 + ":" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean stillCurrent(long j2, long j3) {
        return currentSegmentId == j2 && segmentGeneration == j3;
    }

    private static final class Evaluation {
        RoadNoticeDatabase.Notice minimumNotice;
        Integer minimumSpeed;
        RoadNoticeDatabase.Notice parkingNotice;
        int parkingRestriction;
        RoadNoticeDatabase.Notice voice;

        private Evaluation() {
        }
    }
}
