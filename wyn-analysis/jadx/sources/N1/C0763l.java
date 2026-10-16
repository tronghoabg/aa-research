package N1;

import android.util.SparseBooleanArray;

/* renamed from: N1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763l {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f8171a;

    public C0763l(SparseBooleanArray sparseBooleanArray) {
        this.f8171a = sparseBooleanArray;
    }

    public final int a(int i5) {
        SparseBooleanArray sparseBooleanArray = this.f8171a;
        Q1.k.e(i5, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0763l)) {
            return false;
        }
        C0763l c0763l = (C0763l) obj;
        int i5 = Q1.x.f9724a;
        SparseBooleanArray sparseBooleanArray = this.f8171a;
        if (i5 >= 24) {
            return sparseBooleanArray.equals(c0763l.f8171a);
        }
        if (sparseBooleanArray.size() != c0763l.f8171a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            if (a(i10) != c0763l.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i5 = Q1.x.f9724a;
        SparseBooleanArray sparseBooleanArray = this.f8171a;
        if (i5 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            size = (size * 31) + a(i10);
        }
        return size;
    }
}
