package com.waze.log;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f25437a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25438b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25439c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25440d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25441e;

    public b(int i2, String str, String str2, int i3, String str3) {
        x.f(str, "message");
        x.f(str2, "filename");
        x.f(str3, "function");
        this.f25437a = i2;
        this.f25438b = str;
        this.f25439c = str2;
        this.f25440d = i3;
        this.f25441e = str3;
    }

    public final int a() {
        return this.f25437a;
    }

    public final int b() {
        return this.f25440d;
    }

    public final String c() {
        return this.f25439c;
    }

    public final String d() {
        return this.f25441e;
    }

    public final String e() {
        return this.f25438b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f25437a == bVar.f25437a && x.n(this.f25438b, bVar.f25438b) && x.n(this.f25439c, bVar.f25439c) && this.f25440d == bVar.f25440d && x.n(this.f25441e, bVar.f25441e);
    }

    public final int hashCode() {
        return (((((((this.f25437a * 31) + this.f25438b.hashCode()) * 31) + this.f25439c.hashCode()) * 31) + this.f25440d) * 31) + this.f25441e.hashCode();
    }

    public final String toString() {
        return "LogEntry(level=" + this.f25437a + ", message=" + this.f25438b + ", filename=" + this.f25439c + ", line=" + this.f25440d + ", function=" + this.f25441e + ")";
    }
}
