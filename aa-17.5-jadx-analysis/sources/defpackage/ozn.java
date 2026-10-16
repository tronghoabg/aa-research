package defpackage;

import android.net.TrafficStats;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class ozn {
    private static final yph e = yph.c("GH.WirelessProxy");
    public final SocketChannel a;
    public final SelectionKey b;
    protected final String c;
    private final ozm f;
    private ByteBuffer g;
    public int d = 1;
    private long h = 0;

    public ozn(String str, SocketChannel socketChannel, SelectionKey selectionKey, ozm ozmVar) {
        this.c = str;
        this.f = ozmVar;
        this.a = socketChannel;
        this.b = selectionKey;
    }

    private static String g(ByteBuffer byteBuffer) {
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
        return new String(bArr, 0, i, StandardCharsets.UTF_8);
    }

    @ResultIgnorabilityUnspecified
    final int a(ByteBuffer byteBuffer) {
        int iWrite = 0;
        while (byteBuffer.hasRemaining()) {
            try {
                iWrite += this.a.write(byteBuffer);
            } catch (IOException e2) {
                ((ype) ((ype) ((ype) e.g()).p(e2)).ai(6243)).y("%s: failed to write data", this.c);
                return iWrite;
            }
        }
        return iWrite;
    }

    public void b() {
        try {
            ((ype) e.l().ai(6235)).y("%s: closed", this.c);
            SocketChannel socketChannel = this.a;
            TrafficStats.untagSocket(socketChannel.socket());
            this.b.cancel();
            socketChannel.close();
        } catch (Exception e2) {
            ((ype) ((ype) ((ype) e.g()).p(e2)).ai(6236)).y("%s: close exception", this.c);
        }
    }

    protected abstract void c(String str);

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Map] */
    final void d() throws IOException {
        String strTrim;
        ByteBuffer byteBufferAllocate = this.g;
        if (byteBufferAllocate == null) {
            byteBufferAllocate = ByteBuffer.allocate(8192);
            this.g = byteBufferAllocate;
        }
        byteBufferAllocate.clear();
        ByteBuffer byteBuffer = this.g;
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
            long j2 = i + j;
            this.h = j2;
            if (j == 0 || j / 1048576 != j2 / 1048576) {
                ((ype) e.l().ai(6237)).L("%s: bytes read: %d", this.c, this.h);
            }
            if (this.d == 2) {
                this.f.b(this, byteBuffer);
                return;
            }
            String strG = g(byteBuffer);
            if (strG == null) {
                ((ype) ((ype) e.g()).ai((char) 6238)).u("Failed to read first line");
                return;
            }
            c(strG);
            HashMap map = new HashMap();
            String strG2 = g(byteBuffer);
            while (strG2 != null && !strG2.isEmpty()) {
                int iIndexOf = strG2.indexOf(58);
                if (iIndexOf >= 0) {
                    String strTrim2 = strG2.substring(0, iIndexOf).trim();
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
                ((ype) e.l().ai((char) 6239)).y("Header: %s", map);
            }
            ozm ozmVar = this.f;
            ozo ozoVar = (ozo) ozmVar;
            ozp ozpVar = ozoVar.b;
            if (this != ozpVar || ozpVar == null) {
                ozq ozqVar = ozoVar.c;
                if (this != ozqVar || ozqVar == null || ozpVar == null) {
                    ((ype) ((ype) ozo.a.g()).ai((char) 6251)).y("Received request for unexpected channel: %s", this);
                } else {
                    ozpVar.f(String.valueOf(ozqVar.e).concat("\r\n\r\n"));
                }
            } else if ("CONNECT".equals(ozpVar.e)) {
                if (!map.isEmpty()) {
                    ozoVar.e.a.putAll(map);
                }
                String strG3 = ozpVar.g();
                if (strG3 == null || !ozoVar.d.contains(woy.ar(strG3))) {
                    ((ype) ((ype) ozo.a.g()).ai((char) 6247)).y("Access denied to %s", ozpVar.g());
                } else {
                    try {
                        ozq ozqVar2 = ((ozo) ozmVar).c;
                        if (ozqVar2 == null) {
                            String strG4 = ozpVar.g();
                            if (ozpVar.f == 0) {
                                ozpVar.h();
                            }
                            int i2 = ozpVar.f;
                            ((ype) ozo.a.l().ai(6246)).K("Connecting to %s:%d", strG4, i2);
                            SocketChannel socketChannelOpen = SocketChannel.open();
                            socketChannelOpen.configureBlocking(true);
                            if (!socketChannelOpen.connect(new InetSocketAddress(InetAddress.getByName(strG4), i2))) {
                                throw new IOException(a.bA(i2, strG4, "Failed to connect to ", ":"));
                            }
                            if (!socketChannelOpen.finishConnect()) {
                                throw new IOException(a.bA(i2, strG4, "Failed to finish connection to ", ":"));
                            }
                            socketChannelOpen.configureBlocking(false);
                            ozqVar2 = (ozq) ((ozo) ozmVar).c(ozq.class, socketChannelOpen);
                        } else {
                            ozqVar2.e();
                        }
                        ((ozo) ozmVar).c = ozqVar2;
                        ozqVar2.d = 2;
                        ozpVar.f("HTTP/1.0 200 Connection Established\r\nProxy-agent: AndroidAuto\r\n\r\n");
                    } catch (IOException e2) {
                        ((ype) ((ype) ((ype) ozo.a.g()).p(e2)).ai((char) 6248)).u("Failed to connect to target host");
                    }
                }
                ((ype) ((ype) ozo.a.g()).ai((char) 6252)).u("Failed to connect to target host");
                ozoVar.d();
            } else {
                ((ype) ((ype) ozo.a.g()).ai(6253)).y("Method %s is not supported", ozpVar.e);
                ozoVar.d();
            }
            this.d = 2;
            if (byteBuffer.remaining() > 0) {
                ozmVar.b(this, byteBuffer);
            }
        } catch (IOException e3) {
            ((ype) ((ype) ((ype) e.g()).p(e3)).ai(6240)).y("%s: read exception", this.c);
            this.f.a(this);
        }
    }

    public void e() {
        ((ype) e.l().ai((char) 6241)).y("Resetting %s", this);
        this.d = 1;
    }

    final void f(String str) {
        byte[] bytes = str.getBytes();
        int iA = a(ByteBuffer.wrap(bytes));
        int length = bytes.length;
        if (length != iA) {
            ((ype) ((ype) e.g()).ai(6242)).R("%s: failed to send all the bytes, expected: %d, actual: %d", this.c, Integer.valueOf(length), Integer.valueOf(iA));
        }
    }

    public final String toString() {
        return "Channel {" + this.c + "@" + Integer.toHexString(hashCode()) + "}";
    }
}
