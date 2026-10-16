package com.google.d.d;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class at<T> extends eq<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final Comparator[] f7439a;

    at(Comparator comparator, Comparator comparator2) {
        this.f7439a = new Comparator[]{comparator, comparator2};
    }

    @Override // com.google.d.d.eq, java.util.Comparator
    public final int compare(T t, T t2) {
        for (int i2 = 0; i2 < 2; i2++) {
            int iCompare = this.f7439a[i2].compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof at) {
            return Arrays.equals(this.f7439a, ((at) obj).f7439a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7439a);
    }

    public final String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f7439a) + ")";
    }
}
