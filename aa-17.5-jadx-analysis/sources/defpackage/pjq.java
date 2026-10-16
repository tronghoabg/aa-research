package defpackage;

import com.google.android.apps.gmm.systems.accounts.GmmAccount;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class pjq implements uyl {
    public final zhc a = new zhc();
    private final Executor b;
    private final vaa c;
    private final oct d;

    public pjq(Executor executor, pmq pmqVar) {
        GmmAccount.SignedOut signedOut = pmp.a;
        this.c = new vaa(signedOut);
        int i = yfq.d;
        new vaa(yls.a);
        ajac.a(signedOut);
        this.b = executor;
        final oct octVar = new oct(pmqVar);
        this.d = octVar;
        lws.a = new pmn() { // from class: pjo
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, pmq] */
            @Override // defpackage.pmn
            public final Object a() {
                abry abryVar = octVar.a.a().c;
                if (abryVar == null) {
                    abryVar = abry.a;
                }
                return woy.ak(abryVar.d);
            }
        };
        lws.b = new pjp(octVar);
    }

    public final uzy a() {
        return this.c.a;
    }

    final void c() {
        this.b.execute(new pfp(this, 12));
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }
}
