package defpackage;

/* loaded from: classes3.dex */
public final class uat extends ueb {
    public final boolean A;
    public final abky B;
    public final int C;
    public final abcy D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final abki H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final abjt M;
    public final boolean N;
    public final boolean O;
    public final String P;
    public final ujq Q;
    public final trt R;
    public final boolean S;
    public final long T;
    public final int U;
    public final wnq V;
    private volatile transient abdl W;
    private volatile transient int X;
    private volatile transient boolean Y;
    private volatile transient tql Z;
    public final abcs a;
    public final abcs b;
    public final int c;
    public final long d;
    public final toc e;
    public final String f;
    public final udw g;
    public final boolean h;
    public final yfq i;
    public final String j;
    public final ucr k;
    public final float l;
    public final float m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public uat(abcs abcsVar, abcs abcsVar2, int i, long j, toc tocVar, String str, udw udwVar, boolean z, yfq yfqVar, String str2, ucr ucrVar, float f, float f2, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, abky abkyVar, wnq wnqVar, int i3, abcy abcyVar, boolean z16, boolean z17, boolean z18, abki abkiVar, boolean z19, boolean z20, boolean z21, boolean z22, abjt abjtVar, boolean z23, boolean z24, String str3, ujq ujqVar, trt trtVar, boolean z25, long j2) {
        this.a = abcsVar;
        this.b = abcsVar2;
        this.c = i;
        this.d = j;
        this.e = tocVar;
        this.f = str;
        this.g = udwVar;
        this.h = z;
        this.i = yfqVar;
        this.j = str2;
        this.k = ucrVar;
        this.l = f;
        this.m = f2;
        this.U = i2;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = z6;
        this.s = z7;
        this.t = z8;
        this.u = z9;
        this.v = z10;
        this.w = z11;
        this.x = z12;
        this.y = z13;
        this.z = z14;
        this.A = z15;
        this.B = abkyVar;
        this.V = wnqVar;
        this.C = i3;
        this.D = abcyVar;
        this.E = z16;
        this.F = z17;
        this.G = z18;
        this.H = abkiVar;
        this.I = z19;
        this.J = z20;
        this.K = z21;
        this.L = z22;
        this.M = abjtVar;
        this.N = z23;
        this.O = z24;
        this.P = str3;
        this.Q = ujqVar;
        this.R = trtVar;
        this.S = z25;
        this.T = j2;
    }

    @Override // defpackage.udx
    public final boolean A() {
        return this.y;
    }

    @Override // defpackage.udx
    public final boolean B() {
        return this.z;
    }

    @Override // defpackage.udx
    public final boolean C() {
        return this.K;
    }

    @Override // defpackage.udx
    public final boolean D() {
        return this.u;
    }

    @Override // defpackage.udx
    public final boolean E() {
        return this.n;
    }

    @Override // defpackage.udx
    public final boolean F() {
        return this.q;
    }

    @Override // defpackage.udx
    public final boolean G() {
        return this.N;
    }

    @Override // defpackage.udx
    public final boolean H() {
        return this.x;
    }

    @Override // defpackage.udx
    public final boolean I() {
        return this.o;
    }

    @Override // defpackage.udx
    public final boolean J() {
        return this.p;
    }

    @Override // defpackage.udx
    public final boolean K() {
        return this.L;
    }

    @Override // defpackage.udx
    public final boolean L() {
        return this.t;
    }

    @Override // defpackage.ueb
    public final boolean M() {
        return this.S;
    }

    @Override // defpackage.udx
    public final int N() {
        return this.U;
    }

    @Override // defpackage.ueb, defpackage.udx
    public final int O() {
        if (!this.Y) {
            synchronized (this) {
                if (!this.Y) {
                    int i = ysy.a;
                    ysv ysvVar = ysq.a;
                    abcs abcsVar = this.a;
                    ysw yswVarC = ysvVar.c((abcsVar.q.size() * 8) + 12);
                    for (abao abaoVar : abcsVar.q) {
                        yswVarC.c(abaoVar.b);
                        yswVarC.c(abaoVar.c);
                    }
                    int i2 = abcsVar.b;
                    if ((i2 & 8192) != 0) {
                        yswVarC.d(abcsVar.m);
                        yswVarC.c(U());
                    } else if ((i2 & 4096) == 0) {
                        yswVarC.d(this.D.c);
                    }
                    this.X = yswVarC.l().a();
                    this.Y = true;
                }
            }
        }
        return this.X;
    }

    @Override // defpackage.ueb, defpackage.udx
    public final abdl P() {
        String strAa;
        if (this.W == null) {
            synchronized (this) {
                if (this.W == null) {
                    ucr ucrVar = this.k;
                    abcs abcsVar = this.a;
                    Object objC = null;
                    too tooVar = ucrVar.b() ? ucrVar.a.a : null;
                    trt trtVar = this.R;
                    abdl abdlVar = abcsVar.u;
                    if (abdlVar == null) {
                        abdlVar = abdl.a;
                    }
                    gjt gjtVar = new gjt(abcsVar, abdlVar);
                    gjtVar.k(abbf.C, abdn.c);
                    gjtVar.k(abbf.T, abdn.s);
                    gjtVar.k(abbf.E, abdn.e);
                    gjtVar.k(abbf.S, abdn.r);
                    gjtVar.k(abbf.ac, abdn.D);
                    gjtVar.k(abbf.af, abdn.G);
                    gjtVar.k(abbf.ae, abdn.F);
                    gjtVar.k(abbf.R, abdn.q);
                    gjtVar.k(abbf.F, abdn.f);
                    gjtVar.k(abbf.Y, abdn.z);
                    abnh abnhVar = abbf.Z;
                    abnh abnhVar2 = abdn.A;
                    Object obj = gjtVar.a;
                    ((abns) obj).j(abnhVar);
                    abnl abnlVar = ((abns) obj).w;
                    abnu abnuVar = abnhVar.d;
                    if (abnlVar.m(abnuVar)) {
                        abnr abnrVarL = gjtVar.l();
                        ((abns) obj).j(abnhVar);
                        Object objJ = ((abns) obj).w.j(abnuVar);
                        abnrVarL.bc(abnhVar2, (abnz) (objJ == null ? abnhVar.b : abnhVar.c(objJ)));
                    }
                    gjtVar.k(abbf.G, abdn.g);
                    gjtVar.k(abbf.K, abdn.k);
                    gjtVar.k(abbf.J, abdn.j);
                    gjtVar.k(abbf.W, abdn.x);
                    abnh abnhVar3 = abbf.V;
                    abnh abnhVar4 = abdn.w;
                    gjtVar.k(abnhVar3, abnhVar4);
                    gjtVar.k(abbf.aa, abdn.B);
                    gjtVar.k(abbf.ab, abdn.C);
                    gjtVar.k(abhx.a, abdn.P);
                    gjtVar.k(abbf.M, abdn.l);
                    gjtVar.k(abbf.Q, abdn.p);
                    gjtVar.k(abbf.U, abdn.v);
                    gjtVar.k(abbf.O, abdn.n);
                    gjtVar.k(abbf.P, abdn.o);
                    gjtVar.k(abbf.ad, abdn.E);
                    gjtVar.k(abbf.H, abdn.h);
                    gjtVar.k(abbf.X, abdn.y);
                    gjtVar.k(abbf.L, abdn.N);
                    gjtVar.k(abbf.D, abdn.d);
                    gjtVar.k(abbf.I, abdn.i);
                    gjtVar.k(abbf.N, abdn.m);
                    gjtVar.k(abbf.B, abdn.b);
                    gjtVar.k(aazp.b, abdn.U);
                    gjtVar.k(abhx.b, abdn.ab);
                    Object obj2 = gjtVar.c;
                    if (obj2 == null) {
                        Object obj3 = gjtVar.b;
                        ((abns) obj3).j(abnhVar4);
                        abnl abnlVar2 = ((abns) obj3).w;
                        abnu abnuVar2 = abnhVar4.d;
                        if (abnlVar2.m(abnuVar2)) {
                            ((abns) obj3).j(abnhVar4);
                            Object objJ2 = ((abns) obj3).w.j(abnuVar2);
                            objC = objJ2 == null ? abnhVar4.b : abnhVar4.c(objJ2);
                        }
                    } else if (((abnr) obj2).aZ(abnhVar4)) {
                        objC = ((abnr) gjtVar.c).aY(abnhVar4);
                    }
                    abcd abcdVar = (abcd) objC;
                    if (abcdVar != null && (abcdVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
                        abnr abnrVarL2 = gjtVar.l();
                        abnp abnpVarK = abcdVar.K();
                        abcu abcuVar = (abcu) obj;
                        abcd abcdVarA = uxa.a(abcuVar);
                        if (abcdVarA.equals(abnhVar3.b) || (abcdVarA.b & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
                            abco abcoVarB = abcuVar.b();
                            strAa = abcoVarB.c.size() > 0 ? a.aa(abcoVarB) : "";
                            if (abcuVar.d()) {
                                abco abcoVarC = abcuVar.c();
                                if (abcoVarC.c.size() > 0) {
                                    String strAa2 = a.aa(abcoVarC);
                                    if (strAa.length() > 0 && strAa2.length() > 0) {
                                        strAa = strAa.concat("\n");
                                    }
                                    strAa = strAa.concat(strAa2);
                                }
                            }
                        } else {
                            strAa = abcdVarA.i;
                        }
                        abnpVarK.t();
                        abcd abcdVar2 = (abcd) abnpVarK.b;
                        strAa.getClass();
                        abcdVar2.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                        abcdVar2.i = strAa;
                        abnrVarL2.bc(abnhVar4, (abcd) abnpVarK.q());
                    }
                    if (tooVar != null) {
                        abnr abnrVarL3 = gjtVar.l();
                        abnh abnhVar5 = abhi.a;
                        abnp abnpVarK2 = ((abhh) abnrVarL3.aY(abnhVar5)).K();
                        abnp abnpVarN = abhm.a.n();
                        double dA = tooVar.a();
                        abnpVarN.t();
                        abhm abhmVar = (abhm) abnpVarN.b;
                        abhmVar.b |= 1;
                        abhmVar.c = dA;
                        double dB = tooVar.b();
                        abnpVarN.t();
                        abhm abhmVar2 = (abhm) abnpVarN.b;
                        abhmVar2.b |= 2;
                        abhmVar2.d = dB;
                        abnpVarK2.t();
                        abhh abhhVar = (abhh) abnpVarK2.b;
                        abhm abhmVar3 = (abhm) abnpVarN.q();
                        abhmVar3.getClass();
                        abhhVar.c = abhmVar3;
                        abhhVar.b |= 128;
                        gjtVar.l().bc(abnhVar5, (abhh) abnpVarK2.q());
                    }
                    if (trtVar != null) {
                        abnr abnrVarL4 = gjtVar.l();
                        abnh abnhVar6 = abhe.a;
                        abnp abnpVarK3 = ((abhd) abnrVarL4.aY(abnhVar6)).K();
                        long j = trtVar.a;
                        abnpVarK3.t();
                        abhd abhdVar = (abhd) abnpVarK3.b;
                        abhdVar.b |= 1;
                        abhdVar.c = j;
                        gjtVar.l().bc(abnhVar6, (abhd) abnpVarK3.q());
                    }
                    this.W = gjtVar.j();
                    if (this.W == null) {
                        throw new NullPointerException("mapsMetadataContainer() cannot return null");
                    }
                }
            }
        }
        return this.W;
    }

    @Override // defpackage.ueb, defpackage.udx
    public final tql Q() {
        if (this.Z == null) {
            synchronized (this) {
                if (this.Z == null) {
                    this.Z = new tql(this.a);
                    if (this.Z == null) {
                        throw new NullPointerException("loggingIdentityKey() cannot return null");
                    }
                }
            }
        }
        return this.Z;
    }

    @Override // defpackage.udx
    public final wnq S() {
        return this.V;
    }

    @Override // defpackage.udx
    public final float a() {
        return this.m;
    }

    @Override // defpackage.udx
    public final float b() {
        return this.l;
    }

    @Override // defpackage.udx
    public final int c() {
        return this.c;
    }

    @Override // defpackage.udx
    public final long d() {
        return this.d;
    }

    @Override // defpackage.ueb
    public final long e() {
        return this.T;
    }

    @Override // defpackage.udx
    public final toc f() {
        return this.e;
    }

    @Override // defpackage.ueb
    public final trt g() {
        return this.R;
    }

    @Override // defpackage.udx
    public final ucr h() {
        return this.k;
    }

    @Override // defpackage.udx
    public final udw i() {
        return this.g;
    }

    @Override // defpackage.ueb
    public final udz j() {
        return new udz(this);
    }

    @Override // defpackage.ueb
    public final ujq k() {
        return this.Q;
    }

    @Override // defpackage.udx
    public final yfq l() {
        return this.i;
    }

    @Override // defpackage.udx
    public final abcs m() {
        return this.b;
    }

    @Override // defpackage.udx
    public final abcs n() {
        return this.a;
    }

    @Override // defpackage.udx
    public final abcy o() {
        return this.D;
    }

    @Override // defpackage.udx
    public final abjt p() {
        return this.M;
    }

    @Override // defpackage.udx
    public final abki q() {
        return this.H;
    }

    @Override // defpackage.udx
    public final abky r() {
        return this.B;
    }

    @Override // defpackage.udx
    public final String s() {
        return this.f;
    }

    @Override // defpackage.udx
    public final String t() {
        return this.j;
    }

    public final String toString() {
        String str;
        String string = this.a.toString();
        String strValueOf = String.valueOf(this.b);
        String strF = this.e.f();
        String strValueOf2 = String.valueOf(this.g);
        String string2 = this.i.toString();
        String string3 = this.k.toString();
        int i = this.U;
        if (i == 1) {
            str = "FEATURE_NOT_SET";
        } else if (i == 2) {
            str = "IS_DESTINATION_REFINEMENT";
        } else if (i == 3) {
            str = "PLACEMARK_METADATA";
        } else if (i == 5) {
            str = "FRIEND_LABEL_METADATA";
        } else if (i == 6) {
            str = "PERSONAL_PLACE_METADATA";
        } else if (i == 11) {
            str = "IS_FROM_SPOTLIGHT";
        } else if (i == 36) {
            str = "TRANSIT_STATION_METADATA";
        } else if (i == 41) {
            str = "IS_AR_WALKING_CIRCLE_LABEL";
        } else if (i == 22) {
            str = "IS_RECENTLY_VIEWED";
        } else if (i == 23) {
            str = "IS_BLUE_DOT_CALLOUT";
        } else if (i == 38) {
            str = "POLYLINE_TRAVERSAL_SPRITE_ID";
        } else if (i != 39) {
            switch (i) {
                case 17:
                    str = "IS_TRANSIT_VEHICLE";
                    break;
                case 18:
                    str = "IS_INJECTED_PERSISTENT_PLACE";
                    break;
                case 19:
                    str = "IS_VISUAL_EXPLORE_CLUSTER";
                    break;
                case 20:
                    str = "IS_BIKESHARING_VEHICLE";
                    break;
                default:
                    str = "null";
                    break;
            }
        } else {
            str = "IS_STREET_VIEW_POINT_OF_VIEW";
        }
        float f = this.m;
        float f2 = this.l;
        String str2 = this.j;
        boolean z = this.h;
        String str3 = this.f;
        long j = this.d;
        int i2 = this.c;
        String str4 = str;
        boolean z2 = this.n;
        boolean z3 = this.o;
        boolean z4 = this.p;
        boolean z5 = this.q;
        boolean z6 = this.r;
        boolean z7 = this.s;
        boolean z8 = this.t;
        boolean z9 = this.u;
        boolean z10 = this.v;
        boolean z11 = this.w;
        boolean z12 = this.x;
        boolean z13 = this.y;
        boolean z14 = this.z;
        boolean z15 = this.A;
        abky abkyVar = this.B;
        wnq wnqVar = this.V;
        int i3 = this.C;
        abcy abcyVar = this.D;
        boolean z16 = this.E;
        boolean z17 = this.F;
        boolean z18 = this.G;
        abki abkiVar = this.H;
        boolean z19 = this.I;
        boolean z20 = this.J;
        boolean z21 = this.K;
        boolean z22 = this.L;
        abjt abjtVar = this.M;
        boolean z23 = this.N;
        boolean z24 = this.O;
        String str5 = this.P;
        ujq ujqVar = this.Q;
        trt trtVar = this.R;
        boolean z25 = this.S;
        long j2 = this.T;
        return "{" + string + ", " + strValueOf + ", " + i2 + ", " + j + ", " + strF + ", " + str3 + ", " + strValueOf2 + ", " + z + ", " + string2 + ", " + str2 + ", " + string3 + ", " + f2 + ", " + f + ", " + str4 + ", " + z2 + ", " + z3 + ", " + z4 + ", " + z5 + ", " + z6 + ", " + z7 + ", " + z8 + ", " + z9 + ", " + z10 + ", " + z11 + ", " + z12 + ", " + z13 + ", " + z14 + ", " + z15 + ", " + String.valueOf(abkyVar) + ", " + String.valueOf(wnqVar) + ", " + i3 + ", " + abcyVar.toString() + ", " + z16 + ", " + z17 + ", " + z18 + ", " + String.valueOf(abkiVar) + ", " + z19 + ", " + z20 + ", " + z21 + ", " + z22 + ", " + String.valueOf(abjtVar) + ", " + z23 + ", " + z24 + ", " + str5 + ", " + String.valueOf(ujqVar) + ", " + String.valueOf(trtVar) + ", " + z25 + ", " + j2 + "}";
    }

    @Override // defpackage.udx
    public final boolean u() {
        return this.F;
    }

    @Override // defpackage.udx
    public final boolean v() {
        return this.I;
    }

    @Override // defpackage.udx
    public final boolean w() {
        return this.E;
    }

    @Override // defpackage.udx
    public final boolean x() {
        return this.G;
    }

    @Override // defpackage.udx
    public final boolean y() {
        return this.O;
    }

    @Override // defpackage.udx
    public final boolean z() {
        return this.J;
    }

    @Override // defpackage.udx
    public final void R() {
    }
}
