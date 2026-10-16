package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.exoplayer.video.spherical.Projection;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ProjectionDecoder {
    private static final double LOG2 = Math.log(2.0d);
    private static final int MAX_COORDINATE_COUNT = 10000;
    private static final int MAX_TRIANGLE_INDICES = 128000;
    private static final int MAX_VERTEX_COUNT = 32000;
    private static final int TYPE_DFL8 = 1684433976;
    private static final int TYPE_MESH = 1835365224;
    private static final int TYPE_MSHP = 1836279920;
    private static final int TYPE_PROJ = 1886547818;
    private static final int TYPE_RAW = 1918990112;
    private static final int TYPE_YTMP = 2037673328;

    private ProjectionDecoder() {
    }

    public static Projection decode(byte[] bArr, int i2) {
        ArrayList<Projection.Mesh> proj;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        try {
            proj = isProj(parsableByteArray) ? parseProj(parsableByteArray) : parseMshp(parsableByteArray);
        } catch (ArrayIndexOutOfBoundsException unused) {
            proj = null;
        }
        if (proj != null) {
            int size = proj.size();
            if (size == 1) {
                return new Projection(proj.get(0), i2);
            }
            if (size == 2) {
                return new Projection(proj.get(0), proj.get(1), i2);
            }
        }
        return null;
    }

    private static int decodeZigZag(int i2) {
        return (i2 >> 1) ^ (-(i2 & 1));
    }

    private static boolean isProj(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int i2 = parsableByteArray.readInt();
        parsableByteArray.setPosition(0);
        return i2 == 1886547818;
    }

    private static Projection.Mesh parseMesh(ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        if (i2 <= 0 || i2 > 10000) {
            return null;
        }
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = parsableByteArray.readFloat();
        }
        int i4 = parsableByteArray.readInt();
        if (i4 <= 0 || i4 > MAX_VERTEX_COUNT) {
            return null;
        }
        double d2 = i2;
        int iCeil = (int) Math.ceil(Math.log(d2 + d2) / LOG2);
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        float[] fArr2 = new float[i4 * 5];
        int[] iArr = new int[5];
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < 5) {
                int iDecodeZigZag = iArr[i7] + decodeZigZag(parsableBitArray.readBits(iCeil));
                if (iDecodeZigZag >= i2 || iDecodeZigZag < 0) {
                    return null;
                }
                fArr2[i5] = fArr[iDecodeZigZag];
                iArr[i7] = iDecodeZigZag;
                i7++;
                i5++;
            }
        }
        parsableBitArray.setPosition((parsableBitArray.getPosition() + 7) & (-8));
        int i8 = 32;
        int bits = parsableBitArray.readBits(32);
        if (bits <= 0) {
            return null;
        }
        Projection.SubMesh[] subMeshArr = new Projection.SubMesh[bits];
        int i9 = 0;
        while (i9 < bits) {
            int bits2 = parsableBitArray.readBits(8);
            int bits3 = parsableBitArray.readBits(8);
            int bits4 = parsableBitArray.readBits(i8);
            if (bits4 <= 0 || bits4 > MAX_TRIANGLE_INDICES) {
                return null;
            }
            double d3 = i4;
            int iCeil2 = (int) Math.ceil(Math.log(d3 + d3) / LOG2);
            float[] fArr3 = new float[bits4 * 3];
            float[] fArr4 = new float[bits4 + bits4];
            int i10 = 0;
            int i11 = 0;
            while (i10 < bits4) {
                int iDecodeZigZag2 = i11 + decodeZigZag(parsableBitArray.readBits(iCeil2));
                if (iDecodeZigZag2 < 0 || iDecodeZigZag2 >= i4) {
                    return null;
                }
                int i12 = i10 * 3;
                int i13 = iDecodeZigZag2 * 5;
                fArr3[i12] = fArr2[i13];
                fArr3[i12 + 1] = fArr2[i13 + 1];
                fArr3[i12 + 2] = fArr2[i13 + 2];
                int i14 = i10 + i10;
                fArr4[i14] = fArr2[i13 + 3];
                fArr4[i14 + 1] = fArr2[i13 + 4];
                i10++;
                i11 = iDecodeZigZag2;
            }
            subMeshArr[i9] = new Projection.SubMesh(bits2, fArr3, fArr4, bits3);
            i9++;
            i8 = 32;
        }
        return new Projection.Mesh(subMeshArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r0 != androidx.media3.exoplayer.video.spherical.ProjectionDecoder.TYPE_RAW) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<androidx.media3.exoplayer.video.spherical.Projection.Mesh> parseMshp(androidx.media3.common.util.ParsableByteArray r4) {
        /*
            int r0 = r4.readUnsignedByte()
            r1 = 0
            if (r0 == 0) goto L8
            goto L39
        L8:
            r0 = 7
            r4.skipBytes(r0)
            int r0 = r4.readInt()
            r2 = 1684433976(0x64666c38, float:1.7002196E22)
            if (r0 != r2) goto L34
            androidx.media3.common.util.ParsableByteArray r0 = new androidx.media3.common.util.ParsableByteArray
            r0.<init>()
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r3 = 1
            r2.<init>(r3)
            boolean r4 = androidx.media3.common.util.Util.inflate(r4, r0, r2)     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L2a
            r2.end()
            return r1
        L2a:
            r2.end()
            r4 = r0
            goto L3a
        L2f:
            r4 = move-exception
            r2.end()
            throw r4
        L34:
            r2 = 1918990112(0x72617720, float:4.465801E30)
            if (r0 == r2) goto L3a
        L39:
            return r1
        L3a:
            java.util.ArrayList r4 = parseRawMshpData(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.spherical.ProjectionDecoder.parseMshp(androidx.media3.common.util.ParsableByteArray):java.util.ArrayList");
    }

    private static ArrayList<Projection.Mesh> parseProj(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(8);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit) {
            int i2 = parsableByteArray.readInt() + position;
            if (i2 <= position || i2 > iLimit) {
                return null;
            }
            int i3 = parsableByteArray.readInt();
            if (i3 == TYPE_YTMP || i3 == TYPE_MSHP) {
                parsableByteArray.setLimit(i2);
                return parseMshp(parsableByteArray);
            }
            parsableByteArray.setPosition(i2);
            position = i2;
        }
        return null;
    }

    private static ArrayList<Projection.Mesh> parseRawMshpData(ParsableByteArray parsableByteArray) {
        ArrayList<Projection.Mesh> arrayList = new ArrayList<>();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit) {
            int i2 = parsableByteArray.readInt() + position;
            if (i2 <= position || i2 > iLimit) {
                return null;
            }
            if (parsableByteArray.readInt() == TYPE_MESH) {
                Projection.Mesh mesh = parseMesh(parsableByteArray);
                if (mesh == null) {
                    return null;
                }
                arrayList.add(mesh);
            }
            parsableByteArray.setPosition(i2);
            position = i2;
        }
        return arrayList;
    }
}
