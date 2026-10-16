package com.waze.feedback;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.activity.SystemBarStyle;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.waze.R;
import com.waze.cz;
import com.waze.sharedui.web.WazeWebView;
import com.waze.strings.DisplayStrings;
import h.g.b.x;
import h.n.o;
import java.util.LinkedHashMap;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class FeedbackActivity extends com.waze.sharedui.a.e {

    /* renamed from: f, reason: collision with root package name */
    public i f23846f;

    /* renamed from: g, reason: collision with root package name */
    private com.waze.sharedui.d.b f23847g;

    /* renamed from: h, reason: collision with root package name */
    private WazeWebView f23848h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f23849i = com.waze.shared_infra.o.b.a();

    static final void g(FeedbackActivity feedbackActivity, Boolean bool) {
        if (!x.n(bool, true)) {
            feedbackActivity.n();
            return;
        }
        feedbackActivity.n();
        com.waze.sharedui.d.b bVar = new com.waze.sharedui.d.b(feedbackActivity, "", 0);
        bVar.setCancelable(false);
        bVar.setCanceledOnTouchOutside(false);
        bVar.f(false);
        bVar.show();
        feedbackActivity.f23847g = bVar;
    }

    static final WindowInsetsCompat l(FeedbackActivity feedbackActivity, View view, LinearLayout linearLayout, WindowInsetsCompat windowInsetsCompat) {
        Insets insets;
        Insets insets2 = windowInsetsCompat.getInsets(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL);
        DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
        int safeInsetLeft = displayCutout != null ? displayCutout.getSafeInsetLeft() : 0;
        int safeInsetTop = displayCutout != null ? displayCutout.getSafeInsetTop() : 0;
        int safeInsetRight = displayCutout != null ? displayCutout.getSafeInsetRight() : 0;
        int safeInsetBottom = displayCutout != null ? displayCutout.getSafeInsetBottom() : 0;
        int i2 = feedbackActivity.getResources().getConfiguration().orientation;
        x.c(view);
        x.f(view, "<this>");
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
        int iAbs = (rootWindowInsets == null || (insets = rootWindowInsets.getInsets(1)) == null) ? 0 : Math.abs(insets.top - insets.bottom);
        int iC = com.waze.design_components.d.b.c(view);
        if (i2 == 1) {
            x.c(linearLayout);
            LinearLayout linearLayout2 = linearLayout;
            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = com.waze.design_components.g.b.c(feedbackActivity, 56) + iAbs;
            linearLayout2.setLayoutParams(layoutParams);
            linearLayout.setPadding(linearLayout.getPaddingLeft(), iAbs, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
            WazeWebView wazeWebView = feedbackActivity.f23848h;
            WazeWebView wazeWebView2 = null;
            if (wazeWebView == null) {
                x.j("webView");
                wazeWebView = null;
            }
            WazeWebView wazeWebView3 = feedbackActivity.f23848h;
            if (wazeWebView3 == null) {
                x.j("webView");
                wazeWebView3 = null;
            }
            int paddingLeft = wazeWebView3.getPaddingLeft();
            WazeWebView wazeWebView4 = feedbackActivity.f23848h;
            if (wazeWebView4 == null) {
                x.j("webView");
                wazeWebView4 = null;
            }
            int paddingTop = wazeWebView4.getPaddingTop();
            WazeWebView wazeWebView5 = feedbackActivity.f23848h;
            if (wazeWebView5 == null) {
                x.j("webView");
            } else {
                wazeWebView2 = wazeWebView5;
            }
            wazeWebView.setPadding(paddingLeft, paddingTop, wazeWebView2.getPaddingRight(), iC);
            view.setPadding(0, 0, 0, 0);
        } else {
            view.setPadding(insets2.left + safeInsetLeft, insets2.top + safeInsetTop, insets2.right + safeInsetRight, insets2.bottom + safeInsetBottom);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    static final void m(FeedbackActivity feedbackActivity) {
        WazeWebView wazeWebView = feedbackActivity.f23848h;
        if (wazeWebView == null) {
            x.j("webView");
            wazeWebView = null;
        }
        if (wazeWebView.I()) {
            return;
        }
        feedbackActivity.finish();
    }

    private final void n() {
        com.waze.sharedui.d.b bVar = this.f23847g;
        if (bVar != null) {
            bVar.e();
        }
        this.f23847g = null;
    }

    public final i f() {
        i iVar = this.f23846f;
        if (iVar != null) {
            return iVar;
        }
        x.j("viewModel");
        return null;
    }

    @Override // com.waze.sharedui.a.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        WazeWebView wazeWebView = this.f23848h;
        if (wazeWebView == null) {
            x.j("webView");
            wazeWebView = null;
        }
        if (wazeWebView.I()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.web_page_with_title);
        View viewFindViewById = findViewById(R.id.webView);
        x.e(viewFindViewById, "findViewById(...)");
        this.f23848h = (WazeWebView) viewFindViewById;
        EdgeToEdge.enable(this, SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null), SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.webTitleLayout);
        View viewFindViewById2 = findViewById(android.R.id.content);
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById2, new a(this, viewFindViewById2, linearLayout, 0));
        findViewById(R.id.backButton).setOnClickListener(new b(this, 0));
        ((TextView) findViewById(R.id.pageTitle)).setText(this.f23849i.c(R.string.SETTINGS_FEEDBACK, new Object[0]));
        i iVar = (i) new ViewModelProvider(this).get(i.class);
        x.f(iVar, "<set-?>");
        this.f23846f = iVar;
        FeedbackActivity feedbackActivity = this;
        f().b().observe(feedbackActivity, new cz(this, 4));
        f().a().observe(feedbackActivity, new Observer() { // from class: com.waze.feedback.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FeedbackActivity.g(this.f23856a, (Boolean) obj);
            }
        });
        String stringExtra = getIntent().getStringExtra("ARG_LOG_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = getIntent().getStringExtra("ARG_SERVER_COOKIE");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        String stringExtra3 = getIntent().getStringExtra("ARG_FEEDBACK_URL");
        String str = stringExtra3 != null ? stringExtra3 : "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!o.G(stringExtra2)) {
            linkedHashMap.put("X-Waze-Mobile-RT-Token", stringExtra2);
        }
        WazeWebView wazeWebView = this.f23848h;
        if (wazeWebView == null) {
            x.j("webView");
            wazeWebView = null;
        }
        WebSettings webSettingsA = wazeWebView.a();
        if (webSettingsA != null) {
            webSettingsA.setCacheMode(2);
        }
        wazeWebView.F(new d(wazeWebView, this, stringExtra));
        wazeWebView.D(new e(this));
        wazeWebView.u(str, linkedHashMap);
    }

    @Override // com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected final void onDestroy() {
        WazeWebView wazeWebView = this.f23848h;
        if (wazeWebView == null) {
            x.j("webView");
            wazeWebView = null;
        }
        wazeWebView.s();
        super.onDestroy();
    }

    @Override // com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    protected final void onPause() {
        super.onPause();
        n();
    }
}
