package com.bytedance.sdk.openadsdk.core.zjm.oa;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class oa {
    public static long[] uef(String str, long j8) {
        long j10;
        long j11;
        if (str == null || str.isEmpty() || j8 <= 0) {
            return new long[]{0, j8 - 1};
        }
        Matcher matcher = Pattern.compile("bytes\\s*=\\s*(\\d*)\\s*-\\s*(\\d*)", 2).matcher(str);
        if (!matcher.matches()) {
            return new long[]{0, j8 - 1};
        }
        try {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            boolean zIsEmpty = TextUtils.isEmpty(strGroup);
            boolean zIsEmpty2 = TextUtils.isEmpty(strGroup2);
            if (zIsEmpty || zIsEmpty2) {
                if (!zIsEmpty) {
                    j10 = Long.parseLong(strGroup);
                } else {
                    if (zIsEmpty2) {
                        return new long[]{0, j8 - 1};
                    }
                    j10 = j8 - Long.parseLong(strGroup2);
                }
                j11 = j8 - 1;
            } else {
                j10 = Long.parseLong(strGroup);
                j11 = Long.parseLong(strGroup2);
            }
            return uef(j10, j11, j8);
        } catch (Throwable unused) {
            return new long[]{0, j8 - 1};
        }
    }

    private static long[] uef(long j8, long j10, long j11) {
        if (j8 < 0) {
            j8 = 0;
        }
        if (j10 >= j11) {
            j10 = j11 - 1;
        }
        if (j8 > j10 || j8 >= j11) {
            return null;
        }
        return new long[]{j8, j10};
    }
}
