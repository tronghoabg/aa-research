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

/* loaded from: classes3.dex */
public final class aehf<V> extends aegg<V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient int[] a;
    protected transient Object[] b;
    protected transient int c;
    protected transient boolean d;
    protected transient int e;
    protected transient int f;
    protected transient long[] g;
    protected transient int h;
    protected transient int i;
    protected final transient int j;
    protected int k;
    protected transient aekk l;
    protected transient aetv m;
    protected transient aehc n;

    public aehf(byte[] bArr) {
        this.e = -1;
        this.f = -1;
        int iP = adqs.p(16, 0.75f);
        this.h = iP;
        this.j = iP;
        this.c = iP - 1;
        this.i = adqs.q(iP, 0.75f);
        int i = this.h + 1;
        this.a = new int[i];
        this.b = new Object[i];
        this.g = new long[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        int i2;
        int i3;
        int[] iArr;
        objectInputStream.defaultReadObject();
        int iP = adqs.p(this.k, 0.75f);
        this.h = iP;
        this.i = adqs.q(iP, 0.75f);
        int i4 = this.h;
        this.c = i4 - 1;
        boolean z = true;
        int i5 = i4 + 1;
        int[] iArr2 = new int[i5];
        this.a = iArr2;
        Object[] objArr = new Object[i5];
        this.b = objArr;
        long[] jArr = new long[i5];
        this.g = jArr;
        this.f = -1;
        this.e = -1;
        int i6 = this.k;
        int i7 = -1;
        while (true) {
            int i8 = i6 - 1;
            if (i6 == 0) {
                break;
            }
            int i9 = objectInputStream.readInt();
            Object object = objectInputStream.readObject();
            if (i9 == 0) {
                i3 = this.h;
                this.d = z;
                i2 = 0;
            } else {
                int i10 = this.c;
                int i11 = (-1640531527) * i9;
                int i12 = i11 ^ (i11 >>> 16);
                while (true) {
                    i = i10 & i12;
                    if (iArr2[i] == 0) {
                        break;
                    }
                    i10 = i + 1;
                    i12 = this.c;
                }
                i2 = i9;
                i3 = i;
            }
            iArr2[i3] = i2;
            objArr[i3] = object;
            if (this.e != -1) {
                long j = jArr[i7];
                iArr = iArr2;
                jArr[i7] = (((i3 & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[i3];
                jArr[i3] = j2 ^ ((((4294967295L & i7) << 32) ^ j2) & (-4294967296L));
            } else {
                iArr = iArr2;
                this.e = i3;
                jArr[i3] = jArr[i3] | (-4294967296L);
            }
            i7 = i3;
            i6 = i8;
            iArr2 = iArr;
            z = true;
        }
        this.f = i7;
        if (i7 != -1) {
            jArr[i7] = jArr[i7] | 4294967295L;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        aegy aegyVar = new aegy(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.k; i != 0; i--) {
            int iG = aegyVar.g();
            objectOutputStream.writeInt(iArr[iG]);
            objectOutputStream.writeObject(objArr[iG]);
        }
    }

    @Override // defpackage.aehz
    public final aehz A() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aehz
    public final aehz B() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aehz
    public final aehz C() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[EDGE_INSN: B:9:0x001a->B:15:0x002b BREAK  A[LOOP:0: B:11:0x0020->B:32:?], PHI: r2
  0x001a: PHI (r2v14 int) = (r2v1 int), (r2v4 int), (r2v17 int) binds: [B:8:0x0018, B:30:0x001a, B:5:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.aege, defpackage.aegu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r9, java.lang.Object r10) {
        /*
            r8 = this;
            r0 = 1
            if (r9 != 0) goto La
            boolean r1 = r8.d
            int r2 = r8.h
            if (r1 == 0) goto L1a
            goto L2b
        La:
            int[] r1 = r8.a
            int r2 = r8.c
            r3 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r3 = r3 * r9
            int r4 = r3 >>> 16
            r3 = r3 ^ r4
            r2 = r2 & r3
            r3 = r1[r2]
            if (r3 != 0) goto L1e
        L1a:
            int r2 = r2 + 1
            int r2 = -r2
            goto L2b
        L1e:
            if (r9 == r3) goto L2b
        L20:
            int r2 = r2 + r0
            int r3 = r8.c
            r2 = r2 & r3
            r3 = r1[r2]
            if (r3 != 0) goto L29
            goto L1a
        L29:
            if (r9 != r3) goto L20
        L2b:
            if (r2 >= 0) goto L7e
            int r1 = -r2
            int r1 = r1 + (-1)
            int r2 = r8.h
            if (r1 != r2) goto L36
            r8.d = r0
        L36:
            int[] r0 = r8.a
            r0[r1] = r9
            java.lang.Object[] r9 = r8.b
            r9[r1] = r10
            int r9 = r8.k
            if (r9 != 0) goto L4d
            r8.f = r1
            r8.e = r1
            long[] r10 = r8.g
            r2 = -1
            r10[r1] = r2
            goto L69
        L4d:
            long[] r10 = r8.g
            int r0 = r8.f
            r2 = r10[r0]
            long r4 = (long) r1
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            long r4 = r4 ^ r2
            long r4 = r4 & r6
            long r2 = r2 ^ r4
            r10[r0] = r2
            long r2 = (long) r0
            long r2 = r2 & r6
            r0 = 32
            long r2 = r2 << r0
            long r2 = r2 | r6
            r10[r1] = r2
            r8.f = r1
        L69:
            int r10 = r9 + 1
            r8.k = r10
            int r10 = r8.i
            if (r9 < r10) goto L7c
            int r9 = r9 + 2
            r10 = 1061158912(0x3f400000, float:0.75)
            int r9 = defpackage.adqs.p(r9, r10)
            r8.y(r9)
        L7c:
            r8 = 0
            return r8
        L7e:
            java.lang.Object[] r8 = r8.b
            r9 = r8[r2]
            r8[r2] = r10
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aehf.a(int, java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.aege, defpackage.aegu
    public final Object b(int i) {
        int i2;
        if (i == 0) {
            if (this.d) {
                return v();
            }
            return null;
        }
        int[] iArr = this.a;
        int i3 = (-1640531527) * i;
        int i4 = this.c & (i3 ^ (i3 >>> 16));
        int i5 = iArr[i4];
        if (i5 == 0) {
            return null;
        }
        if (i == i5) {
            return u(i4);
        }
        do {
            i4 = (i4 + 1) & this.c;
            i2 = iArr[i4];
            if (i2 == 0) {
                return null;
            }
        } while (i != i2);
        return u(i4);
    }

    @Override // defpackage.aegf, defpackage.aege, defpackage.aegu
    public final boolean c(int i) {
        int i2;
        if (i == 0) {
            return this.d;
        }
        int[] iArr = this.a;
        int i3 = (-1640531527) * i;
        int i4 = this.c & (i3 ^ (i3 >>> 16));
        int i5 = iArr[i4];
        if (i5 == 0) {
            return false;
        }
        if (i != i5) {
            do {
                i4 = (i4 + 1) & this.c;
                i2 = iArr[i4];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    @Override // defpackage.aegf, defpackage.aehj, java.util.Map
    public final void clear() {
        if (this.k == 0) {
            return;
        }
        this.k = 0;
        this.d = false;
        Arrays.fill(this.a, 0);
        Arrays.fill(this.b, (Object) null);
        this.f = -1;
        this.e = -1;
    }

    @Override // defpackage.aegg, java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator<? super Integer> comparator() {
        return null;
    }

    @Override // defpackage.aegf, java.util.Map
    public final boolean containsValue(Object obj) {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        if (this.d && Objects.equals(objArr[this.h], obj)) {
            return true;
        }
        int i = this.h;
        while (i != 0) {
            i--;
            if (iArr[i] != 0 && Objects.equals(objArr[i], obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aegf
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ aekf keySet() {
        return keySet();
    }

    @Override // defpackage.aegg, defpackage.aegf, defpackage.aehj
    /* renamed from: e */
    public final aetv values() {
        if (this.m == null) {
            this.m = new aegx(this);
        }
        return this.m;
    }

    @Override // defpackage.aegf, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int i;
        int[] iArr = this.a;
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
                iHashCode = iArr[i3];
                i = i3 + 1;
                if (iHashCode != 0) {
                    break;
                }
                i3 = i;
            }
            Object obj = objArr[i3];
            if (this != obj) {
                iHashCode ^= obj == null ? 0 : obj.hashCode();
            }
            i4 += iHashCode;
            i2 = i5;
            i3 = i;
        }
        if (!this.d) {
            return i4;
        }
        Object obj2 = objArr[this.h];
        return i4 + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // defpackage.aegf, java.util.Map
    public final boolean isEmpty() {
        return this.k == 0;
    }

    @Override // defpackage.aegg
    /* renamed from: k */
    public final aekk keySet() {
        if (this.l == null) {
            this.l = new aehb(this);
        }
        return this.l;
    }

    @Override // defpackage.aegg, defpackage.aegf, java.util.Map
    public final /* bridge */ /* synthetic */ Set<Integer> keySet() {
        return keySet();
    }

    @Override // defpackage.aegu
    public final Object p(int i) {
        int i2;
        if (i == 0) {
            if (this.d) {
                return this.b[this.h];
            }
            return null;
        }
        int[] iArr = this.a;
        int i3 = (-1640531527) * i;
        int i4 = this.c & (i3 ^ (i3 >>> 16));
        int i5 = iArr[i4];
        if (i5 == 0) {
            return null;
        }
        if (i == i5) {
            return this.b[i4];
        }
        do {
            i4 = (i4 + 1) & this.c;
            i2 = iArr[i4];
            if (i2 == 0) {
                return null;
            }
        } while (i != i2);
        return this.b[i4];
    }

    @Override // defpackage.aegf, java.util.Map
    public final void putAll(Map<? extends Integer, ? extends V> map) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil((this.k + map.size()) / 0.75f)) - 1))));
        if (iMin > this.h) {
            y(iMin);
        }
        super.putAll(map);
    }

    @Override // defpackage.aehz
    public final int q() {
        if (this.k != 0) {
            return this.a[this.e];
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.aehz
    public final int r() {
        if (this.k != 0) {
            return this.a[this.f];
        }
        throw new NoSuchElementException();
    }

    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final aehf clone() {
        try {
            aehf aehfVar = (aehf) super.clone();
            aehfVar.l = null;
            aehfVar.m = null;
            aehfVar.n = null;
            aehfVar.d = this.d;
            aehfVar.a = (int[]) this.a.clone();
            aehfVar.b = (Object[]) this.b.clone();
            aehfVar.g = (long[]) this.g.clone();
            return aehfVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.aege, defpackage.aeee
    public final int size() {
        return this.k;
    }

    public final Object u(int i) {
        int i2;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.k--;
        w(i);
        int[] iArr = this.a;
        Object[] objArr2 = this.b;
        loop0: while (true) {
            int i3 = (i + 1) & this.c;
            while (true) {
                i2 = iArr[i3];
                if (i2 == 0) {
                    break loop0;
                }
                int i4 = this.c;
                int i5 = (-1640531527) * i2;
                int i6 = (i5 ^ (i5 >>> 16)) & i4;
                if (i <= i3) {
                    if (i >= i6 || i6 > i3) {
                        break;
                    }
                    i3 = (i3 + 1) & i4;
                } else if (i < i6 || i6 <= i3) {
                    i3 = (i3 + 1) & i4;
                }
            }
            iArr[i] = i2;
            objArr2[i] = objArr2[i3];
            x(i3, i);
            i = i3;
        }
        iArr[i] = 0;
        objArr2[i] = null;
        int i7 = this.h;
        if (i7 > this.j && this.k < this.i / 4 && i7 > 16) {
            y(i7 >> 1);
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
        w(i);
        int i2 = this.h;
        if (i2 > this.j && this.k < this.i / 4 && i2 > 16) {
            y(i2 >> 1);
        }
        return obj;
    }

    @Override // defpackage.aegg, defpackage.aegf, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    protected final void w(int i) {
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

    protected final void x(int i, int i2) {
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

    protected final void y(int i) {
        int i2;
        int i3;
        int[] iArr;
        Object[] objArr;
        int i4 = i + 1;
        int[] iArr2 = this.a;
        Object[] objArr2 = this.b;
        int[] iArr3 = new int[i4];
        Object[] objArr3 = new Object[i4];
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
            int i10 = iArr2[i5];
            if (i10 != 0) {
                int i11 = i10 * (-1640531527);
                int i12 = i11 ^ (i11 >>> 16);
                while (true) {
                    i3 = i12 & i2;
                    if (iArr3[i3] == 0) {
                        break;
                    } else {
                        i12 = i3 + 1;
                    }
                }
            } else {
                i3 = i;
            }
            iArr3[i3] = iArr2[i5];
            objArr3[i3] = objArr2[i5];
            if (i8 != -1) {
                long j = jArr2[i7];
                iArr = iArr2;
                objArr = objArr2;
                jArr2[i7] = (((i3 & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr2[i3];
                jArr2[i3] = j2 ^ ((((i7 & 4294967295L) << 32) ^ j2) & (-4294967296L));
            } else {
                iArr = iArr2;
                objArr = objArr2;
                this.e = i3;
                jArr2[i3] = -1;
            }
            i8 = i5;
            i7 = i3;
            i6 = i9;
            objArr2 = objArr;
            i5 = (int) jArr[i5];
            iArr2 = iArr;
        }
        this.g = jArr2;
        this.f = i7;
        if (i7 != -1) {
            jArr2[i7] = jArr2[i7] | 4294967295L;
        }
        this.h = i;
        this.c = i2;
        this.i = adqs.q(i, 0.75f);
        this.a = iArr3;
        this.b = objArr3;
    }

    @Override // defpackage.aehz
    /* renamed from: z, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final aehc t() {
        aehc aehcVar = this.n;
        if (aehcVar != null) {
            return aehcVar;
        }
        aehc aehcVar2 = new aehc(this);
        this.n = aehcVar2;
        return aehcVar2;
    }

    public aehf() {
        throw null;
    }
}
