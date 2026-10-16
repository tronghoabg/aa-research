package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public class bcc {

    /* renamed from: oa, reason: collision with root package name */
    private static HandlerThread f25095oa;
    public static volatile boolean uef;

    public static void uef(HandlerThread handlerThread) {
        f25095oa = handlerThread;
    }

    public static HandlerThread uef(String str) {
        return uef(str, 0);
    }

    public static HandlerThread uef(String str, int i5) {
        if (uef) {
            return f25095oa;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str, i5) { // from class: com.bytedance.sdk.component.utils.bcc.1
                boolean uef = false;

                @Override // java.lang.Thread
                public synchronized void start() {
                    if (this.uef) {
                        return;
                    }
                    this.uef = true;
                    super.start();
                }
            };
            handlerThread.start();
            return handlerThread;
        } catch (Throwable th) {
            dhk.uef("HandlerThreadUtils", "new handlerThread error", th);
            return f25095oa;
        }
    }
}
