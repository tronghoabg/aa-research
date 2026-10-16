package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public interface j0 {
    j0 a(int i);

    long count();

    void forEach(Consumer consumer);

    j0 g(long j, long j2, IntFunction intFunction);

    void h(Object[] objArr, int i);

    Object[] k(IntFunction intFunction);

    int l();

    Spliterator spliterator();
}
