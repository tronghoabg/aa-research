package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import androidx.camera.video.AudioStats;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PathParser {
    private static final String LOGTAG = "PathParser";

    /* compiled from: WazeSource */
    class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
        }
    }

    private PathParser() {
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c2, float[] fArr) {
        arrayList.add(new PathDataNode(c2, fArr));
    }

    public static boolean canMorph(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr != null && pathDataNodeArr2 != null) {
            if (pathDataNodeArr.length == pathDataNodeArr2.length) {
                for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
                    if (pathDataNodeArr[i2].mType != pathDataNodeArr2[i2].mType || pathDataNodeArr[i2].mParams.length != pathDataNodeArr2[i2].mParams.length) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    static float[] copyOfRange(float[] fArr, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i2 < 0 || i2 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = i3 - i2;
        int iMin = Math.min(i4, length - i2);
        float[] fArr2 = new float[i4];
        System.arraycopy(fArr, i2, fArr2, 0, iMin);
        return fArr2;
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        while (i2 < str.length()) {
            int iNextStart = nextStart(str, i2);
            String strTrim = str.substring(i3, iNextStart).trim();
            if (!strTrim.isEmpty()) {
                addNode(arrayList, strTrim.charAt(0), getFloats(strTrim));
            }
            i3 = iNextStart;
            i2 = iNextStart + 1;
        }
        if (i2 - i3 == 1 && i3 < str.length()) {
            addNode(arrayList, str.charAt(i3), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[0]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        try {
            PathDataNode.nodesToPath(createNodesFromPathData(str), path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(str)), e2);
        }
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            pathDataNodeArr2[i2] = new PathDataNode(pathDataNodeArr[i2]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c A[LOOP:0: B:3:0x0007->B:23:0x003c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void extract(java.lang.String r8, int r9, androidx.core.graphics.PathParser.ExtractFloatResult r10) {
        /*
            r0 = 0
            r10.mEndWithNegOrDot = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3f
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L37
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L37;
                case 45: goto L2e;
                case 46: goto L23;
                default: goto L21;
            }
        L21:
            r3 = r0
            goto L39
        L23:
            if (r2 != 0) goto L28
            r3 = r0
            r2 = r7
            goto L39
        L28:
            r10.mEndWithNegOrDot = r7
            r3 = r0
            r2 = r7
            r4 = r2
            goto L39
        L2e:
            if (r1 == r9) goto L21
            if (r3 != 0) goto L21
            r10.mEndWithNegOrDot = r7
            goto L37
        L35:
            r3 = r7
            goto L39
        L37:
            r3 = r0
            r4 = r7
        L39:
            if (r4 == 0) goto L3c
            goto L3f
        L3c:
            int r1 = r1 + 1
            goto L7
        L3f:
            r10.mEndPosition = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.extract(java.lang.String, int, androidx.core.graphics.PathParser$ExtractFloatResult):void");
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i2 = 1;
            int i3 = 0;
            while (i2 < length) {
                extract(str, i2, extractFloatResult);
                int i4 = extractFloatResult.mEndPosition;
                if (i2 < i4) {
                    fArr[i3] = Float.parseFloat(str.substring(i2, i4));
                    i3++;
                }
                i2 = extractFloatResult.mEndWithNegOrDot ? i4 : i4 + 1;
            }
            return copyOfRange(fArr, 0, i3);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e2);
        }
    }

    @Deprecated
    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f2) {
        int length = pathDataNodeArr.length;
        int length2 = pathDataNodeArr2.length;
        if (length != length2 || length2 != pathDataNodeArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
            return false;
        }
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            pathDataNodeArr[i2].interpolatePathDataNode(pathDataNodeArr2[i2], pathDataNodeArr3[i2], f2);
        }
        return true;
    }

    private static int nextStart(String str, int i2) {
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i2++;
        }
        return i2;
    }

    public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
        float[] fArr = new float[6];
        char c2 = 'm';
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            PathDataNode.addCommand(path, fArr, c2, pathDataNode.mType, pathDataNode.mParams);
            c2 = pathDataNode.mType;
        }
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i2 = 0; i2 < pathDataNodeArr2.length; i2++) {
            pathDataNodeArr[i2].mType = pathDataNodeArr2[i2].mType;
            for (int i3 = 0; i3 < pathDataNodeArr2[i2].mParams.length; i3++) {
                pathDataNodeArr[i2].mParams[i3] = pathDataNodeArr2[i2].mParams[i3];
            }
        }
    }

    /* compiled from: WazeSource */
    public class PathDataNode {
        private final float[] mParams;
        private char mType;

        PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void addCommand(Path path, float[] fArr, char c2, char c3, float[] fArr2) {
            int i2;
            int i3;
            boolean z;
            boolean z2;
            char c4;
            char c5;
            int i4;
            float f2;
            boolean z3;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            boolean z4;
            boolean z5;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            Path path2 = path;
            boolean z6 = false;
            float f15 = fArr[0];
            boolean z7 = true;
            float f16 = fArr[1];
            char c6 = 2;
            float f17 = fArr[2];
            char c7 = 3;
            float f18 = fArr[3];
            float f19 = fArr[4];
            float f20 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i2 = 7;
                    i3 = i2;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    i3 = i2;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i3 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i3 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i3 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    i3 = 2;
                    break;
            }
            float f21 = f15;
            float f22 = f16;
            float f23 = f19;
            float f24 = f20;
            int i5 = 0;
            char c8 = c2;
            while (i5 < fArr2.length) {
                if (c3 == 'A') {
                    float f25 = f21;
                    float f26 = f22;
                    z = z6;
                    z2 = z7;
                    c4 = c6;
                    c5 = c7;
                    i4 = i5;
                    int i6 = i4 + 6;
                    int i7 = i4 + 5;
                    int i8 = i4 + 4;
                    float f27 = fArr2[i7];
                    float f28 = fArr2[i6];
                    float f29 = fArr2[i4];
                    float f30 = fArr2[i4 + 1];
                    float f31 = fArr2[i4 + 2];
                    if (fArr2[i4 + 3] != 0.0f) {
                        f2 = 0.0f;
                        z3 = z2;
                    } else {
                        f2 = 0.0f;
                        z3 = z;
                    }
                    drawArc(path, f25, f26, f27, f28, f29, f30, f31, z3, fArr2[i8] != f2 ? z2 : z);
                    f17 = fArr2[i7];
                    f21 = f17;
                    f18 = fArr2[i6];
                    f22 = f18;
                } else if (c3 == 'C') {
                    z = z6;
                    z2 = z7;
                    c4 = c6;
                    c5 = c7;
                    i4 = i5;
                    int i9 = i4 + 5;
                    int i10 = i4 + 4;
                    int i11 = i4 + 3;
                    int i12 = i4 + 2;
                    path2.cubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i12], fArr2[i11], fArr2[i10], fArr2[i9]);
                    float f32 = fArr2[i10];
                    float f33 = fArr2[i9];
                    float f34 = fArr2[i12];
                    float f35 = fArr2[i11];
                    f21 = f32;
                    f22 = f33;
                    f18 = f35;
                    f17 = f34;
                } else if (c3 != 'H') {
                    if (c3 != 'Q') {
                        z = z6;
                        if (c3 == 'V') {
                            z2 = z7;
                            c4 = c6;
                            c5 = c7;
                            i4 = i5;
                            path2.lineTo(f21, fArr2[i4]);
                            f4 = fArr2[i4];
                        } else if (c3 != 'a') {
                            z2 = z7;
                            if (c3 == 'c') {
                                c4 = c6;
                                c5 = c7;
                                int i13 = i5 + 5;
                                int i14 = i5 + 4;
                                int i15 = i5 + 3;
                                int i16 = i5 + 2;
                                path2.rCubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i16], fArr2[i15], fArr2[i14], fArr2[i13]);
                                float f36 = fArr2[i16] + f21;
                                float f37 = fArr2[i15] + f22;
                                f21 += fArr2[i14];
                                f22 += fArr2[i13];
                                f17 = f36;
                                f18 = f37;
                            } else if (c3 == 'h') {
                                c4 = c6;
                                c5 = c7;
                                path2.rLineTo(fArr2[i5], 0.0f);
                                f21 += fArr2[i5];
                            } else if (c3 != 'q') {
                                c4 = c6;
                                if (c3 != 'v') {
                                    if (c3 == 'L') {
                                        c5 = c7;
                                        int i17 = i5 + 1;
                                        path2.lineTo(fArr2[i5], fArr2[i17]);
                                        f9 = fArr2[i5];
                                        f10 = fArr2[i17];
                                    } else if (c3 != 'M') {
                                        c5 = c7;
                                        if (c3 == 'S') {
                                            int i18 = i5 + 3;
                                            int i19 = i5 + 2;
                                            int i20 = i5 + 1;
                                            if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                                f22 = (f22 + f22) - f18;
                                                f21 = (f21 + f21) - f17;
                                            }
                                            path2.cubicTo(f21, f22, fArr2[i5], fArr2[i20], fArr2[i19], fArr2[i18]);
                                            float f38 = fArr2[i5];
                                            f3 = fArr2[i20];
                                            f21 = fArr2[i19];
                                            f22 = fArr2[i18];
                                            i4 = i5;
                                            f17 = f38;
                                        } else if (c3 == 'T') {
                                            int i21 = i5 + 1;
                                            if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                                f22 = (f22 + f22) - f18;
                                                f21 = (f21 + f21) - f17;
                                            }
                                            path2.quadTo(f21, f22, fArr2[i5], fArr2[i21]);
                                            float f39 = fArr2[i5];
                                            f4 = fArr2[i21];
                                            f17 = f21;
                                            f18 = f22;
                                            i4 = i5;
                                            f21 = f39;
                                        } else if (c3 == 'l') {
                                            int i22 = i5 + 1;
                                            path2.rLineTo(fArr2[i5], fArr2[i22]);
                                            f21 += fArr2[i5];
                                            f8 = fArr2[i22];
                                        } else if (c3 == 'm') {
                                            float f40 = fArr2[i5];
                                            f21 += f40;
                                            float f41 = fArr2[i5 + 1];
                                            f22 += f41;
                                            if (i5 > 0) {
                                                path2.rLineTo(f40, f41);
                                            } else {
                                                path2.rMoveTo(f40, f41);
                                                f23 = f21;
                                                f24 = f22;
                                            }
                                        } else if (c3 == 's') {
                                            int i23 = i5 + 3;
                                            int i24 = i5 + 2;
                                            int i25 = i5 + 1;
                                            if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                                f11 = f21 - f17;
                                                f12 = f22 - f18;
                                            } else {
                                                f11 = 0.0f;
                                                f12 = 0.0f;
                                            }
                                            path2.rCubicTo(f11, f12, fArr2[i5], fArr2[i25], fArr2[i24], fArr2[i23]);
                                            float f42 = fArr2[i5] + f21;
                                            float f43 = fArr2[i25] + f22;
                                            f21 += fArr2[i24];
                                            f22 += fArr2[i23];
                                            f17 = f42;
                                            f18 = f43;
                                        } else if (c3 == 't') {
                                            int i26 = i5 + 1;
                                            if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                                f13 = f21 - f17;
                                                f14 = f22 - f18;
                                            } else {
                                                f14 = 0.0f;
                                                f13 = 0.0f;
                                            }
                                            path2.rQuadTo(f13, f14, fArr2[i5], fArr2[i26]);
                                            float f44 = f13 + f21;
                                            float f45 = f14 + f22;
                                            f21 += fArr2[i5];
                                            f22 += fArr2[i26];
                                            f18 = f45;
                                            f17 = f44;
                                        }
                                    } else {
                                        c5 = c7;
                                        f9 = fArr2[i5];
                                        f10 = fArr2[i5 + 1];
                                        if (i5 > 0) {
                                            path2.lineTo(f9, f10);
                                        } else {
                                            path2.moveTo(f9, f10);
                                            f22 = f10;
                                            f24 = f22;
                                            f21 = f9;
                                            f23 = f21;
                                        }
                                    }
                                    f22 = f10;
                                    f21 = f9;
                                } else {
                                    c5 = c7;
                                    path2.rLineTo(0.0f, fArr2[i5]);
                                    f8 = fArr2[i5];
                                }
                                f22 += f8;
                            } else {
                                c4 = c6;
                                c5 = c7;
                                int i27 = i5 + 3;
                                int i28 = i5 + 2;
                                int i29 = i5 + 1;
                                path2.rQuadTo(fArr2[i5], fArr2[i29], fArr2[i28], fArr2[i27]);
                                float f46 = fArr2[i5] + f21;
                                float f47 = fArr2[i29] + f22;
                                f21 += fArr2[i28];
                                f22 += fArr2[i27];
                                f18 = f47;
                                f17 = f46;
                            }
                            i4 = i5;
                        } else {
                            z2 = z7;
                            c4 = c6;
                            c5 = c7;
                            int i30 = i5 + 6;
                            int i31 = i5 + 5;
                            int i32 = i5 + 4;
                            float f48 = fArr2[i31] + f21;
                            float f49 = fArr2[i30] + f22;
                            float f50 = fArr2[i5];
                            float f51 = fArr2[i5 + 1];
                            float f52 = fArr2[i5 + 2];
                            if (fArr2[i5 + 3] != 0.0f) {
                                f5 = f21;
                                f6 = f52;
                                f7 = f22;
                                z4 = z2;
                            } else {
                                f5 = f21;
                                f6 = f52;
                                f7 = f22;
                                z4 = z;
                            }
                            if (fArr2[i32] != 0.0f) {
                                i4 = i5;
                                z5 = z2;
                            } else {
                                i4 = i5;
                                z5 = z;
                            }
                            drawArc(path, f5, f7, f48, f49, f50, f51, f6, z4, z5);
                            f21 = f5 + fArr2[i31];
                            f22 = f7 + fArr2[i30];
                            f17 = f21;
                            f18 = f22;
                        }
                        f22 = f4;
                    } else {
                        z = z6;
                        z2 = z7;
                        c4 = c6;
                        c5 = c7;
                        i4 = i5;
                        int i33 = i4 + 3;
                        int i34 = i4 + 2;
                        int i35 = i4 + 1;
                        path2.quadTo(fArr2[i4], fArr2[i35], fArr2[i34], fArr2[i33]);
                        f17 = fArr2[i4];
                        f3 = fArr2[i35];
                        f21 = fArr2[i34];
                        f22 = fArr2[i33];
                    }
                    f18 = f3;
                } else {
                    z = z6;
                    z2 = z7;
                    c4 = c6;
                    c5 = c7;
                    i4 = i5;
                    path2.lineTo(fArr2[i4], f22);
                    f21 = fArr2[i4];
                }
                i5 = i4 + i3;
                path2 = path;
                c8 = c3;
                z6 = z;
                z7 = z2;
                c6 = c4;
                c7 = c5;
            }
            fArr[z6 ? 1 : 0] = f21;
            fArr[z7 ? 1 : 0] = f22;
            fArr[c6] = f17;
            fArr[c7] = f18;
            fArr[4] = f23;
            fArr[5] = f24;
        }

        private static void arcToBezier(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
            int iCeil = (int) Math.ceil(Math.abs((d10 * 4.0d) / 3.141592653589793d));
            double d11 = -d4;
            double dCos = Math.cos(d8);
            double d12 = d11 * dCos;
            double dSin = Math.sin(d8);
            double dCos2 = Math.cos(d9);
            double dSin2 = Math.sin(d9);
            double d13 = d5 * dSin;
            double d14 = d11 * dSin;
            double d15 = d5 * dCos;
            int i2 = 0;
            double d16 = (dSin2 * d14) + (dCos2 * d15);
            double d17 = (d12 * dSin2) - (d13 * dCos2);
            double d18 = d6;
            double d19 = d7;
            double d20 = d9;
            while (i2 < iCeil) {
                double d21 = d20 + (d10 / iCeil);
                double dSin3 = Math.sin(d21);
                double dCos3 = Math.cos(d21);
                double d22 = d21 - d20;
                double dTan = Math.tan(d22 / 2.0d);
                double dSin4 = (Math.sin(d22) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d23 = d19 + (d16 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                int i3 = i2;
                double d24 = d3 + (d4 * dSin * dCos3) + (d15 * dSin3);
                int i4 = iCeil;
                double d25 = (d2 + ((d4 * dCos) * dCos3)) - (d13 * dSin3);
                double d26 = (dSin3 * d14) + (dCos3 * d15);
                double d27 = (d12 * dSin3) - (d13 * dCos3);
                path.cubicTo((float) (d18 + (d17 * dSin4)), (float) d23, (float) (d25 - (dSin4 * d27)), (float) (d24 - (dSin4 * d26)), (float) d25, (float) d24);
                d20 = d21;
                d19 = d24;
                d18 = d25;
                iCeil = i4;
                d14 = d14;
                d16 = d26;
                d17 = d27;
                dCos = dCos;
                d12 = d12;
                i2 = i3 + 1;
            }
        }

        private static void drawArc(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
            double d2;
            double d3;
            double radians = Math.toRadians(f8);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d4 = f2;
            double d5 = f3;
            double d6 = d5 * dCos;
            double d7 = f4 * dCos;
            double d8 = f5;
            double d9 = f6;
            double d10 = f7;
            double d11 = (((-f2) * dSin) + d6) / d10;
            double d12 = (((-f4) * dSin) + (d8 * dCos)) / d10;
            double d13 = d11 - d12;
            double d14 = ((d4 * dCos) + (d5 * dSin)) / d9;
            double d15 = (d7 + (d8 * dSin)) / d9;
            double d16 = d14 - d15;
            double d17 = (d16 * d16) + (d13 * d13);
            if (d17 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                Log.w(PathParser.LOGTAG, " Points are coincident");
                return;
            }
            double d18 = (1.0d / d17) - 0.25d;
            if (d18 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                Log.w(PathParser.LOGTAG, "Points are too far apart " + d17);
                float fSqrt = (float) (Math.sqrt(d17) / 1.99999d);
                drawArc(path, f2, f3, f4, f5, f6 * fSqrt, fSqrt * f7, f8, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d18);
            double d19 = (d11 + d12) / 2.0d;
            double d20 = d16 * dSqrt;
            double d21 = (d14 + d15) / 2.0d;
            double d22 = dSqrt * d13;
            if (z == z2) {
                d2 = d21 - d22;
                d3 = d19 + d20;
            } else {
                d2 = d21 + d22;
                d3 = d19 - d20;
            }
            double d23 = d3;
            double d24 = d2;
            double dAtan2 = Math.atan2(d11 - d23, d14 - d2);
            double dAtan22 = Math.atan2(d12 - d23, d15 - d24) - dAtan2;
            if (z2 != (dAtan22 >= AudioStats.AUDIO_AMPLITUDE_NONE)) {
                dAtan22 += dAtan22 > AudioStats.AUDIO_AMPLITUDE_NONE ? -6.283185307179586d : 6.283185307179586d;
            }
            double d25 = d24 * d9;
            double d26 = d23 * d10;
            arcToBezier(path, (d25 * dCos) - (d26 * dSin), (d25 * dSin) + (d26 * dCos), d9, d10, d4, d5, radians, dAtan2, dAtan22);
        }

        @Deprecated
        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            PathParser.nodesToPath(pathDataNodeArr, path);
        }

        public float[] getParams() {
            return this.mParams;
        }

        public char getType() {
            return this.mType;
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f2) {
            this.mType = pathDataNode.mType;
            int i2 = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i2 >= fArr.length) {
                    return;
                }
                this.mParams[i2] = (fArr[i2] * (1.0f - f2)) + (pathDataNode2.mParams[i2] * f2);
                i2++;
            }
        }

        PathDataNode(char c2, float[] fArr) {
            this.mType = c2;
            this.mParams = fArr;
        }
    }

    public static void interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, float f2, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3) {
        if (!interpolatePathDataNodes(pathDataNodeArr, pathDataNodeArr2, pathDataNodeArr3, f2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }
}
