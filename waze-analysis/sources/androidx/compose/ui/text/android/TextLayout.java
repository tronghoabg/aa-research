package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import h.a.c;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextLayout {
    public static final int $stable = 8;
    private LayoutHelper backingLayoutHelper;
    private WordIterator backingWordIterator;
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final TextUtils.TruncateAt ellipsize;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    private final int lastLineExtra;
    private final Paint.FontMetricsInt lastLineFontMetrics;
    private final Layout layout;
    private final LayoutIntrinsics layoutIntrinsics;
    private final float leftPadding;
    private final int lineCount;
    private final LineHeightStyleSpan[] lineHeightSpans;
    private final Rect rect;
    private final float rightPadding;
    private final TextPaint textPaint;
    private final int topPadding;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public TextLayout(CharSequence charSequence, float f2, TextPaint textPaint, int i2, TextUtils.TruncateAt truncateAt, int i3, float f3, float f4, boolean z, boolean z2, int i4, int i5, int i6, int i7, int i8, int i9, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics) {
        int i10;
        boolean z3;
        TextDirectionHeuristic textDirectionHeuristic;
        boolean z4;
        TextPaint textPaint2;
        Layout layoutCreate;
        long jVerticalPaddings;
        LineHeightStyleSpan lineHeightStyleSpan;
        LineHeightStyleSpan lineHeightStyleSpan2;
        this.textPaint = textPaint;
        this.ellipsize = truncateAt;
        this.includePadding = z;
        this.fallbackLineSpacing = z2;
        this.layoutIntrinsics = layoutIntrinsics;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = TextLayout_androidKt.getTextDirectionHeuristic(i3);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i2);
        boolean z5 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        boolean z6 = z5;
        try {
            BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
            double d2 = f2;
            int iCeil = (int) Math.ceil(d2);
            if (boringMetrics == null || layoutIntrinsics.getMaxIntrinsicWidth() > f2 || z6) {
                this.isBoringLayout = false;
                i10 = i4;
                z3 = false;
                textDirectionHeuristic = textDirectionHeuristic2;
                z4 = true;
                textPaint2 = textPaint;
                layoutCreate = StaticLayoutFactory.INSTANCE.create(charSequence, textPaint, iCeil, 0, charSequence.length(), textDirectionHeuristic, alignment, i10, truncateAt, (int) Math.ceil(d2), f3, f4, i9, z, z2, i5, i6, i7, i8, iArr, iArr2);
            } else {
                this.isBoringLayout = true;
                textPaint2 = textPaint;
                i10 = i4;
                layoutCreate = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, iCeil, boringMetrics, alignment, z, z2, truncateAt, iCeil);
                textDirectionHeuristic = textDirectionHeuristic2;
                z4 = true;
                z3 = false;
            }
            this.layout = layoutCreate;
            Trace.endSection();
            int iMin = Math.min(layoutCreate.getLineCount(), i10);
            this.lineCount = iMin;
            int i11 = iMin - 1;
            this.didExceedMaxLines = (iMin >= i10 && (layoutCreate.getEllipsisCount(i11) > 0 || layoutCreate.getLineEnd(i11) != charSequence.length())) ? z4 : z3;
            LineHeightStyleSpan[] lineHeightSpans = TextLayout_androidKt.getLineHeightSpans(this);
            this.lineHeightSpans = lineHeightSpans;
            boolean z7 = (lineHeightSpans == null || (lineHeightStyleSpan2 = (LineHeightStyleSpan) c.N(lineHeightSpans)) == null || !lineHeightStyleSpan2.getTrimFirstLineTop() || !LineHeightStyle.Mode.m10984equalsimpl0(lineHeightStyleSpan2.m10602getModelzQqcRY(), LineHeightStyle.Mode.Companion.m10990getTightlzQqcRY())) ? z3 : z4;
            z4 = (lineHeightSpans == null || (lineHeightStyleSpan = (LineHeightStyleSpan) c.N(lineHeightSpans)) == null || !lineHeightStyleSpan.getTrimLastLineBottom() || !LineHeightStyle.Mode.m10984equalsimpl0(lineHeightStyleSpan.m10602getModelzQqcRY(), LineHeightStyle.Mode.Companion.m10990getTightlzQqcRY())) ? z3 : z4;
            if (z7 && z4) {
                jVerticalPaddings = TextLayout_androidKt.ZeroVerticalPadding;
            } else {
                long verticalPaddings = TextLayout_androidKt.getVerticalPaddings(this);
                jVerticalPaddings = TextLayout_androidKt.VerticalPaddings(z7 ? z3 : VerticalPaddings.m10598getTopPaddingimpl(verticalPaddings), z4 ? z3 : VerticalPaddings.m10597getBottomPaddingimpl(verticalPaddings));
            }
            long lineHeightPaddings = lineHeightSpans != null ? TextLayout_androidKt.getLineHeightPaddings(lineHeightSpans) : TextLayout_androidKt.ZeroVerticalPadding;
            this.topPadding = Math.max(VerticalPaddings.m10598getTopPaddingimpl(jVerticalPaddings), VerticalPaddings.m10598getTopPaddingimpl(lineHeightPaddings));
            this.bottomPadding = Math.max(VerticalPaddings.m10597getBottomPaddingimpl(jVerticalPaddings), VerticalPaddings.m10597getBottomPaddingimpl(lineHeightPaddings));
            Paint.FontMetricsInt lastLineMetrics = TextLayout_androidKt.getLastLineMetrics(this, textPaint2, textDirectionHeuristic, lineHeightSpans);
            this.lastLineExtra = lastLineMetrics != null ? lastLineMetrics.bottom - ((int) getLineHeight(i11)) : z3;
            this.lastLineFontMetrics = lastLineMetrics;
            this.leftPadding = IndentationFixSpan_androidKt.getEllipsizedLeftPadding$default(layoutCreate, i11, null, 2, null);
            this.rightPadding = IndentationFixSpan_androidKt.getEllipsizedRightPadding$default(layoutCreate, i11, null, 2, null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    private final float getHorizontalPadding(int i2) {
        if (i2 == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    private final LayoutHelper getLayoutHelper() {
        LayoutHelper layoutHelper = this.backingLayoutHelper;
        if (layoutHelper != null) {
            return layoutHelper;
        }
        LayoutHelper layoutHelper2 = new LayoutHelper(this.layout);
        this.backingLayoutHelper = layoutHelper2;
        return layoutHelper2;
    }

    public final void fillBoundingBoxes(int i2, int i3, float[] fArr, int i4) {
        float secondaryDownstream;
        float secondaryUpstream;
        int length = getText().length();
        if (i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("startOffset must be > 0");
        }
        if (i2 >= length) {
            InlineClassHelperKt.throwIllegalArgumentException("startOffset must be less than text length");
        }
        if (i3 <= i2) {
            InlineClassHelperKt.throwIllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (i3 > length) {
            InlineClassHelperKt.throwIllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (fArr.length - i4 < (i3 - i2) * 4) {
            InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = getLineForOffset(i2);
        int lineForOffset2 = getLineForOffset(i3 - 1);
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        while (true) {
            int lineStart = getLineStart(lineForOffset);
            int lineEnd = getLineEnd(lineForOffset);
            int iMax = Math.max(i2, lineStart);
            int iMin = Math.min(i3, lineEnd);
            float lineTop = getLineTop(lineForOffset);
            float lineBottom = getLineBottom(lineForOffset);
            boolean z = getParagraphDirection(lineForOffset) == 1;
            while (iMax < iMin) {
                int i5 = iMax + 1;
                boolean zIsRtlCharAt = isRtlCharAt(iMax);
                if (z && !zIsRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(i5);
                } else if (z) {
                    secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(i5);
                } else if (zIsRtlCharAt) {
                    secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(i5);
                } else {
                    secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(i5);
                }
                fArr[i4] = secondaryDownstream;
                fArr[i4 + 1] = lineTop;
                fArr[i4 + 2] = secondaryUpstream;
                fArr[i4 + 3] = lineBottom;
                i4 += 4;
                iMax = i5;
            }
            if (lineForOffset == lineForOffset2) {
                return;
            } else {
                lineForOffset++;
            }
        }
    }

    public final void fillLineHorizontalBounds$ui_text(int i2, float[] fArr) {
        float secondaryDownstream;
        float secondaryUpstream;
        int lineStart = getLineStart(i2);
        int lineEnd = getLineEnd(i2);
        int i3 = lineEnd - lineStart;
        if (fArr.length < i3 + i3) {
            InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        int i4 = 0;
        boolean z = getParagraphDirection(i2) == 1;
        while (lineStart < lineEnd) {
            int i5 = lineStart + 1;
            boolean zIsRtlCharAt = isRtlCharAt(lineStart);
            if (z && !zIsRtlCharAt) {
                secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(i5);
            } else if (z) {
                secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(i5);
            } else if (zIsRtlCharAt) {
                secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(lineStart);
                secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(i5);
            } else {
                secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(lineStart);
                secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(i5);
            }
            fArr[i4] = secondaryDownstream;
            fArr[i4 + 1] = secondaryUpstream;
            i4 += 2;
            lineStart = i5;
        }
    }

    public final int getBottomPadding$ui_text() {
        return this.bottomPadding;
    }

    public final RectF getBoundingBox(int i2) {
        float secondaryHorizontal;
        float secondaryHorizontal2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int lineForOffset = getLineForOffset(i2);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        int paragraphDirection = getParagraphDirection(lineForOffset);
        boolean zIsRtlCharAt = this.layout.isRtlCharAt(i2);
        boolean z = paragraphDirection == 1;
        int i3 = i2 + 1;
        if (!z || zIsRtlCharAt) {
            if (z) {
                primaryHorizontal = getSecondaryHorizontal(i2, false);
                primaryHorizontal2 = getSecondaryHorizontal(i3, true);
            } else if (zIsRtlCharAt) {
                primaryHorizontal = getPrimaryHorizontal(i2, false);
                primaryHorizontal2 = getPrimaryHorizontal(i3, true);
            } else {
                secondaryHorizontal = getSecondaryHorizontal(i2, false);
                secondaryHorizontal2 = getSecondaryHorizontal(i3, true);
            }
            float f2 = primaryHorizontal;
            secondaryHorizontal = primaryHorizontal2;
            secondaryHorizontal2 = f2;
        } else {
            secondaryHorizontal = getPrimaryHorizontal(i2, false);
            secondaryHorizontal2 = getPrimaryHorizontal(i3, true);
        }
        return new RectF(secondaryHorizontal, lineTop, secondaryHorizontal2, lineBottom);
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int getHeight() {
        boolean z = this.didExceedMaxLines;
        Layout layout = this.layout;
        return (z ? layout.getLineBottom(this.lineCount - 1) : layout.getHeight()) + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getLineAscent(int i2) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i2 != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineAscent(i2) : fontMetricsInt.ascent;
    }

    public final float getLineBaseline(int i2) {
        return this.topPadding + ((i2 != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(i2) : getLineTop(i2) - this.lastLineFontMetrics.ascent);
    }

    public final float getLineBottom(int i2) {
        int i3;
        float lineBottom;
        if (i2 != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            int i4 = this.topPadding;
            float lineBottom2 = this.layout.getLineBottom(i2);
            i3 = i2 == this.lineCount + (-1) ? this.bottomPadding : 0;
            lineBottom = i4 + lineBottom2;
        } else {
            lineBottom = this.layout.getLineBottom(i2 - 1);
            i3 = this.lastLineFontMetrics.bottom;
        }
        return lineBottom + i3;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final float getLineDescent(int i2) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i2 != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineDescent(i2) : fontMetricsInt.descent;
    }

    public final int getLineEllipsisCount(int i2) {
        return this.layout.getEllipsisCount(i2);
    }

    public final int getLineEllipsisOffset(int i2) {
        return this.layout.getEllipsisStart(i2);
    }

    public final int getLineEnd(int i2) {
        return (TextLayout_androidKt.isLineEllipsized(this.layout, i2) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getText().length() : this.layout.getLineEnd(i2);
    }

    public final int getLineForOffset(int i2) {
        if (this.lineCount <= 0) {
            return 0;
        }
        int lineForOffset = this.layout.getLineForOffset(i2);
        int i3 = this.lineCount - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final int getLineForVertical(int i2) {
        int i3 = this.lineCount;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = i3 - 1;
        int lineForVertical = this.layout.getLineForVertical(i2 - this.topPadding);
        return lineForVertical > i4 ? i4 : lineForVertical;
    }

    public final int getLineForVerticalUnbounded(int i2) {
        return this.layout.getLineForVertical(i2 - this.topPadding);
    }

    public final float getLineHeight(int i2) {
        return getLineBottom(i2) - getLineTop(i2);
    }

    public final float getLineLeft(int i2) {
        return this.layout.getLineLeft(i2) + (i2 == this.lineCount + (-1) ? this.leftPadding : 0.0f);
    }

    public final float getLineRight(int i2) {
        return this.layout.getLineRight(i2) + (i2 == this.lineCount + (-1) ? this.rightPadding : 0.0f);
    }

    public final int getLineStart(int i2) {
        return this.layout.getLineStart(i2);
    }

    public final float getLineTop(int i2) {
        return this.layout.getLineTop(i2) + (i2 == 0 ? 0 : this.topPadding);
    }

    public final int getLineVisibleEnd(int i2) {
        return (TextLayout_androidKt.isLineEllipsized(this.layout, i2) && this.ellipsize == TextUtils.TruncateAt.END) ? this.layout.getLineStart(i2) + this.layout.getEllipsisStart(i2) : getLayoutHelper().getLineVisibleEnd(i2);
    }

    public final float getLineWidth(int i2) {
        return this.layout.getLineWidth(i2);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int i2, float f2) {
        return this.layout.getOffsetForHorizontal(i2, f2 + (-getHorizontalPadding(i2)));
    }

    public final int getParagraphDirection(int i2) {
        return this.layout.getParagraphDirection(i2);
    }

    public final float getPrimaryHorizontal(int i2, boolean z) {
        return getLayoutHelper().getHorizontalPosition(i2, true, z) + getHorizontalPadding(getLineForOffset(i2));
    }

    public final int[] getRangeForRect(RectF rectF, int i2, p<? super RectF, ? super RectF, Boolean> pVar) {
        return Build.VERSION.SDK_INT >= 34 ? AndroidLayoutApi34.INSTANCE.getRangeForRect$ui_text(this, rectF, i2, pVar) : TextLayoutGetRangeForRectExtensions_androidKt.getRangeForRect(this, this.layout, getLayoutHelper(), rectF, i2, pVar);
    }

    public final float getSecondaryHorizontal(int i2, boolean z) {
        return getLayoutHelper().getHorizontalPosition(i2, false, z) + getHorizontalPadding(getLineForOffset(i2));
    }

    public final void getSelectionPath(int i2, int i3, Path path) {
        this.layout.getSelectionPath(i2, i3, path);
        if (this.topPadding == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.topPadding);
    }

    public final CharSequence getText() {
        return this.layout.getText();
    }

    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    public final int getTopPadding$ui_text() {
        return this.topPadding;
    }

    public final WordIterator getWordIterator() {
        WordIterator wordIterator = this.backingWordIterator;
        if (wordIterator != null) {
            return wordIterator;
        }
        Layout layout = this.layout;
        WordIterator wordIterator2 = new WordIterator(layout.getText(), 0, layout.getText().length(), this.textPaint.getTextLocale());
        this.backingWordIterator = wordIterator2;
        return wordIterator2;
    }

    public final boolean isFallbackLinespacingApplied$ui_text() {
        boolean z = this.isBoringLayout;
        Layout layout = this.layout;
        if (z) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.INSTANCE;
            x.d(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return boringLayoutFactory.isFallbackLineSpacingEnabled((BoringLayout) layout);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.INSTANCE;
        x.d(layout, "null cannot be cast to non-null type android.text.StaticLayout");
        return staticLayoutFactory.isFallbackLineSpacingEnabled((StaticLayout) layout, this.fallbackLineSpacing);
    }

    public final boolean isLineEllipsized(int i2) {
        return TextLayout_androidKt.isLineEllipsized(this.layout, i2);
    }

    public final boolean isRtlCharAt(int i2) {
        return this.layout.isRtlCharAt(i2);
    }

    public final void paint(Canvas canvas) {
        if (canvas.getClipBounds(this.rect)) {
            int i2 = this.topPadding;
            if (i2 != 0) {
                canvas.translate(0.0f, i2);
            }
            ThreadLocal<TextAndroidCanvas> sharedTextAndroidCanvas = TextLayout_androidKt.getSharedTextAndroidCanvas();
            TextAndroidCanvas textAndroidCanvas = sharedTextAndroidCanvas.get();
            if (textAndroidCanvas == null) {
                textAndroidCanvas = new TextAndroidCanvas();
                sharedTextAndroidCanvas.set(textAndroidCanvas);
            }
            TextAndroidCanvas textAndroidCanvas2 = textAndroidCanvas;
            textAndroidCanvas2.set_nativeCanvas$ui_text(canvas);
            try {
                this.layout.draw(textAndroidCanvas2);
                textAndroidCanvas2.set_nativeCanvas$ui_text(null);
                int i3 = this.topPadding;
                if (i3 != 0) {
                    canvas.translate(0.0f, -i3);
                }
            } catch (Throwable th) {
                textAndroidCanvas2.set_nativeCanvas$ui_text(null);
                throw th;
            }
        }
    }

    public static /* synthetic */ void getBottomPadding$ui_text$annotations() {
    }

    public static /* synthetic */ void getLayout$annotations() {
    }

    public static /* synthetic */ void getTopPadding$ui_text$annotations() {
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TextLayout(java.lang.CharSequence r23, float r24, android.text.TextPaint r25, int r26, android.text.TextUtils.TruncateAt r27, int r28, float r29, float r30, boolean r31, boolean r32, int r33, int r34, int r35, int r36, int r37, int r38, int[] r39, int[] r40, androidx.compose.ui.text.android.LayoutIntrinsics r41, int r42, h.g.b.o r43) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], androidx.compose.ui.text.android.LayoutIntrinsics, int, h.g.b.o):void");
    }
}
