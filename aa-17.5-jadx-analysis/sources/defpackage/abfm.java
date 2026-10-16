package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class abfm {
    protected int[] a;

    public abfm(int i) {
        int[] iArr = new int[i + i];
        this.a = iArr;
        Arrays.fill(iArr, -1);
    }

    public final int a(int i) {
        return this.a[i + i + 1];
    }

    public final int b(int i) {
        return this.a[i + i];
    }

    public void c() {
        Arrays.fill(this.a, -1);
    }

    public final void d(int i, int i2, int i3) {
        int[] iArr = this.a;
        int i4 = i + i;
        iArr[i4] = i2;
        iArr[i4 + 1] = i3;
    }

    public final boolean e(int i) {
        return this.a[i + i] != -1;
    }

    protected abfm() {
        this.a = null;
    }
}
