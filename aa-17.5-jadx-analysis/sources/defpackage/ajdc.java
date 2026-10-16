package defpackage;

/* loaded from: classes3.dex */
public final class ajdc implements aiwi {
    private final Object a;
    private final ThreadLocal b;
    private final afcn c;

    public ajdc(Object obj, ThreadLocal threadLocal) {
        this.a = obj;
        this.b = threadLocal;
        this.c = new ajdd(threadLocal);
    }

    @Override // defpackage.afco
    public final <R> R fold(R r, afeg<? super R, ? super afcm, ? extends R> afegVar) {
        return afegVar.invoke(r, this);
    }

    @Override // defpackage.afcm, defpackage.afco
    public final <E extends afcm> E get(afcn<E> afcnVar) {
        if (affa.f(this.c, afcnVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.afcm
    public final afcn<?> getKey() {
        return this.c;
    }

    @Override // defpackage.aiwi
    public final Object hC(afco afcoVar) {
        ThreadLocal threadLocal = this.b;
        Object obj = this.a;
        Object obj2 = threadLocal.get();
        threadLocal.set(obj);
        return obj2;
    }

    @Override // defpackage.aiwi
    public final void hD(Object obj) {
        this.b.set(obj);
    }

    @Override // defpackage.afco
    public final afco minusKey(afcn<?> afcnVar) {
        return affa.f(this.c, afcnVar) ? afcp.a : this;
    }

    @Override // defpackage.afco
    public final afco plus(afco afcoVar) {
        return affa.v(this, afcoVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ")";
    }
}
