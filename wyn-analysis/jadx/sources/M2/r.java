package M2;

import N1.A;
import N1.B;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;
import ka.AbstractC3256n;
import l8.AbstractC3409K;
import o8.C3655a;
import s2.InterfaceC3990A;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f7419a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static R1.a b(B b5, String str) {
        int i5 = 0;
        while (true) {
            A[] aArr = b5.f8023a;
            if (i5 >= aArr.length) {
                return null;
            }
            A a5 = aArr[i5];
            if (a5 instanceof R1.a) {
                R1.a aVar = (R1.a) a5;
                if (aVar.f10090a.equals(str)) {
                    return aVar;
                }
            }
            i5++;
        }
    }

    public static boolean c(int i5, boolean z2) {
        if ((i5 >>> 8) == 3368816) {
            return true;
        }
        if (i5 == 1751476579 && z2) {
            return true;
        }
        int[] iArr = f7419a;
        for (int i10 = 0; i10 < 29; i10++) {
            if (iArr[i10] == i5) {
                return true;
            }
        }
        return false;
    }

    public static G2.e d(int i5, Q1.o oVar) {
        int iH = oVar.h();
        if (oVar.h() == 1684108385) {
            oVar.H(8);
            String strQ = oVar.q(iH - 16);
            return new G2.e("und", strQ, strQ);
        }
        Q1.k.w("MetadataUtil", "Failed to parse comment attribute: " + H5.a.f(i5));
        return null;
    }

    public static G2.a e(Q1.o oVar) {
        int iH = oVar.h();
        if (oVar.h() != 1684108385) {
            Q1.k.w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iH2 = oVar.h();
        byte[] bArr = g.f7315a;
        int i5 = iH2 & 16777215;
        String str = i5 == 13 ? "image/jpeg" : i5 == 14 ? "image/png" : null;
        if (str == null) {
            N0.a.o(i5, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        oVar.H(4);
        int i10 = iH - 16;
        byte[] bArr2 = new byte[i10];
        oVar.f(0, i10, bArr2);
        return new G2.a(str, null, 3, bArr2);
    }

    public static G2.o f(int i5, Q1.o oVar, String str) {
        int iH = oVar.h();
        if (oVar.h() == 1684108385 && iH >= 22) {
            oVar.H(10);
            int iA = oVar.A();
            if (iA > 0) {
                String strG = AbstractC3256n.g(iA, "");
                int iA2 = oVar.A();
                if (iA2 > 0) {
                    strG = strG + "/" + iA2;
                }
                return new G2.o(str, null, AbstractC3409K.n(strG));
            }
        }
        Q1.k.w("MetadataUtil", "Failed to parse index/count attribute: " + H5.a.f(i5));
        return null;
    }

    public static int g(Q1.o oVar) {
        int iH = oVar.h();
        if (oVar.h() == 1684108385) {
            oVar.H(8);
            int i5 = iH - 16;
            if (i5 == 1) {
                return oVar.u();
            }
            if (i5 == 2) {
                return oVar.A();
            }
            if (i5 == 3) {
                return oVar.x();
            }
            if (i5 == 4 && (oVar.e() & 128) == 0) {
                return oVar.y();
            }
        }
        Q1.k.w("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static G2.j h(int i5, String str, Q1.o oVar, boolean z2, boolean z10) {
        int iG = g(oVar);
        if (z10) {
            iG = Math.min(1, iG);
        }
        if (iG >= 0) {
            return z2 ? new G2.o(str, null, AbstractC3409K.n(Integer.toString(iG))) : new G2.e("und", str, Integer.toString(iG));
        }
        Q1.k.w("MetadataUtil", "Failed to parse uint8 attribute: " + H5.a.f(i5));
        return null;
    }

    public static Y9.c i(byte[] bArr) {
        Q1.o oVar = new Q1.o(bArr);
        if (oVar.f9704c < 32) {
            return null;
        }
        oVar.G(0);
        int iA = oVar.a();
        int iH = oVar.h();
        if (iH != iA) {
            Q1.k.w("PsshAtomUtil", "Advertised atom size (" + iH + ") does not match buffer size: " + iA);
            return null;
        }
        int iH2 = oVar.h();
        if (iH2 != 1886614376) {
            N0.a.o(iH2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iC = g.c(oVar.h());
        if (iC > 1) {
            N0.a.o(iC, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(oVar.o(), oVar.o());
        if (iC == 1) {
            int iY = oVar.y();
            UUID[] uuidArr = new UUID[iY];
            for (int i5 = 0; i5 < iY; i5++) {
                uuidArr[i5] = new UUID(oVar.o(), oVar.o());
            }
        }
        int iY2 = oVar.y();
        int iA2 = oVar.a();
        if (iY2 == iA2) {
            byte[] bArr2 = new byte[iY2];
            oVar.f(0, iY2, bArr2);
            return new Y9.c(uuid, iC, bArr2);
        }
        Q1.k.w("PsshAtomUtil", "Atom data size (" + iY2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static G2.o j(int i5, Q1.o oVar, String str) {
        int iH = oVar.h();
        if (oVar.h() == 1684108385) {
            oVar.H(8);
            return new G2.o(str, null, AbstractC3409K.n(oVar.q(iH - 16)));
        }
        Q1.k.w("MetadataUtil", "Failed to parse text attribute: " + H5.a.f(i5));
        return null;
    }

    public static InterfaceC3990A k(s2.n nVar, boolean z2, boolean z10) {
        InterfaceC3990A interfaceC3990A;
        int i5;
        int i10;
        long jO;
        int i11;
        int i12;
        int[] iArr;
        boolean z11 = true;
        long jI = nVar.i();
        long j8 = -1;
        long j10 = 4096;
        if (jI != -1 && jI <= 4096) {
            j10 = jI;
        }
        int i13 = (int) j10;
        Q1.o oVar = new Q1.o(64);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            oVar.D(8);
            if (!nVar.c(oVar.f9702a, i14, 8, z11)) {
                break;
            }
            long jW = oVar.w();
            int i17 = z11;
            int iH = oVar.h();
            if (jW == 1) {
                nVar.a(8, 8, oVar.f9702a);
                i11 = 16;
                oVar.F(16);
                jO = oVar.o();
                i10 = i15;
            } else {
                if (jW == 0) {
                    long jI2 = nVar.i();
                    if (jI2 != j8) {
                        jW = (jI2 - nVar.g()) + 8;
                    }
                }
                i10 = i15;
                jO = jW;
                i11 = 8;
            }
            long j11 = i11;
            if (jO < j11) {
                return new m();
            }
            int i18 = i10 + i11;
            interfaceC3990A = null;
            if (iH == 1836019574) {
                i13 += (int) jO;
                if (jI != -1 && i13 > jI) {
                    i13 = (int) jI;
                }
                i15 = i18;
                z11 = i17;
                j8 = -1;
                i14 = 0;
            } else {
                if (iH == 1836019558 || iH == 1836475768) {
                    i5 = i17;
                    break;
                }
                if (iH == 1835295092) {
                    i16 = i17;
                }
                long j12 = jI;
                if ((i18 + jO) - j11 >= i13) {
                    i5 = 0;
                    break;
                }
                int i19 = (int) (jO - j11);
                i15 = i18 + i19;
                if (iH != 1718909296) {
                    i12 = 0;
                    if (i19 != 0) {
                        nVar.h(i19);
                    }
                } else {
                    if (i19 < 8) {
                        return new m();
                    }
                    oVar.D(i19);
                    i12 = 0;
                    nVar.a(0, i19, oVar.f9702a);
                    if (c(oVar.h(), z10)) {
                        i16 = i17;
                    }
                    oVar.H(4);
                    int iA = oVar.a() / 4;
                    if (i16 == 0 && iA > 0) {
                        iArr = new int[iA];
                        int i20 = 0;
                        while (true) {
                            if (i20 >= iA) {
                                break;
                            }
                            int iH2 = oVar.h();
                            iArr[i20] = iH2;
                            if (c(iH2, z10)) {
                                i16 = i17;
                                break;
                            }
                            i20++;
                        }
                    } else {
                        iArr = null;
                    }
                    if (i16 == 0) {
                        m mVar = new m();
                        if (iArr == null) {
                            int i21 = C3655a.f41424c;
                            return mVar;
                        }
                        int i22 = C3655a.f41424c;
                        if (iArr.length == 0) {
                            return mVar;
                        }
                        new C3655a(Arrays.copyOf(iArr, iArr.length));
                        return mVar;
                    }
                }
                i14 = i12;
                z11 = i17;
                jI = j12;
                j8 = -1;
            }
        }
        interfaceC3990A = null;
        i5 = i14;
        return i16 == 0 ? m.f7375c : z2 != i5 ? i5 != 0 ? m.f7373a : m.f7374b : interfaceC3990A;
    }
}
