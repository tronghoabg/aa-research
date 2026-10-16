package defpackage;

import j$.util.function.BiConsumer$CC;
import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final /* synthetic */ class yuc implements yub {
    @Override // defpackage.yub
    public final Collector a(final Function function, final Function function2) {
        Collector collector = ycm.a;
        return Collector.CC.of(new maf(20), new BiConsumer() { // from class: yck
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Collector collector2 = ycm.a;
                ((yfr) obj).b(function.apply(obj2), function2.apply(obj2));
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new rib(5), new uzr(19), new Collector.Characteristics[0]);
    }
}
