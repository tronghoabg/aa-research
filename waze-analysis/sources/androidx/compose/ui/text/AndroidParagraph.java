package androidx.compose.ui.text;

import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary_androidKt;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidParagraph implements Paragraph {
    public static final int $stable = 8;
    private final CharSequence charSequence;
    private final long constraints;
    private final TextLayout layout;
    private final int maxLines;
    private final int overflow;
    private final AndroidParagraphIntrinsics paragraphIntrinsics;
    private final List<Rect> placeholderRects;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0283 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e5  */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private AndroidParagraph(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics r19, int r20, int r21, long r22) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AndroidParagraph.<init>(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics, int, int, long):void");
    }

    private final TextLayout constructTextLayout(int i2, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, int i6, int i7, int i8, CharSequence charSequence) {
        AndroidParagraphIntrinsics androidParagraphIntrinsics = this.paragraphIntrinsics;
        float width = getWidth();
        AndroidTextPaint textPaint$ui_text = getTextPaint$ui_text();
        return new TextLayout(charSequence, width, textPaint$ui_text, i2, truncateAt, androidParagraphIntrinsics.getTextDirectionHeuristic$ui_text(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(androidParagraphIntrinsics.getStyle()), true, i4, i6, i7, i8, i5, i3, null, null, androidParagraphIntrinsics.getLayoutIntrinsics$ui_text(), 196736, null);
    }

    static /* synthetic */ TextLayout constructTextLayout$default(AndroidParagraph androidParagraph, int i2, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, int i6, int i7, int i8, CharSequence charSequence, int i9, Object obj) {
        return androidParagraph.constructTextLayout(i2, i3, truncateAt, i4, i5, i6, i7, i8, (i9 & 256) != 0 ? androidParagraph.charSequence : charSequence);
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = textLayout.getText();
        x.d(text, "null cannot be cast to non-null type android.text.Spanned");
        if (!hasSpan((Spanned) text, ShaderBrushSpan.class)) {
            return null;
        }
        CharSequence text2 = textLayout.getText();
        x.d(text2, "null cannot be cast to non-null type android.text.Spanned");
        return (ShaderBrushSpan[]) ((Spanned) text2).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
    }

    private final boolean hasSpan(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    private final void paint(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public void mo10360fillBoundingBoxes8ffj60Q(long j2, float[] fArr, int i2) {
        this.layout.fillBoundingBoxes(TextRange.m10544getMinimpl(j2), TextRange.m10543getMaximpl(j2), fArr, i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getBidiRunDirection(int i2) {
        return this.layout.isRtlCharAt(i2) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getBoundingBox(int i2) {
        if (i2 < 0 || i2 >= this.charSequence.length()) {
            InlineClassHelperKt.throwIllegalArgumentException("offset(" + i2 + ") is out of bounds [0," + this.charSequence.length() + ')');
        }
        RectF boundingBox = this.layout.getBoundingBox(i2);
        return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
    }

    public final CharSequence getCharSequence$ui_text() {
        return this.charSequence;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m10361getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getCursorRect(int i2) {
        if (i2 < 0 || i2 > this.charSequence.length()) {
            InlineClassHelperKt.throwIllegalArgumentException("offset(" + i2 + ") is out of bounds [0," + this.charSequence.length() + ']');
        }
        float primaryHorizontal = this.layout.getPrimaryHorizontal(i2, false & ((2 & 2) == 0));
        TextLayout textLayout = this.layout;
        int lineForOffset = textLayout.getLineForOffset(i2);
        return new Rect(primaryHorizontal, textLayout.getLineTop(lineForOffset), primaryHorizontal, this.layout.getLineBottom(lineForOffset));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int i2, boolean z) {
        TextLayout textLayout = this.layout;
        return z ? textLayout.getPrimaryHorizontal(i2, false & ((2 & 2) == 0)) : textLayout.getSecondaryHorizontal(i2, false & ((2 & 2) == 0));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        return getLineBaseline(getLineCount() - 1);
    }

    public final float getLineAscent$ui_text(int i2) {
        return this.layout.getLineAscent(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBaseline(int i2) {
        return this.layout.getLineBaseline(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int i2) {
        return this.layout.getLineBottom(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public final float getLineDescent$ui_text(int i2) {
        return this.layout.getLineDescent(i2);
    }

    public final int getLineEllipsisCount$ui_text(int i2) {
        return this.layout.getLineEllipsisCount(i2);
    }

    public final int getLineEllipsisOffset$ui_text(int i2) {
        return this.layout.getLineEllipsisOffset(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int i2, boolean z) {
        TextLayout textLayout = this.layout;
        return z ? textLayout.getLineVisibleEnd(i2) : textLayout.getLineEnd(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int i2) {
        return this.layout.getLineForOffset(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float f2) {
        return this.layout.getLineForVertical((int) f2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineHeight(int i2) {
        return this.layout.getLineHeight(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int i2) {
        return this.layout.getLineLeft(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineRight(int i2) {
        return this.layout.getLineRight(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineStart(int i2) {
        return this.layout.getLineStart(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineTop(int i2) {
        return this.layout.getLineTop(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineWidth(int i2) {
        return this.layout.getLineWidth(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public int mo10362getOffsetForPositionk4lQ0M(long j2) {
        int lineForVerticalUnbounded = this.layout.getLineForVerticalUnbounded((int) Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)));
        int lineCount = getLineCount();
        TextLayout textLayout = this.layout;
        return lineForVerticalUnbounded >= lineCount ? textLayout.getText().length() : textLayout.getOffsetForHorizontal(lineForVerticalUnbounded, Float.intBitsToFloat((int) (j2 >> 32)));
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m10363getOverflowgIe3tQ8() {
        return this.overflow;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getParagraphDirection(int i2) {
        TextLayout textLayout = this.layout;
        return textLayout.getParagraphDirection(textLayout.getLineForOffset(i2)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Path getPathForRange(int i2, int i3) {
        if (i2 < 0 || i2 > i3 || i3 > this.charSequence.length()) {
            InlineClassHelperKt.throwIllegalArgumentException("start(" + i2 + ") or end(" + i3 + ") is out of range [0.." + this.charSequence.length() + "], or start > end!");
        }
        android.graphics.Path path = new android.graphics.Path();
        this.layout.getSelectionPath(i2, i3, path);
        return AndroidPath_androidKt.asComposePath(path);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public long mo10364getRangeForRect86BmAI(Rect rect, int i2, final TextInclusionStrategy textInclusionStrategy) {
        int[] rangeForRect = this.layout.getRangeForRect(RectHelper_androidKt.toAndroidRectF(rect), AndroidParagraph_androidKt.m10380toLayoutTextGranularityduNsdkg(i2), new p() { // from class: androidx.compose.ui.text.AndroidParagraph$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(textInclusionStrategy.isIncluded(RectHelper_androidKt.toComposeRect((RectF) obj), RectHelper_androidKt.toComposeRect((RectF) obj2)));
            }
        });
        return rangeForRect == null ? TextRange.Companion.m10551getZerod9O1mEE() : TextRangeKt.TextRange(rangeForRect[0], rangeForRect[1]);
    }

    public final Locale getTextLocale$ui_text() {
        return this.paragraphIntrinsics.getTextPaint$ui_text().getTextLocale();
    }

    public final AndroidTextPaint getTextPaint$ui_text() {
        return this.paragraphIntrinsics.getTextPaint$ui_text();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return Constraints.m11107getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public long mo10365getWordBoundaryjx7JFs(int i2) {
        WordIterator wordIterator = this.layout.getWordIterator();
        return TextRangeKt.TextRange(WordBoundary_androidKt.getWordStart(wordIterator, i2), WordBoundary_androidKt.getWordEnd(wordIterator, i2));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean isLineEllipsized(int i2) {
        return this.layout.isLineEllipsized(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-LG529CI, reason: not valid java name */
    public void mo10366paintLG529CI(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        int iM10845getBlendMode0nO6VwU = getTextPaint$ui_text().m10845getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text = getTextPaint$ui_text();
        textPaint$ui_text.m10850setColor8_81llA(j2);
        textPaint$ui_text.setShadow(shadow);
        textPaint$ui_text.setTextDecoration(textDecoration);
        textPaint$ui_text.setDrawStyle(drawStyle);
        textPaint$ui_text.m10847setBlendModes9anfk8(i2);
        paint(canvas);
        getTextPaint$ui_text().m10847setBlendModes9anfk8(iM10845getBlendMode0nO6VwU);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public void mo10367paintRPmYEkk(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration) {
        AndroidTextPaint textPaint$ui_text = getTextPaint$ui_text();
        textPaint$ui_text.m10850setColor8_81llA(j2);
        textPaint$ui_text.setShadow(shadow);
        textPaint$ui_text.setTextDecoration(textDecoration);
        paint(canvas);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public void mo10368painthn5TExg(Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        int iM10845getBlendMode0nO6VwU = getTextPaint$ui_text().m10845getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text = getTextPaint$ui_text();
        float width = getWidth();
        float height = getHeight();
        textPaint$ui_text.m10848setBrush12SF9DM(brush, (Float.floatToRawIntBits(height) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(width) << 32), f2);
        textPaint$ui_text.setShadow(shadow);
        textPaint$ui_text.setTextDecoration(textDecoration);
        textPaint$ui_text.setDrawStyle(drawStyle);
        textPaint$ui_text.m10847setBlendModes9anfk8(i2);
        paint(canvas);
        getTextPaint$ui_text().m10847setBlendModes9anfk8(iM10845getBlendMode0nO6VwU);
    }

    public static /* synthetic */ void getCharSequence$ui_text$annotations() {
    }

    public static /* synthetic */ void getTextLocale$ui_text$annotations() {
    }

    public static /* synthetic */ void getTextPaint$ui_text$annotations() {
    }

    public /* synthetic */ AndroidParagraph(String str, TextStyle textStyle, List list, List list2, int i2, int i3, long j2, FontFamily.Resolver resolver, Density density, o oVar) {
        this(str, textStyle, list, list2, i2, i3, j2, resolver, density);
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i2, int i3, long j2, o oVar) {
        this(androidParagraphIntrinsics, i2, i3, j2);
    }

    private AndroidParagraph(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, int i2, int i3, long j2, FontFamily.Resolver resolver, Density density) {
        this(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i2, i3, j2, null);
    }
}
