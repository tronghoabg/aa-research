package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aegt implements defpackage.aegw {
    public final /* synthetic */ defpackage.aegw a;

    public /* synthetic */ aegt(defpackage.aegw aegwVar) {
        this.a = aegwVar;
    }

    @Override // defpackage.aegw
    public final /* synthetic */ defpackage.aegw a(defpackage.aegw aegwVar) {
        return defpackage.aeao.z(this, aegwVar);
    }

    public final /* synthetic */ java.util.function.IntPredicate and(java.util.function.IntPredicate intPredicate) {
        return defpackage.aeao.A(this, intPredicate);
    }

    @Override // defpackage.aegw
    public final /* synthetic */ defpackage.aegw b(defpackage.aegw aegwVar) {
        return defpackage.aeao.B(this, aegwVar);
    }

    @Override // defpackage.aegw
    public final boolean c(byte b) {
        return !this.a.c(b);
    }

    @Override // defpackage.aegw
    public final /* synthetic */ boolean d(java.lang.Byte b) {
        return defpackage.aeao.E(this, b);
    }

    public final /* synthetic */ java.util.function.IntPredicate negate() {
        return new defpackage.aegt(this);
    }

    public final /* synthetic */ java.util.function.IntPredicate or(java.util.function.IntPredicate intPredicate) {
        return defpackage.aeao.C(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return defpackage.aeao.D(this, i);
    }

    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        return j$.util.function.Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return j$.util.function.Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* bridge */ /* synthetic */ boolean test(java.lang.Object obj) {
        return d((java.lang.Byte) obj);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ java.util.function.Predicate mo55negate() {
        return new defpackage.aegt(this);
    }
}
