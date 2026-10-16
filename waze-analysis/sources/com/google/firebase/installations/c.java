package com.google.firebase.installations;

import android.support.v7.app.p;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.o.ag;
import com.google.android.gms.o.t;
import com.google.firebase.components.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9994a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f9995b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.e f9996c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.installations.c.a f9997d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.installations.b.b f9998e;

    /* renamed from: f, reason: collision with root package name */
    private final m f9999f;

    /* renamed from: g, reason: collision with root package name */
    private final w f10000g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f10001h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorService f10002i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f10003j;

    /* renamed from: k, reason: collision with root package name */
    private String f10004k;

    /* renamed from: l, reason: collision with root package name */
    private final Set f10005l;
    private final List m;

    static {
        new b();
    }

    c(com.google.firebase.e eVar, com.google.firebase.g.c cVar, ExecutorService executorService, Executor executor) {
        com.google.firebase.installations.c.a aVar = new com.google.firebase.installations.c.a(eVar.a(), cVar);
        com.google.firebase.installations.b.b bVar = new com.google.firebase.installations.b.b(eVar);
        m mVarB = m.b();
        w wVar = new w(new com.google.firebase.components.l(eVar, 2));
        int i2 = k.f10042a;
        this.f10001h = new Object();
        this.f10005l = new HashSet();
        this.m = new ArrayList();
        this.f9996c = eVar;
        this.f9997d = aVar;
        this.f9998e = bVar;
        this.f9999f = mVarB;
        this.f10000g = wVar;
        this.f10002i = executorService;
        this.f10003j = executor;
    }

    public static /* synthetic */ void g(c cVar) throws e {
        a aVarB;
        com.google.firebase.installations.b.d dVarA;
        com.google.firebase.installations.b.d dVarA2;
        Object obj = f9995b;
        synchronized (obj) {
            aVarB = a.b(cVar.f9996c.a());
            try {
                dVarA = cVar.f9998e.a();
                if (aVarB != null) {
                    aVarB.a();
                }
            } finally {
            }
        }
        try {
            if (dVarA.b() || dVarA.e()) {
                com.google.firebase.installations.c.c cVarB = cVar.f9997d.b(cVar.b(), dVarA.j(), cVar.d(), cVar.c(), (dVarA.j() == null || dVarA.j().length() != 11) ? null : cVar.i().b());
                int iD = cVarB.d();
                int i2 = iD - 1;
                if (iD == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    String strB = cVarB.b();
                    String strC = cVarB.c();
                    long jA = cVar.f9999f.a();
                    String strC2 = cVarB.a().c();
                    long jB = cVarB.a().b();
                    com.google.firebase.installations.b.c cVarH = dVarA.h();
                    cVarH.d(strB);
                    cVarH.g(4);
                    cVarH.b(strC2);
                    cVarH.f(strC);
                    cVarH.c(jB);
                    cVarH.h(jA);
                    dVarA2 = cVarH.a();
                } else {
                    if (i2 != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    dVarA2 = dVarA.n();
                }
            } else {
                m mVar = cVar.f9999f;
                if (!mVar.c(dVarA)) {
                    return;
                }
                com.google.firebase.installations.c.f fVarC = cVar.f9997d.c(cVar.b(), dVarA.j(), cVar.d(), dVarA.l());
                int iD2 = fVarC.d();
                int i3 = iD2 - 1;
                if (iD2 == 0) {
                    throw null;
                }
                if (i3 == 0) {
                    String strC3 = fVarC.c();
                    long jB2 = fVarC.b();
                    long jA2 = mVar.a();
                    com.google.firebase.installations.b.c cVarH2 = dVarA.h();
                    cVarH2.b(strC3);
                    cVarH2.c(jB2);
                    cVarH2.h(jA2);
                    dVarA2 = cVarH2.a();
                } else if (i3 == 1) {
                    dVarA2 = dVarA.n();
                } else {
                    if (i3 != 2) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    cVar.o(null);
                    com.google.firebase.installations.b.c cVarH3 = dVarA.h();
                    cVarH3.g(2);
                    dVarA2 = cVarH3.a();
                }
            }
            synchronized (obj) {
                aVarB = a.b(cVar.f9996c.a());
                try {
                    cVar.f9998e.b(dVarA2);
                    if (aVarB != null) {
                        aVarB.a();
                    }
                } finally {
                }
            }
            cVar.p(dVarA, dVarA2);
            if (dVarA2.d()) {
                cVar.o(dVarA2.j());
            }
            if (dVarA2.b()) {
                cVar.m(new e());
            } else if (dVarA2.c()) {
                cVar.m(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                cVar.n(dVarA2);
            }
        } catch (e e2) {
            cVar.m(e2);
        }
    }

    private final com.google.firebase.installations.b.a i() {
        return (com.google.firebase.installations.b.a) this.f10000g.a();
    }

    private final synchronized String j() {
        return this.f10004k;
    }

    private final void k(l lVar) {
        synchronized (this.f10001h) {
            this.m.add(lVar);
        }
    }

    private final void l() {
        av.l(c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        av.l(d(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        av.l(b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String strC = c();
        long j2 = m.f10045a;
        av.d(strC.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        av.d(m.d(b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private final void m(Exception exc) {
        synchronized (this.f10001h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    private final void n(com.google.firebase.installations.b.d dVar) {
        synchronized (this.f10001h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private final synchronized void o(String str) {
        this.f10004k = str;
    }

    private final synchronized void p(com.google.firebase.installations.b.d dVar, com.google.firebase.installations.b.d dVar2) {
        Set set = this.f10005l;
        if (set.size() != 0 && !TextUtils.equals(dVar.j(), dVar2.j())) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((com.google.firebase.installations.a.a) it.next()).a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        com.google.firebase.installations.b.d dVarA;
        String strA;
        synchronized (f9995b) {
            com.google.firebase.e eVar = this.f9996c;
            a aVarB = a.b(eVar.a());
            try {
                com.google.firebase.installations.b.b bVar = this.f9998e;
                dVarA = bVar.a();
                if (dVarA.c()) {
                    if ((eVar.g().equals("CHIME_ANDROID_SDK") || eVar.n()) && dVarA.m() == 1) {
                        strA = i().a();
                        if (TextUtils.isEmpty(strA)) {
                            strA = k.a();
                        }
                    } else {
                        strA = k.a();
                    }
                    com.google.firebase.installations.b.c cVarH = dVarA.h();
                    cVarH.d(strA);
                    cVarH.g(3);
                    dVarA = cVarH.a();
                    bVar.b(dVarA);
                }
                if (aVarB != null) {
                    aVarB.a();
                }
            } catch (Throwable th) {
                if (aVarB != null) {
                    aVarB.a();
                }
                throw th;
            }
        }
        n(dVarA);
        this.f10003j.execute(new p(this, 5));
    }

    @Override // com.google.firebase.installations.d
    public final t a() {
        l();
        String strJ = j();
        if (strJ != null) {
            return ag.c(strJ);
        }
        com.google.android.gms.o.w wVar = new com.google.android.gms.o.w();
        k(new h(wVar));
        t tVarA = wVar.a();
        this.f10002i.execute(new p(this, 6));
        return tVarA;
    }

    final String b() {
        return this.f9996c.d().b();
    }

    final String c() {
        return this.f9996c.d().c();
    }

    final String d() {
        return this.f9996c.d().e();
    }

    @Override // com.google.firebase.installations.d
    public final t h() {
        l();
        com.google.android.gms.o.w wVar = new com.google.android.gms.o.w();
        k(new g(this.f9999f, wVar));
        t tVarA = wVar.a();
        this.f10002i.execute(new p(this, 7));
        return tVarA;
    }
}
