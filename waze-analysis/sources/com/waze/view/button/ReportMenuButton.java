package com.waze.view.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.reports.ee;
import com.waze.utils.o;
import com.waze.view.b.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ReportMenuButton extends View {

    /* renamed from: a, reason: collision with root package name */
    private float f45011a;

    /* renamed from: b, reason: collision with root package name */
    private float f45012b;

    /* renamed from: c, reason: collision with root package name */
    private int f45013c;

    /* renamed from: d, reason: collision with root package name */
    private int f45014d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f45015e;

    /* renamed from: f, reason: collision with root package name */
    private e f45016f;

    /* renamed from: g, reason: collision with root package name */
    private Runnable f45017g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f45018h;

    public ReportMenuButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45011a = -1.0f;
        this.f45012b = -1.0f;
        this.f45013c = -16777216;
        this.f45014d = 0;
        this.f45015e = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ReportMenuButton);
        this.f45013c = typedArrayObtainStyledAttributes.getColor(R.styleable.ReportMenuButton_bgColor, -16777216);
        this.f45014d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.f45011a = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f45012b = typedArrayObtainStyledAttributes.getDimension(3, -1.0f);
        typedArrayObtainStyledAttributes.recycle();
        k();
    }

    private final void k() {
        if (isInEditMode()) {
            return;
        }
        e eVar = new e();
        this.f45016f = eVar;
        eVar.c(this.f45013c);
        this.f45016f.d(this.f45011a);
        setBackground(this.f45016f);
        if (this.f45014d != 0) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), this.f45014d);
            this.f45015e = bitmapDecodeResource;
            float f2 = this.f45012b;
            if (f2 > 0.0f) {
                int i2 = (int) f2;
                bitmapDecodeResource = Bitmap.createScaledBitmap(bitmapDecodeResource, i2, i2, false);
                this.f45015e = bitmapDecodeResource;
            }
            this.f45016f.e(bitmapDecodeResource);
        }
    }

    public final int a() {
        return this.f45013c;
    }

    public final int b() {
        return this.f45014d;
    }

    public final void d() {
        this.f45016f.setLevel(10000);
        setVisibility(4);
        invalidate();
    }

    public final void e(Drawable drawable) {
        this.f45014d = 0;
        if (drawable == null) {
            this.f45015e = null;
            return;
        }
        Bitmap bitmapA = o.a(drawable);
        this.f45015e = bitmapA;
        float f2 = this.f45012b;
        if (f2 > 0.0f) {
            int i2 = (int) f2;
            bitmapA = Bitmap.createScaledBitmap(bitmapA, i2, i2, false);
            this.f45015e = bitmapA;
        }
        this.f45016f.e(bitmapA);
        invalidate();
    }

    public final void f(int i2) {
        this.f45014d = i2;
        Bitmap bitmapCreateBitmap = null;
        if (i2 == 0) {
            this.f45015e = null;
            return;
        }
        Drawable drawable = ContextCompat.getDrawable(getContext(), this.f45014d);
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmapCreateBitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                int i3 = (int) this.f45012b;
                bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
            }
        }
        Bitmap bitmapCreateBitmap2 = bitmapCreateBitmap;
        this.f45015e = bitmapCreateBitmap2;
        if (bitmapCreateBitmap2 != null && this.f45012b > 0.0f) {
            Matrix matrix = new Matrix();
            RectF rectF = new RectF(0.0f, 0.0f, bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight());
            float f2 = this.f45012b;
            matrix.setRectToRect(rectF, new RectF(0.0f, 0.0f, f2, f2), Matrix.ScaleToFit.CENTER);
            bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap2, 0, 0, bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight(), matrix, true);
            this.f45015e = bitmapCreateBitmap2;
        }
        this.f45016f.e(bitmapCreateBitmap2);
        invalidate();
    }

    public final void g(int i2) {
        this.f45012b = i2;
    }

    public final void h() {
        post(new a(this, 1));
    }

    public final void i() {
        this.f45018h = true;
    }

    public final void j(int i2, ee eeVar) {
        Runnable runnable = this.f45017g;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f45016f.a();
        b bVar = new b(this, eeVar);
        this.f45017g = bVar;
        postDelayed(bVar, i2);
        invalidate();
    }

    @Override // android.view.View
    public final void setAlpha(float f2) {
        if (this.f45018h) {
            return;
        }
        super.setAlpha(f2);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        this.f45013c = i2;
        this.f45016f.c(i2);
    }

    public ReportMenuButton(Context context) {
        super(context);
        this.f45011a = -1.0f;
        this.f45012b = -1.0f;
        this.f45013c = -16777216;
        this.f45014d = 0;
        this.f45015e = null;
        k();
    }

    public ReportMenuButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f45011a = -1.0f;
        this.f45012b = -1.0f;
        this.f45013c = -16777216;
        this.f45014d = 0;
        this.f45015e = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ReportMenuButton);
        this.f45013c = typedArrayObtainStyledAttributes.getColor(R.styleable.ReportMenuButton_bgColor, -16777216);
        this.f45014d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.f45011a = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f45012b = typedArrayObtainStyledAttributes.getDimension(3, -1.0f);
        typedArrayObtainStyledAttributes.recycle();
        k();
    }
}
