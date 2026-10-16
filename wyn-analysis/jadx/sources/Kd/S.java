package kd;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.moloco.sdk.internal.publisher.C1915d;

/* loaded from: classes5.dex */
public final /* synthetic */ class S implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f39609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f39610c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f39611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WebViewClient f39612e;

    public /* synthetic */ S(WebViewClient webViewClient, WebView webView, float f10, float f11, int i5) {
        this.f39608a = i5;
        this.f39612e = webViewClient;
        this.f39609b = webView;
        this.f39610c = f10;
        this.f39611d = f11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39608a) {
            case 0:
                double d3 = this.f39610c;
                double d5 = this.f39611d;
                C1915d c1915d = new C1915d(24);
                T t10 = (T) this.f39612e;
                t10.f39614a.m(t10, this.f39609b, d3, d5, c1915d);
                break;
            default:
                double d10 = this.f39610c;
                double d11 = this.f39611d;
                C1915d c1915d2 = new C1915d(25);
                W w2 = (W) this.f39612e;
                w2.f39626a.m(w2, this.f39609b, d10, d11, c1915d2);
                break;
        }
    }
}
