package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ceq implements java.lang.Iterable, defpackage.afhc {
    public static final defpackage.ceq a = new defpackage.ceq(0, 0, 0, null);
    public final long b;
    public final long c;
    public final long d;
    public final long[] e;

    private ceq(long j, long j2, long j3, long[] jArr) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = jArr;
    }

    public final defpackage.ceq a(defpackage.ceq ceqVar) {
        defpackage.ceq ceqVarB = this;
        defpackage.ceq ceqVar2 = a;
        if (ceqVar == ceqVar2) {
            return ceqVarB;
        }
        if (ceqVarB == ceqVar2) {
            return ceqVar2;
        }
        long j = ceqVar.d;
        long j2 = ceqVarB.d;
        if (j == j2) {
            long[] jArr = ceqVar.e;
            long[] jArr2 = ceqVarB.e;
            if (jArr == jArr2) {
                return new defpackage.ceq((~ceqVar.b) & ceqVarB.b, ceqVarB.c & (~ceqVar.c), j2, jArr2);
            }
        }
        long[] jArr3 = ceqVar.e;
        if (jArr3 != null) {
            for (long j3 : jArr3) {
                ceqVarB = ceqVarB.b(j3);
            }
        }
        long j4 = ceqVar.c;
        if (j4 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j4) != 0) {
                    ceqVarB = ceqVarB.b(((long) i) + j);
                }
            }
        }
        long j5 = ceqVar.b;
        if (j5 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j5) != 0) {
                    ceqVarB = ceqVarB.b(((long) i2) + j + 64);
                }
            }
        }
        return ceqVarB;
    }

    public final defpackage.ceq b(long j) {
        long[] jArr;
        int iF;
        long[] jArr2;
        long j2 = this.d;
        long j3 = j - j2;
        if (defpackage.afga.c(j3, 0L) >= 0 && defpackage.afga.c(j3, 64L) < 0) {
            long j4 = 1 << ((int) j3);
            long j5 = this.c;
            if ((j5 & j4) != 0) {
                return new defpackage.ceq(this.b, j5 & (~j4), j2, this.e);
            }
        } else if (defpackage.afga.c(j3, 64L) >= 0 && defpackage.afga.c(j3, 128L) < 0) {
            long j6 = 1 << (((int) j3) - 64);
            long j7 = this.b;
            if ((j7 & j6) != 0) {
                return new defpackage.ceq((~j6) & j7, this.c, j2, this.e);
            }
        } else if (defpackage.afga.c(j3, 0L) < 0 && (jArr = this.e) != null && (iF = defpackage.bzd.f(jArr, j)) >= 0) {
            long j8 = this.b;
            long j9 = this.c;
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iF > 0) {
                    defpackage.afga.cj(jArr, jArr3, 0, 0, iF);
                }
                if (iF < i) {
                    defpackage.afga.cj(jArr, jArr3, iF, iF + 1, length);
                }
                jArr2 = jArr3;
            }
            return new defpackage.ceq(j8, j9, j2, jArr2);
        }
        return this;
    }

    public final defpackage.ceq c(defpackage.ceq ceqVar) {
        defpackage.ceq ceqVarD = this;
        defpackage.ceq ceqVarD2 = ceqVar;
        defpackage.ceq ceqVar2 = a;
        if (ceqVarD2 == ceqVar2) {
            return ceqVarD;
        }
        if (ceqVarD == ceqVar2) {
            return ceqVarD2;
        }
        long j = ceqVarD2.d;
        long j2 = ceqVarD.d;
        if (j == j2) {
            long[] jArr = ceqVarD2.e;
            long[] jArr2 = ceqVarD.e;
            if (jArr == jArr2) {
                return new defpackage.ceq(ceqVarD2.b | ceqVarD.b, ceqVarD.c | ceqVarD2.c, j2, jArr2);
            }
        }
        int i = 0;
        if (ceqVarD.e == null) {
            long j3 = ceqVarD.c;
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        ceqVarD2 = ceqVarD2.d(((long) i2) + j2);
                    }
                }
            }
            long j4 = ceqVarD.b;
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        ceqVarD2 = ceqVarD2.d(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return ceqVarD2;
        }
        long[] jArr3 = ceqVarD2.e;
        if (jArr3 != null) {
            for (long j5 : jArr3) {
                ceqVarD = ceqVarD.d(j5);
            }
        }
        long j6 = ceqVarD2.c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    ceqVarD = ceqVarD.d(((long) i3) + j);
                }
            }
        }
        long j7 = ceqVarD2.b;
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    ceqVarD = ceqVarD.d(((long) i) + j + 64);
                }
                i++;
            }
        }
        return ceqVarD;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    public final defpackage.ceq d(long j) {
        long j2;
        long j3;
        long j4 = this.d;
        long j5 = j - j4;
        long j6 = 0;
        if (defpackage.afga.c(j5, 0L) >= 0 && defpackage.afga.c(j5, 64L) < 0) {
            long j7 = 1 << ((int) j5);
            long j8 = this.c;
            return (j8 & j7) == 0 ? new defpackage.ceq(this.b, j8 | j7, j4, this.e) : this;
        }
        if (defpackage.afga.c(j5, 64L) >= 0 && defpackage.afga.c(j5, 128L) < 0) {
            long j9 = 1 << (((int) j5) - 64);
            long j10 = this.b;
            return (j10 & j9) == 0 ? new defpackage.ceq(j9 | j10, this.c, j4, this.e) : this;
        }
        if (defpackage.afga.c(j5, 128L) < 0) {
            long[] jArr = this.e;
            if (jArr == null) {
                return new defpackage.ceq(this.b, this.c, j4, new long[]{j});
            }
            int iF = defpackage.bzd.f(jArr, j);
            if (iF >= 0) {
                return this;
            }
            int length = jArr.length;
            long[] jArr2 = new long[length + 1];
            int i = -(iF + 1);
            defpackage.afga.cj(jArr, jArr2, 0, 0, i);
            defpackage.afga.cj(jArr, jArr2, i + 1, i, length);
            jArr2[i] = j;
            return new defpackage.ceq(this.b, this.c, j4, jArr2);
        }
        if (e(j)) {
            return this;
        }
        long j11 = this.b;
        long j12 = this.c;
        long j13 = ((j + 1) / 64) * 64;
        if (defpackage.afga.c(j13, 0L) < 0) {
            j13 = 9223372036854775680L;
        }
        long[] jArr3 = null;
        defpackage.khb khbVar = null;
        long j14 = j11;
        while (true) {
            if (defpackage.afga.c(j4, j13) >= 0) {
                j2 = j4;
                j3 = j12;
                break;
            }
            if (j12 != j6) {
                if (khbVar == null) {
                    khbVar = new defpackage.khb(this.e);
                }
                int i2 = 0;
                while (i2 < 64) {
                    long j15 = j6;
                    if ((j12 & (1 << i2)) != j6) {
                        ((defpackage.zu) khbVar.a).b(((long) i2) + j4);
                    }
                    i2++;
                    j6 = j15;
                }
            }
            long j16 = j6;
            if (j14 == j16) {
                j2 = j13;
                j3 = j16;
                break;
            }
            j4 += 64;
            j6 = j16;
            j12 = j14;
            j14 = j6;
        }
        if (khbVar == null) {
            jArr3 = this.e;
        } else {
            defpackage.zu zuVar = (defpackage.zu) khbVar.a;
            int i3 = zuVar.b;
            if (i3 != 0) {
                jArr3 = new long[i3];
                long[] jArr4 = zuVar.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    jArr3[i4] = jArr4[i4];
                }
            }
            if (jArr3 == null) {
                jArr3 = this.e;
            }
        }
        return new defpackage.ceq(j14, j3, j2, jArr3).d(j);
    }

    public final boolean e(long j) {
        long[] jArr;
        long j2 = j - this.d;
        if (defpackage.afga.c(j2, 0L) < 0 || defpackage.afga.c(j2, 64L) >= 0) {
            if (defpackage.afga.c(j2, 64L) < 0 || defpackage.afga.c(j2, 128L) >= 0) {
                if (defpackage.afga.c(j2, 0L) <= 0 && (jArr = this.e) != null && defpackage.bzd.f(jArr, j) >= 0) {
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
    public final java.util.Iterator<java.lang.Long> iterator() {
        return new defpackage.afcb(new defpackage.cep(this, null), 3).a();
    }

    public final java.lang.String toString() throws java.io.IOException {
        java.lang.String string = super.toString();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(this, 10));
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).longValue()));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((java.lang.CharSequence) ", ");
            }
            if (obj == null || (obj instanceof java.lang.CharSequence)) {
                sb.append((java.lang.CharSequence) obj);
            } else if (obj instanceof java.lang.Character) {
                sb.append(((java.lang.Character) obj).charValue());
            } else {
                sb.append((java.lang.CharSequence) obj.toString());
            }
        }
        sb.append((java.lang.CharSequence) "");
        return string + " [" + sb.toString() + "]";
    }
}
