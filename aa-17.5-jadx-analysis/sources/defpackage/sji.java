package defpackage;

import android.os.RemoteException;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class sji {
    public final Object a;
    public boolean b;
    public final Object c;
    public final Object d;

    public sji() {
        this.a = new Object();
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
    }

    public static void a(String str, int i) {
        sjg.b().c(new LogErrorParcelable(str, i, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, jbo, rwp] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, jbn] */
    public final rwp b(jbp jbpVar, rws rwsVar) throws RemoteException {
        synchronized (this.d) {
            boolean z = this.b;
            ?? r2 = this.c;
            if (z) {
                return r2;
            }
            if (jbpVar.a(r2) != 1) {
                this.a.aF(yze.PROTOCOL_WRONG_CONFIGURATION, yzf.NO_SENSORS, "No sensors");
                return null;
            }
            this.b = true;
            ((jkx) r2).f(rwsVar);
            jbpVar.j(new jqr(this, 0));
            return r2;
        }
    }

    public sji(jbn jbnVar) {
        this.d = new Object();
        this.a = jbnVar;
        this.c = new jkx(jbnVar);
    }

    public sji(nfh nfhVar, cvc cvcVar, bah bahVar) {
        this.a = nfhVar;
        this.d = cvcVar;
        this.c = bahVar;
        this.b = true;
    }
}
