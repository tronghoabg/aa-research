package defpackage;

import j$.util.Optional;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public final class psj implements uyl {
    private static final yob a = yob.c("com/google/android/apps/gmm/systems/eventbus/GmmEventBusImpl");
    private final psf e;
    private final ymf b = new yez(null);
    private final Map c = new HashMap();
    private final ReadWriteLock d = new ReentrantReadWriteLock();
    private final ThreadLocal f = new psh();
    private final ThreadLocal g = new psi();
    private volatile boolean h = false;
    private final rjg i = new rjg(this);

    public psj(Optional optional) {
        this.e = (psf) optional.orElse(null);
    }

    public static final void f(psm psmVar, psk pskVar) {
        if (pskVar.e) {
            return;
        }
        pskVar.c(psmVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, psm] */
    private final void g() {
        ThreadLocal threadLocal = this.g;
        if (((Boolean) threadLocal.get()).booleanValue()) {
            return;
        }
        threadLocal.set(true);
        try {
            Queue queue = (Queue) this.f.get();
            while (true) {
                rjg rjgVar = (rjg) queue.poll();
                if (rjgVar == null) {
                    return;
                } else {
                    f(rjgVar.b, (psk) rjgVar.a);
                }
            }
        } finally {
            this.g.remove();
        }
    }

    public final void a(psm psmVar, psk pskVar) {
        psb psbVar = pskVar.a;
        if (psb.e(psbVar) && !psbVar.f()) {
            ((Queue) this.f.get()).offer(new rjg(psmVar, pskVar));
            return;
        }
        Executor executor = pskVar.b;
        executor.getClass();
        executor.execute(new pfq(psmVar, pskVar, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    public final void c(psm psmVar) {
        rjg rjgVar;
        if (this.e != null) {
            psmVar.a();
        }
        Class<?> cls = psmVar.getClass();
        Map map = psg.a;
        synchronized (map) {
            rjgVar = (rjg) map.get(cls);
            if (rjgVar == null) {
                ygr<Class> ygrVarN = ygr.n(zdw.b.d(new zdy(new zds(cls)).a.a()));
                ygp ygpVar = new ygp();
                for (Class cls2 : ygrVarN) {
                    if (cls2.isAnnotationPresent(psl.class)) {
                        ygpVar.c(cls2);
                    }
                }
                rjg rjgVar2 = new rjg(ygrVarN, ygpVar.g());
                map.put(cls, rjgVar2);
                rjgVar = rjgVar2;
            }
        }
        ReadWriteLock readWriteLock = this.d;
        readWriteLock.readLock().lock();
        try {
            ?? r1 = rjgVar.a;
            if (!((ygr) r1).isEmpty()) {
                this.i.i(psmVar, r1);
            }
            boolean z = false;
            for (Class cls3 : rjgVar.b) {
                ymf ymfVar = this.b;
                if (ymfVar.s(cls3)) {
                    Iterator it = ymfVar.c(cls3).iterator();
                    while (it.hasNext()) {
                        a(psmVar, (psk) it.next());
                    }
                    z = true;
                }
            }
            readWriteLock.readLock().unlock();
            if (!z) {
                psmVar.getClass().getSimpleName();
            }
            g();
        } catch (Throwable th) {
            this.d.readLock().unlock();
            throw th;
        }
    }

    public final void d(Object obj, ygu yguVar) {
        Class<?> cls = obj.getClass();
        String[] strArr = vaq.a;
        if (fdi.b()) {
            String name = cls.getName();
            String[] strArr2 = vaq.a;
            int length = 0;
            for (int i = 0; i < 4; i++) {
                String str = strArr2[i];
                if (!name.startsWith(str, length)) {
                    break;
                }
                length += str.length();
            }
            name.substring(length);
        }
        yfq yfqVarO = yfq.o(yguVar.d());
        ReadWriteLock readWriteLock = this.d;
        readWriteLock.writeLock().lock();
        try {
            Map map = this.c;
            if (map.containsKey(obj)) {
                ((ynz) a.a(uys.a).ai(6860)).y("Tried to register %s twice.", obj);
                readWriteLock.writeLock().unlock();
                return;
            }
            map.put(obj, yfqVarO);
            this.b.B(yguVar);
            this.i.h(yguVar);
            readWriteLock.writeLock().unlock();
            g();
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Object obj) {
        ReadWriteLock readWriteLock = this.d;
        readWriteLock.writeLock().lock();
        try {
            yfq yfqVar = (yfq) this.c.remove(obj);
            if (yfqVar == null) {
                ((ynz) a.a(uys.a).ai(6861)).y("Can't find handler to unregister. Was %s registered?", obj);
                readWriteLock.writeLock().unlock();
                return;
            }
            ynp ynpVarListIterator = yfqVar.listIterator(0);
            while (ynpVarListIterator.hasNext()) {
                psk pskVar = (psk) ynpVarListIterator.next();
                woy.Z(this.b.C(pskVar.d, pskVar));
                woy.Z(!pskVar.e);
                pskVar.e = true;
            }
            this.d.writeLock().unlock();
            g();
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }
}
