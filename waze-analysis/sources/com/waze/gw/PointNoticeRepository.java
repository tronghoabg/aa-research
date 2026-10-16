package com.waze.gw;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.video.AudioStats;
import com.waze.gw.PointNoticeDatabase;
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
final class PointNoticeRepository {
    private static final double EARTH_RADIUS_M = 6371008.8d;
    private static final long GLOBAL_TTS_GAP_MS = 8000;
    private static final long NOTICE_COOLDOWN_MS = 600000;
    private static final String PREFS = "waze_hud_gw";
    private static final String PREF_TTS = "road_notice_tts";
    private static final long PROCESS_INTERVAL_MS = 700;
    private static final String TAG = "WazeGW-PointRules";
    private static boolean drainScheduled;
    private static long lastProcessedElapsed;
    private static long lastTtsElapsed;
    private static PositionSnapshot pending;
    private static final ScheduledExecutorService WORKER = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.waze.gw.PointNoticeRepository.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "WazeGW-point-rules");
            thread.setDaemon(true);
            return thread;
        }
    });
    private static final Object PENDING_LOCK = new Object();
    private static final ArrayDeque<PositionSnapshot> samples = new ArrayDeque<>();
    private static final Set<String> spokenApproach = new HashSet();
    private static final Map<String, Long> lastSpokenAt = new HashMap();
    private static final Set<String> currentEligible = new HashSet();

    private PointNoticeRepository() {
    }

    static final class PositionSnapshot {
        final double accuracyM;
        final long elapsedMs;
        final double latitude;
        final double longitude;
        final boolean mapMatched;
        final int speedKmh;
        final int steeringDeg;

        PositionSnapshot(double d2, double d3, int i2, int i3, double d4, boolean z, long j2) {
            this.latitude = d2;
            this.longitude = d3;
            this.speedKmh = i2;
            this.steeringDeg = i3;
            this.accuracyM = d4;
            this.mapMatched = z;
            this.elapsedMs = j2;
        }
    }

    static void onPosition(Context context, PositionSnapshot positionSnapshot) {
        if (positionSnapshot == null || context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        synchronized (PENDING_LOCK) {
            pending = positionSnapshot;
            if (drainScheduled) {
                return;
            }
            drainScheduled = true;
            WORKER.execute(new Runnable() { // from class: com.waze.gw.PointNoticeRepository.2
                @Override // java.lang.Runnable
                public void run() throws InterruptedException {
                    PointNoticeRepository.drain(applicationContext);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void drain(Context context) throws InterruptedException {
        PositionSnapshot positionSnapshot;
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

    private static void evaluate(Context context, PositionSnapshot positionSnapshot) {
        Long l2;
        double d2;
        Iterator<PointNoticeDatabase.Notice> it;
        double dMax;
        if (!Gateway.modEnabled(context)) {
            clear();
            return;
        }
        PointNoticeDatabase pointNoticeDatabase = PointNoticeClient.get(context);
        double d3 = positionSnapshot.accuracyM;
        double d4 = AudioStats.AUDIO_AMPLITUDE_NONE;
        boolean z = d3 < AudioStats.AUDIO_AMPLITUDE_NONE || (!positionSnapshot.mapMatched && positionSnapshot.accuracyM > 25.0d);
        if (pointNoticeDatabase == null || positionSnapshot.speedKmh < 8 || z) {
            addSample(positionSnapshot, false);
            PointNoticeMapBridge.clear();
            clearPublishedOnly();
            return;
        }
        addSample(positionSnapshot, true);
        Double dStableCourse = stableCourse(positionSnapshot);
        Double dMovementCourse = movementCourse(positionSnapshot);
        if (dMovementCourse != null) {
            PointNoticeMapBridge.update(context, pointNoticeDatabase, positionSnapshot, dMovementCourse.doubleValue());
        } else {
            PointNoticeMapBridge.clear();
        }
        if (dStableCourse == null) {
            clearPublishedOnly();
            return;
        }
        double dDoubleValue = dStableCourse.doubleValue();
        if (positionSnapshot.steeringDeg >= 0 && positionSnapshot.steeringDeg < 360 && angleDifference(dDoubleValue, positionSnapshot.steeringDeg) <= 25.0d) {
            dDoubleValue = circularMean(dDoubleValue, positionSnapshot.steeringDeg);
        }
        List<PointNoticeDatabase.Notice> listNearby = pointNoticeDatabase.nearby(positionSnapshot.latitude, positionSnapshot.longitude);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator<PointNoticeDatabase.Notice> it2 = listNearby.iterator();
        while (it2.hasNext()) {
            PointNoticeDatabase.Notice next = it2.next();
            double dDistanceM = distanceM(positionSnapshot.latitude, positionSnapshot.longitude, next.latitude(), next.longitude());
            if (dDistanceM <= 500.0d) {
                hashSet.add(next.id);
            }
            if (!Gateway.hudNavigating || !isSpeedNotice(next)) {
                if (dDistanceM <= next.triggerDistanceM) {
                    double d5 = d4;
                    double dSignedAngle = signedAngle(dDoubleValue, bearing(positionSnapshot.latitude, positionSnapshot.longitude, next.latitude(), next.longitude()));
                    if (dSignedAngle <= d5) {
                        dDoubleValue = dDoubleValue;
                        d4 = d5;
                    } else if (dSignedAngle > 70.0d) {
                        d4 = d5;
                    } else {
                        double radians = Math.toRadians(dSignedAngle);
                        double dCos = Math.cos(radians) * dDistanceM;
                        double dSin = Math.sin(radians) * dDistanceM;
                        if (positionSnapshot.mapMatched) {
                            d2 = dDoubleValue;
                            dMax = 3.0d;
                            it = it2;
                        } else {
                            d2 = dDoubleValue;
                            it = it2;
                            dMax = Math.max(3.0d, Math.min(8.0d, positionSnapshot.accuracyM * 0.25d));
                        }
                        if (dCos <= d5 || dSin < dMax) {
                            it2 = it;
                            dDoubleValue = d2;
                            d4 = d5;
                        } else {
                            arrayList.add(new Candidate(next, (int) Math.round(dDistanceM)));
                            it2 = it;
                            dDoubleValue = d2;
                            d4 = d5;
                        }
                    }
                }
            }
        }
        spokenApproach.retainAll(hashSet);
        Collections.sort(arrayList, new Comparator<Candidate>() { // from class: com.waze.gw.PointNoticeRepository.3
            @Override // java.util.Comparator
            public int compare(Candidate candidate, Candidate candidate2) {
                return candidate.meters != candidate2.meters ? candidate.meters - candidate2.meters : candidate.notice.id.compareTo(candidate2.notice.id);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        currentEligible.clear();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Candidate candidate = (Candidate) it3.next();
            if (!Gateway.hudNavigating || !isSpeedNotice(candidate.notice)) {
                currentEligible.add(candidate.notice.id);
                arrayList2.add(row(candidate));
            }
        }
        if (!context.getSharedPreferences(PREFS, 0).getBoolean("upcoming_alerts", true)) {
            arrayList2 = new ArrayList();
        }
        Gateway.setPointAlerts(arrayList2);
        Iterator it4 = arrayList.iterator();
        Candidate candidate2 = null;
        while (it4.hasNext()) {
            Candidate candidate3 = (Candidate) it4.next();
            if (!Gateway.hudNavigating || !isSpeedNotice(candidate3.notice)) {
                if (voiceText(candidate3.notice) != null && !spokenApproach.contains(candidate3.notice.id) && ((l2 = lastSpokenAt.get(candidate3.notice.id)) == null || System.currentTimeMillis() - l2.longValue() >= 600000)) {
                    if (candidate2 == null || priority(candidate3.notice) > priority(candidate2.notice) || (priority(candidate3.notice) == priority(candidate2.notice) && candidate3.meters < candidate2.meters)) {
                        candidate2 = candidate3;
                    }
                }
            }
        }
        if (candidate2 != null && positionSnapshot.elapsedMs - lastTtsElapsed >= GLOBAL_TTS_GAP_MS) {
            maybeSpeak(context, candidate2);
        }
    }

    private static void addSample(PositionSnapshot positionSnapshot, boolean z) {
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

    private static Double stableCourse(PositionSnapshot positionSnapshot) {
        PositionSnapshot next;
        if (samples.size() < 3) {
            return null;
        }
        PositionSnapshot positionSnapshotPeekFirst = samples.peekFirst();
        if (distanceM(positionSnapshotPeekFirst.latitude, positionSnapshotPeekFirst.longitude, positionSnapshot.latitude, positionSnapshot.longitude) < 12.0d) {
            return null;
        }
        double dBearing = bearing(positionSnapshotPeekFirst.latitude, positionSnapshotPeekFirst.longitude, positionSnapshot.latitude, positionSnapshot.longitude);
        Iterator<PositionSnapshot> it = samples.iterator();
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

    private static Double movementCourse(PositionSnapshot positionSnapshot) {
        if (samples.size() < 2) {
            return null;
        }
        PositionSnapshot positionSnapshotPeekFirst = samples.peekFirst();
        if (distanceM(positionSnapshotPeekFirst.latitude, positionSnapshotPeekFirst.longitude, positionSnapshot.latitude, positionSnapshot.longitude) < 6.0d) {
            return null;
        }
        return Double.valueOf(bearing(positionSnapshotPeekFirst.latitude, positionSnapshotPeekFirst.longitude, positionSnapshot.latitude, positionSnapshot.longitude));
    }

    private static String row(Candidate candidate) {
        PointNoticeDatabase.Notice notice = candidate.notice;
        String strRawIcon = rawIcon(notice);
        return strRawIcon + "\t" + label(notice) + "\t" + formatDistance(candidate.meters) + "\t" + candidate.meters + "\t" + strRawIcon + "\twme:" + notice.type;
    }

    private static String rawIcon(PointNoticeDatabase.Notice notice) {
        if ((notice.type == 12 || notice.type == 13) && notice.hasValueKmh) {
            return "speeddrop_" + notice.valueKmh;
        }
        return "wme_" + notice.type;
    }

    private static String label(PointNoticeDatabase.Notice notice) {
        switch (notice.type) {
            case 1:
                return "Cấm đi thẳng và rẽ phải";
            case 2:
                return "Cấm rẽ trái và quay đầu";
            case 3:
                return "Cấm đi thẳng và rẽ trái";
            case 4:
                return "Cấm rẽ trái và rẽ phải";
            case 5:
                return "Ô tô cấm rẽ trái và quay đầu";
            case 6:
                return "Ô tô cấm rẽ phải và quay đầu";
            case 7:
                return "Cấm rẽ phải và quay đầu";
            case 8:
                return "Cấm rẽ trái";
            case 9:
                return "Cấm rẽ phải";
            case 10:
                return "Cấm đi thẳng";
            case 11:
                return "Cấm quay đầu";
            case 12:
                return "Hết hạn chế tốc độ " + notice.valueKmh;
            case 13:
                return "Giới hạn tốc độ " + notice.valueKmh;
            case 14:
                return "Cấm vượt";
            case 15:
                return "Hết cấm vượt";
            case 16:
                return "Ô tô cấm rẽ trái";
            case 17:
                return "Ô tô cấm rẽ phải";
            case 18:
                return "Ô tô cấm quay đầu";
            case 19:
                return "Cấm ô tô";
            case 20:
                return "Cấm xe máy";
            case 21:
                return "Đi thẳng";
            case 22:
                return "Rẽ phải";
            case 23:
                return "Rẽ trái";
            case 24:
                return "Làn dành cho ô tô";
            case 25:
                return "Làn dành cho xe máy";
            case 26:
                return "Bắt đầu khu đông dân cư";
            case 27:
                return "Kết thúc khu đông dân cư";
            case 28:
            case 29:
            case 30:
            case 31:
            case 34:
            default:
                return "Biển báo phía trước";
            case 32:
                return "Đường cấm";
            case 33:
                return "Đường một chiều";
            case 35:
                return "Hết mọi lệnh cấm";
        }
    }

    private static String voiceText(PointNoticeDatabase.Notice notice) {
        switch (notice.type) {
            case 12:
                if (!notice.hasValueKmh) {
                    return null;
                }
                return "Phía trước hết hạn chế tốc độ " + notice.valueKmh;
            case 13:
                if (!notice.hasValueKmh) {
                    return null;
                }
                return "Phía trước giới hạn tốc độ " + notice.valueKmh + " ki lô mét trên giờ";
            case 14:
                return "Phía trước cấm vượt";
            case 15:
                return "Phía trước hết cấm vượt";
            case 24:
                return "Phía trước làn dành cho ô tô";
            case 25:
                return "Phía trước làn dành cho xe máy";
            case 26:
                return "Phía trước bắt đầu khu đông dân cư";
            case 27:
                return "Phía trước kết thúc khu đông dân cư";
            case 33:
                return "Phía trước là đường một chiều";
            case 35:
                return "Phía trước hết mọi lệnh cấm";
            default:
                return null;
        }
    }

    private static int priority(PointNoticeDatabase.Notice notice) {
        return (notice.type == 12 || notice.type == 13 || notice.type == 26 || notice.type == 27) ? 100 : 50;
    }

    private static void maybeSpeak(final Context context, final Candidate candidate) {
        final String strVoiceText;
        if (context.getSharedPreferences(PREFS, 0).getBoolean(PREF_TTS, true)) {
            if ((isSpeedNotice(candidate.notice) && Gateway.hudNavigating) || (strVoiceText = voiceText(candidate.notice)) == null) {
                return;
            }
            if (speak(candidate.notice, strVoiceText)) {
                markSpoken(candidate.notice.id);
            } else {
                WORKER.schedule(new Runnable() { // from class: com.waze.gw.PointNoticeRepository.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!PointNoticeRepository.currentEligible.contains(candidate.notice.id) || PointNoticeRepository.spokenApproach.contains(candidate.notice.id) || !Gateway.modEnabled(context) || !context.getSharedPreferences(PointNoticeRepository.PREFS, 0).getBoolean(PointNoticeRepository.PREF_TTS, true)) {
                            return;
                        }
                        if ((!PointNoticeRepository.isSpeedNotice(candidate.notice) || !Gateway.hudNavigating) && PointNoticeRepository.speak(candidate.notice, strVoiceText)) {
                            PointNoticeRepository.markSpoken(candidate.notice.id);
                        }
                    }
                }, 1L, TimeUnit.SECONDS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSpeedNotice(PointNoticeDatabase.Notice notice) {
        return notice.type == 12 || notice.type == 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean speak(PointNoticeDatabase.Notice notice, String str) {
        if (notice.type == 13 && notice.hasValueKmh && Gateway.playNextSpeedAsset(notice.valueKmh)) {
            return true;
        }
        return WazeTtsBridge.speak(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void markSpoken(String str) {
        spokenApproach.add(str);
        lastSpokenAt.put(str, Long.valueOf(System.currentTimeMillis()));
        lastTtsElapsed = SystemClock.elapsedRealtime();
        Log.i(TAG, "TTS point=" + str);
    }

    static void onTripReset() {
        WORKER.execute(new Runnable() { // from class: com.waze.gw.PointNoticeRepository.5
            @Override // java.lang.Runnable
            public void run() {
                PointNoticeRepository.spokenApproach.clear();
                PointNoticeRepository.currentEligible.clear();
            }
        });
    }

    private static void clearPublishedOnly() {
        currentEligible.clear();
        Gateway.setPointAlerts(new ArrayList());
    }

    private static void clear() {
        samples.clear();
        clearPublishedOnly();
        PointNoticeMapBridge.clear();
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

    private static double signedAngle(double d2, double d3) {
        double dNormalize = normalize(d3) - normalize(d2);
        if (dNormalize > 180.0d) {
            dNormalize -= 360.0d;
        }
        return dNormalize <= -180.0d ? dNormalize + 360.0d : dNormalize;
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
        final PointNoticeDatabase.Notice notice;

        Candidate(PointNoticeDatabase.Notice notice, int i2) {
            this.notice = notice;
            this.meters = i2;
        }
    }
}
