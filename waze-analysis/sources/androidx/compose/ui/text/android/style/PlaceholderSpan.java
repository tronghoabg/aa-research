package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnitKt;
import h.e;
import h.g.b.o;
import h.g.b.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PlaceholderSpan extends ReplacementSpan {
    public static final int ALIGN_ABOVE_BASELINE = 0;
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 3;
    public static final int ALIGN_TEXT_BOTTOM = 5;
    public static final int ALIGN_TEXT_CENTER = 6;
    public static final int ALIGN_TEXT_TOP = 4;
    public static final int ALIGN_TOP = 1;
    public static final int UNIT_EM = 1;
    public static final int UNIT_SP = 0;
    public static final int UNIT_UNSPECIFIED = 2;
    private Paint.FontMetricsInt fontMetrics;
    private final float height;
    private final float heightAsSpInPx;
    private int heightPx;
    private final int heightUnit;
    private boolean isLaidOut;
    private final int verticalAlign;
    private final float width;
    private final float widthAsSpInPx;
    private int widthPx;
    private final int widthUnit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    public PlaceholderSpan(float f2, int i2, float f3, int i3, Density density, int i4) {
        int i5;
        float fMo2126toPxR2X_6o;
        int i6;
        float fMo2126toPxR2X_6o2 = 0.0f;
        if (i2 == 0) {
            fMo2126toPxR2X_6o = density.mo2126toPxR2X_6o(TextUnitKt.getSp(f2));
            i5 = 0;
        } else {
            i5 = i2;
            fMo2126toPxR2X_6o = 0.0f;
        }
        if (i3 == 0) {
            fMo2126toPxR2X_6o2 = density.mo2126toPxR2X_6o(TextUnitKt.getSp(f3));
            i6 = 0;
        } else {
            i6 = i3;
        }
        this(f2, i5, f3, i6, fMo2126toPxR2X_6o, fMo2126toPxR2X_6o2, i4);
    }

    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        x.j("fontMetrics");
        return null;
    }

    public final int getHeightPx() {
        if (!this.isLaidOut) {
            InlineClassHelperKt.throwIllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.heightPx;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        float f2;
        float f3;
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        this.fontMetrics = paint.getFontMetricsInt();
        if (getFontMetrics().descent <= getFontMetrics().ascent) {
            InlineClassHelperKt.throwIllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        int i4 = this.widthUnit;
        if (i4 == 0) {
            f2 = this.widthAsSpInPx;
        } else {
            if (i4 != 1) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported unit.");
                throw new e();
            }
            f2 = this.width * textSize;
        }
        this.widthPx = PlaceholderSpan_androidKt.ceilToInt(f2);
        int i5 = this.heightUnit;
        if (i5 == 0) {
            f3 = this.heightAsSpInPx;
        } else {
            if (i5 != 1) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported unit.");
                throw new e();
            }
            f3 = this.height * textSize;
        }
        this.heightPx = PlaceholderSpan_androidKt.ceilToInt(f3);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = getFontMetrics().ascent;
            fontMetricsInt.descent = getFontMetrics().descent;
            fontMetricsInt.leading = getFontMetrics().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fontMetricsInt.ascent > (-getHeightPx())) {
                        fontMetricsInt.ascent = -getHeightPx();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + getHeightPx() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + getHeightPx();
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - getHeightPx()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - getHeightPx();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < getHeightPx()) {
                        fontMetricsInt.ascent -= (getHeightPx() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2;
                        fontMetricsInt.descent = fontMetricsInt.ascent + getHeightPx();
                        break;
                    }
                    break;
                default:
                    InlineClassHelperKt.throwIllegalArgumentException("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(getFontMetrics().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(getFontMetrics().bottom, fontMetricsInt.descent);
        }
        return getWidthPx();
    }

    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int getWidthPx() {
        if (!this.isLaidOut) {
            InlineClassHelperKt.throwIllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.widthPx;
    }

    /* compiled from: WazeSource */
    public final class Companion {

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface Unit {
        }

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface VerticalAlign {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    private PlaceholderSpan(float f2, int i2, float f3, int i3, float f4, float f5, int i4) {
        this.width = f2;
        this.widthUnit = i2;
        this.height = f3;
        this.heightUnit = i3;
        this.widthAsSpInPx = f4;
        this.heightAsSpInPx = f5;
        this.verticalAlign = i4;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
    }
}
