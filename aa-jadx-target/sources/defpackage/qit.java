package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qit implements defpackage.kxi {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.DemandController");
    public static final android.content.ComponentName b = new android.content.ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.gearhead.projected.VoicePlateCarService");
    public static final android.content.ComponentName c = new android.content.ComponentName("com.google.android.googlequicksearchbox", "com.google.android.libraries.assistant.auto.jumpboost.caractivity.VoicePlateCarService");
    public defpackage.qis d = defpackage.qis.a;
    public final defpackage.eqs e;
    public final defpackage.eqs f;
    protected final android.content.Context g;
    protected boolean h;
    public defpackage.kxh i;
    protected defpackage.kxc j;
    public boolean k;
    private int l;
    private defpackage.yxp m;
    private boolean n;
    private boolean o;
    private final defpackage.mph p;
    private final android.content.BroadcastReceiver q;
    private final defpackage.omf r;

    public qit(android.content.Context context) {
        defpackage.afdo afdoVar = defpackage.tcu.a;
        this.e = new defpackage.eqs(1);
        this.m = null;
        defpackage.kxh kxhVar = defpackage.kxh.a;
        this.f = new defpackage.eqs(kxhVar);
        this.i = kxhVar;
        this.n = false;
        this.k = false;
        this.o = true;
        this.r = new defpackage.qip(this);
        this.p = new defpackage.qiq();
        this.q = new defpackage.qir(this);
        context.getClass();
        this.g = context;
    }

    public static java.lang.String o(int i) {
        if (i == 0) {
            return "UNKNOWN";
        }
        if (i == 1) {
            return "CLOSED";
        }
        if (i != 2) {
            return i != 3 ? defpackage.a.bo(i, "Invalid: ") : "UNAVAILABLE";
        }
        return "OPEN";
    }

    private final void t() {
        defpackage.ocn ocnVarA = defpackage.ocn.a();
        defpackage.lam.a();
        if (this.h) {
            defpackage.lam.e(defpackage.yxo.START_VOICE_SESSION_IGNORED_BECAUSE_IN_CALL, null);
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 7305)).u("Assistant is unavailable because in call.");
            ocnVarA.c(this.g, defpackage.mkt.C, 2132085452, 0);
            return;
        }
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai(7303)).w("Assistant is unavailable due to: %s", this.l);
        int i = this.l;
        if (i == 0) {
            defpackage.lam.e(defpackage.yxo.START_VOICE_SESSION_ASSISTANT_STATE_UNINITIALIZED, null);
            ocnVarA.c(this.g, defpackage.mkt.C, 2132085448, 0);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                defpackage.lam.e(defpackage.yxo.START_VOICE_SESSION_MISSING_MICROPHONE_PERMISSION, null);
                ocnVarA.c(this.g, defpackage.mkt.C, 2132085453, 0);
                return;
            } else {
                defpackage.lam.e(defpackage.yxo.START_VOICE_SESSION_ASSISTANT_STATE_UNAVAILABLE, null);
                ocnVarA.c(this.g, defpackage.mkt.C, 2132085448, 0);
                return;
            }
        }
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 1) {
            defpackage.lam.e(defpackage.yxo.START_VOICE_SESSION_DEMAND_SPACE_PENDING_OPEN, null);
        } else if (iOrdinal == 3) {
            defpackage.lam.e(defpackage.yxo.START_VOICE_SESSION_DEMAND_SPACE_PENDING_CLOSE, null);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(7304)).y("Assistant initialized but unavailable. Internal state: %s", this.d);
            defpackage.lam.e(defpackage.yxo.START_VOICE_SESSION_ASSISTANT_STATE_INITIALIZED_BUT_UNAVAILABLE, null);
        }
    }

    private final boolean u(int i) {
        defpackage.qis qisVar = this.d;
        if (qisVar == defpackage.qis.d || qisVar == defpackage.qis.b) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 7327)).u("Ignoring openDemandSpace call since the demand space is pending close or open");
            return false;
        }
        boolean z = (defpackage.lao.d(i) || this.i == defpackage.kxh.b) ? false : true;
        boolean z2 = defpackage.lao.d(i) && this.d == defpackage.qis.a;
        if (q()) {
            return z || z2;
        }
        return false;
    }

    @Override // defpackage.kxd
    public final void a(int i) {
        java.lang.String str;
        defpackage.yqj yqjVar = (defpackage.yqj) a.l().ai(7314);
        if (i == 0) {
            str = "UNINITIALIZED";
        } else if (i != 1) {
            str = i != 2 ? "UNAVAILABLE_PERMISSION_REQUIRED" : "UNAVAILABLE";
        } else {
            str = "INITIALIZED";
        }
        yqjVar.y("onAssistantStateChanged to state %s", str);
        this.l = i;
        p();
    }

    @Override // defpackage.kxd
    public final void b() {
        this.m = null;
        if (!r()) {
            defpackage.lam.a();
            defpackage.lam.e(defpackage.yxo.DEMAND_SPACE_ALREADY_CLOSED_ON_VOICE_SESSION_END, null);
        } else {
            this.d = defpackage.qis.a;
            this.i = defpackage.kxh.a;
            p();
        }
    }

    @Override // defpackage.lhn
    public final void d() {
        ((defpackage.yqj) a.l().ai((char) 7329)).u("stop");
        this.n = false;
        j(defpackage.yxp.INTERRUPTED);
        this.d = defpackage.qis.a;
        this.i = defpackage.kxh.a;
        p();
        this.j.I(this);
        this.j = null;
        defpackage.omf.w().E(this.r);
        this.h = false;
        this.g.unregisterReceiver(this.q);
        defpackage.mpj.b().j(this.p);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.kxd
    public final void e(int i) {
        defpackage.qis qisVar = this.d;
        if (qisVar == defpackage.qis.b) {
            this.d = defpackage.qis.c;
        } else {
            defpackage.qis qisVar2 = defpackage.qis.c;
            if (qisVar == qisVar2) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(7320)).y("onVoiceSessionReady: Already in OPEN state. Current trigger: %s", this.i);
                defpackage.lam.a();
                defpackage.lam.e(defpackage.yxo.DEMAND_SPACE_ALREADY_OPEN_ON_VOICE_SESSION_START, null);
                if (this.i != (defpackage.lao.e(i) ? defpackage.kxh.c : defpackage.kxh.b)) {
                }
                if (this.m != null) {
                    if (this.n) {
                        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 7319)).u("Closing demand space due to a pending close request");
                        j(this.m);
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 7318)).u("Controller is not started, so ignoring pending close request");
                    }
                    this.m = null;
                }
            }
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(7317)).y("onVoiceSessionReady: Session started externally or state mismatch (current: %s). Transitioning to OPEN.", this.d);
            this.d = qisVar2;
            this.i = defpackage.lao.e(i) ? defpackage.kxh.c : defpackage.kxh.b;
        }
        p();
        if (this.m != null) {
            if (this.n) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 7319)).u("Closing demand space due to a pending close request");
                j(this.m);
            } else {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 7318)).u("Controller is not started, so ignoring pending close request");
            }
            this.m = null;
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        ((defpackage.yqj) a.l().ai((char) 7328)).u("start");
        this.m = null;
        defpackage.kxc kxcVarN = defpackage.ebo.n();
        this.j = kxcVarN;
        kxcVarN.r(this);
        defpackage.omf.w().D(this.r);
        defpackage.duw.e(this.g, this.q, new android.content.IntentFilter("android.intent.action.projected.KEY_EVENT"), null, 2);
        this.n = true;
        int i = defpackage.qim.a;
        int i2 = defpackage.qiu.a;
        int i3 = defpackage.qin.a;
        defpackage.mpj.b().g(this.p);
    }

    @Override // defpackage.kxi
    public final defpackage.eqp h() {
        return this.f;
    }

    @Override // defpackage.kxi
    public final defpackage.eqp i() {
        return this.e;
    }

    @Override // defpackage.kxi
    public final void j(defpackage.yxp yxpVar) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai(7301)).M("closeDemandSpace with cancel trigger %s, currentInternalState=%s", yxpVar.name(), this.d);
        defpackage.qis qisVar = this.d;
        boolean z = qisVar == defpackage.qis.a || qisVar == defpackage.qis.d;
        defpackage.qis qisVar2 = defpackage.qis.b;
        boolean z2 = yxpVar == defpackage.yxp.INTERRUPTED;
        if (defpackage.acnf.D()) {
            z2 |= yxpVar == defpackage.yxp.SCRIM_CLICKED;
        }
        if (!z && (qisVar != qisVar2 || z2)) {
            this.d = defpackage.qis.d;
            p();
            this.j.n(yxpVar);
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(7302)).y("Ignoring closeDemandSpace since it is already closed or pending, internalState: %s", this.d);
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            defpackage.lam.a();
            defpackage.lam.e(defpackage.yxo.END_VOICE_SESSION_DEMAND_SPACE_ALREADY_CLOSED, null);
        } else if (iOrdinal == 1) {
            defpackage.lam.a();
            defpackage.lam.e(defpackage.yxo.END_VOICE_SESSION_DEMAND_SPACE_RECENTLY_OPENED, null);
            this.m = yxpVar;
        } else {
            if (iOrdinal != 3) {
                return;
            }
            defpackage.lam.a();
            defpackage.lam.e(defpackage.yxo.END_VOICE_SESSION_DEMAND_SPACE_PENDING_CLOSE, null);
        }
    }

    @Override // defpackage.kxi
    public final /* synthetic */ void k(int i) {
        n(i);
    }

    @Override // defpackage.kxi
    public final void l(int i) {
        ((defpackage.yqj) a.l().ai(7324)).D("openDemandSpaceWithNavigationTranscriptionRequest: trigger=%d, currentInternalState=%s", i, this.d);
        if (!u(i)) {
            defpackage.lam.a();
            defpackage.lam.f(i);
            t();
        } else {
            this.d = defpackage.qis.b;
            this.i = defpackage.kxh.b;
            p();
            this.j.O(null);
        }
    }

    @Override // defpackage.kxi
    public final boolean m() {
        return this.n;
    }

    @Override // defpackage.kxi
    public final void n(int i) {
        ((defpackage.yqj) a.l().ai(7323)).D("openDemandSpace: trigger=%d, currentInternalState=%s", i, this.d);
        if (!u(i)) {
            defpackage.lam.a();
            defpackage.lam.f(i);
            t();
            return;
        }
        if (this.o) {
            defpackage.tgg.a.b(defpackage.tgf.GEARHEAD_ASSISTANT_COLD_STARTUP);
            this.o = false;
        } else {
            defpackage.tgg.a.b(defpackage.tgf.GEARHEAD_ASSISTANT_WARM_STARTUP);
        }
        this.d = defpackage.qis.b;
        this.i = defpackage.lao.d(i) ? defpackage.kxh.c : defpackage.kxh.b;
        p();
        this.j.F(i);
    }

    public final void p() {
        defpackage.lao.b(new defpackage.qie(this, 4));
    }

    public final boolean q() {
        return this.l == 1 && !this.h;
    }

    public final boolean r() {
        return this.d != defpackage.qis.a;
    }

    public final boolean s() {
        return j$.util.Objects.equals(this.j.g().e(), java.lang.Boolean.TRUE);
    }

    @Override // defpackage.kxd
    public final void f() {
    }

    @Override // defpackage.kxd
    public final void g() {
    }
}
