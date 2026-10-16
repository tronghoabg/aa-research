package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

@Deprecated
/* loaded from: classes2.dex */
public final class ajzf implements ajzv, ajzr {
    private static final byte[] j = {13, 10};
    public final OutputStream a;
    public final akbg b;
    public final Charset c;
    public final boolean d;
    public final int e;
    public final ajzn f;
    public final CodingErrorAction g;
    public final CodingErrorAction h;
    public CharsetEncoder i;
    private ByteBuffer k;

    public ajzf(Socket socket, int i, akas akasVar) throws IOException {
        ahgm.e(socket, "Socket");
        i = i < 0 ? socket.getSendBufferSize() : i;
        i = i < 1024 ? 1024 : i;
        OutputStream outputStream = socket.getOutputStream();
        ahgm.e(outputStream, "Input stream");
        ahgm.e(akasVar, "HTTP parameters");
        this.a = outputStream;
        this.b = new akbg(i);
        String str = (String) akasVar.a("http.protocol.element-charset");
        Charset charsetForName = str != null ? Charset.forName(str) : ajox.b;
        this.c = charsetForName;
        this.d = charsetForName.equals(ajox.b);
        this.i = null;
        this.e = akasVar.c("http.connection.min-chunk-limit", sk.AUDIO_CONTENT_BUFFER_SIZE);
        this.f = new ajzn();
        CodingErrorAction codingErrorAction = (CodingErrorAction) akasVar.a("http.malformed.input.action");
        this.g = codingErrorAction == null ? CodingErrorAction.REPORT : codingErrorAction;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) akasVar.a("http.unmappable.input.action");
        this.h = codingErrorAction2 == null ? CodingErrorAction.REPORT : codingErrorAction2;
    }

    private final void h(CoderResult coderResult) throws IOException {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.k.flip();
        while (true) {
            boolean zHasRemaining = this.k.hasRemaining();
            ByteBuffer byteBuffer = this.k;
            if (!zHasRemaining) {
                byteBuffer.compact();
                return;
            }
            b(byteBuffer.get());
        }
    }

    private final void i(CharBuffer charBuffer) throws IOException {
        if (!charBuffer.hasRemaining()) {
            return;
        }
        if (this.i == null) {
            CharsetEncoder charsetEncoderNewEncoder = this.c.newEncoder();
            this.i = charsetEncoderNewEncoder;
            charsetEncoderNewEncoder.onMalformedInput(this.g);
            this.i.onUnmappableCharacter(this.h);
        }
        if (this.k == null) {
            this.k = ByteBuffer.allocate(1024);
        }
        this.i.reset();
        while (true) {
            boolean zHasRemaining = charBuffer.hasRemaining();
            CharsetEncoder charsetEncoder = this.i;
            if (!zHasRemaining) {
                h(charsetEncoder.flush(this.k));
                this.k.clear();
                return;
            }
            h(charsetEncoder.encode(charBuffer, this.k, true));
        }
    }

    @Override // defpackage.ajzv
    public final void a() throws IOException {
        f();
        this.a.flush();
    }

    @Override // defpackage.ajzv
    public final void b(int i) throws IOException {
        if (this.b.g()) {
            f();
        }
        akbg akbgVar = this.b;
        int i2 = akbgVar.b + 1;
        if (i2 > akbgVar.a.length) {
            akbgVar.e(i2);
        }
        akbgVar.a[akbgVar.b] = (byte) i;
        akbgVar.b = i2;
    }

    @Override // defpackage.ajzv
    public final void c(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return;
        }
        if (i2 > this.e || i2 > this.b.b()) {
            f();
            this.a.write(bArr, i, i2);
            this.f.a(i2);
        } else {
            akbg akbgVar = this.b;
            if (i2 > akbgVar.b() - akbgVar.b) {
                f();
            }
            this.b.c(bArr, i, i2);
        }
    }

    @Override // defpackage.ajzv
    public final void d(String str) throws IOException {
        if (str == null) {
            return;
        }
        if (str.length() > 0) {
            if (this.d) {
                for (int i = 0; i < str.length(); i++) {
                    b(str.charAt(i));
                }
            } else {
                i(CharBuffer.wrap(str));
            }
        }
        c(j, 0, 2);
    }

    @Override // defpackage.ajzv
    public final void e(akbh akbhVar) throws IOException {
        int length;
        int i;
        if (akbhVar == null) {
            return;
        }
        if (this.d) {
            int i2 = akbhVar.b;
            int i3 = 0;
            while (i2 > 0) {
                akbg akbgVar = this.b;
                int iMin = Math.min(akbgVar.b() - akbgVar.b, i2);
                if (iMin > 0) {
                    akbg akbgVar2 = this.b;
                    char[] cArr = akbhVar.a;
                    if (cArr != null) {
                        if (i3 < 0 || i3 > (length = cArr.length) || (i = i3 + iMin) < 0 || i > length) {
                            throw new IndexOutOfBoundsException("off: " + i3 + " len: " + iMin + " b.length: " + cArr.length);
                        }
                        int i4 = akbgVar2.b;
                        int i5 = i4 + iMin;
                        if (i5 > akbgVar2.a.length) {
                            akbgVar2.e(i5);
                        }
                        int i6 = i3;
                        while (i4 < i5) {
                            char c = cArr[i6];
                            if ((c < ' ' || c > '~') && ((c < 160 || c > 255) && c != '\t')) {
                                akbgVar2.a[i4] = 63;
                            } else {
                                akbgVar2.a[i4] = (byte) c;
                            }
                            i6++;
                            i4++;
                        }
                        akbgVar2.b = i5;
                    }
                }
                if (this.b.g()) {
                    f();
                }
                i3 += iMin;
                i2 -= iMin;
            }
        } else {
            i(CharBuffer.wrap(akbhVar.a, 0, akbhVar.b));
        }
        c(j, 0, 2);
    }

    protected final void f() throws IOException {
        akbg akbgVar = this.b;
        int i = akbgVar.b;
        if (i > 0) {
            this.a.write(akbgVar.a, 0, i);
            this.b.d();
            this.f.a(i);
        }
    }

    @Override // defpackage.ajzr
    public final int g() {
        return this.b.b;
    }
}
