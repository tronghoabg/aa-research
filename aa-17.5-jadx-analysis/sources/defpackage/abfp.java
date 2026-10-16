package defpackage;

/* loaded from: classes3.dex */
public class abfp {
    protected static final byte[] r = new byte[0];
    public byte[] s = r;

    public static int k(byte[] bArr, uk ukVar) {
        int i = ukVar.a;
        ukVar.a = i + 1;
        return bArr[i] & 255;
    }

    public static int l(byte[] bArr, uk ukVar) {
        int i = ukVar.a;
        ukVar.a = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    public static int m(byte[] bArr, uk ukVar) {
        int iK = k(bArr, ukVar);
        if (iK < 128) {
            return iK;
        }
        int iK2 = k(bArr, ukVar);
        int i = (iK & 127) | ((iK2 & 127) << 7);
        if (iK2 < 128) {
            return i;
        }
        int iK3 = k(bArr, ukVar);
        int i2 = i | ((iK3 & 127) << 14);
        if (iK3 < 128) {
            return i2;
        }
        int iK4 = k(bArr, ukVar);
        int i3 = i2 | ((iK4 & 127) << 21);
        if (iK4 < 128) {
            return i3;
        }
        int iK5 = k(bArr, ukVar);
        int i4 = i3 | ((iK5 & 127) << 28);
        if (iK5 >= 128) {
            while (iK5 >= 128) {
                iK5 = k(bArr, ukVar);
            }
        }
        return i4;
    }

    public static long n(byte[] bArr, uk ukVar) {
        int i = ukVar.a;
        ukVar.a = i + 8;
        return (bArr[i] & 255) | ((bArr[i + 7] & 255) << 56) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    public static long o(byte[] bArr, uk ukVar) {
        long jK = k(bArr, ukVar);
        if (jK < 128) {
            return jK;
        }
        long j = jK & 127;
        int i = 7;
        while (true) {
            long jK2 = k(bArr, ukVar);
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

    public final void i(byte[] bArr, int i) throws IndexOutOfBoundsException {
        int i2;
        if (this.s == bArr) {
            return;
        }
        b();
        this.s = bArr;
        uk ukVar = new uk(0);
        int i3 = 0;
        int i4 = 0;
        int iM = 0;
        while (true) {
            i2 = ukVar.a;
            if (i2 >= i) {
                break;
            }
            int iM2 = m(bArr, ukVar);
            i4 = iM2 & 7;
            i3 = iM2 >> 3;
            if (i4 == 0) {
                if (g(i3)) {
                    o(bArr, ukVar);
                    h(i3);
                } else {
                    m(bArr, ukVar);
                    p(i3);
                }
                iM = 0;
            } else if (i4 == 1) {
                n(bArr, ukVar);
                h(i3);
                iM = 8;
            } else if (i4 == 2) {
                iM = m(bArr, ukVar);
                c(i3, ukVar.a, iM);
                ukVar.a += iM;
            } else if (i4 == 5) {
                l(bArr, ukVar);
                iM = 4;
            }
        }
        if (i2 <= i) {
            return;
        }
        throw new IndexOutOfBoundsException("Proto parsing overran buffer (ended at " + i2 + ", past " + i + ", last tag was " + i3 + " of type " + i4 + " with length " + iM + ")");
    }

    public final long j(int i, int i2) {
        uk ukVar = new uk(i);
        while (ukVar.a < i + i2) {
            int iM = m(this.s, ukVar);
            int i3 = iM & 7;
            int i4 = iM >> 3;
            if (i3 == 0) {
                long jO = o(this.s, ukVar);
                if (i4 == 1) {
                    return jO;
                }
            } else if (i3 != 1) {
                if (i3 == 2) {
                    ukVar.a += m(this.s, ukVar);
                } else if (i3 != 5) {
                    continue;
                } else {
                    if (i4 == 1) {
                        return l(this.s, ukVar);
                    }
                    ukVar.a += 4;
                }
            } else {
                if (i4 == 1) {
                    return n(this.s, ukVar);
                }
                ukVar.a += 8;
            }
        }
        return -1L;
    }

    protected boolean p(int i) {
        return false;
    }
}
