package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;
import j$.nio.file.f0;
import j$.time.ZoneId;
import j$.util.Map;
import j$.util.Spliterator;
import j$.util.function.BiFunction$CC;
import j$.util.function.BiPredicate$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.IntPredicate$CC;
import j$.util.function.LongPredicate$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.a2;
import j$.util.stream.a4;
import j$.util.stream.c4;
import j$.util.stream.l4;
import j$.util.stream.s3;
import j$.util.stream.t3;
import j$.util.stream.z2;
import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements f0, DirectoryStream.Filter, j$.time.temporal.k, BiPredicate, BinaryOperator, IntPredicate, LongPredicate, Predicate, Supplier, LongFunction, Consumer, BooleanSupplier, z2 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ h(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // j$.time.temporal.k
    public long C(j$.time.temporal.n nVar) {
        throw new j$.time.temporal.p("Unsupported field: ".concat(String.valueOf(nVar)));
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 12:
                ((z2) obj2).accept((z2) obj);
                break;
            case 13:
                ((ArrayList) obj2).add(obj);
                break;
            default:
                ((s3) obj2).accept(obj);
                break;
        }
    }

    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$and(this, biPredicate);
    }

    @Override // java.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 4:
                return ((Comparator) obj3).compare(obj, obj2) <= 0 ? obj : obj2;
            default:
                BinaryOperator binaryOperator = (BinaryOperator) obj3;
                Map map = (Map) obj;
                Set set = Collectors.a;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    Map.EL.merge(map, entry.getKey(), entry.getValue(), binaryOperator);
                }
                return map;
        }
    }

    @Override // j$.nio.file.f0
    public boolean c(Path path) {
        return ((Pattern) this.b).matcher(path.toString()).matches();
    }

    @Override // j$.time.temporal.k
    public boolean d(j$.time.temporal.n nVar) {
        return false;
    }

    public void f(t3 t3Var) {
        ((EnumMap) this.b).put((EnumMap) t3Var, (t3) 1);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 8:
                return ((j$.util.stream.a) obj).p(0);
            default:
                return (Spliterator) obj;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                a4 a4Var = (a4) obj;
                return a4Var.d.tryAdvance(a4Var.e);
            case 16:
                c4 c4Var = (c4) obj;
                return c4Var.d.tryAdvance(c4Var.e);
            default:
                l4 l4Var = (l4) obj;
                return l4Var.d.tryAdvance(l4Var.e);
        }
    }

    @Override // j$.time.temporal.k
    public /* synthetic */ int h(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.k
    public /* synthetic */ j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    public /* synthetic */ BiPredicate negate() {
        return BiPredicate$CC.$default$negate(this);
    }

    public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // j$.util.stream.z2
    public boolean s() {
        return false;
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    @Override // j$.time.temporal.k
    public Object w(n nVar) {
        return nVar == j$.time.temporal.o.a ? (ZoneId) this.b : j$.time.temporal.o.c(this, nVar);
    }

    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    /* renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ IntPredicate m327negate() {
        return IntPredicate$CC.$default$negate(this);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    public /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
        return LongPredicate$CC.$default$and(this, longPredicate);
    }

    /* renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ LongPredicate m328negate() {
        return LongPredicate$CC.$default$negate(this);
    }

    public /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
        return LongPredicate$CC.$default$or(this, longPredicate);
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo56negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.IntPredicate
    public boolean test(int i) {
        return !((IntPredicate) this.b).test(i);
    }

    @Override // java.util.function.LongPredicate
    public boolean test(long j) {
        return !((LongPredicate) this.b).test(j);
    }

    @Override // java.util.function.BiPredicate
    public boolean test(Object obj, Object obj2) {
        return !((BiPredicate) this.b).test(obj, obj2);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // j$.util.stream.z2
    public /* synthetic */ void accept(long j) {
        a2.i();
        throw null;
    }

    @Override // j$.util.stream.z2
    public /* synthetic */ void accept(int i) {
        a2.d();
        throw null;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* renamed from: accept, reason: collision with other method in class */
    public boolean mo326accept(Object obj) {
        return ((DirectoryStream.Filter) this.b).mo326accept(j$.nio.file.a.g(obj));
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return a2.x(j, (IntFunction) this.b);
    }

    @Override // j$.util.stream.z2
    public void p(long j) {
    }

    @Override // j$.util.stream.z2
    public void end() {
    }
}
