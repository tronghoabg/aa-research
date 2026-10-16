package L4;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class h implements B4.c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f6900a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f6901b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static ImageHeaderParser$ImageType d(f fVar) {
        try {
            int iE = fVar.e();
            if (iE == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iG = (iE << 8) | fVar.g();
            if (iG == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iG2 = (iG << 8) | fVar.g();
            if (iG2 == -1991225785) {
                fVar.skip(21L);
                try {
                    return fVar.g() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (e unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iG2 != 1380533830) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            fVar.skip(4L);
            if (((fVar.e() << 16) | fVar.e()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iE2 = (fVar.e() << 16) | fVar.e();
            if ((iE2 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i5 = iE2 & 255;
            if (i5 == 88) {
                fVar.skip(4L);
                return (fVar.g() & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (i5 != 76) {
                return ImageHeaderParser$ImageType.WEBP;
            }
            fVar.skip(4L);
            return (fVar.g() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
        } catch (e unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(L4.g r9) throws java.io.IOException {
        /*
        L0:
            short r0 = r9.g()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L24
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown segmentId="
            r9.<init>(r1)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
            return r3
        L24:
            short r0 = r9.g()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L2d
            goto L6a
        L2d:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L3d
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.String r9 = "Found MARKER_EOI in exif segment"
            android.util.Log.d(r4, r9)
            return r3
        L3d:
            int r1 = r9.e()
            int r1 = r1 + (-2)
            r5 = 225(0xe1, float:3.15E-43)
            if (r0 == r5) goto L6b
            long r5 = (long) r1
            long r7 = r9.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.String r9 = "Unable to skip enough data, type: "
            java.lang.String r2 = ", wanted to skip: "
            java.lang.String r5 = ", but actually skipped: "
            java.lang.StringBuilder r9 = R8.v.h(r9, r0, r2, r1, r5)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L6a:
            return r3
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.h.e(L4.g):int");
    }

    public static int f(g gVar, byte[] bArr, int i5) throws e {
        ByteOrder byteOrder;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i5 && (i12 = gVar.f6899a.read(bArr, i11, i5 - i11)) != -1) {
            i11 += i12;
        }
        if (i11 == 0 && i12 == -1) {
            throw new e();
        }
        if (i11 == i5) {
            short s10 = 1;
            byte[] bArr2 = f6900a;
            boolean z2 = bArr != null && i5 > bArr2.length;
            if (z2) {
                int i13 = 0;
                while (true) {
                    if (i13 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i13] != bArr2[i13]) {
                        z2 = false;
                        break;
                    }
                    i13++;
                }
            }
            if (z2) {
                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i5);
                short s11 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
                if (s11 != 18761) {
                    if (s11 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s11));
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                byteBuffer.order(byteOrder);
                int i14 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
                int i15 = i14 + 6;
                short s12 = byteBuffer.remaining() - i15 >= 2 ? byteBuffer.getShort(i15) : (short) -1;
                while (i10 < s12) {
                    int i16 = (i10 * 12) + i14 + 8;
                    short s13 = byteBuffer.remaining() - i16 >= 2 ? byteBuffer.getShort(i16) : (short) -1;
                    if (s13 == 274) {
                        int i17 = i16 + 2;
                        short s14 = byteBuffer.remaining() - i17 >= 2 ? byteBuffer.getShort(i17) : (short) -1;
                        if (s14 >= s10 && s14 <= 12) {
                            int i18 = i16 + 4;
                            int i19 = byteBuffer.remaining() - i18 >= 4 ? byteBuffer.getInt(i18) : -1;
                            if (i19 >= 0) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sbH = R8.v.h("Got tagIndex=", i10, " tagType=", s13, " formatCode=");
                                    sbH.append((int) s14);
                                    sbH.append(" componentCount=");
                                    sbH.append(i19);
                                    Log.d("DfltImageHeaderParser", sbH.toString());
                                }
                                int i20 = i19 + f6901b[s14];
                                if (i20 <= 4) {
                                    int i21 = i16 + 8;
                                    if (i21 < 0 || i21 > byteBuffer.remaining()) {
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i21 + " tagType=" + ((int) s13));
                                        }
                                    } else {
                                        if (i20 >= 0 && i20 + i21 <= byteBuffer.remaining()) {
                                            if (byteBuffer.remaining() - i21 >= 2) {
                                                return byteBuffer.getShort(i21);
                                            }
                                            return -1;
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s13));
                                        }
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s14));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s14));
                        }
                    }
                    i10++;
                    s10 = 1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i5 + ", actually read: " + i11);
            return -1;
        }
        return -1;
    }

    @Override // B4.c
    public final int a(InputStream inputStream, F4.f fVar) throws IOException {
        g gVar = new g(inputStream);
        gc.b.k(fVar, "Argument must not be null");
        try {
            int iE = gVar.e();
            if ((iE & 65496) == 65496 || iE == 19789 || iE == 18761) {
                int iE2 = e(gVar);
                if (iE2 != -1) {
                    byte[] bArr = (byte[]) fVar.e(iE2, byte[].class);
                    try {
                        return f(gVar, bArr, iE2);
                    } finally {
                        fVar.i(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iE);
                return -1;
            }
        } catch (e unused) {
        }
        return -1;
    }

    @Override // B4.c
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        gc.b.k(byteBuffer, "Argument must not be null");
        return d(new S3.l(byteBuffer));
    }

    @Override // B4.c
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return d(new g(inputStream));
    }
}
