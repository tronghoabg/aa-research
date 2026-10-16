package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public final /* synthetic */ class aeza implements aezc {
    public final /* synthetic */ IntPredicate a;

    public /* synthetic */ aeza(IntPredicate intPredicate) {
        this.a = intPredicate;
    }

    @Override // defpackage.aezc
    public final /* synthetic */ aezc a(aezc aezcVar) {
        return adqs.C(this, aezcVar);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return adqs.D(this, intPredicate);
    }

    @Override // defpackage.aezc
    public final /* synthetic */ aezc b(aezc aezcVar) {
        return adqs.E(this, aezcVar);
    }

    @Override // defpackage.aezc
    public final /* synthetic */ boolean c(Short sh) {
        return adqs.I(this, sh);
    }

    @Override // defpackage.aezc
    public final boolean d(short s) {
        return this.a.test(s);
    }

    public final /* synthetic */ IntPredicate negate() {
        return new aezb(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return adqs.F(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return adqs.G(this, i);
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* bridge */ /* synthetic */ boolean test(Object obj) {
        return c((Short) obj);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        return new aezb(this);
    }
}
