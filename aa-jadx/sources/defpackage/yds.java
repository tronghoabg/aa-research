package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yds {
    public static final j$.util.stream.Collector a;
    public static final j$.util.stream.Collector b;

    static {
        int i = 0;
        int i2 = 2;
        a = j$.util.stream.Collector.CC.of(new defpackage.ydk(i), new defpackage.ydn(i), new defpackage.ydl(i2), new defpackage.ydm(i2), new j$.util.stream.Collector.Characteristics[0]);
        defpackage.ydk ydkVar = new defpackage.ydk(i2);
        defpackage.ydn ydnVar = new defpackage.ydn(i2);
        int i3 = 3;
        b = j$.util.stream.Collector.CC.of(ydkVar, ydnVar, new defpackage.ydl(i3), new defpackage.ydm(i3), new j$.util.stream.Collector.Characteristics[0]);
        j$.util.stream.Collector.CC.of(new defpackage.ydk(i3), new defpackage.ydn(i3), new defpackage.ydl(i), new defpackage.ydm(i), new j$.util.stream.Collector.Characteristics[0]);
    }

    public static j$.util.stream.Collector a(final java.util.function.Function function, final java.util.function.Function function2) {
        function2.getClass();
        int i = 5;
        return j$.util.stream.Collector.CC.of(new defpackage.ydk(i), new java.util.function.BiConsumer() { // from class: ydp
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                j$.util.stream.Collector collector = defpackage.yds.a;
                ((defpackage.yha) obj).f(function.apply(obj2), function2.apply(obj2));
            }

            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                return j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new defpackage.ydl(i), new defpackage.ydm(i), new j$.util.stream.Collector.Characteristics[0]);
    }

    public static j$.util.stream.Collector b(java.util.function.Function function, java.util.function.Function function2, java.util.function.BinaryOperator binaryOperator) {
        int i = 6;
        return j$.util.stream.Collectors.collectingAndThen(j$.util.stream.Collectors.toMap(function, function2, binaryOperator, new defpackage.ydk(i)), new defpackage.ydm(i));
    }
}
