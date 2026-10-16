package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public class tgs {
    private final ConcurrentMap a = new ConcurrentHashMap();

    @Deprecated
    public void e(Class cls, aezk aezkVar) {
        this.a.put(cls, new tgt(true, new qec(aezkVar, 4)));
    }

    @ResultIgnorabilityUnspecified
    public final Object i(Class cls) {
        Object objCast = cls.cast(l(cls, false, null));
        objCast.getClass();
        return objCast;
    }

    public final Object j(Class cls) {
        tgp tgpVar = (tgp) this.a.get(cls);
        if (tgpVar == null || !tgpVar.b()) {
            return null;
        }
        return cls.cast(tgpVar.a());
    }

    public final Object k(Class cls) {
        return cls.cast(l(cls, true, null));
    }

    @ResultIgnorabilityUnspecified
    public final Object l(Class cls, boolean z, tgr tgrVar) {
        ConcurrentMap concurrentMap = this.a;
        tgp tgpVar = (tgp) concurrentMap.get(cls);
        if (tgpVar != null && tgpVar.b()) {
            return tgpVar.a();
        }
        try {
            tgp tgpVar2 = tgrVar == null ? (tgp) concurrentMap.get(cls) : (tgp) ConcurrentMap.EL.computeIfAbsent(concurrentMap, cls, new ixx(tgrVar, 7));
            if (tgpVar2 != null) {
                return tgpVar2.a();
            }
            if (z) {
                return null;
            }
            throw new IllegalArgumentException("No such class registered: ".concat(String.valueOf(String.valueOf(cls))));
        } catch (RuntimeException e) {
            throw new tgq(e);
        }
    }

    public final void m() {
        for (Map.Entry entry : this.a.entrySet()) {
            if (((tgp) entry.getValue()).c()) {
                l((Class) entry.getKey(), false, null);
            }
        }
    }

    protected final void n(Class cls, tgr tgrVar) {
        this.a.put(cls, new tgt(false, tgrVar));
    }
}
