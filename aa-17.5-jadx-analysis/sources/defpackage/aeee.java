package defpackage;

import java.util.function.Function;

@FunctionalInterface
/* loaded from: classes3.dex */
public interface aeee<K, V> extends Function<K, V> {
    boolean containsKey(Object obj);

    V get(Object obj);

    int size();
}
