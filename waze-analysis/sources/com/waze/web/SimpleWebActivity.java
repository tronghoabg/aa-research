package com.waze.web;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.waze.R;
import com.waze.sharedui.views.ProgressAnimation;
import com.waze.sharedui.web.WazeWebView;
import com.waze.view.title.TitleBar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class SimpleWebActivity extends com.waze.ifs.ui.a {

    /* renamed from: g, reason: collision with root package name */
    public static final int f45474g = com.waze.utils.o.e(com.waze.utils.f.ACTIVITY_RESULT);

    /* renamed from: f, reason: collision with root package name */
    private String f45475f;

    /* renamed from: h, reason: collision with root package name */
    protected WazeWebView f45476h;

    /* renamed from: k, reason: collision with root package name */
    protected TitleBar f45477k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f45478l;
    private ProgressAnimation n;
    private final com.waze.shared_infra.o.a m = com.waze.shared_infra.o.b.a();
    private boolean o = false;

    public static b p(Activity activity) {
        return new b(activity);
    }

    static /* bridge */ /* synthetic */ void r(SimpleWebActivity simpleWebActivity) {
        simpleWebActivity.n.b();
        simpleWebActivity.n.setVisibility(8);
        simpleWebActivity.f45477k.setVisibility(0);
    }

    static /* bridge */ /* synthetic */ void s(SimpleWebActivity simpleWebActivity) {
        simpleWebActivity.f45477k.setVisibility(4);
        simpleWebActivity.n.setVisibility(0);
        simpleWebActivity.n.a();
    }

    public static Intent z(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) SimpleWebActivity.class);
        intent.putExtra("webViewTitle", str);
        intent.putExtra("webViewURL", str2);
        return intent;
    }

    protected boolean br() {
        return true;
    }

    @Override // com.waze.app_nav.hub.af
    public final boolean k() {
        return this.o;
    }

    public void n() {
    }

    @Override // com.waze.sharedui.a.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        WazeWebView wazeWebView;
        if (!br() || (wazeWebView = this.f45476h) == null) {
            super.onBackPressed();
        } else {
            if (wazeWebView.I()) {
                return;
            }
            setResult(0);
            finish();
        }
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String stringExtra;
        aE();
        super.onCreate(bundle);
        this.o = getIntent().getBooleanExtra("blockPopups", false);
        setContentView(R.layout.web_simple);
        this.f45477k = (TitleBar) findViewById(R.id.webTitle);
        this.n = (ProgressAnimation) findViewById(R.id.webTitleProgress);
        this.f45478l = getIntent().getBooleanExtra("webViewShowClose", true);
        String stringExtra2 = getIntent().getStringExtra("webViewTitle");
        this.f45475f = stringExtra2;
        if (stringExtra2 != null) {
            x(stringExtra2, this.f45478l);
        }
        this.f45477k.n(new com.waze.uid.activities.c(this, 14));
        this.f45477k.m(new View.OnClickListener() { // from class: com.waze.web.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SimpleWebActivity simpleWebActivity = this.f45479a;
                if (simpleWebActivity.f45476h.I()) {
                    return;
                }
                simpleWebActivity.setResult(0);
                simpleWebActivity.finish();
            }
        });
        WazeWebView wazeWebView = (WazeWebView) findViewById(R.id.webView);
        this.f45476h = wazeWebView;
        wazeWebView.C("SimpleWebActivity");
        this.f45476h.D(new f(this, 1));
        this.f45476h.getViewTreeObserver().addOnGlobalLayoutListener(new g(this, 1));
        this.f45476h.F(new h(this, 1));
        if ((bundle == null || !bundle.containsKey("webViewState") || bundle.getBundle("webViewState").isEmpty()) && (stringExtra = getIntent().getStringExtra("webViewURL")) != null) {
            v(stringExtra);
        }
        com.waze.shared_infra.g.e.d((ViewGroup) findViewById(R.id.simpleWebContainer), findViewById(R.id.webView));
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        WazeWebView wazeWebView = this.f45476h;
        if (wazeWebView != null) {
            wazeWebView.s();
            this.f45476h = null;
        }
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        Bundle bundle2 = bundle.getBundle("webViewState");
        WazeWebView wazeWebView = this.f45476h;
        if (wazeWebView != null) {
            wazeWebView.z(bundle2);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        WazeWebView wazeWebView = this.f45476h;
        if (wazeWebView != null) {
            wazeWebView.A(bundle2);
        }
        bundle.putBundle("webViewState", bundle2);
        super.onSaveInstanceState(bundle);
    }

    protected final void v(String str) {
        com.waze.shared_infra.i.h.a("SimpleWebActivity.loadUrl() url=".concat(String.valueOf(str)));
        WazeWebView wazeWebView = this.f45476h;
        if (wazeWebView != null) {
            wazeWebView.t(str);
        }
    }

    protected final void w(String str) {
        x(str, true);
    }

    protected final void x(String str, boolean z) {
        this.f45475f = str;
        TitleBar titleBar = this.f45477k;
        if (z) {
            titleBar.c(str);
        } else {
            titleBar.e(str, false);
        }
    }
}
