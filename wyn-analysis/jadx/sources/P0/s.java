package p0;

import Ef.C0502n;
import com.moloco.sdk.internal.publisher.H;
import com.unity3d.services.UnityAdsConstants;
import jf.C3109i;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import lf.AbstractC3462a;
import r0.InterfaceC3906k;
import t0.y;

/* loaded from: classes.dex */
public final class s implements L0.b, InterfaceC3103c {

    /* renamed from: a, reason: collision with root package name */
    public final C0502n f43173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f43174b;

    /* renamed from: c, reason: collision with root package name */
    public C0502n f43175c;

    /* renamed from: d, reason: collision with root package name */
    public g f43176d = g.f43137b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f43177e;

    public s(t tVar, C0502n c0502n) {
        this.f43177e = tVar;
        this.f43173a = c0502n;
        this.f43174b = tVar;
    }

    @Override // L0.b
    public final float b() {
        return this.f43174b.f43179d.b();
    }

    public final Object e(g gVar, AbstractC3462a abstractC3462a) {
        C0502n c0502n = new C0502n(1, A6.h.A(abstractC3462a));
        c0502n.t();
        this.f43176d = gVar;
        this.f43175c = c0502n;
        Object objS = c0502n.s();
        kf.a aVar = kf.a.f39711a;
        return objS;
    }

    @Override // jf.InterfaceC3103c
    public final InterfaceC3108h getContext() {
        return C3109i.f38759a;
    }

    @Override // L0.b
    public final float getFontScale() {
        return this.f43174b.f43179d.getFontScale();
    }

    public final long h() {
        t tVar = this.f43177e;
        long jY = tVar.f43179d.y(tVar.f43178c.a());
        InterfaceC3906k interfaceC3906k = tVar.f43163a;
        long j8 = interfaceC3906k != null ? ((y) interfaceC3906k).f44309c : 0L;
        return H.I(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d0.f.d(jY) - ((int) (j8 >> 32))) / 2.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d0.f.b(jY) - ((int) (j8 & 4294967295L))) / 2.0f);
    }

    @Override // L0.b
    public final int j(float f10) {
        return this.f43174b.f43179d.j(f10);
    }

    @Override // L0.b
    public final float l(long j8) {
        return this.f43174b.f43179d.l(j8);
    }

    @Override // jf.InterfaceC3103c
    public final void resumeWith(Object obj) {
        t tVar = this.f43177e;
        synchronized (tVar.f43181f) {
            tVar.f43181f.k(this);
        }
        this.f43173a.resumeWith(obj);
    }

    @Override // L0.b
    public final float t(float f10) {
        return this.f43174b.f43179d.t(f10);
    }

    @Override // L0.b
    public final long y(long j8) {
        return this.f43174b.f43179d.y(j8);
    }
}
