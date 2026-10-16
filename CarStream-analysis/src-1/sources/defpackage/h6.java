package defpackage;

import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.carstream.tech.apps.auth.LoginActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class h6 extends WebViewClient {
    public boolean a;
    public final /* synthetic */ LoginActivity b;

    public h6(LoginActivity loginActivity) {
        this.b = loginActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        boolean z = this.a;
        LoginActivity loginActivity = this.b;
        if (!z) {
            this.a = true;
            z2 z2Var = loginActivity.app.f;
            String str2 = loginActivity.app.a;
            for (String str3 : (String[]) z2Var.d) {
                String cookie = CookieManager.getInstance().getCookie(str3);
                if (cookie != null) {
                    StringBuilder sb = new StringBuilder();
                    for (String str4 : cookie.split(";")) {
                        int iIndexOf = str4.indexOf(61);
                        if (iIndexOf > 0) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(str4.substring(0, iIndexOf).trim());
                            sb.append('(');
                            sb.append((str4.length() - iIndexOf) - 1);
                            sb.append(')');
                        }
                    }
                }
            }
            z2Var.j();
        }
        String strK = loginActivity.app.f.k();
        if (strK != null) {
            webView.evaluateJavascript(strK, null);
        }
        z2 z2Var2 = loginActivity.app.f;
        if (str == null) {
            z2Var2.getClass();
            return;
        }
        if (str.contains((String) z2Var2.b) && z2Var2.j()) {
            CookieManager.getInstance().flush();
            String str5 = loginActivity.app.a;
            z6.r(loginActivity.app.a);
            loginActivity.finish();
        }
    }
}
