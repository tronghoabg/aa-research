package com.google.firebase.crashlytics.a.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final aj f9192a;

    /* renamed from: b, reason: collision with root package name */
    private final i f9193b;

    public j(aj ajVar, com.google.firebase.crashlytics.a.f.c cVar) {
        this.f9192a = ajVar;
        this.f9193b = new i(cVar);
    }

    public final String a(String str) {
        return this.f9193b.a(str);
    }

    public final void b(com.google.firebase.sessions.a.e eVar) {
        com.google.firebase.crashlytics.a.i.a().b("App Quality Sessions session changed: ".concat(eVar.toString()));
        this.f9193b.b(eVar.a());
    }

    public final void c(String str) {
        this.f9193b.c(str);
    }

    public final boolean d() {
        return this.f9192a.e();
    }
}
