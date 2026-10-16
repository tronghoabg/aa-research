package defpackage;

/* loaded from: classes3.dex */
final class aizn implements aiuo {
    public final aizp a;
    public final long b;
    public final Object c;
    public final afck d;

    public aizn(aizp aizpVar, long j, Object obj, afck afckVar) {
        this.a = aizpVar;
        this.b = j;
        this.c = obj;
        this.d = afckVar;
    }

    @Override // defpackage.aiuo
    public final void hy() {
        aizp aizpVar = this.a;
        synchronized (aizpVar) {
            long j = this.b;
            if (j >= aizpVar.e()) {
                Object[] objArr = aizpVar.a;
                objArr.getClass();
                if (aizq.a(objArr, j) == this) {
                    aizq.b(objArr, j, aizq.a);
                    aizpVar.j();
                }
            }
        }
    }
}
