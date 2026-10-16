package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;

@Deprecated
/* loaded from: classes2.dex */
public final class ajzq extends ajze implements ajzs {
    public boolean n;
    private final Socket o;

    public ajzq(Socket socket, int i, akas akasVar) throws IOException {
        ahgm.e(socket, "Socket");
        this.o = socket;
        this.n = false;
        i = i < 0 ? socket.getReceiveBufferSize() : i;
        i = i < 1024 ? 1024 : i;
        InputStream inputStream = socket.getInputStream();
        ahgm.e(inputStream, "Input stream");
        ahgm.e(akasVar, "HTTP parameters");
        this.a = inputStream;
        this.b = new byte[i];
        this.k = 0;
        this.l = 0;
        this.c = new akbg(i);
        String str = (String) akasVar.a("http.protocol.element-charset");
        this.d = str != null ? Charset.forName(str) : ajox.b;
        this.e = this.d.equals(ajox.b);
        this.m = null;
        this.f = akasVar.c("http.connection.max-line-length", -1);
        this.g = akasVar.c("http.connection.min-chunk-limit", sk.AUDIO_CONTENT_BUFFER_SIZE);
        this.h = new ajzn();
        CodingErrorAction codingErrorAction = (CodingErrorAction) akasVar.a("http.malformed.input.action");
        this.i = codingErrorAction == null ? CodingErrorAction.REPORT : codingErrorAction;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) akasVar.a("http.unmappable.input.action");
        this.j = codingErrorAction2 == null ? CodingErrorAction.REPORT : codingErrorAction2;
    }

    @Override // defpackage.ajzu
    public final boolean d(int i) throws IOException {
        boolean zH = h();
        if (zH) {
            return zH;
        }
        Socket socket = this.o;
        int soTimeout = socket.getSoTimeout();
        try {
            socket.setSoTimeout(i);
            f();
            return h();
        } finally {
            this.o.setSoTimeout(soTimeout);
        }
    }

    @Override // defpackage.ajzs
    public final boolean e() {
        return this.n;
    }

    @Override // defpackage.ajze
    protected final int f() throws IOException {
        int i = this.k;
        if (i > 0) {
            int i2 = this.l - i;
            if (i2 > 0) {
                byte[] bArr = this.b;
                System.arraycopy(bArr, i, bArr, 0, i2);
            }
            this.k = 0;
            this.l = i2;
        }
        int i3 = this.l;
        byte[] bArr2 = this.b;
        int i4 = this.a.read(bArr2, i3, bArr2.length - i3);
        if (i4 == -1) {
            i4 = -1;
        } else {
            this.l = i3 + i4;
            this.h.a(i4);
        }
        this.n = i4 == -1;
        return i4;
    }
}
