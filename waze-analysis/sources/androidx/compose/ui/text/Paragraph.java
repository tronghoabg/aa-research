package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Paragraph {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.text.Paragraph$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ int getLineEnd$default(Paragraph paragraph, int i2, boolean z, int i3, Object obj) {
            if (obj == null) {
                return paragraph.getLineEnd(i2, z & ((i3 & 2) == 0));
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }

        /* renamed from: paint-LG529CI$default, reason: not valid java name */
        public static /* synthetic */ void m10414paintLG529CI$default(Paragraph paragraph, Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
            }
            paragraph.mo10366paintLG529CI(canvas, (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2, (i3 & 4) != 0 ? null : shadow, (i3 & 8) != 0 ? null : textDecoration, (i3 & 16) == 0 ? drawStyle : null, (i3 & 32) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
        public static /* synthetic */ void m10415paintRPmYEkk$default(Paragraph paragraph, Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
            }
            if ((i2 & 2) != 0) {
                j2 = Color.Companion.m8264getUnspecified0d7_KjU();
            }
            paragraph.mo10367paintRPmYEkk(canvas, j2, (i2 & 4) != 0 ? null : shadow, (i2 & 8) != 0 ? null : textDecoration);
        }

        /* renamed from: paint-hn5TExg$default, reason: not valid java name */
        public static /* synthetic */ void m10416painthn5TExg$default(Paragraph paragraph, Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
            }
            if ((i3 & 4) != 0) {
                f2 = Float.NaN;
            }
            paragraph.mo10368painthn5TExg(canvas, brush, f2, (i3 & 8) != 0 ? null : shadow, (i3 & 16) != 0 ? null : textDecoration, (i3 & 32) != 0 ? null : drawStyle, (i3 & 64) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q */
    void mo10360fillBoundingBoxes8ffj60Q(long j2, float[] fArr, int i2);

    ResolvedTextDirection getBidiRunDirection(int i2);

    Rect getBoundingBox(int i2);

    Rect getCursorRect(int i2);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int i2, boolean z);

    float getLastBaseline();

    float getLineBaseline(int i2);

    float getLineBottom(int i2);

    int getLineCount();

    int getLineEnd(int i2, boolean z);

    int getLineForOffset(int i2);

    int getLineForVerticalPosition(float f2);

    float getLineHeight(int i2);

    float getLineLeft(int i2);

    float getLineRight(int i2);

    int getLineStart(int i2);

    float getLineTop(int i2);

    float getLineWidth(int i2);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    /* renamed from: getOffsetForPosition-k-4lQ0M */
    int mo10362getOffsetForPositionk4lQ0M(long j2);

    ResolvedTextDirection getParagraphDirection(int i2);

    Path getPathForRange(int i2, int i3);

    List<Rect> getPlaceholderRects();

    /* renamed from: getRangeForRect-8-6BmAI */
    long mo10364getRangeForRect86BmAI(Rect rect, int i2, TextInclusionStrategy textInclusionStrategy);

    float getWidth();

    /* renamed from: getWordBoundary--jx7JFs */
    long mo10365getWordBoundaryjx7JFs(int i2);

    boolean isLineEllipsized(int i2);

    /* renamed from: paint-LG529CI */
    void mo10366paintLG529CI(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2);

    /* renamed from: paint-RPmYEkk */
    void mo10367paintRPmYEkk(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration);

    /* renamed from: paint-hn5TExg */
    void mo10368painthn5TExg(Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2);
}
