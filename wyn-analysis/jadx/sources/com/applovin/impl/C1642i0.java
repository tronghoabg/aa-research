package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.sdk.AppLovinMediationProvider;

/* renamed from: com.applovin.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1642i0 extends View {

    /* renamed from: w, reason: collision with root package name */
    private static final int f21690w = Color.rgb(66, 145, 241);

    /* renamed from: x, reason: collision with root package name */
    private static final int f21691x = Color.rgb(66, 145, 241);

    /* renamed from: y, reason: collision with root package name */
    private static final int f21692y = Color.rgb(66, 145, 241);

    /* renamed from: a, reason: collision with root package name */
    private Paint f21693a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f21694b;

    /* renamed from: c, reason: collision with root package name */
    protected Paint f21695c;

    /* renamed from: d, reason: collision with root package name */
    protected Paint f21696d;

    /* renamed from: e, reason: collision with root package name */
    private RectF f21697e;

    /* renamed from: f, reason: collision with root package name */
    private float f21698f;

    /* renamed from: g, reason: collision with root package name */
    private int f21699g;

    /* renamed from: h, reason: collision with root package name */
    private int f21700h;

    /* renamed from: i, reason: collision with root package name */
    private int f21701i;

    /* renamed from: j, reason: collision with root package name */
    private int f21702j;
    private int k;

    /* renamed from: l, reason: collision with root package name */
    private float f21703l;

    /* renamed from: m, reason: collision with root package name */
    private int f21704m;

    /* renamed from: n, reason: collision with root package name */
    private String f21705n;

    /* renamed from: o, reason: collision with root package name */
    private String f21706o;

    /* renamed from: p, reason: collision with root package name */
    private float f21707p;

    /* renamed from: q, reason: collision with root package name */
    private String f21708q;

    /* renamed from: r, reason: collision with root package name */
    private float f21709r;

    /* renamed from: s, reason: collision with root package name */
    private final float f21710s;

    /* renamed from: t, reason: collision with root package name */
    private final float f21711t;

    /* renamed from: u, reason: collision with root package name */
    private final float f21712u;

    /* renamed from: v, reason: collision with root package name */
    private final int f21713v;

    /* renamed from: com.applovin.impl.i0$a */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f10) {
            return (f10 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f10) {
            return f10 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public C1642i0(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (getProgress() / this.f21702j) * 360.0f;
    }

    public void a() {
        this.k = f21690w;
        this.f21699g = f21691x;
        this.f21698f = this.f21711t;
        setMax(100);
        setProgress(0);
        this.f21703l = this.f21710s;
        this.f21704m = 0;
        this.f21707p = this.f21712u;
        this.f21700h = f21692y;
    }

    public void b() {
        TextPaint textPaint = new TextPaint();
        this.f21695c = textPaint;
        textPaint.setColor(this.f21699g);
        this.f21695c.setTextSize(this.f21698f);
        this.f21695c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f21696d = textPaint2;
        textPaint2.setColor(this.f21700h);
        this.f21696d.setTextSize(this.f21707p);
        this.f21696d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f21693a = paint;
        paint.setColor(this.k);
        this.f21693a.setStyle(Paint.Style.STROKE);
        this.f21693a.setAntiAlias(true);
        this.f21693a.setStrokeWidth(this.f21703l);
        Paint paint2 = new Paint();
        this.f21694b = paint2;
        paint2.setColor(this.f21704m);
        this.f21694b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.k;
    }

    public float getFinishedStrokeWidth() {
        return this.f21703l;
    }

    public int getInnerBackgroundColor() {
        return this.f21704m;
    }

    public String getInnerBottomText() {
        return this.f21708q;
    }

    public int getInnerBottomTextColor() {
        return this.f21700h;
    }

    public float getInnerBottomTextSize() {
        return this.f21707p;
    }

    public int getMax() {
        return this.f21702j;
    }

    public String getPrefixText() {
        return this.f21705n;
    }

    public int getProgress() {
        return this.f21701i;
    }

    public String getSuffixText() {
        return this.f21706o;
    }

    public int getTextColor() {
        return this.f21699g;
    }

    public float getTextSize() {
        return this.f21698f;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f21703l;
        this.f21697e.set(f10, f10, getWidth() - f10, getHeight() - f10);
        float width = getWidth();
        float f11 = this.f21703l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f11) + f11) / 2.0f, this.f21694b);
        canvas.drawArc(this.f21697e, 270.0f, -getProgressAngle(), false, this.f21693a);
        String str = this.f21705n + this.f21701i + this.f21706o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f21695c.measureText(str)) / 2.0f, (getWidth() - (this.f21695c.ascent() + this.f21695c.descent())) / 2.0f, this.f21695c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.f21696d.setTextSize(this.f21707p);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.f21696d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f21709r) - ((this.f21695c.ascent() + this.f21695c.descent()) / 2.0f), this.f21696d);
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        setMeasuredDimension(a(i5), a(i10));
        this.f21709r = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f21699g = bundle.getInt("text_color");
        this.f21698f = bundle.getFloat("text_size");
        this.f21707p = bundle.getFloat("inner_bottom_text_size");
        this.f21708q = bundle.getString("inner_bottom_text");
        this.f21700h = bundle.getInt("inner_bottom_text_color");
        this.k = bundle.getInt("finished_stroke_color");
        this.f21703l = bundle.getFloat("finished_stroke_width");
        this.f21704m = bundle.getInt("inner_background_color");
        b();
        setMax(bundle.getInt(AppLovinMediationProvider.MAX));
        setProgress(bundle.getInt("progress"));
        this.f21705n = bundle.getString("prefix");
        this.f21706o = bundle.getString("suffix");
        super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt(AppLovinMediationProvider.MAX, getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i5) {
        this.k = i5;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f10) {
        this.f21703l = f10;
        invalidate();
    }

    public void setInnerBackgroundColor(int i5) {
        this.f21704m = i5;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f21708q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i5) {
        this.f21700h = i5;
        invalidate();
    }

    public void setInnerBottomTextSize(float f10) {
        this.f21707p = f10;
        invalidate();
    }

    public void setMax(int i5) {
        if (i5 > 0) {
            this.f21702j = i5;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f21705n = str;
        invalidate();
    }

    public void setProgress(int i5) {
        this.f21701i = i5;
        if (i5 > getMax()) {
            this.f21701i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f21706o = str;
        invalidate();
    }

    public void setTextColor(int i5) {
        this.f21699g = i5;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f21698f = f10;
        invalidate();
    }

    public C1642i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1642i0(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f21697e = new RectF();
        this.f21701i = 0;
        this.f21705n = "";
        this.f21706o = "";
        this.f21708q = "";
        this.f21711t = a.d(getResources(), 14.0f);
        this.f21713v = (int) a.c(getResources(), 100.0f);
        this.f21710s = a.c(getResources(), 4.0f);
        this.f21712u = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode == 1073741824) {
            return size;
        }
        int i10 = this.f21713v;
        return mode == Integer.MIN_VALUE ? Math.min(i10, size) : i10;
    }
}
