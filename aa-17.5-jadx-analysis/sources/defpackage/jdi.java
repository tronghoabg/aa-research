package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class jdi extends jbj {
    private static final ypf a = ols.R("CAR.GAL.MIC");
    protected int d;

    public jdi(iyw iywVar, jbn jbnVar) {
        super(6, iywVar, jbnVar, 4);
        this.d = 0;
    }

    @Override // defpackage.jbj
    protected final void a(int i, ByteBuffer byteBuffer) throws abon {
        int iO = wub.o(i);
        if (iO == 32775) {
            xkt xktVar = (xkt) abnv.A(xkt.a, byteBuffer, abnj.a());
            if (xktVar != null) {
                h(xktVar);
                return;
            }
            return;
        }
        if (iO != 1) {
            a.h().ai(1903).w("Received message with invalid type header: %d", i);
        } else {
            byteBuffer.getLong();
            i(byteBuffer);
        }
    }

    protected abstract void h(xkt xktVar);

    protected abstract void i(ByteBuffer byteBuffer);

    @Override // defpackage.iyx
    public final void b(int i) {
    }
}
