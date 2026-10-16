package androidx.media3.exoplayer.video.spherical;

import com.google.d.b.an;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class Projection {
    public static final int DRAW_MODE_TRIANGLES = 0;
    public static final int DRAW_MODE_TRIANGLES_FAN = 2;
    public static final int DRAW_MODE_TRIANGLES_STRIP = 1;
    public static final int POSITION_COORDS_PER_VERTEX = 3;
    public static final int TEXTURE_COORDS_PER_VERTEX = 2;
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    /* compiled from: WazeSource */
    public final class Mesh {
        private final SubMesh[] subMeshes;

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }

        public SubMesh getSubMesh(int i2) {
            return this.subMeshes[i2];
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }
    }

    /* compiled from: WazeSource */
    public final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int i2, float[] fArr, float[] fArr2, int i3) {
            this.textureId = i2;
            long length = fArr.length;
            an.l(length + length == ((long) fArr2.length) * 3);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i3;
        }

        public int getVertexCount() {
            return this.vertices.length / 3;
        }
    }

    public Projection(Mesh mesh, Mesh mesh2, int i2) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i2;
        this.singleMesh = mesh == mesh2;
    }

    public static Projection createEquirectangular(float f2, int i2, int i3, float f3, float f4, int i4) {
        int i5;
        int i6;
        float f5 = f2;
        int i7 = i2;
        an.l(f5 > 0.0f);
        an.l(i7 > 0);
        an.l(i3 > 0);
        an.l(f3 > 0.0f && f3 <= 180.0f);
        an.l(f4 > 0.0f && f4 <= 360.0f);
        float radians = (float) Math.toRadians(f3);
        float radians2 = (float) Math.toRadians(f4);
        float f6 = i7;
        float f7 = i3;
        int i8 = i3 + 1;
        int i9 = 2;
        int i10 = (i8 + i8 + 2) * i7;
        int i11 = i10 + i10;
        float[] fArr = new float[i10 * 3];
        float[] fArr2 = new float[i11];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i7) {
            float f8 = radians / f6;
            float f9 = radians / 2.0f;
            int i15 = i12 + 1;
            int i16 = 0;
            while (i16 < i8) {
                int i17 = i14;
                int i18 = 0;
                while (i18 < i9) {
                    float f10 = radians;
                    float f11 = (i15 * f8) - f9;
                    float f12 = (i12 * f8) - f9;
                    float f13 = (radians2 / f7) * i16;
                    int i19 = i13 + 1;
                    float f14 = radians2;
                    double d2 = f5;
                    double d3 = (f13 + 3.1415927f) - (radians2 / 2.0f);
                    double dSin = Math.sin(d3) * d2;
                    if (i18 == 0) {
                        f11 = f12;
                    }
                    double d4 = f11;
                    fArr[i13] = -((float) (dSin * Math.cos(d4)));
                    fArr[i19] = (float) (Math.sin(d4) * d2);
                    int i20 = i13 + 3;
                    float f15 = f6;
                    fArr[i13 + 2] = (float) (Math.cos(d3) * d2 * Math.cos(d4));
                    fArr2[i17] = f13 / f14;
                    int i21 = i17 + 2;
                    fArr2[i17 + 1] = ((i12 + i18) * f8) / f10;
                    if (i16 != 0) {
                        i5 = i16;
                    } else if (i18 != 0) {
                        i5 = 0;
                    } else {
                        i18 = 0;
                        System.arraycopy(fArr, i13, fArr, i20, 3);
                        i13 += 6;
                        i6 = 2;
                        System.arraycopy(fArr2, i17, fArr2, i21, 2);
                        i17 += 4;
                        i18++;
                        i9 = i6;
                        f6 = f15;
                        f5 = f2;
                        radians = f10;
                        radians2 = f14;
                    }
                    if (i5 == i3 && i18 == 1) {
                        System.arraycopy(fArr, i13, fArr, i20, 3);
                        i13 += 6;
                        i6 = 2;
                        System.arraycopy(fArr2, i17, fArr2, i21, 2);
                        i17 += 4;
                    } else {
                        i6 = 2;
                        i13 = i20;
                        i17 = i21;
                    }
                    i18++;
                    i9 = i6;
                    f6 = f15;
                    f5 = f2;
                    radians = f10;
                    radians2 = f14;
                }
                i16++;
                i9 = i9;
                f6 = f6;
                f5 = f2;
                i14 = i17;
                radians = radians;
            }
            i9 = i9;
            f6 = f6;
            f5 = f2;
            i7 = i2;
            i12 = i15;
        }
        return new Projection(new Mesh(new SubMesh(0, fArr, fArr2, 1)), i4);
    }

    public Projection(Mesh mesh, int i2) {
        this(mesh, mesh, i2);
    }

    public static Projection createEquirectangular(int i2) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i2);
    }
}
