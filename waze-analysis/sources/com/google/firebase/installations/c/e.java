package com.google.firebase.installations.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f10025a;

    /* renamed from: b, reason: collision with root package name */
    private long f10026b;

    /* renamed from: c, reason: collision with root package name */
    private byte f10027c;

    /* renamed from: d, reason: collision with root package name */
    private int f10028d;

    public final f a() {
        if (this.f10027c == 1) {
            return new f(this.f10025a, this.f10026b, this.f10028d);
        }
        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }

    public final void b(int i2) {
        this.f10028d = i2;
    }

    public final void c(String str) {
        this.f10025a = str;
    }

    public final void d(long j2) {
        this.f10026b = j2;
        this.f10027c = (byte) 1;
    }
}
