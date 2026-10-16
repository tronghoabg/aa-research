package defpackage;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class q6 {
    public final byte[] a;
    public final int b;
    public int c = 0;
    public int d = 0;

    public q6(int i, byte[] bArr) {
        this.a = bArr;
        this.b = i;
    }

    public final int a() {
        int i = this.c;
        if (i >= this.b) {
            return 0;
        }
        byte b = this.a[i];
        int i2 = this.d;
        int i3 = (b >> (7 - i2)) & 1;
        int i4 = i2 + 1;
        this.d = i4;
        if (i4 == 8) {
            this.d = 0;
            this.c = i + 1;
        }
        return i3;
    }

    public final int b() {
        int iD = d();
        return (iD & 1) != 0 ? (iD + 1) / 2 : -(iD / 2);
    }

    public final int c(int i) {
        int iA = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iA = (iA << 1) | a();
        }
        return iA;
    }

    public final int d() {
        int i = 0;
        while (i < 32 && this.c < this.b && a() == 0) {
            i++;
        }
        if (i == 0) {
            return 0;
        }
        return c(i) + ((1 << i) - 1);
    }
}
