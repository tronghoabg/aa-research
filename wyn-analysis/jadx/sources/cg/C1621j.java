package cg;

import Va.M6;
import com.applovin.shadow.okio.Utf8;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.fork.ForkServer;

/* renamed from: cg.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1621j implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final C1621j f19903d = new C1621j(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f19904a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f19905b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f19906c;

    public C1621j(byte[] data) {
        AbstractC3340k.e(data, "data");
        this.f19904a = data;
    }

    public static int g(C1621j c1621j, C1621j other) {
        c1621j.getClass();
        AbstractC3340k.e(other, "other");
        return c1621j.f(other.f19904a, 0);
    }

    public static int k(C1621j c1621j, C1621j other) {
        c1621j.getClass();
        AbstractC3340k.e(other, "other");
        return c1621j.j(other.f19904a);
    }

    public static final C1621j l(byte... data) {
        AbstractC3340k.e(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        AbstractC3340k.d(bArrCopyOf, "copyOf(...)");
        return new C1621j(bArrCopyOf);
    }

    public static /* synthetic */ C1621j q(C1621j c1621j, int i5, int i10, int i11) {
        if ((i11 & 1) != 0) {
            i5 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = -1234567890;
        }
        return c1621j.p(i5, i10);
    }

    public String a() {
        byte[] map = AbstractC1612a.f19887a;
        byte[] bArr = this.f19904a;
        AbstractC3340k.e(bArr, "<this>");
        AbstractC3340k.e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i5 = 0;
        int i10 = 0;
        while (i5 < length) {
            byte b5 = bArr[i5];
            int i11 = i5 + 2;
            byte b10 = bArr[i5 + 1];
            i5 += 3;
            byte b11 = bArr[i11];
            bArr2[i10] = map[(b5 & ForkServer.ERROR) >> 2];
            bArr2[i10 + 1] = map[((b5 & 3) << 4) | ((b10 & ForkServer.ERROR) >> 4)];
            int i12 = i10 + 3;
            bArr2[i10 + 2] = map[((b10 & 15) << 2) | ((b11 & ForkServer.ERROR) >> 6)];
            i10 += 4;
            bArr2[i12] = map[b11 & Utf8.REPLACEMENT_BYTE];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b12 = bArr[i5];
            bArr2[i10] = map[(b12 & ForkServer.ERROR) >> 2];
            bArr2[i10 + 1] = map[(b12 & 3) << 4];
            bArr2[i10 + 2] = 61;
            bArr2[i10 + 3] = 61;
        } else if (length2 == 2) {
            int i13 = i5 + 1;
            byte b13 = bArr[i5];
            byte b14 = bArr[i13];
            bArr2[i10] = map[(b13 & ForkServer.ERROR) >> 2];
            bArr2[i10 + 1] = map[((b13 & 3) << 4) | ((b14 & ForkServer.ERROR) >> 4)];
            bArr2[i10 + 2] = map[(b14 & 15) << 2];
            bArr2[i10 + 3] = 61;
        }
        return new String(bArr2, Bf.a.f1670a);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1621j other) {
        AbstractC3340k.e(other, "other");
        int iD = d();
        int iD2 = other.d();
        int iMin = Math.min(iD, iD2);
        for (int i5 = 0; i5 < iMin; i5++) {
            int i10 = i(i5) & ForkServer.ERROR;
            int i11 = other.i(i5) & ForkServer.ERROR;
            if (i10 != i11) {
                return i10 < i11 ? -1 : 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD < iD2 ? -1 : 1;
    }

    public C1621j c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f19904a, 0, d());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC3340k.b(bArrDigest);
        return new C1621j(bArrDigest);
    }

    public int d() {
        return this.f19904a.length;
    }

    public String e() {
        byte[] bArr = this.f19904a;
        char[] cArr = new char[bArr.length * 2];
        int i5 = 0;
        for (byte b5 : bArr) {
            int i10 = i5 + 1;
            char[] cArr2 = dg.b.f34289a;
            cArr[i5] = cArr2[(b5 >> 4) & 15];
            i5 += 2;
            cArr[i10] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1621j) {
            C1621j c1621j = (C1621j) obj;
            int iD = c1621j.d();
            byte[] bArr = this.f19904a;
            if (iD == bArr.length && c1621j.n(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f(byte[] other, int i5) {
        AbstractC3340k.e(other, "other");
        byte[] bArr = this.f19904a;
        int length = bArr.length - other.length;
        int iMax = Math.max(i5, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC1613b.b(bArr, iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] h() {
        return this.f19904a;
    }

    public int hashCode() {
        int i5 = this.f19905b;
        if (i5 != 0) {
            return i5;
        }
        int iHashCode = Arrays.hashCode(this.f19904a);
        this.f19905b = iHashCode;
        return iHashCode;
    }

    public byte i(int i5) {
        return this.f19904a[i5];
    }

    public int j(byte[] other) {
        AbstractC3340k.e(other, "other");
        int iD = d();
        byte[] bArr = this.f19904a;
        for (int iMin = Math.min(iD, bArr.length - other.length); -1 < iMin; iMin--) {
            if (AbstractC1613b.b(bArr, iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean m(int i5, C1621j other, int i10) {
        AbstractC3340k.e(other, "other");
        return other.n(0, this.f19904a, i5, i10);
    }

    public boolean n(int i5, byte[] other, int i10, int i11) {
        AbstractC3340k.e(other, "other");
        if (i5 < 0) {
            return false;
        }
        byte[] bArr = this.f19904a;
        return i5 <= bArr.length - i11 && i10 >= 0 && i10 <= other.length - i11 && AbstractC1613b.b(bArr, i5, other, i10, i11);
    }

    public final boolean o(C1621j prefix) {
        AbstractC3340k.e(prefix, "prefix");
        return m(0, prefix, prefix.d());
    }

    public C1621j p(int i5, int i10) {
        if (i10 == -1234567890) {
            i10 = d();
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f19904a;
        if (i10 > bArr.length) {
            throw new IllegalArgumentException(M6.r(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i10 - i5 >= 0) {
            return (i5 == 0 && i10 == bArr.length) ? this : new C1621j(ff.m.k0(i5, i10, bArr));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public C1621j r() {
        int i5 = 0;
        while (true) {
            byte[] bArr = this.f19904a;
            if (i5 >= bArr.length) {
                return this;
            }
            byte b5 = bArr[i5];
            if (b5 >= 65 && b5 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC3340k.d(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i5] = (byte) (b5 + 32);
                for (int i10 = i5 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b10 = bArrCopyOf[i10];
                    if (b10 >= 65 && b10 <= 90) {
                        bArrCopyOf[i10] = (byte) (b10 + 32);
                    }
                }
                return new C1621j(bArrCopyOf);
            }
            i5++;
        }
    }

    public byte[] s() {
        byte[] bArr = this.f19904a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC3340k.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public final String t() {
        String str = this.f19906c;
        if (str != null) {
            return str;
        }
        byte[] bArrH = h();
        AbstractC3340k.e(bArrH, "<this>");
        String str2 = new String(bArrH, Bf.a.f1670a);
        this.f19906c = str2;
        return str2;
    }

    public String toString() {
        byte b5;
        int i5;
        byte[] bArr = this.f19904a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            if (i10 >= length) {
                break;
            }
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                int i13 = i12 + 1;
                if (i12 == 64) {
                    break;
                }
                if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (127 <= b10 && b10 < 160))) || b10 == 65533) {
                    break;
                }
                i11 += b10 < 65536 ? 1 : 2;
                i10++;
                while (true) {
                    i12 = i13;
                    if (i10 < length && (b5 = bArr[i10]) >= 0) {
                        i10++;
                        i13 = i12 + 1;
                        if (i12 == 64) {
                            break loop0;
                        }
                        if ((b5 != 10 && b5 != 13 && ((b5 >= 0 && b5 < 32) || (127 <= b5 && b5 < 160))) || b5 == 65533) {
                            break loop0;
                        }
                        i11 += b5 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b10 >> 5) == -2) {
                int i14 = i10 + 1;
                if (length > i14) {
                    byte b11 = bArr[i14];
                    if ((b11 & 192) == 128) {
                        int i15 = (b11 ^ 3968) ^ (b10 << 6);
                        if (i15 >= 128) {
                            i5 = i12 + 1;
                            if (i12 == 64) {
                                break;
                            }
                            if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                break;
                            }
                            i11 += i15 < 65536 ? 1 : 2;
                            i10 += 2;
                            i12 = i5;
                        } else if (i12 != 64) {
                            break;
                        }
                    } else if (i12 != 64) {
                        break;
                    }
                } else if (i12 != 64) {
                    break;
                }
            } else if ((b10 >> 4) == -2) {
                int i16 = i10 + 2;
                if (length > i16) {
                    byte b12 = bArr[i10 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i16];
                        if ((b13 & 192) == 128) {
                            int i17 = ((b13 ^ (-123008)) ^ (b12 << 6)) ^ (b10 << 12);
                            if (i17 < 2048) {
                                if (i12 != 64) {
                                    break;
                                }
                            } else if (55296 > i17 || i17 >= 57344) {
                                i5 = i12 + 1;
                                if (i12 == 64) {
                                    break;
                                }
                                if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                    break;
                                }
                                i11 += i17 < 65536 ? 1 : 2;
                                i10 += 3;
                                i12 = i5;
                            } else if (i12 != 64) {
                                break;
                            }
                        } else if (i12 != 64) {
                            break;
                        }
                    } else if (i12 != 64) {
                        break;
                    }
                } else if (i12 != 64) {
                    break;
                }
            } else if ((b10 >> 3) == -2) {
                int i18 = i10 + 3;
                if (length > i18) {
                    byte b14 = bArr[i10 + 1];
                    if ((b14 & 192) == 128) {
                        byte b15 = bArr[i10 + 2];
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i18];
                            if ((b16 & 192) == 128) {
                                int i19 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b10 << 18);
                                if (i19 > 1114111) {
                                    if (i12 != 64) {
                                        break;
                                    }
                                } else if (55296 > i19 || i19 >= 57344) {
                                    if (i19 >= 65536) {
                                        i5 = i12 + 1;
                                        if (i12 == 64) {
                                            break;
                                        }
                                        if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                            break;
                                        }
                                        i11 += i19 < 65536 ? 1 : 2;
                                        i10 += 4;
                                        i12 = i5;
                                    } else if (i12 != 64) {
                                        break;
                                    }
                                } else if (i12 != 64) {
                                    break;
                                }
                            } else if (i12 != 64) {
                                break;
                            }
                        } else if (i12 != 64) {
                            break;
                        }
                    } else if (i12 != 64) {
                        break;
                    }
                } else if (i12 != 64) {
                    break;
                }
            } else if (i12 != 64) {
                break;
            }
        }
        i11 = -1;
        if (i11 != -1) {
            String strT = t();
            String strSubstring = strT.substring(0, i11);
            AbstractC3340k.d(strSubstring, "substring(...)");
            String strH0 = Bf.r.h0(Bf.r.h0(Bf.r.h0(strSubstring, "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (i11 >= strT.length()) {
                return AbstractC3256n.f(']', "[text=", strH0);
            }
            return "[size=" + bArr.length + " text=" + strH0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + e() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(bArr.length);
        sb2.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(M6.r(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb2.append((64 == bArr.length ? this : new C1621j(ff.m.k0(0, 64, bArr))).e());
        sb2.append("…]");
        return sb2.toString();
    }

    public void u(C1618g buffer, int i5) {
        AbstractC3340k.e(buffer, "buffer");
        buffer.W(this.f19904a, 0, i5);
    }
}
