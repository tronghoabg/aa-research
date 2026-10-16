package com.bytedance.adsdk.ugeno.xs;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public class uef {

    /* renamed from: com.bytedance.adsdk.ugeno.xs.uef$uef, reason: collision with other inner class name */
    public static class C0046uef {

        /* renamed from: oa, reason: collision with root package name */
        public int[] f24777oa;
        public GradientDrawable.Orientation uef;
        public float[] yo;
    }

    public static GradientDrawable.Orientation moa(String str) {
        try {
            int i5 = str.contains("deg") ? Integer.parseInt(str.substring(0, str.length() - 3).trim()) : Integer.parseInt(str);
            return i5 == 90 ? GradientDrawable.Orientation.LEFT_RIGHT : i5 == 180 ? GradientDrawable.Orientation.TOP_BOTTOM : i5 == 270 ? GradientDrawable.Orientation.RIGHT_LEFT : i5 == 135 ? GradientDrawable.Orientation.TL_BR : i5 == 45 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static C0046uef oa(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            int iUef = uef(strSubstring, '%');
            int iIndexOf = strSubstring.indexOf(",");
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            C0046uef c0046uef = new C0046uef();
            c0046uef.uef = moa(strSubstring2);
            String strSubstring3 = strSubstring.substring(iIndexOf + 1);
            int[] iArr = new int[iUef];
            float[] fArr = new float[iUef];
            for (int i5 = 0; i5 < iUef; i5++) {
                int iIndexOf2 = strSubstring3.indexOf("%");
                String strTrim = strSubstring3.substring(0, iIndexOf2 + 1).trim();
                int iIndexOf3 = (strTrim.contains("rgba") ? strTrim.indexOf(")") : strTrim.indexOf(StringUtils.SPACE)) + 1;
                iArr[i5] = uef(strTrim.substring(0, iIndexOf3).trim());
                fArr[i5] = yo.uef(strTrim.substring(iIndexOf3, strTrim.indexOf("%")).trim(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / 100.0f;
                int i10 = iIndexOf2 + 2;
                if (strSubstring3.length() <= i10) {
                    break;
                }
                strSubstring3 = strSubstring3.substring(i10);
            }
            if (iUef < 2) {
                return null;
            }
            c0046uef.f24777oa = iArr;
            c0046uef.yo = fArr;
            return c0046uef;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int uef(String str) {
        return uef(str, -16777216);
    }

    public static boolean yo(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static int uef(String str, int i5) throws NumberFormatException {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("transparent")) {
                return 0;
            }
            if (str.charAt(0) == '#' && str.length() == 4) {
                StringBuilder sb2 = new StringBuilder("#");
                char[] charArray = str.toCharArray();
                for (int i10 = 1; i10 < charArray.length; i10++) {
                    sb2.append(charArray[i10]);
                    sb2.append(charArray[i10]);
                }
                return Color.parseColor(sb2.toString());
            }
            if (str.charAt(0) == '#' && str.length() == 7) {
                return Color.parseColor(str);
            }
            if (str.charAt(0) == '#' && str.length() == 9) {
                return Color.parseColor(str);
            }
            if (!str.startsWith("rgba")) {
                return -16777216;
            }
            String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
            if (strArrSplit != null && strArrSplit.length == 4) {
                return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
            }
        }
        return i5;
    }

    public static int uef(String str, char c10) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i5 = 0;
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (str.charAt(i10) == c10) {
                i5++;
            }
        }
        return i5;
    }

    public static int uef(int i5, int i10) {
        if (i10 < 0 || i10 > 255) {
            Log.e("ColorUtils", "alpha must be between 0 and 255. ");
            i10 = 255;
        }
        return (i5 & 16777215) | (i10 << 24);
    }
}
