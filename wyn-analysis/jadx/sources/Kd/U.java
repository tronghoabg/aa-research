package kd;

import android.webkit.WebView;
import com.moloco.sdk.internal.publisher.C1915d;

/* loaded from: classes5.dex */
public final /* synthetic */ class U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f39617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f39618c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f39619d;

    public /* synthetic */ U(W w2, WebView webView, String str, int i5) {
        this.f39616a = i5;
        this.f39617b = w2;
        this.f39618c = webView;
        this.f39619d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39616a) {
            case 0:
                C1915d c1915d = new C1915d(25);
                W w2 = this.f39617b;
                w2.f39626a.f(w2, this.f39618c, this.f39619d, c1915d);
                break;
            case 1:
                C1915d c1915d2 = new C1915d(25);
                W w3 = this.f39617b;
                w3.f39626a.o(w3, this.f39618c, this.f39619d, c1915d2);
                break;
            case 2:
                C1915d c1915d3 = new C1915d(25);
                W w10 = this.f39617b;
                w10.f39626a.c(w10, this.f39618c, this.f39619d, c1915d3);
                break;
            case 3:
                C1915d c1915d4 = new C1915d(25);
                W w11 = this.f39617b;
                w11.f39626a.e(w11, this.f39618c, this.f39619d, c1915d4);
                break;
            default:
                C1915d c1915d5 = new C1915d(25);
                W w12 = this.f39617b;
                w12.f39626a.d(w12, this.f39618c, this.f39619d, c1915d5);
                break;
        }
    }
}
