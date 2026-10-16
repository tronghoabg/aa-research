package com.waze.aq;

import android.content.Context;
import com.google.android.gms.o.t;
import com.waze.config.ConfigValues;
import com.waze.location.q;
import h.ab;
import h.g.b.w;
import h.g.b.x;
import java.io.IOException;
import java.net.UnknownHostException;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f15455a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f15456b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15457c;

    /* renamed from: d, reason: collision with root package name */
    private final h.n.l f15458d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15459e;

    /* renamed from: f, reason: collision with root package name */
    private final h.n.l f15460f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.a.o f15461g;

    public c(com.waze.shared_infra.q.e eVar, com.waze.shared_infra.i.b bVar, q qVar, com.waze.shared_infra.i.e eVar2) {
        x.f(eVar, "clock");
        x.f(bVar, "nonFatalReporter");
        x.f(qVar, "config");
        x.f(eVar2, "logger");
        this.f15455a = eVar;
        this.f15456b = bVar;
        this.f15457c = eVar2;
        this.f15458d = new h.n.l("code: 403 body: Requests from this Android client application .*? are blocked");
        this.f15459e = "code: 403 body: App attestation failed";
        this.f15460f = new h.n.l("code: (\\d{3})");
        this.f15461g = w.c(1, kotlinx.coroutines.a.a.f51273c, null, 4);
    }

    static final ab b(c cVar, long j2, CompletableDeferred completableDeferred, com.google.firebase.appcheck.b bVar) {
        cVar.f15457c.a("Token generation completed successfully in " + (cVar.f15455a.a() - j2) + " millis");
        String strB = bVar.b();
        x.e(strB, "getToken(...)");
        completableDeferred.a(new n(strB));
        return ab.f48028a;
    }

    static final void d(c cVar, CompletableDeferred completableDeferred, Exception exc) {
        h.n.i iVarE;
        h.n.f fVarA;
        String strA;
        x.f(exc, "exception");
        Exception exc2 = exc;
        cVar.f15457c.c("Token generation failed", exc2);
        cVar.f15456b.a(exc2, null);
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        String str = message;
        h.n.g gVarH = h.n.l.h(cVar.f15460f, str);
        Integer numF = null;
        if (gVarH != null && (iVarE = gVarH.e()) != null && (fVarA = iVarE.a(1)) != null && (strA = fVarA.a()) != null) {
            numF = h.n.o.f(strA);
        }
        completableDeferred.a(new m(exc instanceof UnknownHostException ? new i(numF) : exc instanceof IOException ? new j(numF) : exc instanceof com.google.firebase.h ? h.n.o.F(str, cVar.f15459e, false) ? new d(numF) : cVar.f15458d.f(str) ? new e(numF) : new h(numF) : new g(numF)));
    }

    private final CompletableDeferred f() {
        long jA = this.f15455a.a();
        CompletableDeferred completableDeferredJ = bo.j();
        Boolean boolB = ConfigValues.CONFIG_VALUE_APP_CHECK_CALL_LIMITED_USE_TOKEN_API.b();
        x.e(boolB, "getValue(...)");
        if (boolB.booleanValue()) {
            t tVarB = com.google.firebase.appcheck.a.a.b.b(com.google.firebase.b.f8908a).b();
            x.e(tVarB, "getLimitedUseAppCheckToken(...)");
            g(tVarB, jA, completableDeferredJ);
            return completableDeferredJ;
        }
        com.google.firebase.appcheck.d dVarB = com.google.firebase.appcheck.a.a.b.b(com.google.firebase.b.f8908a);
        Boolean boolB2 = ConfigValues.CONFIG_VALUE_SIGNUP_ANDROID_APP_CHECK_FORCE_TOKEN_REFRESH.b();
        x.e(boolB2, "getValue(...)");
        t tVarA = dVarB.a(boolB2.booleanValue());
        x.e(tVarA, "getAppCheckToken(...)");
        g(tVarA, jA, completableDeferredJ);
        return completableDeferredJ;
    }

    private final void g(t tVar, final long j2, final CompletableDeferred completableDeferred) {
        tVar.r(new com.google.firebase.messaging.n(new h.g.a.l() { // from class: com.waze.aq.a
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return c.b(this.f15450a, j2, completableDeferred, (com.google.firebase.appcheck.b) obj);
            }
        }, 6));
        tVar.o(new com.google.android.gms.o.m() { // from class: com.waze.aq.b
            @Override // com.google.android.gms.o.m
            public final void onFailure(Exception exc) {
                c.d(this.f15453a, completableDeferred, exc);
            }
        });
    }

    @Override // com.waze.aq.o
    public final Object a(h.c.e eVar) {
        CompletableDeferred completableDeferredF = (CompletableDeferred) kotlinx.coroutines.a.t.a(this.f15461g.h());
        if (completableDeferredF == null) {
            completableDeferredF = f();
        }
        return completableDeferredF.c(eVar);
    }

    @Override // com.waze.aq.o
    public final void c() {
        this.f15457c.a("Starting token generation warm-up");
        this.f15461g.i(f());
    }

    @Override // com.waze.aq.o
    public final void e(Context context) {
        x.f(context, "context");
        this.f15457c.e("Initializing integrity token provider");
        com.google.firebase.appcheck.playintegrity.a.a();
        com.google.firebase.appcheck.a.a.b.b(com.google.firebase.b.f8908a).d();
    }
}
