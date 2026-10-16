package android.support.v7.widget;

import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class fu {

    /* renamed from: a, reason: collision with root package name */
    int[] f1514a;

    /* renamed from: b, reason: collision with root package name */
    List f1515b;

    final void a() {
        int[] iArr = this.f1514a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f1515b = null;
    }

    final void b(int i2) {
        int[] iArr = this.f1514a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i2, 10) + 1];
            this.f1514a = iArr2;
            Arrays.fill(iArr2, -1);
            return;
        }
        int length = iArr.length;
        if (i2 >= length) {
            while (length <= i2) {
                length += length;
            }
            int[] iArr3 = new int[length];
            this.f1514a = iArr3;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr3, 0, length2);
            int[] iArr4 = this.f1514a;
            Arrays.fill(iArr4, length2, iArr4.length, -1);
        }
    }

    final void c(int i2, int i3) {
        int[] iArr = this.f1514a;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        b(i4);
        int[] iArr2 = this.f1514a;
        System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
        Arrays.fill(this.f1514a, i2, i4, -1);
        List list = this.f1515b;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ft ftVar = (ft) this.f1515b.get(size);
                int i5 = ftVar.f1510a;
                if (i5 >= i2) {
                    ftVar.f1510a = i5 + i3;
                }
            }
        }
    }

    final void d(int i2, int i3) {
        int[] iArr = this.f1514a;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        b(i4);
        int[] iArr2 = this.f1514a;
        System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
        int[] iArr3 = this.f1514a;
        int length = iArr3.length;
        Arrays.fill(iArr3, length - i3, length, -1);
        List list = this.f1515b;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ft ftVar = (ft) this.f1515b.get(size);
                int i5 = ftVar.f1510a;
                if (i5 >= i2) {
                    if (i5 < i4) {
                        this.f1515b.remove(size);
                    } else {
                        ftVar.f1510a = i5 - i3;
                    }
                }
            }
        }
    }
}
