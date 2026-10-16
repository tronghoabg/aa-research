package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bv {

    /* renamed from: a, reason: collision with root package name */
    private String f9495a;

    /* renamed from: b, reason: collision with root package name */
    private String f9496b;

    /* renamed from: c, reason: collision with root package name */
    private long f9497c;

    /* renamed from: d, reason: collision with root package name */
    private byte f9498d;

    public final bw a() {
        String str;
        String str2;
        if (this.f9498d == 1 && (str = this.f9495a) != null && (str2 = this.f9496b) != null) {
            return new aq(str, str2, this.f9497c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9495a == null) {
            sb.append(" name");
        }
        if (this.f9496b == null) {
            sb.append(" code");
        }
        if (this.f9498d == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j2) {
        this.f9497c = j2;
        this.f9498d = (byte) 1;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null code");
        }
        this.f9496b = str;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f9495a = str;
    }
}
