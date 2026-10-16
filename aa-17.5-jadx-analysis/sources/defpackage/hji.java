package defpackage;

/* loaded from: classes.dex */
public final class hji {
    public static final bvf a;
    public static final bvf b;
    public static final bvf c;
    public static final bvf d;
    public static final bvf e;

    static {
        grl grlVar = new grl(5);
        bxp bxpVar = bxp.c;
        a = new bvo(bxpVar, grlVar);
        b = new bvo(bxpVar, new hjh());
        c = new bvo(bxpVar, new grl(6));
        d = new bvo(bxpVar, new grl(7));
        e = new bvo(bxpVar, new grl(8));
    }

    public static final void a(hiu hiuVar, bry bryVar, hje hjeVar, hix hixVar, hjf hjfVar, hja hjaVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        bry bryVar2;
        hje hjeVar2;
        hix hixVar2;
        hje hjeVar3;
        bry bryVar3;
        hix hixVar3;
        afegVar.getClass();
        bux buxVarC = buxVar.c(1189822187);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hiuVar) : buxVarC.E(hiuVar)) ? 2 : 4) | i;
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
            i3 |= true != buxVarC.C(hjfVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != buxVarC.C(hjaVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.E(afegVar) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i3) != 599186, i3 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                bry bryVarD = gvj.d(0, buxVarC, 1);
                hjeVar3 = new hje(null);
                bryVar3 = bryVarD;
                hixVar3 = hix.a;
            } else {
                buxVarC.s();
                bryVar3 = bryVar;
                hjeVar3 = hjeVar;
                hixVar3 = hixVar;
            }
            buxVarC.l();
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new hiu(hiuVar.C(), hiuVar.o(), hiuVar.D(), hiuVar.p(), hiuVar.h(), hiuVar.G(), hiuVar.s(), hiuVar.H(), hiuVar.t(), hiuVar.R(), hiuVar.w(), hiuVar.S(), hiuVar.x(), hiuVar.a(), hiuVar.I(), hiuVar.P(), hiuVar.O(), hiuVar.u(), hiuVar.i(), hiuVar.g(), hiuVar.Q(), hiuVar.v(), hiuVar.J(), hiuVar.M(), hiuVar.N(), hiuVar.K(), hiuVar.L(), hiuVar.A(), hiuVar.B(), hiuVar.T(), hiuVar.U(), hiuVar.d(), hiuVar.l(), hiuVar.E(), hiuVar.q(), hiuVar.F(), hiuVar.r(), hiuVar.e(), hiuVar.m(), hiuVar.f(), hiuVar.n(), hiuVar.b(), hiuVar.j(), hiuVar.c(), hiuVar.k(), hiuVar.V(), hiuVar.y(), hiuVar.W(), hiuVar.z(), hiuVar.X());
                bvvVar.ad(objS);
            }
            hiu hiuVar2 = (hiu) objS;
            hiuVar2.b.b(new cjv(hiuVar.C()));
            hiuVar2.c.b(new cjv(hiuVar.o()));
            hiuVar2.d.b(new cjv(hiuVar.D()));
            hiuVar2.e.b(new cjv(hiuVar.p()));
            hiuVar2.f.b(new cjv(hiuVar.h()));
            hiuVar2.g.b(new cjv(hiuVar.G()));
            hiuVar2.h.b(new cjv(hiuVar.s()));
            hiuVar2.i.b(new cjv(hiuVar.H()));
            hiuVar2.j.b(new cjv(hiuVar.t()));
            hiuVar2.k.b(new cjv(hiuVar.R()));
            hiuVar2.l.b(new cjv(hiuVar.w()));
            hiuVar2.m.b(new cjv(hiuVar.S()));
            hiuVar2.n.b(new cjv(hiuVar.x()));
            hiuVar2.o.b(new cjv(hiuVar.a()));
            hiuVar2.p.b(new cjv(hiuVar.I()));
            hiuVar2.q.b(new cjv(hiuVar.P()));
            hiuVar2.r.b(new cjv(hiuVar.O()));
            hiuVar2.s.b(new cjv(hiuVar.u()));
            hiuVar2.t.b(new cjv(hiuVar.i()));
            hiuVar2.u.b(new cjv(hiuVar.g()));
            hiuVar2.v.b(new cjv(hiuVar.Q()));
            hiuVar2.w.b(new cjv(hiuVar.v()));
            hiuVar2.x.b(new cjv(hiuVar.J()));
            hiuVar2.y.b(new cjv(hiuVar.M()));
            hiuVar2.z.b(new cjv(hiuVar.N()));
            hiuVar2.A.b(new cjv(hiuVar.K()));
            hiuVar2.B.b(new cjv(hiuVar.L()));
            hiuVar2.C.b(new cjv(hiuVar.A()));
            hiuVar2.D.b(new cjv(hiuVar.B()));
            hiuVar2.E.b(new cjv(hiuVar.T()));
            hiuVar2.F.b(new cjv(hiuVar.U()));
            hiuVar2.G.b(new cjv(hiuVar.d()));
            hiuVar2.H.b(new cjv(hiuVar.l()));
            hiuVar2.I.b(new cjv(hiuVar.E()));
            hiuVar2.J.b(new cjv(hiuVar.q()));
            hiuVar2.K.b(new cjv(hiuVar.F()));
            hiuVar2.L.b(new cjv(hiuVar.r()));
            hiuVar2.M.b(new cjv(hiuVar.e()));
            hiuVar2.N.b(new cjv(hiuVar.m()));
            hiuVar2.O.b(new cjv(hiuVar.f()));
            hiuVar2.P.b(new cjv(hiuVar.n()));
            hiuVar2.Q.b(new cjv(hiuVar.b()));
            hiuVar2.R.b(new cjv(hiuVar.j()));
            hiuVar2.S.b(new cjv(hiuVar.c()));
            hiuVar2.T.b(new cjv(hiuVar.k()));
            hiuVar2.U.b(new cjv(hiuVar.V()));
            hiuVar2.V.b(new cjv(hiuVar.y()));
            hiuVar2.W.b(new cjv(hiuVar.W()));
            hiuVar2.X.b(new cjv(hiuVar.z()));
            bng bngVar = new bng(hiuVar.C(), hiuVar.o(), hiuVar.D(), hiuVar.p(), hiuVar.h(), hiuVar.G(), hiuVar.s(), hiuVar.H(), hiuVar.t(), hiuVar.R(), hiuVar.w(), hiuVar.S(), hiuVar.x(), hiuVar.a(), hiuVar.u(), hiuVar.I(), hiuVar.u(), hiuVar.Q(), hiuVar.v(), hiuVar.C(), hiuVar.i(), hiuVar.g(), hiuVar.E(), hiuVar.q(), hiuVar.F(), hiuVar.r(), hiuVar.A(), hiuVar.B(), hiuVar.O(), hiuVar.P(), hiuVar.O(), hiuVar.J(), hiuVar.K(), hiuVar.L(), hiuVar.M(), hiuVar.N());
            hjeVar3.getClass();
            hjd hjdVar = hjeVar3.a;
            hje hjeVar4 = hjeVar3;
            boh.a(bngVar, new bpu(hjdVar.b, hjdVar.c, hjdVar.d, hjdVar.e, hjdVar.f), bryVar3, bxc.i(116933271, true, new hjg(hiuVar2, hjeVar4, hixVar3, hjfVar, hjaVar, afegVar, 0), buxVarC), buxVarC, 3072, 0);
            bryVar2 = bryVar3;
            hjeVar2 = hjeVar4;
            hixVar2 = hixVar3;
        } else {
            buxVarC.s();
            bryVar2 = bryVar;
            hjeVar2 = hjeVar;
            hixVar2 = hixVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hfp(hiuVar, bryVar2, hjeVar2, hixVar2, hjfVar, hjaVar, afegVar, i, 3);
        }
    }
}
