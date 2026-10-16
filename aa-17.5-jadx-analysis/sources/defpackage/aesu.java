package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiFunction;

/* loaded from: classes3.dex */
public final class aesu<K, V> extends aeqp<K, V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    public transient Object[] a;
    public transient Object[] b;
    public transient int c;
    public transient boolean d;
    public transient int e;
    public transient int f;
    public transient long[] g;
    public transient int h;
    public transient int i;
    protected final transient int j;
    public int k;
    protected transient aeur l;
    protected transient aetv m;
    protected transient aesr n;

    public aesu(byte[] bArr) {
        this.e = -1;
        this.f = -1;
        int iP = adqs.p(16, 0.75f);
        this.h = iP;
        this.j = iP;
        this.c = iP - 1;
        this.i = adqs.q(iP, 0.75f);
        int i = this.h + 1;
        this.a = new Object[i];
        this.b = new Object[i];
        this.g = new long[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        Object[] objArr;
        objectInputStream.defaultReadObject();
        int iP = adqs.p(this.k, 0.75f);
        this.h = iP;
        this.i = adqs.q(iP, 0.75f);
        int i2 = this.h;
        this.c = i2 - 1;
        boolean z = true;
        int i3 = i2 + 1;
        Object[] objArr2 = new Object[i3];
        this.a = objArr2;
        Object[] objArr3 = new Object[i3];
        this.b = objArr3;
        long[] jArr = new long[i3];
        this.g = jArr;
        this.f = -1;
        this.e = -1;
        int i4 = this.k;
        int i5 = -1;
        while (true) {
            int i6 = i4 - 1;
            if (i4 == 0) {
                break;
            }
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            if (object != null) {
                int iHashCode = object.hashCode() * (-1640531527);
                int i7 = this.c;
                int i8 = iHashCode ^ (iHashCode >>> 16);
                while (true) {
                    i = i8 & i7;
                    if (objArr2[i] == null) {
                        break;
                    }
                    i8 = i + 1;
                    i7 = this.c;
                }
            } else {
                i = this.h;
                this.d = z;
            }
            objArr2[i] = object;
            objArr3[i] = object2;
            if (this.e != -1) {
                long j = jArr[i5];
                objArr = objArr2;
                jArr[i5] = (((i & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[i];
                jArr[i] = j2 ^ ((((i5 & 4294967295L) << 32) ^ j2) & (-4294967296L));
            } else {
                objArr = objArr2;
                this.e = i;
                jArr[i] = jArr[i] | (-4294967296L);
            }
            i4 = i6;
            objArr2 = objArr;
            i5 = i;
            z = true;
        }
        this.f = i5;
        if (i5 != -1) {
            jArr[i5] = jArr[i5] | 4294967295L;
        }
    }

    private final int u(Object obj) {
        Object obj2;
        if (obj == null) {
            boolean z = this.d;
            int i = this.h;
            return z ? i : -(i + 1);
        }
        Object[] objArr = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & this.c;
        Object obj3 = objArr[i2];
        if (obj3 == null) {
            return -(i2 + 1);
        }
        if (!obj.equals(obj3)) {
            do {
                i2 = (i2 + 1) & this.c;
                obj2 = objArr[i2];
                if (obj2 == null) {
                    return -(i2 + 1);
                }
            } while (!obj.equals(obj2));
        }
        return i2;
    }

    private final void v(int i, Object obj, Object obj2) {
        if (i == this.h) {
            this.d = true;
        }
        this.a[i] = obj;
        this.b[i] = obj2;
        int i2 = this.k;
        if (i2 == 0) {
            this.f = i;
            this.e = i;
            this.g[i] = -1;
        } else {
            long[] jArr = this.g;
            int i3 = this.f;
            long j = jArr[i3];
            jArr[i3] = j ^ (((i & 4294967295L) ^ j) & 4294967295L);
            jArr[i] = ((i3 & 4294967295L) << 32) | 4294967295L;
            this.f = i;
        }
        this.k = i2 + 1;
        if (i2 >= this.i) {
            o(adqs.p(i2 + 2, 0.75f));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        aeso aesoVar = new aeso(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.k; i != 0; i--) {
            int iC = aesoVar.c();
            objectOutputStream.writeObject(objArr[iC]);
            objectOutputStream.writeObject(objArr2[iC]);
        }
    }

    @Override // defpackage.aeqo
    /* renamed from: a */
    public final aetv values() {
        if (this.m == null) {
            this.m = new aesn(this);
        }
        return this.m;
    }

    @Override // defpackage.aeqo
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ aeum keySet() {
        return keySet();
    }

    @Override // defpackage.aeqo, defpackage.aesy, java.util.Map
    public final void clear() {
        if (this.k == 0) {
            return;
        }
        this.k = 0;
        this.d = false;
        Arrays.fill(this.a, (Object) null);
        Arrays.fill(this.b, (Object) null);
        this.f = -1;
        this.e = -1;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return null;
    }

    @Override // defpackage.aeqo, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        biFunction.getClass();
        int iU = u(obj);
        Object objApply = biFunction.apply(obj, iU >= 0 ? this.b[iU] : null);
        if (objApply == null) {
            if (iU >= 0) {
                if (obj == null) {
                    j();
                } else {
                    i(iU);
                }
            }
            return null;
        }
        if (iU < 0) {
            v((-iU) - 1, obj, objApply);
            return objApply;
        }
        this.b[iU] = objApply;
        return objApply;
    }

    @Override // defpackage.aeqo, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object obj2;
        biFunction.getClass();
        int iU = u(obj);
        if (iU < 0 || (obj2 = this.b[iU]) == null) {
            return null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply != null) {
            this.b[iU] = objApply;
            return objApply;
        }
        if (obj == null) {
            j();
            return null;
        }
        i(iU);
        return null;
    }

    @Override // defpackage.aeqo, defpackage.aeqn, defpackage.aeee
    public final boolean containsKey(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.d;
        }
        Object[] objArr = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & this.c;
        Object obj3 = objArr[i];
        if (obj3 == null) {
            return false;
        }
        if (!obj.equals(obj3)) {
            do {
                i = (i + 1) & this.c;
                obj2 = objArr[i];
                if (obj2 == null) {
                    return false;
                }
            } while (!obj.equals(obj2));
        }
        return true;
    }

    @Override // defpackage.aeqo, java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        if (this.d && Objects.equals(objArr2[this.h], obj)) {
            return true;
        }
        int i = this.h;
        while (i != 0) {
            i--;
            if (objArr[i] != null && Objects.equals(objArr2[i], obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aeqp
    /* renamed from: f */
    public final aeur keySet() {
        if (this.l == null) {
            this.l = new aesq(this);
        }
        return this.l;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        if (this.k != 0) {
            return this.a[this.e];
        }
        throw new NoSuchElementException();
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final aesu clone() {
        try {
            aesu aesuVar = (aesu) super.clone();
            aesuVar.l = null;
            aesuVar.m = null;
            aesuVar.n = null;
            aesuVar.d = this.d;
            aesuVar.a = (Object[]) this.a.clone();
            aesuVar.b = (Object[]) this.b.clone();
            aesuVar.g = (long[]) this.g.clone();
            return aesuVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.aesk, defpackage.aeee
    public final V get(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.d) {
                return (V) this.b[this.h];
            }
            return null;
        }
        Object[] objArr = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & this.c;
        Object obj3 = objArr[i];
        if (obj3 == null) {
            return null;
        }
        if (obj.equals(obj3)) {
            return (V) this.b[i];
        }
        do {
            i = (i + 1) & this.c;
            obj2 = objArr[i];
            if (obj2 == null) {
                return null;
            }
        } while (!obj.equals(obj2));
        return (V) this.b[i];
    }

    @Override // defpackage.aeqo, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3;
        if (obj != null) {
            Object[] objArr = this.a;
            int iHashCode = obj.hashCode() * (-1640531527);
            int i = (iHashCode ^ (iHashCode >>> 16)) & this.c;
            Object obj4 = objArr[i];
            if (obj4 != null) {
                if (obj.equals(obj4)) {
                    return this.b[i];
                }
                do {
                    i = (i + 1) & this.c;
                    obj3 = objArr[i];
                    if (obj3 != null) {
                    }
                } while (!obj.equals(obj3));
                return this.b[i];
            }
        } else if (this.d) {
            return this.b[this.h];
        }
        return obj2;
    }

    @Override // defpackage.aeqo, java.util.Map
    public final int hashCode() {
        Object obj;
        int i;
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        boolean z = this.d;
        int i2 = this.k;
        if (z) {
            i2--;
        }
        int i3 = 0;
        int i4 = 0;
        int iHashCode = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 == 0) {
                break;
            }
            while (true) {
                obj = objArr[i3];
                i = i3 + 1;
                if (obj != null) {
                    break;
                }
                i3 = i;
            }
            if (this != obj) {
                iHashCode = obj.hashCode();
            }
            Object obj2 = objArr2[i3];
            if (this != obj2) {
                iHashCode = (obj2 == null ? 0 : obj2.hashCode()) ^ iHashCode;
            }
            i4 += iHashCode;
            i2 = i5;
            i3 = i;
        }
        if (!this.d) {
            return i4;
        }
        Object obj3 = objArr2[this.h];
        return i4 + (obj3 != null ? obj3.hashCode() : 0);
    }

    @Override // defpackage.aeqp, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return q();
    }

    public final Object i(int i) {
        Object obj;
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = null;
        this.k--;
        l(i);
        Object[] objArr2 = this.a;
        Object[] objArr3 = this.b;
        loop0: while (true) {
            int i2 = (i + 1) & this.c;
            while (true) {
                obj = objArr2[i2];
                if (obj == null) {
                    break loop0;
                }
                int iHashCode = obj.hashCode() * (-1640531527);
                int i3 = this.c;
                int i4 = (iHashCode ^ (iHashCode >>> 16)) & i3;
                if (i <= i2) {
                    if (i >= i4 || i4 > i2) {
                        break;
                    }
                    i2 = (i2 + 1) & i3;
                } else if (i < i4 || i4 <= i2) {
                    i2 = (i2 + 1) & i3;
                }
            }
            objArr2[i] = obj;
            objArr3[i] = objArr3[i2];
            m(i2, i);
            i = i2;
        }
        objArr2[i] = null;
        objArr3[i] = null;
        int i5 = this.h;
        if (i5 > this.j && this.k < this.i / 4 && i5 > 16) {
            o(i5 >> 1);
        }
        return obj2;
    }

    @Override // defpackage.aeqo, java.util.Map
    public final boolean isEmpty() {
        return this.k == 0;
    }

    public final Object j() {
        this.d = false;
        Object[] objArr = this.a;
        int i = this.h;
        objArr[i] = null;
        Object[] objArr2 = this.b;
        Object obj = objArr2[i];
        objArr2[i] = null;
        this.k--;
        l(i);
        int i2 = this.h;
        if (i2 > this.j && this.k < this.i / 4 && i2 > 16) {
            o(i2 >> 1);
        }
        return obj;
    }

    public final Object k(int i, Object obj) {
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // defpackage.aeqp, defpackage.aeqo, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    protected final void l(int i) {
        if (this.k == 0) {
            this.f = -1;
            this.e = -1;
            return;
        }
        if (this.e == i) {
            long[] jArr = this.g;
            int i2 = (int) jArr[i];
            this.e = i2;
            if (i2 >= 0) {
                jArr[i2] = (-4294967296L) | jArr[i2];
                return;
            }
            return;
        }
        int i3 = this.f;
        long[] jArr2 = this.g;
        if (i3 == i) {
            int i4 = (int) (jArr2[i] >>> 32);
            this.f = i4;
            if (i4 >= 0) {
                jArr2[i4] = jArr2[i4] | 4294967295L;
                return;
            }
            return;
        }
        long j = jArr2[i];
        int i5 = (int) j;
        int i6 = (int) (j >>> 32);
        long j2 = jArr2[i6];
        jArr2[i6] = (4294967295L & ((j & 4294967295L) ^ j2)) ^ j2;
        long j3 = jArr2[i5];
        jArr2[i5] = (((j & (-4294967296L)) ^ j3) & (-4294967296L)) ^ j3;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        if (this.k != 0) {
            return this.a[this.f];
        }
        throw new NoSuchElementException();
    }

    protected final void m(int i, int i2) {
        if (this.k == 1) {
            this.f = i2;
            this.e = i2;
            this.g[i2] = -1;
            return;
        }
        long j = i2 & 4294967295L;
        if (this.e == i) {
            this.e = i2;
            long[] jArr = this.g;
            int i3 = (int) jArr[i];
            long j2 = jArr[i3];
            jArr[i3] = (((j << 32) ^ j2) & (-4294967296L)) ^ j2;
            jArr[i2] = jArr[i];
            return;
        }
        if (this.f == i) {
            this.f = i2;
            long[] jArr2 = this.g;
            int i4 = (int) (jArr2[i] >>> 32);
            long j3 = jArr2[i4];
            jArr2[i4] = ((j ^ j3) & 4294967295L) ^ j3;
            jArr2[i2] = jArr2[i];
            return;
        }
        long j4 = j << 32;
        long[] jArr3 = this.g;
        long j5 = jArr3[i];
        int i5 = (int) j5;
        int i6 = (int) (j5 >>> 32);
        long j6 = jArr3[i6];
        jArr3[i6] = ((j ^ j6) & 4294967295L) ^ j6;
        long j7 = jArr3[i5];
        jArr3[i5] = j7 ^ ((j7 ^ j4) & (-4294967296L));
        jArr3[i2] = j5;
    }

    @Override // defpackage.aeqo, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object obj3;
        biFunction.getClass();
        obj2.getClass();
        int iU = u(obj);
        if (iU < 0 || (obj3 = this.b[iU]) == null) {
            if (iU < 0) {
                v((-iU) - 1, obj, obj2);
                return obj2;
            }
            this.b[iU] = obj2;
            return obj2;
        }
        Object objApply = biFunction.apply(obj3, obj2);
        if (objApply != null) {
            this.b[iU] = objApply;
            return objApply;
        }
        if (obj == null) {
            j();
            return null;
        }
        i(iU);
        return null;
    }

    public final void n(int i) {
        int i2;
        if (this.k == 1 || (i2 = this.f) == i) {
            return;
        }
        int i3 = this.e;
        long[] jArr = this.g;
        if (i3 == i) {
            int i4 = (int) jArr[i];
            this.e = i4;
            jArr[i4] = (-4294967296L) | jArr[i4];
        } else {
            long j = jArr[i];
            int i5 = (int) j;
            int i6 = (int) (j >>> 32);
            long j2 = jArr[i6];
            jArr[i6] = j2 ^ (((j & 4294967295L) ^ j2) & 4294967295L);
            long j3 = jArr[i5];
            jArr[i5] = ((-4294967296L) & ((j & (-4294967296L)) ^ j3)) ^ j3;
        }
        long j4 = jArr[i2];
        jArr[i2] = j4 ^ (((i & 4294967295L) ^ j4) & 4294967295L);
        jArr[i] = ((i2 & 4294967295L) << 32) | 4294967295L;
        this.f = i;
    }

    public final void o(int i) {
        int i2;
        int i3;
        Object[] objArr;
        Object[] objArr2;
        int i4 = i + 1;
        Object[] objArr3 = this.a;
        Object[] objArr4 = this.b;
        Object[] objArr5 = new Object[i4];
        Object[] objArr6 = new Object[i4];
        int i5 = this.e;
        long[] jArr = this.g;
        long[] jArr2 = new long[i4];
        this.e = -1;
        int i6 = this.k;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            i2 = i - 1;
            int i9 = i6 - 1;
            if (i6 == 0) {
                break;
            }
            Object obj = objArr3[i5];
            if (obj != null) {
                int iHashCode = obj.hashCode() * (-1640531527);
                int i10 = iHashCode ^ (iHashCode >>> 16);
                while (true) {
                    i3 = i10 & i2;
                    if (objArr5[i3] == null) {
                        break;
                    } else {
                        i10 = i3 + 1;
                    }
                }
            } else {
                i3 = i;
            }
            objArr5[i3] = objArr3[i5];
            objArr6[i3] = objArr4[i5];
            if (i8 != -1) {
                long j = jArr2[i7];
                objArr = objArr3;
                objArr2 = objArr4;
                jArr2[i7] = (((i3 & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr2[i3];
                jArr2[i3] = j2 ^ ((((i7 & 4294967295L) << 32) ^ j2) & (-4294967296L));
            } else {
                objArr = objArr3;
                objArr2 = objArr4;
                this.e = i3;
                jArr2[i3] = -1;
            }
            i8 = i5;
            i7 = i3;
            i6 = i9;
            objArr4 = objArr2;
            i5 = (int) jArr[i5];
            objArr3 = objArr;
        }
        this.g = jArr2;
        this.f = i7;
        if (i7 != -1) {
            jArr2[i7] = jArr2[i7] | 4294967295L;
        }
        this.h = i;
        this.c = i2;
        this.i = adqs.q(i, 0.75f);
        this.a = objArr5;
        this.b = objArr6;
    }

    @Override // defpackage.aetm
    /* renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final aesr h() {
        aesr aesrVar = this.n;
        if (aesrVar != null) {
            return aesrVar;
        }
        aesr aesrVar2 = new aesr(this);
        this.n = aesrVar2;
        return aesrVar2;
    }

    @Override // defpackage.aeqo, defpackage.aesy, java.util.Map
    public final V put(K k, V v) {
        int iU = u(k);
        if (iU < 0) {
            v((-iU) - 1, k, v);
            return null;
        }
        Object[] objArr = this.b;
        V v2 = (V) objArr[iU];
        objArr[iU] = v;
        return v2;
    }

    @Override // defpackage.aeqo, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil((this.k + map.size()) / 0.75f)) - 1))));
        if (iMin > this.h) {
            o(iMin);
        }
        super.putAll(map);
    }

    @Override // defpackage.aeqo, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        int iU = u(obj);
        if (iU >= 0) {
            return this.b[iU];
        }
        v((-iU) - 1, obj, obj2);
        return null;
    }

    @Override // defpackage.aetm
    public final aetm q() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aetm
    public final aetm r() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aeqo, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        if (obj == null) {
            if (!this.d || !Objects.equals(obj2, this.b[this.h])) {
                return false;
            }
            j();
            return true;
        }
        Object[] objArr = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & this.c;
        Object obj3 = objArr[i];
        if (obj3 == null) {
            return false;
        }
        if (obj.equals(obj3) && Objects.equals(obj2, this.b[i])) {
            i(i);
            return true;
        }
        while (true) {
            i = (i + 1) & this.c;
            Object obj4 = objArr[i];
            if (obj4 == null) {
                return false;
            }
            if (obj.equals(obj4) && Objects.equals(obj2, this.b[i])) {
                i(i);
                return true;
            }
        }
    }

    @Override // defpackage.aeqo, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iU = u(obj);
        if (iU < 0 || !Objects.equals(obj2, this.b[iU])) {
            return false;
        }
        this.b[iU] = obj3;
        return true;
    }

    @Override // defpackage.aetm
    public final aetm s() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aeqn, defpackage.aeee
    public final int size() {
        return this.k;
    }

    @Override // defpackage.aeqp, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return r();
    }

    public final void t(int i) {
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(i / 0.75f)) - 1));
        if (iNumberOfLeadingZeros >= this.h || this.k > adqs.q(iNumberOfLeadingZeros, 0.75f)) {
            return;
        }
        try {
            o(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    @Override // defpackage.aeqp, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return s();
    }

    @Override // defpackage.aeqp, defpackage.aeqo, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    @Override // defpackage.aeqo, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        int iU = u(obj);
        if (iU < 0) {
            return null;
        }
        Object[] objArr = this.b;
        Object obj3 = objArr[iU];
        objArr[iU] = obj2;
        return obj3;
    }

    public aesu() {
        throw null;
    }

    @Override // defpackage.aeqo, defpackage.aesy, java.util.Map
    public final V remove(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.d) {
                return (V) j();
            }
            return null;
        }
        Object[] objArr = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & this.c;
        Object obj3 = objArr[i];
        if (obj3 == null) {
            return null;
        }
        if (!obj.equals(obj3)) {
            do {
                i = (i + 1) & this.c;
                obj2 = objArr[i];
                if (obj2 == null) {
                    return null;
                }
            } while (!obj.equals(obj2));
            return (V) i(i);
        }
        return (V) i(i);
    }
}
