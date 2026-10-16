package com.bytedance.sdk.openadsdk.gsd.uef;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.bcc;

/* loaded from: classes3.dex */
public class uef {

    /* renamed from: oa, reason: collision with root package name */
    private static HandlerThread f25918oa;
    private static Handler uef;

    public static Handler uef() {
        try {
            HandlerThread handlerThread = f25918oa;
            if (handlerThread == null || !handlerThread.isAlive()) {
                synchronized (uef.class) {
                    try {
                        HandlerThread handlerThread2 = f25918oa;
                        if (handlerThread2 == null || !handlerThread2.isAlive()) {
                            f25918oa = bcc.uef("pag_ev");
                            uef = new Handler(f25918oa.getLooper());
                        }
                    } finally {
                    }
                }
            } else if (uef == null) {
                synchronized (uef.class) {
                    try {
                        if (uef == null) {
                            uef = new Handler(f25918oa.getLooper());
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return uef;
    }
}
