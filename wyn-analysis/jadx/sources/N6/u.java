package N6;

import G6.U;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.moloco.sdk.internal.publisher.H;
import x3.AbstractC4467j;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f8550b;

    public /* synthetic */ u(v vVar, int i5) {
        this.f8549a = i5;
        this.f8550b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebViewClient webViewClientE;
        switch (this.f8549a) {
            case 0:
                v vVar = this.f8550b;
                synchronized (vVar.f8553c) {
                    WebView webView = vVar.f8556f;
                    if (webView == null) {
                        return;
                    }
                    try {
                        U u10 = C6.n.f1857D.f1863c;
                        if (Build.VERSION.SDK_INT < 26) {
                            if (H.b0("GET_WEB_VIEW_CLIENT")) {
                                try {
                                    webViewClientE = AbstractC4467j.e(webView);
                                } catch (RuntimeException e7) {
                                    C6.n.f1857D.f1868h.zzh(e7, "AdUtil.getWebViewClient");
                                }
                            }
                            throw new IllegalStateException("getWebViewClient not supported");
                        }
                        webViewClientE = webView.getWebViewClient();
                        if (webViewClientE == vVar) {
                            return;
                        }
                        if (webViewClientE != null) {
                            vVar.f8555e = webViewClientE;
                        }
                        webView.setWebViewClient(vVar);
                        vVar.a();
                        return;
                    } catch (IllegalStateException unused) {
                        return;
                    }
                }
            default:
                v vVar2 = this.f8550b;
                vVar2.f8552b.execute(new u(vVar2, 0));
                return;
        }
    }
}
