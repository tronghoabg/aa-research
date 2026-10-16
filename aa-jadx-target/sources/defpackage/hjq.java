package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class hjq {
    public static final defpackage.bvm a = new defpackage.bvv(defpackage.bxv.c, new gru(5));
    public static final defpackage.bvm b = new defpackage.bvv(defpackage.bxv.c, new defpackage.hjp());
    public static final defpackage.bvm c = new defpackage.bvv(defpackage.bxv.c, new gru(6));
    public static final defpackage.bvm d = new defpackage.bvv(defpackage.bxv.c, new gru(7));
    public static final defpackage.bvm e = new defpackage.bvv(defpackage.bxv.c, new gru(8));

    public static final void a(defpackage.hjc hjcVar, defpackage.bse bseVar, hjm hjmVar, hjf hjfVar, hjn hjnVar, hji hjiVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bse bseVar2;
        hjm hjmVar2;
        hjf hjfVar2;
        hjm hjmVar3;
        defpackage.bse bseVar3;
        hjf hjfVar3;
        affgVar.getClass();
        defpackage.bve bveVarC = bveVar.c(1189822187);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(hjcVar) : bveVarC.E(hjcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            i3 |= true != bveVarC.C(hjnVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != bveVarC.C(hjiVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != bveVarC.E(affgVar) ? 524288 : 1048576;
        }
        if (bveVarC.I((599187 & i3) != 599186, i3 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                defpackage.bse bseVarD = defpackage.gvt.d(0, bveVarC, 1);
                hjmVar3 = new hjm((byte[]) null);
                bseVar3 = bseVarD;
                hjfVar3 = hjf.a;
            } else {
                bveVarC.s();
                bseVar3 = bseVar;
                hjmVar3 = hjmVar;
                hjfVar3 = hjfVar;
            }
            bveVarC.l();
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.hjc(hjcVar.C(), hjcVar.o(), hjcVar.D(), hjcVar.p(), hjcVar.h(), hjcVar.G(), hjcVar.s(), hjcVar.H(), hjcVar.t(), hjcVar.R(), hjcVar.w(), hjcVar.S(), hjcVar.x(), hjcVar.a(), hjcVar.I(), hjcVar.P(), hjcVar.O(), hjcVar.u(), hjcVar.i(), hjcVar.g(), hjcVar.Q(), hjcVar.v(), hjcVar.J(), hjcVar.M(), hjcVar.N(), hjcVar.K(), hjcVar.L(), hjcVar.A(), hjcVar.B(), hjcVar.T(), hjcVar.U(), hjcVar.d(), hjcVar.l(), hjcVar.E(), hjcVar.q(), hjcVar.F(), hjcVar.r(), hjcVar.e(), hjcVar.m(), hjcVar.f(), hjcVar.n(), hjcVar.b(), hjcVar.j(), hjcVar.c(), hjcVar.k(), hjcVar.V(), hjcVar.y(), hjcVar.W(), hjcVar.z(), hjcVar.X());
                bwcVar.ad(objS);
            }
            defpackage.hjc hjcVar2 = (defpackage.hjc) objS;
            hjcVar2.b.b(new defpackage.ckd(hjcVar.C()));
            hjcVar2.c.b(new defpackage.ckd(hjcVar.o()));
            hjcVar2.d.b(new defpackage.ckd(hjcVar.D()));
            hjcVar2.e.b(new defpackage.ckd(hjcVar.p()));
            hjcVar2.f.b(new defpackage.ckd(hjcVar.h()));
            hjcVar2.g.b(new defpackage.ckd(hjcVar.G()));
            hjcVar2.h.b(new defpackage.ckd(hjcVar.s()));
            hjcVar2.i.b(new defpackage.ckd(hjcVar.H()));
            hjcVar2.j.b(new defpackage.ckd(hjcVar.t()));
            hjcVar2.k.b(new defpackage.ckd(hjcVar.R()));
            hjcVar2.l.b(new defpackage.ckd(hjcVar.w()));
            hjcVar2.m.b(new defpackage.ckd(hjcVar.S()));
            hjcVar2.n.b(new defpackage.ckd(hjcVar.x()));
            hjcVar2.o.b(new defpackage.ckd(hjcVar.a()));
            hjcVar2.p.b(new defpackage.ckd(hjcVar.I()));
            hjcVar2.q.b(new defpackage.ckd(hjcVar.P()));
            hjcVar2.r.b(new defpackage.ckd(hjcVar.O()));
            hjcVar2.s.b(new defpackage.ckd(hjcVar.u()));
            hjcVar2.t.b(new defpackage.ckd(hjcVar.i()));
            hjcVar2.u.b(new defpackage.ckd(hjcVar.g()));
            hjcVar2.v.b(new defpackage.ckd(hjcVar.Q()));
            hjcVar2.w.b(new defpackage.ckd(hjcVar.v()));
            hjcVar2.x.b(new defpackage.ckd(hjcVar.J()));
            hjcVar2.y.b(new defpackage.ckd(hjcVar.M()));
            hjcVar2.z.b(new defpackage.ckd(hjcVar.N()));
            hjcVar2.A.b(new defpackage.ckd(hjcVar.K()));
            hjcVar2.B.b(new defpackage.ckd(hjcVar.L()));
            hjcVar2.C.b(new defpackage.ckd(hjcVar.A()));
            hjcVar2.D.b(new defpackage.ckd(hjcVar.B()));
            hjcVar2.E.b(new defpackage.ckd(hjcVar.T()));
            hjcVar2.F.b(new defpackage.ckd(hjcVar.U()));
            hjcVar2.G.b(new defpackage.ckd(hjcVar.d()));
            hjcVar2.H.b(new defpackage.ckd(hjcVar.l()));
            hjcVar2.I.b(new defpackage.ckd(hjcVar.E()));
            hjcVar2.J.b(new defpackage.ckd(hjcVar.q()));
            hjcVar2.K.b(new defpackage.ckd(hjcVar.F()));
            hjcVar2.L.b(new defpackage.ckd(hjcVar.r()));
            hjcVar2.M.b(new defpackage.ckd(hjcVar.e()));
            hjcVar2.N.b(new defpackage.ckd(hjcVar.m()));
            hjcVar2.O.b(new defpackage.ckd(hjcVar.f()));
            hjcVar2.P.b(new defpackage.ckd(hjcVar.n()));
            hjcVar2.Q.b(new defpackage.ckd(hjcVar.b()));
            hjcVar2.R.b(new defpackage.ckd(hjcVar.j()));
            hjcVar2.S.b(new defpackage.ckd(hjcVar.c()));
            hjcVar2.T.b(new defpackage.ckd(hjcVar.k()));
            hjcVar2.U.b(new defpackage.ckd(hjcVar.V()));
            hjcVar2.V.b(new defpackage.ckd(hjcVar.y()));
            hjcVar2.W.b(new defpackage.ckd(hjcVar.W()));
            hjcVar2.X.b(new defpackage.ckd(hjcVar.z()));
            defpackage.bnk bnkVar = new defpackage.bnk(hjcVar.C(), hjcVar.o(), hjcVar.D(), hjcVar.p(), hjcVar.h(), hjcVar.G(), hjcVar.s(), hjcVar.H(), hjcVar.t(), hjcVar.R(), hjcVar.w(), hjcVar.S(), hjcVar.x(), hjcVar.a(), hjcVar.u(), hjcVar.I(), hjcVar.u(), hjcVar.Q(), hjcVar.v(), hjcVar.C(), hjcVar.i(), hjcVar.g(), hjcVar.E(), hjcVar.q(), hjcVar.F(), hjcVar.r(), hjcVar.A(), hjcVar.B(), hjcVar.O(), hjcVar.P(), hjcVar.O(), hjcVar.J(), hjcVar.K(), hjcVar.L(), hjcVar.M(), hjcVar.N());
            hjmVar3.getClass();
            hjl hjlVar = hjmVar3.a;
            hjm hjmVar4 = hjmVar3;
            defpackage.bom.a(bnkVar, new defpackage.bpz(hjlVar.b, hjlVar.c, hjlVar.d, hjlVar.e, hjlVar.f), bseVar3, defpackage.dai.as(116933271, true, new hjo(hjcVar2, hjmVar4, hjfVar3, hjnVar, hjiVar, affgVar, 0), bveVarC), bveVarC, 3072, 0);
            bseVar2 = bseVar3;
            hjmVar2 = hjmVar4;
            hjfVar2 = hjfVar3;
        } else {
            bveVarC.s();
            bseVar2 = bseVar;
            hjmVar2 = hjmVar;
            hjfVar2 = hjfVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new hfz(hjcVar, bseVar2, hjmVar2, hjfVar2, hjnVar, hjiVar, affgVar, i, 3);
        }
    }
}
