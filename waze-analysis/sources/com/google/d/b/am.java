package com.google.d.b;

import j$.util.Objects;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class am<T> implements Serializable, aj {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final Object f7219a;

    am(Object obj) {
        this.f7219a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof am) {
            return Objects.equals(this.f7219a, ((am) obj).f7219a);
        }
        return false;
    }

    @Override // com.google.d.b.aj
    public final T get() {
        return (T) this.f7219a;
    }

    public final int hashCode() {
        return Objects.hash(this.f7219a);
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f7219a.toString() + ")";
    }
}
