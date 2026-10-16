package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class tvl implements tpz {
    private final gjv f;
    private tqq c = null;
    private boolean d = false;
    protected boolean a = false;
    protected boolean b = false;
    private final List e = new ArrayList();

    public tvl(gjv gjvVar) {
        this.f = gjvVar;
    }

    @Override // defpackage.tpz
    public synchronized void e() {
        this.c = null;
        this.d = false;
    }

    @Override // defpackage.tpz
    public synchronized void g(tqq tqqVar) {
        this.c = tqqVar;
        this.d = false;
    }

    @Override // defpackage.tpz
    public synchronized void h() {
        this.c = null;
        this.d = true;
    }

    protected final synchronized void k() {
        this.e.clear();
    }

    protected final void l(Runnable runnable) {
        gjv gjvVar = this.f;
        gjvVar.getClass();
        if (uui.b()) {
            runnable.run();
        } else {
            gjvVar.m(runnable);
            gjvVar.l();
        }
    }

    public final void m() {
        yfl yflVar = new yfl(4);
        synchronized (this) {
            this.a = true;
            if (this.b) {
                return;
            }
            List list = this.e;
            yflVar.k(list);
            list.clear();
            shd shdVar = new shd(yflVar.g(), 15);
            if (this.f != null) {
                l(shdVar);
            } else {
                shdVar.run();
            }
        }
    }

    public final void n(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                return;
            }
            s(runnable);
        }
    }

    public abstract void o(tqd tqdVar);

    protected final void p(tqd tqdVar, tpz tpzVar) {
        tqq tqqVar;
        synchronized (this) {
            tqqVar = this.c;
        }
        if (tqqVar != null) {
            int iOrdinal = tqdVar.ordinal();
            if (iOrdinal == 0) {
                tqqVar.b(tpzVar);
            } else {
                if (iOrdinal != 1) {
                    return;
                }
                tqqVar.p(tpzVar);
            }
        }
    }

    public final synchronized boolean q() {
        return this.d;
    }

    protected final synchronized boolean r() {
        if (this.c == null) {
            if (!this.d) {
                return false;
            }
        }
        return true;
    }

    @ResultIgnorabilityUnspecified
    protected final void s(Runnable runnable) {
        boolean z;
        synchronized (this) {
            z = this.a;
            if (!z) {
                this.e.add(runnable);
            }
        }
        if (z) {
            runnable.run();
        }
    }
}
