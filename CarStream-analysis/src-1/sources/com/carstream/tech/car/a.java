package com.carstream.tech.car;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.car.app.CarContext;
import com.carstream.tech.R;
import defpackage.d8;
import defpackage.dd;
import defpackage.k1;
import defpackage.l0;
import defpackage.s2;
import defpackage.t0;
import defpackage.u0;
import defpackage.v0;
import defpackage.w0;
import defpackage.x0;
import defpackage.xc;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class a {
    public final CarScreen a;
    public final x0 b;
    public LinearLayout c;
    public View d;
    public FrameLayout e;
    public ImageView f;
    public ImageView g;
    public boolean h;
    public final ArrayList i = new ArrayList();

    public a(CarScreen carScreen, x0 x0Var) {
        this.a = carScreen;
        this.b = x0Var;
    }

    public static void a(a aVar, ScrollView scrollView) {
        ImageView imageView = aVar.f;
        if (imageView == null || aVar.g == null) {
            return;
        }
        imageView.setVisibility(scrollView.canScrollVertically(-1) ? 0 : 8);
        aVar.g.setVisibility(scrollView.canScrollVertically(1) ? 0 : 8);
    }

    public static void b(a aVar) {
        if (aVar.e()) {
            return;
        }
        aVar.d();
    }

    public static boolean f(ViewGroup viewGroup, float f, float f2) {
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            if (f >= iArr[0] && f < viewGroup.getWidth() + r2) {
                if (f2 >= iArr[1] && f2 < viewGroup.getHeight() + r1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final LinearLayout c() {
        CarScreen carScreen = this.a;
        LinearLayout linearLayout = new LinearLayout(carScreen);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setBackgroundColor(d8.n());
        linearLayout.setClickable(true);
        int iH = d8.h(carScreen, 10);
        linearLayout.setPadding(0, iH, 0, iH);
        linearLayout.setElevation(d8.h(carScreen, 8));
        ArrayList arrayList = this.i;
        arrayList.clear();
        LinearLayout linearLayoutJ = j(R.drawable.ic_nav_home, "Trang chủ", true, new t0(this, 2));
        linearLayout.addView(linearLayoutJ);
        arrayList.add(linearLayoutJ);
        LinearLayout linearLayout2 = new LinearLayout(carScreen);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        dd[] ddVarArrB = l0.b(carScreen);
        int length = ddVarArrB.length;
        int length2 = l0.a.length;
        for (dd ddVar : ddVarArrB) {
            LinearLayout linearLayoutJ2 = j(ddVar.c, ddVar.b, false, new u0(0, this, ddVar));
            linearLayout2.addView(linearLayoutJ2);
            arrayList.add(linearLayoutJ2);
        }
        ScrollView scrollView = new ScrollView(carScreen);
        scrollView.addView(linearLayout2, new FrameLayout.LayoutParams(-1, -2));
        scrollView.setVerticalScrollBarEnabled(true);
        scrollView.setScrollbarFadingEnabled(false);
        scrollView.setVerticalFadingEdgeEnabled(true);
        scrollView.setFadingEdgeLength(d8.h(carScreen, 20));
        this.f = h(R.drawable.ic_nav_up);
        this.g = h(R.drawable.ic_nav_down);
        linearLayout.addView(this.f, new LinearLayout.LayoutParams(-1, d8.h(carScreen, 20)));
        linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        linearLayout.addView(this.g, new LinearLayout.LayoutParams(-1, d8.h(carScreen, 20)));
        scrollView.setOnScrollChangeListener(new v0(this, scrollView, 0));
        scrollView.addOnLayoutChangeListener(new w0(this, scrollView, 0));
        if (xc.e(carScreen, "gamesEnabled", true)) {
            LinearLayout linearLayoutJ3 = j(R.drawable.ic_nav_games, "Trò chơi", true, new t0(this, 3));
            linearLayout.addView(linearLayoutJ3);
            arrayList.add(linearLayoutJ3);
        }
        if (xc.e(carScreen, "launcherEnabled", false)) {
            LinearLayout linearLayoutJ4 = j(R.drawable.ic_nav_apps, "Launcher", true, new t0(this, 4));
            linearLayout.addView(linearLayoutJ4);
            arrayList.add(linearLayoutJ4);
        }
        LinearLayout linearLayoutJ5 = j(R.drawable.ic_search, "Tìm", true, new o(this, 2));
        linearLayout.addView(linearLayoutJ5);
        arrayList.add(linearLayoutJ5);
        LinearLayout linearLayoutJ6 = j(R.drawable.ic_settings, "Cài đặt", true, new t0(this, 5));
        linearLayout.addView(linearLayoutJ6);
        arrayList.add(linearLayoutJ6);
        return linearLayout;
    }

    public final void d() {
        if (e()) {
            return;
        }
        this.h = false;
        this.c.animate().translationX(-d8.h(this.a, 90)).setDuration(220L).start();
        this.d.setVisibility(8);
        this.e.setVisibility(0);
        this.e.bringToFront();
    }

    public final boolean e() {
        String strG = xc.g(this.a, "toolbarMode", "auto");
        if (strG == null) {
            strG = "fixed";
        }
        boolean z = false;
        if ("float".equals(strG)) {
            return false;
        }
        if (!"auto".equals(strG)) {
            return true;
        }
        CarScreen carScreen = ((s2) this.b).a;
        if (carScreen.gamesShowing || carScreen.launcherShowing || (carScreen.currentApp != null && !carScreen.settingsShowing && !carScreen.homeShowing)) {
            z = true;
        }
        return !z;
    }

    public final int g() {
        if (e()) {
            return d8.h(this.a, 90);
        }
        return 0;
    }

    public final ImageView h(int i) {
        CarScreen carScreen = this.a;
        ImageView imageView = new ImageView(carScreen);
        imageView.setImageResource(i);
        imageView.setColorFilter(d8.a());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setVisibility(8);
        int iH = d8.h(carScreen, 3);
        imageView.setPadding(0, iH, 0, iH);
        return imageView;
    }

    public final void i() {
        LinearLayout linearLayout = this.c;
        if (linearLayout == null) {
            return;
        }
        linearLayout.animate().cancel();
        if (e()) {
            this.h = false;
            this.c.setTranslationX(0.0f);
            this.c.setVisibility(0);
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        this.c.setTranslationX(this.h ? 0.0f : -d8.h(this.a, 90));
        this.d.setVisibility(this.h ? 0 : 8);
        this.e.setVisibility(this.h ? 8 : 0);
        if (!this.h) {
            this.e.bringToFront();
        } else {
            this.d.bringToFront();
            this.c.bringToFront();
        }
    }

    public final LinearLayout j(int i, String str, boolean z, View.OnClickListener onClickListener) {
        CarScreen carScreen = this.a;
        LinearLayout linearLayout = new LinearLayout(carScreen);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        k1.B(linearLayout, 0, false, d8.h(carScreen, 28));
        linearLayout.setOnClickListener(onClickListener);
        ImageView imageView = new ImageView(carScreen);
        imageView.setImageResource(i);
        if (z) {
            imageView.setColorFilter(d8.o());
        } else {
            linearLayout.setTag(CarContext.APP_SERVICE);
        }
        int iH = d8.h(carScreen, 24);
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(iH, iH));
        TextView textView = new TextView(carScreen);
        textView.setText(str);
        textView.setTextSize(2, d8.l(carScreen, 1.0f) * 12.0f);
        textView.setTypeface(d8.f(carScreen, 1));
        textView.setTextColor(d8.o());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = d8.h(carScreen, 7);
        linearLayout.addView(textView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(d8.h(carScreen, 70), d8.h(carScreen, 62));
        layoutParams2.bottomMargin = d8.h(carScreen, 6);
        linearLayout.setLayoutParams(layoutParams2);
        return linearLayout;
    }
}
