package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class tyh implements tza {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/impl/StyleNamespaceImpl");
    public final aeoa b = new aeop(null);
    public final AtomicInteger c = new AtomicInteger();
    public final String d;
    public final int e;
    public final boolean f;
    public final typ g;

    public tyh(typ typVar, String str, int i, boolean z) {
        this.g = typVar;
        this.d = str;
        this.e = i;
        this.f = z;
    }

    private final txk h(long j) {
        vaq.d();
        aeoa aeoaVar = this.b;
        synchronized (aeoaVar) {
            if (!aeoaVar.c(j)) {
                ((ynz) ((ynz) a.h()).ai(9203)).R("InternalStyle with id %d not found in namespace: [%s, %d]. Has this style been destroyed?", Long.valueOf(j), this.d, Integer.valueOf(this.e));
                return null;
            }
            txk txkVar = (txk) aeoaVar.h(j);
            if (txkVar == null) {
                ((ynz) a.a(uys.a).ai(9202)).u("namespaceStyles contains a key mapped to a null style.");
            }
            return txkVar;
        }
    }

    @Override // defpackage.tqt
    public final int a() {
        return this.e;
    }

    @Override // defpackage.tqt
    public final tqo b(long j) {
        txk txkVarH = h(j);
        return txkVarH == null ? typ.c : txkVarH;
    }

    @Override // defpackage.ujx
    public final ukf c(int i) {
        return d(i, aekj.a);
    }

    @Override // defpackage.ujx
    public final ukf d(int i, aekf aekfVar) {
        wnq wnqVarQ = this.g.q();
        return wnqVarQ != null ? typ.r(i, wnqVarQ, aekfVar) : ukf.a;
    }

    public final txk e(ujf ujfVar, int i, ygr ygrVar) {
        vaq.d();
        txk txkVar = new txk(this, ukf.k(ujfVar, this.f), i, ygrVar);
        aeoa aeoaVar = this.b;
        synchronized (aeoaVar) {
            aeoaVar.a(txkVar.e, txkVar);
        }
        return txkVar;
    }

    protected final ukf f(long j) {
        txk txkVarH = h(j);
        return txkVarH == null ? ukf.a : txkVarH.d();
    }

    final txk g(usf usfVar, int i, int i2, tqo tqoVar) {
        int andIncrement = this.c.getAndIncrement();
        ujf ujfVar = ujf.c;
        uje ujeVar = new uje();
        ujeVar.b = true;
        ujeVar.v = i2;
        ygp ygpVar = new ygp();
        if (usfVar != null) {
            ujeVar.a = true;
            ujeVar.A = usfVar;
            ygpVar.c(usfVar);
        } else {
            ujeVar.a = false;
            ujeVar.g = i;
        }
        if (tqoVar instanceof txk) {
            ujeVar.j = ((txk) tqoVar).d().d().o;
            ujeVar.b = false;
        }
        txk txkVarE = e(new ujf(ujeVar), andIncrement, ygpVar.g());
        this.g.o(txkVarE, false);
        return txkVarE;
    }

    @Override // defpackage.ujx
    public final ukf i(long j) {
        return this.g.k(j);
    }

    @Override // defpackage.ujx
    public final ukf j(int i) {
        return f(i);
    }
}
