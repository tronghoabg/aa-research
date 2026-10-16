package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.carstream.tech.car.e;
import com.carstream.tech.launcher.Ui;
import com.carstream.tech.phone.MainActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class oc {
    public final MainActivity a;
    public LinearLayout b;
    public WebView c;
    public TextView d;
    public LinearLayout e;
    public ImageView f;
    public ImageView g;
    public o8 h;
    public dd i;
    public String j;
    public String k;

    public oc(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public static void a(oc ocVar, HorizontalScrollView horizontalScrollView) {
        ImageView imageView = ocVar.f;
        if (imageView == null || ocVar.g == null) {
            return;
        }
        imageView.setVisibility(horizontalScrollView.canScrollHorizontally(-1) ? 0 : 8);
        ocVar.g.setVisibility(horizontalScrollView.canScrollHorizontally(1) ? 0 : 8);
    }

    public final ImageView b(int i, int i2) {
        MainActivity mainActivity = this.a;
        ImageView imageView = new ImageView(mainActivity);
        imageView.setImageResource(i);
        imageView.setColorFilter(d8.p());
        imageView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(d8.g(mainActivity, 22), d8.g(mainActivity, 22));
        layoutParams.gravity = i2 | 16;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public final LinearLayout.LayoutParams c(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        MainActivity mainActivity = this.a;
        layoutParams.topMargin = d8.g(mainActivity, 0);
        layoutParams.bottomMargin = d8.g(mainActivity, i);
        return layoutParams;
    }

    public final void d(dd ddVar) {
        this.i = ddVar;
        f();
        if (this.c != null) {
            String strI = ddVar.g ? w1.i(this.k) : this.k;
            if (!strI.equals(this.c.getSettings().getUserAgentString())) {
                this.c.getSettings().setUserAgentString(strI);
            }
        }
        this.j = null;
        WebView webView = this.c;
        if (webView != null) {
            webView.loadUrl(ddVar.d);
        }
    }

    public final void e(String str) {
        y6 y6VarN;
        if (str == null || str.isEmpty() || str.equals(this.j) || this.i == null || (y6VarN = z6.n()) == null) {
            return;
        }
        this.j = str;
        ((e) y6VarN).q(this.i.a, str);
    }

    public final void f() {
        if (this.e == null) {
            return;
        }
        for (int i = 0; i < this.e.getChildCount(); i++) {
            View childAt = this.e.getChildAt(i);
            dd ddVar = this.i;
            boolean z = ddVar != null && ddVar.a.equals(childAt.getTag());
            k1.B(childAt, z ? d8.a() : d8.j(200), false, d8.g(this.a, Ui.R_PILL));
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
                    View childAt2 = linearLayout.getChildAt(i2);
                    if (childAt2 instanceof TextView) {
                        ((TextView) childAt2).setTextColor(z ? d8.k() : d8.o());
                    }
                }
            }
        }
    }
}
