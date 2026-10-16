package com.waze.uid.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.shared_infra.i.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class CharacterPlaceholderEditText extends a {

    /* renamed from: b, reason: collision with root package name */
    private int f44800b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f44801c;

    public CharacterPlaceholderEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Paint paint = new Paint();
        this.f44801c = paint;
        paint.setColor(ContextCompat.getColor(getContext(), R.color.hint_text));
        this.f44801c.setStyle(Paint.Style.STROKE);
        this.f44801c.setStrokeWidth(h.r(2));
        setWillNotDraw(false);
    }

    public final void a(int i2) {
        this.f44800b = i2;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
        getLayoutParams().width = (int) (i2 * (getLetterSpacing() + 1.0f) * getTextSize() * 0.82f);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int length = getText().length();
        float textSize = getTextSize() * 0.82f;
        float letterSpacing = getLetterSpacing();
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f44800b) {
            float f2 = (letterSpacing * textSize) / 2.0f;
            float f3 = (int) (i3 + f2);
            float f4 = f3 + textSize;
            if (i2 >= length) {
                canvas2 = canvas;
                canvas2.drawLine(f3, getMeasuredHeight(), f4, getMeasuredHeight(), this.f44801c);
            } else {
                canvas2 = canvas;
            }
            i3 = (int) (((int) f4) + f2);
            i2++;
            canvas = canvas2;
        }
    }

    public CharacterPlaceholderEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CharacterPlaceholderEditText(Context context) {
        this(context, null);
    }
}
