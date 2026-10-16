package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import com.vungle.ads.EvaluateJsError;
import ef.C2515C;
import ef.C2530n;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class v extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f33749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f33750b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33751c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, WebView webView, String str) {
        super(0);
        this.f33749a = zVar;
        this.f33750b = webView;
        this.f33751c = str;
    }

    @Override // tf.a
    public final Object invoke() {
        Object objZ;
        WebView webView = this.f33750b;
        String str = this.f33751c;
        C2515C c2515c = C2515C.f34653a;
        C2515C c2515c2 = null;
        if (webView != null) {
            try {
                webView.evaluateJavascript(str, null);
                c2515c2 = c2515c;
                objZ = c2515c2;
            } catch (Throwable th) {
                objZ = Fe.e.z(th);
            }
        } else {
            objZ = c2515c2;
        }
        z zVar = this.f33749a;
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Evaluate js failed ");
            sbA.append(thA.getLocalizedMessage());
            new EvaluateJsError(sbA.toString()).setLogEntry$vungle_ads_release(zVar.f33810a.q()).logErrorNoReturnValue$vungle_ads_release();
        }
        return c2515c;
    }
}
