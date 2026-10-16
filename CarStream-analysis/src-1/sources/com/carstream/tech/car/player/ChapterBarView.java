package com.carstream.tech.car.player;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.carstream.tech.R;
import defpackage.z9;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class ChapterBarView extends z9 {
    public final Paint h;
    public final Paint i;
    public final RectF j;
    public final float k;
    public final float l;
    public final float m;

    public ChapterBarView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth() - (this.k * 0);
        float height = getHeight();
        float f = this.l;
        float f2 = (height - f) / 2.0f;
        float fC = c() * 1.0f;
        float f3 = (width * 1.0f) / 1.0f;
        RectF rectF = this.j;
        rectF.set(0.0f, f2, 0.0f + f3, f2 + f);
        Paint paint = this.h;
        float f4 = this.m;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        float fMax = Math.max(0.0f, Math.min(1.0f, (fC - 0.0f) / 1.0f));
        if (fMax > 0.0f) {
            rectF.set(0.0f, f2, (f3 * fMax) + 0.0f, f + f2);
            canvas.drawRoundRect(rectF, f4, f4, this.i);
        }
    }

    public ChapterBarView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.i = paint2;
        this.j = new RectF();
        paint.setColor(getResources().getColor(R.color.pl_on_dark_26));
        paint2.setColor(getResources().getColor(R.color.pl_accent));
        this.k = getResources().getDimension(R.dimen.pl_progress_gap);
        float dimension = getResources().getDimension(R.dimen.pl_progress_h);
        this.l = dimension;
        this.m = dimension / 2.0f;
    }
}
