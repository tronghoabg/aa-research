package com.bumptech.glide.load;

import java.security.MessageDigest;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final q f3508a = new p();

    /* renamed from: b, reason: collision with root package name */
    private final Object f3509b;

    /* renamed from: c, reason: collision with root package name */
    private final q f3510c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3511d;

    /* renamed from: e, reason: collision with root package name */
    private volatile byte[] f3512e;

    private r(String str, Object obj, q qVar) {
        com.bumptech.glide.g.p.c(str);
        this.f3511d = str;
        this.f3509b = obj;
        com.bumptech.glide.g.p.f(qVar);
        this.f3510c = qVar;
    }

    public static r a(String str, Object obj, q qVar) {
        return new r(str, obj, qVar);
    }

    public static r b(String str) {
        return new r(str, null, f3508a);
    }

    public static r c(String str, Object obj) {
        return new r(str, obj, f3508a);
    }

    public final Object d() {
        return this.f3509b;
    }

    public final void e(Object obj, MessageDigest messageDigest) {
        if (this.f3512e == null) {
            this.f3512e = this.f3511d.getBytes(o.f3507a);
        }
        this.f3510c.a(this.f3512e, obj, messageDigest);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f3511d.equals(((r) obj).f3511d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3511d.hashCode();
    }

    public final String toString() {
        return "Option{key='" + this.f3511d + "'}";
    }
}
