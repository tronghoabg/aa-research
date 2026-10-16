package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public final /* synthetic */ class aefv implements aefw {
    public final /* synthetic */ aefw a;
    public final /* synthetic */ aefw b;
    private final /* synthetic */ int c;

    public /* synthetic */ aefv(aefw aefwVar, aefw aefwVar2, int i) {
        this.c = i;
        this.a = aefwVar;
        this.b = aefwVar2;
    }

    @Override // defpackage.aefw
    public final /* synthetic */ aefw a(aefw aefwVar) {
        return this.c != 0 ? aeec.b(this, aefwVar) : aeec.b(this, aefwVar);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return this.c != 0 ? aeec.c(this, intPredicate) : aeec.c(this, intPredicate);
    }

    @Override // defpackage.aefw
    public final /* synthetic */ aefw b(aefw aefwVar) {
        return this.c != 0 ? aeec.d(this, aefwVar) : aeec.d(this, aefwVar);
    }

    @Override // defpackage.aefw
    public final boolean c(byte b) {
        int i = this.c;
        aefw aefwVar = this.a;
        return i != 0 ? aefwVar.c(b) || this.b.c(b) : aefwVar.c(b) && this.b.c(b);
    }

    @Override // defpackage.aefw
    public final /* synthetic */ boolean d(Byte b) {
        return this.c != 0 ? aeec.g(this, b) : aeec.g(this, b);
    }

    public final /* synthetic */ IntPredicate negate() {
        return this.c != 0 ? new aeft(this) : new aeft(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return this.c != 0 ? aeec.e(this, intPredicate) : aeec.e(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return this.c != 0 ? aeec.f(this, i) : aeec.f(this, i);
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return this.c != 0 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return this.c != 0 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return this.c != 0 ? d((Byte) obj) : d((Byte) obj);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        return this.c != 0 ? new aeft(this) : new aeft(this);
    }
}
