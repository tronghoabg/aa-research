package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bq {

    /* renamed from: a, reason: collision with root package name */
    private long f9479a;

    /* renamed from: b, reason: collision with root package name */
    private long f9480b;

    /* renamed from: c, reason: collision with root package name */
    private String f9481c;

    /* renamed from: d, reason: collision with root package name */
    private String f9482d;

    /* renamed from: e, reason: collision with root package name */
    private byte f9483e;

    public final br a() {
        String str;
        if (this.f9483e == 3 && (str = this.f9481c) != null) {
            return new ao(this.f9479a, this.f9480b, str, this.f9482d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f9483e & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((this.f9483e & 2) == 0) {
            sb.append(" size");
        }
        if (this.f9481c == null) {
            sb.append(" name");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j2) {
        this.f9479a = j2;
        this.f9483e = (byte) (this.f9483e | 1);
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f9481c = str;
    }

    public final void d(long j2) {
        this.f9480b = j2;
        this.f9483e = (byte) (this.f9483e | 2);
    }

    public final void e(byte[] bArr) {
        this.f9482d = new String(bArr, cu.f9545b);
    }

    public final void f(String str) {
        this.f9482d = str;
    }
}
