package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class cz implements dz, Runnable {
    private boolean bcc;
    private wk cz;
    private boolean ivm;
    private long lw;
    private long moa;

    /* renamed from: oa, reason: collision with root package name */
    private final Activity f26144oa;
    private final uef xs;
    private final AtomicBoolean zjm = new AtomicBoolean(false);
    private final Handler yo = new Handler(Looper.getMainLooper());
    private View uef = moa();

    public interface uef {
        void oa();

        View uef();
    }

    private cz(Activity activity, int i5, uef uefVar) {
        this.xs = uefVar;
        this.f26144oa = activity;
        this.moa = i5;
    }

    private void ivm() {
        Activity activity;
        View childAt;
        if (this.ivm || (activity = this.f26144oa) == null || activity.isFinishing() || this.f26144oa.isDestroyed()) {
            return;
        }
        if (this.uef == null) {
            this.uef = moa();
        }
        View view = this.uef;
        if (view != null) {
            if (oa(view)) {
                uef(this.uef);
                View view2 = this.uef;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.uef).getChildAt(0)) != null && oa(childAt)) {
                    uef(childAt);
                }
                uef uefVar = this.xs;
                if (uefVar != null) {
                    uefVar.oa();
                }
                wk wkVar = this.cz;
                if (wkVar != null) {
                    wkVar.uef();
                }
            }
            xs();
        }
        this.ivm = true;
    }

    private void lw() {
        this.bcc = false;
        this.lw = SystemClock.elapsedRealtime();
        Handler handler = this.yo;
        if (handler != null) {
            handler.postDelayed(this, this.moa);
        }
    }

    private View moa() {
        uef uefVar = this.xs;
        if (uefVar != null) {
            return uefVar.uef();
        }
        return null;
    }

    public static dz uef(Activity activity, uef uefVar) {
        int iFjj = com.bytedance.sdk.openadsdk.core.settings.dj.oa().fjj();
        return iFjj < 0 ? new dz() { // from class: com.bytedance.sdk.openadsdk.utils.cz.1
            @Override // com.bytedance.sdk.openadsdk.utils.dz
            public void oa() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.dz
            public void uef() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.dz
            public void yo() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.dz
            public void uef(int i5) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.dz
            public void uef(long j8) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.dz
            public void uef(wk wkVar) {
            }
        } : new cz(activity, Math.min(iFjj, 50) * 1000, uefVar);
    }

    private void xs() {
        ViewParent parent = this.uef.getParent();
        if (parent instanceof ViewGroup) {
            if (((ViewGroup) parent).indexOfChild(this.uef) != r0.getChildCount() - 1) {
                this.uef.bringToFront();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.dz
    public void oa() {
        if (this.lw <= 0 || this.ivm) {
            return;
        }
        if (!this.bcc) {
            this.moa -= SystemClock.elapsedRealtime() - this.lw;
        }
        this.bcc = true;
        if (this.moa <= 0) {
            ivm();
            return;
        }
        Handler handler = this.yo;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dhk.yo(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        ivm();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.dz
    public void yo() {
        if (this.ivm) {
            return;
        }
        this.ivm = true;
        Handler handler = this.yo;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.dhk.yo(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.dz
    public void uef(long j8) {
        if (this.zjm.compareAndSet(false, true)) {
            if (j8 < 0) {
                j8 = 0;
            }
            this.moa += j8;
            lw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.dz
    public void uef() {
        if (this.lw == 0 || !this.bcc) {
            return;
        }
        lw();
    }

    private void uef(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean oa(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }

    @Override // com.bytedance.sdk.openadsdk.utils.dz
    public void uef(int i5) {
        this.moa = i5;
    }

    @Override // com.bytedance.sdk.openadsdk.utils.dz
    public void uef(wk wkVar) {
        this.cz = wkVar;
    }
}
