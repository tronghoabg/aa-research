package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 8;
    private int ascent;
    private int descent;
    private final int endIndex;
    private int firstAscent;
    private int firstAscentDiff;
    private int lastDescent;
    private int lastDescentDiff;
    private final float lineHeight;
    private final int mode;
    private final int startIndex;
    private final float topRatio;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;

    private LineHeightStyleSpan(float f2, int i2, int i3, boolean z, boolean z2, float f3, int i4) {
        this.lineHeight = f2;
        this.startIndex = i2;
        this.endIndex = i3;
        this.trimFirstLineTop = z;
        this.trimLastLineBottom = z2;
        this.topRatio = f3;
        this.mode = i4;
        this.firstAscent = Integer.MIN_VALUE;
        this.ascent = Integer.MIN_VALUE;
        this.descent = Integer.MIN_VALUE;
        this.lastDescent = Integer.MIN_VALUE;
        if ((f3 < 0.0f || f3 > 1.0f) && f3 != -1.0f) {
            InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        double d2 = this.lineHeight;
        int iCeil = (int) Math.ceil(d2);
        int iLineHeight = iCeil - LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        if (LineHeightStyle.Mode.m10984equalsimpl0(this.mode, LineHeightStyle.Mode.Companion.m10989getMinimumlzQqcRY()) && iLineHeight <= 0) {
            this.ascent = fontMetricsInt.ascent;
            int i2 = fontMetricsInt.descent;
            this.descent = i2;
            this.firstAscent = this.ascent;
            this.lastDescent = i2;
            this.firstAscentDiff = 0;
            this.lastDescentDiff = 0;
            return;
        }
        float fAbs = this.topRatio;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt);
        }
        int iCeil2 = fontMetricsInt.descent + ((int) (iLineHeight <= 0 ? Math.ceil(iLineHeight * fAbs) : Math.ceil(iLineHeight * (1.0f - fAbs))));
        this.descent = iCeil2;
        this.ascent = iCeil2 - iCeil;
        if (LineHeightStyle.Mode.m10984equalsimpl0(this.mode, LineHeightStyle.Mode.Companion.m10988getFixedlzQqcRY()) || iLineHeight >= 0) {
            this.firstAscent = this.trimFirstLineTop ? fontMetricsInt.ascent : this.ascent;
            this.lastDescent = this.trimLastLineBottom ? fontMetricsInt.descent : this.descent;
            this.firstAscentDiff = fontMetricsInt.ascent - this.firstAscent;
            this.lastDescentDiff = this.lastDescent - fontMetricsInt.descent;
            return;
        }
        if (LineHeightStyle.Mode.m10984equalsimpl0(this.mode, LineHeightStyle.Mode.Companion.m10990getTightlzQqcRY())) {
            this.firstAscent = this.trimFirstLineTop ? Math.max(fontMetricsInt.ascent, this.ascent) : Math.min(fontMetricsInt.ascent, this.ascent);
            this.lastDescent = this.trimLastLineBottom ? Math.min(fontMetricsInt.descent, this.descent) : Math.max(fontMetricsInt.descent, this.descent);
            this.firstAscentDiff = 0;
            this.lastDescentDiff = 0;
        }
    }

    public static /* synthetic */ LineHeightStyleSpan copy$ui_text$default(LineHeightStyleSpan lineHeightStyleSpan, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z = lineHeightStyleSpan.trimFirstLineTop;
        }
        return lineHeightStyleSpan.copy$ui_text(i2, i3, z);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i2, int i3, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        if (LineHeightStyleSpan_androidKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z = i2 == this.startIndex;
        boolean z2 = i3 == this.endIndex;
        if (z && z2 && this.trimFirstLineTop && this.trimLastLineBottom && !LineHeightStyle.Mode.m10984equalsimpl0(this.mode, LineHeightStyle.Mode.Companion.m10990getTightlzQqcRY())) {
            return;
        }
        if (this.firstAscent == Integer.MIN_VALUE) {
            calculateTargetMetrics(fontMetricsInt);
        }
        fontMetricsInt.ascent = z ? this.firstAscent : this.ascent;
        fontMetricsInt.descent = z2 ? this.lastDescent : this.descent;
    }

    public final LineHeightStyleSpan copy$ui_text(int i2, int i3, boolean z) {
        return new LineHeightStyleSpan(this.lineHeight, i2, i3, z, this.trimLastLineBottom, this.topRatio, this.mode, null);
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    /* renamed from: getMode-lzQqcRY, reason: not valid java name */
    public final int m10602getModelzQqcRY() {
        return this.mode;
    }

    public final boolean getTrimFirstLineTop() {
        return this.trimFirstLineTop;
    }

    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }

    public /* synthetic */ LineHeightStyleSpan(float f2, int i2, int i3, boolean z, boolean z2, float f3, int i4, o oVar) {
        this(f2, i2, i3, z, z2, f3, i4);
    }
}
