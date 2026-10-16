package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class npc {
    public static final noz a = new noz();
    public static final afgl b = new lcj(mki.b, 20);
    public static final yph c = yph.c("GH.HvacManager");
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public static final kjz c(int i, kll kllVar) {
        Object next;
        Iterator it = jul.e(kjq.a.a().i(), i).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (affa.f(((kjz) next).a.b, kllVar)) {
                break;
            }
        }
        return (kjz) next;
    }

    public static final npa d(int i, kll kllVar, afec afecVar) {
        kjz kjzVarC = c(i, kllVar);
        if (kjzVarC != null) {
            return (npa) afecVar.invoke(kjzVarC);
        }
        c.l().M("Requested Control is null: Property %s not supported for Area %s", new klr(i), kllVar);
        return null;
    }

    public final npa a(npb npbVar, afdr afdrVar) {
        ConcurrentHashMap concurrentHashMap = this.d;
        npa npaVar = (npa) concurrentHashMap.get(npbVar);
        if (npaVar != null) {
            c.l().y("Requested Control: Key=%s, Found in cache", npbVar);
            return npaVar;
        }
        npa npaVar2 = (npa) afdrVar.invoke();
        if (npaVar2 != null) {
            concurrentHashMap.put(npbVar, npaVar2);
        }
        c.l().N("Requested Control (getOrCreateControl): Key=%s, Success=%b", npbVar, npaVar2 != null);
        return npaVar2;
    }

    public final npy b(kll kllVar) {
        return (npy) a(new npb("syncControl", kllVar), new nlh(this, kllVar, 6, null));
    }
}
