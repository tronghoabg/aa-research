package defpackage;

/* loaded from: classes.dex */
public final class lhu<R, T> implements afgl<R, T> {
    public volatile Object a = lhv.a;
    public final Object b = this;
    private final afec c;
    private final lhp d;

    public lhu(afec afecVar, lhp lhpVar) {
        this.c = afecVar;
        this.d = lhpVar;
        if (!(lhpVar instanceof lhn) || ((lhn) lhpVar).a) {
            ((lhm) mki.a.i(lhm.class)).gK(new lht(this));
        }
    }

    @Override // defpackage.afgl
    public final T getValue(R r, afia<?> afiaVar) {
        T t;
        afiaVar.getClass();
        T t2 = (T) this.a;
        lhv lhvVar = lhv.a;
        if (t2 != lhvVar) {
            return t2;
        }
        synchronized (this.b) {
            if (this.a != lhvVar) {
                t = (T) this.a;
            } else {
                lhp lhpVar = this.d;
                if ((lhpVar == lho.b && !((lhm) mki.a.i(lhm.class)).gN()) || (lhpVar == lho.a && !((lhm) mki.a.i(lhm.class)).g())) {
                    throw new lhs("Attempting to access before lifetime started");
                }
                if (!((lhm) mki.a.i(lhm.class)).i()) {
                    Object objInvoke = this.c.invoke(r);
                    this.a = objInvoke;
                    t = (T) objInvoke;
                } else {
                    if (!(lhpVar instanceof lhn)) {
                        throw new lhs("Attempted to access when stopping or after lifetime stopped");
                    }
                    t = (T) this.c.invoke(r);
                }
            }
        }
        return t;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
