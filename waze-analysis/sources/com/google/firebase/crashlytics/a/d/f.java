package com.google.firebase.crashlytics.a.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final e f9239a = new e();

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.f.c f9240b;

    /* renamed from: c, reason: collision with root package name */
    private d f9241c;

    public f(com.google.firebase.crashlytics.a.f.c cVar) {
        this.f9240b = cVar;
        this.f9241c = f9239a;
    }

    public final String a() {
        return this.f9241c.a();
    }

    public final void b() {
        this.f9241c.c();
    }

    public final void c(String str) {
        this.f9241c.b();
        this.f9241c = f9239a;
        if (str == null) {
            return;
        }
        this.f9241c = new p(this.f9240b.f(str, "userlog"));
    }

    public final void d(long j2, String str) {
        this.f9241c.d(j2, str);
    }

    public final byte[] e() {
        return this.f9241c.e();
    }

    public f(com.google.firebase.crashlytics.a.f.c cVar, String str) {
        this(cVar);
        c(str);
    }
}
