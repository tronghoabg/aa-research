package com.google.firebase.components;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final ae f8970a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8971b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8972c;

    private r(ae aeVar, int i2, int i3) {
        com.google.firebase.concurrent.v.e(aeVar, "Null dependency anInterface.");
        this.f8970a = aeVar;
        this.f8971b = i2;
        this.f8972c = i3;
    }

    public static r a(Class cls) {
        return new r(cls, 0, 2);
    }

    @Deprecated
    public static r b(Class cls) {
        return new r(cls, 0, 0);
    }

    public static r c(ae aeVar) {
        return new r(aeVar, 0, 1);
    }

    public static r d(Class cls) {
        return new r(cls, 0, 1);
    }

    public static r e(ae aeVar) {
        return new r(aeVar, 1, 0);
    }

    public static r f(Class cls) {
        return new r(cls, 1, 0);
    }

    public static r g(ae aeVar) {
        return new r(aeVar, 1, 1);
    }

    public static r h(Class cls) {
        return new r(cls, 1, 1);
    }

    public static r i(Class cls) {
        return new r(cls, 2, 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f8970a.equals(rVar.f8970a) && this.f8971b == rVar.f8971b && this.f8972c == rVar.f8972c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8972c ^ ((((this.f8970a.hashCode() ^ 1000003) * 1000003) ^ this.f8971b) * 1000003);
    }

    public final ae j() {
        return this.f8970a;
    }

    public final boolean k() {
        return this.f8972c == 2;
    }

    public final boolean l() {
        return this.f8972c == 0;
    }

    public final boolean m() {
        return this.f8971b == 1;
    }

    public final boolean n() {
        return this.f8971b == 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f8970a);
        sb.append(", type=");
        int i2 = this.f8971b;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i3 = this.f8972c;
        sb.append(i3 != 0 ? i3 != 1 ? "deferred" : "provider" : "direct");
        sb.append("}");
        return sb.toString();
    }

    private r(Class cls, int i2, int i3) {
        this(new ae(ad.class, cls), i2, i3);
    }
}
