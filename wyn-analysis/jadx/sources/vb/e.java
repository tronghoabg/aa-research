package vb;

import android.webkit.WebView;
import java.lang.reflect.Type;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import v6.l;
import x6.InterfaceC4487r;
import y3.InterfaceC4561s;
import zg.C4668g;
import zg.C4683w;
import zg.InterfaceC4666e;

/* loaded from: classes4.dex */
public final class e implements InterfaceC4487r, InterfaceC4561s, InterfaceC4666e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f47151a;

    public /* synthetic */ e(Object obj) {
        this.f47151a = obj;
    }

    @Override // zg.InterfaceC4666e
    public Type a() {
        return (Type) this.f47151a;
    }

    @Override // y3.InterfaceC4561s
    public String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f47151a).getSupportedFeatures();
    }

    @Override // y3.InterfaceC4561s
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) tg.b.o(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f47151a).createWebView(webView));
    }

    @Override // zg.InterfaceC4666e
    public Object e(C4683w c4683w) {
        C4668g c4668g = new C4668g(c4683w);
        c4683w.i(new l(c4668g));
        return c4668g;
    }

    @Override // y3.InterfaceC4561s
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) tg.b.o(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f47151a).getProfileStore());
    }

    @Override // y3.InterfaceC4561s
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) tg.b.o(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f47151a).getStatics());
    }

    @Override // y3.InterfaceC4561s
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) tg.b.o(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f47151a).getWebkitToCompatConverter());
    }

    @Override // x6.InterfaceC4487r
    public void onUserEarnedReward(R6.b bVar) {
        ((f) this.f47151a).f47153c.onUserEarnedReward();
    }
}
