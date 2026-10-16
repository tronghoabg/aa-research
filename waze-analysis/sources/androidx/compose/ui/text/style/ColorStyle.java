package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import h.g.a.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ColorStyle implements TextForegroundStyle {
    private final long value;

    private ColorStyle(long j2) {
        this.value = j2;
        if (j2 != 16) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    /* renamed from: copy-8_81llA$default, reason: not valid java name */
    public static /* synthetic */ ColorStyle m10892copy8_81llA$default(ColorStyle colorStyle, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = colorStyle.value;
        }
        return colorStyle.m10894copy8_81llA(j2);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m10893component10d7_KjU() {
        return this.value;
    }

    /* renamed from: copy-8_81llA, reason: not valid java name */
    public final ColorStyle m10894copy8_81llA(long j2) {
        return new ColorStyle(j2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorStyle) && Color.m8229equalsimpl0(this.value, ((ColorStyle) obj).value);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return Color.m8230getAlphaimpl(mo10891getColor0d7_KjU());
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return null;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU */
    public long mo10891getColor0d7_KjU() {
        return this.value;
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m10895getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m8235hashCodeimpl(this.value);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public /* synthetic */ TextForegroundStyle merge(TextForegroundStyle textForegroundStyle) {
        return TextForegroundStyle.CC.$default$merge(this, textForegroundStyle);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public /* synthetic */ TextForegroundStyle takeOrElse(a aVar) {
        return TextForegroundStyle.CC.$default$takeOrElse(this, aVar);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) Color.m8236toStringimpl(this.value)) + ')';
    }

    public /* synthetic */ ColorStyle(long j2, o oVar) {
        this(j2);
    }
}
