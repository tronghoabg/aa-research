package com.google.d.d;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class ay implements Comparable, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final Comparable f7442a;

    ay(Comparable comparable) {
        this.f7442a = comparable;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ay ayVar) {
        if (ayVar == aw.f7441b) {
            return 1;
        }
        if (ayVar == au.f7440b) {
            return -1;
        }
        int iA = er.a(this.f7442a, ayVar.f7442a);
        return iA != 0 ? iA : Boolean.compare(this instanceof av, ayVar instanceof av);
    }

    Comparable c() {
        return this.f7442a;
    }

    abstract void d(StringBuilder sb);

    abstract void e(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (obj instanceof ay) {
            try {
                if (compareTo((ay) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    abstract boolean f(Comparable comparable);

    public abstract int hashCode();
}
