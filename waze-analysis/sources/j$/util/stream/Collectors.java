package j$.util.stream;

import j$.util.stream.Collector;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class Collectors {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f50307a;

    /* renamed from: b, reason: collision with root package name */
    public static final Set f50308b;

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        f50307a = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        f50308b = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    public static void a(double[] dArr, double d2) {
        double d3 = d2 - dArr[1];
        double d4 = dArr[0];
        double d5 = d4 + d3;
        dArr[1] = (d5 - d4) - d3;
        dArr[0] = d5;
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence) {
        return new i(new j$.desugar.sun.nio.fs.g(6, charSequence), new j$.desugar.sun.nio.fs.n(22), new j$.desugar.sun.nio.fs.n(23), new j$.desugar.sun.nio.fs.n(24), f50308b);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new i(new j$.desugar.sun.nio.fs.n(14), new j$.desugar.sun.nio.fs.n(15), new j$.desugar.sun.nio.fs.n(20), f50307a);
    }
}
