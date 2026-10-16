package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class by {

    /* renamed from: a, reason: collision with root package name */
    private long f9503a;

    /* renamed from: b, reason: collision with root package name */
    private String f9504b;

    /* renamed from: c, reason: collision with root package name */
    private String f9505c;

    /* renamed from: d, reason: collision with root package name */
    private long f9506d;

    /* renamed from: e, reason: collision with root package name */
    private int f9507e;

    /* renamed from: f, reason: collision with root package name */
    private byte f9508f;

    public final bz a() {
        String str;
        if (this.f9508f == 7 && (str = this.f9504b) != null) {
            return new as(this.f9503a, str, this.f9505c, this.f9506d, this.f9507e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f9508f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.f9504b == null) {
            sb.append(" symbol");
        }
        if ((this.f9508f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f9508f & 4) == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        this.f9505c = str;
    }

    public final void c(int i2) {
        this.f9507e = i2;
        this.f9508f = (byte) (this.f9508f | 4);
    }

    public final void d(long j2) {
        this.f9506d = j2;
        this.f9508f = (byte) (this.f9508f | 2);
    }

    public final void e(long j2) {
        this.f9503a = j2;
        this.f9508f = (byte) (this.f9508f | 1);
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null symbol");
        }
        this.f9504b = str;
    }
}
