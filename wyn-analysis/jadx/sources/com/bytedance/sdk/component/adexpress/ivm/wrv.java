package com.bytedance.sdk.component.adexpress.ivm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class wrv extends View {
    private int bcc;
    private PorterDuff.Mode cq;
    private int[] cz;
    private Paint dj;
    private LinearGradient dz;
    private int ivm;
    private int lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    Rect f24915oa;
    Rect uef;
    private final List<uef> wk;
    private Xfermode wrv;
    private int xs;
    private int yo;
    private Bitmap zjm;

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        private int f24916oa = 0;
        private final int uef;

        public uef(int i5) {
            this.uef = i5;
        }

        public void uef() {
            this.f24916oa += this.uef;
        }
    }

    public wrv(Context context) {
        super(context);
        this.cq = PorterDuff.Mode.DST_IN;
        this.wk = new ArrayList();
        uef();
    }

    private void uef() {
        this.yo = com.bytedance.sdk.component.utils.orq.moa(getContext(), "tt_splash_unlock_image_arrow");
        this.moa = Color.parseColor("#00ffffff");
        this.lw = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.ivm = color;
        this.xs = 10;
        this.bcc = 40;
        this.cz = new int[]{this.moa, this.lw, color};
        setLayerType(1, null);
        this.dj = new Paint(1);
        this.zjm = BitmapFactory.decodeResource(getResources(), this.yo);
        this.wrv = new PorterDuffXfermode(this.cq);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.zjm, this.uef, this.f24915oa, this.dj);
        canvas.save();
        Iterator<uef> it = this.wk.iterator();
        while (it.hasNext()) {
            uef next = it.next();
            this.dz = new LinearGradient(next.f24916oa, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, next.f24916oa + this.bcc, this.xs, this.cz, (float[]) null, Shader.TileMode.CLAMP);
            this.dj.setColor(-1);
            this.dj.setShader(this.dz);
            Canvas canvas2 = canvas;
            canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight(), this.dj);
            this.dj.setShader(null);
            next.uef();
            if (next.f24916oa > getWidth()) {
                it.remove();
            }
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        this.dj.setXfermode(this.wrv);
        canvas3.drawBitmap(this.zjm, this.uef, this.f24915oa, this.dj);
        this.dj.setXfermode(null);
        canvas3.restore();
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (this.zjm == null) {
            return;
        }
        this.uef = new Rect(0, 0, this.zjm.getWidth(), this.zjm.getHeight());
        this.f24915oa = new Rect(0, 0, getWidth(), getHeight());
    }

    public void uef(int i5) {
        this.wk.add(new uef(i5));
        postInvalidate();
    }
}
