package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ycw<E> extends defpackage.ydb<E> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    public transient defpackage.ymr a = f();
    public transient long b;

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        this.a = f();
        for (int i2 = 0; i2 < i; i2++) {
            h(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(l().size());
        for (defpackage.ymg ymgVar : l()) {
            objectOutputStream.writeObject(ymgVar.b());
            objectOutputStream.writeInt(ymgVar.a());
        }
    }

    @Override // defpackage.ymh
    public final int a(java.lang.Object obj) {
        defpackage.ymr ymrVar = this.a;
        int iE = ymrVar.e(obj);
        if (iE == -1) {
            return 0;
        }
        return ymrVar.b[iE];
    }

    @Override // defpackage.ydb
    public final int b() {
        return this.a.c;
    }

    @Override // defpackage.ydb, defpackage.ymh
    public final int c(java.lang.Object obj, int i) {
        defpackage.ysr.ba(true, "occurrences cannot be negative: %s", i);
        int iE = this.a.e(obj);
        if (iE == -1) {
            return 0;
        }
        int iC = this.a.c(iE);
        defpackage.ymr ymrVar = this.a;
        if (iC > i) {
            ymrVar.k(iE, iC - i);
        } else {
            ymrVar.h(iE);
            i = iC;
        }
        this.b -= (long) i;
        return iC;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        defpackage.ymr ymrVar = this.a;
        ymrVar.d++;
        java.util.Arrays.fill(ymrVar.a, 0, ymrVar.c, (java.lang.Object) null);
        java.util.Arrays.fill(ymrVar.b, 0, ymrVar.c, 0);
        java.util.Arrays.fill(ymrVar.e, -1);
        java.util.Arrays.fill(ymrVar.f, -1L);
        ymrVar.c = 0;
        this.b = 0L;
    }

    @Override // defpackage.ydb
    public final java.util.Iterator d() {
        return new defpackage.yct(this);
    }

    @Override // defpackage.ydb
    public final java.util.Iterator e() {
        return new defpackage.ycu(this);
    }

    public abstract defpackage.ymr f();

    @Override // defpackage.ydb, defpackage.ymh
    public final boolean g(java.lang.Object obj, int i) {
        defpackage.ysr.aL(i, "oldCount");
        int iE = this.a.e(obj);
        if (iE == -1) {
            return i == 0;
        }
        if (this.a.c(iE) != i) {
            return false;
        }
        this.a.h(iE);
        this.b -= (long) i;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    @Override // defpackage.ydb, defpackage.ymh
    public final void h(java.lang.Object obj, int i) {
        long j;
        if (i == 0) {
            a(obj);
            return;
        }
        defpackage.ysr.ba(i > 0, "occurrences cannot be negative: %s", i);
        int iE = this.a.e(obj);
        defpackage.ymr ymrVar = this.a;
        if (iE != -1) {
            long j2 = i;
            long jC = ((long) ymrVar.c(iE)) + j2;
            defpackage.ysr.bb(jC <= 2147483647L, "too many occurrences: %s", jC);
            this.a.k(iE, (int) jC);
            this.b += j2;
            return;
        }
        defpackage.ysr.aK(i, "count");
        long[] jArr = ymrVar.f;
        java.lang.Object[] objArr = ymrVar.a;
        int[] iArr = ymrVar.b;
        int iAA = defpackage.ysr.aA(obj);
        int iD = ymrVar.d() & iAA;
        int i2 = ymrVar.c;
        int[] iArr2 = ymrVar.e;
        int i3 = iArr2[iD];
        if (i3 != -1) {
            while (true) {
                long j3 = jArr[i3];
                if (defpackage.ymr.b(j3) == iAA && j$.util.Objects.equals(obj, objArr[i3])) {
                    j = i;
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                } else {
                    int i5 = (int) j3;
                    if (i5 == -1) {
                        jArr[i3] = defpackage.ymr.i(j3, i2);
                        break;
                    }
                    i3 = i5;
                }
                this.b += j;
            }
        }
        iArr2[iD] = i2;
        if (i2 == Integer.MAX_VALUE) {
            throw new java.lang.IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        long j4 = i;
        int i6 = i2 + 1;
        int length = ymrVar.f.length;
        if (i6 > length) {
            int iMax = java.lang.Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                ymrVar.a = java.util.Arrays.copyOf(ymrVar.a, iMax);
                ymrVar.b = java.util.Arrays.copyOf(ymrVar.b, iMax);
                long[] jArr2 = ymrVar.f;
                int length2 = jArr2.length;
                long[] jArrCopyOf = java.util.Arrays.copyOf(jArr2, iMax);
                if (iMax > length2) {
                    java.util.Arrays.fill(jArrCopyOf, length2, iMax, -1L);
                }
                ymrVar.f = jArrCopyOf;
            }
        }
        char c = ' ';
        long j5 = 4294967295L;
        ymrVar.f[i2] = (((long) iAA) << 32) | 4294967295L;
        ymrVar.a[i2] = obj;
        ymrVar.b[i2] = i;
        ymrVar.c = i6;
        if (i2 >= ymrVar.h) {
            int length3 = ymrVar.e.length;
            int i7 = length3 + length3;
            if (length3 >= 1073741824) {
                ymrVar.h = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
            } else {
                float f = ymrVar.g;
                int i8 = i7 + 1;
                int[] iArrL = defpackage.ymr.l(i7);
                long[] jArr3 = ymrVar.f;
                int length4 = iArrL.length - 1;
                int i9 = 0;
                while (i9 < ymrVar.c) {
                    int iB = defpackage.ymr.b(jArr3[i9]);
                    int i10 = iB & length4;
                    int i11 = iArrL[i10];
                    iArrL[i10] = i9;
                    char c2 = c;
                    long j6 = j5;
                    jArr3[i9] = (((long) i11) & j6) | (((long) iB) << c2);
                    i9++;
                    c = c2;
                    j5 = j6;
                }
                ymrVar.h = i8;
                ymrVar.e = iArrL;
            }
        }
        ymrVar.d++;
        j = j4;
        this.b += j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        return defpackage.ytn.h(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.ymh
    public final int size() {
        return defpackage.ysr.cO(this.b);
    }
}
