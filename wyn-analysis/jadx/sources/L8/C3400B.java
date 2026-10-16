package l8;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: l8.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3400B extends d0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator[] f40041a;

    public C3400B(C3436r c3436r, C3436r c3436r2) {
        this.f40041a = new Comparator[]{c3436r, c3436r2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i5 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f40041a;
            if (i5 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i5].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i5++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3400B) {
            return Arrays.equals(this.f40041a, ((C3400B) obj).f40041a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f40041a);
    }

    public final String toString() {
        return wg.b.c(new StringBuilder("Ordering.compound("), Arrays.toString(this.f40041a), ")");
    }
}
