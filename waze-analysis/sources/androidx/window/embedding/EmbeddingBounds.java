package androidx.window.embedding;

import android.graphics.Rect;
import androidx.camera.video.AudioStats;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.window.core.Bounds;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowLayoutInfo;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EmbeddingBounds {
    public static final EmbeddingBounds BOUNDS_EXPANDED;
    public static final EmbeddingBounds BOUNDS_HINGE_BOTTOM;
    public static final EmbeddingBounds BOUNDS_HINGE_LEFT;
    public static final EmbeddingBounds BOUNDS_HINGE_RIGHT;
    public static final EmbeddingBounds BOUNDS_HINGE_TOP;
    public static final Companion Companion = new Companion(null);
    private final Alignment alignment;
    private final Dimension height;
    private final Dimension width;

    static {
        Alignment alignment = Alignment.ALIGN_TOP;
        Dimension dimension = Dimension.DIMENSION_EXPANDED;
        BOUNDS_EXPANDED = new EmbeddingBounds(alignment, dimension, dimension);
        BOUNDS_HINGE_TOP = new EmbeddingBounds(Alignment.ALIGN_TOP, Dimension.DIMENSION_EXPANDED, Dimension.DIMENSION_HINGE);
        BOUNDS_HINGE_LEFT = new EmbeddingBounds(Alignment.ALIGN_LEFT, Dimension.DIMENSION_HINGE, Dimension.DIMENSION_EXPANDED);
        BOUNDS_HINGE_BOTTOM = new EmbeddingBounds(Alignment.ALIGN_BOTTOM, Dimension.DIMENSION_EXPANDED, Dimension.DIMENSION_HINGE);
        BOUNDS_HINGE_RIGHT = new EmbeddingBounds(Alignment.ALIGN_RIGHT, Dimension.DIMENSION_HINGE, Dimension.DIMENSION_EXPANDED);
    }

    public EmbeddingBounds(Alignment alignment, Dimension dimension, Dimension dimension2) {
        x.f(alignment, "alignment");
        x.f(dimension, "width");
        x.f(dimension2, "height");
        this.alignment = alignment;
        this.width = dimension;
        this.height = dimension2;
    }

    private final FoldingFeature getOnlyFoldingFeatureOrNull(WindowLayoutInfo windowLayoutInfo) {
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (Object obj : displayFeatures) {
            if (obj instanceof FoldingFeature) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() == 1) {
            return (FoldingFeature) arrayList2.get(0);
        }
        return null;
    }

    private final boolean isHorizontal(WindowLayoutInfo windowLayoutInfo) {
        FoldingFeature onlyFoldingFeatureOrNull = getOnlyFoldingFeatureOrNull(windowLayoutInfo);
        if (onlyFoldingFeatureOrNull == null) {
            return false;
        }
        return x.n(onlyFoldingFeatureOrNull.getOrientation(), FoldingFeature.Orientation.HORIZONTAL);
    }

    private final boolean isVertical(WindowLayoutInfo windowLayoutInfo) {
        FoldingFeature onlyFoldingFeatureOrNull = getOnlyFoldingFeatureOrNull(windowLayoutInfo);
        if (onlyFoldingFeatureOrNull == null) {
            return false;
        }
        return x.n(onlyFoldingFeatureOrNull.getOrientation(), FoldingFeature.Orientation.VERTICAL);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddingBounds)) {
            return false;
        }
        EmbeddingBounds embeddingBounds = (EmbeddingBounds) obj;
        return x.n(this.alignment, embeddingBounds.alignment) && x.n(this.width, embeddingBounds.width) && x.n(this.height, embeddingBounds.height);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final Dimension getHeight() {
        return this.height;
    }

    public final int getHeightInPixel$window(Bounds bounds, WindowLayoutInfo windowLayoutInfo) {
        x.f(bounds, "parentContainerBounds");
        x.f(windowLayoutInfo, "windowLayoutInfo");
        int height = bounds.getHeight();
        Dimension dimensionRatio = shouldUseFallbackDimensionForHeight$window(windowLayoutInfo) ? Dimension.Companion.ratio(0.5f) : this.height;
        if (dimensionRatio instanceof Dimension.Ratio) {
            return ((Dimension.Ratio) dimensionRatio).times$window(height);
        }
        if (dimensionRatio instanceof Dimension.Pixel) {
            return Math.min(height, ((Dimension.Pixel) dimensionRatio).getValue$window());
        }
        if (!x.n(dimensionRatio, Dimension.DIMENSION_HINGE)) {
            Dimension dimension = this.width;
            Objects.toString(dimension);
            throw new IllegalArgumentException("Unhandled width dimension=".concat(String.valueOf(dimension)));
        }
        FoldingFeature onlyFoldingFeatureOrNull = getOnlyFoldingFeatureOrNull(windowLayoutInfo);
        x.c(onlyFoldingFeatureOrNull);
        Rect bounds2 = onlyFoldingFeatureOrNull.getBounds();
        Alignment alignment = this.alignment;
        if (x.n(alignment, Alignment.ALIGN_TOP)) {
            return bounds2.top - bounds.getTop();
        }
        if (x.n(alignment, Alignment.ALIGN_BOTTOM)) {
            return bounds.getBottom() - bounds2.bottom;
        }
        throw new IllegalStateException("Unhandled condition to get height in pixel! embeddingBounds=" + this + " taskBounds=" + bounds + " windowLayoutInfo=" + windowLayoutInfo);
    }

    public final Dimension getWidth() {
        return this.width;
    }

    public final int getWidthInPixel$window(Bounds bounds, WindowLayoutInfo windowLayoutInfo) {
        x.f(bounds, "parentContainerBounds");
        x.f(windowLayoutInfo, "windowLayoutInfo");
        int width = bounds.getWidth();
        Dimension dimensionRatio = shouldUseFallbackDimensionForWidth$window(windowLayoutInfo) ? Dimension.Companion.ratio(0.5f) : this.width;
        if (dimensionRatio instanceof Dimension.Ratio) {
            return ((Dimension.Ratio) dimensionRatio).times$window(width);
        }
        if (dimensionRatio instanceof Dimension.Pixel) {
            return Math.min(width, ((Dimension.Pixel) dimensionRatio).getValue$window());
        }
        if (!x.n(dimensionRatio, Dimension.DIMENSION_HINGE)) {
            Dimension dimension = this.width;
            Objects.toString(dimension);
            throw new IllegalArgumentException("Unhandled width dimension=".concat(String.valueOf(dimension)));
        }
        FoldingFeature onlyFoldingFeatureOrNull = getOnlyFoldingFeatureOrNull(windowLayoutInfo);
        x.c(onlyFoldingFeatureOrNull);
        Rect bounds2 = onlyFoldingFeatureOrNull.getBounds();
        Alignment alignment = this.alignment;
        if (x.n(alignment, Alignment.ALIGN_LEFT)) {
            return bounds2.left - bounds.getLeft();
        }
        if (x.n(alignment, Alignment.ALIGN_RIGHT)) {
            return bounds.getRight() - bounds2.right;
        }
        throw new IllegalStateException("Unhandled condition to get height in pixel! embeddingBounds=" + this + " taskBounds=" + bounds + " windowLayoutInfo=" + windowLayoutInfo);
    }

    public int hashCode() {
        return (((this.alignment.hashCode() * 31) + this.width.hashCode()) * 31) + this.height.hashCode();
    }

    public final boolean shouldUseFallbackDimensionForHeight$window(WindowLayoutInfo windowLayoutInfo) {
        x.f(windowLayoutInfo, "windowLayoutInfo");
        if (x.n(this.height, Dimension.DIMENSION_HINGE)) {
            return !isHorizontal(windowLayoutInfo) || i.i(Alignment.ALIGN_LEFT, Alignment.ALIGN_RIGHT).contains(this.alignment);
        }
        return false;
    }

    public final boolean shouldUseFallbackDimensionForWidth$window(WindowLayoutInfo windowLayoutInfo) {
        x.f(windowLayoutInfo, "windowLayoutInfo");
        if (x.n(this.width, Dimension.DIMENSION_HINGE)) {
            return !isVertical(windowLayoutInfo) || i.i(Alignment.ALIGN_TOP, Alignment.ALIGN_BOTTOM).contains(this.alignment);
        }
        return false;
    }

    public String toString() {
        return "Bounds:{alignment=" + this.alignment + ", width=" + this.width + ", height=" + this.height + "}";
    }

    /* compiled from: WazeSource */
    public final class Alignment {
        private final int value;
        public static final Companion Companion = new Companion(null);
        public static final Alignment ALIGN_LEFT = new Alignment(0);
        public static final Alignment ALIGN_TOP = new Alignment(1);
        public static final Alignment ALIGN_RIGHT = new Alignment(2);
        public static final Alignment ALIGN_BOTTOM = new Alignment(3);

        public Alignment(int i2) {
            this.value = i2;
            if (i2 < 0 || i2 >= 4) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Alignment) && this.value == ((Alignment) obj).value;
        }

        public final int getValue$window() {
            return this.value;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            int i2 = this.value;
            if (i2 == 0) {
                return TtmlNode.LEFT;
            }
            if (i2 == 1) {
                return "top";
            }
            if (i2 == 2) {
                return TtmlNode.RIGHT;
            }
            if (i2 == 3) {
                return "bottom";
            }
            return "unknown position:" + i2;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    /* compiled from: WazeSource */
    public abstract class Dimension {
        public static final Companion Companion = new Companion(null);
        public static final Dimension DIMENSION_EXPANDED = new Ratio(1.0f);
        public static final Dimension DIMENSION_HINGE = new Dimension() { // from class: androidx.window.embedding.EmbeddingBounds$Dimension$Companion$DIMENSION_HINGE$1
        };
        private final String description;

        /* compiled from: WazeSource */
        public final class Pixel extends Dimension {
            private final int value;

            public Pixel(int i2) {
                super("dimension in pixel:" + i2);
                this.value = i2;
                if (i2 <= 0) {
                    throw new IllegalArgumentException("Pixel value must be a positive integer.");
                }
            }

            public final int compareTo$window(int i2) {
                return this.value - i2;
            }

            public final int getValue$window() {
                return this.value;
            }
        }

        /* compiled from: WazeSource */
        public final class Ratio extends Dimension {
            private final float value;

            public Ratio(float f2) {
                super("dimension in ratio:" + f2);
                this.value = f2;
                double d2 = (double) f2;
                if (d2 <= AudioStats.AUDIO_AMPLITUDE_NONE || d2 > 1.0d) {
                    throw new IllegalArgumentException("Ratio must be in range (0.0, 1.0]");
                }
            }

            public final float getValue$window() {
                return this.value;
            }

            public final int times$window(int i2) {
                return (int) (this.value * i2);
            }
        }

        public Dimension(String str) {
            x.f(str, "description");
            this.description = str;
        }

        public static final Dimension pixel(int i2) {
            return Companion.pixel(i2);
        }

        public static final Dimension ratio(float f2) {
            return Companion.ratio(f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Dimension) {
                return x.n(this.description, ((Dimension) obj).description);
            }
            return false;
        }

        public final String getDescription$window() {
            return this.description;
        }

        public int hashCode() {
            return this.description.hashCode();
        }

        public String toString() {
            return this.description;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final Dimension pixel(int i2) {
                return new Pixel(i2);
            }

            public final Dimension ratio(float f2) {
                return new Ratio(f2);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final Bounds offset(Bounds bounds, int i2, int i3) {
            return new Bounds(bounds.getLeft() + i2, bounds.getTop() + i3, bounds.getRight() + i2, bounds.getBottom() + i3);
        }

        public final Bounds translateEmbeddingBounds$window(EmbeddingBounds embeddingBounds, Bounds bounds, WindowLayoutInfo windowLayoutInfo) {
            x.f(embeddingBounds, "embeddingBounds");
            x.f(bounds, "parentContainerBounds");
            x.f(windowLayoutInfo, "windowLayoutInfo");
            if (x.n(embeddingBounds.getWidth(), Dimension.DIMENSION_EXPANDED) && x.n(embeddingBounds.getHeight(), Dimension.DIMENSION_EXPANDED)) {
                return Bounds.Companion.getEMPTY_BOUNDS();
            }
            EmbeddingBounds embeddingBounds2 = new EmbeddingBounds(embeddingBounds.getAlignment(), embeddingBounds.shouldUseFallbackDimensionForWidth$window(windowLayoutInfo) ? Dimension.Companion.ratio(0.5f) : embeddingBounds.getWidth(), embeddingBounds.shouldUseFallbackDimensionForHeight$window(windowLayoutInfo) ? Dimension.Companion.ratio(0.5f) : embeddingBounds.getHeight());
            int widthInPixel$window = embeddingBounds2.getWidthInPixel$window(bounds, windowLayoutInfo);
            int heightInPixel$window = embeddingBounds2.getHeightInPixel$window(bounds, windowLayoutInfo);
            int width = bounds.getWidth();
            int height = bounds.getHeight();
            if (widthInPixel$window == width && heightInPixel$window == height) {
                return Bounds.Companion.getEMPTY_BOUNDS();
            }
            Bounds bounds2 = new Bounds(0, 0, widthInPixel$window, heightInPixel$window);
            Alignment alignment = embeddingBounds.getAlignment();
            if (x.n(alignment, Alignment.ALIGN_TOP)) {
                return EmbeddingBounds.Companion.offset(bounds2, (width - widthInPixel$window) / 2, 0);
            }
            if (x.n(alignment, Alignment.ALIGN_LEFT)) {
                return EmbeddingBounds.Companion.offset(bounds2, 0, (height - heightInPixel$window) / 2);
            }
            if (x.n(alignment, Alignment.ALIGN_BOTTOM)) {
                return EmbeddingBounds.Companion.offset(bounds2, (width - widthInPixel$window) / 2, height - heightInPixel$window);
            }
            if (x.n(alignment, Alignment.ALIGN_RIGHT)) {
                return EmbeddingBounds.Companion.offset(bounds2, width - widthInPixel$window, (height - heightInPixel$window) / 2);
            }
            Alignment alignment2 = embeddingBounds.getAlignment();
            Objects.toString(alignment2);
            throw new IllegalArgumentException("Unknown alignment: ".concat(String.valueOf(alignment2)));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final Bounds translateEmbeddingBounds$window(EmbeddingBounds embeddingBounds, ParentContainerInfo parentContainerInfo) {
            x.f(embeddingBounds, "embeddingBounds");
            x.f(parentContainerInfo, "parentContainerInfo");
            return translateEmbeddingBounds$window(embeddingBounds, parentContainerInfo.getWindowBounds(), parentContainerInfo.getWindowLayoutInfo());
        }
    }
}
