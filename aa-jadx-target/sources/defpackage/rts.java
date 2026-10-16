package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rts extends defpackage.rce {
    public rts(defpackage.rtt rttVar, android.os.Looper looper) {
        super(rttVar, looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        com.google.android.gms.car.senderprotocol.Channel channel;
        defpackage.rly.a(defpackage.rtg.a);
        defpackage.rtt rttVar = (defpackage.rtt) v();
        if (rttVar == null) {
            defpackage.rtt.a.f().ai(8282).u("Dropping message, no channel manager");
            return;
        }
        synchronized (rttVar.d) {
            channel = rttVar.c[message.arg1];
        }
        int i = message.what;
        if (i == 0) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) message.obj;
            if (channel.h == 2) {
                channel.d.h(byteBuffer);
            }
        } else if (i == 1) {
            java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) message.obj;
            short s = byteBuffer2.getShort();
            java.nio.ByteBuffer byteBufferSlice = byteBuffer2.slice();
            defpackage.rtm rtmVar = channel.j;
            defpackage.rtn rtnVar = (defpackage.rtn) rtmVar.a.get(s);
            if (rtnVar != null) {
                synchronized (rtmVar.b.k) {
                    rtnVar.a(byteBufferSlice);
                }
            }
        } else {
            if (i != 2) {
                throw new java.lang.RuntimeException(defpackage.a.cb(message, "Unknown message "));
            }
            channel.d.e(message.arg2);
        }
        defpackage.rly.a(defpackage.rtg.a);
    }
}
