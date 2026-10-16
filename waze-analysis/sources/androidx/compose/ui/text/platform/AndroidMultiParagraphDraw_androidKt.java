package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.media3.muxer.MuxerUtil;
import h.i;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidMultiParagraphDraw_androidKt {
    /* renamed from: drawMultiParagraph-7AXcY_I, reason: not valid java name */
    public static final void m10836drawMultiParagraph7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        canvas.save();
        if (multiParagraph.getParagraphInfoList$ui_text().size() <= 1 || (brush instanceof SolidColor)) {
            m10838drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f2, shadow, textDecoration, drawStyle, i2);
        } else {
            if (!(brush instanceof ShaderBrush)) {
                throw new i();
            }
            List<ParagraphInfo> paragraphInfoList$ui_text = multiParagraph.getParagraphInfoList$ui_text();
            int size = paragraphInfoList$ui_text.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i3 = 0; i3 < size; i3++) {
                ParagraphInfo paragraphInfo = paragraphInfoList$ui_text.get(i3);
                height += paragraphInfo.getParagraph().getHeight();
                fMax = Math.max(fMax, paragraphInfo.getParagraph().getWidth());
            }
            Shader shaderMo8197createShaderuvyYCjk = ((ShaderBrush) brush).mo8197createShaderuvyYCjk((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(height) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            Matrix matrix = new Matrix();
            shaderMo8197createShaderuvyYCjk.getLocalMatrix(matrix);
            List<ParagraphInfo> paragraphInfoList$ui_text2 = multiParagraph.getParagraphInfoList$ui_text();
            int size2 = paragraphInfoList$ui_text2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ParagraphInfo paragraphInfo2 = paragraphInfoList$ui_text2.get(i4);
                paragraphInfo2.getParagraph().mo10368painthn5TExg(canvas, BrushKt.ShaderBrush(shaderMo8197createShaderuvyYCjk), f2, shadow, textDecoration, drawStyle, i2);
                canvas.translate(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                shaderMo8197createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        canvas.restore();
    }

    /* renamed from: drawMultiParagraph-7AXcY_I$default, reason: not valid java name */
    public static /* synthetic */ void m10837drawMultiParagraph7AXcY_I$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        int iM8168getSrcOver0nO6VwU = (i3 & 64) != 0 ? BlendMode.Companion.m8168getSrcOver0nO6VwU() : i2;
        int i4 = i3 & 16;
        int i5 = i3 & 8;
        int i6 = i3 & 4;
        DrawStyle drawStyle2 = (i3 & 32) != 0 ? null : drawStyle;
        TextDecoration textDecoration2 = i4 != 0 ? null : textDecoration;
        Shadow shadow2 = i5 != 0 ? null : shadow;
        if (i6 != 0) {
            f2 = Float.NaN;
        }
        m10836drawMultiParagraph7AXcY_I(multiParagraph, canvas, brush, f2, shadow2, textDecoration2, drawStyle2, iM8168getSrcOver0nO6VwU);
    }

    /* renamed from: drawParagraphs-7AXcY_I, reason: not valid java name */
    private static final void m10838drawParagraphs7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        List<ParagraphInfo> paragraphInfoList$ui_text = multiParagraph.getParagraphInfoList$ui_text();
        int size = paragraphInfoList$ui_text.size();
        for (int i3 = 0; i3 < size; i3++) {
            ParagraphInfo paragraphInfo = paragraphInfoList$ui_text.get(i3);
            paragraphInfo.getParagraph().mo10368painthn5TExg(canvas, brush, f2, shadow, textDecoration, drawStyle, i2);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}
