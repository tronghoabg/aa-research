package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public final /* synthetic */ class aeyz implements aezc {
    public final /* synthetic */ aezc a;
    public final /* synthetic */ aezc b;
    private final /* synthetic */ int c;

    public /* synthetic */ aeyz(aezc aezcVar, aezc aezcVar2, int i) {
        this.c = i;
        this.a = aezcVar;
        this.b = aezcVar2;
    }

    @Override // defpackage.aezc
    public final /* synthetic */ aezc a(aezc aezcVar) {
        return this.c != 0 ? adqs.C(this, aezcVar) : adqs.C(this, aezcVar);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return this.c != 0 ? adqs.D(this, intPredicate) : adqs.D(this, intPredicate);
    }

    @Override // defpackage.aezc
    public final /* synthetic */ aezc b(aezc aezcVar) {
        return this.c != 0 ? adqs.E(this, aezcVar) : adqs.E(this, aezcVar);
    }

    @Override // defpackage.aezc
    public final /* synthetic */ boolean c(Short sh) {
        return this.c != 0 ? adqs.I(this, sh) : adqs.I(this, sh);
    }

    @Override // defpackage.aezc
    public final boolean d(short s) {
        int i = this.c;
        aezc aezcVar = this.a;
        return i != 0 ? aezcVar.d(s) || this.b.d(s) : aezcVar.d(s) && this.b.d(s);
    }

    public final /* synthetic */ IntPredicate negate() {
        return this.c != 0 ? new aezb(this) : new aezb(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return this.c != 0 ? adqs.F(this, intPredicate) : adqs.F(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return this.c != 0 ? adqs.G(this, i) : adqs.G(this, i);
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return this.c != 0 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return this.c != 0 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return this.c != 0 ? c((Short) obj) : c((Short) obj);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        return this.c != 0 ? new aezb(this) : new aezb(this);
    }
}
