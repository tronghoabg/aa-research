package j$.util.stream;

import j$.util.C2910e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* loaded from: classes2.dex */
final class M1 extends AbstractC3044y0 {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f38037h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ BiConsumer f38038i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Supplier f38039j;
    final /* synthetic */ C2969j k;

    @Override // j$.util.stream.AbstractC3044y0, j$.util.stream.N3
    public final int d() {
        Set<Collector.Characteristics> setCharacteristics = this.k.f38236a.characteristics();
        if (setCharacteristics != null && !setCharacteristics.isEmpty()) {
            HashSet hashSet = new HashSet();
            Collector.Characteristics next = setCharacteristics.iterator().next();
            if (next instanceof EnumC2964i) {
                Iterator<Collector.Characteristics> it = setCharacteristics.iterator();
                while (it.hasNext()) {
                    try {
                        EnumC2964i enumC2964i = (EnumC2964i) it.next();
                        hashSet.add(enumC2964i == null ? null : enumC2964i == EnumC2964i.CONCURRENT ? Collector.Characteristics.CONCURRENT : enumC2964i == EnumC2964i.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                    } catch (ClassCastException e7) {
                        C2910e.a("java.util.stream.Collector.Characteristics", e7);
                        throw null;
                    }
                }
            } else {
                if (!(next instanceof Collector.Characteristics)) {
                    C2910e.a("java.util.stream.Collector.Characteristics", next.getClass());
                    throw null;
                }
                Iterator<Collector.Characteristics> it2 = setCharacteristics.iterator();
                while (it2.hasNext()) {
                    try {
                        Collector.Characteristics next2 = it2.next();
                        hashSet.add(next2 == null ? null : next2 == Collector.Characteristics.CONCURRENT ? EnumC2964i.CONCURRENT : next2 == Collector.Characteristics.UNORDERED ? EnumC2964i.UNORDERED : EnumC2964i.IDENTITY_FINISH);
                    } catch (ClassCastException e10) {
                        C2910e.a("java.util.stream.Collector.Characteristics", e10);
                        throw null;
                    }
                }
            }
            setCharacteristics = hashSet;
        }
        if (setCharacteristics.contains(EnumC2964i.UNORDERED)) {
            return EnumC2958g3.f38208r;
        }
        return 0;
    }

    @Override // j$.util.stream.AbstractC3044y0
    public final V1 T() {
        return new N1(this.f38039j, this.f38038i, this.f38037h);
    }

    M1(EnumC2963h3 enumC2963h3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, C2969j c2969j) {
        this.f38037h = binaryOperator;
        this.f38038i = biConsumer;
        this.f38039j = supplier;
        this.k = c2969j;
    }
}
