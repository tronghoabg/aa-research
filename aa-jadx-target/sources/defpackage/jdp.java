package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class jdp extends defpackage.jbq {
    private static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.MIC");
    protected int d;

    public jdp(defpackage.izd izdVar, defpackage.jbu jbuVar) {
        super(6, izdVar, jbuVar, 4);
        this.d = 0;
    }

    @Override // defpackage.jbq
    protected final void a(int i, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp {
        int iBb = defpackage.sqs.bb(i);
        if (iBb == 32775) {
            xlu xluVar = (xlu) defpackage.abox.A(xlu.a, byteBuffer, defpackage.abol.a());
            if (xluVar != null) {
                h(xluVar);
                return;
            }
            return;
        }
        if (iBb != 1) {
            a.h().ai(1903).w("Received message with invalid type header: %d", i);
        } else {
            byteBuffer.getLong();
            i(byteBuffer);
        }
    }

    protected abstract void h(xlu xluVar);

    protected abstract void i(java.nio.ByteBuffer byteBuffer);

    @Override // defpackage.ize
    public final void b(int i) {
    }
}
