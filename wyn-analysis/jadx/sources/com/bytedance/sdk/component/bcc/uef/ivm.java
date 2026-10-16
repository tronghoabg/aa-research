package com.bytedance.sdk.component.bcc.uef;

import android.os.Handler;
import com.applovin.impl.W;

/* loaded from: classes.dex */
public abstract class ivm {
    public final Handler uef;

    public ivm(Handler handler) {
        this.uef = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lw(Runnable runnable) {
        Handler handler = this.uef;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void moa(Runnable runnable) {
        Handler handler = this.uef;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oa(Runnable runnable, long j8) {
        Handler handler = this.uef;
        if (handler != null) {
            handler.postDelayed(runnable, j8);
        }
    }

    public void uef(Runnable runnable) {
        if (uef()) {
            yo(new a(this, runnable, 0));
            return;
        }
        Handler handler = this.uef;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public abstract boolean uef();

    public void yo(Runnable runnable) {
        lw.uef().uef(runnable);
    }

    public void oa(Runnable runnable) {
        if (uef()) {
            yo(new a(this, runnable, 1));
            return;
        }
        Handler handler = this.uef;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public void uef(Runnable runnable, long j8) {
        if (uef()) {
            yo(new W(this, runnable, j8, 1));
            return;
        }
        Handler handler = this.uef;
        if (handler != null) {
            handler.postDelayed(runnable, j8);
        }
    }
}
