package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldSize {
    private Density density;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection layoutDirection;
    private TextStyle resolvedStyle;
    private Object typeface;
    private final MutableState dirty$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private long minSize = IntSize.Companion.m11344getZeroYbymL2g();

    public TextFieldSize(LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, TextStyle textStyle, Object obj) {
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = textStyle;
        this.typeface = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getDirty() {
        return ((Boolean) this.dirty$delegate.getValue()).booleanValue();
    }

    private final void setDirty(boolean z) {
        this.dirty$delegate.setValue(Boolean.valueOf(z));
    }

    public static /* synthetic */ void update$default(TextFieldSize textFieldSize, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, TextStyle textStyle, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            layoutDirection = textFieldSize.layoutDirection;
        }
        if ((i2 & 2) != 0) {
            density = textFieldSize.density;
        }
        if ((i2 & 4) != 0) {
            resolver = textFieldSize.fontFamilyResolver;
        }
        if ((i2 & 8) != 0) {
            textStyle = textFieldSize.resolvedStyle;
        }
        if ((i2 & 16) != 0) {
            obj = textFieldSize.typeface;
        }
        Object obj3 = obj;
        FontFamily.Resolver resolver2 = resolver;
        LayoutDirection layoutDirection2 = layoutDirection;
        textFieldSize.update(layoutDirection2, density, resolver2, textStyle, obj3);
    }

    /* renamed from: cachedMinSizeOrComputeMinSize-YEO4UFw, reason: not valid java name */
    public final long m3416cachedMinSizeOrComputeMinSizeYEO4UFw(Object obj) {
        updateTypeface(obj);
        if (getDirty()) {
            this.minSize = m3417computeMinSizeYEO4UFw(this.fontFamilyResolver);
            setDirty(false);
        }
        return this.minSize;
    }

    /* renamed from: computeMinSize-YEO4UFw, reason: not valid java name */
    public final long m3417computeMinSizeYEO4UFw(FontFamily.Resolver resolver) {
        return TextFieldDelegateKt.computeSizeForDefaultText$default(this.resolvedStyle, this.density, resolver, 0, 8, null);
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

    public final TextStyle getResolvedStyle() {
        return this.resolvedStyle;
    }

    public final Object getTypeface() {
        return this.typeface;
    }

    public final void setDensity(Density density) {
        this.density = density;
    }

    public final void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver = resolver;
    }

    public final void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    public final void setResolvedStyle(TextStyle textStyle) {
        this.resolvedStyle = textStyle;
    }

    public final void setTypeface(Object obj) {
        this.typeface = obj;
    }

    public final void update(LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, TextStyle textStyle, Object obj) {
        if (layoutDirection == this.layoutDirection && x.n(density, this.density) && x.n(resolver, this.fontFamilyResolver) && x.n(textStyle, this.resolvedStyle)) {
            updateTypeface(obj);
            return;
        }
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.resolvedStyle = textStyle;
        setDirty(true);
    }

    public final void updateTypeface(Object obj) {
        if (x.n(obj, this.typeface)) {
            return;
        }
        this.typeface = obj;
        setDirty(true);
    }
}
