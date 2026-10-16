package defpackage;

/* loaded from: classes2.dex */
public abstract class aitu extends afcg implements afcl {
    public static final afch l = new afch(afcl.k, new aitt(0));

    public aitu() {
        super(afcl.k);
    }

    public abstract void a(afco afcoVar, Runnable runnable);

    @Override // defpackage.afcl
    public final void d(afck afckVar) {
        aisx aisxVar = ((ajca) afckVar).f;
        while (aisxVar.a == ajcb.b) {
        }
        Object obj = aisxVar.a;
        aitg aitgVar = obj instanceof aitg ? (aitg) obj : null;
        if (aitgVar != null) {
            aitgVar.x();
        }
    }

    public boolean eQ(afco afcoVar) {
        return true;
    }

    public void f(afco afcoVar, Runnable runnable) throws aiui {
        try {
            a(afcoVar, runnable);
        } catch (Throwable th) {
            throw new aiui(th, this, afcoVar);
        }
    }

    public aitu g(int i) {
        afrg.v(i);
        return new ajcm(this, i);
    }

    @Override // defpackage.afcg, defpackage.afcm, defpackage.afco
    public final /* bridge */ <E extends afcm> E get(afcn<E> afcnVar) {
        afcnVar.getClass();
        if (!(afcnVar instanceof afch)) {
            if (afcl.k == afcnVar) {
                return this;
            }
            return null;
        }
        afch afchVar = (afch) afcnVar;
        if (!afchVar.b(getKey())) {
            return null;
        }
        E e = (E) afchVar.a(this);
        if (e instanceof afcm) {
            return e;
        }
        return null;
    }

    @Override // defpackage.afcl
    public final afck hx(afck afckVar) {
        return new ajca(this, afckVar);
    }

    @Override // defpackage.afcg, defpackage.afco
    public final /* bridge */ afco minusKey(afcn<?> afcnVar) {
        afcnVar.getClass();
        if (afcnVar instanceof afch) {
            afch afchVar = (afch) afcnVar;
            if (!afchVar.b(getKey()) || afchVar.a(this) == null) {
                return this;
            }
        } else if (afcl.k != afcnVar) {
            return this;
        }
        return afcp.a;
    }

    public String toString() {
        return aiua.a(this) + "@" + aiua.b(this);
    }
}
