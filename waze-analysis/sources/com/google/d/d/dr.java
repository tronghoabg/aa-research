package com.google.d.d;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class dr<K, V> extends AbstractMap<K, V> {
    dr() {
    }

    abstract Iterator a();

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        fo.L(a());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new dq(this);
    }
}
