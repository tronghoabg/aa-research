package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class akaq extends defpackage.akae implements defpackage.akas {
    public boolean n;
    private final java.net.Socket o;

    public akaq(java.net.Socket socket, int i, defpackage.akbs akbsVar) throws java.io.IOException {
        defpackage.aguw.e(socket, "Socket");
        this.o = socket;
        this.n = false;
        i = i < 0 ? socket.getReceiveBufferSize() : i;
        i = i < 1024 ? 1024 : i;
        java.io.InputStream inputStream = socket.getInputStream();
        defpackage.aguw.e(inputStream, "Input stream");
        defpackage.aguw.e(akbsVar, "HTTP parameters");
        this.a = inputStream;
        this.b = new byte[i];
        this.k = 0;
        this.l = 0;
        this.c = new defpackage.akcg(i);
        java.lang.String str = (java.lang.String) akbsVar.a("http.protocol.element-charset");
        this.d = str != null ? java.nio.charset.Charset.forName(str) : defpackage.ajpx.b;
        this.e = this.d.equals(defpackage.ajpx.b);
        this.m = null;
        this.f = akbsVar.c("http.connection.max-line-length", -1);
        this.g = akbsVar.c("http.connection.min-chunk-limit", defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE);
        this.h = new defpackage.akan();
        java.nio.charset.CodingErrorAction codingErrorAction = (java.nio.charset.CodingErrorAction) akbsVar.a("http.malformed.input.action");
        this.i = codingErrorAction == null ? java.nio.charset.CodingErrorAction.REPORT : codingErrorAction;
        java.nio.charset.CodingErrorAction codingErrorAction2 = (java.nio.charset.CodingErrorAction) akbsVar.a("http.unmappable.input.action");
        this.j = codingErrorAction2 == null ? java.nio.charset.CodingErrorAction.REPORT : codingErrorAction2;
    }

    @Override // defpackage.akau
    public final boolean d(int i) throws java.io.IOException {
        boolean zH = h();
        if (zH) {
            return zH;
        }
        java.net.Socket socket = this.o;
        int soTimeout = socket.getSoTimeout();
        try {
            socket.setSoTimeout(i);
            f();
            return h();
        } finally {
            this.o.setSoTimeout(soTimeout);
        }
    }

    @Override // defpackage.akas
    public final boolean e() {
        return this.n;
    }

    @Override // defpackage.akae
    protected final int f() throws java.io.IOException {
        int i = this.k;
        if (i > 0) {
            int i2 = this.l - i;
            if (i2 > 0) {
                byte[] bArr = this.b;
                java.lang.System.arraycopy(bArr, i, bArr, 0, i2);
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
