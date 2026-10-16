package com.waze.planned_drive;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ej;
import android.support.v7.widget.fb;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class h extends ej {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlannedDriveDayPicker f33322a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f33323b;

    h(PlannedDriveDayPicker plannedDriveDayPicker) {
        Objects.requireNonNull(plannedDriveDayPicker);
        this.f33322a = plannedDriveDayPicker;
        Paint paint = new Paint();
        this.f33323b = paint;
        paint.setColor(plannedDriveDayPicker.getResources().getColor(R.color.hairline));
        paint.setStrokeWidth(com.waze.ui.z.as.h(plannedDriveDayPicker.getResources(), 1));
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.support.v7.widget.ej
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, fb fbVar) {
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount - 1; i2++) {
            float bottom = recyclerView.getChildAt(i2).getBottom() + com.waze.ui.z.as.h(this.f33322a.getResources(), 16);
            canvas.drawLine(com.waze.ui.z.as.h(r2.getResources(), 2), bottom, r2.f33163a.getMeasuredWidth(), bottom, this.f33323b);
        }
    }
}
