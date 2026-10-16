package com.google.d.d;

import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ao<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f7424d = new Object();

    /* renamed from: a, reason: collision with root package name */
    transient int[] f7425a;

    /* renamed from: b, reason: collision with root package name */
    transient Object[] f7426b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f7427c;

    /* renamed from: e, reason: collision with root package name */
    private transient Object f7428e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f7429f;

    /* renamed from: g, reason: collision with root package name */
    private transient int f7430g;

    /* renamed from: h, reason: collision with root package name */
    private transient Set f7431h;

    /* renamed from: i, reason: collision with root package name */
    private transient Set f7432i;

    /* renamed from: j, reason: collision with root package name */
    private transient Collection f7433j;

    ao() {
        q(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(Object obj) {
        int iW;
        int iAb;
        if (s() || (iAb = fo.ab(obj, null, (iW = w()), B(), F(), G(), null)) == -1) {
            return f7424d;
        }
        Object objC = C(iAb);
        r(iAb, iW);
        this.f7430g--;
        p();
        return objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B() {
        return Objects.requireNonNull(this.f7428e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(int i2) {
        return H()[i2];
    }

    private final void D(int i2) {
        this.f7429f = fo.Z(this.f7429f, 32 - Integer.numberOfLeadingZeros(i2), 31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(int i2, Object obj) {
        H()[i2] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] F() {
        return (int[]) Objects.requireNonNull(this.f7425a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] G() {
        return (Object[]) Objects.requireNonNull(this.f7426b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] H() {
        return (Object[]) Objects.requireNonNull(this.f7427c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i2 = objectInputStream.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Invalid size: " + i2);
        }
        q(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int w() {
        return (1 << (this.f7429f & 31)) - 1;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator itL = l();
        while (itL.hasNext()) {
            Map.Entry entry = (Map.Entry) itL.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int x(Object obj) {
        if (s()) {
            return -1;
        }
        int iW = fo.W(obj);
        int iW2 = w();
        int iAc = fo.ac(B(), iW & iW2);
        if (iAc == 0) {
            return -1;
        }
        int iY = fo.Y(iW, iW2);
        do {
            int i2 = iAc - 1;
            int i3 = F()[i2];
            if (fo.Y(i3, iW2) == iY && Objects.equals(obj, z(i2))) {
                return i2;
            }
            iAc = i3 & iW2;
        } while (iAc != 0);
        return -1;
    }

    private final int y(int i2, int i3, int i4, int i5) {
        int i6 = i3 - 1;
        Object objAd = fo.ad(i3);
        if (i5 != 0) {
            fo.ae(objAd, i4 & i6, i5 + 1);
        }
        Object objB = B();
        int[] iArrF = F();
        for (int i7 = 0; i7 <= i2; i7++) {
            int iAc = fo.ac(objB, i7);
            while (iAc != 0) {
                int i8 = iAc - 1;
                int i9 = iArrF[i8];
                int iY = fo.Y(i9, i2) | i7;
                int i10 = iY & i6;
                int iAc2 = fo.ac(objAd, i10);
                fo.ae(objAd, i10, iAc);
                iArrF[i8] = fo.Z(iY, iAc2, i6);
                iAc = i9 & i2;
            }
        }
        this.f7428e = objAd;
        D(i6);
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(int i2) {
        return G()[i2];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (s()) {
            return;
        }
        p();
        Map mapM = m();
        if (mapM != null) {
            this.f7429f = com.google.d.l.j.p(size(), 3);
            mapM.clear();
            this.f7428e = null;
            this.f7430g = 0;
            return;
        }
        Arrays.fill(G(), 0, this.f7430g, (Object) null);
        Arrays.fill(H(), 0, this.f7430g, (Object) null);
        Object objB = B();
        if (objB instanceof byte[]) {
            Arrays.fill((byte[]) objB, (byte) 0);
        } else if (objB instanceof short[]) {
            Arrays.fill((short[]) objB, (short) 0);
        } else {
            Arrays.fill((int[]) objB, 0);
        }
        Arrays.fill(F(), 0, this.f7430g, 0);
        this.f7430g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM = m();
        return mapM != null ? mapM.containsKey(obj) : x(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM = m();
        if (mapM != null) {
            return mapM.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.f7430g; i2++) {
            if (Objects.equals(obj, C(i2))) {
                return true;
            }
        }
        return false;
    }

    final int e() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f7432i;
        if (set != null) {
            return set;
        }
        aj ajVar = new aj(this);
        this.f7432i = ajVar;
        return ajVar;
    }

    final int f(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f7430g) {
            return i3;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map mapM = m();
        if (mapM != null) {
            return (V) mapM.get(obj);
        }
        int iX = x(obj);
        if (iX == -1) {
            return null;
        }
        return (V) C(iX);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f7431h;
        if (set != null) {
            return set;
        }
        al alVar = new al(this);
        this.f7431h = alVar;
        return alVar;
    }

    final Iterator l() {
        Map mapM = m();
        return mapM != null ? mapM.entrySet().iterator() : new ah(this);
    }

    final Map m() {
        Object obj = this.f7428e;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void p() {
        this.f7429f += 32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        int i2;
        if (s()) {
            com.google.d.b.an.v(s(), "Arrays already allocated");
            int i3 = this.f7429f;
            int iMax = Math.max(4, fo.X(i3 + 1));
            this.f7428e = fo.ad(iMax);
            D(iMax - 1);
            this.f7425a = new int[i3];
            this.f7426b = new Object[i3];
            this.f7427c = new Object[i3];
        }
        Map mapM = m();
        if (mapM != null) {
            return (V) mapM.put(k2, v);
        }
        int[] iArrF = F();
        Object[] objArrG = G();
        Object[] objArrH = H();
        int i4 = this.f7430g;
        int i5 = i4 + 1;
        int iW = fo.W(k2);
        int iW2 = w();
        int i6 = iW & iW2;
        int iAc = fo.ac(B(), i6);
        if (iAc == 0) {
            if (i5 > iW2) {
                iW2 = y(iW2, fo.aa(iW2), iW, i4);
            } else {
                fo.ae(B(), i6, i5);
            }
            i2 = 1;
        } else {
            int iY = fo.Y(iW, iW2);
            int i7 = 0;
            while (true) {
                int i8 = iAc - 1;
                int i9 = iArrF[i8];
                i2 = 1;
                if (fo.Y(i9, iW2) == iY && Objects.equals(k2, objArrG[i8])) {
                    V v2 = (V) objArrH[i8];
                    objArrH[i8] = v;
                    return v2;
                }
                int i10 = i9 & iW2;
                i7++;
                if (i10 != 0) {
                    iAc = i10;
                } else {
                    if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(w() + 1, 1.0f);
                        int iE = e();
                        while (iE >= 0) {
                            linkedHashMap.put(z(iE), C(iE));
                            iE = f(iE);
                        }
                        this.f7428e = linkedHashMap;
                        this.f7425a = null;
                        this.f7426b = null;
                        this.f7427c = null;
                        p();
                        return (V) linkedHashMap.put(k2, v);
                    }
                    if (i5 > iW2) {
                        iW2 = y(iW2, fo.aa(iW2), iW, i4);
                    } else {
                        iArrF[i8] = fo.Z(i9, i5, iW2);
                    }
                }
            }
        }
        int length = F().length;
        if (i5 > length) {
            int i11 = i2;
            int iMin = Math.min(1073741823, (Math.max(i11, length >>> 1) + length) | i11);
            if (iMin != length) {
                this.f7425a = Arrays.copyOf(F(), iMin);
                this.f7426b = Arrays.copyOf(G(), iMin);
                this.f7427c = Arrays.copyOf(H(), iMin);
            }
        }
        F()[i4] = fo.Z(iW, 0, iW2);
        G()[i4] = k2;
        E(i4, v);
        this.f7430g = i5;
        p();
        return null;
    }

    final void q(int i2) {
        com.google.d.b.an.m(true, "Expected size must be >= 0");
        this.f7429f = com.google.d.l.j.p(i2, 1);
    }

    final void r(int i2, int i3) {
        Object objB = B();
        int[] iArrF = F();
        Object[] objArrG = G();
        Object[] objArrH = H();
        int size = size();
        int i4 = size - 1;
        if (i2 >= i4) {
            objArrG[i2] = null;
            objArrH[i2] = null;
            iArrF[i2] = 0;
            return;
        }
        int i5 = i2 + 1;
        Object obj = objArrG[i4];
        objArrG[i2] = obj;
        objArrH[i2] = objArrH[i4];
        objArrG[i4] = null;
        objArrH[i4] = null;
        iArrF[i2] = iArrF[i4];
        iArrF[i4] = 0;
        int iW = fo.W(obj) & i3;
        int iAc = fo.ac(objB, iW);
        if (iAc == size) {
            fo.ae(objB, iW, i5);
            return;
        }
        while (true) {
            int i6 = iAc - 1;
            int i7 = iArrF[i6];
            int i8 = i7 & i3;
            if (i8 == size) {
                iArrF[i6] = fo.Z(i7, i5, i3);
                return;
            }
            iAc = i8;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map mapM = m();
        if (mapM != null) {
            return (V) mapM.remove(obj);
        }
        V v = (V) A(obj);
        if (v == f7424d) {
            return null;
        }
        return v;
    }

    final boolean s() {
        return this.f7428e == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM = m();
        return mapM != null ? mapM.size() : this.f7430g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f7433j;
        if (collection != null) {
            return collection;
        }
        an anVar = new an(this);
        this.f7433j = anVar;
        return anVar;
    }

    ao(int i2) {
        q(i2);
    }
}
