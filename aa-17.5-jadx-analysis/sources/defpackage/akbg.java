package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class akbg implements Serializable {
    private static final long serialVersionUID = 4359112959524048036L;
    public byte[] a;
    public int b;

    public akbg(int i) {
        this.a = new byte[i];
    }

    public final int a(int i) {
        return this.a[i];
    }

    public final int b() {
        return this.a.length;
    }

    public final void c(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (bArr == null) {
            return;
        }
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) < 0 || i3 > length) {
            throw new IndexOutOfBoundsException("off: " + i + " len: " + i2 + " b.length: " + bArr.length);
        }
        if (i2 != 0) {
            int i4 = this.b + i2;
            if (i4 > this.a.length) {
                e(i4);
            }
            System.arraycopy(bArr, i, this.a, this.b, i2);
            this.b = i4;
        }
    }

    public final void d() {
        this.b = 0;
    }

    public final void e(int i) {
        int length = this.a.length;
        byte[] bArr = new byte[Math.max(length + length, i)];
        System.arraycopy(this.a, 0, bArr, 0, this.b);
        this.a = bArr;
    }

    public final boolean f() {
        return this.b == 0;
    }

    public final boolean g() {
        return this.b == this.a.length;
    }
}
