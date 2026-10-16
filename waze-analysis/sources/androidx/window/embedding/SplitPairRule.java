package androidx.window.embedding;

import androidx.window.embedding.SplitAttributes;
import androidx.window.embedding.SplitRule;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SplitPairRule extends SplitRule {
    private final boolean clearTop;
    private final Set<SplitPairFilter> filters;
    private final SplitRule.FinishBehavior finishPrimaryWithSecondary;
    private final SplitRule.FinishBehavior finishSecondaryWithPrimary;

    public /* synthetic */ SplitPairRule(Set set, SplitAttributes splitAttributes, String str, SplitRule.FinishBehavior finishBehavior, SplitRule.FinishBehavior finishBehavior2, boolean z, int i2, int i3, int i4, EmbeddingAspectRatio embeddingAspectRatio, EmbeddingAspectRatio embeddingAspectRatio2, int i5, o oVar) {
        this(set, splitAttributes, (i5 & 4) != 0 ? null : str, (i5 & 8) != 0 ? SplitRule.FinishBehavior.NEVER : finishBehavior, (i5 & 16) != 0 ? SplitRule.FinishBehavior.ALWAYS : finishBehavior2, ((i5 & 32) == 0) & z, (i5 & 64) != 0 ? 600 : i2, (i5 & 128) != 0 ? 600 : i3, (i5 & 256) != 0 ? 600 : i4, (i5 & 512) != 0 ? SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT : embeddingAspectRatio, (i5 & 1024) != 0 ? SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT : embeddingAspectRatio2);
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairRule) || !super.equals(obj)) {
            return false;
        }
        SplitPairRule splitPairRule = (SplitPairRule) obj;
        return x.n(this.filters, splitPairRule.filters) && x.n(this.finishPrimaryWithSecondary, splitPairRule.finishPrimaryWithSecondary) && x.n(this.finishSecondaryWithPrimary, splitPairRule.finishSecondaryWithPrimary) && this.clearTop == splitPairRule.clearTop;
    }

    public final boolean getClearTop() {
        return this.clearTop;
    }

    public final Set<SplitPairFilter> getFilters() {
        return this.filters;
    }

    public final SplitRule.FinishBehavior getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final SplitRule.FinishBehavior getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.finishPrimaryWithSecondary.hashCode()) * 31) + this.finishSecondaryWithPrimary.hashCode()) * 31) + SplitPairRule$$ExternalSyntheticBackport0.m(this.clearTop);
    }

    public final SplitPairRule plus$window(SplitPairFilter splitPairFilter) {
        x.f(splitPairFilter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(splitPairFilter);
        return new Builder((Set<SplitPairFilter>) i.au(linkedHashSet)).setTag(getTag()).setMinWidthDp(getMinWidthDp()).setMinHeightDp(getMinHeightDp()).setMinSmallestWidthDp(getMinSmallestWidthDp()).setMaxAspectRatioInPortrait(getMaxAspectRatioInPortrait()).setMaxAspectRatioInLandscape(getMaxAspectRatioInLandscape()).setFinishPrimaryWithSecondary(this.finishPrimaryWithSecondary).setFinishSecondaryWithPrimary(this.finishSecondaryWithPrimary).setClearTop(this.clearTop).setDefaultSplitAttributes(getDefaultSplitAttributes()).build();
    }

    @Override // androidx.window.embedding.SplitRule
    public String toString() {
        return "SplitPairRule{tag=" + getTag() + ", defaultSplitAttributes=" + getDefaultSplitAttributes() + ", minWidthDp=" + getMinWidthDp() + ", minHeightDp=" + getMinHeightDp() + ", minSmallestWidthDp=" + getMinSmallestWidthDp() + ", maxAspectRatioInPortrait=" + getMaxAspectRatioInPortrait() + ", maxAspectRatioInLandscape=" + getMaxAspectRatioInLandscape() + ", clearTop=" + this.clearTop + ", finishPrimaryWithSecondary=" + this.finishPrimaryWithSecondary + ", finishSecondaryWithPrimary=" + this.finishSecondaryWithPrimary + ", filters=" + this.filters + "}";
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private boolean clearTop;
        private SplitAttributes defaultSplitAttributes;
        private final Set<SplitPairFilter> filters;
        private SplitRule.FinishBehavior finishPrimaryWithSecondary;
        private SplitRule.FinishBehavior finishSecondaryWithPrimary;
        private EmbeddingAspectRatio maxAspectRatioInLandscape;
        private EmbeddingAspectRatio maxAspectRatioInPortrait;
        private int minHeightDp;
        private int minSmallestWidthDp;
        private int minWidthDp;
        private String tag;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(SplitPairRule splitPairRule) {
            this(splitPairRule.getFilters());
            x.f(splitPairRule, "original");
            setTag(splitPairRule.getTag()).setMinWidthDp(splitPairRule.getMinWidthDp()).setMinHeightDp(splitPairRule.getMinHeightDp()).setMinSmallestWidthDp(splitPairRule.getMinSmallestWidthDp()).setMaxAspectRatioInPortrait(splitPairRule.getMaxAspectRatioInPortrait()).setMaxAspectRatioInLandscape(splitPairRule.getMaxAspectRatioInLandscape()).setFinishPrimaryWithSecondary(splitPairRule.getFinishPrimaryWithSecondary()).setFinishSecondaryWithPrimary(splitPairRule.getFinishSecondaryWithPrimary()).setClearTop(splitPairRule.getClearTop()).setDefaultSplitAttributes(splitPairRule.getDefaultSplitAttributes());
        }

        public final SplitPairRule build() {
            return new SplitPairRule(this.filters, this.defaultSplitAttributes, this.tag, this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, this.minWidthDp, this.minHeightDp, this.minSmallestWidthDp, this.maxAspectRatioInPortrait, this.maxAspectRatioInLandscape);
        }

        public final Builder setClearTop(boolean z) {
            this.clearTop = z;
            return this;
        }

        public final Builder setDefaultSplitAttributes(SplitAttributes splitAttributes) {
            x.f(splitAttributes, "defaultSplitAttributes");
            this.defaultSplitAttributes = splitAttributes;
            return this;
        }

        public final Builder setFinishPrimaryWithSecondary(SplitRule.FinishBehavior finishBehavior) {
            x.f(finishBehavior, "finishPrimaryWithSecondary");
            this.finishPrimaryWithSecondary = finishBehavior;
            return this;
        }

        public final Builder setFinishSecondaryWithPrimary(SplitRule.FinishBehavior finishBehavior) {
            x.f(finishBehavior, "finishSecondaryWithPrimary");
            this.finishSecondaryWithPrimary = finishBehavior;
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

        public final Builder setTag(String str) {
            this.tag = str;
            return this;
        }

        public Builder(Set<SplitPairFilter> set) {
            x.f(set, "filters");
            this.filters = set;
            this.minWidthDp = 600;
            this.minHeightDp = 600;
            this.minSmallestWidthDp = 600;
            this.maxAspectRatioInPortrait = SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT;
            this.maxAspectRatioInLandscape = SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT;
            this.finishPrimaryWithSecondary = SplitRule.FinishBehavior.NEVER;
            this.finishSecondaryWithPrimary = SplitRule.FinishBehavior.ALWAYS;
            this.defaultSplitAttributes = new SplitAttributes.Builder().build();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPairRule(Set<SplitPairFilter> set, SplitAttributes splitAttributes, String str, SplitRule.FinishBehavior finishBehavior, SplitRule.FinishBehavior finishBehavior2, boolean z, int i2, int i3, int i4, EmbeddingAspectRatio embeddingAspectRatio, EmbeddingAspectRatio embeddingAspectRatio2) {
        super(str, i2, i3, i4, embeddingAspectRatio, embeddingAspectRatio2, splitAttributes);
        x.f(set, "filters");
        x.f(splitAttributes, "defaultSplitAttributes");
        x.f(finishBehavior, "finishPrimaryWithSecondary");
        x.f(finishBehavior2, "finishSecondaryWithPrimary");
        x.f(embeddingAspectRatio, "maxAspectRatioInPortrait");
        x.f(embeddingAspectRatio2, "maxAspectRatioInLandscape");
        this.filters = set;
        this.finishPrimaryWithSecondary = finishBehavior;
        this.finishSecondaryWithPrimary = finishBehavior2;
        this.clearTop = z;
    }
}
