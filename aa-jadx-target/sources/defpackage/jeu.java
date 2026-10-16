package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jeu extends defpackage.jdr {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.VIDEO");
    private final defpackage.jet b;
    private final defpackage.xkd c;
    private final defpackage.iyr d;
    private final boolean e;
    private int[] l;
    private defpackage.xqf m;
    private defpackage.xqg n;

    public jeu(defpackage.jet jetVar, defpackage.jbu jbuVar, defpackage.jev jevVar, defpackage.jba jbaVar, defpackage.xkd xkdVar, defpackage.xlk xlkVar, defpackage.jdx jdxVar, defpackage.iyr iyrVar, defpackage.xyn xynVar, boolean z) {
        super(2, jetVar, jbuVar, jevVar, jbaVar, 1, xlkVar, jdxVar, "VideoEndPoint", z, !z ? (java.lang.Runnable) ((defpackage.xys) xynVar).a : null);
        this.m = defpackage.xqf.VIDEO_FOCUS_NATIVE;
        this.b = jetVar;
        this.c = xkdVar;
        this.d = iyrVar;
        this.e = xkdVar == defpackage.xkd.DISPLAY_TYPE_MAIN;
    }

    private final defpackage.jev J() {
        return (defpackage.jev) this.j;
    }

    private final synchronized void K(boolean z, boolean z2) {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(1955).Q("changeInputFocus(oldInputFocus=%b, newInputFocus=%b)", z, z2);
        if (z == z2) {
            return;
        }
        if (z2) {
            yqkVar.f().ai(1957).u("Input Focus Gained");
            defpackage.ivm ivmVar = ((defpackage.ivn) this.b).b;
            ivmVar.sendMessage(ivmVar.obtainMessage(6));
        } else {
            yqkVar.f().ai(1956).u("Input Focus Lost");
            defpackage.ivm ivmVar2 = ((defpackage.ivn) this.b).b;
            ivmVar2.sendMessage(ivmVar2.obtainMessage(7));
        }
    }

    private final synchronized void L(defpackage.xqf xqfVar, defpackage.xqf xqfVar2, boolean z) {
        a.l().ai(1958).R("changeVideoFocus(oldFocusMode=%s, newFocusMode=%s, unsolicited=%b)", xqfVar, xqfVar2, java.lang.Boolean.valueOf(z));
        int iOrdinal = xqfVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        throw new java.lang.RuntimeException("Impossible video focus");
                    }
                } else if (xqfVar2 == defpackage.xqf.VIDEO_FOCUS_PROJECTED) {
                    i(z);
                } else if (xqfVar2 == defpackage.xqf.VIDEO_FOCUS_NATIVE) {
                    N(z, false);
                }
            } else if (xqfVar2 == defpackage.xqf.VIDEO_FOCUS_PROJECTED) {
                i(z);
            }
        } else if (xqfVar2 == defpackage.xqf.VIDEO_FOCUS_NATIVE) {
            N(z, false);
        } else if (xqfVar2 == defpackage.xqf.VIDEO_FOCUS_NATIVE_TRANSIENT) {
            N(z, true);
        }
    }

    private final synchronized void M(defpackage.xqg xqgVar) {
        defpackage.xqf xqfVar = this.m;
        defpackage.xqf xqfVarB = defpackage.xqf.b(xqgVar.b);
        if (xqfVarB == null) {
            xqfVarB = defpackage.xqf.VIDEO_FOCUS_PROJECTED;
        }
        this.m = xqfVarB;
        defpackage.xqf xqfVar2 = defpackage.xqf.VIDEO_FOCUS_PROJECTED_NO_INPUT_FOCUS;
        L(xqfVar == xqfVar2 ? defpackage.xqf.VIDEO_FOCUS_PROJECTED : xqfVar, xqfVarB == xqfVar2 ? defpackage.xqf.VIDEO_FOCUS_PROJECTED : xqfVarB, xqgVar.c);
        defpackage.xqf xqfVar3 = defpackage.xqf.VIDEO_FOCUS_PROJECTED;
        boolean z = true;
        boolean z2 = xqfVar == xqfVar3;
        if (xqfVarB != xqfVar3) {
            z = false;
        }
        K(z2, z);
    }

    private final void N(boolean z, boolean z2) {
        a.f().ai(1963).Q("VideoFocus lost unsolicited=%b transient=%b", z, z2);
        this.b.z(z2);
        J().o();
    }

    private final void O(defpackage.xqf xqfVar, xqh xqhVar) {
        defpackage.abor aborVarN = xqi.a.n();
        aborVarN.t();
        xqi xqiVar = aborVarN.b;
        xqiVar.c = xqfVar.e;
        xqiVar.b |= 2;
        aborVarN.t();
        xqi xqiVar2 = aborVarN.b;
        xqiVar2.d = xqhVar.f;
        xqiVar2.b |= 4;
        defpackage.ypu ypuVarAi = a.f().ai(1968);
        xqh xqhVarB = xqh.b(aborVarN.b.d);
        if (xqhVarB == null) {
            xqhVarB = xqh.a;
        }
        ypuVarAi.M("Sending video focus request mode=%s reason=%s", xqfVar, xqhVarB);
        k(32775, aborVarN.q());
    }

    public final void G() {
        O(defpackage.xqf.VIDEO_FOCUS_NATIVE, xqh.a);
    }

    public final void H() {
        O(defpackage.xqf.VIDEO_FOCUS_PROJECTED, xqh.a);
    }

    public final void I(defpackage.xpq xpqVar) {
        a.f().ai(1967).y("UpdateUiConfigRequest %s", xpqVar);
        defpackage.abor aborVarN = xpx.a.n();
        aborVarN.t();
        xpx xpxVar = aborVarN.b;
        xpqVar.getClass();
        xpxVar.c = xpqVar;
        xpxVar.b |= 1;
        k(32778, aborVarN.q());
    }

    @Override // defpackage.jdr, defpackage.jbq, defpackage.izg
    public final void P(int i) {
        if (this.g) {
            a.l().ai(1961).u("Invoking onVideoFocusLost callback on channel close");
            this.b.z(false);
        }
        super.P(i);
    }

    @Override // defpackage.jdr, defpackage.jbq
    protected final void a(int i, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp {
        if (i == 32776) {
            defpackage.abox aboxVarC = defpackage.abox.C(defpackage.xqg.a, defpackage.abny.M(byteBuffer), defpackage.abol.a());
            defpackage.abox.U(aboxVarC);
            defpackage.abox.U(aboxVarC);
            defpackage.xqg xqgVar = (defpackage.xqg) aboxVarC;
            if (this.l == null) {
                this.n = xqgVar;
                return;
            } else {
                M(xqgVar);
                return;
            }
        }
        if (i == 32777) {
            xpx xpxVarC = defpackage.abox.C(xpx.a, defpackage.abny.M(byteBuffer), defpackage.abol.a());
            defpackage.abox.U(xpxVarC);
            defpackage.abox.U(xpxVarC);
            xpx xpxVar = xpxVarC;
            if ((xpxVar.b & 1) != 0) {
                a.f().ai(1960).y("UpdateUiConfigRequest %s", xpxVar);
                this.b.y(xpxVar);
                return;
            } else {
                defpackage.jbu jbuVar = this.x;
                jbuVar.getClass();
                jbuVar.aF(defpackage.zaj.PROTOCOL_WRONG_MESSAGE, defpackage.zak.INVALID_UI_CONFIG, "UpdateUiConfigRequest must specify a UiConfig");
                return;
            }
        }
        if (i == 32782) {
            xlb xlbVarC = defpackage.abox.C(xlb.a, defpackage.abny.M(byteBuffer), defpackage.abol.a());
            defpackage.abox.U(xlbVarC);
            defpackage.abox.U(xlbVarC);
            defpackage.ivm ivmVar = ((defpackage.ivn) this.b).b;
            ivmVar.sendMessage(ivmVar.obtainMessage(8, xlbVarC));
            return;
        }
        if (i == 32783) {
            defpackage.ivm ivmVar2 = ((defpackage.ivn) this.b).b;
            ivmVar2.sendMessage(ivmVar2.obtainMessage(9));
        } else {
            if (i != 32786) {
                super.a(i, byteBuffer);
                return;
            }
            xpz xpzVarC = defpackage.abox.C(xpz.a, defpackage.abny.M(byteBuffer), defpackage.abol.a());
            defpackage.abox.U(xpzVarC);
            defpackage.abox.U(xpzVarC);
            defpackage.ivm ivmVar3 = ((defpackage.ivn) this.b).b;
            ivmVar3.sendMessage(ivmVar3.obtainMessage(10, xpzVarC));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [iyr, java.lang.Object] */
    @Override // defpackage.jdr, defpackage.ize
    public final void b(int i) {
        if (this.e) {
            j$.util.Optional optionalA = A(i);
            defpackage.iyr iyrVar = this.d;
            iyrVar.getClass();
            defpackage.imv imvVar = new defpackage.imv(iyrVar, 3);
            if (true == optionalA.isPresent()) {
                imvVar.a.c((j$.time.Duration) optionalA.get());
            }
        }
        super.b(i);
    }

    @Override // defpackage.jdr
    public final defpackage.yqk h() {
        return a;
    }

    final void i(boolean z) {
        a.f().ai(1962).y("VideoFocus gained unsolicited=%b", java.lang.Boolean.valueOf(z));
        if (this.l != null) {
            defpackage.jet jetVar = this.b;
            defpackage.yqm yqmVar = defpackage.ivn.a;
            defpackage.ypu ypuVarF = yqmVar.f();
            defpackage.ivn ivnVar = (defpackage.ivn) jetVar;
            defpackage.xkd xkdVar = ivnVar.n;
            ((defpackage.yqj) ((defpackage.yqj) ypuVarF).ai((char) 1397)).y("Video focus gained for display type: %s.", xkdVar);
            if (ivnVar.B) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(1398)).K("Video focus rejected for display type: %s - %s", xkdVar, ivnVar.o);
                ivnVar.z.b(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.VIDEO_FOCUS, defpackage.zbd.lk).l());
                ((defpackage.yqj) yqmVar.l().ai((char) 1400)).u("Relinquishing video focus");
                defpackage.jeu jeuVar = ivnVar.f;
                if (jeuVar != null) {
                    jeuVar.G();
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 1401)).u("No endpoint ready, unable to relinquish focus");
                }
            } else {
                ivnVar.s.set(true);
                defpackage.ivv ivvVar = ivnVar.C;
                synchronized (ivvVar.b) {
                    ivvVar.c.add(defpackage.ivt.a);
                }
            }
        } else {
            defpackage.jbu jbuVar = this.x;
            jbuVar.getClass();
            jbuVar.aF(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.EARLY_VIDEO_FOCUS, "Video focus gained before configurations received.");
        }
        J().c();
    }

    @Override // defpackage.jbq
    public final defpackage.jei j() {
        defpackage.jei jeiVar = defpackage.jei.VIDEO;
        int iOrdinal = this.c.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? jeiVar : defpackage.jei.VIDEO_AUXILIARY;
        }
        return defpackage.jei.VIDEO_CLUSTER;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jdr
    protected final void r(defpackage.xjv xjvVar) {
        int i;
        defpackage.xyn xysVar;
        super.r(xjvVar);
        if (xjvVar.d.size() == 0) {
            defpackage.jbu jbuVar = this.x;
            jbuVar.getClass();
            jbuVar.aF(defpackage.zaj.PROTOCOL_WRONG_MESSAGE, defpackage.zak.NO_VIDEO_CONFIGS, "No configuration indices.");
            return;
        }
        int[] iArrCQ = defpackage.ysr.cQ(xjvVar.d);
        a.l().ai(1959).y("Config received %s", iArrCQ);
        defpackage.jet jetVar = this.b;
        int length = iArrCQ.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i = -1;
                break;
            }
            i = iArrCQ[i2];
            try {
                if (((defpackage.ivn) jetVar).B(i)) {
                    break;
                } else {
                    i2++;
                }
            } catch (defpackage.ikf e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.ivn.a.g()).p(e)).ai(1395)).t(e);
                xysVar = new defpackage.xys(defpackage.zak.BAD_VIDEO);
            }
        }
        if (i == -1) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ivn.a.g()).ai((char) 1394)).u("No working configuration");
            xysVar = new defpackage.xys(defpackage.zak.MISSING_VIDEO);
        } else {
            defpackage.ivn ivnVar = (defpackage.ivn) jetVar;
            ivnVar.j = i;
            defpackage.xqe xqeVar = (defpackage.xqe) ivnVar.i.get(i);
            synchronized (jetVar) {
                if ((xqeVar.b & 1024) != 0) {
                    defpackage.xpq xpqVar = xqeVar.l;
                    if (xpqVar == null) {
                        xpqVar = defpackage.xpq.b;
                    }
                    ((defpackage.ivn) jetVar).l = xpqVar;
                } else {
                    ((defpackage.ivn) jetVar).l = null;
                }
                ((defpackage.ivn) jetVar).A();
            }
            defpackage.ivm ivmVar = ivnVar.b;
            ivmVar.sendMessage(ivmVar.obtainMessage(4, ivnVar.c));
            xysVar = defpackage.xxe.a;
        }
        if (xysVar.f()) {
            defpackage.jbu jbuVar2 = this.x;
            jbuVar2.getClass();
            jbuVar2.aF(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, (defpackage.zak) xysVar.b(), "no working configuration");
        } else {
            this.l = iArrCQ;
        }
        defpackage.xqg xqgVar = this.n;
        if (xqgVar != null) {
            M(xqgVar);
            this.n = null;
        }
    }
}
