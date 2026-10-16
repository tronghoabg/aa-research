package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextLayoutResult {
    public static final int $stable = 8;
    private final float firstBaseline;
    private final float lastBaseline;
    private final TextLayoutInput layoutInput;
    private final MultiParagraph multiParagraph;
    private final List<Rect> placeholderRects;
    private final long size;

    private TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j2) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = multiParagraph;
        this.size = j2;
        this.firstBaseline = multiParagraph.getFirstBaseline();
        this.lastBaseline = multiParagraph.getLastBaseline();
        this.placeholderRects = multiParagraph.getPlaceholderRects();
    }

    /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m10514copyO0kMr_c$default(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i2 & 2) != 0) {
            j2 = textLayoutResult.size;
        }
        return textLayoutResult.m10515copyO0kMr_c(textLayoutInput, j2);
    }

    /* renamed from: copy-O0kMr_c, reason: not valid java name */
    public final TextLayoutResult m10515copyO0kMr_c(TextLayoutInput textLayoutInput, long j2) {
        return new TextLayoutResult(textLayoutInput, this.multiParagraph, j2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        return x.n(this.layoutInput, textLayoutResult.layoutInput) && x.n(this.multiParagraph, textLayoutResult.multiParagraph) && IntSize.m11337equalsimpl0(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && x.n(this.placeholderRects, textLayoutResult.placeholderRects);
    }

    public final ResolvedTextDirection getBidiRunDirection(int i2) {
        return this.multiParagraph.getBidiRunDirection(i2);
    }

    public final Rect getBoundingBox(int i2) {
        return this.multiParagraph.getBoundingBox(i2);
    }

    public final Rect getCursorRect(int i2) {
        return this.multiParagraph.getCursorRect(i2);
    }

    public final boolean getDidOverflowHeight() {
        if (this.multiParagraph.getDidExceedMaxLines()) {
            return true;
        }
        return ((float) ((int) (this.size & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) < this.multiParagraph.getHeight();
    }

    public final boolean getDidOverflowWidth() {
        return ((float) ((int) (this.size >> 32))) < this.multiParagraph.getWidth();
    }

    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public final boolean getHasVisualOverflow() {
        return getDidOverflowWidth() || getDidOverflowHeight();
    }

    public final float getHorizontalPosition(int i2, boolean z) {
        return this.multiParagraph.getHorizontalPosition(i2, z);
    }

    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float getLineBaseline(int i2) {
        return this.multiParagraph.getLineBaseline(i2);
    }

    public final float getLineBottom(int i2) {
        return this.multiParagraph.getLineBottom(i2);
    }

    public final int getLineCount() {
        return this.multiParagraph.getLineCount();
    }

    public final int getLineEnd(int i2, boolean z) {
        return this.multiParagraph.getLineEnd(i2, z);
    }

    public final int getLineForOffset(int i2) {
        return this.multiParagraph.getLineForOffset(i2);
    }

    public final int getLineForVerticalPosition(float f2) {
        return this.multiParagraph.getLineForVerticalPosition(f2);
    }

    public final float getLineLeft(int i2) {
        return this.multiParagraph.getLineLeft(i2);
    }

    public final float getLineRight(int i2) {
        return this.multiParagraph.getLineRight(i2);
    }

    public final int getLineStart(int i2) {
        return this.multiParagraph.getLineStart(i2);
    }

    public final float getLineTop(int i2) {
        return this.multiParagraph.getLineTop(i2);
    }

    public final MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m10516getOffsetForPositionk4lQ0M(long j2) {
        return this.multiParagraph.m10407getOffsetForPositionk4lQ0M(j2);
    }

    public final ResolvedTextDirection getParagraphDirection(int i2) {
        return this.multiParagraph.getParagraphDirection(i2);
    }

    public final Path getPathForRange(int i2, int i3) {
        return this.multiParagraph.getPathForRange(i2, i3);
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m10517getSizeYbymL2g() {
        return this.size;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m10518getWordBoundaryjx7JFs(int i2) {
        return this.multiParagraph.m10409getWordBoundaryjx7JFs(i2);
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + IntSize.m11340hashCodeimpl(this.size)) * 31) + Float.floatToIntBits(this.firstBaseline)) * 31) + Float.floatToIntBits(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final boolean isLineEllipsized(int i2) {
        return this.multiParagraph.isLineEllipsized(i2);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) IntSize.m11342toStringimpl(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j2, o oVar) {
        this(textLayoutInput, multiParagraph, j2);
    }
}
