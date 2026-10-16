package com.google.d.b;

import j$.util.Objects;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class u<E> implements Serializable, t {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Object f7247a = null;

    u() {
    }

    @Override // com.google.d.b.t
    public final E apply(Object obj) {
        return null;
    }

    @Override // com.google.d.b.t
    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        Object obj2 = ((u) obj).f7247a;
        return Objects.equals(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "Functions.constant(null)";
    }
}
