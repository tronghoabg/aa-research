package com.pgl.ssdk;

/* loaded from: classes4.dex */
public final class o<A, B> {

    /* renamed from: a, reason: collision with root package name */
    private final A f32603a;

    /* renamed from: b, reason: collision with root package name */
    private final B f32604b;

    public o(A a5, B b5) {
        this.f32603a = a5;
        this.f32604b = b5;
    }

    public static <A, B> o<A, B> a(A a5, B b5) {
        return new o<>(a5, b5);
    }

    public B b() {
        return this.f32604b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        A a5 = this.f32603a;
        if (a5 == null) {
            if (oVar.f32603a != null) {
                return false;
            }
        } else if (!a5.equals(oVar.f32603a)) {
            return false;
        }
        B b5 = this.f32604b;
        B b10 = oVar.f32604b;
        if (b5 == null) {
            if (b10 != null) {
                return false;
            }
        } else if (!b5.equals(b10)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a5 = this.f32603a;
        int iHashCode = ((a5 == null ? 0 : a5.hashCode()) + 31) * 31;
        B b5 = this.f32604b;
        return iHashCode + (b5 != null ? b5.hashCode() : 0);
    }

    public A a() {
        return this.f32603a;
    }
}
