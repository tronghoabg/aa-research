package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class jem extends jdk {
    public static final ypf a = ols.R("CAR.GAL.VIDEO");
    private final jel b;
    private final xjc c;
    private final iyk d;
    private final boolean e;
    private int[] l;
    private xpe m;
    private xpf n;

    public jem(jel jelVar, jbn jbnVar, jen jenVar, jat jatVar, xjc xjcVar, xkj xkjVar, jdq jdqVar, iyk iykVar, xxh xxhVar, boolean z) {
        super(2, jelVar, jbnVar, jenVar, jatVar, 1, xkjVar, jdqVar, "VideoEndPoint", z, !z ? (Runnable) ((xxm) xxhVar).a : null);
        this.m = xpe.VIDEO_FOCUS_NATIVE;
        this.b = jelVar;
        this.c = xjcVar;
        this.d = iykVar;
        this.e = xjcVar == xjc.DISPLAY_TYPE_MAIN;
    }

    private final jen J() {
        return (jen) this.j;
    }

    private final synchronized void K(boolean z, boolean z2) {
        ypf ypfVar = a;
        ypfVar.l().ai(1955).Q("changeInputFocus(oldInputFocus=%b, newInputFocus=%b)", z, z2);
        if (z == z2) {
            return;
        }
        if (z2) {
            ypfVar.f().ai(1957).u("Input Focus Gained");
            ive iveVar = ((ivf) this.b).b;
            iveVar.sendMessage(iveVar.obtainMessage(6));
        } else {
            ypfVar.f().ai(1956).u("Input Focus Lost");
            ive iveVar2 = ((ivf) this.b).b;
            iveVar2.sendMessage(iveVar2.obtainMessage(7));
        }
    }

    private final synchronized void L(xpe xpeVar, xpe xpeVar2, boolean z) {
        a.l().ai(1958).R("changeVideoFocus(oldFocusMode=%s, newFocusMode=%s, unsolicited=%b)", xpeVar, xpeVar2, Boolean.valueOf(z));
        int iOrdinal = xpeVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        throw new RuntimeException("Impossible video focus");
                    }
                } else if (xpeVar2 == xpe.VIDEO_FOCUS_PROJECTED) {
                    i(z);
                } else if (xpeVar2 == xpe.VIDEO_FOCUS_NATIVE) {
                    N(z, false);
                }
            } else if (xpeVar2 == xpe.VIDEO_FOCUS_PROJECTED) {
                i(z);
            }
        } else if (xpeVar2 == xpe.VIDEO_FOCUS_NATIVE) {
            N(z, false);
        } else if (xpeVar2 == xpe.VIDEO_FOCUS_NATIVE_TRANSIENT) {
            N(z, true);
        }
    }

    private final synchronized void M(xpf xpfVar) {
        xpe xpeVar = this.m;
        xpe xpeVarB = xpe.b(xpfVar.b);
        if (xpeVarB == null) {
            xpeVarB = xpe.VIDEO_FOCUS_PROJECTED;
        }
        this.m = xpeVarB;
        xpe xpeVar2 = xpe.VIDEO_FOCUS_PROJECTED_NO_INPUT_FOCUS;
        L(xpeVar == xpeVar2 ? xpe.VIDEO_FOCUS_PROJECTED : xpeVar, xpeVarB == xpeVar2 ? xpe.VIDEO_FOCUS_PROJECTED : xpeVarB, xpfVar.c);
        xpe xpeVar3 = xpe.VIDEO_FOCUS_PROJECTED;
        boolean z = true;
        boolean z2 = xpeVar == xpeVar3;
        if (xpeVarB != xpeVar3) {
            z = false;
        }
        K(z2, z);
    }

    private final void N(boolean z, boolean z2) {
        a.f().ai(1963).Q("VideoFocus lost unsolicited=%b transient=%b", z, z2);
        this.b.z(z2);
        J().o();
    }

    private final void O(xpe xpeVar, xpg xpgVar) {
        abnp abnpVarN = xph.a.n();
        abnpVarN.t();
        xph xphVar = (xph) abnpVarN.b;
        xphVar.c = xpeVar.e;
        xphVar.b |= 2;
        abnpVarN.t();
        xph xphVar2 = (xph) abnpVarN.b;
        xphVar2.d = xpgVar.f;
        xphVar2.b |= 4;
        yop yopVarAi = a.f().ai(1968);
        xpg xpgVarB = xpg.b(((xph) abnpVarN.b).d);
        if (xpgVarB == null) {
            xpgVarB = xpg.UNKNOWN;
        }
        yopVarAi.M("Sending video focus request mode=%s reason=%s", xpeVar, xpgVarB);
        k(32775, abnpVarN.q());
    }

    public final void H() {
        O(xpe.VIDEO_FOCUS_PROJECTED, xpg.UNKNOWN);
    }

    public final void I(xop xopVar) {
        a.f().ai(1967).y("UpdateUiConfigRequest %s", xopVar);
        abnp abnpVarN = xow.a.n();
        abnpVarN.t();
        xow xowVar = (xow) abnpVarN.b;
        xopVar.getClass();
        xowVar.c = xopVar;
        xowVar.b |= 1;
        k(32778, abnpVarN.q());
    }

    @Override // defpackage.jdk, defpackage.jbj, defpackage.iyz
    public final void P(int i) {
        if (this.g) {
            a.l().ai(1961).u("Invoking onVideoFocusLost callback on channel close");
            this.b.z(false);
        }
        super.P(i);
    }

    @Override // defpackage.jdk, defpackage.jbj
    protected final void a(int i, ByteBuffer byteBuffer) throws abon {
        if (i == 32776) {
            abnv abnvVarC = abnv.C(xpf.a, abmw.O(byteBuffer), abnj.a());
            abnv.U(abnvVarC);
            abnv.U(abnvVarC);
            xpf xpfVar = (xpf) abnvVarC;
            if (this.l == null) {
                this.n = xpfVar;
                return;
            } else {
                M(xpfVar);
                return;
            }
        }
        if (i == 32777) {
            abnv abnvVarC2 = abnv.C(xow.a, abmw.O(byteBuffer), abnj.a());
            abnv.U(abnvVarC2);
            abnv.U(abnvVarC2);
            xow xowVar = (xow) abnvVarC2;
            if ((xowVar.b & 1) != 0) {
                a.f().ai(1960).y("UpdateUiConfigRequest %s", xowVar);
                this.b.y(xowVar);
                return;
            } else {
                jbn jbnVar = this.x;
                jbnVar.getClass();
                jbnVar.aF(yze.PROTOCOL_WRONG_MESSAGE, yzf.INVALID_UI_CONFIG, "UpdateUiConfigRequest must specify a UiConfig");
                return;
            }
        }
        if (i == 32782) {
            abnv abnvVarC3 = abnv.C(xka.a, abmw.O(byteBuffer), abnj.a());
            abnv.U(abnvVarC3);
            abnv.U(abnvVarC3);
            ive iveVar = ((ivf) this.b).b;
            iveVar.sendMessage(iveVar.obtainMessage(8, (xka) abnvVarC3));
            return;
        }
        if (i == 32783) {
            ive iveVar2 = ((ivf) this.b).b;
            iveVar2.sendMessage(iveVar2.obtainMessage(9));
        } else {
            if (i != 32786) {
                super.a(i, byteBuffer);
                return;
            }
            abnv abnvVarC4 = abnv.C(xoy.a, abmw.O(byteBuffer), abnj.a());
            abnv.U(abnvVarC4);
            abnv.U(abnvVarC4);
            ive iveVar3 = ((ivf) this.b).b;
            iveVar3.sendMessage(iveVar3.obtainMessage(10, (xoy) abnvVarC4));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [iyk, java.lang.Object] */
    @Override // defpackage.jdk, defpackage.iyx
    public final void b(int i) {
        if (this.e) {
            Optional optionalB = B(i);
            iyk iykVar = this.d;
            iykVar.getClass();
            imn imnVar = new imn(iykVar, 4);
            if (true == optionalB.isPresent()) {
                imnVar.a.c((Duration) optionalB.get());
            }
        }
        super.b(i);
    }

    @Override // defpackage.jdk
    public final ypf h() {
        return a;
    }

    final void i(boolean z) {
        a.f().ai(1962).y("VideoFocus gained unsolicited=%b", Boolean.valueOf(z));
        if (this.l != null) {
            jel jelVar = this.b;
            yph yphVar = ivf.a;
            yop yopVarF = yphVar.f();
            ivf ivfVar = (ivf) jelVar;
            xjc xjcVar = ivfVar.n;
            ((ype) ((ype) yopVarF).ai((char) 1397)).y("Video focus gained for display type: %s.", xjcVar);
            if (ivfVar.B) {
                ((ype) ((ype) yphVar.h()).ai(1398)).K("Video focus rejected for display type: %s - %s", xjcVar, ivfVar.o);
                ivfVar.z.b(rrc.h(yxy.CAR_SERVICE, yzz.VIDEO_FOCUS, yzy.lk).l());
                ((ype) yphVar.l().ai((char) 1400)).u("Relinquishing video focus");
                jem jemVar = ivfVar.f;
                if (jemVar != null) {
                    jemVar.r();
                } else {
                    ((ype) ((ype) yphVar.h()).ai((char) 1401)).u("No endpoint ready, unable to relinquish focus");
                }
            } else {
                ivfVar.s.set(true);
                ivn ivnVar = ivfVar.C;
                synchronized (ivnVar.b) {
                    ivnVar.c.add(ivl.a);
                }
            }
        } else {
            jbn jbnVar = this.x;
            jbnVar.getClass();
            jbnVar.aF(yze.PROTOCOL_WRONG_CONFIGURATION, yzf.EARLY_VIDEO_FOCUS, "Video focus gained before configurations received.");
        }
        J().c();
    }

    @Override // defpackage.jbj
    public final jeb j() {
        jeb jebVar = jeb.VIDEO;
        int iOrdinal = this.c.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? jebVar : jeb.VIDEO_AUXILIARY : jeb.VIDEO_CLUSTER;
    }

    public final void r() {
        O(xpe.VIDEO_FOCUS_NATIVE, xpg.UNKNOWN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jdk
    protected final void s(xiu xiuVar) {
        int i;
        xxh xxmVar;
        super.s(xiuVar);
        if (xiuVar.d.size() == 0) {
            jbn jbnVar = this.x;
            jbnVar.getClass();
            jbnVar.aF(yze.PROTOCOL_WRONG_MESSAGE, yzf.NO_VIDEO_CONFIGS, "No configuration indices.");
            return;
        }
        int[] iArrAy = wub.ay(xiuVar.d);
        a.l().ai(1959).y("Config received %s", iArrAy);
        jel jelVar = this.b;
        int length = iArrAy.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i = -1;
                break;
            }
            i = iArrAy[i2];
            try {
                if (((ivf) jelVar).B(i)) {
                    break;
                } else {
                    i2++;
                }
            } catch (ijw e) {
                ((ype) ((ype) ((ype) ivf.a.g()).p(e)).ai(1395)).t(e);
                xxmVar = new xxm(yzf.BAD_VIDEO);
            }
        }
        if (i == -1) {
            ((ype) ((ype) ivf.a.g()).ai((char) 1394)).u("No working configuration");
            xxmVar = new xxm(yzf.MISSING_VIDEO);
        } else {
            ivf ivfVar = (ivf) jelVar;
            ivfVar.j = i;
            xpd xpdVar = (xpd) ivfVar.i.get(i);
            synchronized (jelVar) {
                if ((xpdVar.b & 1024) != 0) {
                    xop xopVar = xpdVar.l;
                    if (xopVar == null) {
                        xopVar = xop.b;
                    }
                    ((ivf) jelVar).l = xopVar;
                } else {
                    ((ivf) jelVar).l = null;
                }
                ((ivf) jelVar).A();
            }
            ive iveVar = ivfVar.b;
            iveVar.sendMessage(iveVar.obtainMessage(4, ivfVar.c));
            xxmVar = xvy.a;
        }
        if (xxmVar.f()) {
            jbn jbnVar2 = this.x;
            jbnVar2.getClass();
            jbnVar2.aF(yze.PROTOCOL_WRONG_CONFIGURATION, (yzf) xxmVar.b(), "no working configuration");
        } else {
            this.l = iArrAy;
        }
        xpf xpfVar = this.n;
        if (xpfVar != null) {
            M(xpfVar);
            this.n = null;
        }
    }
}
