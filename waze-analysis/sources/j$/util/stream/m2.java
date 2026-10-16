package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public interface m2 {
    m2 a(int i2);

    long count();

    m2 f(long j2, long j3, IntFunction intFunction);

    void forEach(Consumer consumer);

    void h(Object[] objArr, int i2);

    Object[] k(IntFunction intFunction);

    int s();

    Spliterator spliterator();
}
