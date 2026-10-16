package defpackage;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.location.LocationRequestCompat;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.launcher.Ui;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class z4 {
    public final CarScreen a;
    public final x4 b;
    public LinearLayout c;
    public LinearLayout d;
    public TextView e;
    public ImageView f;
    public ImageView g;
    public View h;
    public View i;

    public z4(CarScreen carScreen, x4 x4Var) {
        this.a = carScreen;
        this.b = x4Var;
    }

    public static LinearLayout.LayoutParams b(int i, int i2, int i3, int i4, int i5) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i2);
        layoutParams.topMargin = i3;
        layoutParams.leftMargin = i4;
        layoutParams.bottomMargin = i5;
        return layoutParams;
    }

    public final TextView a(String str) {
        CarScreen carScreen = this.a;
        TextView textView = new TextView(carScreen);
        textView.setText(str);
        textView.setTypeface(d8.f(carScreen, 1));
        textView.setTextSize(0, d8.m(carScreen, 16.0f));
        textView.setLetterSpacing(0.1f);
        textView.setTextColor(d8.j(600));
        return textView;
    }

    public final void c(ArrayList arrayList) {
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        int iMin = Math.min(4, arrayList.size());
        int i = -2;
        CarScreen carScreen = this.a;
        if (iMin == 0) {
            TextView textView = new TextView(carScreen);
            textView.setText("Chưa có video nào — chọn nguồn ở thanh trái để bắt đầu");
            textView.setTypeface(d8.d(0, carScreen, "fonts/BeVietnamPro-Regular.ttf"));
            textView.setTextSize(0, d8.m(carScreen, 19.0f));
            textView.setTextColor(d8.p());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = d8.g(carScreen, 8);
            this.d.addView(textView, layoutParams);
            return;
        }
        int i2 = 0;
        while (i2 < iMin) {
            y4 y4Var = (y4) arrayList.get(i2);
            LinearLayout linearLayout2 = new LinearLayout(carScreen);
            linearLayout2.setOrientation(1);
            k1.B(linearLayout2, d8.n(), false, d8.g(carScreen, 28));
            linearLayout2.setPadding(d8.g(carScreen, 12), d8.g(carScreen, 12), d8.g(carScreen, 12), d8.g(carScreen, 12));
            linearLayout2.setElevation(d8.g(carScreen, 3));
            linearLayout2.setOnClickListener(new u0(4, this, y4Var));
            FrameLayout frameLayout = new FrameLayout(carScreen);
            frameLayout.setBackground(k1.t(d8.j(300), d8.g(carScreen, 18)));
            frameLayout.setClipToOutline(true);
            Bitmap bitmap = y4Var.h;
            int i3 = y4Var.g;
            if (bitmap != null) {
                ImageView imageView = new ImageView(carScreen);
                imageView.setImageBitmap(y4Var.h);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            } else if (i3 != 0) {
                ImageView imageView2 = new ImageView(carScreen);
                imageView2.setImageResource(i3);
                imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView2.setAlpha(0.92f);
                int iG = d8.g(carScreen, 56);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iG, iG);
                layoutParams2.gravity = 17;
                frameLayout.addView(imageView2, layoutParams2);
            }
            linearLayout2.addView(frameLayout, new LinearLayout.LayoutParams(-1, d8.g(carScreen, LocationRequestCompat.QUALITY_LOW_POWER)));
            LinearLayout linearLayout3 = new LinearLayout(carScreen);
            linearLayout3.setOrientation(0);
            linearLayout3.setGravity(16);
            TextView textView2 = new TextView(carScreen);
            textView2.setText(y4Var.b.toUpperCase());
            textView2.setTypeface(d8.f(carScreen, 1));
            textView2.setTextSize(0, d8.m(carScreen, 14.0f));
            textView2.setLetterSpacing(0.06f);
            textView2.setTextColor(d8.b(700));
            linearLayout3.addView(textView2);
            TextView textView3 = new TextView(carScreen);
            textView3.setText(y4Var.d);
            textView3.setTypeface(Typeface.MONOSPACE);
            textView3.setTextSize(0, d8.m(carScreen, 14.0f));
            textView3.setTextColor(d8.j(600));
            linearLayout3.addView(textView3, b(i, i, 0, d8.g(carScreen, 8), 0));
            linearLayout2.addView(linearLayout3, b(-1, i, d8.g(carScreen, 8), 0, d8.g(carScreen, 4)));
            TextView textView4 = new TextView(carScreen);
            textView4.setText(y4Var.c);
            textView4.setTypeface(d8.f(carScreen, 1));
            textView4.setTextSize(0, d8.m(carScreen, 18.0f));
            textView4.setTextColor(d8.o());
            textView4.setMaxLines(2);
            textView4.setEllipsize(TextUtils.TruncateAt.END);
            textView4.setLines(2);
            linearLayout2.addView(textView4);
            int i4 = y4Var.e;
            FrameLayout frameLayout2 = new FrameLayout(carScreen);
            frameLayout2.setBackground(k1.t(d8.j(200), d8.g(carScreen, Ui.R_PILL)));
            View view = new View(carScreen);
            view.setBackground(k1.t(d8.a(), d8.g(carScreen, Ui.R_PILL)));
            int iMax = Math.max(0, Math.min(100, i4));
            LinearLayout linearLayout4 = new LinearLayout(carScreen);
            linearLayout4.setOrientation(0);
            linearLayout4.addView(view, new LinearLayout.LayoutParams(0, -1, iMax));
            linearLayout4.addView(new View(carScreen), new LinearLayout.LayoutParams(0, -1, 100 - iMax));
            frameLayout2.addView(linearLayout4, new FrameLayout.LayoutParams(-1, -1));
            linearLayout2.addView(frameLayout2, b(-1, d8.g(carScreen, 6), d8.g(carScreen, 8), 0, d8.g(carScreen, 2)));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(d8.g(carScreen, 240), -2);
            if (i2 > 0) {
                layoutParams3.leftMargin = d8.g(carScreen, 18);
            }
            this.d.addView(linearLayout2, layoutParams3);
            i2++;
            i = -2;
        }
    }
}
