package com.google.d.d;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ap<T> extends eq<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final Comparator f7434a;

    ap(Comparator comparator) {
        com.google.d.b.an.B(comparator);
        this.f7434a = comparator;
    }

    @Override // com.google.d.d.eq, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.f7434a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ap) {
            return this.f7434a.equals(((ap) obj).f7434a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7434a.hashCode();
    }

    public final String toString() {
        return this.f7434a.toString();
    }
}
