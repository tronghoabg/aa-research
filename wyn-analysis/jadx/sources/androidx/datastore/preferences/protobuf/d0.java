package androidx.datastore.preferences.protobuf;

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

/* loaded from: classes.dex */
public final class d0 extends AbstractMap {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f18192g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f18193a;

    /* renamed from: b, reason: collision with root package name */
    public List f18194b = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    public Map f18195c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18196d;

    /* renamed from: e, reason: collision with root package name */
    public volatile i0 f18197e;

    /* renamed from: f, reason: collision with root package name */
    public Map f18198f;

    public d0(int i5) {
        this.f18193a = i5;
        Map map = Collections.EMPTY_MAP;
        this.f18195c = map;
        this.f18198f = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f18194b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f18194b
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.g0 r2 = (androidx.datastore.preferences.protobuf.g0) r2
            java.lang.Comparable r2 = r2.f18207a
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
            java.util.List r3 = r4.f18194b
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.g0 r3 = (androidx.datastore.preferences.protobuf.g0) r3
            java.lang.Comparable r3 = r3.f18207a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.d0.a(java.lang.Comparable):int");
    }

    public final void c() {
        if (this.f18196d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.f18194b.isEmpty()) {
            this.f18194b.clear();
        }
        if (this.f18195c.isEmpty()) {
            return;
        }
        this.f18195c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f18195c.containsKey(comparable);
    }

    public final Map.Entry d(int i5) {
        return (Map.Entry) this.f18194b.get(i5);
    }

    public final Iterable e() {
        return this.f18195c.isEmpty() ? Q.f18154b : this.f18195c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f18197e == null) {
            this.f18197e = new i0(0, this);
        }
        return this.f18197e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return super.equals(obj);
        }
        d0 d0Var = (d0) obj;
        int size = size();
        if (size == d0Var.size()) {
            int size2 = this.f18194b.size();
            if (size2 != d0Var.f18194b.size()) {
                return ((AbstractSet) entrySet()).equals(d0Var.entrySet());
            }
            for (int i5 = 0; i5 < size2; i5++) {
                if (d(i5).equals(d0Var.d(i5))) {
                }
            }
            if (size2 != size) {
                return this.f18195c.equals(d0Var.f18195c);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        c();
        if (this.f18195c.isEmpty() && !(this.f18195c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f18195c = treeMap;
            this.f18198f = treeMap.descendingMap();
        }
        return (SortedMap) this.f18195c;
    }

    public final Object g(Comparable comparable, Object obj) {
        c();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((g0) this.f18194b.get(iA)).setValue(obj);
        }
        c();
        boolean zIsEmpty = this.f18194b.isEmpty();
        int i5 = this.f18193a;
        if (zIsEmpty && !(this.f18194b instanceof ArrayList)) {
            this.f18194b = new ArrayList(i5);
        }
        int i10 = -(iA + 1);
        if (i10 >= i5) {
            return f().put(comparable, obj);
        }
        if (this.f18194b.size() == i5) {
            g0 g0Var = (g0) this.f18194b.remove(i5 - 1);
            f().put(g0Var.f18207a, g0Var.f18208b);
        }
        this.f18194b.add(i10, new g0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((g0) this.f18194b.get(iA)).f18208b : this.f18195c.get(comparable);
    }

    public final Object h(int i5) {
        c();
        Object obj = ((g0) this.f18194b.remove(i5)).f18208b;
        if (!this.f18195c.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.f18194b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new g0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f18194b.size();
        int iHashCode = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iHashCode += ((g0) this.f18194b.get(i5)).hashCode();
        }
        return this.f18195c.size() > 0 ? this.f18195c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        if (obj == null) {
            return g(null, obj2);
        }
        throw new ClassCastException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f18195c.isEmpty()) {
            return null;
        }
        return this.f18195c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f18195c.size() + this.f18194b.size();
    }
}
