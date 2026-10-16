package com.waze.gw;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.video.AudioStats;
import com.waze.gw.PointNoticeRepository;
import com.waze.gw.RoadNoticeDatabase;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
final class RoadPointNoticeRepository {
    private static final double EARTH_RADIUS_M = 6371008.8d;
    private static final long GLOBAL_TTS_GAP_MS = 8000;
    private static final String PREFS = "waze_hud_gw";
    private static final String PREF_TTS = "road_notice_tts";
    private static final long PROCESS_INTERVAL_MS = 700;
    private static final String TAG = "WazeGW-RoadPoints";
    private static boolean drainScheduled;
    private static long lastProcessedElapsed;
    private static long lastTtsElapsed;
    private static PointNoticeRepository.PositionSnapshot pending;
    private static final ScheduledExecutorService WORKER = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.waze.gw.RoadPointNoticeRepository.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "WazeGW-road-points");
            thread.setDaemon(true);
            return thread;
        }
    });
    private static final Object PENDING_LOCK = new Object();
    private static final ArrayDeque<PointNoticeRepository.PositionSnapshot> samples = new ArrayDeque<>();
    private static final Set<String> spokenApproach = new HashSet();
    private static final Set<String> currentEligible = new HashSet();
    private static final Map<String, Long> lastSpokenAt = new HashMap();
    private static final Map<String, Integer> tripRepeats = new HashMap();

    private RoadPointNoticeRepository() {
    }

    static void onPosition(Context context, PointNoticeRepository.PositionSnapshot positionSnapshot) {
        if (context == null || positionSnapshot == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        synchronized (PENDING_LOCK) {
            pending = positionSnapshot;
            if (drainScheduled) {
                return;
            }
            drainScheduled = true;
            WORKER.execute(new Runnable() { // from class: com.waze.gw.RoadPointNoticeRepository.2
                @Override // java.lang.Runnable
                public void run() throws InterruptedException {
                    RoadPointNoticeRepository.drain(applicationContext);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void drain(Context context) throws InterruptedException {
        PointNoticeRepository.PositionSnapshot positionSnapshot;
        while (true) {
            synchronized (PENDING_LOCK) {
                positionSnapshot = pending;
                pending = null;
                if (positionSnapshot == null) {
                    drainScheduled = false;
                    return;
                }
            }
            long j2 = PROCESS_INTERVAL_MS - (positionSnapshot.elapsedMs - lastProcessedElapsed);
            if (j2 > 0) {
                try {
                    Thread.sleep(Math.min(j2, PROCESS_INTERVAL_MS));
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                }
            }
            synchronized (PENDING_LOCK) {
                if (pending != null) {
                    positionSnapshot = pending;
                }
                pending = null;
            }
            lastProcessedElapsed = positionSnapshot.elapsedMs;
            evaluate(context, positionSnapshot);
        }
    }

    private static void evaluate(Context context, PointNoticeRepository.PositionSnapshot positionSnapshot) {
        Candidate candidate;
        if (!Gateway.modEnabled(context)) {
            clear();
            return;
        }
        RoadNoticeDatabase roadNoticeDatabase = RoadNoticeClient.get(context);
        boolean z = positionSnapshot.accuracyM < AudioStats.AUDIO_AMPLITUDE_NONE || (!positionSnapshot.mapMatched && positionSnapshot.accuracyM > 25.0d);
        if (roadNoticeDatabase == null || roadNoticeDatabase.pointOffsets.length == 0 || positionSnapshot.speedKmh < 8 || z) {
            addSample(positionSnapshot, false);
            clearPublishedOnly();
            return;
        }
        addSample(positionSnapshot, true);
        Double dStableCourse = stableCourse(positionSnapshot);
        if (dStableCourse == null) {
            clearPublishedOnly();
            return;
        }
        double dDoubleValue = dStableCourse.doubleValue();
        if (positionSnapshot.steeringDeg >= 0 && positionSnapshot.steeringDeg < 360 && angleDifference(dDoubleValue, positionSnapshot.steeringDeg) <= 25.0d) {
            dDoubleValue = circularMean(dDoubleValue, positionSnapshot.steeringDeg);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<RoadNoticeDatabase.PointRecord> listNearbyPoints = roadNoticeDatabase.nearbyPoints(positionSnapshot.latitude, positionSnapshot.longitude);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (RoadNoticeDatabase.PointRecord pointRecord : listNearbyPoints) {
            RoadNoticeDatabase.Notice notice = pointRecord.notice;
            double dDistanceM = distanceM(positionSnapshot.latitude, positionSnapshot.longitude, pointRecord.latitude(), pointRecord.longitude());
            if (dDistanceM <= 500.0d) {
                hashSet.add(notice.noticeId);
            }
            if (supported(notice) && active(notice, jCurrentTimeMillis)) {
                if (!pointRecord.routeOnly || Gateway.hudNavigating) {
                    if (dDistanceM <= pointRecord.triggerDistanceM) {
                        boolean z2 = Gateway.hudRoadSegmentId > 0;
                        boolean zHasApproachSegment = pointRecord.hasApproachSegment(Gateway.hudRoadSegmentId);
                        if (pointRecord.approachSegmentIds.length <= 0 || !z2 || zHasApproachSegment) {
                            if (zHasApproachSegment || (pointRecord.approachBearingCdeg >= 0 && angleDifference(dDoubleValue, pointRecord.approachBearing()) <= 35.0d)) {
                                if (angleDifference(dDoubleValue, bearing(positionSnapshot.latitude, positionSnapshot.longitude, pointRecord.latitude(), pointRecord.longitude())) <= 70.0d) {
                                    arrayList.add(new Candidate(pointRecord, (int) Math.round(dDistanceM)));
                                }
                            }
                        }
                    }
                }
            }
        }
        spokenApproach.retainAll(hashSet);
        Collections.sort(arrayList, new Comparator<Candidate>() { // from class: com.waze.gw.RoadPointNoticeRepository.3
            @Override // java.util.Comparator
            public int compare(Candidate candidate2, Candidate candidate3) {
                if (candidate2.point.notice.priority != candidate3.point.notice.priority) {
                    return candidate3.point.notice.priority - candidate2.point.notice.priority;
                }
                return candidate2.meters != candidate3.meters ? candidate2.meters - candidate3.meters : candidate2.point.notice.noticeId.compareTo(candidate3.point.notice.noticeId);
            }
        });
        currentEligible.clear();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Candidate candidate2 = (Candidate) it.next();
            currentEligible.add(candidate2.point.notice.noticeId);
            arrayList2.add(row(candidate2));
        }
        if (!context.getSharedPreferences(PREFS, 0).getBoolean("upcoming_alerts", true)) {
            arrayList2 = new ArrayList();
        }
        Gateway.setRoadPointAlerts(arrayList2);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                candidate = null;
                break;
            }
            candidate = (Candidate) it2.next();
            RoadNoticeDatabase.Notice notice2 = candidate.point.notice;
            if (RoadRulesRepository.voiceText(notice2) != null && !spokenApproach.contains(notice2.noticeId) && maySpeak(notice2, jCurrentTimeMillis)) {
                break;
            }
        }
        if (candidate != null && positionSnapshot.elapsedMs - lastTtsElapsed >= GLOBAL_TTS_GAP_MS) {
            maybeSpeak(context, candidate);
        }
    }

    private static boolean supported(RoadNoticeDatabase.Notice notice) {
        return notice != null && (notice.type == 7 || notice.type == 8 || notice.type == 9);
    }

    private static boolean active(RoadNoticeDatabase.Notice notice, long j2) {
        if (!notice.enabled) {
            return false;
        }
        if (notice.hasValidFrom && j2 < notice.validFromMs) {
            return false;
        }
        if (!notice.hasValidUntil || j2 < notice.validUntilMs) {
            return RoadRulesRepository.scheduleActive(notice.schedule, j2);
        }
        return false;
    }

    private static void addSample(PointNoticeRepository.PositionSnapshot positionSnapshot, boolean z) {
        if (!z || (!samples.isEmpty() && positionSnapshot.elapsedMs - samples.peekLast().elapsedMs > 5000)) {
            samples.clear();
        }
        if (z) {
            samples.addLast(positionSnapshot);
            while (samples.size() > 5) {
                samples.removeFirst();
            }
        }
    }

    private static Double stableCourse(PointNoticeRepository.PositionSnapshot positionSnapshot) {
        PointNoticeRepository.PositionSnapshot next;
        if (samples.size() < 3) {
            return null;
        }
        PointNoticeRepository.PositionSnapshot positionSnapshotPeekFirst = samples.peekFirst();
        if (distanceM(positionSnapshotPeekFirst.latitude, positionSnapshotPeekFirst.longitude, positionSnapshot.latitude, positionSnapshot.longitude) < 12.0d) {
            return null;
        }
        double dBearing = bearing(positionSnapshotPeekFirst.latitude, positionSnapshotPeekFirst.longitude, positionSnapshot.latitude, positionSnapshot.longitude);
        Iterator<PointNoticeRepository.PositionSnapshot> it = samples.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i3 = i2 + 1;
            if (i2 == samples.size() / 2) {
                break;
            }
            i2 = i3;
        }
        if (next != null && angleDifference(dBearing, bearing(next.latitude, next.longitude, positionSnapshot.latitude, positionSnapshot.longitude)) <= 15.0d) {
            return Double.valueOf(dBearing);
        }
        return null;
    }

    private static String row(Candidate candidate) {
        String str;
        String strRawIcon = rawIcon(candidate.point.notice);
        if (candidate.point.notice.type == 9) {
            str = "roadpoint:exit";
        } else {
            str = candidate.point.notice.type == 8 ? "roadpoint:expressway_rest" : "roadpoint:rest";
        }
        return strRawIcon + "\t" + label(candidate.point.notice) + "\t" + formatDistance(candidate.meters) + "\t" + candidate.meters + "\t" + strRawIcon + "\t" + str;
    }

    private static String rawIcon(RoadNoticeDatabase.Notice notice) {
        if (notice.type == 9) {
            return "roadpoint_exit";
        }
        if (notice.type == 8) {
            return "roadpoint_expressway_rest";
        }
        return "roadpoint_rest";
    }

    private static String label(RoadNoticeDatabase.Notice notice) {
        String strTrim = notice.title == null ? "" : notice.title.trim();
        if (!strTrim.isEmpty()) {
            return strTrim;
        }
        if (notice.type == 9) {
            return "Lối ra cao tốc";
        }
        if (notice.type == 8) {
            return "Trạm dừng cao tốc";
        }
        return "Trạm dừng";
    }

    private static void maybeSpeak(final Context context, Candidate candidate) {
        final RoadNoticeDatabase.Notice notice;
        final String strVoiceText;
        if (context.getSharedPreferences(PREFS, 0).getBoolean(PREF_TTS, true) && (strVoiceText = RoadRulesRepository.voiceText((notice = candidate.point.notice))) != null) {
            if (WazeTtsBridge.speak(strVoiceText)) {
                markSpoken(notice, System.currentTimeMillis());
            } else {
                WORKER.schedule(new Runnable() { // from class: com.waze.gw.RoadPointNoticeRepository.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!RoadPointNoticeRepository.currentEligible.contains(notice.noticeId) || RoadPointNoticeRepository.spokenApproach.contains(notice.noticeId) || !Gateway.modEnabled(context) || !context.getSharedPreferences(RoadPointNoticeRepository.PREFS, 0).getBoolean(RoadPointNoticeRepository.PREF_TTS, true)) {
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (RoadPointNoticeRepository.maySpeak(notice, jCurrentTimeMillis) && WazeTtsBridge.speak(strVoiceText)) {
                            RoadPointNoticeRepository.markSpoken(notice, jCurrentTimeMillis);
                        }
                    }
                }, 1L, TimeUnit.SECONDS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean maySpeak(RoadNoticeDatabase.Notice notice, long j2) {
        Integer num = tripRepeats.get(notice.noticeId);
        if (notice.maxRepeatsPerTrip > 0 && num != null && num.intValue() >= notice.maxRepeatsPerTrip) {
            return false;
        }
        Long l2 = lastSpokenAt.get(notice.noticeId);
        long jMax = Math.max(0L, notice.cooldownSeconds) * 1000;
        return jMax == 0 || l2 == null || j2 - l2.longValue() >= jMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void markSpoken(RoadNoticeDatabase.Notice notice, long j2) {
        String str = notice.noticeId;
        spokenApproach.add(str);
        lastSpokenAt.put(str, Long.valueOf(j2));
        Integer num = tripRepeats.get(str);
        tripRepeats.put(str, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        lastTtsElapsed = SystemClock.elapsedRealtime();
        Log.i(TAG, "TTS point=" + str);
    }

    static void onTripReset() {
        WORKER.execute(new Runnable() { // from class: com.waze.gw.RoadPointNoticeRepository.5
            @Override // java.lang.Runnable
            public void run() {
                RoadPointNoticeRepository.spokenApproach.clear();
                RoadPointNoticeRepository.currentEligible.clear();
                RoadPointNoticeRepository.tripRepeats.clear();
            }
        });
    }

    private static void clearPublishedOnly() {
        currentEligible.clear();
        Gateway.setRoadPointAlerts(new ArrayList());
    }

    private static void clear() {
        samples.clear();
        clearPublishedOnly();
    }

    private static String formatDistance(int i2) {
        return i2 < 1000 ? i2 + " m" : String.format(Locale.US, "%.1f km", Float.valueOf(i2 / 1000.0f));
    }

    private static double circularMean(double d2, double d3) {
        return normalize(Math.toDegrees(Math.atan2(Math.sin(Math.toRadians(d2)) + Math.sin(Math.toRadians(d3)), Math.cos(Math.toRadians(d2)) + Math.cos(Math.toRadians(d3)))));
    }

    private static double angleDifference(double d2, double d3) {
        double dAbs = Math.abs(normalize(d2) - normalize(d3));
        return Math.min(dAbs, 360.0d - dAbs);
    }

    private static double normalize(double d2) {
        double d3 = d2 % 360.0d;
        return d3 < AudioStats.AUDIO_AMPLITUDE_NONE ? d3 + 360.0d : d3;
    }

    private static double bearing(double d2, double d3, double d4, double d5) {
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(d4);
        double radians3 = Math.toRadians(d5 - d3);
        return normalize(Math.toDegrees(Math.atan2(Math.sin(radians3) * Math.cos(radians2), (Math.cos(radians) * Math.sin(radians2)) - ((Math.sin(radians) * Math.cos(radians2)) * Math.cos(radians3)))));
    }

    private static double distanceM(double d2, double d3, double d4, double d5) {
        double radians = Math.toRadians(d4 - d2);
        double d6 = radians / 2.0d;
        double radians2 = Math.toRadians(d5 - d3) / 2.0d;
        double dSin = (Math.sin(d6) * Math.sin(d6)) + (Math.cos(Math.toRadians(d2)) * Math.cos(Math.toRadians(d4)) * Math.sin(radians2) * Math.sin(radians2));
        return Math.atan2(Math.sqrt(dSin), Math.sqrt(1.0d - dSin)) * 1.27420176E7d;
    }

    private static final class Candidate {
        final int meters;
        final RoadNoticeDatabase.PointRecord point;

        Candidate(RoadNoticeDatabase.PointRecord pointRecord, int i2) {
            this.point = pointRecord;
            this.meters = i2;
        }
    }
}
