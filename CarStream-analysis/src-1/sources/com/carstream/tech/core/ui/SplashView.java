package com.carstream.tech.core.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.carstream.tech.R;
import defpackage.ad;
import defpackage.eb;
import defpackage.fb;
import defpackage.gb;
import defpackage.k1;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class SplashView extends FrameLayout {
    public static final DecelerateInterpolator i = new DecelerateInterpolator();
    public static final AccelerateDecelerateInterpolator j = new AccelerateDecelerateInterpolator();
    public static final OvershootInterpolator k = new OvershootInterpolator(1.1f);
    public static final OvershootInterpolator l = new OvershootInterpolator(2.2f);
    public static final PathInterpolator m = new PathInterpolator(0.16f, 0.86f, 0.24f, 1.0f);
    public static boolean n;
    public final SplashArt a;
    public final TextView b;
    public final TextView c;
    public final gb d;
    public final float e;
    public ValueAnimator f;
    public boolean g;
    public int h;

    public SplashView(ContextWrapper contextWrapper, boolean z, boolean z2) {
        super(contextWrapper);
        setBackgroundColor(SplashArt.L);
        setClickable(true);
        this.e = z ? 0.9f : 1.0f;
        SplashArt splashArt = new SplashArt(contextWrapper);
        this.a = splashArt;
        TextView textView = new TextView(contextWrapper);
        this.b = textView;
        textView.setText(z2 ? ad.c(contextWrapper.getString(R.string.app_name), " FullScreen") : contextWrapper.getString(R.string.app_name));
        textView.setTextColor(SplashArt.N);
        textView.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        textView.setIncludeFontPadding(false);
        TextView textView2 = new TextView(contextWrapper);
        this.c = textView2;
        textView2.setText("VIDEO · WEB · ANDROID AUTO");
        textView2.setTextColor(SplashArt.O);
        textView2.setTypeface(Typeface.MONOSPACE);
        textView2.setLetterSpacing(0.2f);
        textView2.setIncludeFontPadding(false);
        gb gbVar = new gb(contextWrapper);
        this.d = gbVar;
        addView(splashArt);
        addView(textView);
        addView(textView2);
        addView(gbVar);
        a(0L);
    }

    public static void b(View view, int i2, float f, int i3, int i4) {
        int i5 = (i2 - i3) / 2;
        int i6 = (int) f;
        view.layout(i5, i6, i3 + i5, i4 + i6);
    }

    public static void c(Activity activity) {
        if (n) {
            return;
        }
        n = true;
        SplashView splashView = new SplashView(activity, false, false);
        activity.addContentView(splashView, new FrameLayout.LayoutParams(-1, -1));
        splashView.d();
        splashView.postDelayed(new fb(splashView, null, 1), 1680L);
    }

    public static float e(long j2, long j3, long j4, TimeInterpolator timeInterpolator) {
        if (j2 <= j3) {
            return 0.0f;
        }
        if (j2 >= j3 + j4) {
            return 1.0f;
        }
        return timeInterpolator.getInterpolation((j2 - j3) / j4);
    }

    public final void a(long j2) {
        DecelerateInterpolator decelerateInterpolator;
        float fE = e(j2, 0L, 580L, k);
        SplashArt splashArt = this.a;
        splashArt.a = (0.18f * fE) + 0.82f;
        splashArt.b = Math.min(1.0f, fE);
        DecelerateInterpolator decelerateInterpolator2 = i;
        splashArt.c = e(j2, 300L, 400L, decelerateInterpolator2);
        float fE2 = e(j2, 300L, 720L, m);
        splashArt.d = (1.0f - fE2) * (-0.38f);
        splashArt.e = fE2;
        if (j2 < 550 || j2 > 1700) {
            splashArt.f = -2.0f;
        } else {
            splashArt.f = (e(j2, 550L, 1150L, j) * 3.4f) - 1.2f;
        }
        float fE3 = e(j2, 920L, 500L, l);
        splashArt.g = (0.7f * fE3) + 0.3f;
        splashArt.h = Math.min(1.0f, fE3);
        if (j2 < 1060 || j2 > 1960) {
            decelerateInterpolator = decelerateInterpolator2;
            splashArt.j = 0.0f;
        } else {
            decelerateInterpolator = decelerateInterpolator2;
            float fE4 = e(j2, 1060L, 900L, decelerateInterpolator);
            splashArt.i = (1.2f * fE4) + 0.9f;
            splashArt.j = (1.0f - fE4) * 0.5f;
        }
        splashArt.invalidate();
        float fE5 = e(j2, 1180L, 500L, decelerateInterpolator);
        float fG = (1.0f - fE5) * k1.g(getContext(), 14.0f);
        TextView textView = this.b;
        textView.setAlpha(fE5);
        textView.setTranslationY(fG);
        TextView textView2 = this.c;
        textView2.setAlpha(fE5);
        textView2.setTranslationY(fG);
        gb gbVar = this.d;
        gbVar.b = j2;
        gbVar.invalidate();
    }

    public final void d() {
        if (this.f != null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1100L);
        this.f.setRepeatCount(-1);
        this.f.setInterpolator(null);
        this.f.addUpdateListener(new eb(this, SystemClock.uptimeMillis()));
        this.f.start();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6 = i4 - i2;
        float f = i5 - i3;
        int iMin = (int) (Math.min(i6 * 0.6f, 0.65f * f) * this.e);
        if (iMin <= 0) {
            return;
        }
        TextView textView = this.b;
        int measuredHeight = textView.getMeasuredHeight();
        TextView textView2 = this.c;
        int measuredHeight2 = textView2.getMeasuredHeight();
        gb gbVar = this.d;
        int measuredHeight3 = gbVar.getMeasuredHeight();
        float f2 = iMin;
        float f3 = measuredHeight;
        float f4 = measuredHeight2;
        float f5 = (f * 0.45f) - (((((1.038f * f2) + f3) + f4) + measuredHeight3) / 2.0f);
        b(this.a, i6, f5, iMin, iMin);
        float f6 = (0.067f * f2) + (0.866f * f2) + f5;
        b(textView, i6, f6, textView.getMeasuredWidth(), measuredHeight);
        float f7 = (0.03f * f2) + f3 + f6;
        b(textView2, i6, f7, textView2.getMeasuredWidth(), measuredHeight2);
        b(gbVar, i6, (f2 * 0.075f) + f4 + f7, gbVar.getMeasuredWidth(), measuredHeight3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        setMeasuredDimension(size, size2);
        int iMin = (int) (Math.min(size * 0.6f, size2 * 0.65f) * this.e);
        if (iMin <= 0) {
            return;
        }
        int i4 = this.h;
        TextView textView = this.c;
        TextView textView2 = this.b;
        if (iMin != i4) {
            this.h = iMin;
            float f = iMin;
            textView2.setTextSize(0, 0.115f * f);
            textView.setTextSize(0, f * 0.042f);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
        textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        float f2 = iMin;
        this.d.measure(View.MeasureSpec.makeMeasureSpec((int) (0.2f * f2), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f2 * 0.06f), 1073741824));
    }
}
