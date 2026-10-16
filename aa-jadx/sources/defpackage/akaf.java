package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class akaf implements defpackage.akav, defpackage.akar {
    private static final byte[] j = {13, 10};
    public final java.io.OutputStream a;
    public final defpackage.akcg b;
    public final java.nio.charset.Charset c;
    public final boolean d;
    public final int e;
    public final defpackage.akan f;
    public final java.nio.charset.CodingErrorAction g;
    public final java.nio.charset.CodingErrorAction h;
    public java.nio.charset.CharsetEncoder i;
    private java.nio.ByteBuffer k;

    public akaf(java.net.Socket socket, int i, defpackage.akbs akbsVar) throws java.io.IOException {
        defpackage.aguw.e(socket, "Socket");
        i = i < 0 ? socket.getSendBufferSize() : i;
        i = i < 1024 ? 1024 : i;
        java.io.OutputStream outputStream = socket.getOutputStream();
        defpackage.aguw.e(outputStream, "Input stream");
        defpackage.aguw.e(akbsVar, "HTTP parameters");
        this.a = outputStream;
        this.b = new defpackage.akcg(i);
        java.lang.String str = (java.lang.String) akbsVar.a("http.protocol.element-charset");
        java.nio.charset.Charset charsetForName = str != null ? java.nio.charset.Charset.forName(str) : defpackage.ajpx.b;
        this.c = charsetForName;
        this.d = charsetForName.equals(defpackage.ajpx.b);
        this.i = null;
        this.e = akbsVar.c("http.connection.min-chunk-limit", defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE);
        this.f = new defpackage.akan();
        java.nio.charset.CodingErrorAction codingErrorAction = (java.nio.charset.CodingErrorAction) akbsVar.a("http.malformed.input.action");
        this.g = codingErrorAction == null ? java.nio.charset.CodingErrorAction.REPORT : codingErrorAction;
        java.nio.charset.CodingErrorAction codingErrorAction2 = (java.nio.charset.CodingErrorAction) akbsVar.a("http.unmappable.input.action");
        this.h = codingErrorAction2 == null ? java.nio.charset.CodingErrorAction.REPORT : codingErrorAction2;
    }

    private final void h(java.nio.charset.CoderResult coderResult) throws java.io.IOException {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.k.flip();
        while (true) {
            boolean zHasRemaining = this.k.hasRemaining();
            java.nio.ByteBuffer byteBuffer = this.k;
            if (!zHasRemaining) {
                byteBuffer.compact();
                return;
            }
            b(byteBuffer.get());
        }
    }

    private final void i(java.nio.CharBuffer charBuffer) throws java.io.IOException {
        if (!charBuffer.hasRemaining()) {
            return;
        }
        if (this.i == null) {
            java.nio.charset.CharsetEncoder charsetEncoderNewEncoder = this.c.newEncoder();
            this.i = charsetEncoderNewEncoder;
            charsetEncoderNewEncoder.onMalformedInput(this.g);
            this.i.onUnmappableCharacter(this.h);
        }
        if (this.k == null) {
            this.k = java.nio.ByteBuffer.allocate(1024);
        }
        this.i.reset();
        while (true) {
            boolean zHasRemaining = charBuffer.hasRemaining();
            java.nio.charset.CharsetEncoder charsetEncoder = this.i;
            if (!zHasRemaining) {
                h(charsetEncoder.flush(this.k));
                this.k.clear();
                return;
            }
            h(charsetEncoder.encode(charBuffer, this.k, true));
        }
    }

    @Override // defpackage.akav
    public final void a() throws java.io.IOException {
        f();
        this.a.flush();
    }

    @Override // defpackage.akav
    public final void b(int i) throws java.io.IOException {
        if (this.b.g()) {
            f();
        }
        defpackage.akcg akcgVar = this.b;
        int i2 = akcgVar.b + 1;
        if (i2 > akcgVar.a.length) {
            akcgVar.e(i2);
        }
        akcgVar.a[akcgVar.b] = (byte) i;
        akcgVar.b = i2;
    }

    @Override // defpackage.akav
    public final void c(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (bArr == null) {
            return;
        }
        if (i2 > this.e || i2 > this.b.b()) {
            f();
            this.a.write(bArr, i, i2);
            this.f.a(i2);
        } else {
            defpackage.akcg akcgVar = this.b;
            if (i2 > akcgVar.b() - akcgVar.b) {
                f();
            }
            this.b.c(bArr, i, i2);
        }
    }

    @Override // defpackage.akav
    public final void d(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return;
        }
        if (str.length() > 0) {
            if (this.d) {
                for (int i = 0; i < str.length(); i++) {
                    b(str.charAt(i));
                }
            } else {
                i(java.nio.CharBuffer.wrap(str));
            }
        }
        c(j, 0, 2);
    }

    @Override // defpackage.akav
    public final void e(defpackage.akch akchVar) throws java.io.IOException {
        int length;
        int i;
        if (akchVar == null) {
            return;
        }
        if (this.d) {
            int i2 = akchVar.b;
            int i3 = 0;
            while (i2 > 0) {
                defpackage.akcg akcgVar = this.b;
                int iMin = java.lang.Math.min(akcgVar.b() - akcgVar.b, i2);
                if (iMin > 0) {
                    defpackage.akcg akcgVar2 = this.b;
                    char[] cArr = akchVar.a;
                    if (cArr != null) {
                        if (i3 < 0 || i3 > (length = cArr.length) || (i = i3 + iMin) < 0 || i > length) {
                            throw new java.lang.IndexOutOfBoundsException("off: " + i3 + " len: " + iMin + " b.length: " + cArr.length);
                        }
                        int i4 = akcgVar2.b;
                        int i5 = i4 + iMin;
                        if (i5 > akcgVar2.a.length) {
                            akcgVar2.e(i5);
                        }
                        int i6 = i3;
                        while (i4 < i5) {
                            char c = cArr[i6];
                            if ((c < ' ' || c > '~') && ((c < 160 || c > 255) && c != '\t')) {
                                akcgVar2.a[i4] = 63;
                            } else {
                                akcgVar2.a[i4] = (byte) c;
                            }
                            i6++;
                            i4++;
                        }
                        akcgVar2.b = i5;
                    }
                }
                if (this.b.g()) {
                    f();
                }
                i3 += iMin;
                i2 -= iMin;
            }
        } else {
            i(java.nio.CharBuffer.wrap(akchVar.a, 0, akchVar.b));
        }
        c(j, 0, 2);
    }

    protected final void f() throws java.io.IOException {
        defpackage.akcg akcgVar = this.b;
        int i = akcgVar.b;
        if (i > 0) {
            this.a.write(akcgVar.a, 0, i);
            this.b.d();
            this.f.a(i);
        }
    }

    @Override // defpackage.akar
    public final int g() {
        return this.b.b;
    }
}
