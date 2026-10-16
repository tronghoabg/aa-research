package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final String f10992a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10993b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10994c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f10995d;

    public u(String str, int i2, int i3, boolean z) {
        h.g.b.x.f(str, "processName");
        this.f10992a = str;
        this.f10993b = i2;
        this.f10994c = i3;
        this.f10995d = z;
    }

    public final int a() {
        return this.f10994c;
    }

    public final int b() {
        return this.f10993b;
    }

    public final String c() {
        return this.f10992a;
    }

    public final boolean d() {
        return this.f10995d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return h.g.b.x.n(this.f10992a, uVar.f10992a) && this.f10993b == uVar.f10993b && this.f10994c == uVar.f10994c && this.f10995d == uVar.f10995d;
    }

    public final int hashCode() {
        return (((((this.f10992a.hashCode() * 31) + this.f10993b) * 31) + this.f10994c) * 31) + a.a.a(this.f10995d);
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f10992a + ", pid=" + this.f10993b + ", importance=" + this.f10994c + ", isDefaultProcess=" + this.f10995d + ")";
    }
}
