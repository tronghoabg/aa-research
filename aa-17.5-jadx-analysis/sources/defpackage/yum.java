package defpackage;

import j$.util.Collection;
import j$.util.function.BiPredicate$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public class yum implements AutoCloseable {
    public final Stream b;
    public final Function c;
    public final Function d;

    public yum(Stream stream, Function function, Function function2) {
        stream.getClass();
        this.b = stream;
        function.getClass();
        this.c = function;
        function2.getClass();
        this.d = function2;
    }

    public static yum f(Map map) {
        return g(Collection.EL.stream(map.entrySet()));
    }

    public static yum g(Stream stream) {
        return new yui(stream, new ych(6), new ych(7), stream);
    }

    public Stream a() {
        return i(new moq(3));
    }

    public final yfy b() {
        return (yfy) j(new yuf());
    }

    public final yum c(final BiPredicate biPredicate) {
        return g(a().filter(new Predicate() { // from class: yuh
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo56negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return biPredicate.test(entry.getKey(), entry.getValue());
            }
        }));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    public final yum d(final Predicate predicate) {
        return c(new BiPredicate() { // from class: yud
            public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
                return BiPredicate$CC.$default$and(this, biPredicate);
            }

            public final /* synthetic */ BiPredicate negate() {
                return BiPredicate$CC.$default$negate(this);
            }

            public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
                return BiPredicate$CC.$default$or(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return predicate.test(obj);
            }
        });
    }

    public final yum e(final Predicate predicate) {
        return c(new BiPredicate() { // from class: yug
            public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
                return BiPredicate$CC.$default$and(this, biPredicate);
            }

            public final /* synthetic */ BiPredicate negate() {
                return BiPredicate$CC.$default$negate(this);
            }

            public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
                return BiPredicate$CC.$default$or(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return predicate.test(obj2);
            }
        });
    }

    public final yum h(Function function) {
        return new yum(this.b, this.c.mo329andThen(function), this.d);
    }

    public final Stream i(final BiFunction biFunction) {
        return this.b.map(new Function() { // from class: yul
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo329andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                BiFunction biFunction2 = biFunction;
                yum yumVar = this.b;
                return biFunction2.apply(yumVar.c.apply(obj), yumVar.d.apply(obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final Object j(yub yubVar) {
        final Function function = this.c;
        Function function2 = new Function() { // from class: yuj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo329andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return function.apply(obj);
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        };
        final Function function3 = this.d;
        return this.b.collect(yubVar.a(function2, new Function() { // from class: yuj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo329andThen(Function function32) {
                return Function$CC.$default$andThen(this, function32);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return function3.apply(obj);
            }

            public final /* synthetic */ Function compose(Function function32) {
                return Function$CC.$default$compose(this, function32);
            }
        }));
    }
}
