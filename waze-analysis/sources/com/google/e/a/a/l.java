package com.google.e.a.a;

import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements com.google.e.a.e.b {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f8303a;

    public /* synthetic */ l(int i2) {
        this.f8303a = i2;
    }

    @Override // com.google.e.a.e.b
    public final com.google.d.m.a.a.b a(com.google.d.m.a.a.b bVar, Integer num) throws GeneralSecurityException {
        switch (this.f8303a) {
            case 0:
                o oVar = (o) bVar;
                int i2 = m.f8304a;
                if (oVar.g() == 24) {
                    throw new GeneralSecurityException("192 bit AES EAX Parameters are not valid");
                }
                u uVar = new u();
                uVar.j(oVar);
                uVar.i(num);
                uVar.l(com.google.android.libraries.phenotype.client.stable.p.f(oVar.g()));
                return uVar.h();
            case 1:
                j jVar = (j) bVar;
                int i3 = f.f8271a;
                if (jVar.f() != 16 && jVar.f() != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                am amVar = new am(null, null);
                amVar.q(jVar);
                amVar.p(num);
                amVar.r(com.google.android.libraries.phenotype.client.stable.p.f(jVar.f()));
                amVar.s(com.google.android.libraries.phenotype.client.stable.p.f(jVar.g()));
                return amVar.o();
            case 2:
                t tVar = (t) bVar;
                int i4 = r.f8320a;
                if (tVar.f() == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                u uVar2 = new u();
                uVar2.g(tVar);
                uVar2.f(num);
                uVar2.k(com.google.android.libraries.phenotype.client.stable.p.f(tVar.f()));
                return uVar2.e();
            case 3:
                z zVar = (z) bVar;
                int i5 = w.f8341a;
                u uVar3 = new u();
                uVar3.c(zVar);
                uVar3.b(num);
                uVar3.d(com.google.android.libraries.phenotype.client.stable.p.f(zVar.f()));
                return uVar3.a();
            case 4:
                int i6 = ab.f8161a;
                return aa.h(((ad) bVar).f(), com.google.android.libraries.phenotype.client.stable.p.f(32), num);
            case 5:
                int i7 = ae.f8170a;
                return ah.g((aj) bVar, num);
            case 6:
                int i8 = ag.f8180a;
                return al.g((ap) bVar, num);
            case 7:
                return ax.h((ba) bVar, com.google.android.libraries.phenotype.client.stable.p.f(32), num);
            case 8:
                int i9 = bc.f8253a;
                return bb.h(((be) bVar).f(), com.google.android.libraries.phenotype.client.stable.p.f(32), num);
            case 9:
                return com.google.e.a.f.b.b((com.google.e.a.f.d) bVar, num);
            case 10:
                com.google.e.a.i.e eVar = (com.google.e.a.i.e) bVar;
                int i10 = com.google.e.a.i.b.f8603a;
                return com.google.e.a.i.a.g(eVar, com.google.android.libraries.phenotype.client.stable.p.f(eVar.i()));
            default:
                com.google.e.a.i.j jVar2 = (com.google.e.a.i.j) bVar;
                int i11 = com.google.e.a.i.g.f8625a;
                return com.google.e.a.i.f.g(jVar2, com.google.android.libraries.phenotype.client.stable.p.f(jVar2.h()));
        }
    }
}
