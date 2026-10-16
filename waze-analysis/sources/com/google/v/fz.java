package com.google.v;

import com.google.v.dg;
import j$.util.DesugarCollections;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
class fz<K extends dg<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f12991a;

    /* renamed from: b, reason: collision with root package name */
    private int f12992b;

    /* renamed from: c, reason: collision with root package name */
    private Map f12993c = Collections.EMPTY_MAP;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12994d;

    /* renamed from: e, reason: collision with root package name */
    private volatile fy f12995e;

    private fz() {
    }

    private final int l(dg dgVar) {
        int i2 = this.f12992b;
        int i3 = i2 - 1;
        int i4 = 0;
        if (i3 >= 0) {
            int iCompareTo = dgVar.compareTo(((fw) this.f12991a[i3]).a());
            if (iCompareTo > 0) {
                return -(i2 + 1);
            }
            if (iCompareTo == 0) {
                return i3;
            }
        }
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            int iCompareTo2 = dgVar.compareTo(((fw) this.f12991a[i5]).a());
            if (iCompareTo2 < 0) {
                i3 = i5 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i5;
                }
                i4 = i5 + 1;
            }
        }
        return -(i4 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(int i2) {
        o();
        Object value = ((fw) this.f12991a[i2]).getValue();
        Object[] objArr = this.f12991a;
        System.arraycopy(objArr, i2 + 1, objArr, i2, (this.f12992b - i2) - 1);
        this.f12992b--;
        if (!this.f12993c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            Object[] objArr2 = this.f12991a;
            int i3 = this.f12992b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i3] = new fw(this, (dg) entry.getKey(), entry.getValue());
            this.f12992b++;
            it.remove();
        }
        return value;
    }

    private final SortedMap n() {
        o();
        if (this.f12993c.isEmpty() && !(this.f12993c instanceof TreeMap)) {
            this.f12993c = new TreeMap();
        }
        return (SortedMap) this.f12993c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.f12994d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f12994d) {
            return;
        }
        this.f12993c = this.f12993c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.f12993c);
        this.f12994d = true;
    }

    public final int c() {
        return this.f12992b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (this.f12992b != 0) {
            this.f12991a = null;
            this.f12992b = 0;
        }
        if (this.f12993c.isEmpty()) {
            return;
        }
        this.f12993c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        dg dgVar = (dg) obj;
        return l(dgVar) >= 0 || this.f12993c.containsKey(dgVar);
    }

    public final Iterable d() {
        return this.f12993c.isEmpty() ? Collections.EMPTY_SET : this.f12993c.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(dg dgVar, Object obj) {
        o();
        int iL = l(dgVar);
        if (iL >= 0) {
            return ((fw) this.f12991a[iL]).setValue(obj);
        }
        o();
        Object[] objArr = this.f12991a;
        if (objArr == null) {
            objArr = new Object[16];
            this.f12991a = objArr;
        }
        int i2 = -(iL + 1);
        if (i2 >= 16) {
            return n().put(dgVar, obj);
        }
        if (this.f12992b == 16) {
            fw fwVar = (fw) objArr[15];
            this.f12992b = 15;
            n().put(fwVar.a(), fwVar.getValue());
        }
        Object[] objArr2 = this.f12991a;
        int length = objArr2.length;
        System.arraycopy(objArr2, i2, objArr2, i2 + 1, 15 - i2);
        this.f12991a[i2] = new fw(this, dgVar, obj);
        this.f12992b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f12995e == null) {
            this.f12995e = new fy(this);
        }
        return this.f12995e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz)) {
            return super.equals(obj);
        }
        fz fzVar = (fz) obj;
        int size = size();
        if (size != fzVar.size()) {
            return false;
        }
        int i2 = this.f12992b;
        if (i2 != fzVar.f12992b) {
            return entrySet().equals(fzVar.entrySet());
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!f(i3).equals(fzVar.f(i3))) {
                return false;
            }
        }
        if (i2 != size) {
            return this.f12993c.equals(fzVar.f12993c);
        }
        return true;
    }

    public final Map.Entry f(int i2) {
        if (i2 < this.f12992b) {
            return (fw) this.f12991a[i2];
        }
        throw new ArrayIndexOutOfBoundsException(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        dg dgVar = (dg) obj;
        int iL = l(dgVar);
        return iL >= 0 ? (V) ((fw) this.f12991a[iL]).getValue() : (V) this.f12993c.get(dgVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i2 = this.f12992b;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode += this.f12991a[i3].hashCode();
        }
        return this.f12993c.size() > 0 ? iHashCode + this.f12993c.hashCode() : iHashCode;
    }

    public final boolean i() {
        return this.f12994d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        o();
        dg dgVar = (dg) obj;
        int iL = l(dgVar);
        if (iL >= 0) {
            return (V) m(iL);
        }
        if (this.f12993c.isEmpty()) {
            return null;
        }
        return (V) this.f12993c.remove(dgVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12992b + this.f12993c.size();
    }

    /* synthetic */ fz(byte[] bArr) {
    }
}
