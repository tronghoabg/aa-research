package com.google.e.a.a;

import com.google.e.a.h.bm;
import com.google.v.de;
import com.google.v.eu;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements com.google.e.a.e.ae {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f8270a;

    public /* synthetic */ e(int i2) {
        this.f8270a = i2;
    }

    @Override // com.google.e.a.e.ae
    public final Object a(com.google.d.m.a.a.b bVar) throws GeneralSecurityException {
        switch (this.f8270a) {
            case 0:
                return com.google.e.a.j.s.c((d) bVar);
            case 1:
                return com.google.e.a.j.k.d((com.google.e.a.e.i) bVar);
            case 2:
                return com.google.e.a.j.g.c((k) bVar);
            case 3:
                return com.google.e.a.j.k.c((p) bVar);
            case 4:
                int i2 = com.google.e.a.a.b.b.f8245a;
                return com.google.e.a.a.a.f.d((v) bVar);
            case 5:
                aa aaVar = (aa) bVar;
                int i3 = ab.f8161a;
                return com.google.e.a.a.a.h.f() ? com.google.e.a.a.a.h.c(aaVar) : com.google.e.a.j.r.c(aaVar);
            case 6:
                ah ahVar = (ah) bVar;
                int i4 = ae.f8170a;
                return com.google.e.a.j.k.e(com.google.e.a.p.a(ahVar.h().h()).a(ahVar.h().h()), ahVar.f());
            case 7:
                al alVar = (al) bVar;
                int i5 = ag.f8180a;
                String strG = alVar.h().g();
                com.google.d.m.a.a.b bVarH = alVar.h().h();
                com.google.e.a.a aVarA = com.google.e.a.p.a(strG).a(strG);
                int i6 = af.f8174a;
                try {
                    return com.google.e.a.j.k.e(new af(bm.parseFrom(com.google.e.a.e.f(bVarH), de.a()), aVarA), alVar.f());
                } catch (eu e2) {
                    throw new GeneralSecurityException(e2);
                }
            case 8:
                return com.google.e.a.a.a.t.c((ax) bVar);
            case 9:
                bb bbVar = (bb) bVar;
                int i7 = bc.f8253a;
                return com.google.e.a.a.a.h.f() ? com.google.e.a.a.a.v.c(bbVar) : com.google.e.a.j.ak.c(bbVar);
            case 10:
                return com.google.e.a.c.d.a((com.google.e.a.c.b) bVar);
            case 11:
                return com.google.e.a.c.a.b.c((com.google.e.a.e.i) bVar);
            case 12:
                return com.google.e.a.f.b.c((com.google.e.a.f.a) bVar);
            case 13:
                return com.google.e.a.f.b.a((com.google.e.a.f.a) bVar);
            case 14:
                return new com.google.e.a.f.a.b((byte[]) null);
            case 15:
                return com.google.e.a.j.ae.c((com.google.e.a.f.h) bVar);
            case 16:
                return com.google.e.a.f.a.d.b((com.google.e.a.e.i) bVar);
            case 17:
                return com.google.e.a.j.c.i((com.google.e.a.i.a) bVar);
            case 18:
                return com.google.e.a.j.j.d((com.google.e.a.i.f) bVar);
            default:
                com.waze.car_lib.r.ai aiVarG = ((com.google.e.a.e.i) bVar).g();
                return (com.google.e.a.z) com.google.e.a.e.c.a().c(aiVarG.h(), com.google.e.a.z.class).a(aiVarG.f());
        }
    }
}
