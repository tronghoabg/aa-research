package com.bytedance.sdk.openadsdk.gsd.oa;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.gsd.oa.lw;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public abstract class oa {
    private final Integer bcc;
    private volatile boolean cz = false;
    private final lw.uef ivm;
    private final AtomicBoolean lw;
    private final AtomicLong moa;

    /* renamed from: oa, reason: collision with root package name */
    protected gzw f25912oa;
    protected WeakReference<View> uef;
    private final int xs;
    protected final AtomicBoolean yo;

    public oa(Integer num, View view, gzw gzwVar, int i5, lw.uef uefVar) {
        this.bcc = num;
        this.xs = i5;
        this.f25912oa = gzwVar;
        this.ivm = uefVar;
        uef(view);
        this.yo = new AtomicBoolean(false);
        this.moa = new AtomicLong(-1L);
        this.lw = new AtomicBoolean(false);
    }

    public static oa uef(boolean z2, Integer num, View view, gzw gzwVar, lw.uef uefVar) {
        return z2 ? new bcc(num, view, gzwVar, uefVar) : new yo(num, view, gzwVar, uefVar);
    }

    public void bcc() {
        this.moa.set(-1L);
    }

    public void cq() {
        this.yo.set(false);
        bcc();
    }

    public boolean cz() {
        return this.lw.get();
    }

    public Integer dj() {
        return this.bcc;
    }

    public abstract int ivm();

    public uef lw() {
        WeakReference<View> weakReference = this.uef;
        if (weakReference == null) {
            return new uef(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        return view == null ? new uef(0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : new uef(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public void moa() {
        if (this.lw.compareAndSet(false, true)) {
            moa.uef(this.f25912oa, lw(), this.ivm);
        }
    }

    public int oa() {
        if (cz()) {
            return 1;
        }
        WeakReference<View> weakReference = this.uef;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.cz) {
            return 3;
        }
        if (dj().equals(view.getTag(33554433))) {
            return (dj().equals(view.getTag(33554433)) && yo()) ? 1 : 2;
        }
        zjm();
        lw.oa(dj());
        return 3;
    }

    public abstract void oa(int i5);

    public boolean wrv() {
        return this.yo.get();
    }

    public void xs() {
        if (cz()) {
            return;
        }
        if (!this.yo.get()) {
            bcc();
        } else if (!this.moa.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.moa.get() >= this.xs) {
            moa();
        }
    }

    public abstract boolean yo();

    public void zjm() {
        this.cz = true;
        xs.oa(this);
    }

    public void uef() {
        if (this.yo.compareAndSet(false, true)) {
            xs.uef(this);
        }
    }

    public void uef(int i5) {
        if (i5 == 4) {
            uef();
            return;
        }
        if (i5 == 8) {
            cq();
        } else if (i5 == 9) {
            moa();
        } else {
            oa(i5);
        }
    }

    public void uef(View view) {
        if (view != null) {
            view.setTag(33554433, dj());
        }
        this.uef = new WeakReference<>(view);
    }
}
