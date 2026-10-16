package defpackage;

/* loaded from: classes.dex */
public final class tcc implements zge {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public tcc(eqj eqjVar, eqn eqnVar, int i) {
        this.c = i;
        this.a = eqjVar;
        this.b = eqnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [eqn, java.lang.Object] */
    @Override // defpackage.zge
    public final void a(Throwable th) {
        int i = this.c;
        Object obj = this.a;
        if (i != 0) {
            ((pto) obj).a((xxh) this.b);
        } else {
            ((eqj) obj).k(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [eqn, java.lang.Object] */
    @Override // defpackage.zge
    public final void b(Object obj) {
        int i = this.c;
        Object obj2 = this.a;
        if (i != 0) {
            ((pto) obj2).a((xxh) this.b);
        } else {
            ((eqj) obj2).k(this.b);
        }
    }

    public tcc(pto ptoVar, xxh xxhVar, int i) {
        this.c = i;
        this.b = xxhVar;
        this.a = ptoVar;
    }
}
