package com.google.firebase.crashlytics.a.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.firebase.d.a f9267a;

    static {
        com.google.firebase.d.b.d dVar = new com.google.firebase.d.b.d();
        dVar.g(b.f9233a);
        f9267a = dVar.b();
    }

    public static q f(String str, String str2, String str3, String str4, long j2) {
        if (str3.length() > 256) {
            str3 = str3.substring(0, 256);
        }
        return new c(str, str2, str3, str4, j2);
    }

    public abstract long a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();
}
