package com.google.firebase.components;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ae<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class f8919a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f8920b;

    public ae(Class cls, Class cls2) {
        this.f8919a = cls;
        this.f8920b = cls2;
    }

    public static ae a(Class cls) {
        return new ae(ad.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ae aeVar = (ae) obj;
        if (this.f8920b.equals(aeVar.f8920b)) {
            return this.f8919a.equals(aeVar.f8919a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8920b.hashCode() * 31) + this.f8919a.hashCode();
    }

    public final String toString() {
        Class cls = this.f8919a;
        Class cls2 = this.f8920b;
        if (cls == ad.class) {
            return cls2.getName();
        }
        return "@" + cls.getName() + " " + cls2.getName();
    }
}
