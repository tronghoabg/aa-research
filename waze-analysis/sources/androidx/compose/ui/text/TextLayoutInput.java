package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextLayoutInput {
    public static final int $stable = 8;
    private Font.ResourceLoader _developerSuppliedResourceLoader;
    private final long constraints;
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private final LayoutDirection layoutDirection;
    private final int maxLines;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z, int i3, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j2) {
        this(annotatedString, textStyle, list, i2, z, i3, density, layoutDirection, resourceLoader, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), j2);
    }

    /* renamed from: copy-hu-1Yfo$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutInput m10510copyhu1Yfo$default(TextLayoutInput textLayoutInput, AnnotatedString annotatedString, TextStyle textStyle, List list, int i2, boolean z, int i3, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            annotatedString = textLayoutInput.text;
        }
        if ((i4 & 2) != 0) {
            textStyle = textLayoutInput.style;
        }
        if ((i4 & 4) != 0) {
            list = textLayoutInput.placeholders;
        }
        if ((i4 & 8) != 0) {
            i2 = textLayoutInput.maxLines;
        }
        if ((i4 & 16) != 0) {
            z = textLayoutInput.softWrap;
        }
        if ((i4 & 32) != 0) {
            i3 = textLayoutInput.overflow;
        }
        if ((i4 & 64) != 0) {
            density = textLayoutInput.density;
        }
        if ((i4 & 128) != 0) {
            layoutDirection = textLayoutInput.layoutDirection;
        }
        if ((i4 & 256) != 0) {
            resourceLoader = textLayoutInput.getResourceLoader();
        }
        if ((i4 & 512) != 0) {
            j2 = textLayoutInput.constraints;
        }
        long j3 = j2;
        LayoutDirection layoutDirection2 = layoutDirection;
        Font.ResourceLoader resourceLoader2 = resourceLoader;
        int i5 = i3;
        Density density2 = density;
        boolean z2 = z;
        List list2 = list;
        return textLayoutInput.m10511copyhu1Yfo(annotatedString, textStyle, list2, i2, z2, i5, density2, layoutDirection2, resourceLoader2, j3);
    }

    /* renamed from: copy-hu-1Yfo, reason: not valid java name */
    public final TextLayoutInput m10511copyhu1Yfo(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z, int i3, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j2) {
        return new TextLayoutInput(annotatedString, textStyle, list, i2, z, i3, density, layoutDirection, resourceLoader, this.fontFamilyResolver, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) obj;
        return x.n(this.text, textLayoutInput.text) && x.n(this.style, textLayoutInput.style) && x.n(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && TextOverflow.m11059equalsimpl0(this.overflow, textLayoutInput.overflow) && x.n(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && x.n(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && Constraints.m11100equalsimpl0(this.constraints, textLayoutInput.constraints);
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m10512getConstraintsmsEJaDk() {
        return this.constraints;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m10513getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final Font.ResourceLoader getResourceLoader() {
        Font.ResourceLoader resourceLoader = this._developerSuppliedResourceLoader;
        if (resourceLoader != null) {
            return resourceLoader;
        }
        return DeprecatedBridgeFontResourceLoader.Companion.from(this.fontFamilyResolver);
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = (((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.placeholders.hashCode();
        Density density = this.density;
        return (((((((((((((iHashCode * 31) + this.maxLines) * 31) + TextLayoutInput$$ExternalSyntheticBackport0.m(this.softWrap)) * 31) + this.overflow) * 31) + density.hashCode()) * 31) + this.layoutDirection.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + Constraints.m11110hashCodeimpl(this.constraints);
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) TextOverflow.m11061toStringimpl(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m11112toStringimpl(this.constraints)) + ')';
    }

    public static /* synthetic */ void getResourceLoader$annotations() {
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z, int i3, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, FontFamily.Resolver resolver, long j2) {
        this.text = annotatedString;
        this.style = textStyle;
        this.placeholders = list;
        this.maxLines = i2;
        this.softWrap = z;
        this.overflow = i3;
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.fontFamilyResolver = resolver;
        this.constraints = j2;
        this._developerSuppliedResourceLoader = resourceLoader;
    }

    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i2, boolean z, int i3, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2, o oVar) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i2, z, i3, density, layoutDirection, resolver, j2);
    }

    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i2, boolean z, int i3, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j2, o oVar) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i2, z, i3, density, layoutDirection, resourceLoader, j2);
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z, int i3, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
        this(annotatedString, textStyle, list, i2, z, i3, density, layoutDirection, (Font.ResourceLoader) null, resolver, j2);
    }
}
