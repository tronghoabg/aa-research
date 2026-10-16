package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class yvr implements java.lang.AutoCloseable {
    public final j$.util.stream.Stream b;
    public final java.util.function.Function c;
    public final java.util.function.Function d;

    public yvr(j$.util.stream.Stream stream, java.util.function.Function function, java.util.function.Function function2) {
        stream.getClass();
        this.b = stream;
        function.getClass();
        this.c = function;
        function2.getClass();
        this.d = function2;
    }

    public static defpackage.yvr f(java.util.Map map) {
        return g(j$.util.Collection.-EL.stream(map.entrySet()));
    }

    public static defpackage.yvr g(j$.util.stream.Stream stream) {
        return new defpackage.yvn(stream, new defpackage.ydm(7), new defpackage.ydm(8), stream);
    }

    public j$.util.stream.Stream a() {
        return i(new defpackage.mow(3));
    }

    public final defpackage.yhe b() {
        return (defpackage.yhe) j(new defpackage.yvk());
    }

    public final defpackage.yvr c(final java.util.function.BiPredicate biPredicate) {
        return g(a().filter(new java.util.function.Predicate() { // from class: yvm
            @Override // java.util.function.Predicate
            public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
                return j$.util.function.Predicate.-CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ java.util.function.Predicate negate() {
                return j$.util.function.Predicate.-CC.$default$negate(this);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
                return j$.util.function.Predicate.-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                return a$.ExternalSyntheticApiModelOutline2.m(biPredicate, entry.getKey(), entry.getValue());
            }
        }));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    public final defpackage.yvr d(final java.util.function.Predicate predicate) {
        return c(new java.util.function.BiPredicate() { // from class: yvi
            @Override // java.util.function.BiPredicate
            public final /* synthetic */ java.util.function.BiPredicate and(java.util.function.BiPredicate biPredicate) {
                return j$.util.function.BiPredicate.-CC.$default$and(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final /* synthetic */ java.util.function.BiPredicate negate() {
                return j$.util.function.BiPredicate.-CC.$default$negate(this);
            }

            @Override // java.util.function.BiPredicate
            public final /* synthetic */ java.util.function.BiPredicate or(java.util.function.BiPredicate biPredicate) {
                return j$.util.function.BiPredicate.-CC.$default$or(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(java.lang.Object obj, java.lang.Object obj2) {
                return a$.ExternalSyntheticApiModelOutline2.m(predicate, obj);
            }
        });
    }

    public final defpackage.yvr e(final java.util.function.Predicate predicate) {
        return c(new java.util.function.BiPredicate() { // from class: yvl
            @Override // java.util.function.BiPredicate
            public final /* synthetic */ java.util.function.BiPredicate and(java.util.function.BiPredicate biPredicate) {
                return j$.util.function.BiPredicate.-CC.$default$and(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final /* synthetic */ java.util.function.BiPredicate negate() {
                return j$.util.function.BiPredicate.-CC.$default$negate(this);
            }

            @Override // java.util.function.BiPredicate
            public final /* synthetic */ java.util.function.BiPredicate or(java.util.function.BiPredicate biPredicate) {
                return j$.util.function.BiPredicate.-CC.$default$or(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(java.lang.Object obj, java.lang.Object obj2) {
                return a$.ExternalSyntheticApiModelOutline2.m(predicate, obj2);
            }
        });
    }

    public final defpackage.yvr h(java.util.function.Function function) {
        return new defpackage.yvr(this.b, ll$.ExternalSyntheticApiModelOutline0.m(this.c, function), this.d);
    }

    public final j$.util.stream.Stream i(java.util.function.BiFunction biFunction) {
        return this.b.map(new yvq(this, biFunction));
    }

    public final java.lang.Object j(defpackage.yvg yvgVar) {
        final java.util.function.Function function = this.c;
        java.util.function.Function function2 = new java.util.function.Function() { // from class: yvo
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function3) {
                return j$.util.function.Function.-CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return a$.ExternalSyntheticApiModelOutline2.m(function, obj);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function3) {
                return j$.util.function.Function.-CC.$default$compose(this, function3);
            }
        };
        final java.util.function.Function function3 = this.d;
        return this.b.collect(yvgVar.a(function2, new java.util.function.Function() { // from class: yvo
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function4) {
                return j$.util.function.Function.-CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return a$.ExternalSyntheticApiModelOutline2.m(function3, obj);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function4) {
                return j$.util.function.Function.-CC.$default$compose(this, function4);
            }
        }));
    }
}
