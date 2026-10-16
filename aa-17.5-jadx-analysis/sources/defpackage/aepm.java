package defpackage;

import j$.util.PrimitiveIterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public interface aepm extends PrimitiveIterator.OfLong {
    @Override // j$.util.PrimitiveIterator.OfLong, java.util.Iterator
    @Deprecated
    void forEachRemaining(Consumer consumer);

    @Override // j$.util.PrimitiveIterator.OfLong, java.util.Iterator
    @Deprecated
    Long next();

    @Override // j$.util.PrimitiveIterator.OfLong
    long nextLong();
}
