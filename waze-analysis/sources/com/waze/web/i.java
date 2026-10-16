package com.waze.web;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.waze.R;
import com.waze.ab.ab;
import com.waze.sharedui.views.ProgressAnimation;
import com.waze.sharedui.web.WazeWebView;
import com.waze.view.title.TitleBar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends k {

    /* renamed from: a, reason: collision with root package name */
    private WazeWebView f45494a;

    /* renamed from: b, reason: collision with root package name */
    private TitleBar f45495b;

    /* renamed from: c, reason: collision with root package name */
    private ProgressAnimation f45496c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f45497d;

    /* renamed from: e, reason: collision with root package name */
    private String f45498e;

    /* renamed from: f, reason: collision with root package name */
    private String f45499f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f45500g = com.waze.shared_infra.o.b.a();

    static /* bridge */ /* synthetic */ void f(i iVar) {
        iVar.f45496c.b();
        iVar.f45496c.setVisibility(8);
        iVar.f45495b.setVisibility(0);
    }

    static /* bridge */ /* synthetic */ void g(i iVar) {
        iVar.f45495b.setVisibility(4);
        iVar.f45496c.setVisibility(0);
        iVar.f45496c.a();
    }

    public static /* synthetic */ void j(i iVar) {
        if (iVar.f45494a.I()) {
            return;
        }
        s();
    }

    protected static final void m() {
        s();
        com.waze.alerters.a.k.e().d();
        ab.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s() {
        com.waze.alerters.a.k.e().c();
    }

    protected final void h(String str, boolean z) {
        TitleBar titleBar = this.f45495b;
        if (z) {
            titleBar.c(str);
        } else {
            titleBar.e(str, false);
        }
    }

    @Override // android.support.v4.app.ar
    public final void onAttach(Context context) {
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new e(this));
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.web_simple, viewGroup, false);
    }

    @Override // android.support.v4.app.ar
    public final void onDestroyView() {
        this.f45494a.s();
        this.f45494a = null;
        this.f45495b = null;
        this.f45496c = null;
        super.onDestroyView();
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public final void m47x22bc4f96(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        this.f45494a.A(bundle2);
        bundle.putBundle("webViewState", bundle2);
    }

    @Override // com.waze.app_nav.a.b, android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.f45494a = (WazeWebView) view.findViewById(R.id.webView);
        this.f45495b = (TitleBar) view.findViewById(R.id.webTitle);
        this.f45496c = (ProgressAnimation) view.findViewById(R.id.webTitleProgress);
        p(this.f45494a);
        if (bundle != null) {
            this.f45494a.z(bundle.getBundle("webViewState"));
        }
        this.f45497d = getArguments().getBoolean("webViewShowClose", true);
        this.f45499f = getArguments().getString("webViewURL");
        String string = getArguments().getString("webViewTitle");
        this.f45498e = string;
        if (string != null) {
            h(string, this.f45497d);
        }
        this.f45495b.n(new com.waze.uid.activities.c(this, 15));
        this.f45495b.m(new com.waze.uid.activities.c(this, 16));
        this.f45494a.C("SimpleWebActivity");
        this.f45494a.D(new f(this, 0));
        this.f45494a.getViewTreeObserver().addOnGlobalLayoutListener(new g(this, 0));
        this.f45494a.F(new h(this, 0));
        if ((bundle == null || !bundle.containsKey("webViewState") || bundle.getBundle("webViewState").isEmpty()) && (str = this.f45499f) != null) {
            com.waze.shared_infra.i.h.a("SimpleWebActivity.loadUrl() url=".concat(str));
            this.f45494a.t(str);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this.f45494a, new com.waze.view.title.a(2));
    }
}
