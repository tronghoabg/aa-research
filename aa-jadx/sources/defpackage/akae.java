package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public abstract class akae implements defpackage.akau, defpackage.akar {
    public java.io.InputStream a;
    public byte[] b;
    public defpackage.akcg c;
    public java.nio.charset.Charset d;
    public boolean e;
    public int f;
    public int g;
    public defpackage.akan h;
    public java.nio.charset.CodingErrorAction i;
    public java.nio.charset.CodingErrorAction j;
    public int k;
    public int l;
    public java.nio.charset.CharsetDecoder m;
    private java.nio.CharBuffer n;

    private final int e(defpackage.akch akchVar, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int i = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.m == null) {
            java.nio.charset.CharsetDecoder charsetDecoderNewDecoder = this.d.newDecoder();
            this.m = charsetDecoderNewDecoder;
            charsetDecoderNewDecoder.onMalformedInput(this.i);
            this.m.onUnmappableCharacter(this.j);
        }
        if (this.n == null) {
            this.n = java.nio.CharBuffer.allocate(1024);
        }
        this.m.reset();
        while (true) {
            boolean zHasRemaining = byteBuffer.hasRemaining();
            java.nio.charset.CharsetDecoder charsetDecoder = this.m;
            if (!zHasRemaining) {
                int i2 = i + i(charsetDecoder.flush(this.n), akchVar);
                this.n.clear();
                return i2;
            }
            i += i(charsetDecoder.decode(byteBuffer, this.n, true), akchVar);
        }
    }

    private final int i(java.nio.charset.CoderResult coderResult, defpackage.akch akchVar) throws java.io.IOException {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.n.flip();
        int iRemaining = this.n.remaining();
        while (true) {
            boolean zHasRemaining = this.n.hasRemaining();
            java.nio.CharBuffer charBuffer = this.n;
            if (!zHasRemaining) {
                charBuffer.compact();
                return iRemaining;
            }
            akchVar.e(charBuffer.get());
        }
    }

    @Override // defpackage.akau
    public final int a() throws java.io.IOException {
        while (!h()) {
            if (f() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.b;
        int i = this.k;
        this.k = i + 1;
        return bArr[i] & 255;
    }

    @Override // defpackage.akau
    public final int b(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (bArr == null) {
            return 0;
        }
        if (h()) {
            int iMin = java.lang.Math.min(i2, this.l - this.k);
            java.lang.System.arraycopy(this.b, this.k, bArr, i, iMin);
            this.k += iMin;
            return iMin;
        }
        if (i2 > this.g) {
            int i3 = this.a.read(bArr, i, i2);
            if (i3 > 0) {
                this.h.a(i3);
            }
            return i3;
        }
        while (!h()) {
            if (f() == -1) {
                return -1;
            }
        }
        int iMin2 = java.lang.Math.min(i2, this.l - this.k);
        java.lang.System.arraycopy(this.b, this.k, bArr, i, iMin2);
        this.k += iMin2;
        return iMin2;
    }

    @Override // defpackage.akau
    public final int c(defpackage.akch akchVar) throws java.io.IOException {
        int i;
        int i2;
        defpackage.aguw.e(akchVar, "Char array buffer");
        boolean z = true;
        int iF = 0;
        while (z) {
            int i3 = this.k;
            while (true) {
                i = this.l;
                if (i3 >= i) {
                    i3 = -1;
                    break;
                }
                if (this.b[i3] == 10) {
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                int i4 = i3 + 1;
                boolean zF = this.c.f();
                int i5 = this.k;
                if (zF) {
                    this.k = i4;
                    if (i3 > i5) {
                        int i6 = i3 - 1;
                        if (this.b[i6] == 13) {
                            i3 = i6;
                        }
                    }
                    boolean z2 = this.e;
                    int i7 = i3 - i5;
                    byte[] bArr = this.b;
                    if (!z2) {
                        return e(akchVar, java.nio.ByteBuffer.wrap(bArr, i5, i7));
                    }
                    akchVar.g(bArr, i5, i7);
                    return i7;
                }
                this.c.c(this.b, i5, i4 - i5);
                this.k = i4;
            } else {
                if (h()) {
                    int i8 = this.k;
                    this.c.c(this.b, i8, i - i8);
                    this.k = this.l;
                }
                iF = f();
                if (iF == -1) {
                }
                i2 = this.f;
                if (i2 <= 0 && this.c.b >= i2) {
                    throw new java.io.IOException("Maximum line length limit exceeded");
                }
            }
            z = false;
            i2 = this.f;
            if (i2 <= 0) {
            }
        }
        if (iF == -1 && this.c.f()) {
            return -1;
        }
        defpackage.akcg akcgVar = this.c;
        int iE = akcgVar.b;
        if (iE > 0) {
            int i9 = iE - 1;
            if (akcgVar.a(i9) == 10) {
                iE = i9;
            }
            if (iE > 0) {
                int i10 = iE - 1;
                if (this.c.a(i10) == 13) {
                    iE = i10;
                }
            }
        }
        boolean z3 = this.e;
        defpackage.akcg akcgVar2 = this.c;
        if (!z3) {
            iE = e(akchVar, java.nio.ByteBuffer.wrap(akcgVar2.a, 0, iE));
        } else if (akcgVar2 != null) {
            akchVar.g(akcgVar2.a, 0, iE);
        }
        this.c.d();
        return iE;
    }

    protected int f() throws java.io.IOException {
        throw null;
    }

    @Override // defpackage.akar
    public final int g() {
        return this.l - this.k;
    }

    protected final boolean h() {
        return this.k < this.l;
    }
}
