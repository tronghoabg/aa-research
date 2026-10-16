package com.bykv.vk.openvk.uef.uef.uef;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.oa.uef.dj;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class yo {
    private static int lw = 1;
    private static dj moa = null;

    /* renamed from: oa, reason: collision with root package name */
    private static Context f24517oa = null;
    public static boolean uef = false;
    private static String yo;

    public static int lw() {
        return lw;
    }

    public static boolean moa() {
        return uef;
    }

    public static String oa() {
        if (TextUtils.isEmpty(yo)) {
            try {
                File file = new File(uef().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                yo = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return yo;
    }

    public static Context uef() {
        return f24517oa;
    }

    public static dj yo() {
        if (moa == null) {
            dj.uef uefVar = new dj.uef("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            moa = uefVar.uef(10000L, timeUnit).oa(10000L, timeUnit).yo(10000L, timeUnit).uef();
        }
        return moa;
    }

    public static void uef(Context context, String str) {
        f24517oa = context;
        yo = str;
    }

    public static void uef(dj djVar) {
        moa = djVar;
    }

    public static void uef(int i5) {
        lw = i5;
    }
}
