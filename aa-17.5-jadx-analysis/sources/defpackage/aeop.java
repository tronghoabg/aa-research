package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aeop<V> extends aelc<V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient long[] a;
    protected transient Object[] b;
    protected transient int c;
    protected transient boolean d;
    protected transient int e;
    protected transient int f;
    protected final transient int g;
    protected int h;
    protected transient aepx i;
    protected transient aexk j;
    protected transient aeok k;

    public aeop(byte[] bArr) {
        int iP = adqs.p(16, 0.75f);
        this.e = iP;
        this.g = iP;
        this.c = iP - 1;
        this.f = adqs.q(iP, 0.75f);
        int i = this.e + 1;
        this.a = new long[i];
        this.b = new Object[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        int i2;
        objectInputStream.defaultReadObject();
        int iP = adqs.p(this.h, 0.75f);
        this.e = iP;
        this.f = adqs.q(iP, 0.75f);
        int i3 = this.e;
        this.c = i3 - 1;
        int i4 = i3 + 1;
        long[] jArr = new long[i4];
        this.a = jArr;
        Object[] objArr = new Object[i4];
        this.b = objArr;
        int i5 = this.h;
        while (true) {
            int i6 = i5 - 1;
            if (i5 == 0) {
                return;
            }
            long j = objectInputStream.readLong();
            Object object = objectInputStream.readObject();
            long j2 = 0;
            if (j == 0) {
                i2 = this.e;
                this.d = true;
            } else {
                int i7 = this.c;
                long j3 = (-7046029254386353131L) * j;
                long j4 = j3 ^ (j3 >>> 32);
                int i8 = (int) (j4 ^ (j4 >>> 16));
                while (true) {
                    i = i7 & i8;
                    if (jArr[i] == 0) {
                        break;
                    }
                    i7 = i + 1;
                    i8 = this.c;
                }
                j2 = j;
                i2 = i;
            }
            jArr[i2] = j2;
            objArr[i2] = object;
            i5 = i6;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        long[] jArr = this.a;
        Object[] objArr = this.b;
        aeoe aeoeVar = new aeoe(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.h; i != 0; i--) {
            int iB = aeoeVar.b();
            objectOutputStream.writeLong(jArr[iB]);
            objectOutputStream.writeObject(objArr[iB]);
        }
    }

    @Override // defpackage.aelb, defpackage.aenw
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
            i = this.e;
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
        if (i3 == this.e) {
            this.d = true;
        }
        this.a[i3] = j;
        this.b[i3] = obj;
        int i4 = this.h;
        this.h = i4 + 1;
        if (i4 < this.f) {
            return null;
        }
        n(adqs.p(i4 + 2, 0.75f));
        return null;
    }

    @Override // defpackage.aelb, defpackage.aenw
    public final Object b(long j) {
        long j2;
        if (j == 0) {
            if (this.d) {
                return m();
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
            return l(i);
        }
        do {
            i = (i + 1) & this.c;
            j2 = jArr[i];
            if (j2 == 0) {
                return null;
            }
        } while (j != j2);
        return l(i);
    }

    @Override // defpackage.aelc, defpackage.aelb, defpackage.aenw
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

    @Override // defpackage.aelc, defpackage.aeoa, java.util.Map
    public final void clear() {
        if (this.h == 0) {
            return;
        }
        this.h = 0;
        this.d = false;
        Arrays.fill(this.a, 0L);
        Arrays.fill(this.b, (Object) null);
    }

    @Override // defpackage.aelc, java.util.Map
    public final boolean containsValue(Object obj) {
        long[] jArr = this.a;
        Object[] objArr = this.b;
        if (this.d && objArr[this.e] == obj) {
            return true;
        }
        int i = this.e;
        while (i != 0) {
            i--;
            if (jArr[i] != 0 && objArr[i] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aelc
    /* renamed from: d */
    public final aepx keySet() {
        if (this.i == null) {
            this.i = new aeoh(this);
        }
        return this.i;
    }

    @Override // defpackage.aelc, defpackage.aeoa
    /* renamed from: f */
    public final aexk values() {
        if (this.j == null) {
            this.j = new aeod(this);
        }
        return this.j;
    }

    @Override // defpackage.aenw
    public final Object h(long j) {
        long j2;
        if (j == 0) {
            if (this.d) {
                return this.b[this.e];
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

    @Override // defpackage.aelc, java.util.Map
    public final int hashCode() {
        long j;
        int i;
        long[] jArr = this.a;
        Object[] objArr = this.b;
        int iJ = j();
        int i2 = 0;
        int i3 = 0;
        while (iJ != 0) {
            while (true) {
                j = jArr[i2];
                i = i2 + 1;
                if (j != 0) {
                    break;
                }
                i2 = i;
            }
            Object obj = objArr[i2];
            int iG = a.g(j);
            if (this != obj) {
                iG ^= obj == null ? 0 : System.identityHashCode(obj);
            }
            i3 += iG;
            iJ--;
            i2 = i;
        }
        if (!this.d) {
            return i3;
        }
        Object obj2 = objArr[this.e];
        return i3 + (obj2 != null ? System.identityHashCode(obj2) : 0);
    }

    @Override // defpackage.aeoa
    public final /* bridge */ /* synthetic */ aeum i() {
        aeok aeokVar = this.k;
        if (aeokVar != null) {
            return aeokVar;
        }
        aeok aeokVar2 = new aeok(this);
        this.k = aeokVar2;
        return aeokVar2;
    }

    @Override // defpackage.aelc, java.util.Map
    public final boolean isEmpty() {
        return this.h == 0;
    }

    public final int j() {
        boolean z = this.d;
        int i = this.h;
        return z ? i - 1 : i;
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final aeop clone() {
        try {
            aeop aeopVar = (aeop) super.clone();
            aeopVar.i = null;
            aeopVar.j = null;
            aeopVar.k = null;
            aeopVar.d = this.d;
            aeopVar.a = (long[]) this.a.clone();
            aeopVar.b = (Object[]) this.b.clone();
            return aeopVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.aelc, java.util.Map
    public final /* bridge */ /* synthetic */ Set<Long> keySet() {
        return keySet();
    }

    public final Object l(int i) {
        long j;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.h--;
        long[] jArr = this.a;
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
            objArr[i] = objArr[i2];
            i = i2;
        }
        jArr[i] = 0;
        objArr[i] = null;
        int i5 = this.e;
        if (i5 > this.g && this.h < this.f / 4 && i5 > 16) {
            n(i5 >> 1);
        }
        return obj;
    }

    public final Object m() {
        this.d = false;
        Object[] objArr = this.b;
        int i = this.e;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = this.h - 1;
        this.h = i2;
        if (i > this.g && i2 < this.f / 4 && i > 16) {
            n(i >> 1);
        }
        return obj;
    }

    protected final void n(int i) {
        long j;
        int i2 = i + 1;
        long[] jArr = this.a;
        Object[] objArr = this.b;
        long[] jArr2 = new long[i2];
        Object[] objArr2 = new Object[i2];
        int i3 = this.e;
        int iJ = j();
        while (true) {
            int i4 = i - 1;
            if (iJ == 0) {
                objArr2[i] = objArr[this.e];
                this.e = i;
                this.c = i4;
                this.f = adqs.q(i, 0.75f);
                this.a = jArr2;
                this.b = objArr2;
                return;
            }
            do {
                i3--;
                j = jArr[i3];
            } while (j == 0);
            long j2 = j * (-7046029254386353131L);
            long j3 = j2 ^ (j2 >>> 32);
            int i5 = ((int) (j3 ^ (j3 >>> 16))) & i4;
            if (jArr2[i5] != 0) {
                do {
                    i5 = (i5 + 1) & i4;
                } while (jArr2[i5] != 0);
            }
            jArr2[i5] = jArr[i3];
            objArr2[i5] = objArr[i3];
            iJ--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aelc, java.util.Map
    public final void putAll(Map<? extends Long, ? extends V> map) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil((this.h + map.size()) / 0.75f)) - 1))));
        if (iMin > this.e) {
            n(iMin);
        }
        if (map instanceof aeoa) {
            aety aetyVarA = aeoc.a((aeoa) map);
            while (aetyVarA.hasNext()) {
                aeoj aeojVar = (aeoj) aetyVarA.next();
                a(aeojVar.a(), aeojVar.getValue());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends Long, ? extends V>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends Long, ? extends V> next = it.next();
            adqq.ax(this, next.getKey(), next.getValue());
        }
    }

    @Override // defpackage.aelb, defpackage.aeee
    public final int size() {
        return this.h;
    }

    @Override // defpackage.aelc, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    public aeop() {
        throw null;
    }
}
