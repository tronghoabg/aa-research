package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.ue;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class bcc extends View implements ue.uef {
    private int bcc;
    private boolean cq;
    private final Handler cz;
    private ViewTreeObserver.OnGlobalLayoutListener dj;
    private final Runnable dz;
    private List<View> ivm;
    private List<View> lw;
    private View moa;

    /* renamed from: oa, reason: collision with root package name */
    private boolean f25492oa;
    private boolean uef;
    private boolean wrv;
    private boolean xs;
    private uef yo;
    private final AtomicBoolean zjm;

    public interface uef {
        void oa();

        void uef();

        void uef(View view);

        void uef(boolean z2);
    }

    public bcc(Context context, View view, boolean z2) {
        super(sy.uef());
        this.cz = new com.bytedance.sdk.component.utils.ue(wk.oa().getLooper(), this);
        this.zjm = new AtomicBoolean(true);
        this.cq = false;
        this.dz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bcc.3
            @Override // java.lang.Runnable
            public void run() {
                if (bcc.this.yo != null) {
                    bcc.this.yo.uef(bcc.this.moa);
                }
            }
        };
        this.wrv = z2;
        this.moa = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.dj = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.bcc.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (bcc.this.cq) {
                    return;
                }
                bcc.this.lw();
                bcc.this.moa();
            }
        };
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.xs = false;
        oa();
        if (this.dj != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.dj);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lw();
        this.xs = true;
        yo();
        uef(false);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        oa();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        yo();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        uef uefVar = this.yo;
        if (uefVar != null) {
            uefVar.uef(z2);
        }
    }

    public void setAdType(int i5) {
        this.bcc = i5;
    }

    public void setCallback(uef uefVar) {
        this.yo = uefVar;
    }

    public void setNeedCheckingShow(boolean z2) {
        this.f25492oa = z2;
        if (!z2 && this.uef) {
            lw();
        } else {
            if (!z2 || this.uef) {
                return;
            }
            moa();
        }
    }

    public void setRefClickViews(List<View> list) {
        this.lw = list;
    }

    public void setRefCreativeViews(List<View> list) {
        this.ivm = list;
    }

    private boolean ivm() {
        View view = this.moa;
        if (view instanceof com.bytedance.sdk.openadsdk.core.zjm.tpx) {
            return ((com.bytedance.sdk.openadsdk.core.zjm.tpx) view).rt();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lw() {
        if (this.uef) {
            this.cz.removeCallbacksAndMessages(null);
            this.uef = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moa() {
        if (!this.f25492oa || this.uef) {
            return;
        }
        this.uef = true;
        this.cz.sendEmptyMessage(1);
    }

    private void oa() {
        uef uefVar;
        if (!this.zjm.getAndSet(false) || (uefVar = this.yo) == null) {
            return;
        }
        uefVar.uef();
    }

    private void yo() {
        uef uefVar;
        if (this.zjm.getAndSet(true) || (uefVar = this.yo) == null) {
            return;
        }
        uefVar.oa();
    }

    public void uef() {
        uef(this.lw, (com.bytedance.sdk.openadsdk.core.yo.yo) null);
        uef(this.ivm, (com.bytedance.sdk.openadsdk.core.yo.yo) null);
    }

    public void uef(List<View> list, com.bytedance.sdk.openadsdk.core.yo.yo yoVar) {
        if (com.bytedance.sdk.component.utils.cq.oa(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(yoVar);
                    view.setOnTouchListener(yoVar);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
        if (message.what == 1 && this.uef) {
            if (ivm() && km.uef(this.moa, 20, this.bcc, this.wrv)) {
                lw();
                this.cq = true;
                wk.yo().post(this.dz);
                uef(true);
                return;
            }
            this.cz.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private void uef(final boolean z2) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.cz.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bcc.2
            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver viewTreeObserver2;
                if (bcc.this.dj != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(bcc.this.dj);
                    } catch (Exception unused) {
                    }
                }
                if (z2) {
                    bcc.this.dj = null;
                }
            }
        });
    }
}
