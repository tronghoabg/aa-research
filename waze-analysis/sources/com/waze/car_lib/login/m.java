package com.waze.car_lib.login;

import androidx.autofill.HintConstants;
import com.waze.NativeManager;
import com.waze.cw;
import com.waze.install.v;
import h.ab;
import h.g.b.ar;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m implements cw, org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f20314a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f20315b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f20316c;

    /* renamed from: d, reason: collision with root package name */
    private final af f20317d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f20318e;

    /* renamed from: f, reason: collision with root package name */
    private final bn f20319f;

    public m() {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("LoginController");
        x.e(eVarD, "create(...)");
        this.f20314a = eVarD;
        m mVar = this;
        h.h hVar = h.h.f48130a;
        this.f20315b = h.g.b(hVar, new j(mVar, 1));
        this.f20316c = h.g.b(hVar, new j(mVar, 0));
        this.f20317d = aj.f();
        this.f20318e = h.g.b(hVar, new j(mVar, 2));
        this.f20319f = ck.b(new LoginController$LoginState(g.f20304a));
    }

    static final ab b(m mVar, boolean z) {
        if (!z) {
            mVar.k(mVar.f20319f, "loginWithUsernameAndPassword2", new com.waze.alerters.h(8));
        }
        return ab.f48028a;
    }

    private final com.waze.install.x j() {
        return (com.waze.install.x) this.f20316c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(bn bnVar, String str, h.g.a.l lVar) {
        Object objD;
        LoginController$LoginState loginController$LoginState = (LoginController$LoginState) bnVar.d();
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, lVar.invoke(objD)));
        this.f20314a.a("login state changed at " + str + " from " + loginController$LoginState + " to " + bnVar.d());
    }

    @Override // com.waze.cw
    public final void a() {
        k(this.f20319f, "notifyLoginDone", new com.waze.alerters.h(6));
    }

    public final ch d() {
        return this.f20319f;
    }

    public final void e(String str, String str2) {
        x.f(str, HintConstants.AUTOFILL_HINT_USERNAME);
        x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
        bn bnVar = this.f20319f;
        if (((LoginController$LoginState) bnVar.d()).getAreCredentialsMissing()) {
            k(bnVar, "loginWithUsernameAndPassword1", new com.waze.alerters.h(7));
            ((o) this.f20315b.getValue()).b(str, str2, new b(this, 0));
        }
    }

    public final void f(boolean z, String str) {
        x.f(str, "appDownloadUrl");
        k(this.f20319f, "notifyOnAppVersion", new com.waze.main_screen.c.c.b(z, str, 1));
    }

    public final void g() {
        k(this.f20319f, "notifyOnCredentialsMissing", new com.waze.alerters.h(9));
        com.waze.install.x xVarJ = j();
        int i2 = ar.f48106a;
        xVarJ.f(new h.g.b.m(v.class));
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    public final void h() {
        NativeManager.runOnUserLoggedIn(new com.google.android.material.internal.o(this, 11));
        com.waze.install.x xVarJ = j();
        int i2 = ar.f48106a;
        kotlinx.coroutines.b.k kVarK = ai.K(xVarJ.b(new h.g.b.m(com.waze.install.o.class)), new l(this, null, 1, null));
        af afVar = this.f20317d;
        ai.m(kVarK, afVar);
        ai.m(ai.K(j().c(new h.g.b.m(v.class)), new k(this, null)), afVar);
        ai.m(ai.K(((com.waze.al.a.a) this.f20318e.getValue()).a(), new l(this, null, 0)), afVar);
    }
}
