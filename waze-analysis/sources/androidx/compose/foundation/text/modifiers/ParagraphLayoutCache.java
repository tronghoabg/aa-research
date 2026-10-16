package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.a.ac;
import h.ab;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ParagraphLayoutCache {
    public static final int $stable = 8;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private boolean didOverflow;
    private FontFamily.Resolver fontFamilyResolver;
    private long historyFlag;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private long layoutSize;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private Paragraph paragraph;
    private ParagraphIntrinsics paragraphIntrinsics;
    private long prevConstraints;
    private boolean softWrap;
    private TextStyle style;
    private String text;

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4, int i5, o oVar) {
        this(str, textStyle, resolver, (i5 & 8) != 0 ? TextOverflow.Companion.m11068getClipgIe3tQ8() : i2, (!((i5 & 16) == 0)) | z, (i5 & 32) != 0 ? Integer.MAX_VALUE : i3, (i5 & 64) != 0 ? 1 : i4, null);
    }

    private final void markDirty() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = Constraints.Companion.m11117fixedJhjzzOo(0, 0);
        this.layoutSize = 0L;
        this.didOverflow = false;
    }

    /* renamed from: newLayoutWillBeDifferent-K40F9xA, reason: not valid java name */
    private final boolean m3814newLayoutWillBeDifferentK40F9xA(long j2, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        Paragraph paragraph = this.paragraph;
        if (paragraph == null || (paragraphIntrinsics = this.paragraphIntrinsics) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        long j3 = this.prevConstraints;
        if (Constraints.m11100equalsimpl0(j2, j3)) {
            return false;
        }
        if (Constraints.m11107getMaxWidthimpl(j2) == Constraints.m11107getMaxWidthimpl(j3) && Constraints.m11109getMinWidthimpl(j2) == Constraints.m11109getMinWidthimpl(j3)) {
            return ((float) Constraints.m11106getMaxHeightimpl(j2)) < paragraph.getHeight() || paragraph.getDidExceedMaxLines();
        }
        return true;
    }

    /* renamed from: recordHistory-4ETZmGE, reason: not valid java name */
    private final void m3815recordHistory4ETZmGE(long j2) {
        this.historyFlag = j2 | (this.historyFlag << 2);
    }

    private final ParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        ParagraphIntrinsics ParagraphIntrinsics = this.paragraphIntrinsics;
        if (ParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || ParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.style, layoutDirection);
            ac acVar = ac.f47967a;
            Density density = this.density;
            if (density == null) {
                x.g();
            }
            ParagraphIntrinsics = ParagraphIntrinsicsKt.ParagraphIntrinsics(str, textStyleResolveDefaults, acVar, density, this.fontFamilyResolver, acVar);
        }
        this.paragraphIntrinsics = ParagraphIntrinsics;
        return ParagraphIntrinsics;
    }

    /* renamed from: useMinLinesConstrainer-euUD3Qg, reason: not valid java name */
    private final long m3816useMinLinesConstrainereuUD3Qg(long j2, LayoutDirection layoutDirection, TextStyle textStyle) {
        MinLinesConstrainer.Companion companion = MinLinesConstrainer.Companion;
        MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
        Density density = this.density;
        if (density == null) {
            x.g();
        }
        MinLinesConstrainer minLinesConstrainerFrom = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
        this.mMinLinesConstrainer = minLinesConstrainerFrom;
        return minLinesConstrainerFrom.m3799coerceMinLinesOh53vG4$foundation(j2, this.minLines);
    }

    /* renamed from: useMinLinesConstrainer-euUD3Qg$default, reason: not valid java name */
    static /* synthetic */ long m3817useMinLinesConstrainereuUD3Qg$default(ParagraphLayoutCache paragraphLayoutCache, long j2, LayoutDirection layoutDirection, TextStyle textStyle, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            textStyle = paragraphLayoutCache.style;
        }
        return paragraphLayoutCache.m3816useMinLinesConstrainereuUD3Qg(j2, layoutDirection, textStyle);
    }

    public final Density getDensity$foundation() {
        return this.density;
    }

    public final boolean getDidOverflow$foundation() {
        return this.didOverflow;
    }

    public final long getHistoryFlag$foundation() {
        return this.historyFlag;
    }

    /* renamed from: getLayoutSize-YbymL2g$foundation, reason: not valid java name */
    public final long m3818getLayoutSizeYbymL2g$foundation() {
        return this.layoutSize;
    }

    public final ab getObserveFontChanges$foundation() {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return ab.f48028a;
    }

    public final Paragraph getParagraph$foundation() {
        return this.paragraph;
    }

    public final int intrinsicHeight(int i2, LayoutDirection layoutDirection) {
        ParagraphLayoutCache paragraphLayoutCache;
        LayoutDirection layoutDirection2;
        int i3 = this.cachedIntrinsicHeightInputWidth;
        int i4 = this.cachedIntrinsicHeight;
        if (i2 == i3 && i3 != -1) {
            return i4;
        }
        long jConstraints = ConstraintsKt.Constraints(0, i2, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
            jConstraints = m3817useMinLinesConstrainereuUD3Qg$default(paragraphLayoutCache, jConstraints, layoutDirection2, null, 4, null);
        } else {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
        }
        int iCeilToIntPx = TextDelegateKt.ceilToIntPx(paragraphLayoutCache.m3819layoutTextK40F9xA$foundation(jConstraints, layoutDirection2).getHeight());
        int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(jConstraints);
        if (iCeilToIntPx < iM11108getMinHeightimpl) {
            iCeilToIntPx = iM11108getMinHeightimpl;
        }
        paragraphLayoutCache.cachedIntrinsicHeightInputWidth = i2;
        paragraphLayoutCache.cachedIntrinsicHeight = iCeilToIntPx;
        return iCeilToIntPx;
    }

    /* renamed from: layoutText-K40F9xA$foundation, reason: not valid java name */
    public final Paragraph m3819layoutTextK40F9xA$foundation(long j2, LayoutDirection layoutDirection) {
        ParagraphIntrinsics layoutDirection2 = setLayoutDirection(layoutDirection);
        return ParagraphKt.m10429ParagraphczeNHc(layoutDirection2, LayoutUtilsKt.m3795finalConstraintstfFHcEY(j2, this.softWrap, this.overflow, layoutDirection2.getMaxIntrinsicWidth()), LayoutUtilsKt.m3796finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), this.overflow);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3820layoutWithConstraintsK40F9xA(long r10, androidx.compose.ui.unit.LayoutDirection r12) {
        /*
            r9 = this;
            androidx.compose.foundation.text.modifiers.LayoutCacheOperation$Companion r0 = androidx.compose.foundation.text.modifiers.LayoutCacheOperation.Companion
            long r0 = r0.m3791getLayoutWithConstraintsDEKiAbY()
            r9.m3815recordHistory4ETZmGE(r0)
            int r0 = r9.minLines
            r1 = 1
            if (r0 <= r1) goto L19
            r7 = 4
            r8 = 0
            r6 = 0
            r2 = r9
            r3 = r10
            r5 = r12
            long r10 = m3817useMinLinesConstrainereuUD3Qg$default(r2, r3, r5, r6, r7, r8)
            goto L1c
        L19:
            r2 = r9
            r3 = r10
            r5 = r12
        L1c:
            boolean r9 = r2.m3814newLayoutWillBeDifferentK40F9xA(r10, r5)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r12 = 32
            r0 = 0
            if (r9 != 0) goto L88
            long r5 = r2.prevConstraints
            boolean r9 = androidx.compose.ui.unit.Constraints.m11100equalsimpl0(r10, r5)
            if (r9 != 0) goto L87
            androidx.compose.ui.text.Paragraph r9 = r2.paragraph
            if (r9 != 0) goto L39
            h.g.b.x.g()
        L39:
            float r5 = r9.getMaxIntrinsicWidth()
            float r6 = r9.getWidth()
            float r5 = java.lang.Math.min(r5, r6)
            int r5 = androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(r5)
            float r6 = r9.getHeight()
            int r6 = androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(r6)
            long r7 = (long) r5
            long r7 = r7 << r12
            long r5 = (long) r6
            long r5 = r5 & r3
            long r5 = r5 | r7
            long r5 = androidx.compose.ui.unit.ConstraintsKt.m11121constrain4WqzIAM(r10, r5)
            r2.layoutSize = r5
            int r7 = r2.overflow
            androidx.compose.ui.text.style.TextOverflow$Companion r8 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r8 = r8.m11072getVisiblegIe3tQ8()
            boolean r7 = androidx.compose.ui.text.style.TextOverflow.m11059equalsimpl0(r7, r8)
            if (r7 != 0) goto L82
            long r7 = r5 >> r12
            float r12 = r9.getWidth()
            int r7 = (int) r7
            float r7 = (float) r7
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 < 0) goto L83
            long r3 = r3 & r5
            float r9 = r9.getHeight()
            int r12 = (int) r3
            float r12 = (float) r12
            int r9 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r9 >= 0) goto L82
            goto L83
        L82:
            r1 = r0
        L83:
            r2.didOverflow = r1
            r2.prevConstraints = r10
        L87:
            return r0
        L88:
            androidx.compose.ui.text.Paragraph r9 = r2.m3819layoutTextK40F9xA$foundation(r10, r5)
            r2.prevConstraints = r10
            float r5 = r9.getWidth()
            int r5 = androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(r5)
            float r6 = r9.getHeight()
            int r6 = androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(r6)
            long r7 = (long) r5
            long r7 = r7 << r12
            long r5 = (long) r6
            long r5 = r5 & r3
            long r5 = r5 | r7
            long r10 = androidx.compose.ui.unit.ConstraintsKt.m11121constrain4WqzIAM(r10, r5)
            r2.layoutSize = r10
            int r5 = r2.overflow
            androidx.compose.ui.text.style.TextOverflow$Companion r6 = androidx.compose.ui.text.style.TextOverflow.Companion
            int r6 = r6.m11072getVisiblegIe3tQ8()
            boolean r5 = androidx.compose.ui.text.style.TextOverflow.m11059equalsimpl0(r5, r6)
            if (r5 != 0) goto Lcf
            long r5 = r10 >> r12
            float r12 = r9.getWidth()
            int r5 = (int) r5
            float r5 = (float) r5
            int r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r12 < 0) goto Lce
            long r10 = r10 & r3
            float r12 = r9.getHeight()
            int r10 = (int) r10
            float r10 = (float) r10
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto Lcf
        Lce:
            r0 = r1
        Lcf:
            r2.didOverflow = r0
            r2.paragraph = r9
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.ParagraphLayoutCache.m3820layoutWithConstraintsK40F9xA(long, androidx.compose.ui.unit.LayoutDirection):boolean");
    }

    public final int maxIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation(Density density) {
        Density density2 = this.density;
        long jM3775constructorimpl = density != null ? InlineDensity.m3775constructorimpl(density) : InlineDensity.Companion.m3783getUnspecifiedL26CHvs();
        if (density2 == null) {
            this.density = density;
            this.lastDensity = jM3775constructorimpl;
        } else if (density == null || !InlineDensity.m3777equalsimpl0(this.lastDensity, jM3775constructorimpl)) {
            this.density = density;
            this.lastDensity = jM3775constructorimpl;
            m3815recordHistory4ETZmGE(LayoutCacheOperation.Companion.m3792getMarkDirtyDensityDEKiAbY());
            markDirty();
        }
    }

    public final void setDidOverflow$foundation(boolean z) {
        this.didOverflow = z;
    }

    public final void setHistoryFlag$foundation(long j2) {
        this.historyFlag = j2;
    }

    /* renamed from: setLayoutSize-ozmzZPI$foundation, reason: not valid java name */
    public final void m3821setLayoutSizeozmzZPI$foundation(long j2) {
        this.layoutSize = j2;
    }

    public final void setParagraph$foundation(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    public final TextLayoutResult slowCreateTextLayoutResultOrNull(TextStyle textStyle) {
        Density density;
        LayoutDirection layoutDirection = this.intrinsicsLayoutDirection;
        if (layoutDirection != null && (density = this.density) != null) {
            AnnotatedString annotatedString = new AnnotatedString(this.text, null, 2, null);
            if (this.paragraph != null && this.paragraphIntrinsics != null) {
                long j2 = this.prevConstraints & ConstraintsKt.MaxDimensionsAndFocusMask;
                ac acVar = ac.f47967a;
                return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, acVar, this.maxLines, this.softWrap, this.overflow, density, layoutDirection, this.fontFamilyResolver, j2, (o) null), new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, textStyle, acVar, density, this.fontFamilyResolver), j2, this.maxLines, this.overflow, (o) null), this.layoutSize, null);
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.paragraph != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) InlineDensity.m3781toStringimpl(this.lastDensity));
        sb.append(", history=");
        sb.append(this.historyFlag);
        sb.append(", constraints=$)");
        return sb.toString();
    }

    /* renamed from: update-L6sJoHM, reason: not valid java name */
    public final void m3822updateL6sJoHM(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i2;
        this.softWrap = z;
        this.maxLines = i3;
        this.minLines = i4;
        m3815recordHistory4ETZmGE(LayoutCacheOperation.Companion.m3793getMarkDirtyNodeDEKiAbY());
        markDirty();
    }

    public static /* synthetic */ void getHistoryFlag$foundation$annotations() {
    }

    private ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i2;
        this.softWrap = z;
        this.maxLines = i3;
        this.minLines = i4;
        this.lastDensity = InlineDensity.Companion.m3783getUnspecifiedL26CHvs();
        this.layoutSize = 0L;
        this.prevConstraints = Constraints.Companion.m11117fixedJhjzzOo(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z, int i3, int i4, o oVar) {
        this(str, textStyle, resolver, i2, z, i3, i4);
    }
}
