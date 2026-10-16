package com.bytedance.adsdk.oa.uef.oa;

import Va.M6;
import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class uef<K, A> {
    private final yo<K> lw;
    protected com.bytedance.adsdk.oa.xs.oa<A> yo;
    final List<InterfaceC0035uef> uef = new ArrayList(1);
    private boolean moa = false;

    /* renamed from: oa, reason: collision with root package name */
    protected float f24578oa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private A ivm = null;
    private float xs = -1.0f;
    private float bcc = -1.0f;

    public static final class lw<T> implements yo<T> {

        /* renamed from: oa, reason: collision with root package name */
        private float f24579oa = -1.0f;
        private final com.bytedance.adsdk.oa.xs.uef<T> uef;

        public lw(List<? extends com.bytedance.adsdk.oa.xs.uef<T>> list) {
            this.uef = list.get(0);
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public float moa() {
            return this.uef.moa();
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public com.bytedance.adsdk.oa.xs.uef<T> oa() {
            return this.uef;
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public boolean uef() {
            return false;
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public float yo() {
            return this.uef.yo();
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public boolean oa(float f10) {
            if (this.f24579oa == f10) {
                return true;
            }
            this.f24579oa = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public boolean uef(float f10) {
            return !this.uef.lw();
        }
    }

    public static final class moa<T> implements yo<T> {
        private final List<? extends com.bytedance.adsdk.oa.xs.uef<T>> uef;
        private com.bytedance.adsdk.oa.xs.uef<T> yo = null;
        private float moa = -1.0f;

        /* renamed from: oa, reason: collision with root package name */
        private com.bytedance.adsdk.oa.xs.uef<T> f24580oa = yo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

        public moa(List<? extends com.bytedance.adsdk.oa.xs.uef<T>> list) {
            this.uef = list;
        }

        private com.bytedance.adsdk.oa.xs.uef<T> yo(float f10) {
            com.bytedance.adsdk.oa.xs.uef<T> uefVar = (com.bytedance.adsdk.oa.xs.uef) M6.k(1, this.uef);
            if (f10 >= uefVar.yo()) {
                return uefVar;
            }
            for (int size = this.uef.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.oa.xs.uef<T> uefVar2 = this.uef.get(size);
                if (this.f24580oa != uefVar2 && uefVar2.uef(f10)) {
                    return uefVar2;
                }
            }
            return this.uef.get(0);
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public float moa() {
            return ((com.bytedance.adsdk.oa.xs.uef) M6.k(1, this.uef)).moa();
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public com.bytedance.adsdk.oa.xs.uef<T> oa() {
            return this.f24580oa;
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public boolean uef() {
            return false;
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public boolean oa(float f10) {
            com.bytedance.adsdk.oa.xs.uef<T> uefVar = this.yo;
            com.bytedance.adsdk.oa.xs.uef<T> uefVar2 = this.f24580oa;
            if (uefVar == uefVar2 && this.moa == f10) {
                return true;
            }
            this.yo = uefVar2;
            this.moa = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public boolean uef(float f10) {
            if (this.f24580oa.uef(f10)) {
                return !this.f24580oa.lw();
            }
            this.f24580oa = yo(f10);
            return true;
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public float yo() {
            return this.uef.get(0).yo();
        }
    }

    public static final class oa<T> implements yo<T> {
        private oa() {
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public float moa() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public com.bytedance.adsdk.oa.xs.uef<T> oa() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public boolean uef() {
            return true;
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public float yo() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public boolean oa(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.oa.uef.oa.uef.yo
        public boolean uef(float f10) {
            return false;
        }
    }

    /* renamed from: com.bytedance.adsdk.oa.uef.oa.uef$uef, reason: collision with other inner class name */
    public interface InterfaceC0035uef {
        void uef();
    }

    public interface yo<T> {
        float moa();

        com.bytedance.adsdk.oa.xs.uef<T> oa();

        boolean oa(float f10);

        boolean uef();

        boolean uef(float f10);

        float yo();
    }

    public uef(List<? extends com.bytedance.adsdk.oa.xs.uef<K>> list) {
        this.lw = uef(list);
    }

    private float cz() {
        if (this.xs == -1.0f) {
            this.xs = this.lw.yo();
        }
        return this.xs;
    }

    public float bcc() {
        return this.f24578oa;
    }

    public float ivm() {
        if (this.bcc == -1.0f) {
            this.bcc = this.lw.moa();
        }
        return this.bcc;
    }

    public float lw() {
        com.bytedance.adsdk.oa.xs.uef<K> uefVarYo = yo();
        return (uefVarYo == null || uefVarYo.lw()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : uefVarYo.yo.getInterpolation(moa());
    }

    public float moa() {
        if (this.moa) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        com.bytedance.adsdk.oa.xs.uef<K> uefVarYo = yo();
        return uefVarYo.lw() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (this.f24578oa - uefVarYo.yo()) / (uefVarYo.moa() - uefVarYo.yo());
    }

    public void oa() {
        for (int i5 = 0; i5 < this.uef.size(); i5++) {
            this.uef.get(i5).uef();
        }
    }

    public abstract A uef(com.bytedance.adsdk.oa.xs.uef<K> uefVar, float f10);

    public void uef() {
        this.moa = true;
    }

    public A xs() {
        float fMoa = moa();
        if (this.yo == null && this.lw.oa(fMoa)) {
            return this.ivm;
        }
        com.bytedance.adsdk.oa.xs.uef<K> uefVarYo = yo();
        Interpolator interpolator = uefVarYo.moa;
        A aUef = (interpolator == null || uefVarYo.lw == null) ? uef(uefVarYo, lw()) : uef(uefVarYo, fMoa, interpolator.getInterpolation(fMoa), uefVarYo.lw.getInterpolation(fMoa));
        this.ivm = aUef;
        return aUef;
    }

    public com.bytedance.adsdk.oa.xs.uef<K> yo() {
        com.bytedance.adsdk.oa.lw.uef("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.oa.xs.uef<K> uefVarOa = this.lw.oa();
        com.bytedance.adsdk.oa.lw.oa("BaseKeyframeAnimation#getCurrentKeyframe");
        return uefVarOa;
    }

    public void uef(InterfaceC0035uef interfaceC0035uef) {
        this.uef.add(interfaceC0035uef);
    }

    public void uef(float f10) {
        if (this.lw.uef()) {
            return;
        }
        if (f10 < cz()) {
            f10 = cz();
        } else if (f10 > ivm()) {
            f10 = ivm();
        }
        if (f10 == this.f24578oa) {
            return;
        }
        this.f24578oa = f10;
        if (this.lw.uef(f10)) {
            oa();
        }
    }

    public A uef(com.bytedance.adsdk.oa.xs.uef<K> uefVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> yo<T> uef(List<? extends com.bytedance.adsdk.oa.xs.uef<T>> list) {
        if (list.isEmpty()) {
            return new oa();
        }
        if (list.size() == 1) {
            return new lw(list);
        }
        return new moa(list);
    }
}
