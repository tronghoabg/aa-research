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
public final class aend extends aekx implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    public transient long[] b;
    protected transient long[] c;
    protected transient int d;
    public transient boolean e;
    public transient int f;
    protected transient int g;
    protected final transient int h;
    protected int i;
    protected transient aepx j;
    protected transient aepb k;
    protected transient aemy l;

    public aend(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        int iP = adqs.p(i, 0.75f);
        this.f = iP;
        this.h = iP;
        this.d = iP - 1;
        this.g = adqs.q(iP, 0.75f);
        int i2 = this.f + 1;
        this.b = new long[i2];
        this.c = new long[i2];
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int iP = adqs.p(this.i, 0.75f);
        this.f = iP;
        this.g = adqs.q(iP, 0.75f);
        int i2 = this.f;
        this.d = i2 - 1;
        int i3 = i2 + 1;
        long[] jArr = new long[i3];
        this.b = jArr;
        long[] jArr2 = new long[i3];
        this.c = jArr2;
        int i4 = this.i;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            long j = objectInputStream.readLong();
            long j2 = objectInputStream.readLong();
            if (j == 0) {
                i = this.f;
                this.e = true;
                j = 0;
            } else {
                int i6 = this.d;
                long j3 = (-7046029254386353131L) * j;
                long j4 = j3 ^ (j3 >>> 32);
                int i7 = (int) (j4 ^ (j4 >>> 16));
                while (true) {
                    i = i6 & i7;
                    if (jArr[i] != 0) {
                        i6 = i + 1;
                        i7 = this.d;
                    }
                }
            }
            jArr[i] = j;
            jArr2[i] = j2;
            i4 = i5;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        long[] jArr = this.b;
        long[] jArr2 = this.c;
        aemt aemtVar = new aemt(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.i; i != 0; i--) {
            int iB = aemtVar.b();
            objectOutputStream.writeLong(jArr[iB]);
            objectOutputStream.writeLong(jArr2[iB]);
        }
    }

    @Override // defpackage.aemo
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final aemy u() {
        aemy aemyVar = this.l;
        if (aemyVar != null) {
            return aemyVar;
        }
        aemy aemyVar2 = new aemy(this);
        this.l = aemyVar2;
        return aemyVar2;
    }

    @Override // defpackage.aekw, defpackage.aemj
    public final long b(long j, long j2) {
        int i;
        long j3;
        if (j != 0) {
            long[] jArr = this.b;
            long j4 = (-7046029254386353131L) * j;
            long j5 = j4 ^ (j4 >>> 32);
            int i2 = this.d & ((int) (j5 ^ (j5 >>> 16)));
            long j6 = jArr[i2];
            if (j6 == 0) {
                i = -(i2 + 1);
                break;
            }
            if (j != j6) {
                do {
                    i2 = (i2 + 1) & this.d;
                    j3 = jArr[i2];
                    if (j3 == 0) {
                        i = -(i2 + 1);
                        break;
                    }
                } while (j != j3);
            }
            i = i2;
        } else {
            boolean z = this.e;
            i = this.f;
            if (!z) {
                i = -(i + 1);
            }
        }
        if (i >= 0) {
            long[] jArr2 = this.c;
            long j7 = jArr2[i];
            jArr2[i] = j2;
            return j7;
        }
        int i3 = (-i) - 1;
        if (i3 == this.f) {
            this.e = true;
        }
        this.b[i3] = j;
        this.c[i3] = j2;
        int i4 = this.i;
        this.i = i4 + 1;
        if (i4 >= this.g) {
            z(adqs.p(i4 + 2, 0.75f));
        }
        return this.a;
    }

    @Override // defpackage.aekw, defpackage.aemj
    public final long c(long j) {
        long j2;
        if (j != 0) {
            long[] jArr = this.b;
            long j3 = (-7046029254386353131L) * j;
            long j4 = j3 ^ (j3 >>> 32);
            int i = this.d & ((int) (j4 ^ (j4 >>> 16)));
            long j5 = jArr[i];
            if (j5 != 0) {
                if (j == j5) {
                    return w(i);
                }
                do {
                    i = (i + 1) & this.d;
                    j2 = jArr[i];
                    if (j2 != 0) {
                    }
                } while (j != j2);
                return w(i);
            }
        } else if (this.e) {
            return x();
        }
        return this.a;
    }

    @Override // defpackage.aekx, java.util.Map
    public final void clear() {
        if (this.i == 0) {
            return;
        }
        this.i = 0;
        this.e = false;
        Arrays.fill(this.b, 0L);
    }

    @Override // defpackage.aekx, defpackage.aekw, defpackage.aemj
    public final boolean e(long j) {
        long j2;
        if (j == 0) {
            return this.e;
        }
        long[] jArr = this.b;
        long j3 = (-7046029254386353131L) * j;
        long j4 = j3 ^ (j3 >>> 32);
        int i = this.d & ((int) (j4 ^ (j4 >>> 16)));
        long j5 = jArr[i];
        if (j5 == 0) {
            return false;
        }
        if (j != j5) {
            do {
                i = (i + 1) & this.d;
                j2 = jArr[i];
                if (j2 == 0) {
                    return false;
                }
            } while (j != j2);
        }
        return true;
    }

    @Override // defpackage.aekx, defpackage.aemo
    /* renamed from: f */
    public final aepb values() {
        if (this.k == null) {
            this.k = new aems(this);
        }
        return this.k;
    }

    @Override // defpackage.aekx, defpackage.aemo
    /* renamed from: g */
    public final aepx keySet() {
        if (this.j == null) {
            this.j = new aemw(this);
        }
        return this.j;
    }

    @Override // defpackage.aekx, java.util.Map
    public final int hashCode() {
        long j;
        int i;
        long[] jArr = this.b;
        long[] jArr2 = this.c;
        int iV = v();
        int iG = 0;
        int i2 = 0;
        while (iV != 0) {
            while (true) {
                j = jArr[i2];
                i = i2 + 1;
                if (j == 0) {
                    i2 = i;
                }
            }
            iV--;
            iG += a.g(jArr2[i2]) ^ a.g(j);
            i2 = i;
        }
        return this.e ? iG + a.g(jArr2[this.f]) : iG;
    }

    @Override // defpackage.aekx, java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    @Override // defpackage.aekx, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aekx, java.util.Map
    public final void putAll(Map<? extends Long, ? extends Long> map) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil((this.i + map.size()) / 0.75f)) - 1))));
        if (iMin > this.f) {
            z(iMin);
        }
        if (map instanceof aemo) {
            aety aetyVarA = aemr.a((aemo) map);
            while (aetyVarA.hasNext()) {
                aemx aemxVar = (aemx) aetyVarA.next();
                b(aemxVar.a(), aemxVar.b());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends Long, ? extends Long>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends Long, ? extends Long> next = it.next();
            adqq.aX(this, next.getKey(), next.getValue());
        }
    }

    @Override // defpackage.aekx, defpackage.aemo
    public final boolean r(long j) {
        long[] jArr = this.b;
        long[] jArr2 = this.c;
        if (this.e && jArr2[this.f] == j) {
            return true;
        }
        int i = this.f;
        while (i != 0) {
            i--;
            if (jArr[i] != 0 && jArr2[i] == j) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aekw, defpackage.aeee
    public final int size() {
        return this.i;
    }

    @Override // defpackage.aemj
    public final long t(long j) {
        long j2;
        if (j == 0) {
            return this.e ? this.c[this.f] : this.a;
        }
        long[] jArr = this.b;
        long j3 = (-7046029254386353131L) * j;
        long j4 = j3 ^ (j3 >>> 32);
        int i = this.d & ((int) (j4 ^ (j4 >>> 16)));
        long j5 = jArr[i];
        if (j5 != 0) {
            if (j == j5) {
                return this.c[i];
            }
            do {
                i = (i + 1) & this.d;
                j2 = jArr[i];
                if (j2 != 0) {
                }
            } while (j != j2);
            return this.c[i];
        }
        return this.a;
    }

    public final int v() {
        boolean z = this.e;
        int i = this.i;
        return z ? i - 1 : i;
    }

    @Override // defpackage.aekx, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    public final long w(int i) {
        long j;
        long[] jArr = this.c;
        long j2 = jArr[i];
        this.i--;
        long[] jArr2 = this.b;
        loop0: while (true) {
            int i2 = (i + 1) & this.d;
            while (true) {
                j = jArr2[i2];
                if (j == 0) {
                    break loop0;
                }
                int i3 = this.d;
                long j3 = (-7046029254386353131L) * j;
                long j4 = j3 ^ (j3 >>> 32);
                int i4 = ((int) (j4 ^ (j4 >>> 16))) & i3;
                if (i <= i2) {
                    if (i >= i4 || i4 > i2) {
                        break;
                    }
                    i2 = (i2 + 1) & i3;
                } else if (i < i4 || i4 <= i2) {
                    i2 = (i2 + 1) & i3;
                }
            }
            jArr2[i] = j;
            jArr[i] = jArr[i2];
            i = i2;
        }
        jArr2[i] = 0;
        int i5 = this.f;
        if (i5 > this.h && this.i < this.g / 4 && i5 > 16) {
            z(i5 >> 1);
        }
        return j2;
    }

    public final long x() {
        this.e = false;
        long[] jArr = this.c;
        int i = this.f;
        long j = jArr[i];
        int i2 = this.i - 1;
        this.i = i2;
        if (i > this.h && i2 < this.g / 4 && i > 16) {
            z(i >> 1);
        }
        return j;
    }

    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final aend clone() {
        try {
            aend aendVar = (aend) super.clone();
            aendVar.j = null;
            aendVar.k = null;
            aendVar.l = null;
            aendVar.e = this.e;
            aendVar.b = (long[]) this.b.clone();
            aendVar.c = (long[]) this.c.clone();
            return aendVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    protected final void z(int i) {
        long j;
        int i2 = i + 1;
        long[] jArr = this.b;
        long[] jArr2 = this.c;
        long[] jArr3 = new long[i2];
        long[] jArr4 = new long[i2];
        int i3 = this.f;
        int iV = v();
        while (true) {
            int i4 = i - 1;
            if (iV == 0) {
                jArr4[i] = jArr2[this.f];
                this.f = i;
                this.d = i4;
                this.g = adqs.q(i, 0.75f);
                this.b = jArr3;
                this.c = jArr4;
                return;
            }
            do {
                i3--;
                j = jArr[i3];
            } while (j == 0);
            long j2 = j * (-7046029254386353131L);
            long j3 = j2 ^ (j2 >>> 32);
            int i5 = ((int) (j3 ^ (j3 >>> 16))) & i4;
            if (jArr3[i5] != 0) {
                do {
                    i5 = (i5 + 1) & i4;
                } while (jArr3[i5] != 0);
            }
            jArr3[i5] = jArr[i3];
            jArr4[i5] = jArr2[i3];
            iV--;
        }
    }

    public aend() {
        this(16);
    }
}
