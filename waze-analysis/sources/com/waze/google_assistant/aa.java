package com.waze.google_assistant;

import android.os.Bundle;
import com.google.android.libraries.assistant.appintegration.AssistantConfig;
import com.google.android.libraries.assistant.appintegration.AssistantIntegrationClient;
import com.google.android.libraries.assistant.appintegration.proto.NightModeStatus;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import com.waze.config.ConfigValues;
import com.waze.reports_v2.c.ds;
import com.waze.sound.fm;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public static final q f24060a = new q();

    /* renamed from: b, reason: collision with root package name */
    private final ds f24061b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ifs.a.f f24062c;

    /* renamed from: d, reason: collision with root package name */
    private final AssistantIntegrationClient f24063d;

    /* renamed from: e, reason: collision with root package name */
    private final h.g.a.l f24064e;

    /* renamed from: f, reason: collision with root package name */
    private final h.g.a.l f24065f;

    /* renamed from: g, reason: collision with root package name */
    private final c f24066g;

    /* renamed from: h, reason: collision with root package name */
    private final h.g.a.l f24067h;

    /* renamed from: i, reason: collision with root package name */
    private final h.g.a.q f24068i;

    /* renamed from: j, reason: collision with root package name */
    private final fm f24069j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.google_assistant.a.b f24070k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f24071l;
    private int m;
    private final w n;
    private int o;
    private String p;
    private com.waze.sharedui.e.c q;

    public aa(ds dsVar, com.waze.ifs.a.f fVar, AssistantIntegrationClient assistantIntegrationClient, h.g.a.l lVar, h.g.a.l lVar2, c cVar, h.g.a.l lVar3, h.g.a.q qVar, fm fmVar, com.waze.google_assistant.a.b bVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(dsVar, "reportingPositionSaver");
        h.g.b.x.f(fVar, "updateHandlers");
        h.g.b.x.f(assistantIntegrationClient, "assistantIntegrationClient");
        h.g.b.x.f(lVar, "runOnNativeManagerReady");
        h.g.b.x.f(lVar2, "runOnConfigSynced");
        h.g.b.x.f(cVar, "googleAssistantConfig");
        h.g.b.x.f(lVar3, "postOnMainThread");
        h.g.b.x.f(qVar, "addFuturesCallback");
        h.g.b.x.f(fmVar, "soundPlayer");
        h.g.b.x.f(bVar, "googleAssistantStatsSender");
        h.g.b.x.f(eVar, "logger");
        this.f24061b = dsVar;
        this.f24062c = fVar;
        this.f24063d = assistantIntegrationClient;
        this.f24064e = lVar;
        this.f24065f = lVar2;
        this.f24066g = cVar;
        this.f24067h = lVar3;
        this.f24068i = qVar;
        this.f24069j = fmVar;
        this.f24070k = bVar;
        this.f24071l = eVar;
        this.n = new w(this);
        s sVar = s.f24236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H() {
        this.f24071l.e("assistant finished");
        s sVar = s.f24236a;
        this.f24069j.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(boolean z) {
        AssistantIntegrationClient assistantIntegrationClient = this.f24063d;
        boolean zC = C();
        boolean z2 = assistantIntegrationClient.getConnectionState() == 2;
        if (zC || z2) {
            this.f24071l.e("not refreshing sdk availability, isConnected=" + zC + ", isConnecting=" + z2);
            return;
        }
        h.g.a.q qVar = this.f24068i;
        bm<AssistantConfig> assistantConfig = assistantIntegrationClient.getAssistantConfig();
        h.g.b.x.e(assistantConfig, "getAssistantConfig(...)");
        z zVar = new z(this, z);
        Executor executorY = cf.y();
        h.g.b.x.e(executorY, "directExecutor(...)");
        qVar.invoke(assistantConfig, zVar, executorY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(int i2) {
        int i3 = this.m;
        if (i2 != i3) {
            this.f24071l.e("updating sdk state, old=" + i3 + ", new= " + i2);
            this.m = i2;
            v(ab.SDK_STATE_CHANGED);
            ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_SDK_AVAILABLE_TO_USER.d(Boolean.valueOf(D()));
            ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_USER_CONNECTED_TO_SDK.d(Boolean.valueOf(E()));
        }
    }

    private final void K() {
        fm fmVar = this.f24069j;
        fmVar.e();
        fmVar.b();
        this.f24061b.d(new o(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object e(com.waze.google_assistant.aa r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.google_assistant.x
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.google_assistant.x r0 = (com.waze.google_assistant.x) r0
            int r1 = r0.f24252c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24252c = r1
            goto L18
        L13:
            com.waze.google_assistant.x r0 = new com.waze.google_assistant.x
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f24250a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f24252c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            com.waze.google_assistant.aa r6 = r0.f24254e
            r1 = r6
            com.waze.google_assistant.aa r1 = (com.waze.google_assistant.aa) r1
            com.waze.google_assistant.aa r0 = r0.f24253d
            r1 = r0
            com.waze.google_assistant.aa r1 = (com.waze.google_assistant.aa) r1
            e.b.c.b(r7)
            goto L6f
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            e.b.c.b(r7)
            com.waze.google_assistant.c r7 = r6.f24066g
            boolean r7 = r7.a()
            if (r7 == 0) goto L8c
            com.waze.shared_infra.i.e r7 = r6.f24071l
            com.waze.sharedui.e.c r2 = r6.q
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Overriding report location (previous value: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = ")"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r7.a(r2)
            com.waze.reports_v2.c.ds r7 = r6.f24061b
            r0.f24253d = r6
            r0.f24254e = r6
            r0.f24252c = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 == r1) goto L8b
            r0 = r6
        L6f:
            com.waze.sharedui.e.c r7 = (com.waze.sharedui.e.c) r7
            r6.q = r7
            com.waze.shared_infra.i.e r6 = r0.f24071l
            com.waze.sharedui.e.c r7 = r0.q
            java.util.Objects.toString(r7)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r1 = "Saved report location: "
            java.lang.String r7 = r1.concat(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.a(r7)
            r6 = r0
            goto L8c
        L8b:
            return r1
        L8c:
            com.waze.sharedui.e.c r6 = r6.q
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.google_assistant.aa.e(com.waze.google_assistant.aa, h.c.e):java.lang.Object");
    }

    static final h.ab g(aa aaVar, com.waze.sharedui.e.c cVar) {
        Objects.toString(cVar);
        aaVar.f24071l.a("Saved report location: ".concat(String.valueOf(cVar)));
        aaVar.q = cVar;
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void i(aa aaVar) {
        aaVar.f24071l.e("assistant active in mobile");
        s sVar = s.f24236a;
        aaVar.K();
    }

    static final void o(aa aaVar) {
        aaVar.f24063d.disconnect();
        aaVar.n.e();
    }

    static final void r(aa aaVar) {
        if (!c.c()) {
            aaVar.f24071l.e("config is ready, feature not enabled");
            aaVar.n();
            aaVar.J(0);
        } else {
            if (!aaVar.D() || aaVar.E()) {
                return;
            }
            if (!ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_ONBOARDING_POPUP_SHOWN.b().booleanValue() && !ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_DISCLOSURE_SHOWN.b().booleanValue() && ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_OPT_IN_FLOW_ENABLED.b().booleanValue()) {
                aaVar.f24071l.e("config is ready, presenting user agreement");
                aaVar.v(ab.OPEN_USER_AGREEMENT);
                return;
            }
            aaVar.f24071l.e("config is ready, connecting to sdk");
            try {
                aaVar.m();
            } catch (IllegalStateException e2) {
                aaVar.f24071l.c("cannot connect to the Google Assistant SDK", e2);
            }
        }
    }

    static final void t(aa aaVar) {
        aaVar.f24071l.e("connect attempt to sdk");
        try {
            aaVar.m();
        } catch (IllegalStateException e2) {
            aaVar.f24071l.c("cannot connect to the Google Assistant SDK", e2);
        }
    }

    public final void A(boolean z) {
        if (!z) {
            H();
            return;
        }
        this.f24071l.e("assistant active in car");
        s sVar = s.f24236a;
        K();
        this.f24070k.c(null);
    }

    public final boolean B() {
        return D() && !c.b();
    }

    public final boolean C() {
        return this.f24063d.getConnectionState() == 3;
    }

    public final boolean D() {
        if (!c.c()) {
            return false;
        }
        int i2 = this.m;
        return i2 == 1 || i2 == 2;
    }

    public final boolean E() {
        return this.m == 2;
    }

    public final boolean F() {
        return c.c() && c.b() && this.m != 0;
    }

    public final String f() {
        return this.p;
    }

    public final void l() {
        if (C()) {
            AssistantIntegrationClient assistantIntegrationClient = this.f24063d;
            assistantIntegrationClient.setVoicePlateMode(true != com.waze.nightmode.t.f() ? 2 : 1);
            assistantIntegrationClient.notifyNightModeStatusChanged(com.waze.nightmode.t.f() ? NightModeStatus.NIGHT_MODE_STATUS_DAY : NightModeStatus.NIGHT_MODE_STATUS_NIGHT);
        }
    }

    public final void m() {
        I(true);
    }

    public final void n() {
        if (C()) {
            this.f24067h.invoke(new p(this, 2));
        }
    }

    public final void p() {
        if (C()) {
            bd.q(this.f24063d.openVoicePlate(), new y(), cf.y());
        }
    }

    public final void q() {
        this.f24071l.e("on login");
        this.f24065f.invoke(new p(this, 0));
    }

    public final void s() {
        this.f24071l.a("onStart (refcount=" + this.o + ")");
        this.f24064e.invoke(new p(this, 3));
        this.o = this.o + 1;
    }

    public final void u() {
        this.f24071l.a("onStop (refcount=" + this.o + ")");
        int i2 = this.o + (-1);
        this.o = i2;
        if (i2 <= 0) {
            n();
            this.o = 0;
        }
    }

    public final void v(ab abVar) {
        h.g.b.x.f(abVar, "message");
        this.f24062c.d(abVar.a(), Bundle.EMPTY);
    }

    public final void w(boolean z) {
        this.f24071l.e("setAgreedToDisclosure, agreedToDisclosure=" + z);
        ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_AGREED_TO_DISCLOSURE.d(Boolean.valueOf(z));
        GoogleAssistantNativeManager googleAssistantNativeManager = GoogleAssistantNativeManager.getInstance();
        h.g.b.x.e(googleAssistantNativeManager, "getInstance(...)");
        ag.logAriConsent$default(googleAssistantNativeManager, null, 1, null);
        if (z) {
            m();
        } else {
            v(ab.ON_USER_AGREEMENT_DECLINED);
            n();
        }
    }

    public final void x(a aVar) {
        if (aVar != null) {
            Iterator<E> it = r.f24235a.iterator();
            while (it.hasNext()) {
                this.f24062c.b(((ab) it.next()).a(), aVar);
            }
        }
    }

    protected final void y(String str) {
        this.p = str;
    }

    public final void z(a aVar) {
        if (aVar != null) {
            Iterator<E> it = r.f24235a.iterator();
            while (it.hasNext()) {
                this.f24062c.c(((ab) it.next()).a(), aVar);
            }
        }
    }
}
