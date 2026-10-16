package com.bytedance.sdk.component.adexpress.ivm;

import Va.M6;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class moa extends View {
    private List<Integer> bcc;
    private float cq;
    private List<Integer> cz;
    private Paint dj;
    private int dz;
    private int ivm;
    private float lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f24906oa;
    private int uef;
    private float wrv;
    private boolean xs;
    private float yo;
    private Paint zjm;

    public moa(Context context) {
        this(context, null);
    }

    private void yo() {
        Paint paint = new Paint();
        this.zjm = paint;
        paint.setAntiAlias(true);
        this.zjm.setStrokeWidth(this.dz);
        this.bcc.add(255);
        this.cz.add(0);
        Paint paint2 = new Paint();
        this.dj = paint2;
        paint2.setAntiAlias(true);
        this.dj.setColor(Color.parseColor("#0FFFFFFF"));
        this.dj.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    public void oa() {
        this.xs = false;
        this.cz.clear();
        this.bcc.clear();
        this.bcc.add(255);
        this.cz.add(0);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.zjm.setShader(new LinearGradient(this.wrv, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.cq, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i5 = 0;
        while (true) {
            if (i5 >= this.bcc.size()) {
                break;
            }
            Integer num = this.bcc.get(i5);
            this.zjm.setAlpha(num.intValue());
            Integer num2 = this.cz.get(i5);
            if (this.yo + num2.intValue() < this.lw) {
                canvas.drawCircle(this.wrv, this.cq, this.yo + num2.intValue(), this.zjm);
            }
            if (num.intValue() > 0 && num2.intValue() < this.lw) {
                this.bcc.set(i5, Integer.valueOf(num.intValue() - this.ivm > 0 ? num.intValue() - (this.ivm * 3) : 1));
                this.cz.set(i5, Integer.valueOf(num2.intValue() + this.ivm));
            }
            i5++;
        }
        if (((Integer) M6.k(1, this.cz)).intValue() >= this.lw / this.moa) {
            this.bcc.add(255);
            this.cz.add(0);
        }
        if (this.cz.size() >= 3) {
            this.cz.remove(0);
            this.bcc.remove(0);
        }
        this.zjm.setAlpha(255);
        this.zjm.setColor(this.f24906oa);
        canvas.drawCircle(this.wrv, this.cq, this.yo, this.dj);
        if (this.xs) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int size = View.MeasureSpec.getSize(i5);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        float f10 = i5 / 2.0f;
        this.wrv = f10;
        this.cq = i10 / 2.0f;
        float f11 = f10 - (this.dz / 2.0f);
        this.lw = f11;
        this.yo = f11 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            invalidate();
        }
    }

    public void setColor(int i5) {
        this.uef = i5;
    }

    public void setCoreColor(int i5) {
        this.f24906oa = i5;
    }

    public void setCoreRadius(int i5) {
        this.yo = i5;
    }

    public void setDiffuseSpeed(int i5) {
        this.ivm = i5;
    }

    public void setDiffuseWidth(int i5) {
        this.moa = i5;
    }

    public void setMaxWidth(int i5) {
        this.lw = i5;
    }

    public void uef() {
        this.xs = true;
        invalidate();
    }

    public moa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public moa(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.uef = -1;
        this.f24906oa = -65536;
        this.yo = 18.0f;
        this.moa = 3;
        this.lw = 50.0f;
        this.ivm = 2;
        this.xs = false;
        this.bcc = new ArrayList();
        this.cz = new ArrayList();
        this.dz = 24;
        yo();
    }
}
