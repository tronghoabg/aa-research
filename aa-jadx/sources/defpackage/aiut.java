package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aiut extends defpackage.afdg implements defpackage.afdl {
    public static final defpackage.afdh l = new defpackage.afdh(defpackage.afdl.k, new defpackage.tci(5));

    public aiut() {
        super(defpackage.afdl.k);
    }

    public abstract void a(defpackage.afdo afdoVar, java.lang.Runnable runnable);

    @Override // defpackage.afdl
    public final void d(defpackage.afdk afdkVar) {
        defpackage.aitx aitxVar = ((defpackage.ajda) afdkVar).f;
        while (aitxVar.a == defpackage.ajdb.b) {
        }
        java.lang.Object obj = aitxVar.a;
        defpackage.aiug aiugVar = obj instanceof defpackage.aiug ? (defpackage.aiug) obj : null;
        if (aiugVar != null) {
            aiugVar.x();
        }
    }

    public boolean dY(defpackage.afdo afdoVar) {
        return true;
    }

    public void f(defpackage.afdo afdoVar, java.lang.Runnable runnable) {
        try {
            a(afdoVar, runnable);
        } catch (java.lang.Throwable th) {
            throw new defpackage.aivh(th, this, afdoVar);
        }
    }

    public defpackage.aiut g(int i) {
        defpackage.afvq.d(i);
        return new defpackage.ajdm(this, i);
    }

    @Override // defpackage.afdl
    public final defpackage.afdk gJ(defpackage.afdk afdkVar) {
        return new defpackage.ajda(this, afdkVar);
    }

    @Override // defpackage.afdg, defpackage.afdm, defpackage.afdo
    public final /* bridge */ <E extends defpackage.afdm> E get(defpackage.afdn<E> afdnVar) {
        afdnVar.getClass();
        if (!(afdnVar instanceof defpackage.afdh)) {
            if (defpackage.afdl.k == afdnVar) {
                return this;
            }
            return null;
        }
        defpackage.afdh afdhVar = (defpackage.afdh) afdnVar;
        if (!afdhVar.b(getKey())) {
            return null;
        }
        E e = (E) afdhVar.a(this);
        if (e instanceof defpackage.afdm) {
            return e;
        }
        return null;
    }

    @Override // defpackage.afdg, defpackage.afdo
    public final /* bridge */ defpackage.afdo minusKey(defpackage.afdn<?> afdnVar) {
        afdnVar.getClass();
        if (afdnVar instanceof defpackage.afdh) {
            defpackage.afdh afdhVar = (defpackage.afdh) afdnVar;
            if (!afdhVar.b(getKey()) || afdhVar.a(this) == null) {
                return this;
            }
        } else if (defpackage.afdl.k != afdnVar) {
            return this;
        }
        return defpackage.afdp.a;
    }

    public java.lang.String toString() {
        return defpackage.aiuz.a(this) + "@" + defpackage.aiuz.b(this);
    }
}
