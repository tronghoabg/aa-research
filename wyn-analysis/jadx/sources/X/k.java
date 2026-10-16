package X;

import java.util.ArrayList;
import java.util.Iterator;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public final class k implements Iterable, InterfaceC4291a {

    /* renamed from: e, reason: collision with root package name */
    public static final k f15710e = new k(0, 0, 0, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f15711a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15712b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15713c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f15714d;

    public k(long j8, long j10, int i5, int[] iArr) {
        this.f15711a = j8;
        this.f15712b = j10;
        this.f15713c = i5;
        this.f15714d = iArr;
    }

    public final k a(k kVar) {
        k kVarC;
        int[] iArr;
        k kVar2 = f15710e;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar2;
        }
        int i5 = kVar.f15713c;
        int[] iArr2 = kVar.f15714d;
        long j8 = kVar.f15712b;
        long j10 = kVar.f15711a;
        int i10 = this.f15713c;
        if (i5 == i10 && iArr2 == (iArr = this.f15714d)) {
            return new k(this.f15711a & (~j10), this.f15712b & (~j8), i10, iArr);
        }
        if (iArr2 != null) {
            kVarC = this;
            for (int i11 : iArr2) {
                kVarC = kVarC.c(i11);
            }
        } else {
            kVarC = this;
        }
        int i12 = kVar.f15713c;
        if (j8 != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                if (((1 << i13) & j8) != 0) {
                    kVarC = kVarC.c(i13 + i12);
                }
            }
        }
        if (j10 != 0) {
            for (int i14 = 0; i14 < 64; i14++) {
                if (((1 << i14) & j10) != 0) {
                    kVarC = kVarC.c(i14 + 64 + i12);
                }
            }
        }
        return kVarC;
    }

    public final k c(int i5) {
        int[] iArr;
        int iB;
        int i10 = this.f15713c;
        int i11 = i5 - i10;
        if (i11 >= 0 && i11 < 64) {
            long j8 = 1 << i11;
            long j10 = this.f15712b;
            if ((j10 & j8) != 0) {
                return new k(this.f15711a, j10 & (~j8), i10, this.f15714d);
            }
        } else if (i11 >= 64 && i11 < 128) {
            long j11 = 1 << (i11 - 64);
            long j12 = this.f15711a;
            if ((j12 & j11) != 0) {
                return new k((~j11) & j12, this.f15712b, i10, this.f15714d);
            }
        } else if (i11 < 0 && (iArr = this.f15714d) != null && (iB = q.b(i5, iArr)) >= 0) {
            int length = iArr.length;
            int i12 = length - 1;
            if (i12 == 0) {
                return new k(this.f15711a, this.f15712b, this.f15713c, null);
            }
            int[] iArr2 = new int[i12];
            if (iB > 0) {
                ff.m.g0(0, 0, iB, iArr, iArr2);
            }
            if (iB < i12) {
                ff.m.g0(iB, iB + 1, length, iArr, iArr2);
            }
            return new k(this.f15711a, this.f15712b, this.f15713c, iArr2);
        }
        return this;
    }

    public final boolean d(int i5) {
        int[] iArr;
        int i10 = i5 - this.f15713c;
        return (i10 < 0 || i10 >= 64) ? (i10 < 64 || i10 >= 128) ? i10 <= 0 && (iArr = this.f15714d) != null && q.b(i5, iArr) >= 0 : ((1 << (i10 - 64)) & this.f15711a) != 0 : ((1 << i10) & this.f15712b) != 0;
    }

    public final k e(k kVar) {
        k kVarF;
        int[] iArr;
        k kVarF2 = kVar;
        k kVar2 = f15710e;
        if (kVarF2 == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVarF2;
        }
        int i5 = kVarF2.f15713c;
        long j8 = this.f15712b;
        long j10 = this.f15711a;
        int[] iArr2 = kVarF2.f15714d;
        long j11 = kVarF2.f15712b;
        long j12 = kVarF2.f15711a;
        int i10 = this.f15713c;
        if (i5 == i10 && iArr2 == (iArr = this.f15714d)) {
            return new k(j10 | j12, j8 | j11, i10, iArr);
        }
        int i11 = 0;
        int[] iArr3 = this.f15714d;
        if (iArr3 == null) {
            if (iArr3 != null) {
                for (int i12 : iArr3) {
                    kVarF2 = kVarF2.f(i12);
                }
            }
            int i13 = this.f15713c;
            if (j8 != 0) {
                for (int i14 = 0; i14 < 64; i14++) {
                    if (((1 << i14) & j8) != 0) {
                        kVarF2 = kVarF2.f(i14 + i13);
                    }
                }
            }
            if (j10 != 0) {
                while (i11 < 64) {
                    if (((1 << i11) & j10) != 0) {
                        kVarF2 = kVarF2.f(i11 + 64 + i13);
                    }
                    i11++;
                }
            }
            return kVarF2;
        }
        if (iArr2 != null) {
            kVarF = this;
            for (int i15 : iArr2) {
                kVarF = kVarF.f(i15);
            }
        } else {
            kVarF = this;
        }
        int i16 = kVarF2.f15713c;
        if (j11 != 0) {
            for (int i17 = 0; i17 < 64; i17++) {
                if (((1 << i17) & j11) != 0) {
                    kVarF = kVarF.f(i17 + i16);
                }
            }
        }
        if (j12 != 0) {
            while (i11 < 64) {
                if (((1 << i11) & j12) != 0) {
                    kVarF = kVarF.f(i11 + 64 + i16);
                }
                i11++;
            }
        }
        return kVarF;
    }

    public final k f(int i5) {
        long j8;
        int i10;
        long j10;
        int i11 = this.f15713c;
        int i12 = i5 - i11;
        long j11 = this.f15712b;
        long j12 = 1;
        if (i12 < 0 || i12 >= 64) {
            long j13 = this.f15711a;
            if (i12 < 64 || i12 >= 128) {
                int[] iArrR0 = this.f15714d;
                if (i12 < 128) {
                    if (iArrR0 == null) {
                        return new k(j13, j11, i11, new int[]{i5});
                    }
                    int iB = q.b(i5, iArrR0);
                    if (iB < 0) {
                        int i13 = -(iB + 1);
                        int length = iArrR0.length;
                        int[] iArr = new int[length + 1];
                        ff.m.g0(0, 0, i13, iArrR0, iArr);
                        ff.m.g0(i13 + 1, i13, length, iArrR0, iArr);
                        iArr[i13] = i5;
                        return new k(this.f15711a, this.f15712b, this.f15713c, iArr);
                    }
                } else if (!d(i5)) {
                    int i14 = ((i5 + 1) / 64) * 64;
                    int i15 = this.f15713c;
                    ArrayList arrayList = null;
                    long j14 = j13;
                    while (true) {
                        if (i15 >= i14) {
                            j8 = j11;
                            i10 = i15;
                            break;
                        }
                        if (j11 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArrR0 != null) {
                                    int length2 = iArrR0.length;
                                    int i16 = 0;
                                    while (i16 < length2) {
                                        arrayList.add(Integer.valueOf(iArrR0[i16]));
                                        i16++;
                                        j12 = j12;
                                    }
                                }
                            }
                            j10 = j12;
                            for (int i17 = 0; i17 < 64; i17++) {
                                if (((j10 << i17) & j11) != 0) {
                                    arrayList.add(Integer.valueOf(i17 + i15));
                                }
                            }
                        } else {
                            j10 = j12;
                        }
                        if (j14 == 0) {
                            i10 = i14;
                            j8 = 0;
                            break;
                        }
                        i15 += 64;
                        j11 = j14;
                        j12 = j10;
                        j14 = 0;
                    }
                    if (arrayList != null) {
                        iArrR0 = ff.o.R0(arrayList);
                    }
                    return new k(j14, j8, i10, iArrR0).f(i5);
                }
            } else {
                long j15 = 1 << (i12 - 64);
                if ((j13 & j15) == 0) {
                    return new k(j15 | j13, j11, i11, this.f15714d);
                }
            }
        } else {
            long j16 = 1 << i12;
            if ((j11 & j16) == 0) {
                return new k(this.f15711a, j11 | j16, i11, this.f15714d);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return S3.f.x(new j(this, null));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(ff.p.a0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            i5++;
            if (i5 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) String.valueOf(obj));
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
