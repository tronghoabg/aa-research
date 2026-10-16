package com.google.d.d;

import j$.util.Map;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class cn<K, V> extends bs<K, V> implements NavigableMap<K, V>, Map<K, V> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f7499b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator f7500c;

    /* renamed from: d, reason: collision with root package name */
    private static final cn f7501d;
    private static final long serialVersionUID = 0;

    /* renamed from: e, reason: collision with root package name */
    private final transient fc f7502e;

    /* renamed from: f, reason: collision with root package name */
    private final transient bn f7503f;

    /* renamed from: g, reason: collision with root package name */
    private final transient cn f7504g;

    static {
        eo eoVar = eo.f7570a;
        f7500c = eoVar;
        fc fcVarE = cq.E(eoVar);
        int i2 = bn.f7456d;
        f7501d = new cn(fcVarE, es.f7582a);
    }

    cn(fc fcVar, bn bnVar, cn cnVar) {
        this.f7502e = fcVar;
        this.f7503f = bnVar;
        this.f7504g = cnVar;
    }

    public static cn o(java.util.Map map) {
        Comparator comparator = f7500c;
        eq eqVar = (eq) comparator;
        Comparator<? super K> comparator2 = ((SortedMap) map).comparator();
        int i2 = 1;
        boolean zEquals = comparator2 == null ? eqVar == comparator : eqVar.equals(comparator2);
        Map.Entry[] entryArr = (Map.Entry[]) fo.S(map.entrySet(), f7466a);
        int length = entryArr.length;
        if (length == 0) {
            return p(eqVar);
        }
        if (length == 1) {
            Map.Entry entry = (Map.Entry) Objects.requireNonNull(entryArr[0]);
            return v(eqVar, entry.getKey(), entry.getValue());
        }
        Object[] objArr = new Object[length];
        Object[] objArr2 = new Object[length];
        if (zEquals) {
            for (int i3 = 0; i3 < length; i3++) {
                Map.Entry entry2 = (Map.Entry) Objects.requireNonNull(entryArr[i3]);
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                fo.af(key, value);
                objArr[i3] = key;
                objArr2[i3] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new com.waze.app_nav.hub.a.f(eqVar, 1));
            Map.Entry entry3 = (Map.Entry) Objects.requireNonNull(entryArr[0]);
            Object key2 = entry3.getKey();
            objArr[0] = key2;
            Object value2 = entry3.getValue();
            objArr2[0] = value2;
            fo.af(objArr[0], value2);
            while (i2 < length) {
                Map.Entry entry4 = (Map.Entry) Objects.requireNonNull(entryArr[i2 - 1]);
                Map.Entry entry5 = (Map.Entry) Objects.requireNonNull(entryArr[i2]);
                Object key3 = entry5.getKey();
                Object value3 = entry5.getValue();
                fo.af(key3, value3);
                objArr[i2] = key3;
                objArr2[i2] = value3;
                if (eqVar.compare(key2, key3) == 0) {
                    throw new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(entry4) + " and " + String.valueOf(entry5));
                }
                i2++;
                key2 = key3;
            }
        }
        return new cn(new fc(bn.k(objArr), eqVar), bn.k(objArr2));
    }

    static cn p(Comparator comparator) {
        if (eo.f7570a.equals(comparator)) {
            return f7501d;
        }
        fc fcVarE = cq.E(comparator);
        int i2 = bn.f7456d;
        return new cn(fcVarE, es.f7582a);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private final cn u(int i2, int i3) {
        if (i2 == 0) {
            if (i3 == size()) {
                return this;
            }
            i2 = 0;
        }
        if (i2 == i3) {
            return p(comparator());
        }
        return new cn(this.f7502e.I(i2, i3), this.f7503f.subList(i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static cn v(Comparator comparator, Object obj, Object obj2) {
        return new cn(new fc(bn.q(obj), comparator), bn.q(obj2));
    }

    @Override // com.google.d.d.bs
    final bh a() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.d.d.bs
    /* renamed from: b */
    public final bh values() {
        return this.f7503f;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return fo.w(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((cq) this.f7502e).f7508a;
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.f7502e.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        cn cnVar = this.f7504g;
        return cnVar == null ? isEmpty() ? p(eq.c(comparator()).a()) : new cn((fc) this.f7502e.descendingSet(), this.f7503f.a(), this) : cnVar;
    }

    @Override // com.google.d.d.bs, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().g().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f7502e.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return fo.w(floorEntry(obj));
    }

    @Override // com.google.d.d.bs
    final ci g() {
        return isEmpty() ? fb.f7608a : new ck(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    @Override // com.google.d.d.bs, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(java.lang.Object r4) {
        /*
            r3 = this;
            com.google.d.d.fc r0 = r3.f7502e
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            com.google.d.d.bn r2 = r0.f7616d     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.f7508a     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r3 = 0
            return r3
        L16:
            com.google.d.d.bn r3 = r3.f7503f
            java.lang.Object r3 = r3.get(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.d.cn.get(java.lang.Object):java.lang.Object");
    }

    @Override // com.google.d.d.bs
    final ci h() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return fo.w(higherEntry(obj));
    }

    @Override // com.google.d.d.bs
    /* renamed from: j */
    public final /* synthetic */ ci keySet() {
        return this.f7502e;
    }

    @Override // com.google.d.d.bs
    final boolean k() {
        return this.f7502e.i() || this.f7503f.i();
    }

    @Override // com.google.d.d.bs, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.f7502e;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().g().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f7502e.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return fo.w(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f7502e;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final cn headMap(Object obj, boolean z) {
        com.google.d.b.an.B(obj);
        return u(0, this.f7502e.G(obj, z));
    }

    @Override // java.util.NavigableMap
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final cn subMap(Object obj, boolean z, Object obj2, boolean z2) {
        com.google.d.b.an.B(obj);
        com.google.d.b.an.B(obj2);
        com.google.d.b.an.s(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final cn tailMap(Object obj, boolean z) {
        com.google.d.b.an.B(obj);
        return u(this.f7502e.H(obj, z), size());
    }

    @Override // java.util.Map
    public final int size() {
        return this.f7503f.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // com.google.d.d.bs, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.f7503f;
    }

    @Override // com.google.d.d.bs
    Object writeReplace() {
        return new cm(this);
    }

    cn(fc fcVar, bn bnVar) {
        this(fcVar, bnVar, null);
    }
}
