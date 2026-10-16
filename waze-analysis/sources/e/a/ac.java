package e.a;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ac {

    /* renamed from: b, reason: collision with root package name */
    static final Logger f46234b = Logger.getLogger(ac.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final ac f46235c = new ac();

    /* renamed from: d, reason: collision with root package name */
    final y f46236d;

    /* renamed from: e, reason: collision with root package name */
    final dp f46237e;

    /* renamed from: f, reason: collision with root package name */
    final int f46238f;

    private ac(ac acVar, dp dpVar) {
        this.f46236d = acVar instanceof y ? (y) acVar : acVar.f46236d;
        this.f46237e = dpVar;
        int i2 = acVar.f46238f + 1;
        this.f46238f = i2;
        k(i2);
    }

    public static ac g() {
        ac acVarA = aa.f46233a.a();
        return acVarA == null ? f46235c : acVarA;
    }

    static void i(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static z j() {
        return new z();
    }

    private static void k(int i2) {
        if (i2 == 1000) {
            f46234b.logp(Level.SEVERE, "io.grpc.Context", "validateGeneration", "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public ac a() {
        ac acVarB = aa.f46233a.b(this);
        return acVarB == null ? f46235c : acVarB;
    }

    public void b(ac acVar) {
        i(acVar, "toAttach");
        aa.f46233a.c(this, acVar);
    }

    public void c(Executor executor) {
        i(executor, "executor");
        if (this.f46236d == null) {
            return;
        }
        int i2 = y.f47859a;
        throw null;
    }

    public void d() {
        if (this.f46236d != null) {
            throw null;
        }
    }

    public void e() {
        if (this.f46236d != null) {
            throw null;
        }
    }

    public void f() {
        if (this.f46236d == null) {
            return;
        }
        int i2 = y.f47859a;
        throw null;
    }

    public final ac h(z zVar, Object obj) {
        dp dpVar = this.f46237e;
        return new ac(this, dpVar == null ? new Cdo(zVar, obj, 0) : dpVar.c(zVar, obj, zVar.hashCode(), 0));
    }

    private ac() {
        this.f46236d = null;
        this.f46237e = null;
        this.f46238f = 0;
        k(0);
    }
}
