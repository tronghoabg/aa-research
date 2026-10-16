package kd;

import android.webkit.WebView;
import com.moloco.sdk.internal.publisher.C1915d;

/* loaded from: classes5.dex */
public final /* synthetic */ class Q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f39605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f39606c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f39607d;

    public /* synthetic */ Q(T t10, WebView webView, String str, int i5) {
        this.f39604a = i5;
        this.f39605b = t10;
        this.f39606c = webView;
        this.f39607d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39604a) {
            case 0:
                C1915d c1915d = new C1915d(24);
                T t10 = this.f39605b;
                t10.f39614a.o(t10, this.f39606c, this.f39607d, c1915d);
                break;
            case 1:
                C1915d c1915d2 = new C1915d(24);
                T t11 = this.f39605b;
                t11.f39614a.d(t11, this.f39606c, this.f39607d, c1915d2);
                break;
            case 2:
                C1915d c1915d3 = new C1915d(24);
                T t12 = this.f39605b;
                t12.f39614a.c(t12, this.f39606c, this.f39607d, c1915d3);
                break;
            case 3:
                C1915d c1915d4 = new C1915d(24);
                T t13 = this.f39605b;
                t13.f39614a.e(t13, this.f39606c, this.f39607d, c1915d4);
                break;
            default:
                C1915d c1915d5 = new C1915d(24);
                T t14 = this.f39605b;
                t14.f39614a.f(t14, this.f39606c, this.f39607d, c1915d5);
                break;
        }
    }
}
