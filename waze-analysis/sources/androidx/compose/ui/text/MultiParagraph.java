package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.MuxerUtil;
import h.a.ac;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.an;
import h.g.b.ao;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MultiParagraph {
    public static final int $stable = 8;
    private final boolean didExceedMaxLines;
    private final float height;
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    private final List<ParagraphInfo> paragraphInfoList;
    private final List<Rect> placeholderRects;
    private final float width;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private MultiParagraph(androidx.compose.ui.text.MultiParagraphIntrinsics r20, long r21, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.MultiParagraph.<init>(androidx.compose.ui.text.MultiParagraphIntrinsics, long, int, int):void");
    }

    static final ab fillBoundingBoxes_8ffj60Q$lambda$0(long j2, float[] fArr, ao aoVar, an anVar, ParagraphInfo paragraphInfo) {
        long jTextRange = TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > TextRange.m10544getMinimpl(j2) ? paragraphInfo.getStartIndex() : TextRange.m10544getMinimpl(j2)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < TextRange.m10543getMaximpl(j2) ? paragraphInfo.getEndIndex() : TextRange.m10543getMaximpl(j2)));
        paragraphInfo.getParagraph().mo10360fillBoundingBoxes8ffj60Q(jTextRange, fArr, aoVar.f48103a);
        int iM10542getLengthimpl = aoVar.f48103a + (TextRange.m10542getLengthimpl(jTextRange) * 4);
        for (int i2 = aoVar.f48103a; i2 < iM10542getLengthimpl; i2 += 4) {
            int i3 = i2 + 1;
            float f2 = fArr[i3];
            float f3 = anVar.f48102a;
            fArr[i3] = f2 + f3;
            int i4 = i2 + 3;
            fArr[i4] = fArr[i4] + f3;
        }
        aoVar.f48103a = iM10542getLengthimpl;
        anVar.f48102a += paragraphInfo.getParagraph().getHeight();
        return ab.f48028a;
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    static final ab getPathForRange$lambda$1(Path path, int i2, int i3, ParagraphInfo paragraphInfo) {
        Path pathForRange = paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(i2), paragraphInfo.toLocalIndex(i3));
        paragraphInfo.toGlobal(pathForRange);
        Path.CC.m8542addPathUv8p0NA$default(path, pathForRange, 0L, 2, null);
        return ab.f48028a;
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m10404paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        multiParagraph.m10411paintRPmYEkk(canvas, j2, (i2 & 4) != 0 ? null : shadow, (i2 & 8) != 0 ? null : textDecoration);
    }

    /* renamed from: paint-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m10405painthn5TExg$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        int iM8840getDefaultBlendMode0nO6VwU = (i3 & 64) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2;
        int i4 = i3 & 16;
        int i5 = i3 & 8;
        int i6 = i3 & 4;
        DrawStyle drawStyle2 = (i3 & 32) != 0 ? null : drawStyle;
        TextDecoration textDecoration2 = i4 != 0 ? null : textDecoration;
        Shadow shadow2 = i5 != 0 ? null : shadow;
        if (i6 != 0) {
            f2 = Float.NaN;
        }
        multiParagraph.m10412painthn5TExg(canvas, brush, f2, shadow2, textDecoration2, drawStyle2, iM8840getDefaultBlendMode0nO6VwU);
    }

    private final void requireIndexInRange(int i2) {
        if (i2 < 0 || i2 >= getAnnotatedString().getText().length()) {
            InlineClassHelperKt.throwIllegalArgumentException("offset(" + i2 + ") is out of bounds [0, " + getAnnotatedString().length() + ')');
        }
    }

    private final void requireIndexInRangeInclusiveEnd(int i2) {
        if (i2 < 0 || i2 > getAnnotatedString().getText().length()) {
            InlineClassHelperKt.throwIllegalArgumentException("offset(" + i2 + ") is out of bounds [0, " + getAnnotatedString().length() + ']');
        }
    }

    private final void requireLineIndexInRange(int i2) {
        if (i2 < 0 || i2 >= this.lineCount) {
            InlineClassHelperKt.throwIllegalArgumentException("lineIndex(" + i2 + ") is out of bounds [0, " + this.lineCount + ')');
        }
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final float[] m10406fillBoundingBoxes8ffj60Q(final long j2, final float[] fArr, int i2) {
        requireIndexInRange(TextRange.m10544getMinimpl(j2));
        requireIndexInRangeInclusiveEnd(TextRange.m10543getMaximpl(j2));
        final ao aoVar = new ao();
        aoVar.f48103a = i2;
        final an anVar = new an();
        MultiParagraphKt.m10413findParagraphsByRangeSbBc2M(this.paragraphInfoList, j2, new l() { // from class: androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return MultiParagraph.fillBoundingBoxes_8ffj60Q$lambda$0(j2, fArr, aoVar, anVar, (ParagraphInfo) obj);
            }
        });
        return fArr;
    }

    public final ResolvedTextDirection getBidiRunDirection(int i2) {
        int iFindParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i2);
        int length = getAnnotatedString().length();
        List<ParagraphInfo> list = this.paragraphInfoList;
        if (i2 == length) {
            x.f(list, "<this>");
            iFindParagraphByIndex = list.size() - 1;
        } else {
            iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(list, i2);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(i2));
    }

    public final Rect getBoundingBox(int i2) {
        requireIndexInRange(i2);
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = list.get(MultiParagraphKt.findParagraphByIndex(list, i2));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(i2)));
    }

    public final Rect getCursorRect(int i2) {
        int iFindParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i2);
        int length = getAnnotatedString().length();
        List<ParagraphInfo> list = this.paragraphInfoList;
        if (i2 == length) {
            x.f(list, "<this>");
            iFindParagraphByIndex = list.size() - 1;
        } else {
            iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(list, i2);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(i2)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHorizontalPosition(int i2, boolean z) {
        int iFindParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i2);
        int length = getAnnotatedString().length();
        List<ParagraphInfo> list = this.paragraphInfoList;
        if (i2 == length) {
            x.f(list, "<this>");
            iFindParagraphByIndex = list.size() - 1;
        } else {
            iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(list, i2);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(i2), z);
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) i.T(this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final float getLineBaseline(int i2) {
        requireLineIndexInRange(i2);
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = list.get(MultiParagraphKt.findParagraphByLineIndex(list, i2));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBaseline(paragraphInfo.toLocalLineIndex(i2)));
    }

    public final float getLineBottom(int i2) {
        requireLineIndexInRange(i2);
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = list.get(MultiParagraphKt.findParagraphByLineIndex(list, i2));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(i2)));
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEnd(int i2, boolean z) {
        requireLineIndexInRange(i2);
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = list.get(MultiParagraphKt.findParagraphByLineIndex(list, i2));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(i2), z));
    }

    public final int getLineForOffset(int i2) {
        int iFindParagraphByIndex;
        if (i2 >= getAnnotatedString().length()) {
            List<ParagraphInfo> list = this.paragraphInfoList;
            x.f(list, "<this>");
            iFindParagraphByIndex = list.size() - 1;
        } else {
            iFindParagraphByIndex = i2 < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(i2)));
    }

    public final int getLineForVerticalPosition(float f2) {
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = list.get(MultiParagraphKt.findParagraphByY(list, f2));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartLineIndex() : paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(f2)));
    }

    public final float getLineHeight(int i2) {
        requireLineIndexInRange(i2);
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = list.get(MultiParagraphKt.findParagraphByLineIndex(list, i2));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(i2));
    }

    public final float getLineLeft(int i2) {
        requireLineIndexInRange(i2);
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = list.get(MultiParagraphKt.findParagraphByLineIndex(list, i2));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(i2));
    }

    public final float getLineRight(int i2) {
        requireLineIndexInRange(i2);
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = list.get(MultiParagraphKt.findParagraphByLineIndex(list, i2));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(i2));
    }

    public final int getLineStart(int i2) {
        requireLineIndexInRange(i2);
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = list.get(MultiParagraphKt.findParagraphByLineIndex(list, i2));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(i2)));
    }

    public final float getLineTop(int i2) {
        requireLineIndexInRange(i2);
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = list.get(MultiParagraphKt.findParagraphByLineIndex(list, i2));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(i2)));
    }

    public final float getLineWidth(int i2) {
        requireLineIndexInRange(i2);
        List<ParagraphInfo> list = this.paragraphInfoList;
        ParagraphInfo paragraphInfo = list.get(MultiParagraphKt.findParagraphByLineIndex(list, i2));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(i2));
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMinIntrinsicWidth();
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m10407getOffsetForPositionk4lQ0M(long j2) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2))));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartIndex() : paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo10362getOffsetForPositionk4lQ0M(paragraphInfo.m10422toLocalMKHz9U(j2)));
    }

    public final ResolvedTextDirection getParagraphDirection(int i2) {
        int iFindParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i2);
        int length = getAnnotatedString().length();
        List<ParagraphInfo> list = this.paragraphInfoList;
        if (i2 == length) {
            x.f(list, "<this>");
            iFindParagraphByIndex = list.size() - 1;
        } else {
            iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(list, i2);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(i2));
    }

    public final List<ParagraphInfo> getParagraphInfoList$ui_text() {
        return this.paragraphInfoList;
    }

    public final Path getPathForRange(final int i2, final int i3) {
        if (i2 < 0 || i2 > i3 || i3 > getAnnotatedString().getText().length()) {
            InlineClassHelperKt.throwIllegalArgumentException("Start(" + i2 + ") or End(" + i3 + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!");
        }
        if (i2 == i3) {
            return AndroidPath_androidKt.Path();
        }
        List<ParagraphInfo> list = this.paragraphInfoList;
        final Path Path = AndroidPath_androidKt.Path();
        MultiParagraphKt.m10413findParagraphsByRangeSbBc2M(list, TextRangeKt.TextRange(i2, i3), new l() { // from class: androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return MultiParagraph.getPathForRange$lambda$1(Path, i2, i3, (ParagraphInfo) obj);
            }
        });
        return Path;
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long m10408getRangeForRect86BmAI(Rect rect, int i2, TextInclusionStrategy textInclusionStrategy) {
        int iFindParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(iFindParagraphByY).getBottom() < rect.getBottom()) {
            x.f(this.paragraphInfoList, "<this>");
            if (iFindParagraphByY != r1.size() - 1) {
                int iFindParagraphByY2 = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getBottom());
                long jM10551getZerod9O1mEE = TextRange.Companion.m10551getZerod9O1mEE();
                while (TextRange.m10539equalsimpl0(jM10551getZerod9O1mEE, TextRange.Companion.m10551getZerod9O1mEE()) && iFindParagraphByY <= iFindParagraphByY2) {
                    ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByY);
                    jM10551getZerod9O1mEE = paragraphInfo.m10421toGlobalxdX6G0(paragraphInfo.getParagraph().mo10364getRangeForRect86BmAI(paragraphInfo.toLocal(rect), i2, textInclusionStrategy), 1 == ((false ? 1 : 0) | (1 & 1)));
                    iFindParagraphByY++;
                }
                if (TextRange.m10539equalsimpl0(jM10551getZerod9O1mEE, TextRange.Companion.m10551getZerod9O1mEE())) {
                    return TextRange.Companion.m10551getZerod9O1mEE();
                }
                long jM10551getZerod9O1mEE2 = TextRange.Companion.m10551getZerod9O1mEE();
                while (TextRange.m10539equalsimpl0(jM10551getZerod9O1mEE2, TextRange.Companion.m10551getZerod9O1mEE()) && iFindParagraphByY <= iFindParagraphByY2) {
                    ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(iFindParagraphByY2);
                    jM10551getZerod9O1mEE2 = paragraphInfo2.m10421toGlobalxdX6G0(paragraphInfo2.getParagraph().mo10364getRangeForRect86BmAI(paragraphInfo2.toLocal(rect), i2, textInclusionStrategy), 1 == ((false ? 1 : 0) | (1 & 1)));
                    iFindParagraphByY2--;
                }
                return TextRange.m10539equalsimpl0(jM10551getZerod9O1mEE2, TextRange.Companion.m10551getZerod9O1mEE()) ? jM10551getZerod9O1mEE : TextRangeKt.TextRange(TextRange.m10546getStartimpl(jM10551getZerod9O1mEE), TextRange.m10541getEndimpl(jM10551getZerod9O1mEE2));
            }
        }
        ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(iFindParagraphByY);
        return paragraphInfo3.m10421toGlobalxdX6G0(paragraphInfo3.getParagraph().mo10364getRangeForRect86BmAI(paragraphInfo3.toLocal(rect), i2, textInclusionStrategy), 1 == ((false ? 1 : 0) | (1 & 1)));
    }

    public final float getWidth() {
        return this.width;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m10409getWordBoundaryjx7JFs(int i2) {
        int iFindParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i2);
        int length = getAnnotatedString().length();
        List<ParagraphInfo> list = this.paragraphInfoList;
        if (i2 == length) {
            x.f(list, "<this>");
            iFindParagraphByIndex = list.size() - 1;
        } else {
            iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(list, i2);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
        return paragraphInfo.m10421toGlobalxdX6G0(paragraphInfo.getParagraph().mo10365getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(i2)), false);
    }

    public final boolean isLineEllipsized(int i2) {
        requireLineIndexInRange(i2);
        List<ParagraphInfo> list = this.paragraphInfoList;
        return list.get(MultiParagraphKt.findParagraphByLineIndex(list, i2)).getParagraph().isLineEllipsized(i2);
    }

    /* renamed from: paint-LG529CI, reason: not valid java name */
    public final void m10410paintLG529CI(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ParagraphInfo paragraphInfo = list.get(i3);
            paragraphInfo.getParagraph().mo10366paintLG529CI(canvas, j2, shadow, textDecoration, drawStyle, i2);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m10411paintRPmYEkk(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ParagraphInfo paragraphInfo = list.get(i2);
            Paragraph.CC.m10414paintLG529CI$default(paragraphInfo.getParagraph(), canvas, j2, shadow, textDecoration, null, 0, 48, null);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m10412painthn5TExg(Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        AndroidMultiParagraphDraw_androidKt.m10836drawMultiParagraph7AXcY_I(this, canvas, brush, f2, shadow, textDecoration, drawStyle, i2);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, List list, int i2, boolean z, o oVar) {
        this(annotatedString, textStyle, j2, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i2, z);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i2, int i3, o oVar) {
        this(multiParagraphIntrinsics, j2, i2, i3);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i2, boolean z, o oVar) {
        this(multiParagraphIntrinsics, j2, i2, z);
    }

    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f2, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z) {
        int iM11068getClipgIe3tQ8;
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        if (z) {
            iM11068getClipgIe3tQ8 = TextOverflow.Companion.m11069getEllipsisgIe3tQ8();
        } else {
            iM11068getClipgIe3tQ8 = TextOverflow.Companion.m11068getClipgIe3tQ8();
        }
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f2), 0, 0, 13, null), i2, iM11068getClipgIe3tQ8, (o) null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z) {
        int iM11068getClipgIe3tQ8;
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        if (z) {
            iM11068getClipgIe3tQ8 = TextOverflow.Companion.m11069getEllipsisgIe3tQ8();
        } else {
            iM11068getClipgIe3tQ8 = TextOverflow.Companion.m11068getClipgIe3tQ8();
        }
        this(multiParagraphIntrinsics, j2, i2, iM11068getClipgIe3tQ8, (o) null);
    }

    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z, float f2, Density density, Font.ResourceLoader resourceLoader) {
        int iM11068getClipgIe3tQ8;
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
        if (z) {
            iM11068getClipgIe3tQ8 = TextOverflow.Companion.m11069getEllipsisgIe3tQ8();
        } else {
            iM11068getClipgIe3tQ8 = TextOverflow.Companion.m11068getClipgIe3tQ8();
        }
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f2), 0, 0, 13, null), i2, iM11068getClipgIe3tQ8, (o) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i2, boolean z) {
        int iM11068getClipgIe3tQ8;
        if (z) {
            iM11068getClipgIe3tQ8 = TextOverflow.Companion.m11069getEllipsisgIe3tQ8();
        } else {
            iM11068getClipgIe3tQ8 = TextOverflow.Companion.m11068getClipgIe3tQ8();
        }
        this(multiParagraphIntrinsics, j2, i2, iM11068getClipgIe3tQ8, (o) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i2, boolean z, int i3, o oVar) {
        this(multiParagraphIntrinsics, j2, (i3 & 4) != 0 ? Integer.MAX_VALUE : i2, ((i3 & 8) == 0) & z, (o) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, List list, int i2, boolean z, int i3, o oVar) {
        this(annotatedString, textStyle, j2, density, resolver, (i3 & 32) != 0 ? ac.f47967a : list, (i3 & 64) != 0 ? Integer.MAX_VALUE : i2, ((i3 & 128) == 0) & z, (o) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f2, Density density, FontFamily.Resolver resolver, List list, int i2, boolean z, int i3, o oVar) {
        this(annotatedString, textStyle, f2, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i3 & 32) != 0 ? ac.f47967a : list), (i3 & 64) != 0 ? Integer.MAX_VALUE : i2, ((i3 & 128) == 0) & z);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, ac acVar, int i2, boolean z, float f2, Density density, Font.ResourceLoader resourceLoader, int i3, o oVar) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) ((i3 & 4) != 0 ? ac.f47967a : acVar), (i3 & 8) != 0 ? Integer.MAX_VALUE : i2, ((i3 & 16) == 0) & z, f2, density, resourceLoader);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i2, int i3) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j2, i2, i3, (o) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i2, boolean z, float f2) {
        int iM11068getClipgIe3tQ8;
        long jConstraints$default = ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f2), 0, 0, 13, null);
        if (z) {
            iM11068getClipgIe3tQ8 = TextOverflow.Companion.m11069getEllipsisgIe3tQ8();
        } else {
            iM11068getClipgIe3tQ8 = TextOverflow.Companion.m11068getClipgIe3tQ8();
        }
        this(multiParagraphIntrinsics, jConstraints$default, i2, iM11068getClipgIe3tQ8, (o) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, List list, int i2, int i3, int i4, o oVar) {
        this(annotatedString, textStyle, j2, density, resolver, (i4 & 32) != 0 ? ac.f47967a : list, (i4 & 64) != 0 ? Integer.MAX_VALUE : i2, (i4 & 128) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : i3, (o) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i2, boolean z, float f2, int i3, o oVar) {
        this(multiParagraphIntrinsics, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2, z & ((i3 & 4) == 0), f2);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, List list, int i2, int i3, o oVar) {
        this(annotatedString, textStyle, j2, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i2, i3);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j2, int i2, int i3, int i4, o oVar) {
        this(multiParagraphIntrinsics, j2, (i4 & 4) != 0 ? Integer.MAX_VALUE : i2, (i4 & 8) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : i3, (o) null);
    }
}
