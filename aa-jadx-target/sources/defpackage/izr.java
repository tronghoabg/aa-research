package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class izr extends defpackage.rce {
    public izr(defpackage.izs izsVar, android.os.Looper looper) {
        super(izsVar, looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        defpackage.izk izkVar;
        defpackage.izs izsVar = (defpackage.izs) v();
        if (izsVar == null) {
            defpackage.izs.a.f().ai(1676).u("Dropping message, no channel manager");
            return;
        }
        synchronized (izsVar.d) {
            izkVar = izsVar.c[message.arg1];
        }
        int i = message.what;
        if (i == 0) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) message.obj;
            izkVar.k.getAndAdd(byteBuffer.remaining());
            if (izkVar.h.get() == 2) {
                izkVar.d.S(byteBuffer);
                return;
            }
            return;
        }
        if (i != 1) {
            if (i == 2) {
                izkVar.d.b(message.arg2);
                return;
            } else {
                if (i != 3) {
                    throw new java.lang.RuntimeException(defpackage.a.cb(message, "Unknown message "));
                }
                izkVar.d.R(message.arg2);
                return;
            }
        }
        java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) message.obj;
        izkVar.k.getAndAdd(byteBuffer2.remaining());
        short s = byteBuffer2.getShort();
        java.nio.ByteBuffer byteBufferSlice = byteBuffer2.slice();
        defpackage.izi iziVar = izkVar.j;
        defpackage.izj izjVar = (defpackage.izj) iziVar.a.get(s);
        if (izjVar == null) {
            return;
        }
        synchronized (iziVar.b.l) {
            izjVar.a(byteBufferSlice);
        }
    }
}
