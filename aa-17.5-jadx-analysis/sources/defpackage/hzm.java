package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class hzm {
    private static final hzh a = new hzl(0);
    private final List b = new ArrayList();
    private final Set c = new HashSet();
    private final dzk d;

    public hzm(dzk dzkVar) {
        this.d = dzkVar;
    }

    private final void f(Class cls, Class cls2, hzi hziVar, boolean z) {
        this.b.add(z ? this.b.size() : 0, new ncp(cls, cls2, (Object) hziVar));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hzi, java.lang.Object] */
    private final hzh g(ncp ncpVar) {
        return ncpVar.c.b(this);
    }

    public final synchronized hzh a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (ncp ncpVar : this.b) {
                Set set = this.c;
                if (set.contains(ncpVar)) {
                    z = true;
                } else if (ncpVar.x(cls) && ((Class) ncpVar.a).isAssignableFrom(cls2)) {
                    set.add(ncpVar);
                    arrayList.add(g(ncpVar));
                    set.remove(ncpVar);
                }
            }
            if (arrayList.size() > 1) {
                return new hzk(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (hzh) arrayList.get(0);
            }
            if (!z) {
                throw new hsk(cls, cls2);
            }
            return a;
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public final synchronized List b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (ncp ncpVar : this.b) {
                Set set = this.c;
                if (!set.contains(ncpVar) && ncpVar.x(cls)) {
                    set.add(ncpVar);
                    arrayList.add(g(ncpVar));
                    set.remove(ncpVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized List c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (ncp ncpVar : this.b) {
            Object obj = ncpVar.a;
            if (!arrayList.contains(obj) && ncpVar.x(cls)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final synchronized void d(Class cls, Class cls2, hzi hziVar) {
        f(cls, cls2, hziVar, true);
    }

    public final synchronized void e(Class cls, Class cls2, hzi hziVar) {
        f(cls, cls2, hziVar, false);
    }
}
