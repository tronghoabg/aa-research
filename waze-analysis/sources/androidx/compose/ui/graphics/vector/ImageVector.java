package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ImageVector {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int imageVectorCount;
    private static final Object lock;
    private final boolean autoMirror;
    private final float defaultHeight;
    private final float defaultWidth;
    private final int genId;
    private final String name;
    private final VectorGroup root;
    private final int tintBlendMode;
    private final long tintColor;
    private final float viewportHeight;
    private final float viewportWidth;

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        lock = companion;
    }

    public /* synthetic */ ImageVector(String str, float f2, float f3, float f4, float f5, VectorGroup vectorGroup, long j2, int i2, boolean z, int i3, int i4, o oVar) {
        this(str, f2, f3, f4, f5, vectorGroup, j2, i2, z, (i4 & 512) != 0 ? Companion.generateImageVectorId$ui() : i3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        return x.n(this.name, imageVector.name) && Dp.m11169equalsimpl0(this.defaultWidth, imageVector.defaultWidth) && Dp.m11169equalsimpl0(this.defaultHeight, imageVector.defaultHeight) && this.viewportWidth == imageVector.viewportWidth && this.viewportHeight == imageVector.viewportHeight && x.n(this.root, imageVector.root) && Color.m8229equalsimpl0(this.tintColor, imageVector.tintColor) && BlendMode.m8137equalsimpl0(this.tintBlendMode, imageVector.tintBlendMode) && this.autoMirror == imageVector.autoMirror;
    }

    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    /* renamed from: getDefaultHeight-D9Ej5fM, reason: not valid java name */
    public final float m8992getDefaultHeightD9Ej5fM() {
        return this.defaultHeight;
    }

    /* renamed from: getDefaultWidth-D9Ej5fM, reason: not valid java name */
    public final float m8993getDefaultWidthD9Ej5fM() {
        return this.defaultWidth;
    }

    public final int getGenId$ui() {
        return this.genId;
    }

    public final String getName() {
        return this.name;
    }

    public final VectorGroup getRoot() {
        return this.root;
    }

    /* renamed from: getTintBlendMode-0nO6VwU, reason: not valid java name */
    public final int m8994getTintBlendMode0nO6VwU() {
        return this.tintBlendMode;
    }

    /* renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m8995getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + Dp.m11170hashCodeimpl(this.defaultWidth)) * 31) + Dp.m11170hashCodeimpl(this.defaultHeight)) * 31) + Float.floatToIntBits(this.viewportWidth)) * 31) + Float.floatToIntBits(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + Color.m8235hashCodeimpl(this.tintColor)) * 31) + this.tintBlendMode) * 31) + ImageVector$$ExternalSyntheticBackport0.m(this.autoMirror);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final int generateImageVectorId$ui() {
            int i2;
            synchronized (ImageVector.lock) {
                i2 = ImageVector.imageVectorCount;
                ImageVector.imageVectorCount = i2 + 1;
            }
            return i2;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ ImageVector(String str, float f2, float f3, float f4, float f5, VectorGroup vectorGroup, long j2, int i2, boolean z, int i3, o oVar) {
        this(str, f2, f3, f4, f5, vectorGroup, j2, i2, z, i3);
    }

    private ImageVector(String str, float f2, float f3, float f4, float f5, VectorGroup vectorGroup, long j2, int i2, boolean z, int i3) {
        this.name = str;
        this.defaultWidth = f2;
        this.defaultHeight = f3;
        this.viewportWidth = f4;
        this.viewportHeight = f5;
        this.root = vectorGroup;
        this.tintColor = j2;
        this.tintBlendMode = i2;
        this.autoMirror = z;
        this.genId = i3;
    }

    /* compiled from: WazeSource */
    public final class Builder {
        public static final int $stable = 8;
        private final boolean autoMirror;
        private final float defaultHeight;
        private final float defaultWidth;
        private boolean isConsumed;
        private final String name;
        private final ArrayList<GroupParams> nodes;
        private GroupParams root;
        private final int tintBlendMode;
        private final long tintColor;
        private final float viewportHeight;
        private final float viewportWidth;

        private Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2, boolean z) {
            this.name = str;
            this.defaultWidth = f2;
            this.defaultHeight = f3;
            this.viewportWidth = f4;
            this.viewportHeight = f5;
            this.tintColor = j2;
            this.tintBlendMode = i2;
            this.autoMirror = z;
            ArrayList<GroupParams> arrayList = new ArrayList<>();
            this.nodes = arrayList;
            GroupParams groupParams = new GroupParams(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.root = groupParams;
            ImageVectorKt.push(arrayList, groupParams);
        }

        public static /* synthetic */ Builder addGroup$default(Builder builder, String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, int i2, Object obj) {
            List emptyPath = (i2 & 256) != 0 ? VectorKt.getEmptyPath() : list;
            int i3 = i2 & 64;
            int i4 = i2 & 32;
            int i5 = i2 & 16;
            int i6 = i2 & 8;
            int i7 = i2 & 4;
            int i8 = i2 & 2;
            int i9 = i2 & 1;
            float f9 = (i2 & 128) != 0 ? 0.0f : f8;
            float f10 = i3 != 0 ? 0.0f : f7;
            float f11 = i4 != 0 ? 1.0f : f6;
            float f12 = i5 == 0 ? f5 : 1.0f;
            float f13 = i6 != 0 ? 0.0f : f4;
            if (i7 != 0) {
                f3 = 0.0f;
            }
            if (i8 != 0) {
                f2 = 0.0f;
            }
            if (1 == i9) {
                str = "";
            }
            float f14 = f2;
            String str2 = str;
            builder.addGroup(str2, f14, f3, f13, f12, f11, f10, f9, emptyPath);
            return builder;
        }

        /* renamed from: addPath-oIyEayM$default, reason: not valid java name */
        public static /* synthetic */ Builder m8996addPathoIyEayM$default(Builder builder, List list, int i2, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, int i5, Object obj) {
            builder.m8997addPathoIyEayM(list, (i5 & 2) != 0 ? VectorKt.getDefaultFillType() : i2, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? null : brush, (i5 & 16) != 0 ? 1.0f : f2, (i5 & 32) == 0 ? brush2 : null, (i5 & 64) != 0 ? 1.0f : f3, (i5 & 128) != 0 ? 0.0f : f4, (i5 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i3, (i5 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i4, (i5 & 1024) != 0 ? 4.0f : f5, (i5 & 2048) != 0 ? 0.0f : f6, (i5 & 4096) == 0 ? f7 : 1.0f, (i5 & 8192) != 0 ? 0.0f : f8);
            return builder;
        }

        private final VectorGroup asVectorGroup(GroupParams groupParams) {
            return new VectorGroup(groupParams.getName(), groupParams.getRotate(), groupParams.getPivotX(), groupParams.getPivotY(), groupParams.getScaleX(), groupParams.getScaleY(), groupParams.getTranslationX(), groupParams.getTranslationY(), groupParams.getClipPathData(), groupParams.getChildren());
        }

        private final void ensureNotConsumed() {
            if (this.isConsumed) {
                InlineClassHelperKt.throwIllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final GroupParams getCurrentGroup() {
            return (GroupParams) ImageVectorKt.peek(this.nodes);
        }

        public final Builder addGroup(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List<? extends PathNode> list) {
            ensureNotConsumed();
            ImageVectorKt.push(this.nodes, new GroupParams(str, f2, f3, f4, f5, f6, f7, f8, list, null, 512, null));
            return this;
        }

        /* renamed from: addPath-oIyEayM, reason: not valid java name */
        public final Builder m8997addPathoIyEayM(List<? extends PathNode> list, int i2, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8) {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(new VectorPath(str, list, i2, brush, f2, brush2, f3, f4, i3, i4, f5, f6, f7, f8, null));
            return this;
        }

        public final ImageVector build() {
            ensureNotConsumed();
            while (this.nodes.size() > 1) {
                clearGroup();
            }
            ImageVector imageVector = new ImageVector(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, asVectorGroup(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, 0, 512, null);
            this.isConsumed = true;
            return imageVector;
        }

        public final Builder clearGroup() {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(asVectorGroup((GroupParams) ImageVectorKt.pop(this.nodes)));
            return this;
        }

        public /* synthetic */ Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2, boolean z, o oVar) {
            this(str, f2, f3, f4, f5, j2, i2, z);
        }

        private Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2) {
            this(str, f2, f3, f4, f5, j2, i2, false, (o) null);
        }

        public /* synthetic */ Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2, o oVar) {
            this(str, f2, f3, f4, f5, j2, i2);
        }

        public /* synthetic */ Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2, int i3, o oVar) {
            this(1 == (i3 & 1) ? "" : str, f2, f3, f4, f5, (i3 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2, (i3 & 64) != 0 ? BlendMode.Companion.m8166getSrcIn0nO6VwU() : i2, (o) null);
        }

        public /* synthetic */ Builder(String str, float f2, float f3, float f4, float f5, long j2, int i2, boolean z, int i3, o oVar) {
            this(1 == (i3 & 1) ? "" : str, f2, f3, f4, f5, (i3 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2, (i3 & 64) != 0 ? BlendMode.Companion.m8166getSrcIn0nO6VwU() : i2, ((i3 & 128) == 0) & z, (o) null);
        }

        /* compiled from: WazeSource */
        final class GroupParams {
            private List<VectorNode> children;
            private List<? extends PathNode> clipPathData;
            private String name;
            private float pivotX;
            private float pivotY;
            private float rotate;
            private float scaleX;
            private float scaleY;
            private float translationX;
            private float translationY;

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ GroupParams(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, List list2, int i2, o oVar) {
                List emptyPath = (i2 & 256) != 0 ? VectorKt.getEmptyPath() : list;
                ArrayList arrayList = (i2 & 512) != 0 ? new ArrayList() : list2;
                int i3 = i2 & 64;
                int i4 = i2 & 32;
                int i5 = i2 & 16;
                int i6 = i2 & 8;
                int i7 = i2 & 4;
                int i8 = i2 & 2;
                int i9 = i2 & 1;
                float f9 = (i2 & 128) != 0 ? 0.0f : f8;
                float f10 = i3 != 0 ? 0.0f : f7;
                float f11 = i4 != 0 ? 1.0f : f6;
                float f12 = i5 == 0 ? f5 : 1.0f;
                float f13 = i6 != 0 ? 0.0f : f4;
                float f14 = i7 != 0 ? 0.0f : f3;
                f2 = i8 != 0 ? 0.0f : f2;
                float f15 = f14;
                String str2 = 1 == i9 ? "" : str;
                this(str2, f2, f15, f13, f12, f11, f10, f9, emptyPath, arrayList);
            }

            public final List<VectorNode> getChildren() {
                return this.children;
            }

            public final List<PathNode> getClipPathData() {
                return this.clipPathData;
            }

            public final String getName() {
                return this.name;
            }

            public final float getPivotX() {
                return this.pivotX;
            }

            public final float getPivotY() {
                return this.pivotY;
            }

            public final float getRotate() {
                return this.rotate;
            }

            public final float getScaleX() {
                return this.scaleX;
            }

            public final float getScaleY() {
                return this.scaleY;
            }

            public final float getTranslationX() {
                return this.translationX;
            }

            public final float getTranslationY() {
                return this.translationY;
            }

            public final void setChildren(List<VectorNode> list) {
                this.children = list;
            }

            public final void setClipPathData(List<? extends PathNode> list) {
                this.clipPathData = list;
            }

            public final void setName(String str) {
                this.name = str;
            }

            public final void setPivotX(float f2) {
                this.pivotX = f2;
            }

            public final void setPivotY(float f2) {
                this.pivotY = f2;
            }

            public final void setRotate(float f2) {
                this.rotate = f2;
            }

            public final void setScaleX(float f2) {
                this.scaleX = f2;
            }

            public final void setScaleY(float f2) {
                this.scaleY = f2;
            }

            public final void setTranslationX(float f2) {
                this.translationX = f2;
            }

            public final void setTranslationY(float f2) {
                this.translationY = f2;
            }

            public GroupParams(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List<? extends PathNode> list, List<VectorNode> list2) {
                this.name = str;
                this.rotate = f2;
                this.pivotX = f3;
                this.pivotY = f4;
                this.scaleX = f5;
                this.scaleY = f6;
                this.translationX = f7;
                this.translationY = f8;
                this.clipPathData = list;
                this.children = list2;
            }

            public GroupParams() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }
        }
    }
}
