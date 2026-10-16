package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pak {
    private static final defpackage.yqm e = defpackage.yqm.c("GH.WirelessProxy");
    public final java.nio.channels.SocketChannel a;
    public final java.nio.channels.SelectionKey b;
    protected final java.lang.String c;
    private final defpackage.paj f;
    private java.nio.ByteBuffer g;
    public int d = 1;
    private long h = 0;

    public pak(java.lang.String str, java.nio.channels.SocketChannel socketChannel, java.nio.channels.SelectionKey selectionKey, defpackage.paj pajVar) {
        this.c = str;
        this.f = pajVar;
        this.a = socketChannel;
        this.b = selectionKey;
    }

    private static java.lang.String g(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 0) {
            return null;
        }
        int i = 0;
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition++) {
            byte b = byteBuffer.get(iPosition);
            i++;
            if (b == -1 || b == 10) {
                break;
            }
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr, 0, i);
        while (i > 0) {
            int i2 = i - 1;
            if (bArr[i2] >= 32) {
                break;
            }
            i = i2;
        }
        return new java.lang.String(bArr, 0, i, java.nio.charset.StandardCharsets.UTF_8);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    final int a(java.nio.ByteBuffer byteBuffer) {
        int iWrite = 0;
        while (byteBuffer.hasRemaining()) {
            try {
                iWrite += this.a.write(byteBuffer);
            } catch (java.io.IOException e2) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) e.g()).p(e2)).ai(6269)).y("%s: failed to write data", this.c);
                return iWrite;
            }
        }
        return iWrite;
    }

    public void b() {
        try {
            ((defpackage.yqj) e.l().ai(6261)).y("%s: closed", this.c);
            java.nio.channels.SocketChannel socketChannel = this.a;
            android.net.TrafficStats.untagSocket(socketChannel.socket());
            this.b.cancel();
            socketChannel.close();
        } catch (java.lang.Exception e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) e.g()).p(e2)).ai(6262)).y("%s: close exception", this.c);
        }
    }

    protected abstract void c(java.lang.String str);

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Map] */
    final void d() {
        java.lang.String strTrim;
        java.nio.ByteBuffer byteBufferAllocate = this.g;
        if (byteBufferAllocate == null) {
            byteBufferAllocate = java.nio.ByteBuffer.allocate(8192);
            this.g = byteBufferAllocate;
        }
        byteBufferAllocate.clear();
        java.nio.ByteBuffer byteBuffer = this.g;
        byteBuffer.clear();
        try {
            int i = this.a.read(byteBuffer);
            byteBuffer.flip();
            if (i == -1) {
                this.f.a(this);
                return;
            }
            if (i == 0) {
                return;
            }
            long j = this.h;
            long j2 = ((long) i) + j;
            this.h = j2;
            if (j == 0 || j / 1048576 != j2 / 1048576) {
                ((defpackage.yqj) e.l().ai(6263)).L("%s: bytes read: %d", this.c, this.h);
            }
            if (this.d == 2) {
                this.f.b(this, byteBuffer);
                return;
            }
            java.lang.String strG = g(byteBuffer);
            if (strG == null) {
                ((defpackage.yqj) ((defpackage.yqj) e.g()).ai((char) 6264)).u("Failed to read first line");
                return;
            }
            c(strG);
            java.util.HashMap map = new java.util.HashMap();
            java.lang.String strG2 = g(byteBuffer);
            while (strG2 != null && !strG2.isEmpty()) {
                int iIndexOf = strG2.indexOf(58);
                if (iIndexOf >= 0) {
                    java.lang.String strTrim2 = strG2.substring(0, iIndexOf).trim();
                    strTrim = strG2.substring(iIndexOf + 1).trim();
                    strG2 = strTrim2;
                } else {
                    strTrim = "";
                }
                if (strG2.startsWith("X-Interc-")) {
                    map.put(strG2, strTrim);
                }
                strG2 = g(byteBuffer);
            }
            if (!map.isEmpty()) {
                ((defpackage.yqj) e.l().ai((char) 6265)).y("Header: %s", map);
            }
            defpackage.paj pajVar = this.f;
            defpackage.pal palVar = (defpackage.pal) pajVar;
            defpackage.pam pamVar = palVar.b;
            if (this != pamVar || pamVar == null) {
                defpackage.pan panVar = palVar.c;
                if (this != panVar || panVar == null || pamVar == null) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.pal.a.g()).ai((char) 6277)).y("Received request for unexpected channel: %s", this);
                } else {
                    pamVar.f(java.lang.String.valueOf(panVar.e).concat("\r\n\r\n"));
                }
            } else if ("CONNECT".equals(pamVar.e)) {
                if (!map.isEmpty()) {
                    palVar.e.a.putAll(map);
                }
                java.lang.String strG3 = pamVar.g();
                if (strG3 == null || !palVar.d.contains(defpackage.ysr.bB(strG3))) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.pal.a.g()).ai((char) 6273)).y("Access denied to %s", pamVar.g());
                } else {
                    try {
                        defpackage.pan panVar2 = ((defpackage.pal) pajVar).c;
                        if (panVar2 == null) {
                            java.lang.String strG4 = pamVar.g();
                            if (pamVar.f == 0) {
                                pamVar.h();
                            }
                            int i2 = pamVar.f;
                            ((defpackage.yqj) defpackage.pal.a.l().ai(6272)).K("Connecting to %s:%d", strG4, i2);
                            java.nio.channels.SocketChannel socketChannelOpen = java.nio.channels.SocketChannel.open();
                            socketChannelOpen.configureBlocking(true);
                            if (!socketChannelOpen.connect(new java.net.InetSocketAddress(java.net.InetAddress.getByName(strG4), i2))) {
                                throw new java.io.IOException(defpackage.a.by(i2, strG4, "Failed to connect to ", ":"));
                            }
                            if (!socketChannelOpen.finishConnect()) {
                                throw new java.io.IOException(defpackage.a.by(i2, strG4, "Failed to finish connection to ", ":"));
                            }
                            socketChannelOpen.configureBlocking(false);
                            panVar2 = (defpackage.pan) ((defpackage.pal) pajVar).c(defpackage.pan.class, socketChannelOpen);
                        } else {
                            panVar2.e();
                        }
                        ((defpackage.pal) pajVar).c = panVar2;
                        panVar2.d = 2;
                        pamVar.f("HTTP/1.0 200 Connection Established\r\nProxy-agent: AndroidAuto\r\n\r\n");
                    } catch (java.io.IOException e2) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.pal.a.g()).p(e2)).ai((char) 6274)).u("Failed to connect to target host");
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.pal.a.g()).ai((char) 6278)).u("Failed to connect to target host");
                        palVar.d();
                    }
                }
                ((defpackage.yqj) ((defpackage.yqj) defpackage.pal.a.g()).ai((char) 6278)).u("Failed to connect to target host");
                palVar.d();
            } else {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.pal.a.g()).ai(6279)).y("Method %s is not supported", pamVar.e);
                palVar.d();
            }
            this.d = 2;
            if (byteBuffer.remaining() > 0) {
                pajVar.b(this, byteBuffer);
            }
        } catch (java.io.IOException e3) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) e.g()).p(e3)).ai(6266)).y("%s: read exception", this.c);
            this.f.a(this);
        }
    }

    public void e() {
        ((defpackage.yqj) e.l().ai((char) 6267)).y("Resetting %s", this);
        this.d = 1;
    }

    final void f(java.lang.String str) {
        byte[] bytes = str.getBytes();
        int iA = a(java.nio.ByteBuffer.wrap(bytes));
        int length = bytes.length;
        if (length != iA) {
            ((defpackage.yqj) ((defpackage.yqj) e.g()).ai(6268)).R("%s: failed to send all the bytes, expected: %d, actual: %d", this.c, java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(iA));
        }
    }

    public final java.lang.String toString() {
        return "Channel {" + this.c + "@" + java.lang.Integer.toHexString(hashCode()) + "}";
    }
}
