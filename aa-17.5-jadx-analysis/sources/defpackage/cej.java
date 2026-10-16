package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class cej implements Iterable, afgc {
    public static final cej a = new cej(0, 0, 0, null);
    public final long b;
    public final long c;
    public final long d;
    public final long[] e;

    private cej(long j, long j2, long j3, long[] jArr) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = jArr;
    }

    public final cej a(cej cejVar) {
        cej cejVarB = this;
        cej cejVar2 = a;
        if (cejVar == cejVar2) {
            return cejVarB;
        }
        if (cejVarB == cejVar2) {
            return cejVar2;
        }
        long j = cejVar.d;
        long j2 = cejVarB.d;
        if (j == j2) {
            long[] jArr = cejVar.e;
            long[] jArr2 = cejVarB.e;
            if (jArr == jArr2) {
                return new cej((~cejVar.b) & cejVarB.b, cejVarB.c & (~cejVar.c), j2, jArr2);
            }
        }
        long[] jArr3 = cejVar.e;
        if (jArr3 != null) {
            for (long j3 : jArr3) {
                cejVarB = cejVarB.b(j3);
            }
        }
        long j4 = cejVar.c;
        if (j4 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j4) != 0) {
                    cejVarB = cejVarB.b(i + j);
                }
            }
        }
        long j5 = cejVar.b;
        if (j5 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j5) != 0) {
                    cejVarB = cejVarB.b(i2 + j + 64);
                }
            }
        }
        return cejVarB;
    }

    public final cej b(long j) {
        long[] jArr;
        int iM;
        long[] jArr2;
        long j2 = this.d;
        long j3 = j - j2;
        if (affa.c(j3, 0L) >= 0 && affa.c(j3, 64L) < 0) {
            long j4 = 1 << ((int) j3);
            long j5 = this.c;
            if ((j5 & j4) != 0) {
                return new cej(this.b, j5 & (~j4), j2, this.e);
            }
        } else if (affa.c(j3, 64L) >= 0 && affa.c(j3, 128L) < 0) {
            long j6 = 1 << (((int) j3) - 64);
            long j7 = this.b;
            if ((j7 & j6) != 0) {
                return new cej((~j6) & j7, this.c, j2, this.e);
            }
        } else if (affa.c(j3, 0L) < 0 && (jArr = this.e) != null && (iM = bzi.m(jArr, j)) >= 0) {
            long j8 = this.b;
            long j9 = this.c;
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iM > 0) {
                    woy.dp(jArr, jArr3, 0, 0, iM);
                }
                if (iM < i) {
                    woy.dp(jArr, jArr3, iM, iM + 1, length);
                }
                jArr2 = jArr3;
            }
            return new cej(j8, j9, j2, jArr2);
        }
        return this;
    }

    public final cej c(cej cejVar) {
        cej cejVarD = this;
        cej cejVarD2 = cejVar;
        cej cejVar2 = a;
        if (cejVarD2 == cejVar2) {
            return cejVarD;
        }
        if (cejVarD == cejVar2) {
            return cejVarD2;
        }
        long j = cejVarD2.d;
        long j2 = cejVarD.d;
        if (j == j2) {
            long[] jArr = cejVarD2.e;
            long[] jArr2 = cejVarD.e;
            if (jArr == jArr2) {
                return new cej(cejVarD2.b | cejVarD.b, cejVarD.c | cejVarD2.c, j2, jArr2);
            }
        }
        int i = 0;
        if (cejVarD.e == null) {
            long j3 = cejVarD.c;
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        cejVarD2 = cejVarD2.d(i2 + j2);
                    }
                }
            }
            long j4 = cejVarD.b;
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        cejVarD2 = cejVarD2.d(i + j2 + 64);
                    }
                    i++;
                }
            }
            return cejVarD2;
        }
        long[] jArr3 = cejVarD2.e;
        if (jArr3 != null) {
            for (long j5 : jArr3) {
                cejVarD = cejVarD.d(j5);
            }
        }
        long j6 = cejVarD2.c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    cejVarD = cejVarD.d(i3 + j);
                }
            }
        }
        long j7 = cejVarD2.b;
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    cejVarD = cejVarD.d(i + j + 64);
                }
                i++;
            }
        }
        return cejVarD;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cej d(long r31) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cej.d(long):cej");
    }

    public final boolean e(long j) {
        long[] jArr;
        long j2 = j - this.d;
        if (affa.c(j2, 0L) < 0 || affa.c(j2, 64L) >= 0) {
            if (affa.c(j2, 64L) < 0 || affa.c(j2, 128L) >= 0) {
                if (affa.c(j2, 0L) <= 0 && (jArr = this.e) != null && bzi.m(jArr, j) >= 0) {
                    return true;
                }
            } else if (((1 << (((int) j2) - 64)) & this.b) != 0) {
                return true;
            }
        } else if (((1 << ((int) j2)) & this.c) != 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new afbb(new cei(this, null), 3).a();
    }

    public final String toString() throws IOException {
        String string = super.toString();
        ArrayList arrayList = new ArrayList(woy.bp(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return string + " [" + sb.toString() + "]";
    }
}
