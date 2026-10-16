package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class abgs {
    protected static final byte[] r = new byte[0];
    public byte[] s = r;

    public static int k(byte[] bArr, defpackage.up upVar) {
        int i = upVar.a;
        upVar.a = i + 1;
        return bArr[i] & 255;
    }

    public static int l(byte[] bArr, defpackage.up upVar) {
        int i = upVar.a;
        upVar.a = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    public static int m(byte[] bArr, defpackage.up upVar) {
        int iK = k(bArr, upVar);
        if (iK < 128) {
            return iK;
        }
        int iK2 = k(bArr, upVar);
        int i = (iK & 127) | ((iK2 & 127) << 7);
        if (iK2 < 128) {
            return i;
        }
        int iK3 = k(bArr, upVar);
        int i2 = i | ((iK3 & 127) << 14);
        if (iK3 < 128) {
            return i2;
        }
        int iK4 = k(bArr, upVar);
        int i3 = i2 | ((iK4 & 127) << 21);
        if (iK4 < 128) {
            return i3;
        }
        int iK5 = k(bArr, upVar);
        int i4 = i3 | ((iK5 & 127) << 28);
        if (iK5 >= 128) {
            while (iK5 >= 128) {
                iK5 = k(bArr, upVar);
            }
        }
        return i4;
    }

    public static long n(byte[] bArr, defpackage.up upVar) {
        int i = upVar.a;
        upVar.a = i + 8;
        return (((long) bArr[i]) & 255) | ((bArr[i + 7] & 255) << 56) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    public static long o(byte[] bArr, defpackage.up upVar) {
        long jK = k(bArr, upVar);
        if (jK < 128) {
            return jK;
        }
        long j = jK & 127;
        int i = 7;
        while (true) {
            long jK2 = k(bArr, upVar);
            j |= (jK2 & 127) << i;
            if (jK2 < 128) {
                return j;
            }
            i += 7;
        }
    }

    public void b() {
        this.s = r;
    }

    protected void c(int i, int i2, int i3) {
        throw null;
    }

    protected boolean g(int i) {
        return false;
    }

    protected boolean h(int i) {
        return false;
    }

    public final void i(byte[] bArr, int i) throws java.lang.IndexOutOfBoundsException {
        int i2;
        if (this.s == bArr) {
            return;
        }
        b();
        this.s = bArr;
        defpackage.up upVar = new defpackage.up(0);
        int i3 = 0;
        int i4 = 0;
        int iM = 0;
        while (true) {
            i2 = upVar.a;
            if (i2 >= i) {
                break;
            }
            int iM2 = m(bArr, upVar);
            i4 = iM2 & 7;
            i3 = iM2 >> 3;
            if (i4 == 0) {
                if (g(i3)) {
                    o(bArr, upVar);
                    h(i3);
                } else {
                    m(bArr, upVar);
                    p(i3);
                }
                iM = 0;
            } else if (i4 == 1) {
                n(bArr, upVar);
                h(i3);
                iM = 8;
            } else if (i4 == 2) {
                iM = m(bArr, upVar);
                c(i3, upVar.a, iM);
                upVar.a += iM;
            } else if (i4 == 5) {
                l(bArr, upVar);
                iM = 4;
            }
        }
        if (i2 <= i) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("Proto parsing overran buffer (ended at " + i2 + ", past " + i + ", last tag was " + i3 + " of type " + i4 + " with length " + iM + ")");
    }

    public final long j(int i, int i2) {
        defpackage.up upVar = new defpackage.up(i);
        while (upVar.a < i + i2) {
            int iM = m(this.s, upVar);
            int i3 = iM & 7;
            int i4 = iM >> 3;
            if (i3 == 0) {
                long jO = o(this.s, upVar);
                if (i4 == 1) {
                    return jO;
                }
            } else if (i3 != 1) {
                if (i3 == 2) {
                    upVar.a += m(this.s, upVar);
                } else if (i3 != 5) {
                    continue;
                } else {
                    if (i4 == 1) {
                        return l(this.s, upVar);
                    }
                    upVar.a += 4;
                }
            } else {
                if (i4 == 1) {
                    return n(this.s, upVar);
                }
                upVar.a += 8;
            }
        }
        return -1L;
    }

    protected boolean p(int i) {
        return false;
    }
}
