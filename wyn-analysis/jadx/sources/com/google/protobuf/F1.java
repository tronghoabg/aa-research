package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class F1 extends AbstractMap {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f27555h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f27556a;

    /* renamed from: b, reason: collision with root package name */
    public List f27557b = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    public Map f27558c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27559d;

    /* renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.i0 f27560e;

    /* renamed from: f, reason: collision with root package name */
    public Map f27561f;

    /* renamed from: g, reason: collision with root package name */
    public volatile H1 f27562g;

    public F1(int i5) {
        this.f27556a = i5;
        Map map = Collections.EMPTY_MAP;
        this.f27558c = map;
        this.f27561f = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f27557b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f27557b
            java.lang.Object r2 = r2.get(r1)
            com.google.protobuf.L1 r2 = (com.google.protobuf.L1) r2
            java.lang.Comparable r2 = r2.f27588a
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f27557b
            java.lang.Object r3 = r3.get(r2)
            com.google.protobuf.L1 r3 = (com.google.protobuf.L1) r3
            java.lang.Comparable r3 = r3.f27588a
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.F1.a(java.lang.Comparable):int");
    }

    public final void c() {
        if (this.f27559d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.f27557b.isEmpty()) {
            this.f27557b.clear();
        }
        if (this.f27558c.isEmpty()) {
            return;
        }
        this.f27558c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f27558c.containsKey(comparable);
    }

    public final Map.Entry d(int i5) {
        return (Map.Entry) this.f27557b.get(i5);
    }

    public final Iterable e() {
        return this.f27558c.isEmpty() ? K1.f27586b : this.f27558c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f27560e == null) {
            this.f27560e = new androidx.datastore.preferences.protobuf.i0(1, this);
        }
        return this.f27560e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F1)) {
            return super.equals(obj);
        }
        F1 f1 = (F1) obj;
        int size = size();
        if (size == f1.size()) {
            int size2 = this.f27557b.size();
            if (size2 != f1.f27557b.size()) {
                return ((AbstractSet) entrySet()).equals(f1.entrySet());
            }
            for (int i5 = 0; i5 < size2; i5++) {
                if (d(i5).equals(f1.d(i5))) {
                }
            }
            if (size2 != size) {
                return this.f27558c.equals(f1.f27558c);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        c();
        if (this.f27558c.isEmpty() && !(this.f27558c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f27558c = treeMap;
            this.f27561f = treeMap.descendingMap();
        }
        return (SortedMap) this.f27558c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        c();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((L1) this.f27557b.get(iA)).setValue(obj);
        }
        c();
        boolean zIsEmpty = this.f27557b.isEmpty();
        int i5 = this.f27556a;
        if (zIsEmpty && !(this.f27557b instanceof ArrayList)) {
            this.f27557b = new ArrayList(i5);
        }
        int i10 = -(iA + 1);
        if (i10 >= i5) {
            return f().put(comparable, obj);
        }
        if (this.f27557b.size() == i5) {
            L1 l12 = (L1) this.f27557b.remove(i5 - 1);
            f().put(l12.f27588a, l12.f27589b);
        }
        this.f27557b.add(i10, new L1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((L1) this.f27557b.get(iA)).f27589b : this.f27558c.get(comparable);
    }

    public final Object h(int i5) {
        c();
        Object obj = ((L1) this.f27557b.remove(i5)).f27589b;
        if (!this.f27558c.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.f27557b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new L1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f27557b.size();
        int iHashCode = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iHashCode += ((L1) this.f27557b.get(i5)).hashCode();
        }
        return this.f27558c.size() > 0 ? this.f27558c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f27558c.isEmpty()) {
            return null;
        }
        return this.f27558c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f27558c.size() + this.f27557b.size();
    }
}
