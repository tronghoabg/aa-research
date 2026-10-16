package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class adjq {
    public static final Logger c = Logger.getLogger(adjq.class.getName());
    public static final adjq d = new adjq();
    final adjj e;
    public final adnb f;
    public final int g;

    public adjq(adjq adjqVar, adnb adnbVar) {
        this.e = adjqVar instanceof adjj ? (adjj) adjqVar : adjqVar.e;
        this.f = adnbVar;
        int i = adjqVar.g + 1;
        this.g = i;
        e(i);
    }

    private static void e(int i) {
        if (i == 1000) {
            c.logp(Level.SEVERE, "io.grpc.Context", "validateGeneration", "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public static adjq k() {
        adjq adjqVarA = adjo.a.a();
        return adjqVarA == null ? d : adjqVarA;
    }

    public static void m(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public adjq a() {
        adjq adjqVarB = adjo.a.b(this);
        return adjqVarB == null ? d : adjqVarB;
    }

    public adjr b() {
        adjj adjjVar = this.e;
        if (adjjVar == null) {
            return null;
        }
        return adjjVar.a;
    }

    public Throwable c() {
        adjj adjjVar = this.e;
        if (adjjVar == null) {
            return null;
        }
        return adjjVar.c();
    }

    public void d(adjk adjkVar, Executor executor) {
        adjj adjjVar = this.e;
        if (adjjVar == null) {
            return;
        }
        adjjVar.e(new adjm(executor, adjkVar, this));
    }

    public void f(adjq adjqVar) {
        m(adjqVar, "toAttach");
        adjo.a.c(this, adjqVar);
    }

    public void g(adjk adjkVar) {
        adjj adjjVar = this.e;
        if (adjjVar == null) {
            return;
        }
        adjjVar.h(adjkVar, this);
    }

    public boolean i() {
        adjj adjjVar = this.e;
        if (adjjVar == null) {
            return false;
        }
        return adjjVar.i();
    }

    public final adjq l(adjn adjnVar, Object obj) {
        adnb adnbVar = this.f;
        return new adjq(this, adnbVar == null ? new adna(adjnVar, obj, 0) : adnbVar.c(adjnVar, obj, adjnVar.hashCode(), 0));
    }

    private adjq() {
        this.e = null;
        this.f = null;
        this.g = 0;
    }

    public adjq(adnb adnbVar, int i) {
        this.e = null;
        this.f = adnbVar;
        this.g = i;
        e(i);
    }
}
