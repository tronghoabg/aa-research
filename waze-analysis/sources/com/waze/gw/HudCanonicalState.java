package com.waze.gw;

import android.content.Context;
import com.waze.gw.Gateway;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
final class HudCanonicalState {
    final List<HudCanonicalAlert> alerts;
    final int averageLeftM;
    final int averagePercent;
    final boolean averageZone;
    final String currentStreet;
    final String etaClock;
    final int exitNumber;
    final Gateway.LaneSnapshot lanes;
    final int limitKmh;
    final int minimumLimitKmh;
    final boolean navigating;
    final String nextStreet;
    final int nextTurn;
    final int overMargin;
    final int recommendedSpeedKmh;
    final int remainingMeters;
    final int remainingMinutes;
    final int routeProgressPercent;
    final int speedKmh;
    final int turn;
    final int turnDistanceM;

    HudCanonicalState(int i2, int i3, int i4, boolean z, int i5, int i6, int i7, int i8, Gateway.LaneSnapshot laneSnapshot, String str, String str2, String str3, int i9, int i10, int i11, int i12, boolean z2, int i13, int i14, int i15, List<HudCanonicalAlert> list) {
        this.speedKmh = i2;
        this.limitKmh = i3;
        this.minimumLimitKmh = i4;
        this.navigating = z;
        this.turn = i5;
        this.nextTurn = i6;
        this.turnDistanceM = i7;
        this.exitNumber = i8;
        this.lanes = laneSnapshot == null ? Gateway.LaneSnapshot.EMPTY : laneSnapshot;
        this.currentStreet = str == null ? "" : str;
        this.nextStreet = str2 == null ? "" : str2;
        this.etaClock = str3 == null ? "" : str3;
        this.remainingMinutes = i9;
        this.remainingMeters = i10;
        this.routeProgressPercent = i11;
        this.overMargin = i12;
        this.averageZone = z2;
        this.averageLeftM = i13;
        this.recommendedSpeedKmh = i14;
        this.averagePercent = i15;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        this.alerts = Collections.unmodifiableList(arrayList);
    }

    HudCanonicalState(int i2, int i3, int i4, boolean z, int i5, int i6, int i7, int i8, Gateway.LaneSnapshot laneSnapshot, String str, String str2, String str3, int i9, int i10, int i11, List<HudCanonicalAlert> list) {
        this(i2, i3, i4, z, i5, i6, i7, i8, laneSnapshot, str, str2, str3, i9, i10, i11, 5, false, -1, -1, -1, list);
    }

    static HudCanonicalState capture(Context context) {
        HudCanonicalState hudCanonicalStateCaptureOnce = captureOnce(context);
        int i2 = 0;
        while (i2 < 3) {
            Thread.yield();
            HudCanonicalState hudCanonicalStateCaptureOnce2 = captureOnce(context);
            if (hudCanonicalStateCaptureOnce.stableSignature().equals(hudCanonicalStateCaptureOnce2.stableSignature())) {
                return hudCanonicalStateCaptureOnce2;
            }
            i2++;
            hudCanonicalStateCaptureOnce = hudCanonicalStateCaptureOnce2;
        }
        return hudCanonicalStateCaptureOnce;
    }

    private static HudCanonicalState captureOnce(Context context) {
        String str = Gateway.hudUnits == null ? "" : Gateway.hudUnits;
        int kmh = toKmh(Gateway.hudSpeed, str);
        int kmh2 = toKmh(Gateway.hudLimit, str);
        int i2 = Gateway.minimumSpeedLimit;
        int i3 = context.getSharedPreferences("waze_hud_gw", 0).getInt("over_margin", 5);
        ArrayList arrayList = new ArrayList();
        List<String> list = Gateway.hudAlerts;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(HudCanonicalAlert.fromLegacyRow(it.next()));
            }
        }
        return new HudCanonicalState(kmh, kmh2, i2, Gateway.hudNavigating, HudTurnCodec.encode(Gateway.hudTurn), HudTurnCodec.encode(Gateway.hudTurnNext), Gateway.hudTurnDist, Math.max(0, Gateway.hudExit), Gateway.hudLanes, normalizeStreet(Gateway.hudCurStreet), normalizeStreet(Gateway.hudStreet), normalizeEta(Gateway.hudEtaClock), Math.max(0, Gateway.hudEtaMin), Gateway.hudEtaDistM, -1, i3, Gateway.avgZone, Gateway.avgLeftM, toKmh(Gateway.avgRecSpeed, str), Gateway.avgPercent, arrayList);
    }

    private String stableSignature() {
        StringBuilder sb = new StringBuilder(256);
        sb.append(this.speedKmh).append('|').append(this.limitKmh).append('|').append(this.minimumLimitKmh).append('|').append(this.navigating).append('|').append(this.turn).append('|').append(this.nextTurn).append('|').append(this.turnDistanceM).append('|').append(this.exitNumber).append('|').append(this.lanes == null ? "" : this.lanes.signature()).append('|').append(this.currentStreet).append('|').append(this.nextStreet).append('|').append(this.etaClock).append('|').append(this.remainingMinutes).append('|').append(this.remainingMeters).append('|').append(this.routeProgressPercent).append('|').append(this.overMargin).append('|').append(this.averageZone).append('|').append(this.averageLeftM).append('|').append(this.recommendedSpeedKmh).append('|').append(this.averagePercent).append('|').append(this.alerts.toString());
        return sb.toString();
    }

    String alertSignature() {
        return this.alerts.toString();
    }

    static int toKmhForTest(int i2, String str) {
        return toKmh(i2, str);
    }

    private static int toKmh(int i2, String str) {
        if (i2 < 0) {
            return i2;
        }
        String lowerCase = str == null ? "" : str.toLowerCase(Locale.US);
        if (!lowerCase.contains("mph") && !lowerCase.contains("mi/h")) {
            return i2;
        }
        double d2 = i2;
        Double.isNaN(d2);
        return (int) Math.round(d2 * 1.609344d);
    }

    private static String normalizeStreet(String str) {
        return str == null ? "" : trimCodePoints(str, 40);
    }

    private static String normalizeEta(String str) {
        if (str == null) {
            return "";
        }
        Matcher matcher = Pattern.compile("\\b([01]?\\d|2[0-3]):([0-5]\\d)\\b").matcher(str);
        if (!matcher.find()) {
            return "";
        }
        return String.format(Locale.US, "%02d:%s", Integer.valueOf(Integer.parseInt(matcher.group(1))), matcher.group(2));
    }

    private static String trimCodePoints(String str, int i2) {
        if (str == null || i2 <= 0) {
            return "";
        }
        int iOffsetByCodePoints = str.offsetByCodePoints(0, Math.min(i2, str.codePointCount(0, str.length())));
        return iOffsetByCodePoints == str.length() ? str : str.substring(0, iOffsetByCodePoints);
    }
}
