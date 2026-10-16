package defpackage;

import j$.util.Spliterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class aejz extends aegs implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    public transient int[] a;
    protected transient int b;
    public transient boolean c;
    public transient int d;
    public transient int e;
    public transient long[] f;
    public transient int g;
    public transient int h;
    public final transient int i;
    public int j;
    protected final float k;

    public aejz(int i) {
        this.d = -1;
        this.e = -1;
        this.k = 0.75f;
        int iP = adqs.p(i, 0.75f);
        this.g = iP;
        this.i = iP;
        this.b = iP - 1;
        this.h = adqs.q(iP, 0.75f);
        int i2 = this.g + 1;
        this.a = new int[i2];
        this.f = new long[i2];
    }

    private final void E(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil(j / this.k)) - 1))));
        if (iMin > this.g) {
            B(iMin);
        }
    }

    private final void F(int i) {
        this.j--;
        z(i);
        C(i);
        int i2 = this.g;
        if (i2 <= this.i || this.j >= this.h / 4 || i2 <= 16) {
            return;
        }
        B(i2 >> 1);
    }

    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        int i2;
        int[] iArr;
        objectInputStream.defaultReadObject();
        int i3 = this.j;
        float f = this.k;
        int iP = adqs.p(i3, f);
        this.g = iP;
        this.h = adqs.q(iP, f);
        int i4 = this.g;
        this.b = i4 - 1;
        ?? r2 = 1;
        int i5 = i4 + 1;
        int[] iArr2 = new int[i5];
        this.a = iArr2;
        long[] jArr = new long[i5];
        this.f = jArr;
        this.e = -1;
        this.d = -1;
        int i6 = this.j;
        int i7 = -1;
        while (true) {
            int i8 = i6 - 1;
            if (i6 == 0) {
                break;
            }
            int i9 = objectInputStream.readInt();
            if (i9 == 0) {
                i2 = this.g;
                this.c = r2;
                i = 0;
            } else {
                int i10 = (-1640531527) * i9;
                int i11 = this.b & (i10 ^ (i10 >>> 16));
                if (iArr2[i11] != 0) {
                    do {
                        i11 = (i11 + r2) & this.b;
                    } while (iArr2[i11] != 0);
                }
                int i12 = i11;
                i = i9;
                i2 = i12;
            }
            iArr2[i2] = i;
            if (this.d != -1) {
                long j = jArr[i7];
                iArr = iArr2;
                jArr[i7] = (((i2 & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[i2];
                jArr[i2] = j2 ^ ((((4294967295L & i7) << 32) ^ j2) & (-4294967296L));
            } else {
                iArr = iArr2;
                this.d = i2;
                jArr[i2] = jArr[i2] | (-4294967296L);
            }
            i7 = i2;
            i6 = i8;
            iArr2 = iArr;
            r2 = 1;
        }
        this.e = i7;
        if (i7 != -1) {
            jArr[i7] = jArr[i7] | 4294967295L;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        aejy aejyVar = new aejy(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.j; i != 0; i--) {
            objectOutputStream.writeInt(aejyVar.nextInt());
        }
    }

    protected final void A(int i, int i2) {
        if (this.j == 1) {
            this.e = i2;
            this.d = i2;
            this.f[i2] = -1;
            return;
        }
        long j = i2 & 4294967295L;
        if (this.d == i) {
            this.d = i2;
            long[] jArr = this.f;
            int i3 = (int) jArr[i];
            long j2 = jArr[i3];
            jArr[i3] = (((j << 32) ^ j2) & (-4294967296L)) ^ j2;
            jArr[i2] = jArr[i];
            return;
        }
        if (this.e == i) {
            this.e = i2;
            long[] jArr2 = this.f;
            int i4 = (int) (jArr2[i] >>> 32);
            long j3 = jArr2[i4];
            jArr2[i4] = ((j ^ j3) & 4294967295L) ^ j3;
            jArr2[i2] = jArr2[i];
            return;
        }
        long j4 = j << 32;
        long[] jArr3 = this.f;
        long j5 = jArr3[i];
        int i5 = (int) j5;
        int i6 = (int) (j5 >>> 32);
        long j6 = jArr3[i6];
        jArr3[i6] = ((j ^ j6) & 4294967295L) ^ j6;
        long j7 = jArr3[i5];
        jArr3[i5] = j7 ^ ((j7 ^ j4) & (-4294967296L));
        jArr3[i2] = j5;
    }

    public final void B(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        int[] iArr = this.a;
        int[] iArr2 = new int[i4];
        int i5 = this.d;
        long[] jArr = this.f;
        long[] jArr2 = new long[i4];
        this.d = -1;
        int i6 = this.j;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            i2 = i - 1;
            int i9 = i6 - 1;
            if (i6 == 0) {
                break;
            }
            int i10 = iArr[i5];
            if (i10 != 0) {
                int i11 = i10 * (-1640531527);
                int i12 = i11 ^ (i11 >>> 16);
                while (true) {
                    i3 = i12 & i2;
                    if (iArr2[i3] == 0) {
                        break;
                    } else {
                        i12 = i3 + 1;
                    }
                }
            } else {
                i3 = i;
            }
            iArr2[i3] = iArr[i5];
            if (i8 != -1) {
                long j = jArr2[i7];
                jArr2[i7] = j ^ (((i3 & 4294967295L) ^ j) & 4294967295L);
                long j2 = jArr2[i3];
                jArr2[i3] = j2 ^ ((((i7 & 4294967295L) << 32) ^ j2) & (-4294967296L));
            } else {
                this.d = i3;
                jArr2[i3] = -1;
            }
            i8 = i5;
            i5 = (int) jArr[i5];
            i7 = i3;
            i6 = i9;
        }
        this.f = jArr2;
        this.e = i7;
        if (i7 != -1) {
            jArr2[i7] = jArr2[i7] | 4294967295L;
        }
        this.g = i;
        this.b = i2;
        this.h = adqs.q(i, this.k);
        this.a = iArr2;
    }

    public final void C(int i) {
        int i2;
        int[] iArr = this.a;
        while (true) {
            int i3 = (i + 1) & this.b;
            while (true) {
                i2 = iArr[i3];
                if (i2 == 0) {
                    iArr[i] = 0;
                    return;
                }
                int i4 = this.b;
                int i5 = (-1640531527) * i2;
                int i6 = (i5 ^ (i5 >>> 16)) & i4;
                if (i <= i3) {
                    if (i >= i6 || i6 > i3) {
                        break;
                    } else {
                        i3 = (i3 + 1) & i4;
                    }
                } else if (i < i6 || i6 <= i3) {
                    i3 = (i3 + 1) & i4;
                }
            }
            iArr[i] = i2;
            A(i3, i);
            i = i3;
        }
    }

    public final void D(int i) {
        float f = this.k;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(i / f)) - 1));
        if (iNumberOfLeadingZeros >= this.g || this.j > adqs.q(iNumberOfLeadingZeros, f)) {
            return;
        }
        try {
            B(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    @Override // defpackage.aegs, defpackage.aegr, defpackage.aegj, defpackage.aejf
    /* renamed from: a */
    public final /* synthetic */ aejr iterator() {
        return new aejy(this);
    }

    @Override // defpackage.aegs, defpackage.aegr, defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* synthetic */ boolean add(Object obj) {
        return adzo.q(this, (Integer) obj);
    }

    @Override // defpackage.aegj, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        if (this.k <= 0.5d) {
            y(collection.size());
        } else {
            E(this.j + collection.size());
        }
        return super.addAll(collection);
    }

    @Override // defpackage.aegs, defpackage.aegr, defpackage.aegj, defpackage.aejf
    /* renamed from: b */
    public final aekm spliterator() {
        return new aeks(new aejy(this), adzo.l(this), 337);
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean c(int i) {
        int i2;
        int i3;
        if (i != 0) {
            int[] iArr = this.a;
            int i4 = (-1640531527) * i;
            int i5 = this.b & (i4 ^ (i4 >>> 16));
            int i6 = iArr[i5];
            if (i6 != 0) {
                if (i6 != i) {
                    do {
                        i5 = (i5 + 1) & this.b;
                        i3 = iArr[i5];
                        if (i3 != 0) {
                        }
                    } while (i3 != i);
                }
                return false;
            }
            iArr[i5] = i;
            i2 = i5;
        } else {
            if (this.c) {
                return false;
            }
            i2 = this.g;
            this.c = true;
        }
        int i7 = this.j;
        if (i7 == 0) {
            this.e = i2;
            this.d = i2;
            this.f[i2] = -1;
        } else {
            long[] jArr = this.f;
            int i8 = this.e;
            long j = jArr[i8];
            jArr[i8] = j ^ (((i2 & 4294967295L) ^ j) & 4294967295L);
            jArr[i2] = ((i8 & 4294967295L) << 32) | 4294967295L;
            this.e = i2;
        }
        this.j = i7 + 1;
        if (i7 >= this.h) {
            B(adqs.p(i7 + 2, this.k));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.j == 0) {
            return;
        }
        this.j = 0;
        this.c = false;
        Arrays.fill(this.a, 0);
        this.e = -1;
        this.d = -1;
    }

    @Override // defpackage.aegs, java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean d(aejf aejfVar) {
        if (this.k <= 0.5d) {
            y(aejfVar.size());
        } else {
            E(this.j + aejfVar.size());
        }
        return super.d(aejfVar);
    }

    @Override // defpackage.aegj, defpackage.aejf
    public final boolean e(int i) {
        int i2;
        if (i == 0) {
            return this.c;
        }
        int[] iArr = this.a;
        int i3 = (-1640531527) * i;
        int i4 = this.b & (i3 ^ (i3 >>> 16));
        int i5 = iArr[i4];
        if (i5 == 0) {
            return false;
        }
        if (i != i5) {
            do {
                i4 = (i4 + 1) & this.b;
                i2 = iArr[i4];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    @Override // defpackage.aegr, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i;
        int[] iArr = this.a;
        boolean z = this.c;
        int i2 = this.j;
        if (z) {
            i2--;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 == 0) {
                return i3;
            }
            do {
                i = iArr[i4];
                i4++;
            } while (i == 0);
            i3 += i;
            i2 = i5;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.j == 0;
    }

    @Override // defpackage.aegs, defpackage.aegr, defpackage.aegj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* synthetic */ Iterator m() {
        return new aejy(this);
    }

    @Override // defpackage.aegr
    public final boolean l(int i) {
        int i2;
        if (i == 0) {
            if (!this.c) {
                return false;
            }
            this.c = false;
            int[] iArr = this.a;
            int i3 = this.g;
            iArr[i3] = 0;
            this.j--;
            z(i3);
            int i4 = this.g;
            if (i4 > this.i && this.j < this.h / 4 && i4 > 16) {
                B(i4 >> 1);
            }
            return true;
        }
        int[] iArr2 = this.a;
        int i5 = (-1640531527) * i;
        int i6 = this.b & (i5 ^ (i5 >>> 16));
        int i7 = iArr2[i6];
        if (i7 == 0) {
            return false;
        }
        if (i == i7) {
            F(i6);
            return true;
        }
        do {
            i6 = (i6 + 1) & this.b;
            i2 = iArr2[i6];
            if (i2 == 0) {
                return false;
            }
        } while (i != i2);
        F(i6);
        return true;
    }

    @Override // defpackage.aegs
    public final /* synthetic */ aejd m() {
        return new aejy(this);
    }

    @Override // defpackage.aekk
    public final int s() {
        if (this.j != 0) {
            return this.a[this.d];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.j;
    }

    @Override // defpackage.aegs, defpackage.aegr, defpackage.aegj, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // defpackage.aekk
    public final int t() {
        if (this.j != 0) {
            return this.a[this.e];
        }
        throw new NoSuchElementException();
    }

    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final aejz clone() {
        try {
            aejz aejzVar = (aejz) super.clone();
            aejzVar.a = (int[]) this.a.clone();
            aejzVar.c = this.c;
            aejzVar.f = (long[]) this.f.clone();
            return aejzVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.aekk
    public final aekk v() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aekk
    public final aekk w() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aekk
    public final aekk x() {
        throw new UnsupportedOperationException();
    }

    public final void y(int i) {
        int iP = adqs.p(i, this.k);
        if (iP > this.g) {
            B(iP);
        }
    }

    protected final void z(int i) {
        if (this.j == 0) {
            this.e = -1;
            this.d = -1;
            return;
        }
        if (this.d == i) {
            long[] jArr = this.f;
            int i2 = (int) jArr[i];
            this.d = i2;
            if (i2 >= 0) {
                jArr[i2] = (-4294967296L) | jArr[i2];
                return;
            }
            return;
        }
        int i3 = this.e;
        long[] jArr2 = this.f;
        if (i3 == i) {
            int i4 = (int) (jArr2[i] >>> 32);
            this.e = i4;
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

    public aejz() {
        this(16);
    }
}
