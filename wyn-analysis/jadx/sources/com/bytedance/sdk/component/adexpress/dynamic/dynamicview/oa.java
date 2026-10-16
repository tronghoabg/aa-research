package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class oa extends GradientDrawable {

    /* renamed from: oa, reason: collision with root package name */
    private final Paint f24827oa;
    protected Path uef;

    public oa() {
        this.uef = new Path();
        Paint paint = new Paint(1);
        this.f24827oa = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.uef;
        if (path == null || path.isEmpty()) {
            uef(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight(), this.f24827oa, 31);
        uef(canvas);
        this.f24827oa.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.uef, this.f24827oa);
        this.f24827oa.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public void uef(Canvas canvas) {
        super.draw(canvas);
    }

    public void uef(int i5, int i10, int i11, int i12) {
        this.uef.addRect(i5, i10, i11, i12, Path.Direction.CW);
        invalidateSelf();
    }

    public oa(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.uef = new Path();
        Paint paint = new Paint(1);
        this.f24827oa = paint;
        paint.setColor(-1);
    }
}
