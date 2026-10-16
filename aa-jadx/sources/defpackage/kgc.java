package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kgc extends java.io.FilterInputStream implements j$.io.InputStreamRetargetInterface {
    public int a;
    private final java.util.ArrayList b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final byte[] g;

    public kgc(java.io.InputStream inputStream) {
        super(inputStream);
        this.b = new java.util.ArrayList();
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.g = new byte[1];
    }

    private static void a(java.util.List list) {
        java.util.ArrayList arrayList = defpackage.kgb.a.b;
        synchronized (arrayList) {
            int size = list.size();
            for (int i = 0; i < size && arrayList.size() != 8; i++) {
                byte[] bArr = (byte[]) list.get(i);
                if (bArr != null && bArr.length == 16384) {
                    arrayList.add((byte[]) list.get(i));
                }
            }
        }
    }

    private final boolean b() {
        if (this.d - this.e <= this.f) {
            return false;
        }
        this.e = -1;
        this.d = 0;
        this.c = 0;
        java.util.ArrayList arrayList = this.b;
        a(arrayList);
        arrayList.clear();
        return true;
    }

    private static final byte[] c() {
        return defpackage.kgb.a.b();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws java.io.IOException {
        if (this.in != null) {
            return (this.d - this.c) + this.in.available();
        }
        throw new java.io.IOException("stream closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.in != null) {
            this.in.close();
            this.in = null;
        }
        a(this.b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        int i2;
        int i3 = this.a;
        if (i < i3) {
            i = i3;
        }
        if (this.e >= 0 && (i2 = this.c / 16384) > 0) {
            int i4 = i2 * 16384;
            java.util.List listSubList = this.b.subList(0, i2);
            a(listSubList);
            listSubList.clear();
            this.c -= i4;
            this.d -= i4;
        }
        this.e = this.c;
        this.f = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.in == null) {
            throw new java.io.IOException("stream closed");
        }
        if (this.e == -1) {
            return this.in.read(bArr, i, i2);
        }
        int i3 = 0;
        if (i2 != 0) {
            int i4 = i;
            int i5 = i2;
            while (i5 > 0) {
                int i6 = this.c;
                if (i6 >= this.d) {
                    break;
                }
                int i7 = i6 / 16384;
                int i8 = i7 * 16384;
                byte[] bArr2 = (byte[]) this.b.get(i7);
                int i9 = (i7 + 1) * 16384;
                int i10 = this.d;
                if (i9 > i10) {
                    i9 = i10;
                }
                int i11 = i9 - this.c;
                int i12 = i6 - i8;
                if (i5 <= i11) {
                    i11 = i5;
                }
                java.lang.System.arraycopy(bArr2, i12, bArr, i4, i11);
                i4 += i11;
                i3 += i11;
                this.c += i11;
                i5 -= i11;
            }
            int i13 = i2 - i3;
            int i14 = i + i3;
            while (i13 > 0) {
                int i15 = this.c;
                java.util.ArrayList arrayList = this.b;
                if (i15 == arrayList.size() * 16384) {
                    arrayList.add(c());
                }
                int i16 = this.c;
                int i17 = i16 / 16384;
                int i18 = i16 - (i17 * 16384);
                byte[] bArr3 = (byte[]) arrayList.get(i17);
                int i19 = ((i17 + 1) * 16384) - this.c;
                java.io.InputStream inputStream = this.in;
                if (i13 <= i19) {
                    i19 = i13;
                }
                int i20 = inputStream.read(bArr3, i18, i19);
                if (i20 <= 0) {
                    break;
                }
                java.lang.System.arraycopy(bArr3, i18, bArr, i14, i20);
                this.c += i20;
                this.d += i20;
                i3 += i20;
                i14 += i20;
                i13 -= i20;
                if (b()) {
                    int i21 = this.in.read(bArr, i14, i13);
                    if (i21 <= 0) {
                        break;
                    }
                    i3 += i21;
                    break;
                }
            }
            if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws java.io.IOException {
        int i = this.e;
        if (i < 0) {
            throw new java.io.IOException("mark has been invalidated");
        }
        this.c = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        if (this.in == null) {
            throw new java.io.IOException("stream closed");
        }
        if (this.e < 0) {
            return this.in.skip(j);
        }
        int i = this.d;
        int i2 = this.c;
        long j2 = i - i2;
        if (j2 > j) {
            j2 = j;
        }
        this.c = (int) (((long) i2) + j2);
        long j3 = j - j2;
        while (j3 > 0) {
            int i3 = this.c;
            java.util.ArrayList arrayList = this.b;
            if (i3 == arrayList.size() * 16384) {
                arrayList.add(c());
            }
            int i4 = this.c;
            int i5 = i4 / 16384;
            int i6 = i4 - (i5 * 16384);
            byte[] bArr = (byte[]) arrayList.get(i5);
            long j4 = ((i5 + 1) * 16384) - this.c;
            if (j3 <= j4) {
                j4 = j3;
            }
            int i7 = this.in.read(bArr, i6, (int) j4);
            if (i7 <= 0) {
                return j2;
            }
            this.c += i7;
            this.d += i7;
            long j5 = i7;
            j3 -= j5;
            j2 += j5;
            if (b()) {
                return j3 > 0 ? j2 + this.in.skip(j3) : j2;
            }
        }
        return j2;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        byte[] bArr = this.g;
        if (read(bArr, 0, 1) <= 0) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
