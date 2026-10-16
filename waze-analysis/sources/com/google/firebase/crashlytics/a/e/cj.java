package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class cj {

    /* renamed from: a, reason: collision with root package name */
    private cl f9531a;

    /* renamed from: b, reason: collision with root package name */
    private String f9532b;

    /* renamed from: c, reason: collision with root package name */
    private String f9533c;

    /* renamed from: d, reason: collision with root package name */
    private long f9534d;

    /* renamed from: e, reason: collision with root package name */
    private byte f9535e;

    public final cm a() {
        cl clVar;
        String str;
        String str2;
        if (this.f9535e == 1 && (clVar = this.f9531a) != null && (str = this.f9532b) != null && (str2 = this.f9533c) != null) {
            return new aw(clVar, str, str2, this.f9534d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9531a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.f9532b == null) {
            sb.append(" parameterKey");
        }
        if (this.f9533c == null) {
            sb.append(" parameterValue");
        }
        if (this.f9535e == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f9532b = str;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f9533c = str;
    }

    public final void d(cl clVar) {
        this.f9531a = clVar;
    }

    public final void e(long j2) {
        this.f9534d = j2;
        this.f9535e = (byte) 1;
    }
}
