package com.waze.gw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.waze.gw.Gateway;

/* loaded from: classes10.dex */
final class LaneGuidanceStrip extends View {
    private static final int ALTERNATIVE = -9473416;
    private static final int SELECTED = -1;
    private static final int SEPARATOR = 1728053247;
    private final Paint arrow;
    private final Paint head;
    private final Paint separator;
    private String signature;
    private Gateway.LaneSnapshot snapshot;

    LaneGuidanceStrip(Context context) {
        super(context);
        this.arrow = new Paint(1);
        this.head = new Paint(1);
        this.separator = new Paint(1);
        this.snapshot = Gateway.LaneSnapshot.EMPTY;
        this.signature = "";
        this.arrow.setStyle(Paint.Style.STROKE);
        this.arrow.setStrokeCap(Paint.Cap.ROUND);
        this.arrow.setStrokeJoin(Paint.Join.ROUND);
        this.head.setStyle(Paint.Style.FILL);
        this.separator.setColor(SEPARATOR);
        setVisibility(8);
    }

    boolean setSnapshot(Gateway.LaneSnapshot laneSnapshot) {
        if (laneSnapshot == null) {
            laneSnapshot = Gateway.LaneSnapshot.EMPTY;
        }
        String strSignature = laneSnapshot.signature();
        if (strSignature.equals(this.signature)) {
            return false;
        }
        this.signature = strSignature;
        this.snapshot = laneSnapshot;
        setVisibility(laneSnapshot.size() <= 0 ? 8 : 0);
        invalidate();
        requestLayout();
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        LaneGuidanceStrip laneGuidanceStrip = this;
        super.onDraw(canvas);
        Gateway.LaneSnapshot laneSnapshot = laneGuidanceStrip.snapshot;
        int size = laneSnapshot.size();
        if (size <= 0 || laneGuidanceStrip.getWidth() <= 0 || laneGuidanceStrip.getHeight() <= 0) {
            return;
        }
        float width = laneGuidanceStrip.getWidth() / size;
        float height = laneGuidanceStrip.getHeight();
        laneGuidanceStrip.separator.setStrokeWidth(Math.max(1.0f, 0.025f * height));
        int i2 = 0;
        while (i2 < size) {
            if (i2 > 0) {
                float f2 = i2 * width;
                canvas.drawLine(f2, height * 0.24f, f2, height * 0.78f, laneGuidanceStrip.separator);
            }
            float f3 = i2 * width;
            int iAngleCount = laneSnapshot.angleCount(i2);
            int i3 = 0;
            while (i3 < iAngleCount) {
                if (!laneSnapshot.isSelected(i2, i3)) {
                    laneGuidanceStrip.drawArrow(canvas, f3, width, height, laneSnapshot.angleAt(i2, i3), false);
                }
                i3++;
                laneGuidanceStrip = this;
            }
            for (int i4 = 0; i4 < iAngleCount; i4++) {
                if (laneSnapshot.isSelected(i2, i4)) {
                    drawArrow(canvas, f3, width, height, laneSnapshot.angleAt(i2, i4), true);
                }
            }
            i2++;
            laneGuidanceStrip = this;
        }
    }

    private void drawArrow(Canvas canvas, float f2, float f3, float f4, int i2, boolean z) {
        int i3 = z ? -1 : ALTERNATIVE;
        float fMax = Math.max(2.0f, Math.min(f3, f4) * (z ? 0.115f : 0.1f));
        this.arrow.setColor(i3);
        this.arrow.setStrokeWidth(fMax);
        this.head.setColor(i3);
        float f5 = f2 + (0.5f * f3);
        float f6 = f4 * 0.83f;
        float f7 = 0.53f * f4;
        float fMin = Math.min(0.35f * f3, 0.3f * f4);
        int iMax = Math.max(-180, Math.min(180, i2));
        if (Math.abs(iMax) >= 150) {
            drawUTurn(canvas, f5, f6, f3, f4, iMax < 0, fMax);
            return;
        }
        double radians = Math.toRadians(iMax);
        float fSin = (float) Math.sin(radians);
        float f8 = (float) (-Math.cos(radians));
        float f9 = (fSin * fMin) + f5;
        float f10 = (f8 * fMin) + f7;
        float f11 = 2.25f * fMax;
        Path path = new Path();
        path.moveTo(f5, f6);
        path.lineTo(f5, (Math.max(0.0f, f8) * fMin * 0.18f) + f7);
        path.quadTo(f5, f7, f9 - ((fSin * f11) * 0.52f), f10 - ((f11 * f8) * 0.52f));
        canvas.drawPath(path, this.arrow);
        drawHead(canvas, f9, f10, fSin, f8, fMax);
    }

    private void drawUTurn(Canvas canvas, float f2, float f3, float f4, float f5, boolean z, float f6) {
        float f7 = z ? -1.0f : 1.0f;
        float fMin = Math.min(f4 * 0.24f, 0.18f * f5);
        float f8 = f5 * 0.27f;
        Path path = new Path();
        path.moveTo(f2, f3);
        float f9 = f8 + fMin;
        path.lineTo(f2, f9);
        float f10 = f8 - (0.25f * fMin);
        float f11 = f2 + (f7 * fMin * 2.0f);
        path.cubicTo(f2, f10, f11, f10, f11, f9 - (1.17f * f6));
        canvas.drawPath(path, this.arrow);
        drawHead(canvas, f11, f9, 0.0f, 1.0f, f6);
    }

    private void drawHead(Canvas canvas, float f2, float f3, float f4, float f5, float f6) {
        float f7 = 2.25f * f6;
        float f8 = f6 * 1.25f;
        Path path = new Path();
        path.moveTo(f2, f3);
        float f9 = f2 - (f4 * f7);
        float f10 = (-f5) * f8;
        float f11 = f3 - (f5 * f7);
        float f12 = f4 * f8;
        path.lineTo(f9 + f10, f11 + f12);
        path.lineTo(f9 - f10, f11 - f12);
        path.close();
        canvas.drawPath(path, this.head);
    }
}
