package androidx.window.embedding;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.core.util.Preconditions;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class SplitRule extends EmbeddingRule {
    public static final int SPLIT_MIN_DIMENSION_ALWAYS_ALLOW = 0;
    public static final int SPLIT_MIN_DIMENSION_DP_DEFAULT = 600;
    private final SplitAttributes defaultSplitAttributes;
    private final EmbeddingAspectRatio maxAspectRatioInLandscape;
    private final EmbeddingAspectRatio maxAspectRatioInPortrait;
    private final int minHeightDp;
    private final int minSmallestWidthDp;
    private final int minWidthDp;
    public static final Companion Companion = new Companion(null);
    public static final EmbeddingAspectRatio SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT = EmbeddingAspectRatio.Companion.ratio(1.4f);
    public static final EmbeddingAspectRatio SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT = EmbeddingAspectRatio.ALWAYS_ALLOW;

    /* compiled from: WazeSource */
    public final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final Rect getBounds(WindowMetrics windowMetrics) {
            x.f(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            x.e(bounds, "getBounds(...)");
            return bounds;
        }
    }

    /* compiled from: WazeSource */
    public final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public final float getDensity(WindowMetrics windowMetrics, Context context) {
            x.f(windowMetrics, "windowMetrics");
            x.f(context, "context");
            try {
                return windowMetrics.getDensity();
            } catch (NoSuchMethodError unused) {
                return context.getResources().getDisplayMetrics().density;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SplitRule(String str, int i2, int i3, int i4, EmbeddingAspectRatio embeddingAspectRatio, EmbeddingAspectRatio embeddingAspectRatio2, SplitAttributes splitAttributes, int i5, o oVar) {
        EmbeddingAspectRatio embeddingAspectRatio3 = (i5 & 16) != 0 ? SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT : embeddingAspectRatio;
        EmbeddingAspectRatio embeddingAspectRatio4 = (i5 & 32) != 0 ? SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT : embeddingAspectRatio2;
        int i6 = i5 & 4;
        int i7 = i5 & 2;
        int i8 = i5 & 1;
        int i9 = (i5 & 8) != 0 ? 600 : i4;
        i3 = i6 != 0 ? 600 : i3;
        this(1 == i8 ? null : str, i7 != 0 ? 600 : i2, i3, i9, embeddingAspectRatio3, embeddingAspectRatio4, splitAttributes);
    }

    private final int convertDpToPx(float f2, int i2) {
        return (int) ((i2 * f2) + 0.5f);
    }

    public final boolean checkParentBounds$window(float f2, Rect rect) {
        x.f(rect, "bounds");
        int iWidth = rect.width();
        int iHeight = rect.height();
        if (iWidth != 0 && iHeight != 0) {
            int i2 = this.minWidthDp;
            int iConvertDpToPx = convertDpToPx(f2, i2);
            int i3 = this.minHeightDp;
            int iConvertDpToPx2 = convertDpToPx(f2, i3);
            int i4 = this.minSmallestWidthDp;
            int iConvertDpToPx3 = convertDpToPx(f2, i4);
            boolean z = i2 == 0 || iWidth >= iConvertDpToPx;
            boolean z2 = i3 == 0 || iHeight >= iConvertDpToPx2;
            boolean z3 = i4 == 0 || Math.min(iWidth, iHeight) >= iConvertDpToPx3;
            boolean z4 = iHeight < iWidth ? x.n(this.maxAspectRatioInLandscape, EmbeddingAspectRatio.ALWAYS_ALLOW) || ((float) iWidth) / ((float) iHeight) <= this.maxAspectRatioInLandscape.getValue$window() : x.n(this.maxAspectRatioInPortrait, EmbeddingAspectRatio.ALWAYS_ALLOW) || ((float) iHeight) / ((float) iWidth) <= this.maxAspectRatioInPortrait.getValue$window();
            if (z && z2 && z3 && z4) {
                return true;
            }
        }
        return false;
    }

    public final boolean checkParentMetrics$window(Context context, WindowMetrics windowMetrics) {
        x.f(context, "context");
        x.f(windowMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        return checkParentBounds$window(Build.VERSION.SDK_INT <= 33 ? context.getResources().getDisplayMetrics().density : Api34Impl.INSTANCE.getDensity(windowMetrics, context), Api30Impl.INSTANCE.getBounds(windowMetrics));
    }

    @Override // androidx.window.embedding.EmbeddingRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitRule) || !super.equals(obj)) {
            return false;
        }
        SplitRule splitRule = (SplitRule) obj;
        return this.minWidthDp == splitRule.minWidthDp && this.minHeightDp == splitRule.minHeightDp && this.minSmallestWidthDp == splitRule.minSmallestWidthDp && x.n(this.maxAspectRatioInPortrait, splitRule.maxAspectRatioInPortrait) && x.n(this.maxAspectRatioInLandscape, splitRule.maxAspectRatioInLandscape) && x.n(this.defaultSplitAttributes, splitRule.defaultSplitAttributes);
    }

    public final SplitAttributes getDefaultSplitAttributes() {
        return this.defaultSplitAttributes;
    }

    public final EmbeddingAspectRatio getMaxAspectRatioInLandscape() {
        return this.maxAspectRatioInLandscape;
    }

    public final EmbeddingAspectRatio getMaxAspectRatioInPortrait() {
        return this.maxAspectRatioInPortrait;
    }

    public final int getMinHeightDp() {
        return this.minHeightDp;
    }

    public final int getMinSmallestWidthDp() {
        return this.minSmallestWidthDp;
    }

    public final int getMinWidthDp() {
        return this.minWidthDp;
    }

    @Override // androidx.window.embedding.EmbeddingRule
    public int hashCode() {
        return (((((((((((super.hashCode() * 31) + this.minWidthDp) * 31) + this.minHeightDp) * 31) + this.minSmallestWidthDp) * 31) + this.maxAspectRatioInPortrait.hashCode()) * 31) + this.maxAspectRatioInLandscape.hashCode()) * 31) + this.defaultSplitAttributes.hashCode();
    }

    public String toString() {
        return "SplitRule{ tag=" + getTag() + ", defaultSplitAttributes=" + this.defaultSplitAttributes + ", minWidthDp=" + this.minWidthDp + ", minHeightDp=" + this.minHeightDp + ", minSmallestWidthDp=" + this.minSmallestWidthDp + ", maxAspectRatioInPortrait=" + this.maxAspectRatioInPortrait + ", maxAspectRatioInLandscape=" + this.maxAspectRatioInLandscape + "}";
    }

    /* compiled from: WazeSource */
    public final class FinishBehavior {
        private final String description;
        private final int value;
        public static final Companion Companion = new Companion(null);
        public static final FinishBehavior NEVER = new FinishBehavior("NEVER", 0);
        public static final FinishBehavior ALWAYS = new FinishBehavior("ALWAYS", 1);
        public static final FinishBehavior ADJACENT = new FinishBehavior("ADJACENT", 2);

        private FinishBehavior(String str, int i2) {
            this.description = str;
            this.value = i2;
        }

        public final int getValue$window() {
            return this.value;
        }

        public int hashCode() {
            return (this.description.hashCode() * 31) + this.value;
        }

        public String toString() {
            return this.description;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final FinishBehavior getFinishBehaviorFromValue$window(int i2) {
                if (i2 == FinishBehavior.NEVER.getValue$window()) {
                    return FinishBehavior.NEVER;
                }
                if (i2 == FinishBehavior.ALWAYS.getValue$window()) {
                    return FinishBehavior.ALWAYS;
                }
                if (i2 == FinishBehavior.ADJACENT.getValue$window()) {
                    return FinishBehavior.ADJACENT;
                }
                throw new IllegalArgumentException("Unknown finish behavior:" + i2);
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

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitRule(String str, int i2, int i3, int i4, EmbeddingAspectRatio embeddingAspectRatio, EmbeddingAspectRatio embeddingAspectRatio2, SplitAttributes splitAttributes) {
        super(str);
        x.f(embeddingAspectRatio, "maxAspectRatioInPortrait");
        x.f(embeddingAspectRatio2, "maxAspectRatioInLandscape");
        x.f(splitAttributes, "defaultSplitAttributes");
        this.minWidthDp = i2;
        this.minHeightDp = i3;
        this.minSmallestWidthDp = i4;
        this.maxAspectRatioInPortrait = embeddingAspectRatio;
        this.maxAspectRatioInLandscape = embeddingAspectRatio2;
        this.defaultSplitAttributes = splitAttributes;
        Preconditions.checkArgumentNonnegative(i2, "minWidthDp must be non-negative");
        Preconditions.checkArgumentNonnegative(i3, "minHeightDp must be non-negative");
        Preconditions.checkArgumentNonnegative(i4, "minSmallestWidthDp must be non-negative");
    }
}
