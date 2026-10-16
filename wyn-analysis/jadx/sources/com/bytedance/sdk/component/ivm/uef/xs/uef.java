package com.bytedance.sdk.component.ivm.uef.xs;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.ivm.uef.lw;
import com.bytedance.sdk.component.ivm.uef.xs;

/* loaded from: classes.dex */
public class uef {

    /* renamed from: oa, reason: collision with root package name */
    private static volatile Handler f25018oa = null;
    private static volatile HandlerThread uef = null;
    private static int yo = 3000;

    static {
        yo();
    }

    public static int oa() {
        if (yo <= 0) {
            yo = 3000;
        }
        return yo;
    }

    public static Handler uef() {
        if (uef == null || !uef.isAlive()) {
            synchronized (uef.class) {
                try {
                    if (uef == null || !uef.isAlive()) {
                        yo();
                        f25018oa = new Handler(uef.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (f25018oa == null) {
            synchronized (uef.class) {
                try {
                    if (f25018oa == null) {
                        f25018oa = new Handler(uef.getLooper());
                    }
                } finally {
                }
            }
        }
        return f25018oa;
    }

    private static void yo() {
        HandlerThread handlerThreadUef;
        lw lwVarWk = xs.ivm().wk();
        if (lwVarWk != null && (handlerThreadUef = lwVarWk.uef("csj_ad_log", 10)) != null) {
            uef = handlerThreadUef;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        uef = handlerThread;
        handlerThread.start();
    }
}
