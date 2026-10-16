package Kb;

import Pc.C0800p;
import Uc.f;
import Uc.n;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1451o;
import com.applovin.impl.I;
import com.applovin.impl.c3;
import com.applovin.impl.e1;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.h;
import com.applovin.impl.n2;
import com.applovin.sdk.AppLovinAd;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.moloco.sdk.internal.publisher.C1915d;
import com.vungle.ads.internal.ui.view.o;
import com.vungle.ads.internal.ui.z;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import kd.T;
import kd.W;
import m9.C3514m;
import m9.EnumC3515n;
import m9.d0;
import n9.C3610e;
import p9.s;
import vf.AbstractC4345a;
import xg.g;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6722c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6725f;

    public /* synthetic */ c(f fVar, n nVar, String str, String str2, C0800p c0800p) {
        this.f6720a = 1;
        this.f6722c = fVar;
        this.f6723d = nVar;
        this.f6721b = str;
        this.f6724e = str2;
        this.f6725f = c0800p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f6722c;
        Object obj2 = this.f6725f;
        Object obj3 = this.f6724e;
        Object obj4 = this.f6723d;
        Object obj5 = this.f6721b;
        switch (this.f6720a) {
            case 0:
                z.a((o) obj, (String) obj5, (kotlinx.serialization.json.c) obj4, (z) obj3, (WebView) obj2);
                return;
            case 1:
                n nVar = (n) obj4;
                String str = (String) obj5;
                String str2 = (String) obj3;
                C0800p c0800p = (C0800p) obj2;
                HashMap map = f.f12728h;
                f fVar = (f) obj;
                try {
                    C3514m c3514mD = f.c(nVar).d(str);
                    d0 d0Var = (d0) fVar.f12733d.get(str2);
                    if (d0Var == null) {
                        c0800p.b(new Exception("Transaction.getDocument(): No transaction handler exists for ID: " + str2));
                    } else {
                        c0800p.a(g.W(d0Var.a(c3514mD), EnumC3515n.f40497a));
                    }
                    return;
                } catch (Exception e7) {
                    AbstractC4345a.K(c0800p, e7);
                    return;
                }
            case 2:
                ((e1) obj).a((View) obj5, (FrameLayout) obj4, (ViewTreeObserver) obj3, (I) obj2);
                return;
            case 3:
                ((MediationServiceImpl) obj).a((c3) obj5, (h) obj4, (Activity) obj3, (a.InterfaceC0014a) obj2);
                return;
            case 4:
                ((n2) obj).a((AbstractC1451o) obj5, (AppLovinAd) obj4, (ViewGroup) obj3, (Activity) obj2);
                return;
            case 5:
                T t10 = (T) obj;
                t10.f39614a.k(t10, (WebView) obj2, (String) obj5, (String) obj4, (String) obj3, new C1915d(24));
                return;
            case 6:
                T t11 = (T) obj;
                t11.f39614a.i(t11, (WebView) obj2, (HttpAuthHandler) obj4, (String) obj5, (String) obj3, new C1915d(24));
                return;
            case 7:
                W w2 = (W) obj;
                w2.f39626a.k(w2, (WebView) obj2, (String) obj5, (String) obj4, (String) obj3, new C1915d(25));
                return;
            case 8:
                W w3 = (W) obj;
                w3.f39626a.i(w3, (WebView) obj2, (HttpAuthHandler) obj4, (String) obj5, (String) obj3, new C1915d(25));
                return;
            default:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj5;
                Context context = (Context) obj4;
                s sVar = (s) obj3;
                v9.h hVar = (v9.h) obj2;
                p9.n nVar2 = (p9.n) obj;
                nVar2.getClass();
                try {
                    nVar2.a(context, (C3610e) Tasks.await(taskCompletionSource.getTask()), sVar, hVar);
                    return;
                } catch (InterruptedException | ExecutionException e10) {
                    throw new RuntimeException(e10);
                }
        }
    }

    public /* synthetic */ c(WebViewClient webViewClient, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2, int i5) {
        this.f6720a = i5;
        this.f6722c = webViewClient;
        this.f6725f = webView;
        this.f6723d = httpAuthHandler;
        this.f6721b = str;
        this.f6724e = str2;
    }

    public /* synthetic */ c(WebViewClient webViewClient, WebView webView, String str, String str2, String str3, int i5) {
        this.f6720a = i5;
        this.f6722c = webViewClient;
        this.f6725f = webView;
        this.f6721b = str;
        this.f6723d = str2;
        this.f6724e = str3;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i5) {
        this.f6720a = i5;
        this.f6722c = obj;
        this.f6721b = obj2;
        this.f6723d = obj3;
        this.f6724e = obj4;
        this.f6725f = obj5;
    }
}
