package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class yey<K, V> extends AbstractMap<K, V> implements Serializable, ycc {
    public transient Object[] a;
    public transient Object[] b;
    public transient int c;
    public transient int d;
    public transient int e;
    public transient int[] f;
    public transient ycc g;
    private transient int[] h;
    private transient int[] i;
    private transient int[] j;
    private transient int[] k;
    private transient int l;
    private transient int[] m;
    private transient Set n;
    private transient Set o;
    private transient Set p;

    public yey() {
        i();
    }

    private final int n(int i) {
        return (this.h.length - 1) & i;
    }

    private final int o(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[n(i)];
        while (i2 != -1) {
            if (Objects.equals(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    private final void p(int i, int i2) {
        woy.N(i != -1);
        int iN = n(i2);
        int[] iArr = this.h;
        int i3 = iArr[iN];
        int[] iArr2 = this.j;
        if (i3 == i) {
            iArr[iN] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = iArr2[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with key ".concat(String.valueOf(String.valueOf(this.a[i]))));
            }
            int[] iArr3 = this.j;
            if (i3 == i) {
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = iArr3[i3];
        }
    }

    private final void q(int i, int i2) {
        woy.N(i != -1);
        int iN = n(i2);
        int[] iArr = this.i;
        int i3 = iArr[iN];
        int[] iArr2 = this.k;
        if (i3 == i) {
            iArr[iN] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = iArr2[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with value ".concat(String.valueOf(String.valueOf(this.b[i]))));
            }
            int[] iArr3 = this.k;
            if (i3 == i) {
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = iArr3[i3];
        }
    }

    private final void r(int i) {
        int length = this.j.length;
        if (length < i) {
            int iF = yff.f(length, i);
            this.a = Arrays.copyOf(this.a, iF);
            this.b = Arrays.copyOf(this.b, iF);
            int[] iArr = this.j;
            int length2 = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iF);
            Arrays.fill(iArrCopyOf, length2, iF, -1);
            this.j = iArrCopyOf;
            int[] iArr2 = this.k;
            int length3 = iArr2.length;
            int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iF);
            Arrays.fill(iArrCopyOf2, length3, iF, -1);
            this.k = iArrCopyOf2;
            int[] iArr3 = this.m;
            int length4 = iArr3.length;
            int[] iArrCopyOf3 = Arrays.copyOf(iArr3, iF);
            Arrays.fill(iArrCopyOf3, length4, iF, -1);
            this.m = iArrCopyOf3;
            int[] iArr4 = this.f;
            int length5 = iArr4.length;
            int[] iArrCopyOf4 = Arrays.copyOf(iArr4, iF);
            Arrays.fill(iArrCopyOf4, length5, iF, -1);
            this.f = iArrCopyOf4;
        }
        if (this.h.length < i) {
            int iY = wub.y(i);
            int[] iArr5 = new int[iY];
            Arrays.fill(iArr5, -1);
            this.h = iArr5;
            int[] iArr6 = new int[iY];
            Arrays.fill(iArr6, -1);
            this.i = iArr6;
            for (int i2 = 0; i2 < this.c; i2++) {
                int iN = n(wub.x(this.a[i2]));
                int[] iArr7 = this.j;
                int[] iArr8 = this.h;
                iArr7[i2] = iArr8[iN];
                iArr8[iN] = i2;
                int iN2 = n(wub.x(this.b[i2]));
                int[] iArr9 = this.k;
                int[] iArr10 = this.i;
                iArr9[i2] = iArr10[iN2];
                iArr10[iN2] = i2;
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        i();
        for (int i2 = 0; i2 < i; i2++) {
            j(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final void s(int i, int i2) {
        if (i == -1) {
            throw new IllegalArgumentException();
        }
        int iN = n(i2);
        int[] iArr = this.j;
        int[] iArr2 = this.h;
        iArr[i] = iArr2[iN];
        iArr2[iN] = i;
    }

    private final void t(int i, int i2) {
        if (i == -1) {
            throw new IllegalArgumentException();
        }
        int iN = n(i2);
        int[] iArr = this.k;
        int[] iArr2 = this.i;
        iArr[i] = iArr2[iN];
        iArr2[iN] = i;
    }

    private final void u(int i, int i2, int i3) {
        int i4;
        int[] iArr;
        int i5;
        int[] iArr2;
        woy.N(i != -1);
        p(i, i2);
        q(i, i3);
        v(this.m[i], this.f[i]);
        int i6 = this.c - 1;
        if (i6 != i) {
            int i7 = this.m[i6];
            int i8 = this.f[i6];
            v(i7, i);
            v(i, i8);
            Object[] objArr = this.a;
            Object obj = objArr[i6];
            Object[] objArr2 = this.b;
            Object obj2 = objArr2[i6];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int iN = n(wub.x(obj));
            int[] iArr3 = this.h;
            int i9 = iArr3[iN];
            if (i9 == i6) {
                iArr3[iN] = i;
            } else {
                int i10 = this.j[i9];
                while (true) {
                    i4 = i9;
                    i9 = i10;
                    iArr = this.j;
                    if (i9 == i6) {
                        break;
                    } else {
                        i10 = iArr[i9];
                    }
                }
                iArr[i4] = i;
            }
            int[] iArr4 = this.j;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
            int iN2 = n(wub.x(obj2));
            int[] iArr5 = this.i;
            int i11 = iArr5[iN2];
            if (i11 == i6) {
                iArr5[iN2] = i;
            } else {
                int i12 = this.k[i11];
                while (true) {
                    i5 = i11;
                    i11 = i12;
                    iArr2 = this.k;
                    if (i11 == i6) {
                        break;
                    } else {
                        i12 = iArr2[i11];
                    }
                }
                iArr2[i5] = i;
            }
            int[] iArr6 = this.k;
            iArr6[i] = iArr6[i6];
            iArr6[i6] = -1;
        }
        Object[] objArr3 = this.a;
        int i13 = this.c - 1;
        objArr3[i13] = null;
        this.b[i13] = null;
        this.c = i13;
        this.d++;
    }

    private final void v(int i, int i2) {
        if (i == -2) {
            this.e = i2;
        } else {
            this.f[i] = i2;
        }
        if (i2 == -2) {
            this.l = i;
        } else {
            this.m[i2] = i;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.c);
        for (Map.Entry<K, V> entry : entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // defpackage.ycc
    public final ycc a() {
        ycc yccVar = this.g;
        if (yccVar != null) {
            return yccVar;
        }
        yes yesVar = new yes(this);
        this.g = yesVar;
        return yesVar;
    }

    public final int b(Object obj) {
        return c(obj, wub.x(obj));
    }

    public final int c(Object obj, int i) {
        return o(obj, i, this.h, this.j, this.a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, (Object) null);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.i, -1);
        Arrays.fill(this.j, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.m, 0, this.c, -1);
        Arrays.fill(this.f, 0, this.c, -1);
        this.c = 0;
        this.e = -2;
        this.l = -2;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return d(obj) != -1;
    }

    public final int d(Object obj) {
        return e(obj, wub.x(obj));
    }

    public final int e(Object obj, int i) {
        return o(obj, i, this.i, this.k, this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.p;
        if (set != null) {
            return set;
        }
        yer yerVar = new yer(this);
        this.p = yerVar;
        return yerVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Set values() {
        Set set = this.o;
        if (set != null) {
            return set;
        }
        yev yevVar = new yev(this);
        this.o = yevVar;
        return yevVar;
    }

    public final void g(int i, int i2) {
        u(i, i2, wub.x(this.b[i]));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        int iB = b(obj);
        if (iB == -1) {
            return null;
        }
        return (V) this.b[iB];
    }

    public final void h(int i, int i2) {
        u(i, wub.x(this.a[i]), i2);
    }

    final void i() {
        int iY = wub.y(16);
        this.c = 0;
        this.a = new Object[16];
        this.b = new Object[16];
        int[] iArr = new int[iY];
        Arrays.fill(iArr, -1);
        this.h = iArr;
        int[] iArr2 = new int[iY];
        Arrays.fill(iArr2, -1);
        this.i = iArr2;
        int[] iArr3 = new int[16];
        Arrays.fill(iArr3, -1);
        this.j = iArr3;
        int[] iArr4 = new int[16];
        Arrays.fill(iArr4, -1);
        this.k = iArr4;
        this.e = -2;
        this.l = -2;
        int[] iArr5 = new int[16];
        Arrays.fill(iArr5, -1);
        this.m = iArr5;
        int[] iArr6 = new int[16];
        Arrays.fill(iArr6, -1);
        this.f = iArr6;
    }

    public final Object j(Object obj, Object obj2) {
        int iX = wub.x(obj);
        int iC = c(obj, iX);
        if (iC != -1) {
            Object obj3 = this.b[iC];
            if (Objects.equals(obj3, obj2)) {
                return obj2;
            }
            m(iC, obj2);
            return obj3;
        }
        int iX2 = wub.x(obj2);
        woy.S(e(obj2, iX2) == -1, "Value already present: %s", obj2);
        r(this.c + 1);
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = obj;
        this.b[i] = obj2;
        s(i, iX);
        t(this.c, iX2);
        v(this.l, this.c);
        v(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    public final Object k(Object obj, Object obj2) {
        int iX = wub.x(obj);
        int iE = e(obj, iX);
        if (iE != -1) {
            Object obj3 = this.a[iE];
            if (Objects.equals(obj3, obj2)) {
                return obj2;
            }
            l(iE, obj2);
            return obj3;
        }
        int i = this.l;
        int iX2 = wub.x(obj2);
        woy.S(c(obj2, iX2) == -1, "Key already present: %s", obj2);
        r(this.c + 1);
        Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = obj2;
        this.b[i2] = obj;
        s(i2, iX2);
        t(this.c, iX);
        int i3 = i == -2 ? this.e : this.f[i];
        v(i, this.c);
        v(this.c, i3);
        this.c++;
        this.d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.n;
        if (set != null) {
            return set;
        }
        yeu yeuVar = new yeu(this);
        this.n = yeuVar;
        return yeuVar;
    }

    public final void l(int i, Object obj) {
        woy.N(i != -1);
        int iC = c(obj, wub.x(obj));
        int i2 = this.l;
        if (iC != -1) {
            throw new IllegalArgumentException("Key already present in map: ".concat(String.valueOf(String.valueOf(obj))));
        }
        if (i2 == i) {
            i2 = this.m[i];
        } else if (i2 == this.c) {
            i2 = iC;
        }
        if (i == -2) {
            iC = this.f[-2];
        } else if (this.c != -2) {
            iC = -2;
        }
        v(this.m[i], this.f[i]);
        p(i, wub.x(this.a[i]));
        this.a[i] = obj;
        s(i, wub.x(obj));
        v(i2, i);
        v(i, iC);
    }

    public final void m(int i, Object obj) {
        woy.N(i != -1);
        int iX = wub.x(obj);
        if (e(obj, iX) != -1) {
            throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(String.valueOf(obj))));
        }
        q(i, wub.x(this.b[i]));
        this.b[i] = obj;
        t(i, iX);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        return (V) j(k, v);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        int iX = wub.x(obj);
        int iC = c(obj, iX);
        if (iC == -1) {
            return null;
        }
        V v = (V) this.b[iC];
        g(iC, iX);
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }
}
