package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class iys extends jbj {
    private static final ypf a = ols.R("CAR.GAL.CAR_INTENT");
    private final iyr b;

    public iys(iyr iyrVar, jbn jbnVar) {
        super(22, iyrVar, jbnVar, 0);
        this.b = iyrVar;
    }

    @Override // defpackage.jbj
    protected final void a(int i, ByteBuffer byteBuffer) throws abon {
        a.f().ai(1663).y("Received an intent from the car: {Type: NAVIGATE, Metadata: %s}", ((xig) abnv.A(xig.a, byteBuffer, abnj.a())).b);
        iyr iyrVar = this.b;
        synchronized (((ikd) iyrVar).a) {
            Iterator it = ((ikd) iyrVar).b.iterator();
            while (it.hasNext()) {
                ((ikc) it.next()).a();
            }
        }
    }

    @Override // defpackage.iyx
    public final void b(int i) {
    }
}
