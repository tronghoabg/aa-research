package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public final /* synthetic */ class aefu implements aefw {
    public final /* synthetic */ IntPredicate a;

    public /* synthetic */ aefu(IntPredicate intPredicate) {
        this.a = intPredicate;
    }

    @Override // defpackage.aefw
    public final /* synthetic */ aefw a(aefw aefwVar) {
        return aeec.b(this, aefwVar);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return aeec.c(this, intPredicate);
    }

    @Override // defpackage.aefw
    public final /* synthetic */ aefw b(aefw aefwVar) {
        return aeec.d(this, aefwVar);
    }

    @Override // defpackage.aefw
    public final boolean c(byte b) {
        return this.a.test(b);
    }

    @Override // defpackage.aefw
    public final /* synthetic */ boolean d(Byte b) {
        return aeec.g(this, b);
    }

    public final /* synthetic */ IntPredicate negate() {
        return new aeft(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return aeec.e(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return aeec.f(this, i);
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* bridge */ /* synthetic */ boolean test(Object obj) {
        return d((Byte) obj);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        return new aeft(this);
    }
}
