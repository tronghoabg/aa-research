package B;

import A.AbstractC0213f;
import A7.B0;
import U8.v0;
import Va.M6;
import ad.C1355I;
import ba.C1521a;
import c7.C1576l;
import com.unity3d.services.UnityAdsConstants;
import d0.AbstractC2382a;
import e0.AbstractC2461m;
import e0.C2454f;
import e0.C2465q;
import e0.InterfaceC2442E;
import e0.InterfaceC2463o;
import ef.C2539w;
import g0.C2661b;
import kotlin.jvm.internal.AbstractC3340k;
import u0.C4186m;

/* renamed from: B.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310a extends B0 implements b0.e {

    /* renamed from: b, reason: collision with root package name */
    public final C2465q f1408b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC2461m f1409c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1410d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2442E f1411e;

    /* renamed from: f, reason: collision with root package name */
    public d0.f f1412f;

    /* renamed from: g, reason: collision with root package name */
    public e0.z f1413g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0310a(C2465q c2465q, e0.u uVar, InterfaceC2442E interfaceC2442E, int i5) {
        C4186m c4186m = C4186m.f46256l;
        c2465q = (i5 & 1) != 0 ? null : c2465q;
        uVar = (i5 & 2) != 0 ? null : uVar;
        super((tf.l) c4186m);
        this.f1408b = c2465q;
        this.f1409c = uVar;
        this.f1410d = 1.0f;
        this.f1411e = interfaceC2442E;
    }

    @Override // b0.e
    public final void e(t0.v vVar) {
        e0.z zVarB;
        C1355I c1355i = e0.z.f34394a;
        AbstractC2461m abstractC2461m = this.f1409c;
        C2465q c2465q = this.f1408b;
        InterfaceC2442E interfaceC2442E = this.f1411e;
        if (interfaceC2442E == c1355i) {
            if (c2465q != null) {
                com.google.android.gms.internal.consent_sdk.a.g(vVar, c2465q.f34382a, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 126);
            }
            if (abstractC2461m != null) {
                com.google.android.gms.internal.consent_sdk.a.f(vVar, abstractC2461m, 0L, 0L, this.f1410d, null, 118);
            }
        } else {
            C2661b c2661b = vVar.f45543a;
            long jY = c2661b.f35484b.y();
            d0.f fVar = this.f1412f;
            int i5 = d0.f.f33951d;
            boolean z2 = fVar instanceof d0.f;
            C1521a c1521a = c2661b.f35484b;
            if (z2 && jY == fVar.f33952a && vVar.getLayoutDirection() == null) {
                zVarB = this.f1413g;
                AbstractC3340k.b(zVarB);
            } else {
                zVarB = interfaceC2442E.b(c1521a.y(), vVar.getLayoutDirection(), vVar);
            }
            e0.z zVar = zVarB;
            g0.f fVar2 = g0.f.f35488b;
            if (c2465q != null) {
                boolean z10 = zVar instanceof e0.v;
                long j8 = c2465q.f34382a;
                if (z10) {
                    d0.d dVar = ((e0.v) zVar).f34390e;
                    vVar.f45543a.k(j8, v0.f(dVar.f33937a, dVar.f33938b), com.moloco.sdk.internal.publisher.H.I(dVar.c(), dVar.b()), 1.0f, fVar2, null, 3);
                } else {
                    if (!(zVar instanceof e0.w)) {
                        throw new E5.Q((byte) 0, 9);
                    }
                    e0.w wVar = (e0.w) zVar;
                    C2454f c2454f = wVar.f34392f;
                    if (c2454f != null) {
                        c2661b.getClass();
                        InterfaceC2463o interfaceC2463o = c2661b.f35483a.f35481c;
                        C1576l c1576lA = C2661b.a(c2661b, j8, fVar2, 1.0f, null, 3);
                        fVar2 = fVar2;
                        interfaceC2463o.c(c2454f, c1576lA);
                    } else {
                        d0.e eVar = wVar.f34391e;
                        float fB = AbstractC2382a.b(eVar.f33948h);
                        vVar.z(j8, v0.f(eVar.f33941a, eVar.f33942b), com.moloco.sdk.internal.publisher.H.I(eVar.b(), eVar.a()), Fe.g.a(fB, fB), fVar2);
                    }
                }
            }
            if (abstractC2461m != null) {
                boolean z11 = zVar instanceof e0.v;
                float f10 = this.f1410d;
                if (z11) {
                    d0.d dVar2 = ((e0.v) zVar).f34390e;
                    vVar.e(abstractC2461m, v0.f(dVar2.f33937a, dVar2.f33938b), com.moloco.sdk.internal.publisher.H.I(dVar2.c(), dVar2.b()), f10, fVar2);
                } else {
                    if (!(zVar instanceof e0.w)) {
                        throw new E5.Q((byte) 0, 9);
                    }
                    e0.w wVar2 = (e0.w) zVar;
                    C2454f c2454f2 = wVar2.f34392f;
                    if (c2454f2 != null) {
                        vVar.i(c2454f2, abstractC2461m, f10, fVar2);
                    } else {
                        d0.e eVar2 = wVar2.f34391e;
                        float fB2 = AbstractC2382a.b(eVar2.f33948h);
                        vVar.g(abstractC2461m, v0.f(eVar2.f33941a, eVar2.f33942b), com.moloco.sdk.internal.publisher.H.I(eVar2.b(), eVar2.a()), Fe.g.a(fB2, fB2), f10, fVar2);
                    }
                }
            }
            this.f1413g = zVar;
            this.f1412f = new d0.f(c1521a.y());
        }
        vVar.a();
    }

    public final boolean equals(Object obj) {
        C0310a c0310a = obj instanceof C0310a ? (C0310a) obj : null;
        return c0310a != null && AbstractC3340k.a(this.f1408b, c0310a.f1408b) && AbstractC3340k.a(this.f1409c, c0310a.f1409c) && this.f1410d == c0310a.f1410d && AbstractC3340k.a(this.f1411e, c0310a.f1411e);
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
        C2465q c2465q = this.f1408b;
        int iA = (c2465q != null ? C2539w.a(c2465q.f34382a) : 0) * 31;
        AbstractC2461m abstractC2461m = this.f1409c;
        return this.f1411e.hashCode() + AbstractC0213f.c(this.f1410d, (iA + (abstractC2461m != null ? abstractC2461m.hashCode() : 0)) * 31, 31);
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    public final String toString() {
        return "Background(color=" + this.f1408b + ", brush=" + this.f1409c + ", alpha = " + this.f1410d + ", shape=" + this.f1411e + ')';
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }
}
