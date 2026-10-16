package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class ahpt {
    private static final Iterator<Object> ITERATOR = new ahpr();
    private static final Iterable<Object> ITERABLE = new ahps();

    static <T> Iterable<T> iterable() {
        return (Iterable<T>) ITERABLE;
    }
}
