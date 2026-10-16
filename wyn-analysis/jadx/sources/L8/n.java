package L8;

import J9.C0649h;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import l9.C3445a;
import l9.InterfaceC3446b;
import l9.InterfaceC3447c;
import l9.InterfaceC3448d;
import s8.C4026b;

/* loaded from: classes4.dex */
public final class n implements InterfaceC3448d, InterfaceC3447c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7020a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f7021b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f7022c;

    public n(Executor executor) {
        this.f7022c = executor;
    }

    @Override // l9.InterfaceC3447c
    public final void a(C3445a c3445a) {
        c3445a.getClass();
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = this.f7021b;
                if (arrayDeque != null) {
                    arrayDeque.add(c3445a);
                    return;
                }
                for (Map.Entry entry : b(c3445a)) {
                    ((Executor) entry.getValue()).execute(new C8.d(19, entry, c3445a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Set b(C3445a c3445a) {
        Map map;
        try {
            HashMap map2 = this.f7020a;
            c3445a.getClass();
            map = (Map) map2.get(C4026b.class);
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.EMPTY_SET : map.entrySet();
    }

    public final synchronized void c(Executor executor, InterfaceC3446b interfaceC3446b) {
        try {
            executor.getClass();
            if (!this.f7020a.containsKey(C4026b.class)) {
                this.f7020a.put(C4026b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f7020a.get(C4026b.class)).put(interfaceC3446b, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(C0649h c0649h) {
        c0649h.getClass();
        if (this.f7020a.containsKey(C4026b.class)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f7020a.get(C4026b.class);
            concurrentHashMap.remove(c0649h);
            if (concurrentHashMap.isEmpty()) {
                this.f7020a.remove(C4026b.class);
            }
        }
    }
}
