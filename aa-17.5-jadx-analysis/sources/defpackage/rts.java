package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class rts {
    public final boolean a;
    public final OutputStream b;
    final /* synthetic */ rtt c;
    private final ByteBuffer d;
    private byte[] e;

    public rts(rtt rttVar, OutputStream outputStream, int i) {
        this.c = rttVar;
        this.d = ByteBuffer.allocate(8);
        this.e = new byte[8];
        this.b = new BufferedOutputStream(outputStream, i);
        this.a = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011b, code lost:
    
        ((defpackage.rsj) r7.next()).b.h(r25, r27, r28, r7, r30);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void a(com.google.android.gms.car.senderprotocol.ChannelMessage r35, boolean r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rts.a(com.google.android.gms.car.senderprotocol.ChannelMessage, boolean):void");
    }

    public rts(rtt rttVar, OutputStream outputStream) {
        this.c = rttVar;
        this.d = ByteBuffer.allocate(8);
        this.e = new byte[8];
        this.b = outputStream;
        this.a = false;
    }
}
