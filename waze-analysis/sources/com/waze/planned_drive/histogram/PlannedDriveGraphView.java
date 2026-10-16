package com.waze.planned_drive.histogram;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.ui.z.as;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class PlannedDriveGraphView extends View {

    /* renamed from: a, reason: collision with root package name */
    private List f33324a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f33325b;

    /* renamed from: c, reason: collision with root package name */
    private RectF f33326c;

    public PlannedDriveGraphView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int color = ContextCompat.getColor(getContext(), R.color.histogram_max_bar_color);
        int color2 = ContextCompat.getColor(getContext(), R.color.histogram_min_bar_color);
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f33325b = paint;
        paint.setShader(new LinearGradient(0.0f, 0.0f, as.e(R.dimen.planDriveGraphWidth), 0.0f, color, color2, Shader.TileMode.CLAMP));
        this.f33326c = new RectF();
    }

    public final void a(List list) {
        this.f33324a = list;
        postInvalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f33324a == null || getHeight() <= 0 || getWidth() <= 0) {
            return;
        }
        float height = getHeight();
        float size = this.f33324a.size();
        int i2 = 0;
        float f2 = 0.0f;
        while (i2 < this.f33324a.size()) {
            float f3 = (height / size) + f2;
            float fFloatValue = ((Float) this.f33324a.get(i2)).floatValue();
            float f4 = f3 - f2;
            float width = getWidth() * 0.75f * fFloatValue;
            float f5 = 0.1f * f4;
            this.f33326c.set(getWidth() - ((getWidth() * 0.2f) + width), f2 + f5, getWidth(), f3 - f5);
            float f6 = f4 * 0.4f;
            canvas.drawRoundRect(this.f33326c, f6, f6, this.f33325b);
            i2++;
            f2 = f3;
        }
    }

    public PlannedDriveGraphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlannedDriveGraphView(Context context) {
        this(context, null);
    }
}
