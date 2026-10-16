package com.bytedance.sdk.openadsdk.core.moa;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.core.km;
import com.bytedance.sdk.openadsdk.core.wk;

/* loaded from: classes3.dex */
public class ivm extends com.bytedance.adsdk.ugeno.ivm.uef<View> implements ue.uef {
    private oa bcc;
    private uef cz;
    private final ViewTreeObserver.OnScrollChangedListener dj;
    private boolean ivm;
    private long lw;
    private final Handler moa;
    private boolean xs;
    private final Runnable zjm;

    public interface oa {
        void uef(boolean z2);
    }

    public interface uef {
        void uef(boolean z2);
    }

    public ivm(Context context) {
        super(context);
        this.moa = new ue(wk.oa().getLooper(), this);
        this.ivm = true;
        this.xs = true;
        this.zjm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.moa.ivm.1
            @Override // java.lang.Runnable
            public void run() {
                if (ivm.this.cz != null) {
                    ivm.this.cz.uef(ivm.this.xs);
                }
            }
        };
        this.dj = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.moa.ivm.2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - ivm.this.lw > 500) {
                    ivm.this.lw = jElapsedRealtime;
                    ivm.this.moa.sendEmptyMessageDelayed(1, 500L);
                }
            }
        };
    }

    private void xs() {
        boolean zUef = km.uef(this, 50, -1, false);
        this.xs = zUef;
        if (zUef == this.ivm) {
            return;
        }
        this.ivm = zUef;
        com.bytedance.sdk.openadsdk.utils.km.uef(this.zjm);
    }

    @Override // com.bytedance.adsdk.ugeno.ivm.uef
    public View dj(int i5) {
        return (View) this.uef.get(i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.dj);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.dj);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        oa oaVar = this.bcc;
        if (oaVar != null) {
            oaVar.uef(z2);
        }
    }

    public void setSwiperVisibleChangeListener(uef uefVar) {
        this.cz = uefVar;
    }

    public void setSwiperWindowFocusChangedListener(oa oaVar) {
        this.bcc = oaVar;
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
        if (message.what == 1) {
            xs();
        }
    }
}
