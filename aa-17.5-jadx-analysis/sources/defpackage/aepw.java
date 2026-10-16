package defpackage;

import j$.util.Spliterator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aepw extends aell implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient long[] a;
    protected transient int b;
    protected transient boolean c;
    protected transient int d;
    protected transient int e;
    protected final transient int f;
    protected int g;
    protected final float h;

    public aepw(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.h = 0.75f;
        int iP = adqs.p(i, 0.75f);
        this.d = iP;
        this.f = iP;
        this.b = iP - 1;
        this.e = adqs.q(iP, 0.75f);
        this.a = new long[this.d + 1];
    }

    private final void q(long j) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil(j / this.h)) - 1))));
        if (iMin > this.d) {
            p(iMin);
        }
    }

    private final void r(int i) {
        long j;
        this.g--;
        long[] jArr = this.a;
        loop0: while (true) {
            int i2 = (i + 1) & this.b;
            while (true) {
                j = jArr[i2];
                if (j == 0) {
                    break loop0;
                }
                int i3 = this.b;
                long j2 = (-7046029254386353131L) * j;
                long j3 = j2 ^ (j2 >>> 32);
                int i4 = ((int) (j3 ^ (j3 >>> 16))) & i3;
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
            jArr[i] = j;
            i = i2;
        }
        jArr[i] = 0;
        int i5 = this.d;
        if (i5 <= this.f || this.g >= this.e / 4 || i5 <= 16) {
            return;
        }
        p(i5 >> 1);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.g;
        float f = this.h;
        int iP = adqs.p(i2, f);
        this.d = iP;
        this.e = adqs.q(iP, f);
        int i3 = this.d;
        this.b = i3 - 1;
        long[] jArr = new long[i3 + 1];
        this.a = jArr;
        int i4 = this.g;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            long j = objectInputStream.readLong();
            if (j == 0) {
                i = this.d;
                this.c = true;
                j = 0;
            } else {
                long j2 = (-7046029254386353131L) * j;
                long j3 = j2 ^ (j2 >>> 32);
                i = this.b & ((int) (j3 ^ (j3 >>> 16)));
                if (jArr[i] != 0) {
                    do {
                        i = (i + 1) & this.b;
                    } while (jArr[i] != 0);
                }
            }
            jArr[i] = j;
            i4 = i5;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        aepu aepuVar = new aepu(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.g; i != 0; i--) {
            objectOutputStream.writeLong(aepuVar.nextLong());
        }
    }

    @Override // defpackage.aell, defpackage.aeld, defpackage.aepb
    /* renamed from: a */
    public final aepm m() {
        return new aepu(this);
    }

    @Override // defpackage.aeld, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends Long> collection) {
        if (this.h <= 0.5d) {
            o(collection.size());
        } else {
            q(this.g + collection.size());
        }
        return super.addAll(collection);
    }

    @Override // defpackage.aell, defpackage.aeld, defpackage.aepb
    /* renamed from: b */
    public final aeqd spliterator() {
        return new aepv(this);
    }

    @Override // defpackage.aeld, defpackage.aepb
    public final boolean c(long j) {
        long j2;
        if (j != 0) {
            long[] jArr = this.a;
            long j3 = (-7046029254386353131L) * j;
            long j4 = j3 ^ (j3 >>> 32);
            int i = this.b & ((int) (j4 ^ (j4 >>> 16)));
            long j5 = jArr[i];
            if (j5 != 0) {
                if (j5 != j) {
                    do {
                        i = (i + 1) & this.b;
                        j2 = jArr[i];
                        if (j2 != 0) {
                        }
                    } while (j2 != j);
                }
                return false;
            }
            jArr[i] = j;
        } else {
            if (this.c) {
                return false;
            }
            this.c = true;
        }
        int i2 = this.g;
        this.g = i2 + 1;
        if (i2 >= this.e) {
            p(adqs.p(i2 + 2, this.h));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.g == 0) {
            return;
        }
        this.g = 0;
        this.c = false;
        Arrays.fill(this.a, 0L);
    }

    @Override // defpackage.aeld
    public final boolean d(aepb aepbVar) {
        if (this.h <= 0.5d) {
            o(aepbVar.size());
        } else {
            q(this.g + aepbVar.size());
        }
        return super.d(aepbVar);
    }

    @Override // defpackage.aeld, defpackage.aepb
    public final boolean e(long j) {
        long j2;
        if (j == 0) {
            return this.c;
        }
        long[] jArr = this.a;
        long j3 = (-7046029254386353131L) * j;
        long j4 = j3 ^ (j3 >>> 32);
        int i = this.b & ((int) (j4 ^ (j4 >>> 16)));
        long j5 = jArr[i];
        if (j5 == 0) {
            return false;
        }
        if (j != j5) {
            do {
                i = (i + 1) & this.b;
                j2 = jArr[i];
                if (j2 == 0) {
                    return false;
                }
            } while (j != j2);
        }
        return true;
    }

    @Override // defpackage.aell, java.util.Collection, java.util.Set
    public final int hashCode() {
        long j;
        long[] jArr = this.a;
        int iG = 0;
        int i = 0;
        for (int iM = m(); iM != 0; iM--) {
            do {
                j = jArr[i];
                i++;
            } while (j == 0);
            iG += a.g(j);
        }
        return iG;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.g == 0;
    }

    @Override // defpackage.aell, defpackage.aeld, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* synthetic */ Iterator m() {
        return new aepu(this);
    }

    @Override // defpackage.aell
    public final boolean l(long j) {
        long j2;
        if (j == 0) {
            if (!this.c) {
                return false;
            }
            this.c = false;
            long[] jArr = this.a;
            int i = this.d;
            jArr[i] = 0;
            int i2 = this.g - 1;
            this.g = i2;
            if (i > this.f && i2 < this.e / 4 && i > 16) {
                p(i >> 1);
            }
            return true;
        }
        long[] jArr2 = this.a;
        long j3 = (-7046029254386353131L) * j;
        long j4 = j3 ^ (j3 >>> 32);
        int i3 = ((int) (j4 ^ (j4 >>> 16))) & this.b;
        long j5 = jArr2[i3];
        if (j5 == 0) {
            return false;
        }
        if (j == j5) {
            r(i3);
            return true;
        }
        do {
            i3 = (i3 + 1) & this.b;
            j2 = jArr2[i3];
            if (j2 == 0) {
                return false;
            }
        } while (j != j2);
        r(i3);
        return true;
    }

    public final int m() {
        boolean z = this.c;
        int i = this.g;
        return z ? i - 1 : i;
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final aepw clone() {
        try {
            aepw aepwVar = (aepw) super.clone();
            aepwVar.a = (long[]) this.a.clone();
            aepwVar.c = this.c;
            return aepwVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final void o(int i) {
        int iP = adqs.p(i, this.h);
        if (iP > this.d) {
            p(iP);
        }
    }

    protected final void p(int i) {
        long j;
        long[] jArr = this.a;
        long[] jArr2 = new long[i + 1];
        int i2 = this.d;
        int iM = m();
        while (true) {
            int i3 = i - 1;
            if (iM == 0) {
                this.d = i;
                this.b = i3;
                this.e = adqs.q(i, this.h);
                this.a = jArr2;
                return;
            }
            do {
                i2--;
                j = jArr[i2];
            } while (j == 0);
            long j2 = j * (-7046029254386353131L);
            long j3 = j2 ^ (j2 >>> 32);
            int i4 = ((int) (j3 ^ (j3 >>> 16))) & i3;
            if (jArr2[i4] != 0) {
                do {
                    i4 = (i4 + 1) & i3;
                } while (jArr2[i4] != 0);
            }
            jArr2[i4] = jArr[i2];
            iM--;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // defpackage.aell, defpackage.aeld, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return new aepv(this);
    }

    public aepw() {
        this(16);
    }
}
