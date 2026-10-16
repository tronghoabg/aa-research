package defpackage;

/* loaded from: classes.dex */
public final class k4 {
    public a a;
    public z b;
    public c1 c;
    public boolean d;
    public boolean e;
    public int f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;
    public byte[] k;
    public byte[] l;
    public byte[] m;
    public byte[] n;
    public byte[] o;
    public byte[] p;
    public byte[] q;
    public int r;
    public int s;
    public long t;
    public byte[] u;
    public int v;
    public long w;
    public long x;

    public final void a() {
        if (this.e) {
            return;
        }
        if (!this.d) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    public final void b(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (bArr2.length - i2 < 16) {
            throw new e8("Output buffer too short");
        }
        if (this.t == 0) {
            g();
        }
        byte[] bArr3 = new byte[16];
        f(bArr3);
        byte[] bArr4 = this.n;
        k1.D(bArr4, bArr, i);
        this.b.d(bArr4);
        int i3 = 0;
        do {
            bArr2[i2 + i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
            int i4 = i3 + 1;
            bArr2[i2 + i4] = (byte) (bArr[i4 + i] ^ bArr3[i4]);
            int i5 = i3 + 2;
            bArr2[i2 + i5] = (byte) (bArr[i5 + i] ^ bArr3[i5]);
            int i6 = i3 + 3;
            bArr2[i2 + i6] = (byte) (bArr[i6 + i] ^ bArr3[i6]);
            i3 += 4;
        } while (i3 < 16);
        this.t += 16;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f5, code lost:
    
        if (r9 == 0) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(int r35, byte[] r36) throws defpackage.q5 {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k4.c(int, byte[]):int");
    }

    public final void d(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (bArr2.length - i2 < 16) {
            throw new e8("Output buffer too short");
        }
        if (this.t == 0) {
            g();
        }
        byte[] bArr3 = new byte[16];
        f(bArr3);
        k1.D(bArr3, bArr, i);
        byte[] bArr4 = this.n;
        k1.C(bArr4, bArr3);
        this.b.d(bArr4);
        System.arraycopy(bArr3, 0, bArr2, i2, 16);
        this.t += 16;
    }

    public final void e(int i, int i2, byte[] bArr, byte[] bArr2) {
        while (true) {
            i2--;
            if (i2 < 0) {
                this.b.d(bArr);
                return;
            }
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
        }
    }

    public final void f(byte[] bArr) {
        int i = this.r;
        if (i == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.r = i - 1;
        byte[] bArr2 = this.q;
        int i2 = (bArr2[15] & 255) + 1;
        bArr2[15] = (byte) i2;
        int i3 = (i2 >>> 8) + (bArr2[14] & 255);
        bArr2[14] = (byte) i3;
        int i4 = (i3 >>> 8) + (bArr2[13] & 255);
        bArr2[13] = (byte) i4;
        bArr2[12] = (byte) ((i4 >>> 8) + (bArr2[12] & 255));
        this.a.a(bArr2, bArr);
    }

    public final void g() {
        if (this.w > 0) {
            System.arraycopy(this.o, 0, this.p, 0, 16);
            this.x = this.w;
        }
        int i = this.v;
        if (i > 0) {
            e(0, i, this.p, this.u);
            this.x += this.v;
        }
        if (this.x > 0) {
            System.arraycopy(this.p, 0, this.n, 0, 16);
        }
    }

    public final void h(int i, byte[] bArr) {
        int i2;
        z zVar = this.b;
        a();
        int i3 = this.v;
        if (i3 > 0) {
            i2 = 16 - i3;
            if (i < i2) {
                System.arraycopy(bArr, 0, this.u, i3, i);
                this.v += i;
                return;
            }
            System.arraycopy(bArr, 0, this.u, i3, i2);
            byte[] bArr2 = this.o;
            k1.C(bArr2, this.u);
            zVar.d(bArr2);
            this.w += 16;
            i -= i2;
        } else {
            i2 = 0;
        }
        int i4 = i + i2;
        int i5 = i4 - 16;
        while (i2 <= i5) {
            byte[] bArr3 = this.o;
            k1.D(bArr3, bArr, i2);
            zVar.d(bArr3);
            this.w += 16;
            i2 += 16;
        }
        int i6 = i4 - i2;
        this.v = i6;
        System.arraycopy(bArr, i2, this.u, 0, i6);
    }
}
