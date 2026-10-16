package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes3.dex */
public final class ygz<K, V> extends yfy<K, V> implements NavigableMap<K, V>, Map<K, V> {
    public static final Comparator a;
    private static final ygz e;
    private static final long serialVersionUID = 0;
    public final transient ylz c;
    public final transient yfq d;
    private final transient ygz f;

    static {
        yli yliVar = yli.a;
        a = yliVar;
        ylz ylzVarF = yhc.F(yliVar);
        int i = yfq.d;
        e = new ygz(ylzVarF, yls.a, null);
    }

    public ygz(ylz ylzVar, yfq yfqVar, ygz ygzVar) {
        this.c = ylzVar;
        this.d = yfqVar;
        this.f = ygzVar;
    }

    public static ygz a(Comparator comparator) {
        if (yli.a.equals(comparator)) {
            return e;
        }
        ylz ylzVarF = yhc.F(comparator);
        int i = yfq.d;
        return new ygz(ylzVarF, yls.a, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ygz s(Comparator comparator, Object obj, Object obj2) {
        return new ygz(new ylz(yfq.q(obj), comparator), yfq.q(obj2), null);
    }

    private final ygz v(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return a(comparator());
        }
        return new ygz(this.c.J(i, i2), this.d.subList(i, i2), null);
    }

    @Override // defpackage.yfy
    public final boolean c() {
        return this.c.f() || this.d.f();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return yrm.I(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((yhc) this.c).a;
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.c.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        ygz ygzVar = this.f;
        if (ygzVar != null) {
            return ygzVar;
        }
        if (!isEmpty()) {
            return new ygz((ylz) this.c.descendingSet(), this.d.h(), this);
        }
        Comparator comparator = comparator();
        return a((comparator instanceof yln ? (yln) comparator : new ydb(comparator)).c());
    }

    @Override // java.util.NavigableMap
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ygz headMap(Object obj, boolean z) {
        obj.getClass();
        return v(0, this.c.H(obj, z));
    }

    @Override // defpackage.yfy, java.util.Map
    /* renamed from: f */
    public final ygr entrySet() {
        return isEmpty() ? yly.a : new ygx(this);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().d().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.c.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return yrm.I(floorEntry(obj));
    }

    @Override // defpackage.yfy
    /* renamed from: g */
    public final /* synthetic */ ygr keySet() {
        return this.c;
    }

    @Override // defpackage.yfy
    /* renamed from: gR */
    public final yfg values() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    @Override // defpackage.yfy, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(java.lang.Object r4) {
        /*
            r3 = this;
            ylz r0 = r3.c
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            yfq r2 = r0.d     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.a     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r3 = 0
            return r3
        L16:
            yfq r3 = r3.d
            java.lang.Object r3 = r3.get(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygz.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return yrm.I(higherEntry(obj));
    }

    @Override // defpackage.yfy, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().d().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.c.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return yrm.I(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.c;
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

    @Override // java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final ygz subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        woy.W(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final ygz tailMap(Object obj, boolean z) {
        obj.getClass();
        return v(this.c.I(obj, z), size());
    }

    @Override // defpackage.yfy, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.d;
    }

    @Override // defpackage.yfy
    public Object writeReplace() {
        return new ygy(this);
    }
}
