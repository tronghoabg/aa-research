package defpackage;

import j$.util.function.BiConsumer$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class ycm {
    public static final Collector a;
    public static final Collector b;

    static {
        int i = 0;
        int i2 = 2;
        a = Collector.CC.of(new yce(i), new ycg(i), new ycf(i2), new ych(i), new Collector.Characteristics[0]);
        int i3 = 3;
        b = Collector.CC.of(new yce(i2), new ycg(i2), new ycf(i3), new ych(i2), new Collector.Characteristics[0]);
        Collector.CC.of(new yce(i3), new ycg(i3), new ycf(i), new ych(1), new Collector.Characteristics[0]);
    }

    public static Collector a(final Function function, final Function function2) {
        function2.getClass();
        int i = 5;
        return Collector.CC.of(new yce(i), new BiConsumer() { // from class: ycj
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Collector collector = ycm.a;
                ((yfu) obj).e(function.apply(obj2), function2.apply(obj2));
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new ycf(i), new ych(4), new Collector.Characteristics[0]);
    }

    public static Collector b(Function function, Function function2, BinaryOperator binaryOperator) {
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new yce(6)), new ych(5));
    }
}
