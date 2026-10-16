package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes.dex */
public class uef extends oa {
    private final Bitmap yo;

    /* renamed from: oa, reason: collision with root package name */
    private final Rect f24833oa = new Rect();
    private final Paint moa = new Paint(1);

    public uef(Bitmap bitmap, oa oaVar) {
        this.yo = bitmap;
        if (oaVar != null) {
            this.uef = oaVar.uef;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int width = this.yo.getWidth();
        int height = this.yo.getHeight();
        this.f24833oa.set(0, 0, width, height);
        if (height >= iHeight && width >= iWidth) {
            if (width > iWidth) {
                Rect rect2 = this.f24833oa;
                int i5 = (width - iWidth) / 2;
                rect2.left = i5;
                rect2.right = i5 + iWidth;
            }
            if (height > iHeight) {
                Rect rect3 = this.f24833oa;
                int i10 = (height - iHeight) / 2;
                rect3.top = i10;
                rect3.bottom = i10 + iHeight;
                return;
            }
            return;
        }
        float f10 = iHeight;
        float f11 = f10 * 1.0f;
        float f12 = height;
        float f13 = f11 / f12;
        float f14 = iWidth;
        float f15 = 1.0f * f14;
        float f16 = width;
        if (Math.max(f13, f15 / f16) > f13) {
            int i11 = (int) ((f11 / f14) * f16);
            Rect rect4 = this.f24833oa;
            int i12 = (height - i11) / 2;
            rect4.top = i12;
            rect4.bottom = i12 + i11;
            return;
        }
        int i13 = (int) ((f15 / f10) * f12);
        Rect rect5 = this.f24833oa;
        int i14 = (width - i13) / 2;
        rect5.left = i14;
        rect5.right = i14 + i13;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oa
    public void uef(Canvas canvas) {
        canvas.drawBitmap(this.yo, this.f24833oa, getBounds(), this.moa);
    }
}
