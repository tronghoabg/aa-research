package com.google.e.a.e;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ah {

    /* renamed from: a, reason: collision with root package name */
    private final Class f8420a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f8421b;

    /* synthetic */ ah(Class cls, Class cls2) {
        this.f8420a = cls;
        this.f8421b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return ahVar.f8420a.equals(this.f8420a) && ahVar.f8421b.equals(this.f8421b);
    }

    public final int hashCode() {
        return Objects.hash(this.f8420a, this.f8421b);
    }

    public final String toString() {
        Class cls = this.f8421b;
        return this.f8420a.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
