package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ResourceFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    private final FontVariation.Settings variationSettings;
    private final FontWeight weight;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResourceFont(int i2, FontWeight fontWeight, int i3, FontVariation.Settings settings, int i4, int i5, o oVar) {
        FontWeight normal = (i5 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight;
        int iM10668getNormal_LCdwA = (i5 & 4) != 0 ? FontStyle.Companion.m10668getNormal_LCdwA() : i3;
        this(i2, normal, iM10668getNormal_LCdwA, (i5 & 8) != 0 ? FontVariation.INSTANCE.m10684Settings6EWAqTQ(normal, iM10668getNormal_LCdwA, new FontVariation.Setting[0]) : settings, (i5 & 16) != 0 ? FontLoadingStrategy.Companion.m10652getAsyncPKNRLFQ() : i4, null);
    }

    /* renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m10698copyF3nL8kk$default(ResourceFont resourceFont, int i2, FontWeight fontWeight, int i3, int i4, FontVariation.Settings settings, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = resourceFont.resId;
        }
        if ((i5 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i5 & 4) != 0) {
            i3 = resourceFont.mo10613getStyle_LCdwA();
        }
        if ((i5 & 8) != 0) {
            i4 = resourceFont.mo10603getLoadingStrategyPKNRLFQ();
        }
        if ((i5 & 16) != 0) {
            settings = resourceFont.variationSettings;
        }
        FontVariation.Settings settings2 = settings;
        int i6 = i3;
        return resourceFont.m10701copyF3nL8kk(i2, fontWeight, i6, i4, settings2);
    }

    /* renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m10699copyRetOiIg$default(ResourceFont resourceFont, int i2, FontWeight fontWeight, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = resourceFont.resId;
        }
        if ((i4 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i4 & 4) != 0) {
            i3 = resourceFont.mo10613getStyle_LCdwA();
        }
        return resourceFont.m10702copyRetOiIg(i2, fontWeight, i3);
    }

    /* renamed from: copy-F3nL8kk, reason: not valid java name */
    public final ResourceFont m10701copyF3nL8kk(int i2, FontWeight fontWeight, int i3, int i4, FontVariation.Settings settings) {
        return new ResourceFont(i2, fontWeight, i3, settings, i4, null);
    }

    /* renamed from: copy-RetOiIg, reason: not valid java name */
    public final ResourceFont m10702copyRetOiIg(int i2, FontWeight fontWeight, int i3) {
        return m10698copyF3nL8kk$default(this, i2, fontWeight, i3, mo10603getLoadingStrategyPKNRLFQ(), null, 16, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        return this.resId == resourceFont.resId && x.n(getWeight(), resourceFont.getWeight()) && FontStyle.m10661equalsimpl0(mo10613getStyle_LCdwA(), resourceFont.mo10613getStyle_LCdwA()) && x.n(this.variationSettings, resourceFont.variationSettings) && FontLoadingStrategy.m10648equalsimpl0(mo10603getLoadingStrategyPKNRLFQ(), resourceFont.mo10603getLoadingStrategyPKNRLFQ());
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ */
    public int mo10603getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo10613getStyle_LCdwA() {
        return this.style;
    }

    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((this.resId * 31) + getWeight().hashCode()) * 31) + mo10613getStyle_LCdwA()) * 31) + mo10603getLoadingStrategyPKNRLFQ()) * 31) + this.variationSettings.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m10663toStringimpl(mo10613getStyle_LCdwA())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m10650toStringimpl(mo10603getLoadingStrategyPKNRLFQ())) + ')';
    }

    /* renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m10700getLoadingStrategyPKNRLFQ$annotations() {
    }

    public /* synthetic */ ResourceFont(int i2, FontWeight fontWeight, int i3, FontVariation.Settings settings, int i4, o oVar) {
        this(i2, fontWeight, i3, settings, i4);
    }

    private ResourceFont(int i2, FontWeight fontWeight, int i3, FontVariation.Settings settings, int i4) {
        this.resId = i2;
        this.weight = fontWeight;
        this.style = i3;
        this.variationSettings = settings;
        this.loadingStrategy = i4;
    }
}
