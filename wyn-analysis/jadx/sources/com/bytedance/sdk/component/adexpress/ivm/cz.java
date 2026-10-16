package com.bytedance.sdk.component.adexpress.ivm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class cz extends View {
    private int bcc;
    private int ivm;
    private Paint lw;
    private Paint moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f24899oa;
    private int uef;
    private Paint xs;
    private final RectF yo;

    public cz(Context context) {
        super(context);
        this.yo = new RectF();
        uef();
    }

    private void uef() {
        Paint paint = new Paint();
        this.moa = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.xs = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.lw = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.yo;
        int i5 = this.ivm;
        canvas.drawRoundRect(rectF, i5, i5, this.lw);
        RectF rectF2 = this.yo;
        int i10 = this.ivm;
        canvas.drawRoundRect(rectF2, i10, i10, this.moa);
        int i11 = this.uef;
        int i12 = this.f24899oa;
        canvas.drawLine(i11 * 0.3f, i12 * 0.3f, i11 * 0.7f, i12 * 0.7f, this.xs);
        int i13 = this.uef;
        int i14 = this.f24899oa;
        canvas.drawLine(i13 * 0.7f, i14 * 0.3f, i13 * 0.3f, i14 * 0.7f, this.xs);
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.uef = i5;
        this.f24899oa = i10;
        RectF rectF = this.yo;
        int i13 = this.bcc;
        rectF.set(i13, i13, i5 - i13, i10 - i13);
    }

    public void setBgColor(int i5) {
        this.lw.setStyle(Paint.Style.FILL);
        this.lw.setColor(i5);
    }

    public void setDislikeColor(int i5) {
        this.xs.setColor(i5);
    }

    public void setDislikeWidth(int i5) {
        this.xs.setStrokeWidth(i5);
    }

    public void setRadius(int i5) {
        this.ivm = i5;
    }

    public void setStrokeColor(int i5) {
        this.moa.setStyle(Paint.Style.STROKE);
        this.moa.setColor(i5);
    }

    public void setStrokeWidth(int i5) {
        this.moa.setStrokeWidth(i5);
        this.bcc = i5;
    }
}
