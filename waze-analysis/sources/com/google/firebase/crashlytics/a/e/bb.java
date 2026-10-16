package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    private String f9418a;

    /* renamed from: b, reason: collision with root package name */
    private String f9419b;

    /* renamed from: c, reason: collision with root package name */
    private String f9420c;

    public final bc a() {
        String str;
        String str2;
        String str3 = this.f9418a;
        if (str3 != null && (str = this.f9419b) != null && (str2 = this.f9420c) != null) {
            return new ad(str3, str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9418a == null) {
            sb.append(" arch");
        }
        if (this.f9419b == null) {
            sb.append(" libraryName");
        }
        if (this.f9420c == null) {
            sb.append(" buildId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null arch");
        }
        this.f9418a = str;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null buildId");
        }
        this.f9420c = str;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f9419b = str;
    }
}
