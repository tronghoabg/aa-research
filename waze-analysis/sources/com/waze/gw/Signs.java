package com.waze.gw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.autofill.HintConstants;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes10.dex */
final class Signs {
    private static final HashMap<Integer, Bitmap> cache = new HashMap<>();
    private static final HashMap<String, Bitmap> acache = new HashMap<>();
    private static final HashMap<String, Bitmap> wcache = new HashMap<>();
    private static final HashMap<String, Bitmap> pcache = new HashMap<>();

    Signs() {
    }

    static Bitmap wazeIcon(Context context, String str) {
        Bitmap bitmapDecodeStream;
        Bitmap bitmap = null;
        if (context == null || str == null || str.length() == 0) {
            return null;
        }
        synchronized (wcache) {
            if (wcache.containsKey(str)) {
                return wcache.get(str);
            }
            String strSubstring = str.startsWith("icon_") ? str.substring(5) : str;
            String str2 = "bigpin_" + strSubstring;
            int i2 = 2;
            String[] strArr = {str, strSubstring, str2};
            String[] strArr2 = {"res/skins/default/alert_icons/", "res/skins/default/"};
            String[] strArr3 = {"@3x", "@2x", ""};
            int i3 = 0;
            loop0: while (true) {
                if (i3 >= 3) {
                    break;
                }
                String str3 = strArr[i3];
                int i4 = 0;
                while (i4 < i2) {
                    String str4 = strArr2[i4];
                    Bitmap bitmap2 = bitmap;
                    for (int i5 = 0; i5 < 3; i5++) {
                        try {
                            InputStream inputStreamOpen = context.getAssets().open(str4 + str3 + strArr3[i5] + ".png");
                            bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                            try {
                                inputStreamOpen.close();
                            } catch (Throwable th) {
                                bitmap2 = bitmapDecodeStream;
                            }
                        } catch (Throwable th2) {
                        }
                        if (bitmapDecodeStream != null) {
                            bitmap = bitmapDecodeStream;
                            break loop0;
                        }
                        bitmap2 = bitmapDecodeStream;
                    }
                    i4++;
                    bitmap = bitmap2;
                    i2 = 2;
                }
                i3++;
                i2 = 2;
            }
            wcache.put(str, bitmap);
            return bitmap;
        }
    }

    static Bitmap pin(Context context, String str) {
        Bitmap bitmapDecodeStream = null;
        if (context == null || str == null) {
            return null;
        }
        synchronized (pcache) {
            if (pcache.containsKey(str)) {
                return pcache.get(str);
            }
            try {
                InputStream inputStreamOpen = context.getAssets().open("wz_pins/" + str + ".png");
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                inputStreamOpen.close();
            } catch (Throwable th) {
            }
            pcache.put(str, bitmapDecodeStream);
            return bitmapDecodeStream;
        }
    }

    static Bitmap alertIcon(Context context, String str) {
        int i2;
        if (str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("roadpoint_exit")) {
            return pin(context, "loi_ra");
        }
        if (lowerCase.equals("roadpoint_expressway_rest") || lowerCase.equals("roadpoint_rest")) {
            return pin(context, "bigpin_hazard_stopped");
        }
        String str2 = "no_passing_in";
        if (lowerCase.startsWith("wme_")) {
            try {
                i2 = Integer.parseInt(lowerCase.substring(4));
            } catch (Throwable th) {
                i2 = -1;
            }
            switch (i2) {
                case 2:
                case 5:
                    str2 = "no_left_and_u_turn";
                    break;
                case 3:
                case 4:
                case 10:
                case 12:
                case 13:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                default:
                    str2 = null;
                    break;
                case 6:
                case 7:
                    str2 = "no_right_and_u_turn";
                    break;
                case 8:
                case 16:
                    str2 = "no_left_turn";
                    break;
                case 9:
                case 17:
                    str2 = "no_right_turn";
                    break;
                case 11:
                case 18:
                    str2 = "no_u_turn";
                    break;
                case 14:
                    break;
                case 15:
                    str2 = "no_passing_out";
                    break;
                case 19:
                    str2 = "cam_oto";
                    break;
                case 20:
                    str2 = "cam_xe_may";
                    break;
                case 21:
                    str2 = "only_go_straight";
                    break;
                case 22:
                    str2 = "only_turn_right";
                    break;
                case 23:
                    str2 = "only_turn_left";
                    break;
                case 26:
                    str2 = "residential_area_start";
                    break;
                case 27:
                    str2 = "residential_area_end";
                    break;
                case 35:
                    str2 = "end_of_previous_prohibitions";
                    break;
            }
            Bitmap bitmapPin = str2 != null ? pin(context, str2) : null;
            return bitmapPin != null ? bitmapPin : pin(context, "bigpin_hazard");
        }
        if (lowerCase.startsWith("speeddrop_")) {
            String strSubstring = str.substring(10);
            Bitmap bitmapPin2 = pin(context, "bigpin_speed_limit_world_" + strSubstring);
            if (bitmapPin2 == null) {
                try {
                    return limit(context, Integer.parseInt(strSubstring));
                } catch (Throwable th2) {
                    return bitmapPin2;
                }
            }
            return bitmapPin2;
        }
        if (lowerCase.contains("french") || lowerCase.contains("average")) {
            return pin(context, "no_passing_in");
        }
        if (lowerCase.contains("railway") || lowerCase.contains("railroad") || lowerCase.contains("train")) {
            return pin(context, "bigpin_railroad");
        }
        if (lowerCase.contains("cam")) {
            if (lowerCase.contains(HintConstants.AUTOFILL_HINT_PHONE)) {
                return pin(context, "bigpin_phone_camera");
            }
            if (lowerCase.contains("red")) {
                return pin(context, "bigpin_red_light_camera");
            }
            if (lowerCase.contains("dummy") || lowerCase.contains("fake")) {
                return pin(context, "bigpin_dummy_camera");
            }
            return lowerCase.contains("seatbelt") ? pin(context, "bigpin_seatbelt_camera") : lowerCase.contains("speed") ? pin(context, "bigpin_speed_camera") : pin(context, "bigpin_speed_camera");
        }
        if (lowerCase.contains("police") || lowerCase.contains("checkpoint")) {
            return pin(context, "bigpin_police");
        }
        if (lowerCase.contains("toll")) {
            return pin(context, "bigpin_permanent_hazard_toll_booth");
        }
        if (lowerCase.contains("blocked_lane") || lowerCase.contains("closed_lane")) {
            return pin(context, "bigpin_blocked_lane");
        }
        if (lowerCase.contains("accident") || lowerCase.contains("crash")) {
            return pin(context, "bigpin_accident");
        }
        if (str.startsWith("icon_")) {
            str = str.substring(5);
        }
        Bitmap bitmapPin3 = pin(context, "bigpin_" + str);
        if (bitmapPin3 == null && str.startsWith("report_")) {
            bitmapPin3 = pin(context, "bigpin_" + str.substring(7));
        }
        return bitmapPin3 == null ? pin(context, "bigpin_hazard") : bitmapPin3;
    }

    static Bitmap alert(Context context, String str) {
        Bitmap bitmapDecodeStream = null;
        if (context == null || str == null) {
            return null;
        }
        synchronized (acache) {
            if (acache.containsKey(str)) {
                return acache.get(str);
            }
            try {
                InputStream inputStreamOpen = context.getAssets().open("vm_alerts/" + str + ".png");
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                inputStreamOpen.close();
            } catch (Throwable th) {
            }
            acache.put(str, bitmapDecodeStream);
            return bitmapDecodeStream;
        }
    }

    static Bitmap limit(Context context, int i2) {
        Bitmap bitmapDecodeStream = null;
        if (context == null || i2 < 10 || i2 > 120 || i2 % 10 != 0) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(i2);
        synchronized (cache) {
            if (cache.containsKey(numValueOf)) {
                return cache.get(numValueOf);
            }
            try {
                InputStream inputStreamOpen = context.getAssets().open("vm_signs/speed_limit_" + i2 + ".png");
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                inputStreamOpen.close();
            } catch (Throwable th) {
            }
            cache.put(numValueOf, bitmapDecodeStream);
            return bitmapDecodeStream;
        }
    }
}
