package defpackage;

import j$.util.Spliterator;
import j$.util.stream.Collector;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aeug<K> extends aeqx<K> implements Serializable, Cloneable {
    public static final /* synthetic */ int l = 0;
    private static final long serialVersionUID = 0;
    protected transient Object[] a;
    protected transient int b;
    protected transient boolean c;
    protected transient int d;
    protected transient int e;
    protected transient long[] f;
    protected transient int g;
    protected transient int h;
    protected final transient int i;
    public int j;
    protected final float k;

    static {
        Collector.CC.of(new aetn(2), new mac(5), new rib(7), new Collector.Characteristics[0]);
    }

    public aeug(byte[] bArr) {
        this.d = -1;
        this.e = -1;
        this.k = 0.75f;
        int iP = adqs.p(16, 0.75f);
        this.g = iP;
        this.i = iP;
        this.b = iP - 1;
        this.h = adqs.q(iP, 0.75f);
        int i = this.g + 1;
        this.a = new Object[i];
        this.f = new long[i];
    }

    private final void l(int i) {
        this.j--;
        h(i);
        k(i);
        int i2 = this.g;
        if (i2 <= this.i || this.j >= this.h / 4 || i2 <= 16) {
            return;
        }
        j(i2 >> 1);
    }

    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        Object[] objArr;
        objectInputStream.defaultReadObject();
        int i2 = this.j;
        float f = this.k;
        int iP = adqs.p(i2, f);
        this.g = iP;
        this.h = adqs.q(iP, f);
        int i3 = this.g;
        this.b = i3 - 1;
        ?? r2 = 1;
        int i4 = i3 + 1;
        Object[] objArr2 = new Object[i4];
        this.a = objArr2;
        long[] jArr = new long[i4];
        this.f = jArr;
        this.e = -1;
        this.d = -1;
        int i5 = this.j;
        int i6 = -1;
        while (true) {
            int i7 = i5 - 1;
            if (i5 == 0) {
                break;
            }
            Object object = objectInputStream.readObject();
            if (object == null) {
                i = this.g;
                this.c = r2;
            } else {
                int iHashCode = object.hashCode() * (-1640531527);
                i = (iHashCode ^ (iHashCode >>> 16)) & this.b;
                if (objArr2[i] != null) {
                    do {
                        i = (i + r2) & this.b;
                    } while (objArr2[i] != null);
                }
            }
            objArr2[i] = object;
            if (this.d != -1) {
                long j = jArr[i6];
                objArr = objArr2;
                jArr[i6] = (((i & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[i];
                jArr[i] = j2 ^ ((((4294967295L & i6) << 32) ^ j2) & (-4294967296L));
            } else {
                objArr = objArr2;
                this.d = i;
                jArr[i] = jArr[i] | (-4294967296L);
            }
            i5 = i7;
            i6 = i;
            objArr2 = objArr;
            r2 = 1;
        }
        this.e = i6;
        if (i6 != -1) {
            jArr[i6] = jArr[i6] | 4294967295L;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        aeuf aeufVar = new aeuf(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.j; i != 0; i--) {
            objectOutputStream.writeObject(aeufVar.next());
        }
    }

    @Override // defpackage.aeqx, defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: a */
    public final /* synthetic */ aety iterator() {
        return new aeuf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        int i;
        Object obj;
        if (k != null) {
            Object[] objArr = this.a;
            int iHashCode = k.hashCode() * (-1640531527);
            int i2 = (iHashCode ^ (iHashCode >>> 16)) & this.b;
            Object obj2 = objArr[i2];
            if (obj2 != null) {
                if (!obj2.equals(k)) {
                    do {
                        i2 = (i2 + 1) & this.b;
                        obj = objArr[i2];
                        if (obj != null) {
                        }
                    } while (!obj.equals(k));
                }
                return false;
            }
            objArr[i2] = k;
            i = i2;
        } else {
            if (this.c) {
                return false;
            }
            i = this.g;
            this.c = true;
        }
        int i3 = this.j;
        if (i3 == 0) {
            this.e = i;
            this.d = i;
            this.f[i] = -1;
        } else {
            long[] jArr = this.f;
            int i4 = this.e;
            long j = jArr[i4];
            jArr[i4] = j ^ (((i & 4294967295L) ^ j) & 4294967295L);
            jArr[i] = ((i4 & 4294967295L) << 32) | 4294967295L;
            this.e = i;
        }
        this.j = i3 + 1;
        if (i3 >= this.h) {
            j(adqs.p(i3 + 2, this.k));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends K> collection) {
        float f = this.k;
        if (f <= 0.5d) {
            int iP = adqs.p(collection.size(), f);
            if (iP > this.g) {
                j(iP);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil((this.j + collection.size()) / f)) - 1))));
            if (iMin > this.g) {
                j(iMin);
            }
        }
        return super.addAll(collection);
    }

    @Override // defpackage.aeqx, defpackage.aeqw, defpackage.aeqq, defpackage.aetv
    /* renamed from: b */
    public final aeus spliterator() {
        return new aeuy(new aeuf(this), adzo.l(this), 81);
    }

    @Override // defpackage.aeqx
    /* renamed from: c */
    public final /* synthetic */ aetu iterator() {
        return new aeuf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.j == 0) {
            return;
        }
        this.j = 0;
        this.c = false;
        Arrays.fill(this.a, (Object) null);
        this.e = -1;
        this.d = -1;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.c;
        }
        Object[] objArr = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & this.b;
        Object obj3 = objArr[i];
        if (obj3 == null) {
            return false;
        }
        if (!obj.equals(obj3)) {
            do {
                i = (i + 1) & this.b;
                obj2 = objArr[i];
                if (obj2 == null) {
                    return false;
                }
            } while (!obj.equals(obj2));
        }
        return true;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aeug clone() {
        try {
            aeug aeugVar = (aeug) super.clone();
            aeugVar.a = (Object[]) this.a.clone();
            aeugVar.c = this.c;
            aeugVar.f = (long[]) this.f.clone();
            return aeugVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.aeqx, java.util.SortedSet
    /* renamed from: e */
    public final aeur headSet(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aeqx, java.util.SortedSet
    /* renamed from: f */
    public final aeur subSet(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (this.j != 0) {
            return this.a[this.d];
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.aeqq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super K> consumer) {
        int i = this.d;
        while (i != -1) {
            int i2 = (int) this.f[i];
            consumer.accept(this.a[i]);
            i = i2;
        }
    }

    @Override // defpackage.aeqx, java.util.SortedSet
    /* renamed from: g */
    public final aeur tailSet(Object obj) {
        throw new UnsupportedOperationException();
    }

    protected final void h(int i) {
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

    @Override // defpackage.aeqw, java.util.Collection, java.util.Set
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.a;
        boolean z = this.c;
        int i = this.j;
        if (z) {
            i--;
        }
        int iHashCode = 0;
        int i2 = i;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                return iHashCode;
            }
            do {
                obj = objArr[i3];
                i3++;
            } while (obj == null);
            if (this != obj) {
                iHashCode += obj.hashCode();
            }
            i2 = i4;
        }
    }

    protected final void i(int i, int i2) {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.j == 0;
    }

    @Override // defpackage.aeqx, defpackage.aeqw, defpackage.aeqq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new aeuf(this);
    }

    protected final void j(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        Object[] objArr = this.a;
        Object[] objArr2 = new Object[i4];
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
            Object obj = objArr[i5];
            if (obj != null) {
                int iHashCode = obj.hashCode() * (-1640531527);
                int i10 = iHashCode ^ (iHashCode >>> 16);
                while (true) {
                    i3 = i10 & i2;
                    if (objArr2[i3] == null) {
                        break;
                    } else {
                        i10 = i3 + 1;
                    }
                }
            } else {
                i3 = i;
            }
            objArr2[i3] = objArr[i5];
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
        this.a = objArr2;
    }

    protected final void k(int i) {
        Object obj;
        Object[] objArr = this.a;
        while (true) {
            int i2 = (i + 1) & this.b;
            while (true) {
                obj = objArr[i2];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int iHashCode = obj.hashCode() * (-1640531527);
                int i3 = this.b;
                int i4 = (iHashCode ^ (iHashCode >>> 16)) & i3;
                if (i <= i2) {
                    if (i >= i4 || i4 > i2) {
                        break;
                    } else {
                        i2 = (i2 + 1) & i3;
                    }
                } else if (i < i4 || i4 <= i2) {
                    i2 = (i2 + 1) & i3;
                }
            }
            objArr[i] = obj;
            i(i2, i);
            i = i2;
        }
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (this.j != 0) {
            return this.a[this.e];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (obj == null) {
            if (!this.c) {
                return false;
            }
            this.c = false;
            Object[] objArr = this.a;
            int i = this.g;
            objArr[i] = null;
            this.j--;
            h(i);
            int i2 = this.g;
            if (i2 > this.i && this.j < this.h / 4 && i2 > 16) {
                j(i2 >> 1);
            }
            return true;
        }
        Object[] objArr2 = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i3 = (iHashCode ^ (iHashCode >>> 16)) & this.b;
        Object obj3 = objArr2[i3];
        if (obj3 == null) {
            return false;
        }
        if (obj.equals(obj3)) {
            l(i3);
            return true;
        }
        do {
            i3 = (i3 + 1) & this.b;
            obj2 = objArr2[i3];
            if (obj2 == null) {
                return false;
            }
        } while (!obj.equals(obj2));
        l(i3);
        return true;
    }

    public final Object removeFirst() {
        int i = this.j;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i2 = this.d;
        if (i == 1) {
            this.e = -1;
            this.d = -1;
        } else {
            long[] jArr = this.f;
            int i3 = (int) jArr[i2];
            this.d = i3;
            if (i3 >= 0) {
                jArr[i3] = jArr[i3] | (-4294967296L);
            }
        }
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        this.j = i - 1;
        if (obj == null) {
            this.c = false;
            objArr[this.g] = null;
        } else {
            k(i2);
        }
        int i4 = this.g;
        if (i4 > this.i && this.j < this.h / 4 && i4 > 16) {
            j(i4 >> 1);
        }
        return obj;
    }

    public final Object removeLast() {
        int i = this.j;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i2 = this.e;
        if (i == 1) {
            this.e = -1;
            this.d = -1;
        } else {
            long[] jArr = this.f;
            int i3 = (int) (jArr[i2] >>> 32);
            this.e = i3;
            if (i3 >= 0) {
                jArr[i3] = jArr[i3] | 4294967295L;
            }
        }
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        this.j = i - 1;
        if (obj == null) {
            this.c = false;
            objArr[this.g] = null;
        } else {
            k(i2);
        }
        int i4 = this.g;
        if (i4 > this.i && this.j < this.h / 4 && i4 > 16) {
            j(i4 >> 1);
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.j;
    }

    @Override // defpackage.aeqx, defpackage.aeqw, defpackage.aeqq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    public aeug() {
        throw null;
    }
}
