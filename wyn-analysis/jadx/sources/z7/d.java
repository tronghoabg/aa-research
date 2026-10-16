package Z7;

import a1.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f17019a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17020b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17021c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17022d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17023e;

    /* renamed from: f, reason: collision with root package name */
    public final float f17024f;

    /* renamed from: g, reason: collision with root package name */
    public final float f17025g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17026h;

    /* renamed from: i, reason: collision with root package name */
    public final float f17027i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f17028j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17029l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17030m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f17031n;

    public d(Context context, int i5) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i5, I7.a.f5421x);
        this.k = typedArrayObtainStyledAttributes.getDimension(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f17028j = Ba.c.w(context, typedArrayObtainStyledAttributes, 3);
        Ba.c.w(context, typedArrayObtainStyledAttributes, 4);
        Ba.c.w(context, typedArrayObtainStyledAttributes, 5);
        this.f17021c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f17022d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i10 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f17029l = typedArrayObtainStyledAttributes.getResourceId(i10, 0);
        this.f17020b = typedArrayObtainStyledAttributes.getString(i10);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f17019a = Ba.c.w(context, typedArrayObtainStyledAttributes, 6);
        this.f17023e = typedArrayObtainStyledAttributes.getFloat(7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f17024f = typedArrayObtainStyledAttributes.getFloat(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f17025g = typedArrayObtainStyledAttributes.getFloat(9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i5, I7.a.f5413p);
        this.f17026h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f17027i = typedArrayObtainStyledAttributes2.getFloat(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f17031n;
        int i5 = this.f17021c;
        if (typeface == null && (str = this.f17020b) != null) {
            this.f17031n = Typeface.create(str, i5);
        }
        if (this.f17031n == null) {
            int i10 = this.f17022d;
            if (i10 == 1) {
                this.f17031n = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f17031n = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f17031n = Typeface.DEFAULT;
            } else {
                this.f17031n = Typeface.MONOSPACE;
            }
            this.f17031n = Typeface.create(this.f17031n, i5);
        }
    }

    public final Typeface b(Context context) {
        if (this.f17030m) {
            return this.f17031n;
        }
        if (!context.isRestricted()) {
            try {
                int i5 = this.f17029l;
                ThreadLocal threadLocal = l.f17132a;
                Typeface typefaceB = context.isRestricted() ? null : l.b(context, i5, new TypedValue(), 0, null, false, false);
                this.f17031n = typefaceB;
                if (typefaceB != null) {
                    this.f17031n = Typeface.create(typefaceB, this.f17021c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e7) {
                Log.d("TextAppearance", "Error loading font " + this.f17020b, e7);
            }
        }
        a();
        this.f17030m = true;
        return this.f17031n;
    }

    public final void c(Context context, Fe.b bVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i5 = this.f17029l;
        if (i5 == 0) {
            this.f17030m = true;
        }
        if (this.f17030m) {
            bVar.L(this.f17031n, true);
            return;
        }
        try {
            b bVar2 = new b(this, bVar);
            ThreadLocal threadLocal = l.f17132a;
            if (context.isRestricted()) {
                bVar2.a(-4);
            } else {
                l.b(context, i5, new TypedValue(), 0, bVar2, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f17030m = true;
            bVar.K(1);
        } catch (Exception e7) {
            Log.d("TextAppearance", "Error loading font " + this.f17020b, e7);
            this.f17030m = true;
            bVar.K(-3);
        }
    }

    public final boolean d(Context context) throws Resources.NotFoundException {
        Typeface typefaceB = null;
        int i5 = this.f17029l;
        if (i5 != 0) {
            ThreadLocal threadLocal = l.f17132a;
            if (!context.isRestricted()) {
                typefaceB = l.b(context, i5, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceB != null;
    }

    public final void e(Context context, TextPaint textPaint, Fe.b bVar) {
        f(context, textPaint, bVar);
        ColorStateList colorStateList = this.f17028j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f17019a;
        textPaint.setShadowLayer(this.f17025g, this.f17023e, this.f17024f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, Fe.b bVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f17031n);
        c(context, new c(this, context, textPaint, bVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = Fe.c.A(context.getResources().getConfiguration(), typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i5 = (~typeface.getStyle()) & this.f17021c;
        textPaint.setFakeBoldText((i5 & 1) != 0);
        textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        textPaint.setTextSize(this.k);
        if (this.f17026h) {
            textPaint.setLetterSpacing(this.f17027i);
        }
    }
}
