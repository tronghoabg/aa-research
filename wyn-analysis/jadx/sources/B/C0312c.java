package B;

import A.e0;
import U8.v0;
import a.AbstractC1304a;
import com.unity3d.services.UnityAdsConstants;
import d0.C2384c;
import e0.AbstractC2461m;
import e0.C2454f;
import e0.InterfaceC2442E;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import t0.C4048M;

/* renamed from: B.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312c extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f1415i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2442E f1416j;
    public final /* synthetic */ C4048M k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC2461m f1417l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0312c(float f10, InterfaceC2442E interfaceC2442E, C4048M c4048m, AbstractC2461m abstractC2461m) {
        super(1);
        this.f1415i = f10;
        this.f1416j = interfaceC2442E;
        this.k = c4048m;
        this.f1417l = abstractC2461m;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        C2454f c2454f;
        b0.b drawWithCache = (b0.b) obj;
        AbstractC3340k.e(drawWithCache, "$this$drawWithCache");
        float fB = drawWithCache.b();
        float f10 = this.f1415i;
        if (fB * f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || d0.f.c(drawWithCache.f19100a.c()) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            C0314e c0314e = C0314e.f1420i;
            e0 e0Var = new e0(28, false);
            e0Var.f152b = c0314e;
            drawWithCache.f19101b = e0Var;
            return e0Var;
        }
        float f11 = 2;
        float fMin = Math.min(L0.d.a(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 1.0f : (float) Math.ceil(drawWithCache.b() * f10), (float) Math.ceil(d0.f.c(drawWithCache.f19100a.c()) / f11));
        float f12 = fMin / f11;
        long jF = v0.f(f12, f12);
        long jI = com.moloco.sdk.internal.publisher.H.I(d0.f.d(drawWithCache.f19100a.c()) - fMin, d0.f.b(drawWithCache.f19100a.c()) - fMin);
        boolean z2 = f11 * fMin > d0.f.c(drawWithCache.f19100a.c());
        e0.z zVarB = this.f1416j.b(drawWithCache.f19100a.c(), drawWithCache.f19100a.getLayoutDirection(), drawWithCache);
        boolean z10 = zVarB instanceof e0.w;
        AbstractC2461m abstractC2461m = this.f1417l;
        if (!z10) {
            if (!(zVarB instanceof e0.v)) {
                throw new E5.Q((byte) 0, 9);
            }
            if (z2) {
                jF = C2384c.f33931b;
            }
            long j8 = jF;
            if (z2) {
                jI = drawWithCache.f19100a.c();
            }
            C0315f c0315f = new C0315f(abstractC2461m, j8, jI, z2 ? g0.f.f35488b : new g0.g(fMin, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 30));
            e0 e0Var2 = new e0(28, false);
            e0Var2.f152b = c0315f;
            drawWithCache.f19101b = e0Var2;
            return e0Var2;
        }
        d0.e eVar = ((e0.w) zVarB).f34391e;
        if (android.support.v4.media.session.b.l0(eVar)) {
            C0316g c0316g = new C0316g(z2, abstractC2461m, eVar.f33945e, f12, fMin, jF, jI, new g0.g(fMin, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 30));
            e0 e0Var3 = new e0(28, false);
            e0Var3.f152b = c0316g;
            drawWithCache.f19101b = e0Var3;
            return e0Var3;
        }
        C4048M c4048m = this.k;
        C0311b c0311b = (C0311b) c4048m.f45446a;
        if (c0311b == null) {
            c0311b = new C0311b();
            c0311b.f1414a = null;
            c4048m.f45446a = c0311b;
        }
        C2454f c2454fE = c0311b.f1414a;
        if (c2454fE == null) {
            c2454fE = e0.z.e();
            c0311b.f1414a = c2454fE;
        }
        c2454fE.c();
        c2454fE.a(eVar);
        if (z2) {
            c2454f = c2454fE;
        } else {
            C2454f c2454fE2 = e0.z.e();
            C2454f c2454f2 = c2454fE;
            c2454fE2.a(new d0.e(fMin, fMin, eVar.b() - fMin, eVar.a() - fMin, AbstractC1304a.K(eVar.f33945e, fMin), AbstractC1304a.K(eVar.f33946f, fMin), AbstractC1304a.K(eVar.f33947g, fMin), AbstractC1304a.K(eVar.f33948h, fMin)));
            c2454f2.b(c2454f2, c2454fE2, 0);
            c2454f = c2454f2;
        }
        A.W w2 = new A.W(3, c2454f, abstractC2461m);
        e0 e0Var4 = new e0(28, false);
        e0Var4.f152b = w2;
        drawWithCache.f19101b = e0Var4;
        return e0Var4;
    }
}
