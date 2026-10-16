package android.support.v7.widget;

import android.util.SparseIntArray;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class cy {

    /* renamed from: a, reason: collision with root package name */
    final SparseIntArray f1296a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    final SparseIntArray f1297b = new SparseIntArray();

    public int a(int i2, int i3) {
        int iB = b(i2);
        if (iB != i3) {
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int iB2 = b(i5);
                i4 += iB2;
                if (i4 == i3) {
                    i4 = 0;
                } else if (i4 > i3) {
                    i4 = iB2;
                }
            }
            if (iB + i4 <= i3) {
                return i4;
            }
        }
        return 0;
    }

    public abstract int b(int i2);

    public final int c(int i2, int i3) {
        int iB = b(i2);
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int iB2 = b(i6);
            i4 += iB2;
            if (i4 == i3) {
                i5++;
                i4 = 0;
            } else if (i4 > i3) {
                i5++;
                i4 = iB2;
            }
        }
        return i4 + iB > i3 ? i5 + 1 : i5;
    }

    public final void d() {
        this.f1297b.clear();
    }

    public final void e() {
        this.f1296a.clear();
    }
}
