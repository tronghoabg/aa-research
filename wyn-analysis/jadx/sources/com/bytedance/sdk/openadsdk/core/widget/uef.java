package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;

/* loaded from: classes3.dex */
public class uef extends com.bytedance.sdk.openadsdk.core.ivm.moa {

    /* renamed from: oa, reason: collision with root package name */
    private int f25769oa;
    private int uef;

    public uef(Context context) {
        super(context);
        this.uef = 0;
        this.f25769oa = 0;
    }

    private Paint getPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }

    private int getRadius() {
        if (this.uef == 0) {
            this.uef = getWidth();
        }
        if (this.f25769oa == 0) {
            this.f25769oa = getHeight();
        }
        int i5 = this.uef;
        int i10 = this.f25769oa;
        if (i5 >= i10) {
            i5 = i10;
        }
        return i5 / 2;
    }

    private boolean oa() {
        if (getDrawable().getClass() != NinePatchDrawable.class) {
            return (getDrawable() instanceof BitmapDrawable) && ((BitmapDrawable) getDrawable()).getBitmap() == null;
        }
        return true;
    }

    private boolean uef() {
        return getDrawable() == null || getWidth() == 0 || getHeight() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmapCopy;
        Bitmap bitmapUef;
        if (uef()) {
            return;
        }
        measure(0, 0);
        if (oa()) {
            return;
        }
        try {
            bitmapCopy = ((BitmapDrawable) getDrawable()).getBitmap().copy(Bitmap.Config.ARGB_8888, true);
        } catch (Throwable unused) {
            bitmapCopy = null;
        }
        if (bitmapCopy == null) {
            super.onDraw(canvas);
            return;
        }
        try {
            bitmapUef = uef(bitmapCopy, getRadius());
        } catch (Throwable unused2) {
            bitmapUef = null;
        }
        if (bitmapUef == null) {
            super.onDraw(canvas);
        } else {
            canvas.drawBitmap(bitmapUef, (this.uef / 2) - r2, (this.f25769oa / 2) - r2, (Paint) null);
        }
    }

    private Bitmap uef(Bitmap bitmap, int i5) {
        int i10 = i5 * 2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = height > width ? Bitmap.createBitmap(bitmap, 0, (height - width) / 2, width, width) : height < width ? Bitmap.createBitmap(bitmap, (width - height) / 2, 0, height, height) : null;
        if (bitmapCreateBitmap != null) {
            bitmap = bitmapCreateBitmap;
        }
        if (bitmap.getWidth() != i10 || bitmap.getHeight() != i10) {
            bitmap = Bitmap.createScaledBitmap(bitmap, i10, i10, true);
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = getPaint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap2;
    }
}
