package od;

import A7.RunnableC0299w0;
import com.google.protobuf.MessageLite;
import g5.RunnableC2707d;
import java.util.ArrayList;
import java.util.List;
import md.AbstractC3537e;

/* loaded from: classes5.dex */
public final class E extends AbstractC3537e {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC3537e f41545d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f41546e;

    /* renamed from: f, reason: collision with root package name */
    public List f41547f = new ArrayList();

    public E(AbstractC3537e abstractC3537e) {
        this.f41545d = abstractC3537e;
    }

    @Override // md.AbstractC3537e
    public final void i(md.k0 k0Var, md.b0 b0Var) {
        s(new RunnableC0299w0(this, k0Var, b0Var, 27));
    }

    @Override // md.AbstractC3537e
    public final void k(md.b0 b0Var) {
        if (this.f41546e) {
            this.f41545d.k(b0Var);
        } else {
            s(new RunnableC3666A(3, this, b0Var));
        }
    }

    @Override // md.AbstractC3537e
    public final void l(MessageLite messageLite) {
        if (this.f41546e) {
            this.f41545d.l(messageLite);
        } else {
            s(new RunnableC3666A(4, this, messageLite));
        }
    }

    @Override // md.AbstractC3537e
    public final void m() {
        if (this.f41546e) {
            this.f41545d.m();
        } else {
            s(new RunnableC2707d(this, 5));
        }
    }

    public final void s(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f41546e) {
                    runnable.run();
                } else {
                    this.f41547f.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
