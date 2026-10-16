package androidx.window.embedding;

import androidx.window.embedding.SplitAttributes;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SplitPinRule extends SplitRule {
    private final boolean isSticky;

    /* compiled from: WazeSource */
    public final class Builder {
        private boolean isSticky;
        private String tag;
        private int minWidthDp = 600;
        private int minHeightDp = 600;
        private int minSmallestWidthDp = 600;
        private EmbeddingAspectRatio maxAspectRatioInPortrait = SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT;
        private EmbeddingAspectRatio maxAspectRatioInLandscape = SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT;
        private SplitAttributes defaultSplitAttributes = new SplitAttributes.Builder().build();

        public final SplitPinRule build() {
            return new SplitPinRule(this.tag, this.defaultSplitAttributes, this.isSticky, this.minWidthDp, this.minHeightDp, this.minSmallestWidthDp, this.maxAspectRatioInPortrait, this.maxAspectRatioInLandscape);
        }

        public final Builder setDefaultSplitAttributes(SplitAttributes splitAttributes) {
            x.f(splitAttributes, "defaultSplitAttributes");
            this.defaultSplitAttributes = splitAttributes;
            return this;
        }

        public final Builder setMaxAspectRatioInLandscape(EmbeddingAspectRatio embeddingAspectRatio) {
            x.f(embeddingAspectRatio, "aspectRatio");
            this.maxAspectRatioInLandscape = embeddingAspectRatio;
            return this;
        }

        public final Builder setMaxAspectRatioInPortrait(EmbeddingAspectRatio embeddingAspectRatio) {
            x.f(embeddingAspectRatio, "aspectRatio");
            this.maxAspectRatioInPortrait = embeddingAspectRatio;
            return this;
        }

        public final Builder setMinHeightDp(int i2) {
            this.minHeightDp = i2;
            return this;
        }

        public final Builder setMinSmallestWidthDp(int i2) {
            this.minSmallestWidthDp = i2;
            return this;
        }

        public final Builder setMinWidthDp(int i2) {
            this.minWidthDp = i2;
            return this;
        }

        public final Builder setSticky(boolean z) {
            this.isSticky = z;
            return this;
        }

        public final Builder setTag(String str) {
            this.tag = str;
            return this;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SplitPinRule(String str, SplitAttributes splitAttributes, boolean z, int i2, int i3, int i4, EmbeddingAspectRatio embeddingAspectRatio, EmbeddingAspectRatio embeddingAspectRatio2, int i5, o oVar) {
        EmbeddingAspectRatio embeddingAspectRatio3 = (i5 & 64) != 0 ? SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT : embeddingAspectRatio;
        EmbeddingAspectRatio embeddingAspectRatio4 = (i5 & 128) != 0 ? SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT : embeddingAspectRatio2;
        int i6 = i5 & 16;
        int i7 = i5 & 8;
        int i8 = i5 & 1;
        int i9 = (i5 & 32) != 0 ? 600 : i4;
        int i10 = i6 != 0 ? 600 : i3;
        this(1 == i8 ? null : str, splitAttributes, z, i7 != 0 ? 600 : i2, i10, i9, embeddingAspectRatio3, embeddingAspectRatio4);
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SplitPinRule) && super.equals(obj) && this.isSticky == ((SplitPinRule) obj).isSticky;
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public int hashCode() {
        return (super.hashCode() * 31) + SplitPinRule$$ExternalSyntheticBackport0.m(this.isSticky);
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    @Override // androidx.window.embedding.SplitRule
    public String toString() {
        return "SplitPinRule{tag=" + getTag() + ", defaultSplitAttributes=" + getDefaultSplitAttributes() + ", isSticky=" + this.isSticky + "}";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPinRule(String str, SplitAttributes splitAttributes, boolean z, int i2, int i3, int i4, EmbeddingAspectRatio embeddingAspectRatio, EmbeddingAspectRatio embeddingAspectRatio2) {
        super(str, i2, i3, i4, embeddingAspectRatio, embeddingAspectRatio2, splitAttributes);
        x.f(splitAttributes, "defaultSplitAttributes");
        x.f(embeddingAspectRatio, "maxAspectRatioInPortrait");
        x.f(embeddingAspectRatio2, "maxAspectRatioInLandscape");
        this.isSticky = z;
    }
}
