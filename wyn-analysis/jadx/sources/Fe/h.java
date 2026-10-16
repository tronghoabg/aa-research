package Fe;

import Ef.H;
import W9.u;
import a2.C1323c;
import a2.v;
import a9.C1342b;
import ac.C1346a;
import ad.r;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.fragment.app.C1414c0;
import androidx.fragment.app.F;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.X;
import androidx.fragment.app.e0;
import ba.C1521a;
import be.EnumC1525a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.qonversion.android.sdk.dto.QonversionError;
import com.wynauto.wyn.R;
import io.qonversion.nocodes.internal.screen.view.ScreenActivity;
import java.util.Locale;
import k3.C3184p;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import me.C3558a;
import ne.C3618a;
import org.jetbrains.annotations.NotNull;
import re.C3979c;
import vf.AbstractC4345a;
import xf.AbstractC4513a;
import xf.AbstractC4516d;
import y3.C4552j;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LFe/h;", "Landroidx/fragment/app/F;", "", "<init>", "()V", "", PglCryptUtils.KEY_MESSAGE, "Lef/C;", "jsMessageReceived", "(Ljava/lang/String;)V", "nocodes_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends F {

    /* renamed from: a, reason: collision with root package name */
    public final a f4087a;

    /* renamed from: b, reason: collision with root package name */
    public final C1346a f4088b;

    /* renamed from: c, reason: collision with root package name */
    public final C3979c f4089c;

    /* renamed from: d, reason: collision with root package name */
    public X2.j f4090d;

    public h() {
        X2.j jVar = X2.j.f16073d;
        if (jVar == null) {
            AbstractC3340k.m("instance");
            throw null;
        }
        u uVar = (u) jVar.f16076c;
        X2.j jVar2 = (X2.j) uVar.f15389a;
        C3618a c3618a = (C3618a) jVar2.f16075b;
        SharedPreferences sharedPreferences = ((Application) ((C1323c) c3618a.f41021b).f17156b).getSharedPreferences("io.qonversion.nocodes", 0);
        AbstractC3340k.d(sharedPreferences, "getSharedPreferences(...)");
        v vVar = new v(sharedPreferences, 8);
        ((C3558a) c3618a.f41022c).getClass();
        Locale locale = Locale.getDefault();
        AbstractC3340k.d(locale, "getDefault(...)");
        C8.i iVar = (C8.i) c3618a.f41020a;
        C8.i iVar2 = new C8.i(vVar, locale, iVar);
        String str = ((C3184p) iVar.f1940c).f39243a;
        C1521a c1521a = new C1521a((Object) iVar2, false, (Object) (str == null ? "https://api2.qonversion.io/" : str), 29);
        C1342b c1342b = new C1342b();
        C3558a c3558a = (C3558a) c3618a.f41022c;
        v6.l lVar = new v6.l(new X(7));
        c3558a.getClass();
        AbstractC4513a abstractC4513a = AbstractC4516d.f47897a;
        Ce.a aVar = new Ce.a(c1521a, new C8.i(lVar, new r(), (C8.i) c3618a.f41020a, new ab.b(), c1342b), new a2.k(), ((C3558a) jVar2.f16076c).D());
        C3558a c3558a2 = (C3558a) uVar.f15390b;
        this.f4087a = new m(aVar, this, c3558a2.D(), (C8.i) c3558a2.f40737b, new X(7), new X(6));
        X2.j jVar3 = X2.j.f16073d;
        if (jVar3 == null) {
            AbstractC3340k.m("instance");
            throw null;
        }
        this.f4088b = ((C3558a) jVar3.f16075b).D();
        X2.j jVar4 = X2.j.f16073d;
        if (jVar4 != null) {
            this.f4089c = (C3979c) ((C8.i) ((C3558a) jVar4.f16075b).f40737b).f1942e;
        } else {
            AbstractC3340k.m("instance");
            throw null;
        }
    }

    public static final void G(h hVar, String str, QonversionError qonversionError, ae.f fVar) {
        hVar.getClass();
        fVar.f17650c = new G9.e(EnumC1525a.f19468l, (String) null, qonversionError);
        hVar.I(str, qonversionError.getDescription(), fVar);
    }

    public final void H(ae.f fVar) {
        X2.j jVar = this.f4090d;
        ProgressBar progressBar = jVar != null ? (ProgressBar) ((C4552j) jVar.f16075b).f48001b : null;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        FragmentActivity activity = getActivity();
        ScreenActivity screenActivity = activity instanceof ScreenActivity ? (ScreenActivity) activity : null;
        boolean z2 = false;
        if (screenActivity != null) {
            e0 supportFragmentManager = screenActivity.getSupportFragmentManager();
            boolean z10 = supportFragmentManager.f18411d.size() + (supportFragmentManager.f18415h != null ? 1 : 0) == 0;
            if (z10) {
                screenActivity.finish();
            } else {
                e0 supportFragmentManager2 = screenActivity.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                supportFragmentManager2.x(new C1414c0(supportFragmentManager2, -1, 0), false);
            }
            z2 = z10;
        }
        C3979c c3979c = this.f4089c;
        if (c3979c != null) {
            c3979c.e(fVar);
        }
        if (!z2 || c3979c == null) {
            return;
        }
        c3979c.c();
    }

    public final void I(String str, String str2, ae.f fVar) {
        X2.j jVar = this.f4090d;
        ProgressBar progressBar = jVar != null ? (ProgressBar) ((C4552j) jVar.f16075b).f48001b : null;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        Ba.c.q(this.f4088b, N0.a.h("ScreenActivity ", str, " -> ", str2));
        C3979c c3979c = this.f4089c;
        if (c3979c != null) {
            c3979c.b(fVar);
        }
    }

    @JavascriptInterface
    public final void jsMessageReceived(@NotNull String message) {
        AbstractC3340k.e(message, "message");
        Log.d("JSMessage", message);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new C8.d(7, this, message));
        }
    }

    @Override // androidx.fragment.app.F
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3340k.e(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.nc_fragment_screen, viewGroup, false);
        int i5 = R.id.progressBarLayout;
        View viewQ = AbstractC4345a.q(R.id.progressBarLayout, viewInflate);
        if (viewQ != null) {
            ProgressBar progressBar = (ProgressBar) AbstractC4345a.q(R.id.progressBar, viewQ);
            if (progressBar == null) {
                throw new NullPointerException("Missing required view with ID: ".concat(viewQ.getResources().getResourceName(R.id.progressBar)));
            }
            C4552j c4552j = new C4552j(progressBar, 28);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
            WebView webView = (WebView) AbstractC4345a.q(R.id.webView, viewInflate);
            if (webView != null) {
                this.f4090d = new X2.j(relativeLayout, c4552j, webView, 3);
                AbstractC3340k.d(relativeLayout, "getRoot(...)");
                return relativeLayout;
            }
            i5 = R.id.webView;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i5)));
    }

    @Override // androidx.fragment.app.F
    public final void onDestroyView() {
        super.onDestroyView();
        this.f4090d = null;
    }

    @Override // androidx.fragment.app.F
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC3340k.e(view, "view");
        X2.j jVar = this.f4090d;
        WebSettings settings = jVar != null ? ((WebView) jVar.f16076c).getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        X2.j jVar2 = this.f4090d;
        if (jVar2 != null) {
            ((WebView) jVar2.f16076c).addJavascriptInterface(this, "NoCodesMessageHandler");
        }
        X2.j jVar3 = this.f4090d;
        WebView webView = jVar3 != null ? (WebView) jVar3.f16076c : null;
        if (webView != null) {
            webView.setVisibility(8);
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("contextKey") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString(com.qonversion.android.sdk.automations.mvp.ScreenActivity.INTENT_SCREEN_ID) : null;
        m mVar = (m) this.f4087a;
        mVar.getClass();
        H.D(mVar.f4107g, null, new l(mVar, string, string2, null), 3);
    }
}
