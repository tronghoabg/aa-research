package defpackage;

import j$.util.PrimitiveIterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public interface aejr extends PrimitiveIterator.OfInt {
    @Override // j$.util.PrimitiveIterator.OfInt, java.util.Iterator
    @Deprecated
    void forEachRemaining(Consumer consumer);

    @Override // j$.util.PrimitiveIterator.OfInt, java.util.Iterator
    @Deprecated
    Integer next();

    @Override // j$.util.PrimitiveIterator.OfInt
    int nextInt();
}
