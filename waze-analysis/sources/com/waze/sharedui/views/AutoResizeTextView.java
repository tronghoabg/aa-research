package com.waze.sharedui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class AutoResizeTextView extends WazeTextView {

    /* renamed from: b, reason: collision with root package name */
    private static final Canvas f39113b = new Canvas();

    /* renamed from: c, reason: collision with root package name */
    private b f39114c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f39115d;

    /* renamed from: e, reason: collision with root package name */
    private float f39116e;

    /* renamed from: f, reason: collision with root package name */
    private float f39117f;

    /* renamed from: g, reason: collision with root package name */
    private float f39118g;

    /* renamed from: h, reason: collision with root package name */
    private float f39119h;

    /* renamed from: i, reason: collision with root package name */
    private float f39120i;

    /* renamed from: j, reason: collision with root package name */
    private float f39121j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f39122k;

    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39115d = false;
        this.f39117f = 0.0f;
        this.f39118g = 0.0f;
        this.f39119h = 15.0f;
        this.f39120i = 1.0f;
        this.f39121j = 0.0f;
        this.f39122k = true;
        this.f39116e = getTextSize();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.waze.sharedui.n.f39063a);
        this.f39119h = typedArrayObtainStyledAttributes.getDimension(0, 15.0f);
        requestLayout();
        invalidate();
        typedArrayObtainStyledAttributes.recycle();
    }

    private final int h(CharSequence charSequence, TextPaint textPaint, int i2, float f2) {
        if (isInEditMode()) {
            return -1;
        }
        textPaint.setTextSize(f2);
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i2, Layout.Alignment.ALIGN_NORMAL, this.f39120i, this.f39121j, true);
        staticLayout.draw(f39113b);
        if (staticLayout.getLineCount() <= 1) {
            return staticLayout.getHeight();
        }
        return -1;
    }

    public final void a(float f2) {
        this.f39118g = f2;
    }

    public final void b(int i2, int i3) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i3 <= 0 || i2 <= 0 || this.f39116e == 0.0f) {
            return;
        }
        TextPaint paint = getPaint();
        paint.getTextSize();
        float f2 = this.f39117f;
        float fMin = this.f39116e;
        if (f2 > 0.0f) {
            fMin = Math.min(fMin, f2);
        }
        int iH = h(text, paint, i2, fMin);
        float fMax = fMin;
        while (true) {
            if (iH != -1 && iH <= i3) {
                break;
            }
            float f3 = this.f39119h;
            if (fMax <= f3) {
                break;
            }
            fMax = Math.max(fMax - 1.0f, f3);
            iH = h(text, paint, i2, fMax);
        }
        if (!isInEditMode() && this.f39122k && fMax == this.f39119h && (iH > i3 || iH == -1)) {
            StaticLayout staticLayout = new StaticLayout(text, paint, i2, Layout.Alignment.ALIGN_NORMAL, this.f39120i, this.f39121j, false);
            staticLayout.draw(f39113b);
            int lineForVertical = staticLayout.getLineForVertical(i3) - 1;
            if (lineForVertical != -1) {
                int lineStart = staticLayout.getLineStart(lineForVertical);
                int lineEnd = staticLayout.getLineEnd(lineForVertical);
                float lineWidth = staticLayout.getLineWidth(lineForVertical);
                float fMeasureText = paint.measureText("...");
                while (i2 < lineWidth + fMeasureText && lineStart <= lineEnd) {
                    int i4 = lineEnd - 1;
                    float fMeasureText2 = paint.measureText(text.subSequence(lineStart, lineEnd).toString());
                    lineEnd = i4;
                    lineWidth = fMeasureText2;
                }
                if (lineEnd < 0) {
                    lineEnd = 0;
                }
                text = String.valueOf(String.valueOf(text.subSequence(0, lineEnd))).concat("...");
            }
        }
        setText(text);
        paint.setTextSize(fMax);
        setLineSpacing(this.f39121j, this.f39120i);
        b bVar = this.f39114c;
        if (bVar != null) {
            bVar.a();
        }
        this.f39115d = false;
    }

    public final void c(b bVar) {
        this.f39114c = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z || this.f39115d) {
            b(((i4 - i2) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i5 - i3) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (i2 == i4 && i3 == i5) {
            return;
        }
        super.setTextSize(0, this.f39116e);
        this.f39117f = this.f39116e;
        float f2 = this.f39118g;
        if (f2 != 0.0f) {
            this.f39117f = f2;
        }
        this.f39115d = true;
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.f39115d = true;
        requestLayout();
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f2, float f3) {
        super.setLineSpacing(f2, f3);
        this.f39120i = f3;
        this.f39121j = f2;
    }

    @Override // android.widget.TextView
    public final void setTextSize(float f2) {
        super.setTextSize(f2);
        this.f39116e = getTextSize();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        super.setTextSize(i2, f2);
        this.f39116e = getTextSize();
    }

    public AutoResizeTextView(Context context) {
        this(context, null);
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39115d = false;
        this.f39117f = 0.0f;
        this.f39118g = 0.0f;
        this.f39119h = 15.0f;
        this.f39120i = 1.0f;
        this.f39121j = 0.0f;
        this.f39122k = true;
        this.f39116e = getTextSize();
    }
}
