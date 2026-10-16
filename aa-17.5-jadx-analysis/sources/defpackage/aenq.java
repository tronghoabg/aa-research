package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aenq<V> extends aela<V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    public transient long[] a;
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
    protected transient aeqb l;
    protected transient aetv m;
    protected transient aenn n;

    public aenq(byte[] bArr) {
        this.e = -1;
        this.f = -1;
        int iP = adqs.p(16, 0.75f);
        this.h = iP;
        this.j = iP;
        this.c = iP - 1;
        this.i = adqs.q(iP, 0.75f);
        int i = this.h + 1;
        this.a = new long[i];
        this.b = new Object[i];
        this.g = new long[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long[] jArr;
        int i;
        objectInputStream.defaultReadObject();
        int iP = adqs.p(this.k, 0.75f);
        this.h = iP;
        this.i = adqs.q(iP, 0.75f);
        int i2 = this.h;
        this.c = i2 - 1;
        boolean z = true;
        int i3 = i2 + 1;
        long[] jArr2 = new long[i3];
        this.a = jArr2;
        Object[] objArr = new Object[i3];
        this.b = objArr;
        long[] jArr3 = new long[i3];
        this.g = jArr3;
        this.f = -1;
        this.e = -1;
        int i4 = this.k;
        int i5 = -1;
        while (true) {
            int i6 = i4 - 1;
            if (i4 == 0) {
                break;
            }
            long j = objectInputStream.readLong();
            Object object = objectInputStream.readObject();
            long j2 = 0;
            if (j == 0) {
                i = this.h;
                this.d = z;
                jArr = jArr2;
            } else {
                long j3 = (-7046029254386353131L) * j;
                long j4 = j3 ^ (j3 >>> 32);
                jArr = jArr2;
                int i7 = ((int) (j4 ^ (j4 >>> 16))) & this.c;
                while (jArr[i7] != 0) {
                    i7 = (i7 + 1) & this.c;
                }
                j2 = j;
                i = i7;
            }
            jArr[i] = j2;
            objArr[i] = object;
            if (this.e != -1) {
                long j5 = jArr3[i5];
                jArr3[i5] = j5 ^ (((i & 4294967295L) ^ j5) & 4294967295L);
                long j6 = jArr3[i];
                jArr3[i] = j6 ^ ((((i5 & 4294967295L) << 32) ^ j6) & (-4294967296L));
            } else {
                this.e = i;
                jArr3[i] = jArr3[i] | (-4294967296L);
            }
            i4 = i6;
            i5 = i;
            jArr2 = jArr;
            z = true;
        }
        this.f = i5;
        if (i5 != -1) {
            jArr3[i5] = jArr3[i5] | 4294967295L;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        long[] jArr = this.a;
        Object[] objArr = this.b;
        aeni aeniVar = new aeni(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.k; i != 0; i--) {
            int iG = aeniVar.g();
            objectOutputStream.writeLong(jArr[iG]);
            objectOutputStream.writeObject(objArr[iG]);
        }
    }

    public final void A(int i) {
        int i2;
        int i3;
        long[] jArr;
        Object[] objArr;
        int i4 = i + 1;
        long[] jArr2 = this.a;
        Object[] objArr2 = this.b;
        long[] jArr3 = new long[i4];
        Object[] objArr3 = new Object[i4];
        int i5 = this.e;
        long[] jArr4 = this.g;
        long[] jArr5 = new long[i4];
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
            long j = jArr2[i5];
            if (j != 0) {
                long j2 = j * (-7046029254386353131L);
                long j3 = j2 ^ (j2 >>> 32);
                int i10 = (int) (j3 ^ (j3 >>> 16));
                while (true) {
                    i3 = i10 & i2;
                    if (jArr3[i3] == 0) {
                        break;
                    } else {
                        i10 = i3 + 1;
                    }
                }
            } else {
                i3 = i;
            }
            jArr3[i3] = jArr2[i5];
            objArr3[i3] = objArr2[i5];
            if (i8 != -1) {
                long j4 = jArr5[i7];
                jArr = jArr2;
                objArr = objArr2;
                jArr5[i7] = (((i3 & 4294967295L) ^ j4) & 4294967295L) ^ j4;
                long j5 = jArr5[i3];
                jArr5[i3] = j5 ^ ((((i7 & 4294967295L) << 32) ^ j5) & (-4294967296L));
            } else {
                jArr = jArr2;
                objArr = objArr2;
                this.e = i3;
                jArr5[i3] = -1;
            }
            i8 = i5;
            i7 = i3;
            objArr2 = objArr;
            i5 = (int) jArr4[i5];
            jArr2 = jArr;
            i6 = i9;
        }
        this.g = jArr5;
        this.f = i7;
        if (i7 != -1) {
            jArr5[i7] = jArr5[i7] | 4294967295L;
        }
        this.h = i;
        this.c = i2;
        this.i = adqs.q(i, 0.75f);
        this.a = jArr3;
        this.b = objArr3;
    }

    @Override // defpackage.aenv
    /* renamed from: B, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final aenn t() {
        aenn aennVar = this.n;
        if (aennVar != null) {
            return aennVar;
        }
        aenn aennVar2 = new aenn(this);
        this.n = aennVar2;
        return aennVar2;
    }

    @Override // defpackage.aenv
    public final aenv C() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aenv
    public final aenv D() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aenv
    public final aenv E() {
        throw new UnsupportedOperationException();
    }

    public final void F(int i) {
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(i / 0.75f)) - 1));
        if (iNumberOfLeadingZeros >= this.h || this.k > adqs.q(iNumberOfLeadingZeros, 0.75f)) {
            return;
        }
        try {
            A(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    @Override // defpackage.aeky, defpackage.aene
    public final Object a(long j, Object obj) {
        int i;
        long j2;
        if (j != 0) {
            long[] jArr = this.a;
            long j3 = (-7046029254386353131L) * j;
            long j4 = j3 ^ (j3 >>> 32);
            int i2 = this.c & ((int) (j4 ^ (j4 >>> 16)));
            long j5 = jArr[i2];
            if (j5 == 0) {
                i = -(i2 + 1);
                break;
            }
            if (j != j5) {
                do {
                    i2 = (i2 + 1) & this.c;
                    j2 = jArr[i2];
                    if (j2 == 0) {
                        i = -(i2 + 1);
                        break;
                    }
                } while (j != j2);
            }
            i = i2;
        } else {
            boolean z = this.d;
            i = this.h;
            if (!z) {
                i = -(i + 1);
            }
        }
        if (i >= 0) {
            Object[] objArr = this.b;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }
        int i3 = (-i) - 1;
        if (i3 == this.h) {
            this.d = true;
        }
        this.a[i3] = j;
        this.b[i3] = obj;
        int i4 = this.k;
        if (i4 == 0) {
            this.f = i3;
            this.e = i3;
            this.g[i3] = -1;
        } else {
            long[] jArr2 = this.g;
            int i5 = this.f;
            long j6 = jArr2[i5];
            jArr2[i5] = j6 ^ (((i3 & 4294967295L) ^ j6) & 4294967295L);
            jArr2[i3] = ((i5 & 4294967295L) << 32) | 4294967295L;
            this.f = i3;
        }
        this.k = i4 + 1;
        if (i4 < this.i) {
            return null;
        }
        A(adqs.p(i4 + 2, 0.75f));
        return null;
    }

    @Override // defpackage.aeky, defpackage.aene
    public final Object b(long j) {
        long j2;
        if (j == 0) {
            if (this.d) {
                return v();
            }
            return null;
        }
        long[] jArr = this.a;
        long j3 = (-7046029254386353131L) * j;
        long j4 = j3 ^ (j3 >>> 32);
        int i = this.c & ((int) (j4 ^ (j4 >>> 16)));
        long j5 = jArr[i];
        if (j5 == 0) {
            return null;
        }
        if (j == j5) {
            return u(i);
        }
        do {
            i = (i + 1) & this.c;
            j2 = jArr[i];
            if (j2 == 0) {
                return null;
            }
        } while (j != j2);
        return u(i);
    }

    @Override // defpackage.aekz, defpackage.aeky, defpackage.aene
    public final boolean c(long j) {
        long j2;
        if (j == 0) {
            return this.d;
        }
        long[] jArr = this.a;
        long j3 = (-7046029254386353131L) * j;
        long j4 = j3 ^ (j3 >>> 32);
        int i = this.c & ((int) (j4 ^ (j4 >>> 16)));
        long j5 = jArr[i];
        if (j5 == 0) {
            return false;
        }
        if (j != j5) {
            do {
                i = (i + 1) & this.c;
                j2 = jArr[i];
                if (j2 == 0) {
                    return false;
                }
            } while (j != j2);
        }
        return true;
    }

    @Override // defpackage.aekz, defpackage.aens, java.util.Map
    public final void clear() {
        if (this.k == 0) {
            return;
        }
        this.k = 0;
        this.d = false;
        Arrays.fill(this.a, 0L);
        Arrays.fill(this.b, (Object) null);
        this.f = -1;
        this.e = -1;
    }

    @Override // defpackage.aela, java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator<? super Long> comparator() {
        return null;
    }

    @Override // defpackage.aekz, java.util.Map
    public final boolean containsValue(Object obj) {
        long[] jArr = this.a;
        Object[] objArr = this.b;
        if (this.d && Objects.equals(objArr[this.h], obj)) {
            return true;
        }
        int i = this.h;
        while (i != 0) {
            i--;
            if (jArr[i] != 0 && Objects.equals(objArr[i], obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aekz
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ aepx keySet() {
        return keySet();
    }

    @Override // defpackage.aekz
    /* renamed from: e */
    public final aetv values() {
        if (this.m == null) {
            this.m = new aenh(this);
        }
        return this.m;
    }

    @Override // defpackage.aekz, java.util.Map
    public final int hashCode() {
        long j;
        int i;
        long[] jArr = this.a;
        Object[] objArr = this.b;
        boolean z = this.d;
        int i2 = this.k;
        if (z) {
            i2--;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 == 0) {
                break;
            }
            while (true) {
                j = jArr[i3];
                i = i3 + 1;
                if (j != 0) {
                    break;
                }
                i3 = i;
            }
            Object obj = objArr[i3];
            int iG = a.g(j);
            if (this != obj) {
                iG ^= obj == null ? 0 : obj.hashCode();
            }
            i4 += iG;
            i2 = i5;
            i3 = i;
        }
        if (!this.d) {
            return i4;
        }
        Object obj2 = objArr[this.h];
        return i4 + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // defpackage.aekz, java.util.Map
    public final boolean isEmpty() {
        return this.k == 0;
    }

    @Override // defpackage.aela
    /* renamed from: k */
    public final aeqb keySet() {
        if (this.l == null) {
            this.l = new aenl(this);
        }
        return this.l;
    }

    @Override // defpackage.aela, defpackage.aekz, java.util.Map
    public final /* bridge */ /* synthetic */ Set<Long> keySet() {
        return keySet();
    }

    @Override // defpackage.aene
    public final Object p(long j) {
        long j2;
        if (j == 0) {
            if (this.d) {
                return this.b[this.h];
            }
            return null;
        }
        long[] jArr = this.a;
        long j3 = (-7046029254386353131L) * j;
        long j4 = j3 ^ (j3 >>> 32);
        int i = this.c & ((int) (j4 ^ (j4 >>> 16)));
        long j5 = jArr[i];
        if (j5 == 0) {
            return null;
        }
        if (j == j5) {
            return this.b[i];
        }
        do {
            i = (i + 1) & this.c;
            j2 = jArr[i];
            if (j2 == 0) {
                return null;
            }
        } while (j != j2);
        return this.b[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aekz, java.util.Map
    public final void putAll(Map<? extends Long, ? extends V> map) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil((this.k + map.size()) / 0.75f)) - 1))));
        if (iMin > this.h) {
            A(iMin);
        }
        if (map instanceof aens) {
            aety aetyVarA = aenu.a((aens) map);
            while (aetyVarA.hasNext()) {
                aenm aenmVar = (aenm) aetyVarA.next();
                a(aenmVar.a(), aenmVar.getValue());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends Long, ? extends V>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends Long, ? extends V> next = it.next();
            adqq.aC(this, next.getKey(), next.getValue());
        }
    }

    @Override // defpackage.aenv
    public final long q() {
        if (this.k != 0) {
            return this.a[this.e];
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.aenv
    public final long r() {
        if (this.k != 0) {
            return this.a[this.f];
        }
        throw new NoSuchElementException();
    }

    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final aenq clone() {
        try {
            aenq aenqVar = (aenq) super.clone();
            aenqVar.l = null;
            aenqVar.m = null;
            aenqVar.n = null;
            aenqVar.d = this.d;
            aenqVar.a = (long[]) this.a.clone();
            aenqVar.b = (Object[]) this.b.clone();
            aenqVar.g = (long[]) this.g.clone();
            return aenqVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.aeky, defpackage.aeee
    public final int size() {
        return this.k;
    }

    public final Object u(int i) {
        long j;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.k--;
        x(i);
        long[] jArr = this.a;
        Object[] objArr2 = this.b;
        loop0: while (true) {
            int i2 = (i + 1) & this.c;
            while (true) {
                j = jArr[i2];
                if (j == 0) {
                    break loop0;
                }
                int i3 = this.c;
                long j2 = (-7046029254386353131L) * j;
                long j3 = j2 ^ (j2 >>> 32);
                int i4 = ((int) (j3 ^ (j3 >>> 16))) & i3;
                if (i <= i2) {
                    if (i >= i4 || i4 > i2) {
                        break;
                    }
                    i2 = (i2 + 1) & i3;
                } else if (i < i4 || i4 <= i2) {
                    i2 = (i2 + 1) & i3;
                }
            }
            jArr[i] = j;
            objArr2[i] = objArr2[i2];
            y(i2, i);
            i = i2;
        }
        jArr[i] = 0;
        objArr2[i] = null;
        int i5 = this.h;
        if (i5 > this.j && this.k < this.i / 4 && i5 > 16) {
            A(i5 >> 1);
        }
        return obj;
    }

    public final Object v() {
        this.d = false;
        Object[] objArr = this.b;
        int i = this.h;
        Object obj = objArr[i];
        objArr[i] = null;
        this.k--;
        x(i);
        int i2 = this.h;
        if (i2 > this.j && this.k < this.i / 4 && i2 > 16) {
            A(i2 >> 1);
        }
        return obj;
    }

    @Override // defpackage.aela, defpackage.aekz, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    public final Object w(int i, Object obj) {
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    protected final void x(int i) {
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

    protected final void y(int i, int i2) {
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

    public final void z(int i) {
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

    public aenq() {
        throw null;
    }
}
