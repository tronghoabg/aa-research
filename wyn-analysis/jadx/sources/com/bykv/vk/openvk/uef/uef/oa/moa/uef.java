package com.bykv.vk.openvk.uef.uef.oa.moa;

import android.os.Build;
import android.view.View;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public class uef {
    private static final int uef = Build.VERSION.SDK_INT;

    public static int uef(long j8, long j10) {
        return Math.min(Math.max(0, j10 > 0 ? (int) (((j8 * 1.0d) / j10) * 100.0d) : 0), 100);
    }

    public static String uef(long j8) {
        StringBuilder sb2 = new StringBuilder();
        long j10 = j8 / 60000;
        long j11 = ((j8 % 3600000) % 60000) / 1000;
        if (j10 >= 10) {
            sb2.append(j10);
        } else if (j10 > 0) {
            sb2.append(0);
            sb2.append(j10);
        } else {
            sb2.append("00");
        }
        sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        if (j11 >= 10) {
            sb2.append(j11);
        } else if (j11 > 0) {
            sb2.append(0);
            sb2.append(j11);
        } else {
            sb2.append("00");
        }
        return sb2.toString();
    }

    public static void uef(View view, boolean z2) {
        if (view == null) {
            return;
        }
        if (z2) {
            view.setSystemUiVisibility(0);
            return;
        }
        int i5 = uef;
        if (i5 >= 19) {
            view.setSystemUiVisibility(3846);
        } else if (i5 >= 16) {
            view.setSystemUiVisibility(5);
        } else {
            view.setSystemUiVisibility(1);
        }
    }
}
