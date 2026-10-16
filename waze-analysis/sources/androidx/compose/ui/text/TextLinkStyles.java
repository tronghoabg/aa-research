package androidx.compose.ui.text;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextLinkStyles {
    public static final int $stable = 0;
    private final SpanStyle focusedStyle;
    private final SpanStyle hoveredStyle;
    private final SpanStyle pressedStyle;
    private final SpanStyle style;

    public /* synthetic */ TextLinkStyles(SpanStyle spanStyle, SpanStyle spanStyle2, SpanStyle spanStyle3, SpanStyle spanStyle4, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : spanStyle, (i2 & 2) != 0 ? null : spanStyle2, (i2 & 4) != 0 ? null : spanStyle3, (i2 & 8) != 0 ? null : spanStyle4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TextLinkStyles)) {
            return false;
        }
        TextLinkStyles textLinkStyles = (TextLinkStyles) obj;
        return x.n(this.style, textLinkStyles.style) && x.n(this.focusedStyle, textLinkStyles.focusedStyle) && x.n(this.hoveredStyle, textLinkStyles.hoveredStyle) && x.n(this.pressedStyle, textLinkStyles.pressedStyle);
    }

    public final SpanStyle getFocusedStyle() {
        return this.focusedStyle;
    }

    public final SpanStyle getHoveredStyle() {
        return this.hoveredStyle;
    }

    public final SpanStyle getPressedStyle() {
        return this.pressedStyle;
    }

    public final SpanStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        SpanStyle spanStyle = this.style;
        int iHashCode = spanStyle != null ? spanStyle.hashCode() : 0;
        SpanStyle spanStyle2 = this.focusedStyle;
        int iHashCode2 = spanStyle2 != null ? spanStyle2.hashCode() : 0;
        int i2 = iHashCode * 31;
        SpanStyle spanStyle3 = this.hoveredStyle;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (spanStyle3 != null ? spanStyle3.hashCode() : 0)) * 31;
        SpanStyle spanStyle4 = this.pressedStyle;
        return iHashCode3 + (spanStyle4 != null ? spanStyle4.hashCode() : 0);
    }

    public TextLinkStyles(SpanStyle spanStyle, SpanStyle spanStyle2, SpanStyle spanStyle3, SpanStyle spanStyle4) {
        this.style = spanStyle;
        this.focusedStyle = spanStyle2;
        this.hoveredStyle = spanStyle3;
        this.pressedStyle = spanStyle4;
    }

    public TextLinkStyles() {
        this(null, null, null, null, 15, null);
    }
}
