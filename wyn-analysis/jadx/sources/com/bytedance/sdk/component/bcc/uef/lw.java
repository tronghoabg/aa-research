package com.bytedance.sdk.component.bcc.uef;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.dhk;

/* loaded from: classes.dex */
final class lw {
    private static volatile lw uef;

    /* renamed from: oa, reason: collision with root package name */
    private volatile HandlerThread f24964oa;
    private volatile Handler yo;

    private lw() {
        oa();
    }

    private void oa() {
        try {
            if (yo()) {
                return;
            }
            this.f24964oa = new HandlerThread("csj_dispatch_msg") { // from class: com.bytedance.sdk.component.bcc.uef.lw.1
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
            this.f24964oa.start();
            this.yo = new Handler(this.f24964oa.getLooper());
        } catch (Throwable th) {
            dhk.uef("TTDispatchThread", "new handlerThread error", th);
        }
    }

    public static lw uef() {
        if (uef == null) {
            synchronized (lw.class) {
                try {
                    if (uef == null) {
                        uef = new lw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    private boolean yo() {
        return (this.f24964oa == null || this.yo == null || !this.f24964oa.isAlive()) ? false : true;
    }

    public void uef(Runnable runnable) {
        Handler handler;
        if (yo() && (handler = this.yo) != null) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }
}
