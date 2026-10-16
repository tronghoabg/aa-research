package e.a.d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bg extends com.waze.uid.f {

    /* renamed from: a, reason: collision with root package name */
    private final bh f46651a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f46652b;

    /* renamed from: c, reason: collision with root package name */
    private volatile e.a.ee f46653c;

    /* renamed from: d, reason: collision with root package name */
    private List f46654d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.uid.f f46655e;

    public bg(bh bhVar, com.waze.uid.f fVar) {
        this.f46651a = bhVar;
        this.f46655e = fVar;
    }

    private final void p(Runnable runnable) {
        synchronized (this) {
            if (this.f46652b) {
                runnable.run();
            } else {
                this.f46654d.add(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(e.a.cm cmVar) {
        if (this.f46653c != null) {
            return;
        }
        try {
            this.f46655e.u(cmVar);
        } catch (Throwable th) {
            t(th, "Failed to read headers");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(Object obj) {
        if (this.f46653c != null) {
            return;
        }
        try {
            this.f46655e.h(obj);
        } catch (Throwable th) {
            t(th, "Failed to read message.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        if (this.f46653c != null) {
            return;
        }
        try {
            this.f46655e.i();
        } catch (Throwable th) {
            t(th, "Failed to call onReady.");
        }
    }

    private final void t(Throwable th, String str) {
        this.f46653c = e.a.ee.f47402b.f(th).g(str);
        this.f46651a.a(str, th);
    }

    @Override // com.waze.uid.f
    public final void a(e.a.ee eeVar, e.a.cm cmVar) {
        p(new be(this, eeVar, cmVar));
    }

    @Override // com.waze.uid.f
    public final void h(Object obj) {
        if (this.f46652b) {
            r(obj);
        } else {
            p(new bd(this, obj));
        }
    }

    @Override // com.waze.uid.f
    public final void i() {
        if (this.f46652b) {
            s();
        } else {
            p(new bf(this));
        }
    }

    final void n() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.f46654d.isEmpty()) {
                    this.f46654d = null;
                    this.f46652b = true;
                    return;
                } else {
                    list = this.f46654d;
                    this.f46654d = arrayList;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }

    @Override // com.waze.uid.f
    public final void u(e.a.cm cmVar) {
        if (this.f46652b) {
            q(cmVar);
        } else {
            p(new bc(this, cmVar));
        }
    }
}
