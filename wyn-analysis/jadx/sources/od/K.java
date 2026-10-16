package od;

import g5.RunnableC2707d;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes5.dex */
public final class K implements InterfaceC3724t, vg.a {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f41615a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41616b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f41617c;

    public K() {
        this.f41615a = false;
        this.f41616b = new ConcurrentHashMap();
        this.f41617c = new LinkedBlockingQueue();
    }

    public void a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f41615a) {
                    runnable.run();
                } else {
                    ((List) this.f41617c).add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                try {
                    if (((List) this.f41617c).isEmpty()) {
                        this.f41617c = null;
                        this.f41615a = true;
                        return;
                    } else {
                        list = (List) this.f41617c;
                        this.f41617c = arrayList;
                    }
                } catch (Throwable th) {
                    throw th;
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

    @Override // vg.a
    public synchronized vg.b c(String str) {
        xg.e eVar;
        eVar = (xg.e) ((ConcurrentHashMap) this.f41616b).get(str);
        if (eVar == null) {
            eVar = new xg.e(str, (LinkedBlockingQueue) this.f41617c, this.f41615a);
            ((ConcurrentHashMap) this.f41616b).put(str, eVar);
        }
        return eVar;
    }

    @Override // od.InterfaceC3724t
    public void e(L4.g gVar) {
        if (this.f41615a) {
            ((InterfaceC3724t) this.f41616b).e(gVar);
        } else {
            a(new RunnableC3666A(11, this, gVar));
        }
    }

    @Override // od.InterfaceC3724t
    public void f(md.b0 b0Var) {
        a(new RunnableC3666A(12, this, b0Var));
    }

    @Override // od.InterfaceC3724t
    public void h() {
        if (this.f41615a) {
            ((InterfaceC3724t) this.f41616b).h();
        } else {
            a(new RunnableC2707d(this, 6));
        }
    }

    @Override // od.InterfaceC3724t
    public void m(md.k0 k0Var, EnumC3721s enumC3721s, md.b0 b0Var) {
        a(new A7.W0(this, k0Var, enumC3721s, b0Var, 21));
    }

    public K(InterfaceC3724t interfaceC3724t) {
        this.f41617c = new ArrayList();
        this.f41616b = interfaceC3724t;
    }
}
