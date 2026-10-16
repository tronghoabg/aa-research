package com.google.d.d;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class fe<T> extends eq<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final eq f7618a;

    fe(eq eqVar) {
        this.f7618a = eqVar;
    }

    @Override // com.google.d.d.eq
    public final eq a() {
        return this.f7618a;
    }

    @Override // com.google.d.d.eq, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.f7618a.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fe) {
            return this.f7618a.equals(((fe) obj).f7618a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f7618a.hashCode();
    }

    public final String toString() {
        return this.f7618a.toString().concat(".reverse()");
    }
}
