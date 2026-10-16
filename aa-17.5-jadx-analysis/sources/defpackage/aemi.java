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
public final class aemi extends aekv implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient long[] a;
    protected transient int[] b;
    protected transient int c;
    protected transient boolean d;
    protected transient int e;
    protected transient int f;
    protected final transient int g;
    public int h;
    protected transient aepx i;
    protected transient aejf j;
    protected transient aemd k;

    public aemi(byte[] bArr) {
        int iP = adqs.p(16, 0.75f);
        this.e = iP;
        this.g = iP;
        this.c = iP - 1;
        this.f = adqs.q(iP, 0.75f);
        int i = this.e + 1;
        this.a = new long[i];
        this.b = new int[i];
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
        int[] iArr = new int[i4];
        this.b = iArr;
        int i5 = this.h;
        while (true) {
            int i6 = i5 - 1;
            if (i5 == 0) {
                return;
            }
            long j = objectInputStream.readLong();
            int i7 = objectInputStream.readInt();
            long j2 = 0;
            if (j == 0) {
                i2 = this.e;
                this.d = true;
            } else {
                int i8 = this.c;
                long j3 = (-7046029254386353131L) * j;
                long j4 = j3 ^ (j3 >>> 32);
                int i9 = (int) (j4 ^ (j4 >>> 16));
                while (true) {
                    i = i8 & i9;
                    if (jArr[i] == 0) {
                        break;
                    }
                    i8 = i + 1;
                    i9 = this.c;
                }
                j2 = j;
                i2 = i;
            }
            jArr[i2] = j2;
            iArr[i2] = i7;
            i5 = i6;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        long[] jArr = this.a;
        int[] iArr = this.b;
        aelw aelwVar = new aelw(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.h; i != 0; i--) {
            int iB = aelwVar.b();
            objectOutputStream.writeLong(jArr[iB]);
            objectOutputStream.writeInt(iArr[iB]);
        }
    }

    @Override // defpackage.aeku, defpackage.aelo
    public final int a(long j, int i) {
        int i2;
        long j2;
        if (j != 0) {
            long[] jArr = this.a;
            long j3 = (-7046029254386353131L) * j;
            long j4 = j3 ^ (j3 >>> 32);
            int i3 = this.c & ((int) (j4 ^ (j4 >>> 16)));
            long j5 = jArr[i3];
            if (j5 == 0) {
                i2 = -(i3 + 1);
                break;
            }
            if (j != j5) {
                do {
                    i3 = (i3 + 1) & this.c;
                    j2 = jArr[i3];
                    if (j2 == 0) {
                        i2 = -(i3 + 1);
                        break;
                    }
                } while (j != j2);
            }
            i2 = i3;
        } else {
            boolean z = this.d;
            i2 = this.e;
            if (!z) {
                i2 = -(i2 + 1);
            }
        }
        if (i2 >= 0) {
            int[] iArr = this.b;
            int i4 = iArr[i2];
            iArr[i2] = i;
            return i4;
        }
        int i5 = (-i2) - 1;
        if (i5 == this.e) {
            this.d = true;
        }
        this.a[i5] = j;
        this.b[i5] = i;
        int i6 = this.h;
        this.h = i6 + 1;
        if (i6 < this.f) {
            return 0;
        }
        y(adqs.p(i6 + 2, 0.75f));
        return 0;
    }

    @Override // defpackage.aeku, defpackage.aelo
    public final int b(long j) {
        long j2;
        if (j == 0) {
            if (this.d) {
                return w();
            }
            return 0;
        }
        long[] jArr = this.a;
        long j3 = (-7046029254386353131L) * j;
        long j4 = j3 ^ (j3 >>> 32);
        int i = this.c & ((int) (j4 ^ (j4 >>> 16)));
        long j5 = jArr[i];
        if (j5 == 0) {
            return 0;
        }
        if (j == j5) {
            return v(i);
        }
        do {
            i = (i + 1) & this.c;
            j2 = jArr[i];
            if (j2 == 0) {
                return 0;
            }
        } while (j != j2);
        return v(i);
    }

    @Override // defpackage.aekv, java.util.Map
    public final void clear() {
        if (this.h == 0) {
            return;
        }
        this.h = 0;
        this.d = false;
        Arrays.fill(this.a, 0L);
    }

    @Override // defpackage.aekv, defpackage.aeku, defpackage.aelo
    public final boolean d(long j) {
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

    @Override // defpackage.aekv
    /* renamed from: e */
    public final aejf values() {
        if (this.j == null) {
            this.j = new aelv(this);
        }
        return this.j;
    }

    @Override // defpackage.aekv
    /* renamed from: f */
    public final aepx keySet() {
        if (this.i == null) {
            this.i = new aema(this);
        }
        return this.i;
    }

    @Override // defpackage.aekv, java.util.Map
    public final int hashCode() {
        long j;
        int i;
        long[] jArr = this.a;
        int[] iArr = this.b;
        int iU = u();
        int iG = 0;
        int i2 = 0;
        while (iU != 0) {
            while (true) {
                j = jArr[i2];
                i = i2 + 1;
                if (j == 0) {
                    i2 = i;
                }
            }
            iU--;
            iG += iArr[i2] ^ a.g(j);
            i2 = i;
        }
        return this.d ? iG + iArr[this.e] : iG;
    }

    @Override // defpackage.aekv, java.util.Map
    public final boolean isEmpty() {
        return this.h == 0;
    }

    @Override // defpackage.aekv, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aekv, java.util.Map
    public final void putAll(Map<? extends Long, ? extends Integer> map) {
        int iMin = (int) Math.min(1073741824L, Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil((this.h + map.size()) / 0.75f)) - 1))));
        if (iMin > this.e) {
            y(iMin);
        }
        if (map instanceof aels) {
            aety aetyVarA = aelu.a((aels) map);
            while (aetyVarA.hasNext()) {
                aemc aemcVar = (aemc) aetyVarA.next();
                a(aemcVar.b(), aemcVar.a());
            }
            return;
        }
        int size = map.size();
        Iterator<Map.Entry<? extends Long, ? extends Integer>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            Map.Entry<? extends Long, ? extends Integer> next = it.next();
            aeec.K(this, next.getKey(), next.getValue());
        }
    }

    @Override // defpackage.aekv, defpackage.aels
    public final boolean q(int i) {
        long[] jArr = this.a;
        int[] iArr = this.b;
        if (this.d && iArr[this.e] == i) {
            return true;
        }
        int i2 = this.e;
        while (i2 != 0) {
            i2--;
            if (jArr[i2] != 0 && iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aelo
    public final int s(long j) {
        long j2;
        if (j == 0) {
            if (this.d) {
                return this.b[this.e];
            }
            return 0;
        }
        long[] jArr = this.a;
        long j3 = (-7046029254386353131L) * j;
        long j4 = j3 ^ (j3 >>> 32);
        int i = this.c & ((int) (j4 ^ (j4 >>> 16)));
        long j5 = jArr[i];
        if (j5 == 0) {
            return 0;
        }
        if (j == j5) {
            return this.b[i];
        }
        do {
            i = (i + 1) & this.c;
            j2 = jArr[i];
            if (j2 == 0) {
                return 0;
            }
        } while (j != j2);
        return this.b[i];
    }

    @Override // defpackage.aeku, defpackage.aeee
    public final int size() {
        return this.h;
    }

    @Override // defpackage.aels
    public final /* bridge */ /* synthetic */ aeum t() {
        aemd aemdVar = this.k;
        if (aemdVar != null) {
            return aemdVar;
        }
        aemd aemdVar2 = new aemd(this);
        this.k = aemdVar2;
        return aemdVar2;
    }

    public final int u() {
        boolean z = this.d;
        int i = this.h;
        return z ? i - 1 : i;
    }

    public final int v(int i) {
        long j;
        int[] iArr = this.b;
        int i2 = iArr[i];
        this.h--;
        long[] jArr = this.a;
        loop0: while (true) {
            int i3 = (i + 1) & this.c;
            while (true) {
                j = jArr[i3];
                if (j == 0) {
                    break loop0;
                }
                int i4 = this.c;
                long j2 = (-7046029254386353131L) * j;
                long j3 = j2 ^ (j2 >>> 32);
                int i5 = ((int) (j3 ^ (j3 >>> 16))) & i4;
                if (i <= i3) {
                    if (i >= i5 || i5 > i3) {
                        break;
                    }
                    i3 = (i3 + 1) & i4;
                } else if (i < i5 || i5 <= i3) {
                    i3 = (i3 + 1) & i4;
                }
            }
            jArr[i] = j;
            iArr[i] = iArr[i3];
            i = i3;
        }
        jArr[i] = 0;
        int i6 = this.e;
        if (i6 > this.g && this.h < this.f / 4 && i6 > 16) {
            y(i6 >> 1);
        }
        return i2;
    }

    @Override // defpackage.aekv, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    public final int w() {
        this.d = false;
        int[] iArr = this.b;
        int i = this.e;
        int i2 = iArr[i];
        int i3 = this.h - 1;
        this.h = i3;
        if (i > this.g && i3 < this.f / 4 && i > 16) {
            y(i >> 1);
        }
        return i2;
    }

    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final aemi clone() {
        try {
            aemi aemiVar = (aemi) super.clone();
            aemiVar.i = null;
            aemiVar.j = null;
            aemiVar.k = null;
            aemiVar.d = this.d;
            aemiVar.a = (long[]) this.a.clone();
            aemiVar.b = (int[]) this.b.clone();
            return aemiVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    protected final void y(int i) {
        long j;
        int i2 = i + 1;
        long[] jArr = this.a;
        int[] iArr = this.b;
        long[] jArr2 = new long[i2];
        int[] iArr2 = new int[i2];
        int i3 = this.e;
        int iU = u();
        while (true) {
            int i4 = i - 1;
            if (iU == 0) {
                iArr2[i] = iArr[this.e];
                this.e = i;
                this.c = i4;
                this.f = adqs.q(i, 0.75f);
                this.a = jArr2;
                this.b = iArr2;
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
            iArr2[i5] = iArr[i3];
            iU--;
        }
    }

    public final void z(int i) {
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(i / 0.75f)) - 1));
        if (iNumberOfLeadingZeros >= this.e || this.h > adqs.q(iNumberOfLeadingZeros, 0.75f)) {
            return;
        }
        try {
            y(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    public aemi() {
        throw null;
    }
}
