package v9;

import E5.n0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import md.k0;
import me.C3558a;
import r9.S;

/* loaded from: classes4.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f47103a;

    public p(n0 n0Var) {
        this.f47103a = n0Var;
    }

    @Override // v9.s
    public final void a(k0 k0Var) {
        n0 n0Var = this.f47103a;
        n0Var.getClass();
        if (k0Var.f()) {
            A6.c.z(!n0Var.u(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        n0Var.f3481l = null;
        boolean zU = n0Var.u();
        io.flutter.plugin.platform.x xVar = (io.flutter.plugin.platform.x) n0Var.f3480j;
        if (!zU) {
            xVar.d(1);
            return;
        }
        if (xVar.f37166a == 2) {
            xVar.c(1);
            A6.c.z(xVar.f37167b == 0, "watchStreamFailures must be 0", new Object[0]);
            A6.c.z(((C3558a) xVar.f37169d) == null, "onlineStateTimer must be null", new Object[0]);
        } else {
            int i5 = xVar.f37167b + 1;
            xVar.f37167b = i5;
            if (i5 >= 1) {
                C3558a c3558a = (C3558a) xVar.f37169d;
                if (c3558a != null) {
                    c3558a.n();
                    xVar.f37169d = null;
                }
                Locale locale = Locale.ENGLISH;
                xVar.b("Connection failed 1 times. Most recent error: " + k0Var);
                xVar.c(3);
            }
        }
        n0Var.w();
    }

    @Override // v9.s
    public final void b() {
        n0 n0Var = this.f47103a;
        Iterator it = ((HashMap) n0Var.f3474d).values().iterator();
        while (it.hasNext()) {
            n0Var.t((S) it.next());
        }
    }
}
