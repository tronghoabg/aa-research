package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bj {

    /* renamed from: a, reason: collision with root package name */
    private String f9443a;

    /* renamed from: b, reason: collision with root package name */
    private String f9444b;

    /* renamed from: c, reason: collision with root package name */
    private String f9445c;

    /* renamed from: d, reason: collision with root package name */
    private String f9446d;

    /* renamed from: e, reason: collision with root package name */
    private String f9447e;

    /* renamed from: f, reason: collision with root package name */
    private String f9448f;

    public final bl a() {
        String str;
        String str2 = this.f9443a;
        if (str2 != null && (str = this.f9444b) != null) {
            return new ai(str2, str, this.f9445c, this.f9446d, this.f9447e, this.f9448f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9443a == null) {
            sb.append(" identifier");
        }
        if (this.f9444b == null) {
            sb.append(" version");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        this.f9447e = str;
    }

    public final void c(String str) {
        this.f9448f = str;
    }

    public final void d(String str) {
        this.f9445c = str;
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        this.f9443a = str;
    }

    public final void f(String str) {
        this.f9446d = str;
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null version");
        }
        this.f9444b = str;
    }
}
