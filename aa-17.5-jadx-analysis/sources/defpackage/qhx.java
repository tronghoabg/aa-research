package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.projection.gearhead.R;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class qhx implements kxb {
    public static final yph a = yph.c("GH.DemandController");
    public static final ComponentName b = new ComponentName(RemoteApiConstants.NOW_PACKAGE, "com.google.android.apps.gsa.staticplugins.gearhead.projected.VoicePlateCarService");
    public static final ComponentName c = new ComponentName(RemoteApiConstants.NOW_PACKAGE, "com.google.android.libraries.assistant.auto.jumpboost.caractivity.VoicePlateCarService");
    public qhw d = qhw.a;
    public final eqm e;
    public final eqm f;
    protected final Context g;
    protected boolean h;
    public kxa i;
    protected kwv j;
    public boolean k;
    private int l;
    private ywk m;
    private boolean n;
    private boolean o;
    private final mpb p;
    private final BroadcastReceiver q;
    private final ebf r;

    public qhx(Context context) {
        afco afcoVar = tby.a;
        this.e = new eqm(1);
        this.m = null;
        kxa kxaVar = kxa.a;
        this.f = new eqm(kxaVar);
        this.i = kxaVar;
        this.n = false;
        this.k = false;
        this.o = true;
        this.r = new qht(this);
        this.p = new qhu();
        this.q = new qhv(this);
        context.getClass();
        this.g = context;
    }

    public static String o(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? a.bp(i, "Invalid: ") : "UNAVAILABLE" : "OPEN" : "CLOSED" : "UNKNOWN";
    }

    private final void t() {
        obs obsVarA = obs.a();
        lah.a();
        if (this.h) {
            lah.e(ywj.START_VOICE_SESSION_IGNORED_BECAUSE_IN_CALL, null);
            ((ype) ((ype) a.g()).ai((char) 7280)).u("Assistant is unavailable because in call.");
            obsVarA.c(this.g, mkn.C, R.string.voice_assistant_unavailable_in_call, 0);
            return;
        }
        yph yphVar = a;
        ((ype) ((ype) yphVar.g()).ai(7278)).w("Assistant is unavailable due to: %s", this.l);
        int i = this.l;
        if (i == 0) {
            lah.e(ywj.START_VOICE_SESSION_ASSISTANT_STATE_UNINITIALIZED, null);
            obsVarA.c(this.g, mkn.C, R.string.voice_assistant_error, 0);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                lah.e(ywj.START_VOICE_SESSION_MISSING_MICROPHONE_PERMISSION, null);
                obsVarA.c(this.g, mkn.C, R.string.voice_assistant_unavailable_permission, 0);
                return;
            } else {
                lah.e(ywj.START_VOICE_SESSION_ASSISTANT_STATE_UNAVAILABLE, null);
                obsVarA.c(this.g, mkn.C, R.string.voice_assistant_error, 0);
                return;
            }
        }
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 1) {
            lah.e(ywj.START_VOICE_SESSION_DEMAND_SPACE_PENDING_OPEN, null);
        } else if (iOrdinal == 3) {
            lah.e(ywj.START_VOICE_SESSION_DEMAND_SPACE_PENDING_CLOSE, null);
        } else {
            ((ype) ((ype) yphVar.h()).ai(7279)).y("Assistant initialized but unavailable. Internal state: %s", this.d);
            lah.e(ywj.START_VOICE_SESSION_ASSISTANT_STATE_INITIALIZED_BUT_UNAVAILABLE, null);
        }
    }

    private final boolean u(int i) {
        qhw qhwVar = this.d;
        if (qhwVar == qhw.d || qhwVar == qhw.b) {
            ((ype) ((ype) a.h()).ai((char) 7302)).u("Ignoring openDemandSpace call since the demand space is pending close or open");
            return false;
        }
        boolean z = (laj.d(i) || this.i == kxa.b) ? false : true;
        boolean z2 = laj.d(i) && this.d == qhw.a;
        if (q()) {
            return z || z2;
        }
        return false;
    }

    @Override // defpackage.kww
    public final void a(int i) {
        ((ype) a.l().ai(7289)).y("onAssistantStateChanged to state %s", i != 0 ? i != 1 ? i != 2 ? "UNAVAILABLE_PERMISSION_REQUIRED" : "UNAVAILABLE" : "INITIALIZED" : "UNINITIALIZED");
        this.l = i;
        p();
    }

    @Override // defpackage.kww
    public final void b() {
        this.m = null;
        if (!r()) {
            lah.a();
            lah.e(ywj.DEMAND_SPACE_ALREADY_CLOSED_ON_VOICE_SESSION_END, null);
        } else {
            this.d = qhw.a;
            this.i = kxa.a;
            p();
        }
    }

    @Override // defpackage.lhg
    public final void c() {
        ((ype) a.l().ai((char) 7303)).u("start");
        this.m = null;
        kwv kwvVarH = kfl.h();
        this.j = kwvVarH;
        kwvVarH.r(this);
        ebf.A().D(this.r);
        dup.e(this.g, this.q, new IntentFilter("android.intent.action.projected.KEY_EVENT"), null, 2);
        this.n = true;
        int i = qhq.a;
        int i2 = qhy.a;
        int i3 = qhr.a;
        mpd.b().g(this.p);
    }

    @Override // defpackage.lhg
    public final void d() {
        ((ype) a.l().ai((char) 7304)).u("stop");
        this.n = false;
        j(ywk.INTERRUPTED);
        this.d = qhw.a;
        this.i = kxa.a;
        p();
        this.j.I(this);
        this.j = null;
        ebf.A().E(this.r);
        this.h = false;
        this.g.unregisterReceiver(this.q);
        mpd.b().j(this.p);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.kww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r6) {
        /*
            r5 = this;
            qhw r0 = r5.d
            qhw r1 = defpackage.qhw.b
            r2 = 0
            if (r0 != r1) goto Lc
            qhw r6 = defpackage.qhw.c
            r5.d = r6
            goto L65
        Lc:
            qhw r1 = defpackage.qhw.c
            if (r0 != r1) goto L3f
            yph r0 = defpackage.qhx.a
            yop r0 = r0.f()
            ype r0 = (defpackage.ype) r0
            r1 = 7295(0x1c7f, float:1.0222E-41)
            yop r0 = r0.ai(r1)
            ype r0 = (defpackage.ype) r0
            kxa r1 = r5.i
            java.lang.String r3 = "onVoiceSessionReady: Already in OPEN state. Current trigger: %s"
            r0.y(r3, r1)
            defpackage.lah.a()
            ywj r0 = defpackage.ywj.DEMAND_SPACE_ALREADY_OPEN_ON_VOICE_SESSION_START
            defpackage.lah.e(r0, r2)
            boolean r6 = defpackage.laj.e(r6)
            if (r6 == 0) goto L38
            kxa r6 = defpackage.kxa.c
            goto L3a
        L38:
            kxa r6 = defpackage.kxa.b
        L3a:
            kxa r0 = r5.i
            if (r0 == r6) goto L68
            goto L65
        L3f:
            yph r0 = defpackage.qhx.a
            yop r0 = r0.f()
            ype r0 = (defpackage.ype) r0
            r3 = 7292(0x1c7c, float:1.0218E-41)
            yop r0 = r0.ai(r3)
            ype r0 = (defpackage.ype) r0
            qhw r3 = r5.d
            java.lang.String r4 = "onVoiceSessionReady: Session started externally or state mismatch (current: %s). Transitioning to OPEN."
            r0.y(r4, r3)
            r5.d = r1
            boolean r6 = defpackage.laj.e(r6)
            if (r6 == 0) goto L61
            kxa r6 = defpackage.kxa.c
            goto L63
        L61:
            kxa r6 = defpackage.kxa.b
        L63:
            r5.i = r6
        L65:
            r5.p()
        L68:
            ywk r6 = r5.m
            if (r6 == 0) goto L92
            boolean r6 = r5.n
            if (r6 == 0) goto L83
            yph r6 = defpackage.qhx.a
            yop r6 = r6.f()
            java.lang.String r0 = "Closing demand space due to a pending close request"
            r1 = 7294(0x1c7e, float:1.0221E-41)
            defpackage.a.bs(r6, r0, r1)
            ywk r6 = r5.m
            r5.j(r6)
            goto L90
        L83:
            yph r6 = defpackage.qhx.a
            yop r6 = r6.h()
            java.lang.String r0 = "Controller is not started, so ignoring pending close request"
            r1 = 7293(0x1c7d, float:1.022E-41)
            defpackage.a.bs(r6, r0, r1)
        L90:
            r5.m = r2
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhx.e(int):void");
    }

    @Override // defpackage.kxb
    public final eqj h() {
        return this.f;
    }

    @Override // defpackage.kxb
    public final eqj i() {
        return this.e;
    }

    @Override // defpackage.kxb
    public final void j(ywk ywkVar) {
        yph yphVar = a;
        ((ype) yphVar.l().ai(7276)).M("closeDemandSpace with cancel trigger %s, currentInternalState=%s", ywkVar.name(), this.d);
        qhw qhwVar = this.d;
        boolean z = qhwVar == qhw.a || qhwVar == qhw.d;
        qhw qhwVar2 = qhw.b;
        boolean z2 = ywkVar == ywk.INTERRUPTED;
        if (acmd.C()) {
            z2 |= ywkVar == ywk.SCRIM_CLICKED;
        }
        if (!z && (qhwVar != qhwVar2 || z2)) {
            this.d = qhw.d;
            p();
            this.j.n(ywkVar);
            return;
        }
        ((ype) ((ype) yphVar.h()).ai(7277)).y("Ignoring closeDemandSpace since it is already closed or pending, internalState: %s", this.d);
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            lah.a();
            lah.e(ywj.END_VOICE_SESSION_DEMAND_SPACE_ALREADY_CLOSED, null);
        } else if (iOrdinal == 1) {
            lah.a();
            lah.e(ywj.END_VOICE_SESSION_DEMAND_SPACE_RECENTLY_OPENED, null);
            this.m = ywkVar;
        } else {
            if (iOrdinal != 3) {
                return;
            }
            lah.a();
            lah.e(ywj.END_VOICE_SESSION_DEMAND_SPACE_PENDING_CLOSE, null);
        }
    }

    @Override // defpackage.kxb
    public final /* synthetic */ void k(int i) {
        n(i);
    }

    @Override // defpackage.kxb
    public final void l(int i) {
        ((ype) a.l().ai(7299)).D("openDemandSpaceWithNavigationTranscriptionRequest: trigger=%d, currentInternalState=%s", i, this.d);
        if (!u(i)) {
            lah.a();
            lah.f(i);
            t();
        } else {
            this.d = qhw.b;
            this.i = kxa.b;
            p();
            this.j.O(null);
        }
    }

    @Override // defpackage.kxb
    public final boolean m() {
        return this.n;
    }

    @Override // defpackage.kxb
    public final void n(int i) {
        ((ype) a.l().ai(7298)).D("openDemandSpace: trigger=%d, currentInternalState=%s", i, this.d);
        if (!u(i)) {
            lah.a();
            lah.f(i);
            t();
            return;
        }
        if (this.o) {
            tfk.a.b(tfj.GEARHEAD_ASSISTANT_COLD_STARTUP);
            this.o = false;
        } else {
            tfk.a.b(tfj.GEARHEAD_ASSISTANT_WARM_STARTUP);
        }
        this.d = qhw.b;
        this.i = laj.d(i) ? kxa.c : kxa.b;
        p();
        this.j.F(i);
    }

    public final void p() {
        laj.b(new qct(this, 16));
    }

    public final boolean q() {
        return this.l == 1 && !this.h;
    }

    public final boolean r() {
        return this.d != qhw.a;
    }

    public final boolean s() {
        return Objects.equals(this.j.g().e(), true);
    }

    @Override // defpackage.kww
    public final void f() {
    }

    @Override // defpackage.kww
    public final void g() {
    }
}
