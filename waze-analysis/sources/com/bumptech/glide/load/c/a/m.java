package com.bumptech.glide.load.c.a;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.waze.strings.DisplayStrings;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m implements com.bumptech.glide.load.d {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f3352a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    static final byte[] f3353b = "MPF".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f3354c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static boolean g(int i2) {
        return i2 == 1751476579 || i2 == 1751476600 || i2 == 1751479907 || i2 == 1751479928 || i2 == 1835623985 || i2 == 1836279345;
    }

    private static final ImageHeaderParser$ImageType h(k kVar) {
        try {
            int iA = kVar.a();
            if (iA == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iD = (iA << 8) | kVar.d();
            if (iD == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iD2 = (iD << 8) | kVar.d();
            if (iD2 == -1991225785) {
                kVar.c(21L);
                try {
                    return kVar.d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (j unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iD2 == 1380533830) {
                kVar.c(4L);
                if (((kVar.a() << 16) | kVar.a()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iA2 = (kVar.a() << 16) | kVar.a();
                if ((iA2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i2 = iA2 & 255;
                if (i2 == 88) {
                    kVar.c(4L);
                    short sD = kVar.d();
                    return (sD & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sD & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i2 != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                kVar.c(4L);
                return (kVar.d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((kVar.a() << 16) | kVar.a()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iA3 = (kVar.a() << 16) | kVar.a();
            if (iA3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            boolean z = iA3 == 1635150182;
            boolean zG = g(iA3);
            kVar.c(4L);
            int i3 = iD2 - 16;
            if (i3 % 4 == 0) {
                for (int i4 = 0; i4 < 5 && i3 > 0; i4++) {
                    int iA4 = (kVar.a() << 16) | kVar.a();
                    if (iA4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iA4 == 1635150182) {
                        z = true;
                    } else if (g(iA4)) {
                        zG = true;
                    }
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : zG ? ImageHeaderParser$ImageType.HEIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (j unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    private static final boolean i(byte[] bArr, int i2, byte[] bArr2) {
        boolean z = bArr2 != null && i2 > bArr2.length;
        if (z) {
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                if (bArr[i3] != bArr2[i3]) {
                    return false;
                }
            }
        }
        return z;
    }

    private static final int j(k kVar, int i2) {
        short sD;
        int iA;
        long j2;
        long jC;
        do {
            short sD2 = kVar.d();
            if (sD2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sD2));
                }
                return -1;
            }
            sD = kVar.d();
            if (sD == 218) {
                return -1;
            }
            if (sD == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i2 + " segment");
                }
                return -1;
            }
            iA = kVar.a() - 2;
            if (sD == i2) {
                return iA;
            }
            j2 = iA;
            jC = kVar.c(j2);
        } while (jC == j2);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sD) + ", wanted to skip: " + iA + ", but actually skipped: " + jC);
        }
        return -1;
    }

    private static final int k(k kVar, com.bumptech.glide.load.a.a.j jVar) {
        ByteOrder byteOrder;
        short sD;
        try {
            int iA = kVar.a();
            if ((iA & 65496) != 65496 && iA != 19789 && iA != 18761) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iA);
                }
                return -1;
            }
            int iJ = j(kVar, 225);
            if (iJ == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) jVar.a(iJ, byte[].class);
            try {
                int iB = kVar.b(bArr, iJ);
                if (iB != iJ) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + iJ + ", actually read: " + iB);
                    }
                } else if (i(bArr, iJ, f3352a)) {
                    ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(iJ);
                    short sD2 = af.d(6, byteBuffer);
                    if (sD2 != 18761) {
                        if (sD2 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sD2));
                        }
                        byteOrder = ByteOrder.BIG_ENDIAN;
                    } else {
                        byteOrder = ByteOrder.LITTLE_ENDIAN;
                    }
                    byteBuffer.order(byteOrder);
                    int iC = af.c(10, byteBuffer);
                    short sD3 = af.d(iC + 6, byteBuffer);
                    for (int i2 = 0; i2 < sD3; i2++) {
                        int i3 = iC + 8 + (i2 * 12);
                        if (af.d(i3, byteBuffer) == 274) {
                            short sD4 = af.d(i3 + 2, byteBuffer);
                            if (sD4 > 0 && sD4 <= 12) {
                                int iC2 = af.c(i3 + 4, byteBuffer);
                                if (iC2 >= 0) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Got tagIndex=" + i2 + " tagType=" + DisplayStrings.DS_TRIP_OVERVIEW_CURRENT_LOCATION + " formatCode=" + ((int) sD4) + " componentCount=" + iC2);
                                    }
                                    int i4 = iC2 + f3354c[sD4];
                                    if (i4 <= 4) {
                                        int i5 = i3 + 8;
                                        if (i5 >= 0 && i5 <= byteBuffer.remaining()) {
                                            if (i4 >= 0 && i4 + i5 <= byteBuffer.remaining()) {
                                                sD = af.d(i5, byteBuffer);
                                                break;
                                            }
                                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + DisplayStrings.DS_TRIP_OVERVIEW_CURRENT_LOCATION);
                                            }
                                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i5 + " tagType=" + DisplayStrings.DS_TRIP_OVERVIEW_CURRENT_LOCATION);
                                        }
                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sD4));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Negative tiff component count");
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) sD4));
                            }
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                }
                sD = -1;
                return sD;
            } finally {
                jVar.c(bArr);
            }
        } catch (j unused) {
            return -1;
        }
    }

    private static final int l(k kVar) {
        return j(kVar, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_TWO_WHEELER_5);
    }

    private static final boolean m(k kVar, com.bumptech.glide.load.a.a.j jVar) {
        if (h(kVar) != ImageHeaderParser$ImageType.JPEG) {
            return false;
        }
        int iL = l(kVar);
        while (iL > 0) {
            byte[] bArr = (byte[]) jVar.a(iL, byte[].class);
            try {
                int iB = kVar.b(bArr, iL);
                if (iB != iL) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iL + ", actually read: " + iB);
                    }
                } else if (i(bArr, iL, f3353b)) {
                    jVar.c(bArr);
                    return true;
                }
                jVar.c(bArr);
                iL = l(kVar);
            } catch (Throwable th) {
                jVar.c(bArr);
                throw th;
            }
        }
        if (!Log.isLoggable("DfltImageHeaderParser", 2)) {
            return false;
        }
        Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
        return false;
    }

    @Override // com.bumptech.glide.load.d
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        com.bumptech.glide.g.p.f(inputStream);
        return h(new l(inputStream, 0));
    }

    @Override // com.bumptech.glide.load.d
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        com.bumptech.glide.g.p.f(byteBuffer);
        return h(new l(byteBuffer, 1));
    }

    @Override // com.bumptech.glide.load.d
    public final int c(InputStream inputStream, com.bumptech.glide.load.a.a.j jVar) {
        com.bumptech.glide.g.p.f(inputStream);
        l lVar = new l(inputStream, 0);
        com.bumptech.glide.g.p.f(jVar);
        return k(lVar, jVar);
    }

    @Override // com.bumptech.glide.load.d
    public final int d(ByteBuffer byteBuffer, com.bumptech.glide.load.a.a.j jVar) {
        com.bumptech.glide.g.p.f(byteBuffer);
        l lVar = new l(byteBuffer, 1);
        com.bumptech.glide.g.p.f(jVar);
        return k(lVar, jVar);
    }

    @Override // com.bumptech.glide.load.d
    public final boolean e(InputStream inputStream, com.bumptech.glide.load.a.a.j jVar) {
        com.bumptech.glide.g.p.f(inputStream);
        l lVar = new l(inputStream, 0);
        com.bumptech.glide.g.p.f(jVar);
        return m(lVar, jVar);
    }

    @Override // com.bumptech.glide.load.d
    public final boolean f(ByteBuffer byteBuffer, com.bumptech.glide.load.a.a.j jVar) {
        com.bumptech.glide.g.p.f(byteBuffer);
        l lVar = new l(byteBuffer, 1);
        com.bumptech.glide.g.p.f(jVar);
        return m(lVar, jVar);
    }
}
