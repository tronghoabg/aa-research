package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextPainterKt {
    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.getHasVisualOverflow() || TextOverflow.m11059equalsimpl0(textLayoutResult.getLayoutInput().m10513getOverflowgIe3tQ8(), TextOverflow.Companion.m11072getVisiblegIe3tQ8())) {
            return;
        }
        DrawTransform.CC.m8896clipRectN_I0leg$default(drawTransform, 0.0f, 0.0f, (int) (textLayoutResult.m10517getSizeYbymL2g() >> 32), (int) (textLayoutResult.m10517getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE), 0, 16, null);
    }

    /* renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m10525drawTextJFhB2K4(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j2, TextStyle textStyle, int i2, boolean z, int i3, List<AnnotatedString.Range<Placeholder>> list, long j3, int i4) {
        TextLayoutResult textLayoutResultM10520measurexDpz5zY$default = TextMeasurer.m10520measurexDpz5zY$default(textMeasurer, annotatedString, textStyle, i2, z, i3, list, m10533textLayoutConstraintsv_w8tDc(drawScope, j3, j2), drawScope.getLayoutDirection(), drawScope, null, false, DisplayStrings.DS_MAP_POPUP_START_POINT_TITLE, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
            clip(transform, textLayoutResultM10520measurexDpz5zY$default);
            textLayoutResultM10520measurexDpz5zY$default.getMultiParagraph().m10410paintLG529CI(drawScope.getDrawContext().getCanvas(), (30 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : 0L, (30 & 4) != 0 ? null : null, (30 & 8) != 0 ? null : null, (30 & 16) == 0 ? null : null, (30 & 32) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i4);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m10527drawTextLVfH_YU(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j2, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)));
            clip(transform, textLayoutResult);
            textLayoutResult.getMultiParagraph().m10412painthn5TExg(drawScope.getDrawContext().getCanvas(), brush, Float.isNaN(f2) ? textLayoutResult.getLayoutInput().getStyle().getAlpha() : f2, shadow2, textDecoration2, drawStyle2, i2);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m10529drawTextTPWCCtM(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j2, TextStyle textStyle, int i2, boolean z, int i3, long j3, int i4) {
        TextLayoutResult textLayoutResultM10520measurexDpz5zY$default = TextMeasurer.m10520measurexDpz5zY$default(textMeasurer, new AnnotatedString(str, null, 2, null), textStyle, i2, z, i3, null, m10533textLayoutConstraintsv_w8tDc(drawScope, j3, j2), drawScope.getLayoutDirection(), drawScope, null, false, DisplayStrings.DS_MAP_ISSUE_MORE_INFO_DISCLAIMER, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
            clip(transform, textLayoutResultM10520measurexDpz5zY$default);
            textLayoutResultM10520measurexDpz5zY$default.getMultiParagraph().m10410paintLG529CI(drawScope.getDrawContext().getCanvas(), (30 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : 0L, (30 & 4) != 0 ? null : null, (30 & 8) != 0 ? null : null, (30 & 16) == 0 ? null : null, (30 & 32) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i4);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m10531drawTextd8rzKo(DrawScope drawScope, TextLayoutResult textLayoutResult, long j2, long j3, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        float alpha;
        Canvas canvas;
        MultiParagraph multiParagraph;
        int i3;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        Shadow shadow3 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle3 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j3)));
            clip(transform, textLayoutResult);
            Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
            if (brush == null || j2 != 16) {
                MultiParagraph multiParagraph2 = textLayoutResult.getMultiParagraph();
                Canvas canvas2 = drawScope.getDrawContext().getCanvas();
                if (j2 == 16) {
                    j2 = textLayoutResult.getLayoutInput().getStyle().m10576getColor0d7_KjU();
                }
                multiParagraph2.m10410paintLG529CI(canvas2, TextDrawStyleKt.m11037modulateDxMtmZc(j2, f2), shadow3, textDecoration3, drawStyle3, i2);
            } else {
                MultiParagraph multiParagraph3 = textLayoutResult.getMultiParagraph();
                Canvas canvas3 = drawScope.getDrawContext().getCanvas();
                if (Float.isNaN(f2)) {
                    alpha = textLayoutResult.getLayoutInput().getStyle().getAlpha();
                    i3 = i2;
                    shadow2 = shadow3;
                    textDecoration2 = textDecoration3;
                    drawStyle2 = drawStyle3;
                    canvas = canvas3;
                    multiParagraph = multiParagraph3;
                } else {
                    alpha = f2;
                    canvas = canvas3;
                    multiParagraph = multiParagraph3;
                    i3 = i2;
                    shadow2 = shadow3;
                    textDecoration2 = textDecoration3;
                    drawStyle2 = drawStyle3;
                }
                multiParagraph.m10412painthn5TExg(canvas, brush, alpha, shadow2, textDecoration2, drawStyle2, i3);
            }
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final long m10533textLayoutConstraintsv_w8tDc(androidx.compose.ui.graphics.drawscope.DrawScope r7, long r8, long r10) {
        /*
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 32
            r2 = 0
            if (r0 != 0) goto Ld
            goto L2a
        Ld:
            long r3 = r8 >> r1
            int r3 = (int) r3
            float r4 = java.lang.Float.intBitsToFloat(r3)
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L2a
            float r1 = java.lang.Float.intBitsToFloat(r3)
            double r3 = (double) r1
            double r3 = java.lang.Math.ceil(r3)
            float r1 = (float) r3
            int r1 = java.lang.Math.round(r1)
            r3 = r1
            goto L4c
        L2a:
            long r3 = r7.mo8751getSizeNHjbRc()
            long r3 = r3 >> r1
            long r5 = r10 >> r1
            int r1 = (int) r5
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r3 = r3 - r1
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            float r1 = (float) r3
            int r1 = java.lang.Math.round(r1)
            int r1 = h.k.n.h(r1, r2)
            r3 = r1
            r1 = r2
        L4c:
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 != 0) goto L54
            goto L70
        L54:
            long r8 = r8 & r4
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 != 0) goto L70
            float r7 = java.lang.Float.intBitsToFloat(r8)
            double r7 = (double) r7
            double r7 = java.lang.Math.ceil(r7)
            float r7 = (float) r7
            int r2 = java.lang.Math.round(r7)
            r7 = r2
            goto L8f
        L70:
            long r7 = r7.mo8751getSizeNHjbRc()
            long r7 = r7 & r4
            long r10 = r10 & r4
            int r9 = (int) r10
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r8 = java.lang.Float.intBitsToFloat(r9)
            float r7 = r7 - r8
            double r7 = (double) r7
            double r7 = java.lang.Math.ceil(r7)
            float r7 = (float) r7
            int r7 = java.lang.Math.round(r7)
            int r7 = h.k.n.h(r7, r2)
        L8f:
            long r7 = androidx.compose.ui.unit.ConstraintsKt.Constraints(r1, r3, r2, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextPainterKt.m10533textLayoutConstraintsv_w8tDc(androidx.compose.ui.graphics.drawscope.DrawScope, long, long):long");
    }
}
