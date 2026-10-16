package defpackage;

import android.media.AudioManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.WebView;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.TemplateWrapper;
import com.android.car.libraries.apphost.external.model.WebViewTemplate;
import com.google.android.apps.auto.components.apphost.basewidgets.action.ui.MaterialActionButtonView;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class kcc extends hlf {
    public static final yph a = yph.c("CarApp.H.Tem");
    public final ViewGroup b;
    public final geu c;
    private final ViewGroup d;
    private final MaterialActionButtonView e;
    private final WebView f;
    private final AudioManager g;
    private final AudioManager.OnAudioFocusChangeListener h;

    public kcc(geu geuVar, TemplateWrapper templateWrapper) {
        super(geuVar, templateWrapper, gzc.a);
        this.h = new iol(3);
        this.c = geuVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(geuVar).inflate(R.layout.web_view_template_layout, (ViewGroup) null);
        this.d = viewGroup;
        this.f = (WebView) viewGroup.findViewById(R.id.web_view_layout);
        this.e = (MaterialActionButtonView) viewGroup.findViewById(R.id.back_button);
        this.b = (ViewGroup) viewGroup.findViewById(R.id.web_view_container);
        AudioManager audioManager = (AudioManager) geuVar.getSystemService("audio");
        audioManager.getClass();
        this.g = audioManager;
    }

    private final View h() {
        leh.a();
        return this.e;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void F() {
        super.F();
        if (this.g.requestAudioFocus(this.h, 3, 1) == 0) {
            ((ype) ((ype) a.h()).ai((char) 2911)).u("Couldn't obtain audio focus for WebView template");
        }
    }

    @Override // defpackage.hlf
    protected final View a() {
        return h().getVisibility() == 0 ? h() : this.d;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void b() {
        super.b();
        this.g.abandonAudioFocus(this.h);
    }

    @Override // defpackage.hlf
    public final void d() {
        f();
    }

    @Override // defpackage.hlo
    public final View e() {
        return this.d;
    }

    public final void f() {
        WebViewTemplate webViewTemplate = (WebViewTemplate) C();
        if (webViewTemplate.getActionStrip() != null) {
            leh.a();
            MaterialActionButtonView materialActionButtonView = this.e;
            geu geuVar = this.i;
            ActionStrip actionStrip = webViewTemplate.getActionStrip();
            actionStrip.getClass();
            Action action = actionStrip.getActions().get(0);
            fyg fygVar = fwh.c;
            geuVar.getClass();
            action.getClass();
            MaterialActionButtonView.p(materialActionButtonView, geuVar, action, fygVar, null, null, 248);
            h().setVisibility(0);
        } else {
            h().setVisibility(8);
        }
        kcb kcbVar = new kcb(this, webViewTemplate);
        WebView webView = this.f;
        webView.setWebViewClient(kcbVar);
        if (!Objects.equals(webView.getUrl(), webViewTemplate.getUrl())) {
            webView.loadUrl(webViewTemplate.getUrl());
        }
        webView.getSettings().setBlockNetworkLoads(webViewTemplate.shouldBlockNetworkLoads());
        webView.getSettings().setDomStorageEnabled(webViewTemplate.isDomStorageEnabled());
        webView.getSettings().setJavaScriptEnabled(webViewTemplate.isJavascriptEnabled());
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void z(WindowInsets windowInsets, int i) {
        super.z(windowInsets, 0);
    }
}
