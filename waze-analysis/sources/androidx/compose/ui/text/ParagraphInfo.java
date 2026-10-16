package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;
import h.g.b.x;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ParagraphInfo {
    public static final int $stable = 8;
    private float bottom;
    private final int endIndex;
    private int endLineIndex;
    private final Paragraph paragraph;
    private final int startIndex;
    private int startLineIndex;
    private float top;

    public /* synthetic */ ParagraphInfo(Paragraph paragraph, int i2, int i3, int i4, int i5, float f2, float f3, int i6, o oVar) {
        this(paragraph, i2, i3, (i6 & 8) != 0 ? -1 : i4, (i6 & 16) != 0 ? -1 : i5, (i6 & 32) != 0 ? -1.0f : f2, (i6 & 64) != 0 ? -1.0f : f3);
    }

    public static /* synthetic */ ParagraphInfo copy$default(ParagraphInfo paragraphInfo, Paragraph paragraph, int i2, int i3, int i4, int i5, float f2, float f3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            paragraph = paragraphInfo.paragraph;
        }
        if ((i6 & 2) != 0) {
            i2 = paragraphInfo.startIndex;
        }
        if ((i6 & 4) != 0) {
            i3 = paragraphInfo.endIndex;
        }
        if ((i6 & 8) != 0) {
            i4 = paragraphInfo.startLineIndex;
        }
        if ((i6 & 16) != 0) {
            i5 = paragraphInfo.endLineIndex;
        }
        if ((i6 & 32) != 0) {
            f2 = paragraphInfo.top;
        }
        if ((i6 & 64) != 0) {
            f3 = paragraphInfo.bottom;
        }
        float f4 = f2;
        float f5 = f3;
        int i7 = i5;
        int i8 = i3;
        return paragraphInfo.copy(paragraph, i2, i8, i4, i7, f4, f5);
    }

    public final Paragraph component1() {
        return this.paragraph;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final int component4() {
        return this.startLineIndex;
    }

    public final int component5() {
        return this.endLineIndex;
    }

    public final float component6() {
        return this.top;
    }

    public final float component7() {
        return this.bottom;
    }

    public final ParagraphInfo copy(Paragraph paragraph, int i2, int i3, int i4, int i5, float f2, float f3) {
        return new ParagraphInfo(paragraph, i2, i3, i4, i5, f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        return x.n(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && Float.compare(this.top, paragraphInfo.top) == 0 && Float.compare(this.bottom, paragraphInfo.bottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final int getLength() {
        return this.endIndex - this.startIndex;
    }

    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((((((((this.paragraph.hashCode() * 31) + this.startIndex) * 31) + this.endIndex) * 31) + this.startLineIndex) * 31) + this.endLineIndex) * 31) + Float.floatToIntBits(this.top)) * 31) + Float.floatToIntBits(this.bottom);
    }

    public final void setBottom(float f2) {
        this.bottom = f2;
    }

    public final void setEndLineIndex(int i2) {
        this.endLineIndex = i2;
    }

    public final void setStartLineIndex(int i2) {
        this.startLineIndex = i2;
    }

    public final void setTop(float f2) {
        this.top = f2;
    }

    public final Rect toGlobal(Rect rect) {
        float f2 = this.top;
        return rect.m8017translatek4lQ0M((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: toGlobal-xdX6-G0, reason: not valid java name */
    public final long m10421toGlobalxdX6G0(long j2, boolean z) {
        return (z && TextRange.m10539equalsimpl0(j2, TextRange.Companion.m10551getZerod9O1mEE())) ? TextRange.Companion.m10551getZerod9O1mEE() : TextRangeKt.TextRange(toGlobalIndex(TextRange.m10546getStartimpl(j2)), toGlobalIndex(TextRange.m10541getEndimpl(j2)));
    }

    public final int toGlobalIndex(int i2) {
        return i2 + this.startIndex;
    }

    public final int toGlobalLineIndex(int i2) {
        return i2 + this.startLineIndex;
    }

    public final float toGlobalYPosition(float f2) {
        return f2 + this.top;
    }

    public final Rect toLocal(Rect rect) {
        float f2 = -this.top;
        return rect.m8017translatek4lQ0M((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: toLocal-MK-Hz9U, reason: not valid java name */
    public final long m10422toLocalMKHz9U(long j2) {
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) - this.top;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(fIntBitsToFloat2));
    }

    public final int toLocalIndex(int i2) {
        int i3 = this.startIndex;
        return n.j(i2, i3, this.endIndex) - i3;
    }

    public final int toLocalLineIndex(int i2) {
        return i2 - this.startLineIndex;
    }

    public final float toLocalYPosition(float f2) {
        return f2 - this.top;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.paragraph + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", startLineIndex=" + this.startLineIndex + ", endLineIndex=" + this.endLineIndex + ", top=" + this.top + ", bottom=" + this.bottom + ')';
    }

    public ParagraphInfo(Paragraph paragraph, int i2, int i3, int i4, int i5, float f2, float f3) {
        this.paragraph = paragraph;
        this.startIndex = i2;
        this.endIndex = i3;
        this.startLineIndex = i4;
        this.endLineIndex = i5;
        this.top = f2;
        this.bottom = f3;
    }

    public final Path toGlobal(Path path) {
        float f2 = this.top;
        path.mo8120translatek4lQ0M((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return path;
    }
}
