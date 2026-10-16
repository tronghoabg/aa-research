package X1;

import N1.C0765n;
import N1.D;
import N1.InterfaceC0758g;
import Q1.o;
import Q1.x;
import android.os.Handler;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import f6.S;
import k2.c0;
import s2.B;
import s2.C;

/* loaded from: classes.dex */
public final class l implements C {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f16012a;

    /* renamed from: b, reason: collision with root package name */
    public final S3.c f16013b = new S3.c(25, false);

    /* renamed from: c, reason: collision with root package name */
    public final B2.a f16014c = new B2.a(1);

    /* renamed from: d, reason: collision with root package name */
    public long f16015d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f16016e;

    public l(m mVar, o2.e eVar) {
        this.f16016e = mVar;
        this.f16012a = new c0(eVar, null, null);
    }

    @Override // s2.C
    public final void a(long j8, int i5, int i10, int i11, B b5) {
        long jH;
        long jN;
        this.f16012a.a(j8, i5, i10, i11, b5);
        while (this.f16012a.v(false)) {
            B2.a aVar = this.f16014c;
            aVar.o();
            if (this.f16012a.A(this.f16013b, aVar, 0, false) == -4) {
                aVar.s();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j10 = aVar.f11360g;
                N1.B bO = this.f16016e.f16019c.o(aVar);
                if (bO != null) {
                    D2.a aVar2 = (D2.a) bO.f8023a[0];
                    String str = aVar2.f2281a;
                    String str2 = aVar2.f2282b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(str2) || CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(str2) || "3".equals(str2))) {
                        try {
                            jN = x.N(x.n(aVar2.f2285e));
                        } catch (D unused) {
                            jN = -9223372036854775807L;
                        }
                        if (jN != -9223372036854775807L) {
                            k kVar = new k(j10, jN);
                            Handler handler = this.f16016e.f16020d;
                            handler.sendMessage(handler.obtainMessage(1, kVar));
                        }
                    }
                }
            }
        }
        c0 c0Var = this.f16012a;
        S s10 = c0Var.f39033a;
        synchronized (c0Var) {
            int i12 = c0Var.f39050s;
            jH = i12 == 0 ? -1L : c0Var.h(i12);
        }
        s10.b(jH);
    }

    @Override // s2.C
    public final int b(InterfaceC0758g interfaceC0758g, int i5, boolean z2) {
        c0 c0Var = this.f16012a;
        c0Var.getClass();
        return c0Var.b(interfaceC0758g, i5, z2);
    }

    @Override // s2.C
    public final void c(C0765n c0765n) {
        this.f16012a.c(c0765n);
    }

    @Override // s2.C
    public final int d(InterfaceC0758g interfaceC0758g, int i5, boolean z2) {
        return b(interfaceC0758g, i5, z2);
    }

    @Override // s2.C
    public final void e(int i5, o oVar) {
        f(oVar, i5, 0);
    }

    @Override // s2.C
    public final void f(o oVar, int i5, int i10) {
        c0 c0Var = this.f16012a;
        c0Var.getClass();
        c0Var.f(oVar, i5, 0);
    }
}
