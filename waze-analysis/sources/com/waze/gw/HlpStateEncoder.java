package com.waze.gw;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.waze.gw.Gateway;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
final class HlpStateEncoder {
    private HlpStateEncoder() {
    }

    static String signature(HudCanonicalState hudCanonicalState, Set<String> set) {
        return json(hudCanonicalState, set, 0L, 4, 40).toString();
    }

    static byte[] encode(HudCanonicalState hudCanonicalState, Set<String> set, long j2) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        try {
            return HlpFrameCodec.encode(json(hudCanonicalState, linkedHashSet, j2, 4, 40).toString());
        } catch (IOException e2) {
            String str = "alrs";
            if (linkedHashSet.contains("alrs")) {
                for (int i2 = 3; i2 >= 1; i2--) {
                    try {
                        return HlpFrameCodec.encode(json(hudCanonicalState, linkedHashSet, j2, i2, 40).toString());
                    } catch (IOException e3) {
                    }
                }
                for (int i3 = 32; i3 >= 0; i3 -= 4) {
                    try {
                        return HlpFrameCodec.encode(json(hudCanonicalState, linkedHashSet, j2, 1, i3).toString());
                    } catch (IOException e4) {
                    }
                }
            }
            linkedHashSet.remove(str);
            try {
                return HlpFrameCodec.encode(json(hudCanonicalState, linkedHashSet, j2, 0, 40).toString());
            } catch (IOException e5) {
                for (int i4 = 32; i4 >= 0; i4 -= 4) {
                    try {
                        return HlpFrameCodec.encode(json(hudCanonicalState, linkedHashSet, j2, 0, i4).toString());
                    } catch (IOException e6) {
                    }
                }
                int i5 = 11;
                String[] strArr = {"st2", CmcdConfiguration.KEY_STREAM_TYPE, "eta", "rkm", "rm", "avgL", "avgR", "avgP", "alrV", "alrD", "alr"};
                for (int i6 = 0; i6 < i5; i6++) {
                    linkedHashSet.remove(strArr[i6]);
                    try {
                        return HlpFrameCodec.encode(json(hudCanonicalState, linkedHashSet, j2, 0, 0).toString());
                    } catch (IOException e7) {
                    }
                }
                throw new IOException("mandatory HLP state exceeds 512 bytes");
            }
        }
    }

    private static JSONObject json(HudCanonicalState hudCanonicalState, Set<String> set, long j2, int i2, int i3) throws JSONException {
        int i4;
        String str;
        String str2;
        Gateway.LaneSnapshot laneSnapshot;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectPut = jSONObject.put("v", 1).put("t", CmcdData.STREAMING_FORMAT_SS);
            String str3 = CmcdData.STREAMING_FORMAT_SS;
            String str4 = "v";
            jSONObjectPut.put("ts", j2);
            if (set.contains("nav")) {
                jSONObject.put("nav", hudCanonicalState.navigating ? 1 : 0);
            }
            if (set.contains("spd")) {
                jSONObject.put("spd", Math.max(0, hudCanonicalState.speedKmh));
            }
            if (set.contains("lim")) {
                jSONObject.put("lim", Math.max(0, hudCanonicalState.limitKmh));
            }
            if (set.contains("over")) {
                jSONObject.put("over", (hudCanonicalState.limitKmh < 10 || hudCanonicalState.speedKmh <= hudCanonicalState.limitKmh + overMargin(hudCanonicalState)) ? 0 : 1);
            }
            if (set.contains("trn")) {
                jSONObject.put("trn", hudCanonicalState.turn);
            }
            if (set.contains("trn2")) {
                jSONObject.put("trn2", hudCanonicalState.nextTurn);
            }
            if (set.contains("dst")) {
                jSONObject.put("dst", hudCanonicalState.turnDistanceM);
            }
            if (set.contains("exit")) {
                jSONObject.put("exit", hudCanonicalState.exitNumber);
            }
            if (set.contains("lan")) {
                JSONArray jSONArray = new JSONArray();
                if (hudCanonicalState.lanes != null) {
                    laneSnapshot = hudCanonicalState.lanes;
                } else {
                    laneSnapshot = Gateway.LaneSnapshot.EMPTY;
                }
                for (int i5 = 0; i5 < laneSnapshot.size(); i5++) {
                    int i6 = 0;
                    int i7 = 0;
                    for (int i8 = 0; i8 < laneSnapshot.angleCount(i5); i8++) {
                        int iDirectionBit = HudLaneCodec.directionBit(laneSnapshot.angleAt(i5, i8));
                        i6 |= iDirectionBit;
                        if (laneSnapshot.isSelected(i5, i8)) {
                            i7 |= iDirectionBit;
                        }
                    }
                    if (i6 != 0) {
                        jSONArray.put(new JSONArray().put(i6).put(i7));
                    }
                }
                jSONObject.put("lan", jSONArray);
            }
            if (set.contains(CmcdConfiguration.KEY_STREAM_TYPE)) {
                i4 = i3;
                jSONObject.put(CmcdConfiguration.KEY_STREAM_TYPE, trimCodePoints(hudCanonicalState.currentStreet, i4));
            } else {
                i4 = i3;
            }
            if (set.contains("st2")) {
                jSONObject.put("st2", trimCodePoints(hudCanonicalState.nextStreet, i4));
            }
            if (set.contains("eta")) {
                jSONObject.put("eta", hudCanonicalState.etaClock);
            }
            if (set.contains("rmin")) {
                jSONObject.put("rmin", hudCanonicalState.remainingMinutes);
            }
            if (set.contains("rm") && hudCanonicalState.remainingMeters >= 0) {
                jSONObject.put("rm", hudCanonicalState.remainingMeters);
            }
            if (set.contains("rkm") && hudCanonicalState.remainingMeters >= 0) {
                double d2 = hudCanonicalState.remainingMeters;
                Double.isNaN(d2);
                double dRound = Math.round(d2 / 100.0d);
                Double.isNaN(dRound);
                jSONObject.put("rkm", dRound / 10.0d);
            }
            if (set.contains("avg")) {
                jSONObject.put("avg", averageZone(hudCanonicalState) ? 1 : 0);
            }
            if (averageZone(hudCanonicalState)) {
                if (set.contains("avgL")) {
                    jSONObject.put("avgL", hudCanonicalState.averageLeftM);
                }
                if (set.contains("avgR")) {
                    jSONObject.put("avgR", hudCanonicalState.recommendedSpeedKmh);
                }
                if (set.contains("avgP")) {
                    jSONObject.put("avgP", hudCanonicalState.averagePercent);
                }
            }
            if (!hudCanonicalState.alerts.isEmpty()) {
                String[] strArrSplit = hudCanonicalState.alerts.get(0).rawRow.split("\\t", -1);
                if (strArrSplit.length >= 4) {
                    int[] iArrDecode = HudAlertCodec.decode(strArrSplit);
                    if (set.contains("alr")) {
                        jSONObject.put("alr", iArrDecode[0]);
                    }
                    if (set.contains("alrD")) {
                        jSONObject.put("alrD", parseInt(strArrSplit[3], -1));
                    }
                    if (set.contains("alrV") && iArrDecode[1] > 0) {
                        jSONObject.put("alrV", iArrDecode[1]);
                    }
                    int iJamSeverity = HudAlertCodec.jamSeverity(strArrSplit);
                    int iJamDelayMinutes = HudAlertCodec.jamDelayMinutes(strArrSplit);
                    if (set.contains("alrS") && iJamSeverity > 0) {
                        jSONObject.put("alrS", iJamSeverity);
                    }
                    if (set.contains("alrM") && iJamDelayMinutes > 0) {
                        jSONObject.put("alrM", iJamDelayMinutes);
                    }
                }
            }
            if (set.contains("alrs")) {
                JSONArray jSONArray2 = new JSONArray();
                if (i2 > 0) {
                    int i9 = 0;
                    while (i9 < hudCanonicalState.alerts.size() && i9 < i2) {
                        String[] strArrSplit2 = hudCanonicalState.alerts.get(i9).rawRow.split("\\t", -1);
                        if (strArrSplit2.length < 4) {
                            str2 = str3;
                            str = str4;
                        } else {
                            int[] iArrDecode2 = HudAlertCodec.decode(strArrSplit2);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("k", iArrDecode2[0]).put("d", parseInt(strArrSplit2[3], -1));
                            if (iArrDecode2[1] > 0) {
                                str = str4;
                                jSONObject2.put(str, iArrDecode2[1]);
                            } else {
                                str = str4;
                            }
                            int iJamSeverity2 = HudAlertCodec.jamSeverity(strArrSplit2);
                            int iJamDelayMinutes2 = HudAlertCodec.jamDelayMinutes(strArrSplit2);
                            if (iJamSeverity2 > 0) {
                                str2 = str3;
                                jSONObject2.put(str2, iJamSeverity2);
                            } else {
                                str2 = str3;
                            }
                            if (iJamDelayMinutes2 > 0) {
                                jSONObject2.put(CmcdData.OBJECT_TYPE_MANIFEST, iJamDelayMinutes2);
                            }
                            jSONArray2.put(jSONObject2);
                        }
                        i9++;
                        str4 = str;
                        str3 = str2;
                    }
                }
                jSONObject.put("alrs", jSONArray2);
            }
        } catch (Exception e2) {
        }
        return jSONObject;
    }

    private static int overMargin(HudCanonicalState hudCanonicalState) {
        return hudCanonicalState.overMargin;
    }

    private static boolean averageZone(HudCanonicalState hudCanonicalState) {
        return hudCanonicalState.averageZone;
    }

    private static String trimCodePoints(String str, int i2) {
        if (str == null || i2 <= 0) {
            return "";
        }
        int iOffsetByCodePoints = str.offsetByCodePoints(0, Math.min(i2, str.codePointCount(0, str.length())));
        return iOffsetByCodePoints == str.length() ? str : str.substring(0, iOffsetByCodePoints);
    }

    private static int parseInt(String str, int i2) {
        try {
            return Integer.parseInt(str.trim());
        } catch (Throwable th) {
            return i2;
        }
    }
}
