package u6;

import android.util.SparseBooleanArray;

/* renamed from: u6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4260e {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f46677a;

    public C4260e(SparseBooleanArray sparseBooleanArray) {
        this.f46677a = sparseBooleanArray;
    }

    public final int a(int i5) {
        SparseBooleanArray sparseBooleanArray = this.f46677a;
        AbstractC4256a.h(i5, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4260e)) {
            return false;
        }
        C4260e c4260e = (C4260e) obj;
        int i5 = v.f46721a;
        SparseBooleanArray sparseBooleanArray = this.f46677a;
        if (i5 >= 24) {
            return sparseBooleanArray.equals(c4260e.f46677a);
        }
        if (sparseBooleanArray.size() != c4260e.f46677a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            if (a(i10) != c4260e.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i5 = v.f46721a;
        SparseBooleanArray sparseBooleanArray = this.f46677a;
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
