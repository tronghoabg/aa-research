package e.a.d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cd implements ah {

    /* renamed from: a, reason: collision with root package name */
    private final ah f46724a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f46725b;

    /* renamed from: c, reason: collision with root package name */
    private List f46726c = new ArrayList();

    public cd(ah ahVar) {
        this.f46724a = ahVar;
    }

    private final void g(Runnable runnable) {
        synchronized (this) {
            if (this.f46725b) {
                runnable.run();
            } else {
                this.f46726c.add(runnable);
            }
        }
    }

    public final void b() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.f46726c.isEmpty()) {
                    this.f46726c = null;
                    this.f46725b = true;
                    return;
                } else {
                    list = this.f46726c;
                    this.f46726c = arrayList;
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

    @Override // e.a.d.ah
    public final void c(e.a.ee eeVar, ag agVar, e.a.cm cmVar) {
        g(new cc(this, eeVar, agVar, cmVar));
    }

    @Override // e.a.d.ah
    public final void d(e.a.cm cmVar) {
        g(new cb(this, cmVar));
    }

    @Override // e.a.d.jw
    public final void e(jv jvVar) {
        if (this.f46725b) {
            this.f46724a.e(jvVar);
        } else {
            g(new bz(this, jvVar));
        }
    }

    @Override // e.a.d.jw
    public final void f() {
        if (this.f46725b) {
            this.f46724a.f();
        } else {
            g(new ca(this));
        }
    }
}
