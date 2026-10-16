package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.util.Base64;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import androidx.core.location.LocationRequestCompat;
import com.carstream.tech.R;
import java.text.Normalizer;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class xc {
    public static final byte[] a = {75, 122, 25, -61, 94, -113, 34, -31, 6, -99};
    public static volatile boolean b;

    public static boolean a(Activity activity, int i) {
        ArrayList arrayList = new ArrayList();
        if (activity.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33 && activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        for (String str : i2 >= 33 ? new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"}) {
            if (activity.checkSelfPermission(str) != 0) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            try {
                activity.requestPermissions((String[]) arrayList.toArray(new String[0]), i);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static String b(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            for (int i = 0; i < bArrDecode.length; i++) {
                bArrDecode[i] = (byte) (bArrDecode[i] ^ a[i % 10]);
            }
            return new String(bArrDecode, "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }

    public static int c(Context context) {
        if (Build.VERSION.SDK_INT < 31) {
            return -1;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            AudioDeviceInfo communicationDevice = audioManager == null ? null : audioManager.getCommunicationDevice();
            if (communicationDevice == null) {
                return -1;
            }
            return communicationDevice.getId();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList d(android.content.Context r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 >= r2) goto Lc
            goto L6b
        Lc:
            java.lang.String r1 = "audio"
            java.lang.Object r6 = r6.getSystemService(r1)     // Catch: java.lang.Throwable -> L6b
            android.media.AudioManager r6 = (android.media.AudioManager) r6     // Catch: java.lang.Throwable -> L6b
            if (r6 != 0) goto L17
            goto L6b
        L17:
            java.util.List r6 = defpackage.y0.r(r6)     // Catch: java.lang.Throwable -> L6b
            if (r6 != 0) goto L1e
            goto L6b
        L1e:
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L6b
        L22:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L6b
            android.media.AudioDeviceInfo r1 = (android.media.AudioDeviceInfo) r1     // Catch: java.lang.Throwable -> L6b
            l1 r2 = new l1     // Catch: java.lang.Throwable -> L6b
            int r3 = r1.getId()     // Catch: java.lang.Throwable -> L6b
            int r4 = r1.getType()     // Catch: java.lang.Throwable -> L6b
            int r1 = r1.getType()     // Catch: java.lang.Throwable -> L6b
            r5 = 1
            if (r1 == r5) goto L62
            r5 = 2
            if (r1 == r5) goto L5f
            r5 = 3
            if (r1 == r5) goto L5c
            r5 = 4
            if (r1 == r5) goto L5c
            r5 = 7
            if (r1 == r5) goto L59
            r5 = 22
            if (r1 == r5) goto L56
            r5 = 26
            if (r1 == r5) goto L59
            java.lang.String r1 = "Khác"
            goto L64
        L56:
            java.lang.String r1 = "Tai nghe USB"
            goto L64
        L59:
            java.lang.String r1 = "Bluetooth (xe)"
            goto L64
        L5c:
            java.lang.String r1 = "Tai nghe"
            goto L64
        L5f:
            java.lang.String r1 = "Loa ngoài"
            goto L64
        L62:
            java.lang.String r1 = "Điện thoại"
        L64:
            r2.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> L6b
            r0.add(r2)     // Catch: java.lang.Throwable -> L6b
            goto L22
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc.d(android.content.Context):java.util.ArrayList");
    }

    public static boolean e(Context context, String str, boolean z) {
        return l(context).getBoolean(h(str), z);
    }

    public static int f(int i, Context context, String str) {
        return l(context).getInt(h(str), i);
    }

    public static String g(Context context, String str, String str2) {
        return l(context).getString(h(str), str2);
    }

    public static String h(String str) {
        return ad.g("app.", str);
    }

    public static String i(Context context, int i) {
        if (i <= 0) {
            return null;
        }
        String strG = g(context, "hudText", "viPlain");
        if ("en".equals(strG)) {
            return "Limit: " + i + " km/h";
        }
        if ("viPlain".equals(strG)) {
            return "Gioi han: " + i + " km/h";
        }
        String str = "Giới hạn: " + i + " km/h";
        return "viNfd".equals(strG) ? Normalizer.normalize(str, Normalizer.Form.NFD) : str;
    }

    public static String j(String str, String str2) {
        if (str != null) {
            switch (str) {
                case "warningAlertNoPassingGoingInId":
                    return "Cấm vượt";
                case "warningAlertHighwayRestAreaId":
                case "warningAlertNationalHighwayRestAreaId":
                    return "Trạm dừng nghỉ";
                case "warningAlertNoPassingGoingOutId":
                    return "Hết cấm vượt";
                case "warningAlertResidentialAreaGoingInId":
                    return "Khu dân cư";
                case "warningAlertNoParkingOddId":
                case "warningAlertNoParkingId":
                case "warningAlertNoParkingEvenId":
                    return "Cấm đỗ";
                case "warningAlertNoParkNoStopId":
                    return "Cấm dừng đỗ";
                case "warningAlertCameraAIId":
                    return "Camera AI";
                case "warningAlertSpeedLimitCameraId":
                    return "Camera tốc độ";
                case "warningAlertRailwayId":
                    return "Đường sắt";
                case "warningAlertPenaltyCameraId":
                    return "Camera phạt nguội";
                case "warningAlertTollFeeNonETCId":
                    return "Trạm thu phí";
                case "warningAlertTunnelId":
                    return "Hầm đường bộ";
                case "warningAlertResidentialAreaGoingOutId":
                    return "Hết khu dân cư";
                case "warningAlertSpeedLimitCheckpointId":
                    return "Trạm kiểm tra tốc độ";
                case "warningAlertTrafficCameraId":
                    return "Camera giao thông";
                case "warningAlertTollFeeETCId":
                    return "Thu phí ETC";
            }
        }
        return str2;
    }

    public static JSONArray k(String str) throws JSONException {
        int i;
        int i2;
        JSONArray jSONArray = new JSONArray();
        if (str != null && !str.isEmpty()) {
            String[] strArrSplit = str.split("\r\n|\n|\r");
            String strSubstring = null;
            String strR = "";
            String strTrim = strR;
            String strR2 = strTrim;
            for (int i3 = 0; i3 < strArrSplit.length && jSONArray.length() < 3000; i3++) {
                String strTrim2 = strArrSplit[i3].trim();
                if (!strTrim2.isEmpty()) {
                    if (strTrim2.startsWith("#EXTINF")) {
                        int iLastIndexOf = strTrim2.lastIndexOf(44);
                        strSubstring = (iLastIndexOf < 0 || (i2 = iLastIndexOf + 1) >= strTrim2.length()) ? "" : strTrim2.substring(i2).trim();
                        strR2 = r(strTrim2, "tvg-logo");
                        strR = r(strTrim2, "group-title");
                    } else if (strTrim2.startsWith("#EXTGRP")) {
                        int iIndexOf = strTrim2.indexOf(58);
                        strTrim = iIndexOf >= 0 ? strTrim2.substring(iIndexOf + 1).trim() : "";
                    } else if (strTrim2.charAt(0) != '#') {
                        String lowerCase = strTrim2.toLowerCase();
                        if (lowerCase.startsWith("http://") || lowerCase.startsWith("https://")) {
                            if (strSubstring == null || strSubstring.isEmpty()) {
                                int iIndexOf2 = strTrim2.indexOf(63);
                                strSubstring = iIndexOf2 > 0 ? strTrim2.substring(0, iIndexOf2) : strTrim2;
                                int iLastIndexOf2 = strSubstring.lastIndexOf(47);
                                if (iLastIndexOf2 >= 0 && (i = iLastIndexOf2 + 1) < strSubstring.length()) {
                                    strSubstring = strSubstring.substring(i);
                                }
                                if (strSubstring.isEmpty()) {
                                    strSubstring = strTrim2;
                                }
                            }
                            if (strR == null || strR.isEmpty()) {
                                strR = strTrim;
                            }
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("n", strSubstring);
                                jSONObject.put("u", strTrim2);
                                if (strR2 == null) {
                                    strR2 = "";
                                }
                                jSONObject.put("l", strR2);
                                if (strR == null) {
                                    strR = "";
                                }
                                jSONObject.put("g", strR);
                                jSONArray.put(jSONObject);
                            } catch (Exception unused) {
                            }
                            strSubstring = null;
                            strR = "";
                            strR2 = strR;
                        } else {
                            strSubstring = null;
                        }
                    }
                }
            }
        }
        return jSONArray;
    }

    public static SharedPreferences l(Context context) {
        return context.getApplicationContext().getSharedPreferences("CanhNhatTube", 0);
    }

    public static void m(Context context, String str, boolean z) {
        l(context).edit().putBoolean(h(str), z).apply();
    }

    public static void n(int i, Context context, String str) {
        l(context).edit().putInt(h(str), i).apply();
    }

    public static void o(Context context, String str, long j) {
        l(context).edit().putLong(h(str), j).apply();
    }

    public static void p(Context context, String str, String str2) {
        l(context).edit().putString(h(str), str2).apply();
    }

    public static int q(int i) {
        switch (i) {
            case 10:
                return R.drawable.speed_10;
            case 20:
                return R.drawable.speed_20;
            case 30:
                return R.drawable.speed_30;
            case 40:
                return R.drawable.speed_40;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                return R.drawable.speed_50;
            case 60:
                return R.drawable.speed_60;
            case 70:
                return R.drawable.speed_70;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return R.drawable.speed_80;
            case 90:
                return R.drawable.speed_90;
            case LocationRequestCompat.QUALITY_HIGH_ACCURACY /* 100 */:
                return R.drawable.speed_100;
            case 110:
                return R.drawable.speed_110;
            case 120:
                return R.drawable.speed_120;
            default:
                return 0;
        }
    }

    public static String r(String str, String str2) {
        int iIndexOf;
        String strConcat = str2.concat("=\"");
        int iIndexOf2 = str.indexOf(strConcat);
        return (iIndexOf2 >= 0 && (iIndexOf = str.indexOf(34, strConcat.length() + iIndexOf2)) >= 0) ? str.substring(strConcat.length() + iIndexOf2, iIndexOf).trim() : "";
    }
}
