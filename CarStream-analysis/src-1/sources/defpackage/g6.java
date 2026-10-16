package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.core.ui.SplashArt;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class g6 extends LinearLayout {
    public static final LinearInterpolator c;
    public static final AccelerateDecelerateInterpolator d;
    public static final float[] e;
    public static final float[] f;
    public static final float[] g;
    public static final Interpolator[] h;
    public static final float[] i;
    public static final float[] j;
    public static final float[] k;
    public static final Interpolator[] l;
    public static final float[] m;
    public static final float[] n;
    public static final float[] o;
    public static final Interpolator[] p;
    public final SplashArt a;
    public ValueAnimator b;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        c = linearInterpolator;
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        d = accelerateDecelerateInterpolator;
        e = new float[]{0.0f, 1800.0f, 2304.0f, 2412.0f, 2736.0f, 3024.0f, 3240.0f, 3600.0f};
        f = new float[]{0.0f, 0.0f, 55.0f, 59.0f, 6.0f, 16.0f, 4.0f, 0.0f};
        g = new float[]{0.0f, 0.0f, 2.2f, 2.6f, -1.4f, 0.7f, -0.3f, 0.0f};
        h = new Interpolator[]{linearInterpolator, accelerateInterpolator, linearInterpolator, decelerateInterpolator, accelerateDecelerateInterpolator, accelerateDecelerateInterpolator, decelerateInterpolator};
        i = new float[]{0.0f, 2304.0f, 2448.0f, 2664.0f, 2880.0f, 3600.0f};
        j = new float[]{1.0f, 1.0f, 1.18f, 1.08f, 1.04f, 1.0f};
        k = new float[]{0.0f, 0.0f, -8.0f, 6.0f, -3.0f, 0.0f};
        l = new Interpolator[]{linearInterpolator, accelerateDecelerateInterpolator, accelerateDecelerateInterpolator, accelerateDecelerateInterpolator, accelerateDecelerateInterpolator};
        m = new float[]{0.0f, 2340.0f, 3312.0f, 3600.0f};
        n = new float[]{1.0f, 1.0f, 2.4f, 1.0f};
        o = new float[]{0.55f, 0.55f, 0.0f, 0.55f};
        p = new Interpolator[]{linearInterpolator, decelerateInterpolator, linearInterpolator};
    }

    public g6(CarScreen carScreen, boolean z, boolean z2) {
        super(carScreen);
        setOrientation(1);
        setBackgroundColor(SplashArt.L);
        LinearLayout linearLayout = new LinearLayout(carScreen);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        int iG = k1.g(carScreen, 22.0f);
        int iG2 = k1.g(carScreen, 14.0f);
        linearLayout.setPadding(iG, iG2, iG, iG2);
        int iG3 = k1.g(carScreen, 32.0f);
        linearLayout.addView(new f6(carScreen), new LinearLayout.LayoutParams(iG3, iG3));
        TextView textView = new TextView(carScreen);
        textView.setText(z ? "CarStream FullScreen" : "CarStream");
        int i2 = SplashArt.N;
        textView.setTextColor(i2);
        Typeface typeface = Typeface.SANS_SERIF;
        textView.setTypeface(Typeface.create(typeface, 1));
        textView.setTextSize(0, d8.m(carScreen, 21.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = k1.g(carScreen, 12.0f);
        linearLayout.addView(textView, layoutParams);
        addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        View view = new View(carScreen);
        view.setBackgroundColor(-992824);
        addView(view, new LinearLayout.LayoutParams(-1, 1));
        SplashArt splashArt = new SplashArt(carScreen);
        this.a = splashArt;
        splashArt.q = true;
        LinearLayout linearLayout2 = new LinearLayout(carScreen);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        int iG4 = k1.g(carScreen, 20.0f);
        linearLayout2.setPadding(iG4, iG4, iG4, iG4);
        int iG5 = k1.g(carScreen, 118.0f);
        linearLayout2.addView(splashArt, new LinearLayout.LayoutParams(iG5, iG5));
        TextView textView2 = new TextView(carScreen);
        textView2.setText("Chưa đăng nhập");
        textView2.setTextColor(-14475234);
        textView2.setTypeface(Typeface.create(typeface, 1));
        textView2.setTextSize(0, d8.m(carScreen, 28.0f));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = k1.g(carScreen, 14.0f);
        linearLayout2.addView(textView2, layoutParams2);
        TextView textView3 = new TextView(carScreen);
        textView3.setText(z2 ? "Nhập key kích hoạt để bắt đầu dùng CarStream\ntrên màn hình này." : "Mở CarStream trên điện thoại và nhập key kích hoạt\nđể dùng trên màn hình xe.");
        textView3.setTextColor(-7706020);
        textView3.setTextSize(0, d8.m(carScreen, 18.0f));
        textView3.setGravity(17);
        textView3.setLineSpacing(k1.g(carScreen, 4.0f), 1.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = k1.g(carScreen, 8.0f);
        linearLayout2.addView(textView3, layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = k1.g(carScreen, 18.0f);
        LinearLayout linearLayout3 = new LinearLayout(carScreen);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        int iG6 = k1.g(carScreen, 22.0f);
        int iG7 = k1.g(carScreen, 12.0f);
        linearLayout3.setPadding(iG6, iG7, iG6, iG7);
        linearLayout3.setBackground(k1.t(-466994, k1.g(carScreen, 26.0f)));
        if (z2) {
            linearLayout3.setClickable(true);
            linearLayout3.setOnClickListener(new v2(carScreen, 5));
        } else {
            int iG8 = k1.g(carScreen, 22.0f);
            linearLayout3.addView(new e6(carScreen), new LinearLayout.LayoutParams(iG8, iG8));
        }
        TextView textView4 = new TextView(carScreen);
        textView4.setText(z2 ? "Nhập key kích hoạt" : "Đăng nhập xong, màn hình này sẽ tự chuyển");
        textView4.setTextColor(i2);
        textView4.setTextSize(0, d8.m(carScreen, 17.0f));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = z2 ? 0 : k1.g(carScreen, 10.0f);
        linearLayout3.addView(textView4, layoutParams5);
        linearLayout2.addView(linearLayout3, layoutParams4);
        addView(linearLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
    }

    public static float a(float f2, float[] fArr, float[] fArr2, Interpolator[] interpolatorArr) {
        int i2 = 0;
        while (i2 < fArr.length - 1) {
            int i3 = i2 + 1;
            float f3 = fArr[i3];
            if (f2 < f3) {
                float f4 = fArr[i2];
                float f5 = (f2 - f4) / (f3 - f4);
                float f6 = fArr2[i2];
                return (interpolatorArr[i2].getInterpolation(f5) * (fArr2[i3] - f6)) + f6;
            }
            i2 = i3;
        }
        return fArr2[fArr2.length - 1];
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 3600.0f);
        this.b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(3600L);
        this.b.setInterpolator(c);
        this.b.setRepeatCount(-1);
        this.b.addUpdateListener(new q1(this, 1));
        this.b.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
    }
}
