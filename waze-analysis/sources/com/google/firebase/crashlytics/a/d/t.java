package com.google.firebase.crashlytics.a.d;

import com.google.android.libraries.phenotype.client.stable.au;
import com.google.d.b.w;
import com.google.firebase.crashlytics.a.e.cj;
import com.google.firebase.crashlytics.a.e.ck;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final h f9273a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.c.n f9274b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9275c;

    /* renamed from: d, reason: collision with root package name */
    private final s f9276d = new s(this, false);

    /* renamed from: e, reason: collision with root package name */
    private final s f9277e = new s(this, true);

    /* renamed from: g, reason: collision with root package name */
    private final w f9279g = new w();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicMarkableReference f9278f = new AtomicMarkableReference(null, false);

    public t(String str, com.google.firebase.crashlytics.a.f.c cVar, com.google.firebase.crashlytics.a.c.n nVar) {
        this.f9275c = str;
        this.f9273a = new h(cVar);
        this.f9274b = nVar;
    }

    public static t c(String str, com.google.firebase.crashlytics.a.f.c cVar, com.google.firebase.crashlytics.a.c.n nVar) {
        h hVar = new h(cVar);
        t tVar = new t(str, cVar, nVar);
        ((o) tVar.f9276d.f9269a.getReference()).c(hVar.g(str, false));
        ((o) tVar.f9277e.f9269a.getReference()).c(hVar.g(str, true));
        tVar.f9278f.set(hVar.e(str), false);
        tVar.f9279g.j(hVar.f(str));
        return tVar;
    }

    public static String e(String str, com.google.firebase.crashlytics.a.f.c cVar) {
        return new h(cVar).e(str);
    }

    public static /* synthetic */ void k(t tVar) {
        boolean z;
        String str;
        AtomicMarkableReference atomicMarkableReference = tVar.f9278f;
        synchronized (atomicMarkableReference) {
            z = false;
            if (atomicMarkableReference.isMarked()) {
                str = (String) atomicMarkableReference.getReference();
                atomicMarkableReference.set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            tVar.f9273a.j(tVar.f9275c, str);
        }
    }

    public final List f() {
        List listI = this.f9279g.i();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listI.size(); i2++) {
            q qVar = (q) listI.get(i2);
            cj cjVar = new cj();
            ck ckVar = new ck();
            ckVar.c(qVar.e());
            ckVar.b(qVar.d());
            cjVar.d(ckVar.a());
            cjVar.b(qVar.b());
            cjVar.c(qVar.c());
            cjVar.e(qVar.a());
            arrayList.add(cjVar.a());
        }
        return arrayList;
    }

    public final Map g() {
        return this.f9276d.a();
    }

    public final Map h() {
        return this.f9277e.a();
    }

    public final void i(String str) {
        AtomicMarkableReference atomicMarkableReference = this.f9278f;
        String strA = o.a(str, 1024);
        synchronized (atomicMarkableReference) {
            if (com.google.firebase.crashlytics.a.c.g.n(strA, (String) atomicMarkableReference.getReference())) {
                return;
            }
            atomicMarkableReference.set(strA, true);
            this.f9274b.a(new com.google.firebase.appcheck.playintegrity.a.c(this, 2));
        }
    }

    public final void l(String str, String str2) {
        this.f9276d.d(str, str2);
    }

    public final void m() {
        this.f9276d.c();
    }

    public final void n(String str) {
        this.f9277e.d("com.crashlytics.version-control-info", str);
    }

    public final void o(List list) {
        w wVar = this.f9279g;
        synchronized (wVar) {
            if (wVar.j(list)) {
                this.f9274b.a(new au(this, wVar.i(), 3));
            }
        }
    }
}
