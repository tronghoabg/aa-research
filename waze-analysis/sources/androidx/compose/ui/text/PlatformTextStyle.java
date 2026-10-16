package androidx.compose.ui.text;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PlatformTextStyle {
    public static final int $stable = 0;
    private final PlatformParagraphStyle paragraphStyle;
    private final PlatformSpanStyle spanStyle;

    public /* synthetic */ PlatformTextStyle(boolean z, int i2, o oVar) {
        this(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) obj;
        return x.n(this.paragraphStyle, platformTextStyle.paragraphStyle) && x.n(this.spanStyle, platformTextStyle.spanStyle);
    }

    public final PlatformParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    public final PlatformSpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    public int hashCode() {
        PlatformSpanStyle platformSpanStyle = this.spanStyle;
        int iHashCode = platformSpanStyle != null ? platformSpanStyle.hashCode() : 0;
        PlatformParagraphStyle platformParagraphStyle = this.paragraphStyle;
        return (iHashCode * 31) + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0);
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.spanStyle + ", paragraphSyle=" + this.paragraphStyle + ')';
    }

    public PlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = platformSpanStyle;
        this.paragraphStyle = platformParagraphStyle;
    }

    private PlatformTextStyle(int i2) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(i2, (o) null));
    }

    public PlatformTextStyle(boolean z) {
        this((PlatformSpanStyle) null, new PlatformParagraphStyle(z));
    }

    public /* synthetic */ PlatformTextStyle(int i2, o oVar) {
        this(i2);
    }
}
