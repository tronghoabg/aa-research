package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class bcc extends View {
    private static final int[] uef = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private int bcc;
    private int cz;
    private final Paint ivm;
    private final Paint lw;
    private final ArrayList<uef> moa;

    /* renamed from: oa, reason: collision with root package name */
    private final RectF f25756oa;
    private int xs;
    private final RectF yo;

    public static final class uef {
        float moa;

        /* renamed from: oa, reason: collision with root package name */
        public float f25757oa;
        public Paint uef;
        float yo;

        public uef(Paint paint, float f10, float f11, float f12) {
            this.uef = paint;
            this.f25757oa = f10;
            this.yo = f11;
            this.moa = f12;
        }
    }

    public bcc(Context context) {
        super(context);
        this.f25756oa = new RectF();
        this.yo = new RectF();
        this.moa = new ArrayList<>();
        this.ivm = new Paint();
        Paint paint = new Paint();
        this.lw = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    private void uef() {
        if (this.xs <= 0) {
            return;
        }
        int width = (int) (((this.bcc * 1.0f) / 100.0f) * getWidth());
        this.yo.right = Math.max(this.cz, width);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f25756oa;
        int i5 = this.xs;
        canvas.drawRoundRect(rectF, i5, i5, this.lw);
        RectF rectF2 = this.yo;
        int i10 = this.xs;
        canvas.drawRoundRect(rectF2, i10, i10, this.ivm);
        int iSave = canvas.save();
        canvas.translate(this.yo.right - this.cz, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Iterator<uef> it = this.moa.iterator();
        while (it.hasNext()) {
            uef next = it.next();
            canvas.drawCircle(next.yo, next.moa, next.f25757oa, next.uef);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        int i13 = i10 / 2;
        this.xs = i13;
        this.cz = i13 * 5;
        float f10 = i5;
        float f11 = i10;
        this.f25756oa.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f11);
        this.yo.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11);
        this.ivm.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, f11, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.moa.clear();
        float f12 = this.xs / 4.0f;
        for (int i14 : uef) {
            Paint paint = new Paint();
            paint.setColor(i14);
            this.moa.add(new uef(paint, this.xs / 2.0f, f12, f11 / 2.0f));
            f12 += (this.xs / 2.0f) * 3.0f;
        }
        uef();
    }

    public void setProgress(int i5) {
        int i10 = this.bcc;
        if (i10 == i5) {
            return;
        }
        if (i5 < 0) {
            i5 = 0;
        } else if (i5 > 100) {
            i5 = 100;
        }
        if (i10 == i5) {
            return;
        }
        this.bcc = i5;
        uef();
    }
}
