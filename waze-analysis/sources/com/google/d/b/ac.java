package com.google.d.b;

import java.io.Serializable;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ac<T> implements Serializable, ab {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private final List f7195a;

    @Override // com.google.d.b.ab
    public final boolean apply(T t) {
        int i2 = 0;
        while (true) {
            List list = this.f7195a;
            if (i2 >= list.size()) {
                return true;
            }
            if (!((ab) list.get(i2)).apply(t)) {
                return false;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ac) {
            return this.f7195a.equals(((ac) obj).f7195a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7195a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (T t : this.f7195a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(t);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
