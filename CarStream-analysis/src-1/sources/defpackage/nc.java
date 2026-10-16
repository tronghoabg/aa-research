package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class nc extends WebViewClient {
    public final /* synthetic */ oc a;

    public nc(oc ocVar) {
        this.a = ocVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        oc ocVar = this.a;
        ocVar.d.setText(str);
        o8 o8Var = ocVar.h;
        if (o8Var == null || !o8Var.a) {
            return;
        }
        ocVar.e(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.a.d.setText(str);
    }
}
