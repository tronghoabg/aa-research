package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sd {
    public java.lang.Object a;
    public java.lang.Object b;

    public sd() {
        androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Integer>> carValue = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER_LIST;
        this.a = carValue;
        this.b = carValue;
    }

    public final void a() {
        java.lang.Object obj = this.b;
        if (obj != null) {
            java.util.Arrays.fill((int[]) obj, -1);
        }
        this.a = null;
    }

    public final void b(int i) {
        java.lang.Object obj = this.b;
        if (obj == null) {
            int[] iArr = new int[java.lang.Math.max(i, 10) + 1];
            this.b = iArr;
            java.util.Arrays.fill(iArr, -1);
            return;
        }
        int[] iArr2 = (int[]) obj;
        int length = iArr2.length;
        if (i >= length) {
            while (length <= i) {
                length += length;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            int length2 = iArr2.length;
            java.lang.System.arraycopy(obj, 0, iArr3, 0, length2);
            int[] iArr4 = (int[]) this.b;
            java.util.Arrays.fill(iArr4, length2, iArr4.length, -1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    public final void c(int i, int i2) {
        java.lang.Object obj = this.b;
        if (obj == null || i >= ((int[]) obj).length) {
            return;
        }
        int i3 = i + i2;
        b(i3);
        java.lang.Object obj2 = this.b;
        java.lang.System.arraycopy(obj2, i, obj2, i3, (((int[]) obj2).length - i) - i2);
        java.util.Arrays.fill((int[]) this.b, i, i3, -1);
        ?? r0 = this.a;
        if (r0 != 0) {
            for (int size = r0.size() - 1; size >= 0; size--) {
                android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.a.get(size);
                int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a;
                if (i4 >= i) {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a = i4 + i2;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    public final void d(int i, int i2) {
        java.lang.Object obj = this.b;
        if (obj == null || i >= ((int[]) obj).length) {
            return;
        }
        int i3 = i + i2;
        b(i3);
        java.lang.Object obj2 = this.b;
        java.lang.System.arraycopy(obj2, i3, obj2, i, (((int[]) obj2).length - i) - i2);
        int[] iArr = (int[]) this.b;
        int length = iArr.length;
        java.util.Arrays.fill(iArr, length - i2, length, -1);
        ?? r1 = this.a;
        if (r1 != 0) {
            for (int size = r1.size() - 1; size >= 0; size--) {
                android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.a.get(size);
                int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.a.remove(size);
                    } else {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a = i4 - i2;
                    }
                }
            }
        }
    }

    public sd(byte[] bArr) {
    }
}
