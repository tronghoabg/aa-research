package defpackage;

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

/* loaded from: classes.dex */
public class ycx<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object a = new Object();
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    public transient int e;
    public transient int f;
    private transient Object g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;

    public ycx() {
        p(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.bp(i, "Invalid size: "));
        }
        p(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator itK = k();
        while (itK.hasNext()) {
            Map.Entry entry = (Map.Entry) itK.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private final int y(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objB = wub.B(i2);
        if (i4 != 0) {
            wub.D(objB, i3 & i5, i4 + 1);
        }
        Object objI = i();
        int[] iArrV = v();
        for (int i6 = 0; i6 <= i; i6++) {
            int iA = wub.A(objI, i6);
            while (iA != 0) {
                int i7 = iA - 1;
                int i8 = iArrV[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iA2 = wub.A(objB, i10);
                wub.D(objB, i10, iA);
                iArrV[i7] = ((~i5) & i9) | (iA2 & i5);
                iA = i8 & i;
            }
        }
        this.g = objB;
        z(i5);
        return i5;
    }

    private final void z(int i) {
        this.e = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.e & (-32));
    }

    public int a(int i, int i2) {
        return i - 1;
    }

    public int b() {
        woy.aa(u(), "Arrays already allocated");
        int i = this.e;
        int iMax = Math.max(4, wub.y(i + 1));
        this.g = wub.B(iMax);
        z(iMax - 1);
        this.b = new int[i];
        this.c = new Object[i];
        this.d = new Object[i];
        return i;
    }

    public int c() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (u()) {
            return;
        }
        o();
        Map mapN = n();
        if (mapN != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            mapN.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(w(), 0, this.f, (Object) null);
        Arrays.fill(x(), 0, this.f, (Object) null);
        wub.C(i());
        Arrays.fill(v(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapN = n();
        return mapN != null ? mapN.containsKey(obj) : f(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapN = n();
        if (mapN != null) {
            return mapN.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (Objects.equals(obj, j(i))) {
                return true;
            }
        }
        return false;
    }

    public int d(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    public final int e() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.i;
        if (set != null) {
            return set;
        }
        ycs ycsVar = new ycs(this);
        this.i = ycsVar;
        return ycsVar;
    }

    public final int f(Object obj) {
        if (u()) {
            return -1;
        }
        int iX = wub.x(obj);
        int iE = e();
        int iA = wub.A(i(), iX & iE);
        if (iA != 0) {
            int i = ~iE;
            int i2 = iX & i;
            do {
                int i3 = iA - 1;
                int i4 = v()[i3];
                if ((i4 & i) == i2 && Objects.equals(obj, g(i3))) {
                    return i3;
                }
                iA = i4 & iE;
            } while (iA != 0);
        }
        return -1;
    }

    public final Object g(int i) {
        return w()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map mapN = n();
        if (mapN != null) {
            return (V) mapN.get(obj);
        }
        int iF = f(obj);
        if (iF == -1) {
            return null;
        }
        return (V) j(iF);
    }

    public final Object h(Object obj) {
        int iE;
        int iZ;
        if (u() || (iZ = wub.z(obj, null, (iE = e()), i(), v(), w(), null)) == -1) {
            return a;
        }
        Object objJ = j(iZ);
        r(iZ, iE);
        this.f--;
        o();
        return objJ;
    }

    public final Object i() {
        Object obj = this.g;
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(int i) {
        return x()[i];
    }

    final Iterator k() {
        Map mapN = n();
        return mapN != null ? mapN.entrySet().iterator() : new ycq(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.h;
        if (set != null) {
            return set;
        }
        ycu ycuVar = new ycu(this);
        this.h = ycuVar;
        return ycuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map l() {
        Map mapM = m(e() + 1);
        int iC = c();
        while (iC >= 0) {
            mapM.put(g(iC), j(iC));
            iC = d(iC);
        }
        this.g = mapM;
        this.b = null;
        this.c = null;
        this.d = null;
        o();
        return mapM;
    }

    public Map m(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    final Map n() {
        Object obj = this.g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void o() {
        this.e += 32;
    }

    public void p(int i) {
        woy.O(i >= 0, "Expected size must be >= 0");
        this.e = Math.min(Math.max(i, 1), 1073741823);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V put(K r20, V r21) {
        /*
            r19 = this;
            r0 = r19
            r2 = r20
            r3 = r21
            boolean r1 = r0.u()
            if (r1 == 0) goto Lf
            r0.b()
        Lf:
            java.util.Map r1 = r0.n()
            if (r1 == 0) goto L1a
            java.lang.Object r0 = r1.put(r2, r3)
            return r0
        L1a:
            int[] r1 = r0.v()
            java.lang.Object[] r4 = r0.w()
            java.lang.Object[] r5 = r0.x()
            r6 = r1
            int r1 = r0.f
            int r7 = r1 + 1
            r8 = r4
            int r4 = defpackage.wub.x(r2)
            int r9 = r0.e()
            r10 = r4 & r9
            java.lang.Object r11 = r0.i()
            int r11 = defpackage.wub.A(r11, r10)
            r14 = 32
            if (r11 != 0) goto L5e
            if (r7 <= r9) goto L54
            int r5 = r9 + 1
            if (r9 >= r14) goto L4a
            r12 = 4
            goto L4b
        L4a:
            r12 = 2
        L4b:
            int r12 = r12 * r5
            int r9 = r0.y(r9, r12, r4, r1)
            r5 = r9
            r18 = 1
            goto La5
        L54:
            java.lang.Object r5 = r0.i()
            defpackage.wub.D(r5, r10, r7)
            r18 = 1
            goto La4
        L5e:
            int r10 = ~r9
            r12 = r4 & r10
            r16 = 0
        L63:
            int r11 = r11 + (-1)
            r17 = r6[r11]
            r13 = r17 & r10
            r18 = 1
            if (r13 != r12) goto L7b
            r15 = r8[r11]
            boolean r15 = j$.util.Objects.equals(r2, r15)
            if (r15 != 0) goto L76
            goto L7b
        L76:
            r0 = r5[r11]
            r5[r11] = r3
            return r0
        L7b:
            r15 = r17 & r9
            int r14 = r16 + 1
            if (r15 != 0) goto Lcc
            r5 = 9
            if (r14 < r5) goto L8e
            java.util.Map r0 = r0.l()
            java.lang.Object r0 = r0.put(r2, r3)
            return r0
        L8e:
            if (r7 <= r9) goto L9f
            int r5 = r9 + 1
            r11 = 32
            if (r9 >= r11) goto L98
            r12 = 4
            goto L99
        L98:
            r12 = 2
        L99:
            int r12 = r12 * r5
            int r9 = r0.y(r9, r12, r4, r1)
            goto La4
        L9f:
            r5 = r7 & r9
            r5 = r5 | r13
            r6[r11] = r5
        La4:
            r5 = r9
        La5:
            int[] r6 = r0.v()
            int r6 = r6.length
            if (r7 <= r6) goto Lc2
            int r8 = r6 >>> 1
            r13 = r18
            int r8 = java.lang.Math.max(r13, r8)
            int r8 = r8 + r6
            r8 = r8 | r13
            r9 = 1073741823(0x3fffffff, float:1.9999999)
            int r8 = java.lang.Math.min(r9, r8)
            if (r8 == r6) goto Lc2
            r0.s(r8)
        Lc2:
            r0.q(r1, r2, r3, r4, r5)
            r0.f = r7
            r0.o()
            r0 = 0
            return r0
        Lcc:
            r2 = r20
            r3 = r21
            r16 = r14
            r11 = r15
            r14 = 32
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ycx.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public void q(int i, Object obj, Object obj2, int i2, int i3) {
        v()[i] = i2 & (~i3);
        w()[i] = obj;
        t(i, obj2);
    }

    public void r(int i, int i2) {
        Object objI = i();
        int[] iArrV = v();
        Object[] objArrW = w();
        Object[] objArrX = x();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrW[i] = null;
            objArrX[i] = null;
            iArrV[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj = objArrW[i3];
        objArrW[i] = obj;
        objArrX[i] = objArrX[i3];
        objArrW[i3] = null;
        objArrX[i3] = null;
        iArrV[i] = iArrV[i3];
        iArrV[i3] = 0;
        int iX = wub.x(obj) & i2;
        int iA = wub.A(objI, iX);
        if (iA == size) {
            wub.D(objI, iX, i4);
            return;
        }
        while (true) {
            int i5 = iA - 1;
            int i6 = iArrV[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrV[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            iA = i7;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map mapN = n();
        if (mapN != null) {
            return (V) mapN.remove(obj);
        }
        V v = (V) h(obj);
        if (v == a) {
            return null;
        }
        return v;
    }

    public void s(int i) {
        this.b = Arrays.copyOf(v(), i);
        this.c = Arrays.copyOf(w(), i);
        this.d = Arrays.copyOf(x(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapN = n();
        return mapN != null ? mapN.size() : this.f;
    }

    public final void t(int i, Object obj) {
        x()[i] = obj;
    }

    final boolean u() {
        return this.g == null;
    }

    public final int[] v() {
        int[] iArr = this.b;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.j;
        if (collection != null) {
            return collection;
        }
        ycw ycwVar = new ycw(this);
        this.j = ycwVar;
        return ycwVar;
    }

    public final Object[] w() {
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr;
    }

    public final Object[] x() {
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr;
    }

    public ycx(int i) {
        p(i);
    }
}
