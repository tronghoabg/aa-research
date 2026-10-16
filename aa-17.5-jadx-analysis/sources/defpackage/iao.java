package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class iao implements ImageHeaderParser {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName(CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE));
    static final byte[] b = "MPF".getBytes(Charset.forName(CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE));
    private static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static boolean g(int i) {
        return i == 1751476579 || i == 1751476600 || i == 1751479907 || i == 1751479928 || i == 1835623985 || i == 1836279345;
    }

    private static final ImageHeaderParser.ImageType h(iam iamVar) throws IOException {
        try {
            int iA = iamVar.a();
            if (iA == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iD = (iA << 8) | iamVar.d();
            if (iD == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iD2 = (iD << 8) | iamVar.d();
            if (iD2 == -1991225785) {
                iamVar.c(21L);
                try {
                    return iamVar.d() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (ial unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iD2 == 1380533830) {
                iamVar.c(4L);
                if (((iamVar.a() << 16) | iamVar.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int iA2 = (iamVar.a() << 16) | iamVar.a();
                if ((iA2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = iA2 & 255;
                if (i == 88) {
                    iamVar.c(4L);
                    short sD = iamVar.d();
                    return (sD & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sD & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                iamVar.c(4L);
                return (iamVar.d() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((iamVar.a() << 16) | iamVar.a()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA3 = (iamVar.a() << 16) | iamVar.a();
            if (iA3 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            boolean z = iA3 == 1635150182;
            boolean zG = g(iA3);
            iamVar.c(4L);
            int i2 = iD2 - 16;
            if (i2 % 4 == 0) {
                for (int i3 = 0; i3 < 5 && i2 > 0; i3++) {
                    int iA4 = (iamVar.a() << 16) | iamVar.a();
                    if (iA4 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (iA4 == 1635150182) {
                        z = true;
                    } else if (g(iA4)) {
                        zG = true;
                    }
                    i2 -= 4;
                }
            }
            return z ? ImageHeaderParser.ImageType.AVIF : zG ? ImageHeaderParser.ImageType.HEIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (ial unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static final boolean i(byte[] bArr, int i, byte[] bArr2) {
        boolean z = bArr2 != null && i > bArr2.length;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    private static final int j(iam iamVar, int i) throws IOException {
        short sD;
        int iA;
        long j;
        long jC;
        do {
            short sD2 = iamVar.d();
            if (sD2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", a.bp(sD2, "Unknown segmentId="));
                }
                return -1;
            }
            sD = iamVar.d();
            if (sD == 218) {
                return -1;
            }
            if (sD == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", a.bn(i, "Found MARKER_EOI in ", " segment"));
                }
                return -1;
            }
            iA = iamVar.a() - 2;
            if (sD == i) {
                return iA;
            }
            j = iA;
            jC = iamVar.c(j);
        } while (jC == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sD) + ", wanted to skip: " + iA + ", but actually skipped: " + jC);
        }
        return -1;
    }

    private static final int k(iam iamVar, hxl hxlVar) throws IOException {
        ByteOrder byteOrder;
        short sK;
        try {
            int iA = iamVar.a();
            if ((iA & 65496) != 65496 && iA != 19789 && iA != 18761) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", a.bp(iA, "Parser doesn't handle magic number: "));
                }
                return -1;
            }
            int iJ = j(iamVar, 225);
            if (iJ == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) hxlVar.a(iJ, byte[].class);
            try {
                int iB = iamVar.b(bArr, iJ);
                if (iB != iJ) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", a.bo(iB, iJ, "Unable to read exif segment data, length: ", ", actually read: "));
                    }
                } else if (i(bArr, iJ, a)) {
                    ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(iJ);
                    short sK2 = fxp.k(6, byteBuffer);
                    if (sK2 != 18761) {
                        if (sK2 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", a.bp(sK2, "Unknown endianness = "));
                        }
                        byteOrder = ByteOrder.BIG_ENDIAN;
                    } else {
                        byteOrder = ByteOrder.LITTLE_ENDIAN;
                    }
                    byteBuffer.order(byteOrder);
                    int iJ2 = fxp.j(10, byteBuffer);
                    short sK3 = fxp.k(iJ2 + 6, byteBuffer);
                    for (int i = 0; i < sK3; i++) {
                        int i2 = iJ2 + 8 + (i * 12);
                        if (fxp.k(i2, byteBuffer) == 274) {
                            short sK4 = fxp.k(i2 + 2, byteBuffer);
                            if (sK4 > 0 && sK4 <= 12) {
                                int iJ3 = fxp.j(i2 + 4, byteBuffer);
                                if (iJ3 >= 0) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=274 formatCode=" + ((int) sK4) + " componentCount=" + iJ3);
                                    }
                                    int i3 = iJ3 + c[sK4];
                                    if (i3 <= 4) {
                                        int i4 = i2 + 8;
                                        if (i4 >= 0 && i4 <= byteBuffer.remaining()) {
                                            if (i3 >= 0 && i3 + i4 <= byteBuffer.remaining()) {
                                                sK = fxp.k(i4, byteBuffer);
                                                break;
                                            }
                                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                Log.d("DfltImageHeaderParser", a.bp(274, "Illegal number of bytes for TI tag data tagType="));
                                            }
                                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", a.bo(274, i4, "Illegal tagValueOffset=", " tagType="));
                                        }
                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", a.bp(sK4, "Got byte count > 4, not orientation, continuing, formatCode="));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Negative tiff component count");
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", a.bp(sK4, "Got invalid format code = "));
                            }
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                }
                sK = -1;
                return sK;
            } finally {
                hxlVar.c(bArr);
            }
        } catch (ial unused) {
            return -1;
        }
    }

    private static final boolean l(iam iamVar, hxl hxlVar) throws IOException {
        if (h(iamVar) != ImageHeaderParser.ImageType.JPEG) {
            return false;
        }
        int iJ = j(iamVar, 226);
        while (iJ > 0) {
            byte[] bArr = (byte[]) hxlVar.a(iJ, byte[].class);
            try {
                int iB = iamVar.b(bArr, iJ);
                if (iB != iJ) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", a.bo(iB, iJ, "Unable to read APP2 segment data, length: ", ", actually read: "));
                    }
                } else if (i(bArr, iJ, b)) {
                    hxlVar.c(bArr);
                    return true;
                }
                hxlVar.c(bArr);
                iJ = j(iamVar, 226);
            } catch (Throwable th) {
                hxlVar.c(bArr);
                throw th;
            }
        }
        if (!Log.isLoggable("DfltImageHeaderParser", 2)) {
            return false;
        }
        Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(InputStream inputStream) throws IOException {
        return h(new ian(inputStream, 0));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType b(ByteBuffer byteBuffer) throws IOException {
        return h(new ian(byteBuffer, 1));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int c(InputStream inputStream, hxl hxlVar) throws IOException {
        ian ianVar = new ian(inputStream, 0);
        a.al(hxlVar, "Argument must not be null");
        return k(ianVar, hxlVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(ByteBuffer byteBuffer, hxl hxlVar) throws IOException {
        return k(new ian(byteBuffer, 1), hxlVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean e(InputStream inputStream, hxl hxlVar) throws IOException {
        return l(new ian(inputStream, 0), hxlVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean f(ByteBuffer byteBuffer, hxl hxlVar) throws IOException {
        return l(new ian(byteBuffer, 1), hxlVar);
    }
}
