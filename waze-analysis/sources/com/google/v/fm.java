package com.google.v;

import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class fm implements ft {

    /* renamed from: a, reason: collision with root package name */
    private final fi f12969a;

    /* renamed from: b, reason: collision with root package name */
    private final ge f12970b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12971c;

    private fm(ge geVar, fi fiVar) {
        this.f12970b = geVar;
        this.f12971c = fiVar instanceof dq;
        this.f12969a = fiVar;
    }

    static fm c(ge geVar, dc dcVar, fi fiVar) {
        return new fm(geVar, fiVar);
    }

    @Override // com.google.v.ft
    public final int a(Object obj) {
        int iB = ge.d(obj).b();
        return this.f12971c ? iB + dc.b(obj).d() : iB;
    }

    @Override // com.google.v.ft
    public final int b(Object obj) {
        int iHashCode = ge.d(obj).hashCode();
        return this.f12971c ? (iHashCode * 53) + dc.b(obj).hashCode() : iHashCode;
    }

    @Override // com.google.v.ft
    public final Object e() {
        fi fiVar = this.f12969a;
        return fiVar instanceof du ? ((du) fiVar).newMutableInstance() : fiVar.newBuilderForType().buildPartial();
    }

    @Override // com.google.v.ft
    public final void f(Object obj) {
        ge.g(obj);
        dc.f(obj);
    }

    @Override // com.google.v.ft
    public final void g(Object obj, Object obj2) {
        fu.L(obj, obj2);
        if (this.f12971c) {
            fu.K(obj, obj2);
        }
    }

    @Override // com.google.v.ft
    public final void h(Object obj, aa aaVar, de deVar) {
        ge geVar = this.f12970b;
        gf gfVarF = ge.f(obj);
        dh dhVarC = dc.c(obj);
        while (aaVar.c() != Integer.MAX_VALUE) {
            try {
                int iD = aaVar.d();
                boolean zR = true;
                if (iD == go.f13032a) {
                    ds dsVarD = null;
                    v vVarP = null;
                    int iJ = 0;
                    while (aaVar.c() != Integer.MAX_VALUE) {
                        int iD2 = aaVar.d();
                        if (iD2 == go.f13034c) {
                            iJ = aaVar.j();
                            dsVarD = deVar.d(this.f12969a, iJ);
                        } else if (iD2 == go.f13035d) {
                            if (dsVarD != null) {
                                dc.d(aaVar, dsVarD, deVar, dhVarC);
                            } else {
                                vVarP = aaVar.p();
                            }
                        } else if (iD2 == go.f13033b || !aaVar.R()) {
                            break;
                        }
                    }
                    if (aaVar.d() != go.f13033b) {
                        throw new eu("Protocol message end-group tag did not match expected tag.");
                    }
                    if (vVarP != null) {
                        if (dsVarD != null) {
                            ds dsVar = dsVarD;
                            fh fhVarNewBuilderForType = dsVarD.f12877c.newBuilderForType();
                            z zVarF = vVarP.f();
                            fhVarNewBuilderForType.mergeFrom(zVarF, deVar);
                            dhVarC.n(dsVarD.f12878d, fhVarNewBuilderForType.buildPartial());
                            zVarF.E(0);
                        } else {
                            ge.b(gfVarF, iJ, vVarP);
                        }
                    }
                } else if (go.b(iD) == 2) {
                    ds dsVarD2 = deVar.d(this.f12969a, go.a(iD));
                    if (dsVarD2 != null) {
                        dc.d(aaVar, dsVarD2, deVar, dhVarC);
                    } else {
                        zR = geVar.a(gfVarF, aaVar, 0);
                    }
                } else {
                    zR = aaVar.R();
                }
                if (!zR) {
                    break;
                }
            } finally {
                ge.e(obj, gfVarF);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca A[EDGE_INSN: B:61:0x00ca->B:33:0x00ca BREAK  A[LOOP:1: B:17:0x006d->B:64:0x006d], SYNTHETIC] */
    @Override // com.google.v.ft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.v.k r15) throws com.google.v.eu {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.v.fm.i(java.lang.Object, byte[], int, int, com.google.v.k):void");
    }

    @Override // com.google.v.ft
    public final void j(Object obj, af afVar) {
        Iterator itJ = dc.b(obj).j();
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            dg dgVar = (dg) entry.getKey();
            if (dgVar.c() != gn.f13030i || dgVar.g() || dgVar.f()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof eq) {
                afVar.x(dgVar.a(), ((eq) entry).a().b());
            } else {
                afVar.x(dgVar.a(), entry.getValue());
            }
        }
        ge.d(obj).j(afVar);
    }

    @Override // com.google.v.ft
    public final boolean k(Object obj, Object obj2) {
        if (!ge.d(obj).equals(ge.d(obj2))) {
            return false;
        }
        if (this.f12971c) {
            return dc.b(obj).equals(dc.b(obj2));
        }
        return true;
    }

    @Override // com.google.v.ft
    public final boolean l(Object obj) {
        return dc.b(obj).r();
    }
}
