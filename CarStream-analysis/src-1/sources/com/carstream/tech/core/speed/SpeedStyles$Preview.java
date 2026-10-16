package com.carstream.tech.core.speed;

import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.view.View;
import defpackage.u7;
import defpackage.w1;
import defpackage.xc;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SpeedStyles$Preview extends View {
    public final SpeedBubble a;

    public SpeedStyles$Preview(ContextWrapper contextWrapper, String str) {
        super(contextWrapper);
        SpeedBubble speedBubbleH = w1.h(contextWrapper, str);
        this.a = speedBubbleH;
        speedBubbleH.D(52);
        speedBubbleH.A(60);
        speedBubbleH.B = true;
        speedBubbleH.requestLayout();
        speedBubbleH.invalidate();
        ArrayList arrayList = new ArrayList();
        u7 u7Var = new u7();
        u7Var.a = "warningAlertSpeedLimitCameraId";
        u7Var.b = 278;
        arrayList.add(u7Var);
        u7 u7Var2 = new u7();
        u7Var2.a = "warningAlertNoPassingGoingInId";
        u7Var2.b = 640;
        arrayList.add(u7Var2);
        speedBubbleH.C(null, arrayList);
        speedBubbleH.z(xc.e(contextWrapper, "speedSignsOnly", false));
        speedBubbleH.E();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        speedBubbleH.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        speedBubbleH.layout(0, 0, speedBubbleH.getMeasuredWidth(), speedBubbleH.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        SpeedBubble speedBubble = this.a;
        int width = speedBubble.getWidth();
        int height = speedBubble.getHeight();
        if (width <= 0 || height <= 0 || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        float f = width;
        float f2 = height;
        float fMin = Math.min(getWidth() / f, getHeight() / f2);
        int iSave = canvas.save();
        canvas.translate((getWidth() - (f * fMin)) / 2.0f, (getHeight() - (f2 * fMin)) / 2.0f);
        canvas.scale(fMin, fMin);
        speedBubble.draw(canvas);
        canvas.restoreToCount(iSave);
    }
}
