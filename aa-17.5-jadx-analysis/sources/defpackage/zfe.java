package defpackage;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* loaded from: classes.dex */
abstract class zfe extends zfi {
    private static final zgo b = new zgo(zfe.class);
    private yfg c;
    private final boolean d;
    private final boolean e;

    public zfe(yfg yfgVar, boolean z, boolean z2) {
        super(yfgVar.size());
        yfgVar.getClass();
        this.c = yfgVar;
        this.d = z;
        this.e = z2;
    }

    private static boolean A(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    private final void x(int i, zgp zgpVar) {
        try {
            e(i, a.L(zgpVar));
        } catch (ExecutionException e) {
            y(e.getCause());
        } catch (Throwable th) {
            y(th);
        }
    }

    private final void y(Throwable th) {
        th.getClass();
        if (this.d && !p(th)) {
            Set<Throwable> set = this.seenExceptionsField;
            if (set == null) {
                Set setT = yrm.t();
                d(setT);
                zfi.a.b(this, setT);
                set = this.seenExceptionsField;
                set.getClass();
            }
            if (A(set, th)) {
                z(th);
                return;
            }
        }
        if (th instanceof Error) {
            z(th);
        }
    }

    private static void z(Throwable th) {
        b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    @Override // defpackage.zeu
    protected final void b() {
        yfg yfgVar = this.c;
        w(1);
        if ((yfgVar != null) && isCancelled()) {
            boolean zQ = q();
            yno it = yfgVar.iterator();
            while (it.hasNext()) {
                ((zgp) it.next()).cancel(zQ);
            }
        }
    }

    @Override // defpackage.zfi
    public final void d(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thJ = j();
        thJ.getClass();
        A(set, thJ);
    }

    public abstract void e(int i, Object obj);

    public final void f(yfg yfgVar) {
        int iA = zfi.a.a(this);
        int i = 0;
        woy.aa(iA >= 0, "Less than 0 remaining futures");
        if (iA == 0) {
            if (yfgVar != null) {
                yno it = yfgVar.iterator();
                while (it.hasNext()) {
                    zgp zgpVar = (zgp) it.next();
                    if (!zgpVar.isCancelled()) {
                        x(i, zgpVar);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            g();
            w(2);
        }
    }

    @Override // defpackage.zeu
    protected final String fO() {
        yfg yfgVar = this.c;
        return yfgVar != null ? "futures=".concat(yfgVar.toString()) : super.fO();
    }

    public abstract void g();

    final void u() {
        yfg yfgVar = this.c;
        yfgVar.getClass();
        if (yfgVar.isEmpty()) {
            g();
            return;
        }
        boolean z = this.d;
        yfg yfgVar2 = this.c;
        if (!z) {
            final yfg yfgVar3 = true != this.e ? null : yfgVar2;
            Runnable runnable = new Runnable() { // from class: zfd
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f(yfgVar3);
                }
            };
            yno it = yfgVar2.iterator();
            while (it.hasNext()) {
                zgp zgpVar = (zgp) it.next();
                if (zgpVar.isDone()) {
                    f(yfgVar3);
                } else {
                    zgpVar.c(runnable, zfq.a);
                }
            }
            return;
        }
        yno it2 = yfgVar2.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final zgp zgpVar2 = (zgp) it2.next();
            int i2 = i + 1;
            if (zgpVar2.isDone()) {
                v(i, zgpVar2);
            } else {
                zgpVar2.c(new Runnable() { // from class: zfc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.v(i, zgpVar2);
                    }
                }, zfq.a);
            }
            i = i2;
        }
    }

    public final void v(int i, zgp zgpVar) {
        try {
            if (zgpVar.isCancelled()) {
                this.c = null;
                cancel(false);
            } else {
                x(i, zgpVar);
            }
        } finally {
            f(null);
        }
    }

    public void w(int i) {
        this.c = null;
    }
}
