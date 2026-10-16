package defpackage;

import android.content.Context;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes2.dex */
final class rtq extends Thread {
    public volatile boolean a;
    public final Object b;
    public WritableByteChannel c;
    public rua d;
    private final Context e;
    private final InputStream f;
    private final byte[] g;
    private final ByteBuffer h;
    private final boolean i;
    private final int j;
    private boolean k;

    public rtq(Context context, InputStream inputStream, rto rtoVar) {
        super("ReaderThread");
        byte[] bArr = new byte[16384];
        this.g = bArr;
        this.a = true;
        this.b = new Object();
        this.k = false;
        this.f = inputStream;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.h = byteBufferWrap;
        byteBufferWrap.limit(0);
        this.i = true;
        this.e = context;
        this.j = rtoVar.e;
        if (context == null) {
            rtt.a.h().ai(8285).u("Context is null, can't publish connection events.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        r5 = r8.f;
        r6 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (true == r8.i) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r1 = 16384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        r1 = r5.read(r6, 0, r1);
        r5 = r8.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r5 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        r5.e(android.os.SystemClock.elapsedRealtime(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        if (r1 < 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        r8.k = true;
        r3.limit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r1 = defpackage.rtt.a.h().ai(8290);
        r5 = r8.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r8.j != 2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        r1.Q("ReaderThread: end of stream received, dataReceived=%b, isWireless=%b", r5, r4);
        r8.a = false;
        r0 = r8.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        if (r0 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        if (r8.k == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        r1 = defpackage.yxi.FRAMER_READ_END_OF_STREAM;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        r1 = defpackage.yxi.FRAMER_READ_END_OF_STREAM_NO_DATA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00aa, code lost:
    
        defpackage.ols.M(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00af, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        r3 = defpackage.rtt.a.h().p(r1).ai(8299);
        r6 = r8.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c6, code lost:
    
        if (r8.j == 2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c9, code lost:
    
        r3.Q("IO exception, dataReceived=%b, isWireless=%b", r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ce, code lost:
    
        if (r8.k == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d4, code lost:
    
        defpackage.ols.M(r0, defpackage.yxi.FRAMER_READ_IO_EXCEPTION_WITH_NO_DATA_RECEIVED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d9, code lost:
    
        r0 = r8.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00db, code lost:
    
        if (r0 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00dd, code lost:
    
        defpackage.ols.M(r0, defpackage.yxi.FRAMER_READ_IO_EXCEPTION);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e4, code lost:
    
        if ((r1 instanceof java.net.SocketTimeoutException) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e6, code lost:
    
        defpackage.ols.M(r0, defpackage.yxi.FRAMER_READ_IO_EXCEPTION_TIMEOUT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ee, code lost:
    
        if ((r1 instanceof java.net.SocketException) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fa, code lost:
    
        if (j$.util.Objects.equals(r1.getMessage(), "Software caused connection abort") != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fc, code lost:
    
        defpackage.ols.M(r0, defpackage.yxi.FRAMER_READ_IO_EXCEPTION_SW_CAUSED_CONNECTION_ABORT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010c, code lost:
    
        if (j$.util.Objects.equals(r1.getMessage(), "Connection reset") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010e, code lost:
    
        defpackage.ols.M(r0, defpackage.yxi.FRAMER_READ_IO_EXCEPTION_CONNECTION_RESET);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011e, code lost:
    
        if (j$.util.Objects.equals(r1.getMessage(), "Socket closed") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0120, code lost:
    
        defpackage.ols.M(r0, defpackage.yxi.FRAMER_READ_IO_EXCEPTION_SOCKET_CLOSED);
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rtq.run():void");
    }
}
