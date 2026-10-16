package com.bumptech.glide.g;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private Class f2914a;

    /* renamed from: b, reason: collision with root package name */
    private Class f2915b;

    /* renamed from: c, reason: collision with root package name */
    private Class f2916c;

    public o(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }

    public final void a(Class cls, Class cls2, Class cls3) {
        this.f2914a = cls;
        this.f2915b = cls2;
        this.f2916c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f2914a.equals(oVar.f2914a) && this.f2915b.equals(oVar.f2915b) && r.k(this.f2916c, oVar.f2916c);
    }

    public final int hashCode() {
        int iHashCode = (this.f2914a.hashCode() * 31) + this.f2915b.hashCode();
        Class cls = this.f2916c;
        return (iHashCode * 31) + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + String.valueOf(this.f2914a) + ", second=" + String.valueOf(this.f2915b) + "}";
    }

    public o() {
    }
}
