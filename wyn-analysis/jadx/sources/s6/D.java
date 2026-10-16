package s6;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: A, reason: collision with root package name */
    public int f45077A;

    /* renamed from: B, reason: collision with root package name */
    public int f45078B;

    /* renamed from: C, reason: collision with root package name */
    public int f45079C;

    /* renamed from: D, reason: collision with root package name */
    public int f45080D;

    /* renamed from: E, reason: collision with root package name */
    public StaticLayout f45081E;

    /* renamed from: F, reason: collision with root package name */
    public StaticLayout f45082F;

    /* renamed from: G, reason: collision with root package name */
    public int f45083G;

    /* renamed from: H, reason: collision with root package name */
    public int f45084H;

    /* renamed from: I, reason: collision with root package name */
    public int f45085I;

    /* renamed from: J, reason: collision with root package name */
    public Rect f45086J;

    /* renamed from: a, reason: collision with root package name */
    public final float f45087a;

    /* renamed from: b, reason: collision with root package name */
    public final float f45088b;

    /* renamed from: c, reason: collision with root package name */
    public final float f45089c;

    /* renamed from: d, reason: collision with root package name */
    public final float f45090d;

    /* renamed from: e, reason: collision with root package name */
    public final float f45091e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f45092f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f45093g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f45094h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f45095i;

    /* renamed from: j, reason: collision with root package name */
    public Layout.Alignment f45096j;
    public Bitmap k;

    /* renamed from: l, reason: collision with root package name */
    public float f45097l;

    /* renamed from: m, reason: collision with root package name */
    public int f45098m;

    /* renamed from: n, reason: collision with root package name */
    public int f45099n;

    /* renamed from: o, reason: collision with root package name */
    public float f45100o;

    /* renamed from: p, reason: collision with root package name */
    public int f45101p;

    /* renamed from: q, reason: collision with root package name */
    public float f45102q;

    /* renamed from: r, reason: collision with root package name */
    public float f45103r;

    /* renamed from: s, reason: collision with root package name */
    public int f45104s;

    /* renamed from: t, reason: collision with root package name */
    public int f45105t;

    /* renamed from: u, reason: collision with root package name */
    public int f45106u;

    /* renamed from: v, reason: collision with root package name */
    public int f45107v;

    /* renamed from: w, reason: collision with root package name */
    public int f45108w;

    /* renamed from: x, reason: collision with root package name */
    public float f45109x;

    /* renamed from: y, reason: collision with root package name */
    public float f45110y;

    /* renamed from: z, reason: collision with root package name */
    public float f45111z;

    public D(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f45091e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f45090d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f45087a = fRound;
        this.f45088b = fRound;
        this.f45089c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f45092f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f45093g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f45094h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z2) {
        Canvas canvas2;
        if (!z2) {
            this.f45086J.getClass();
            this.k.getClass();
            canvas.drawBitmap(this.k, (Rect) null, this.f45086J, this.f45094h);
            return;
        }
        StaticLayout staticLayout = this.f45081E;
        StaticLayout staticLayout2 = this.f45082F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f45083G, this.f45084H);
        if (Color.alpha(this.f45106u) > 0) {
            Paint paint = this.f45093g;
            paint.setColor(this.f45106u);
            canvas2 = canvas;
            canvas2.drawRect(-this.f45085I, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, staticLayout.getWidth() + this.f45085I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i5 = this.f45108w;
        TextPaint textPaint = this.f45092f;
        if (i5 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f45087a);
            textPaint.setColor(this.f45107v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f10 = this.f45088b;
            if (i5 == 2) {
                float f11 = this.f45089c;
                textPaint.setShadowLayer(f10, f11, f11, this.f45107v);
            } else if (i5 == 3 || i5 == 4) {
                boolean z10 = i5 == 3;
                int i10 = z10 ? -1 : this.f45107v;
                int i11 = z10 ? this.f45107v : -1;
                float f12 = f10 / 2.0f;
                textPaint.setColor(this.f45104s);
                textPaint.setStyle(Paint.Style.FILL);
                float f13 = -f12;
                textPaint.setShadowLayer(f10, f13, f13, i10);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f10, f12, f12, i11);
            }
        }
        textPaint.setColor(this.f45104s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        canvas2.restoreToCount(iSave);
    }
}
