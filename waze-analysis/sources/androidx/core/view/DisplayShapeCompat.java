package androidx.core.view;

import android.graphics.Path;
import android.view.DisplayShape;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DisplayShapeCompat {
    static final DisplayShapeCompat EMPTY = new DisplayShapeCompat("", 0, 0, 1.0f, 0, 0, 0, 1.0f);
    private static final String TAG = "DisplayShapeCompat";
    private final Impl mImpl;

    /* compiled from: WazeSource */
    interface Impl {
        Path getPath();

        DisplayShape getPlatformDisplayShape();
    }

    /* compiled from: WazeSource */
    class Impl34 implements Impl {
        private final DisplayShape mPlatformDisplayShape;

        Impl34(DisplayShape displayShape) {
            this.mPlatformDisplayShape = displayShape;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Impl34) {
                return Objects.equals(this.mPlatformDisplayShape, ((Impl34) obj).mPlatformDisplayShape);
            }
            return false;
        }

        @Override // androidx.core.view.DisplayShapeCompat.Impl
        public Path getPath() {
            return this.mPlatformDisplayShape.getPath();
        }

        @Override // androidx.core.view.DisplayShapeCompat.Impl
        public DisplayShape getPlatformDisplayShape() {
            return this.mPlatformDisplayShape;
        }

        public int hashCode() {
            return Objects.hashCode(this.mPlatformDisplayShape);
        }

        public String toString() {
            return "DisplayShapeCompat{mPlatformDisplayShape=" + this.mPlatformDisplayShape + '}';
        }
    }

    /* compiled from: WazeSource */
    class ImplBase implements Impl {
        private Path mCachedPath;
        private final int mDisplayHeight;
        private final String mDisplayShapeSpec;
        private final int mDisplayWidth;
        private final int mOffsetX;
        private final int mOffsetY;
        private final float mPhysicalPixelDisplaySizeRatio;
        private final int mRotation;
        private final float mScale;

        ImplBase(String str, int i2, int i3, float f2, int i4, int i5, int i6, float f3) {
            this.mDisplayShapeSpec = str;
            this.mDisplayWidth = i2;
            this.mDisplayHeight = i3;
            this.mPhysicalPixelDisplaySizeRatio = f2;
            this.mRotation = i4;
            this.mOffsetX = i5;
            this.mOffsetY = i6;
            this.mScale = f3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImplBase)) {
                return false;
            }
            ImplBase implBase = (ImplBase) obj;
            return Objects.equals(this.mDisplayShapeSpec, implBase.mDisplayShapeSpec) && this.mDisplayWidth == implBase.mDisplayWidth && this.mDisplayHeight == implBase.mDisplayHeight && this.mPhysicalPixelDisplaySizeRatio == implBase.mPhysicalPixelDisplaySizeRatio && this.mRotation == implBase.mRotation && this.mOffsetX == implBase.mOffsetX && this.mOffsetY == implBase.mOffsetY && this.mScale == implBase.mScale;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
        @Override // androidx.core.view.DisplayShapeCompat.Impl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.graphics.Path getPath() {
            /*
                r6 = this;
                android.graphics.Path r0 = r6.mCachedPath
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = r6.mDisplayShapeSpec
                if (r0 == 0) goto L8a
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L8a
                android.graphics.Path r0 = androidx.core.graphics.PathParser.createPathFromPathData(r0)     // Catch: java.lang.RuntimeException -> L77
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L74
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                int r2 = r6.mRotation
                if (r2 == 0) goto L4d
                r3 = 1
                r4 = 0
                if (r2 == r3) goto L42
                r3 = 2
                if (r2 == r3) goto L39
                r3 = 3
                if (r2 == r3) goto L2f
                r2 = r4
                r3 = r2
                goto L4a
            L2f:
                int r2 = r6.mDisplayHeight
                float r2 = (float) r2
                r3 = 1132920832(0x43870000, float:270.0)
                r5 = r3
                r3 = r2
                r2 = r4
                r4 = r5
                goto L4a
            L39:
                int r2 = r6.mDisplayWidth
                int r3 = r6.mDisplayHeight
                float r4 = (float) r3
                float r2 = (float) r2
                r3 = 1127481344(0x43340000, float:180.0)
                goto L47
            L42:
                int r2 = r6.mDisplayWidth
                float r2 = (float) r2
                r3 = 1119092736(0x42b40000, float:90.0)
            L47:
                r5 = r4
                r4 = r3
                r3 = r5
            L4a:
                r1.preRotate(r4, r2, r3)
            L4d:
                float r2 = r6.mPhysicalPixelDisplaySizeRatio
                r3 = 1065353216(0x3f800000, float:1.0)
                int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r4 == 0) goto L58
                r1.preScale(r2, r2)
            L58:
                int r2 = r6.mOffsetX
                if (r2 != 0) goto L61
                int r2 = r6.mOffsetY
                if (r2 == 0) goto L68
                r2 = 0
            L61:
                int r4 = r6.mOffsetY
                float r2 = (float) r2
                float r4 = (float) r4
                r1.postTranslate(r2, r4)
            L68:
                float r2 = r6.mScale
                int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r3 == 0) goto L71
                r1.postScale(r2, r2)
            L71:
                r0.transform(r1)
            L74:
                r6.mCachedPath = r0
                return r0
            L77:
                r0 = move-exception
                java.lang.String r6 = r6.mDisplayShapeSpec
                java.lang.String r6 = java.lang.String.valueOf(r6)
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Failed to parse DisplayShapeCompat path data: "
                java.lang.String r6 = r2.concat(r6)
                r1.<init>(r6, r0)
                throw r1
            L8a:
                android.graphics.Path r6 = new android.graphics.Path
                r6.<init>()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.DisplayShapeCompat.ImplBase.getPath():android.graphics.Path");
        }

        @Override // androidx.core.view.DisplayShapeCompat.Impl
        public DisplayShape getPlatformDisplayShape() {
            return null;
        }

        public int hashCode() {
            return Objects.hash(this.mDisplayShapeSpec, Integer.valueOf(this.mDisplayWidth), Integer.valueOf(this.mDisplayHeight), Float.valueOf(this.mPhysicalPixelDisplaySizeRatio), Integer.valueOf(this.mRotation), Integer.valueOf(this.mOffsetX), Integer.valueOf(this.mOffsetY), Float.valueOf(this.mScale));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
            String str = this.mDisplayShapeSpec;
            sb.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
            sb.append(" displayWidth=");
            sb.append(this.mDisplayWidth);
            sb.append(" displayHeight=");
            sb.append(this.mDisplayHeight);
            sb.append(" physicalPixelDisplaySizeRatio=");
            sb.append(this.mPhysicalPixelDisplaySizeRatio);
            sb.append(" rotation=");
            sb.append(this.mRotation);
            sb.append(" offsetX=");
            sb.append(this.mOffsetX);
            sb.append(" offsetY=");
            sb.append(this.mOffsetY);
            sb.append(" scale=");
            sb.append(this.mScale);
            sb.append("}");
            return sb.toString();
        }
    }

    private DisplayShapeCompat(String str, int i2, int i3, float f2, int i4, int i5, int i6, float f3) {
        this.mImpl = new ImplBase(str, i2, i3, f2, i4, i5, i6, f3);
    }

    public static DisplayShapeCompat create(int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        return new DisplayShapeCompat(createSpecString(i2, i3, z, i4, i5, i6, i7), i2, i3, 1.0f, 0, 0, 0, 1.0f);
    }

    private static String createSpecString(int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        if (z) {
            int i8 = i2 / 2;
            int i9 = i3 / 2;
            return "M0," + i9 + " A" + i8 + "," + i9 + " 0 1,1 " + i2 + "," + i9 + " A" + i8 + "," + i9 + " 0 1,1 0," + i9 + " Z";
        }
        StringBuilder sb = new StringBuilder("M ");
        int iMin = Math.min(i2 / 2, i3 / 2);
        int iMin2 = Math.min(iMin, i4);
        int iMin3 = Math.min(iMin, i5);
        int iMin4 = Math.min(iMin, i6);
        int iMin5 = Math.min(iMin, i7);
        sb.append(iMin2);
        sb.append(",0 L ");
        sb.append(i2 - iMin3);
        sb.append(",0");
        if (iMin3 > 0) {
            sb.append(" A ");
            sb.append(iMin3);
            sb.append(",");
            sb.append(iMin3);
            sb.append(" 0 0,1 ");
            sb.append(i2);
            sb.append(",");
            sb.append(iMin3);
        }
        sb.append(" L ");
        sb.append(i2);
        sb.append(",");
        sb.append(i3 - iMin4);
        if (iMin4 > 0) {
            sb.append(" A ");
            sb.append(iMin4);
            sb.append(",");
            sb.append(iMin4);
            sb.append(" 0 0,1 ");
            sb.append(i2 - iMin4);
            sb.append(",");
            sb.append(i3);
        }
        sb.append(" L ");
        sb.append(iMin5);
        sb.append(",");
        sb.append(i3);
        if (iMin5 > 0) {
            sb.append(" A ");
            sb.append(iMin5);
            sb.append(",");
            sb.append(iMin5);
            sb.append(" 0 0,1 0,");
            sb.append(i3 - iMin5);
        }
        if (iMin2 > 0) {
            sb.append(" L 0,");
            sb.append(iMin2);
            sb.append(" A ");
            sb.append(iMin2);
            sb.append(",");
            sb.append(iMin2);
            sb.append(" 0 0,1 ");
            sb.append(iMin2);
            sb.append(",0");
        }
        sb.append(" Z");
        return sb.toString();
    }

    static DisplayShapeCompat toDisplayShapeCompat(DisplayShape displayShape) {
        if (displayShape == null) {
            return null;
        }
        return new DisplayShapeCompat(displayShape);
    }

    static DisplayShape toPlatformDisplayShape(DisplayShapeCompat displayShapeCompat) {
        if (displayShapeCompat == null) {
            return null;
        }
        return displayShapeCompat.mImpl.getPlatformDisplayShape();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DisplayShapeCompat) {
            return Objects.equals(this.mImpl, ((DisplayShapeCompat) obj).mImpl);
        }
        return false;
    }

    public Path getPath() {
        return this.mImpl.getPath();
    }

    public int hashCode() {
        return Objects.hashCode(this.mImpl);
    }

    public String toString() {
        return this.mImpl.toString();
    }

    public static DisplayShapeCompat create(String str, float f2, int i2, int i3) {
        return new DisplayShapeCompat(str, i2, i3, f2, 0, 0, 0, 1.0f);
    }

    private DisplayShapeCompat(DisplayShape displayShape) {
        this.mImpl = new Impl34(displayShape);
    }
}
