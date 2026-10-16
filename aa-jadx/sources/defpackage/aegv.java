package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aegv implements defpackage.aegw {
    public final /* synthetic */ defpackage.aegw a;
    public final /* synthetic */ defpackage.aegw b;
    private final /* synthetic */ int c;

    public /* synthetic */ aegv(defpackage.aegw aegwVar, defpackage.aegw aegwVar2, int i) {
        this.c = i;
        this.a = aegwVar;
        this.b = aegwVar2;
    }

    @Override // defpackage.aegw
    public final /* synthetic */ defpackage.aegw a(defpackage.aegw aegwVar) {
        return this.c != 0 ? defpackage.aeao.z(this, aegwVar) : defpackage.aeao.z(this, aegwVar);
    }

    public final /* synthetic */ java.util.function.IntPredicate and(java.util.function.IntPredicate intPredicate) {
        return this.c != 0 ? defpackage.aeao.A(this, intPredicate) : defpackage.aeao.A(this, intPredicate);
    }

    @Override // defpackage.aegw
    public final /* synthetic */ defpackage.aegw b(defpackage.aegw aegwVar) {
        return this.c != 0 ? defpackage.aeao.B(this, aegwVar) : defpackage.aeao.B(this, aegwVar);
    }

    @Override // defpackage.aegw
    public final boolean c(byte b) {
        int i = this.c;
        defpackage.aegw aegwVar = this.a;
        if (i != 0) {
            return aegwVar.c(b) || this.b.c(b);
        }
        return aegwVar.c(b) && this.b.c(b);
    }

    @Override // defpackage.aegw
    public final /* synthetic */ boolean d(java.lang.Byte b) {
        return this.c != 0 ? defpackage.aeao.E(this, b) : defpackage.aeao.E(this, b);
    }

    public final /* synthetic */ java.util.function.IntPredicate negate() {
        return this.c != 0 ? new defpackage.aegt(this) : new defpackage.aegt(this);
    }

    public final /* synthetic */ java.util.function.IntPredicate or(java.util.function.IntPredicate intPredicate) {
        return this.c != 0 ? defpackage.aeao.C(this, intPredicate) : defpackage.aeao.C(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return this.c != 0 ? defpackage.aeao.D(this, i) : defpackage.aeao.D(this, i);
    }

    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        return this.c != 0 ? j$.util.function.Predicate$CC.$default$and(this, predicate) : j$.util.function.Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return this.c != 0 ? j$.util.function.Predicate$CC.$default$or(this, predicate) : j$.util.function.Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(java.lang.Object obj) {
        return this.c != 0 ? d((java.lang.Byte) obj) : d((java.lang.Byte) obj);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ java.util.function.Predicate mo55negate() {
        return this.c != 0 ? new defpackage.aegt(this) : new defpackage.aegt(this);
    }
}
