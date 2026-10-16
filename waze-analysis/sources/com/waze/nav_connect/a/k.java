package com.waze.nav_connect.a;

import android.app.PendingIntent;
import com.waze.nav_connect.NavConnectNativeManager;
import h.g.b.x;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k implements f {

    /* renamed from: a, reason: collision with root package name */
    private final NavConnectNativeManager f30734a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f30735b;

    /* renamed from: c, reason: collision with root package name */
    private final af f30736c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f30737d;

    /* renamed from: e, reason: collision with root package name */
    private q f30738e;

    /* renamed from: f, reason: collision with root package name */
    private q f30739f;

    public k(NavConnectNativeManager navConnectNativeManager, ab abVar, com.waze.shared_infra.i.e eVar) {
        x.f(navConnectNativeManager, "navConnectNativeManager");
        x.f(abVar, "dispatcher");
        x.f(eVar, "logger");
        this.f30734a = navConnectNativeManager;
        this.f30735b = eVar;
        af afVarE = aj.e(abVar);
        this.f30736c = afVarE;
        this.f30737d = navConnectNativeManager.getSessionState();
        ai.m(ai.K(ai.E(new j(m.f30742a, navConnectNativeManager.getSessionState(), null)), new g(this, null)), afVarE);
    }

    public static final /* synthetic */ void e(k kVar, String str) {
        q qVar = kVar.f30739f;
        if (x.n(qVar != null ? qVar.b() : null, str)) {
            kVar.f30738e = kVar.f30739f;
            kVar.f30739f = null;
        } else {
            kVar.f30738e = new q(str, null);
            kVar.f30735b.a("stateToken is different than the incoming token");
        }
    }

    @Override // com.waze.nav_connect.a.f
    public final PendingIntent a() {
        q qVar = this.f30738e;
        if (qVar != null) {
            return qVar.a();
        }
        return null;
    }

    @Override // com.waze.nav_connect.a.f
    public final ch b() {
        return this.f30737d;
    }

    @Override // com.waze.nav_connect.a.f
    public final void c(boolean z, String str) {
        x.f(str, "consentVersion");
        ch chVar = this.f30737d;
        if ((chVar.d() instanceof l) && !z) {
            com.waze.nav_connect.f.setUserConsent$default(this.f30734a, false, str, null, 4, null);
            return;
        }
        if ((chVar.d() instanceof n) && z) {
            com.waze.nav_connect.f.setUserConsent$default(this.f30734a, true, str, null, 4, null);
            return;
        }
        if (chVar.d() instanceof p) {
            com.waze.nav_connect.f.setUserConsent$default(this.f30734a, z, str, null, 4, null);
            return;
        }
        this.f30735b.g("Skipping consent change, invalid conditions. consent=" + z + ", version=" + str + ", current session state=" + chVar.d());
    }

    @Override // com.waze.nav_connect.a.f
    public final void d(String str, PendingIntent pendingIntent) {
        x.f(str, "token");
        q qVar = this.f30738e;
        if (x.n(qVar != null ? qVar.b() : null, str)) {
            this.f30735b.a("sessionPendingIntentInfo already contains this token: ".concat(str));
            return;
        }
        q qVar2 = this.f30739f;
        if (x.n(qVar2 != null ? qVar2.b() : null, str)) {
            this.f30735b.a("incomingPendingIntentInfo already contains this token: ".concat(str));
        } else {
            this.f30739f = new q(str, pendingIntent);
            this.f30735b.a("Successfully stored incoming PendingIntent with token: ".concat(str));
        }
    }
}
