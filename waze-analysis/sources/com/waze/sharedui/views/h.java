package com.waze.sharedui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.content.ContextCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends i {

    /* renamed from: e, reason: collision with root package name */
    private final Paint f39237e;

    /* renamed from: f, reason: collision with root package name */
    private final int f39238f;

    public h(Context context, Bitmap bitmap, int i2) {
        super(bitmap, com.waze.shared_infra.i.h.r(i2));
        this.f39238f = i2;
        Paint paint = new Paint();
        this.f39237e = paint;
        paint.setAntiAlias(true);
        paint.setStrokeWidth(com.waze.shared_infra.i.h.r(i2));
        paint.setColor(ContextCompat.getColor(context, R.color.always_white));
        paint.setStyle(Paint.Style.STROKE);
        if (com.waze.shared_infra.i.h.B(context)) {
            return;
        }
        paint.setShadowLayer(com.waze.shared_infra.i.h.r(0), 0.0f, 0.0f, ContextCompat.getColor(context, R.color.shadow_default));
    }

    @Override // com.waze.sharedui.views.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.drawCircle(this.f39239a, this.f39240b, this.f39241c - (com.waze.shared_infra.i.h.r(this.f39238f) / 2), this.f39237e);
    }

    public h(int i2, int i3) {
        super(i2, com.waze.shared_infra.i.h.r(i3));
        this.f39238f = i3;
        Paint paint = new Paint();
        this.f39237e = paint;
        paint.setAntiAlias(true);
        paint.setStrokeWidth(com.waze.shared_infra.i.h.r(i3));
        paint.setColor(i2);
        paint.setStyle(Paint.Style.STROKE);
    }
}
