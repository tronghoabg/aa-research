package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public final class ajli extends ajmv {
    final /* synthetic */ ajlj a;

    public ajli(ajlj ajljVar) {
        this.a = ajljVar;
    }

    @Override // defpackage.ajmv
    protected final void a() {
        ajlj ajljVar = this.a;
        ajljVar.m(9);
        ajlc ajlcVar = ajljVar.b;
        synchronized (ajlcVar) {
            long j = ajlcVar.n;
            long j2 = ajlcVar.m;
            if (j >= j2) {
                ajlcVar.m = j2 + 1;
                ajlcVar.p = System.nanoTime() + 1000000000;
                ajiw ajiwVar = ajlcVar.i;
                String str = ajlcVar.d;
                ajiwVar.e(String.valueOf(str).concat(" ping"), new tim(ajlcVar, 13));
            }
        }
    }

    public final void b() throws IOException {
        if (e()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
