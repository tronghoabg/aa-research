package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class jyk {
    public boolean a;
    public final Object b;
    public final Object c;

    public jyk(jzb jzbVar, eqj eqjVar, eqj eqjVar2, eqa eqaVar) {
        this.c = jzbVar;
        eqm eqmVar = new eqm();
        this.b = eqmVar;
        tby.e(eqmVar, eqjVar, eqjVar2, new jjb(this, 3)).fE(eqaVar, new hlg(this, 8));
    }

    public static jyk a() {
        return (jyk) mki.a.i(jyk.class);
    }

    public final void b(boolean z) {
        ((eqj) this.b).m(Boolean.valueOf(z));
    }

    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.a;
        }
        return z;
    }

    public jyk() {
        this.c = new jzb();
        this.b = new eqm();
    }

    public jyk(Executor executor) {
        executor.getClass();
        this.b = new Object();
        this.c = new ArrayList();
    }
}
