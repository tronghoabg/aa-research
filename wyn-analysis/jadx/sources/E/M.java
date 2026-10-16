package E;

import A.AbstractC0213f;
import A7.B0;
import Va.M6;
import r0.InterfaceC3907l;
import u0.C4186m;

/* loaded from: classes.dex */
public final class M extends B0 implements InterfaceC3907l {

    /* renamed from: b, reason: collision with root package name */
    public final float f2702b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2703c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2704d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2705e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2706f;

    public /* synthetic */ M(float f10, float f11, float f12, float f13, int i5) {
        this((i5 & 1) != 0 ? Float.NaN : f10, (i5 & 2) != 0 ? Float.NaN : f11, (i5 & 4) != 0 ? Float.NaN : f12, (i5 & 8) != 0 ? Float.NaN : f13, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return L0.d.a(this.f2702b, m10.f2702b) && L0.d.a(this.f2703c, m10.f2703c) && L0.d.a(this.f2704d, m10.f2704d) && L0.d.a(this.f2705e, m10.f2705e) && this.f2706f == m10.f2706f;
    }

    @Override // Z.k
    public final /* synthetic */ Z.k g(Z.k kVar) {
        return M6.f(this, kVar);
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        return pVar.invoke(this, obj);
    }

    public final int hashCode() {
        return AbstractC0213f.c(this.f2705e, AbstractC0213f.c(this.f2704d, AbstractC0213f.c(this.f2703c, Float.floatToIntBits(this.f2702b) * 31, 31), 31), 31);
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // r0.InterfaceC3907l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final D0.b q(t0.C4070r r12, r0.InterfaceC3908m r13, long r14) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E.M.q(t0.r, r0.m, long):D0.b");
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }

    public M(float f10, float f11, float f12, float f13, boolean z2) {
        super((tf.l) C4186m.f46256l);
        this.f2702b = f10;
        this.f2703c = f11;
        this.f2704d = f12;
        this.f2705e = f13;
        this.f2706f = z2;
    }
}
