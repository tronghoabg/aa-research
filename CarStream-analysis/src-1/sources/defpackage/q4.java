package defpackage;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.carstream.tech.R;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.launcher.Ui;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class q4 {
    public final CarScreen a;
    public final n4 b;
    public FrameLayout c;
    public LinearLayout d;
    public LinearLayout e;
    public LinearLayout f;
    public TextView g;
    public TextView h;
    public WebView i;
    public pc j;
    public int k;
    public int l;
    public int m;
    public int n;

    public q4(CarScreen carScreen, n4 n4Var) {
        this.a = carScreen;
        this.b = n4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void a(int i, int i2) {
        int i3;
        View view;
        this.m = i;
        this.n = i2;
        int i4 = 3;
        int iB = i > 0 ? b(i, i2) : 3;
        this.l = iB;
        this.f.removeAllViews();
        int i5 = ((iB + 2) / iB) * iB;
        ?? r4 = 0;
        ViewGroup viewGroup = null;
        int i6 = 0;
        while (i6 < i5) {
            int i7 = i6 % iB;
            CarScreen carScreen = this.a;
            ViewGroup viewGroup2 = viewGroup;
            if (i7 == 0) {
                LinearLayout linearLayout = new LinearLayout(carScreen);
                linearLayout.setOrientation(r4);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                if (i6 > 0) {
                    layoutParams.topMargin = d8.g(carScreen, 20);
                }
                this.f.addView(linearLayout, layoutParams);
                viewGroup2 = linearLayout;
            }
            if (i6 < i4) {
                pc pcVar = k1.d[i6];
                LinearLayout linearLayout2 = new LinearLayout(carScreen);
                linearLayout2.setOrientation(1);
                k1.B(linearLayout2, d8.n(), r4, d8.g(carScreen, 28));
                linearLayout2.setPadding(d8.g(carScreen, 12), d8.g(carScreen, 12), d8.g(carScreen, 12), d8.g(carScreen, 14));
                linearLayout2.setOnClickListener(new u0(3, this, pcVar));
                o4 o4Var = new o4(carScreen);
                o4Var.setImageResource(pcVar.d);
                o4Var.setScaleType(ImageView.ScaleType.CENTER_CROP);
                o4Var.setBackground(k1.t(d8.j(300), d8.g(carScreen, 14)));
                o4Var.setClipToOutline(true);
                linearLayout2.addView(o4Var, new LinearLayout.LayoutParams(-1, -2));
                TextView textViewC = c(14, 1, d8.o(), pcVar.b);
                textViewC.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textViewC.setEllipsize(truncateAt);
                int iG = d8.g(carScreen, 10);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.topMargin = iG;
                linearLayout2.addView(textViewC, layoutParams2);
                TextView textViewC2 = c(11, 0, d8.p(), pcVar.c);
                textViewC2.setMaxLines(1);
                textViewC2.setEllipsize(truncateAt);
                i3 = 3;
                int iG2 = d8.g(carScreen, 3);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.topMargin = iG2;
                linearLayout2.addView(textViewC2, layoutParams3);
                view = linearLayout2;
            } else {
                i3 = i4;
                view = new View(carScreen);
            }
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            if (i7 > 0) {
                layoutParams4.leftMargin = d8.g(carScreen, 20);
            }
            viewGroup2.addView(view, layoutParams4);
            i6++;
            i4 = i3;
            r4 = 0;
            viewGroup = viewGroup2;
        }
    }

    public final int b(int i, int i2) {
        int i3;
        CarScreen carScreen = this.a;
        Configuration configuration = carScreen.getResources().getConfiguration();
        FrameLayout frameLayout = this.c;
        int width = frameLayout != null ? frameLayout.getWidth() : 0;
        float f = (width <= 0 || (i3 = configuration.screenWidthDp) <= 0) ? carScreen.getResources().getDisplayMetrics().density : width / i3;
        if (f <= 0.0f) {
            return 3;
        }
        float f2 = i / f;
        float f3 = i2 / f;
        int iMax = Math.max(2, Math.min(Math.round((20.0f + f2) / 320.0f), 5));
        while (iMax < 5 && f3 > 0.0f && ((((f2 - ((iMax - 1) * 20)) / iMax) - 24.0f) * 0.75f) + 76.0f > f3) {
            iMax++;
        }
        return iMax;
    }

    public final TextView c(int i, int i2, int i3, String str) {
        CarScreen carScreen = this.a;
        TextView textView = new TextView(carScreen);
        textView.setText(str);
        textView.setTypeface(d8.f(carScreen, i2));
        textView.setTextSize(0, d8.m(carScreen, i));
        textView.setTextColor(i3);
        return textView;
    }

    public final void d() {
        WebView webView = this.i;
        if (webView == null) {
            return;
        }
        webView.evaluateJavascript("window.dispatchEvent(new Event('cargame:pause'))", null);
        this.i.onPause();
    }

    public final void e() {
        d();
        this.j = null;
        this.d.setVisibility(0);
        this.e.setVisibility(8);
    }

    public final FrameLayout f() {
        if (this.c == null) {
            CarScreen carScreen = this.a;
            FrameLayout frameLayout = new FrameLayout(carScreen);
            this.c = frameLayout;
            frameLayout.setBackgroundColor(d8.e());
            LinearLayout linearLayout = new LinearLayout(carScreen);
            linearLayout.setOrientation(1);
            linearLayout.setPadding(d8.g(carScreen, 32), d8.g(carScreen, 24), d8.g(carScreen, 32), 0);
            TextView textView = new TextView(carScreen);
            textView.setText("Trò chơi");
            textView.setTypeface(d8.i(carScreen));
            textView.setTextSize(0, d8.m(carScreen, 28.0f));
            textView.setTextColor(d8.o());
            textView.setIncludeFontPadding(false);
            linearLayout.addView(textView);
            LinearLayout linearLayout2 = new LinearLayout(carScreen);
            this.f = linearLayout2;
            linearLayout2.setOrientation(1);
            ScrollView scrollView = new ScrollView(carScreen);
            scrollView.addView(this.f, new FrameLayout.LayoutParams(-1, -2));
            scrollView.setVerticalScrollBarEnabled(true);
            scrollView.setScrollbarFadingEnabled(false);
            scrollView.setVerticalFadingEdgeEnabled(true);
            scrollView.setFadingEdgeLength(d8.g(carScreen, 20));
            scrollView.setClipToPadding(false);
            scrollView.setPadding(0, 0, 0, d8.g(carScreen, 20));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
            layoutParams.topMargin = d8.g(carScreen, 20);
            linearLayout.addView(scrollView, layoutParams);
            a(this.m, this.n);
            scrollView.addOnLayoutChangeListener(new w0(this, scrollView, 2));
            this.d = linearLayout;
            LinearLayout linearLayout3 = new LinearLayout(carScreen);
            linearLayout3.setOrientation(1);
            linearLayout3.setBackgroundColor(d8.j(900));
            LinearLayout linearLayout4 = new LinearLayout(carScreen);
            linearLayout4.setOrientation(0);
            linearLayout4.setGravity(16);
            linearLayout4.setBackgroundColor(-1205854691);
            linearLayout4.setPadding(d8.g(carScreen, 28), 0, d8.g(carScreen, 32), 0);
            l4 l4Var = new l4(this, 0);
            LinearLayout linearLayout5 = new LinearLayout(carScreen);
            linearLayout5.setOrientation(0);
            linearLayout5.setGravity(16);
            linearLayout5.setPadding(d8.g(carScreen, 16), 0, d8.g(carScreen, 20), 0);
            GradientDrawable gradientDrawableT = k1.t(0, d8.g(carScreen, Ui.R_PILL));
            gradientDrawableT.setStroke(Math.max(1, d8.g(carScreen, 1)), 1207563501);
            linearLayout5.setBackground(gradientDrawableT);
            linearLayout5.setOnClickListener(l4Var);
            ImageView imageView = new ImageView(carScreen);
            imageView.setImageResource(R.drawable.ic_nav_back);
            imageView.setColorFilter(d8.j(100));
            linearLayout5.addView(imageView, new LinearLayout.LayoutParams(d8.g(carScreen, 20), d8.g(carScreen, 20)));
            TextView textViewC = c(11, 1, d8.j(100), "Danh sách");
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = d8.g(carScreen, 10);
            linearLayout5.addView(textViewC, layoutParams2);
            linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(-2, d8.g(carScreen, 38)));
            linearLayout4.addView(linearLayout5);
            TextView textViewC2 = c(14, 1, d8.j(100), "");
            this.g = textViewC2;
            textViewC2.setTypeface(d8.i(carScreen));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams3.leftMargin = d8.g(carScreen, 20);
            linearLayout4.addView(this.g, layoutParams3);
            linearLayout4.addView(c(10, 0, d8.j(300), "Điểm"));
            TextView textViewC3 = c(13, 0, d8.j(100), "0");
            this.h = textViewC3;
            textViewC3.setTypeface(Typeface.MONOSPACE);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.leftMargin = d8.g(carScreen, 8);
            layoutParams4.rightMargin = d8.g(carScreen, 20);
            linearLayout4.addView(this.h, layoutParams4);
            TextView textViewC4 = c(11, 1, d8.k(), "Thoát");
            textViewC4.setGravity(17);
            textViewC4.setPadding(d8.g(carScreen, 22), 0, d8.g(carScreen, 22), 0);
            textViewC4.setHeight(d8.g(carScreen, 38));
            k1.B(textViewC4, d8.a(), false, d8.g(carScreen, Ui.R_PILL));
            textViewC4.setOnClickListener(new l4(this, 1));
            linearLayout4.addView(textViewC4);
            linearLayout3.addView(linearLayout4, new LinearLayout.LayoutParams(-1, d8.g(carScreen, 46)));
            FrameLayout frameLayout2 = new FrameLayout(carScreen);
            WebView webView = new WebView(carScreen);
            this.i = webView;
            webView.getSettings().setJavaScriptEnabled(true);
            this.i.getSettings().setAllowFileAccess(false);
            this.i.getSettings().setAllowContentAccess(false);
            this.i.getSettings().setDomStorageEnabled(true);
            this.i.getSettings().setMediaPlaybackRequiresUserGesture(false);
            this.i.setBackgroundColor(d8.j(900));
            this.i.setWebViewClient(new m4());
            this.i.addJavascriptInterface(new p4(this), "CarGame");
            frameLayout2.addView(this.i, new FrameLayout.LayoutParams(-1, -1));
            linearLayout3.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
            this.e = linearLayout3;
            this.c.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
            this.c.addView(this.e, new FrameLayout.LayoutParams(-1, -1));
            e();
        }
        return this.c;
    }
}
