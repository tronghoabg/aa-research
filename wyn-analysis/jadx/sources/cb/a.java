package Cb;

import C8.i;
import Pc.C0800p;
import Qc.f;
import T3.r;
import Uc.n;
import Uc.t;
import Va.X7;
import a.AbstractC1304a;
import android.app.Activity;
import android.content.Context;
import android.media.AudioTrack;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.impl.C1643j;
import com.applovin.impl.C1646k0;
import com.applovin.impl.EnumC1641i;
import com.applovin.impl.d2;
import com.applovin.impl.e2;
import com.applovin.impl.f1;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.n2;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.r1;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.c;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.t2;
import com.applovin.sdk.AppLovinAd;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.ump.FormError;
import com.moloco.sdk.internal.publisher.C1915d;
import com.vungle.ads.internal.downloader.b;
import com.vungle.ads.internal.downloader.k;
import com.vungle.ads.internal.load.c;
import com.vungle.ads.internal.load.g;
import e9.AbstractC2475a;
import e9.C2476b;
import f9.h;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kd.C3293D;
import kd.T;
import kotlin.jvm.internal.AbstractC3340k;
import m9.W;
import m9.Y;
import org.json.JSONObject;
import r7.AbstractC3935e;
import s8.l;
import uc.InterfaceC4269f;
import vf.AbstractC4345a;
import x3.AbstractC4463f;
import xa.d;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1979c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1981e;

    public /* synthetic */ a(File file, c cVar, k kVar, g gVar) {
        this.f1977a = 1;
        this.f1981e = file;
        this.f1978b = cVar;
        this.f1979c = kVar;
        this.f1980d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C2476b c2476b;
        int i5 = 14;
        int i10 = 25;
        int i11 = 24;
        Object obj = null;
        switch (this.f1977a) {
            case 0:
                c.a((k) this.f1979c, (g) this.f1980d, (c) this.f1978b, (b) this.f1981e);
                return;
            case 1:
                c.a((File) this.f1981e, (c) this.f1978b, (k) this.f1979c, (g) this.f1980d);
                return;
            case 2:
                Uri uri = Cg.c.f2230e;
                ((tc.g) this.f1979c).b((String) this.f1980d, (String) this.f1978b, ((StringBuilder) this.f1981e).toString());
                return;
            case 3:
                f fVar = (f) this.f1980d;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1981e;
                HashMap map = Qc.c.f9945c;
                Qc.c cVar = (Qc.c) this.f1979c;
                cVar.getClass();
                try {
                    String str = fVar.f9951a;
                    AbstractC1732v.g(str, "ApiKey must be set.");
                    String str2 = fVar.f9952b;
                    AbstractC1732v.g(str2, "ApplicationId must be set.");
                    l lVar = new l(str2, str, fVar.f9956f, fVar.f9959i, fVar.f9953c, fVar.f9957g, fVar.f9954d);
                    try {
                        Looper.prepare();
                    } catch (Exception unused) {
                    }
                    String str3 = fVar.f9955e;
                    String str4 = (String) this.f1978b;
                    if (str3 != null) {
                        Qc.c.f9945c.put(str4, str3);
                    }
                    s8.g gVarJ = s8.g.j(cVar.f9946a, str4, lVar);
                    TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.a(cVar, gVarJ, taskCompletionSource2, 5));
                    taskCompletionSource.setResult((Qc.g) Tasks.await(taskCompletionSource2.getTask()));
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            case 4:
                Sc.b bVar = (Sc.b) this.f1979c;
                bVar.getClass();
                TaskCompletionSource taskCompletionSource3 = (TaskCompletionSource) this.f1981e;
                String str5 = (String) this.f1980d;
                AbstractC2475a abstractC2475a = (AbstractC2475a) this.f1978b;
                try {
                    if (str5 == null) {
                        AtomicReference atomicReference = bVar.f11057a;
                        if (atomicReference.get() != null && ((Activity) atomicReference.get()).getIntent() != null && !((Activity) atomicReference.get()).getIntent().getBooleanExtra("flutterfire-used-link", false)) {
                            ((Activity) atomicReference.get()).getIntent().putExtra("flutterfire-used-link", true);
                            c2476b = (C2476b) Tasks.await(abstractC2475a.a(((Activity) atomicReference.get()).getIntent()));
                        }
                        taskCompletionSource3.setResult(null);
                        return;
                    }
                    h hVar = (h) abstractC2475a;
                    c2476b = (C2476b) Tasks.await(hVar.f35254a.doWrite(new f9.g(hVar.f35255b, Uri.parse(str5).toString())));
                    taskCompletionSource3.setResult(AbstractC1304a.r(c2476b));
                    return;
                } catch (Exception e10) {
                    taskCompletionSource3.setException(e10);
                    return;
                }
            case 5:
                X8.c cVar2 = (X8.c) this.f1979c;
                String str6 = (String) ((AtomicMarkableReference) cVar2.f16190g).getReference();
                String str7 = (String) this.f1980d;
                T8.g gVar = (T8.g) cVar2.f16185b;
                if (str6 != null) {
                    gVar.j(str7, (String) ((AtomicMarkableReference) cVar2.f16190g).getReference());
                }
                Map map2 = (Map) this.f1978b;
                if (!map2.isEmpty()) {
                    gVar.h(str7, map2, false);
                }
                List list = (List) this.f1981e;
                if (list.isEmpty()) {
                    return;
                }
                gVar.i(str7, list);
                return;
            case 6:
                n nVar = (n) this.f1979c;
                String str8 = (String) this.f1980d;
                C0800p c0800p = (C0800p) this.f1978b;
                t tVar = (t) this.f1981e;
                try {
                    W w2 = (W) Tasks.await(Uc.f.c(nVar).f(str8));
                    if (w2 == null) {
                        c0800p.b(new NullPointerException("Named query has not been found. Please check it has been loaded properly via loadBundle()."));
                    } else {
                        c0800p.a(xg.g.X((Y) Tasks.await(w2.c(xg.g.H(tVar.f12771a))), xg.g.G(tVar.f12772b)));
                    }
                    return;
                } catch (Exception e11) {
                    AbstractC4345a.K(c0800p, e11);
                    return;
                }
            case 7:
                AudioTrack audioTrack = (AudioTrack) this.f1979c;
                d dVar = (d) this.f1980d;
                Handler handler = (Handler) this.f1978b;
                W1.g gVar2 = (W1.g) this.f1981e;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (dVar != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new r(i5, dVar, gVar2));
                    }
                    synchronized (W1.t.f15036j0) {
                        try {
                            int i12 = W1.t.f15038l0 - 1;
                            W1.t.f15038l0 = i12;
                            if (i12 == 0) {
                                W1.t.f15037k0.shutdown();
                                W1.t.f15037k0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (dVar != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new r(i5, dVar, gVar2));
                    }
                    synchronized (W1.t.f15036j0) {
                        try {
                            int i13 = W1.t.f15038l0 - 1;
                            W1.t.f15038l0 = i13;
                            if (i13 == 0) {
                                W1.t.f15037k0.shutdown();
                                W1.t.f15037k0 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 8:
                ((Wa.h) this.f1979c).f15449c.b((String) this.f1980d, (String) this.f1978b, this.f1981e);
                return;
            case 9:
                ((e2) this.f1979c).a((String) this.f1980d, (d2) this.f1978b, (JSONObject) this.f1981e);
                return;
            case 10:
                ((f1) this.f1979c).a((com.applovin.impl.adview.a) this.f1980d, (Activity) this.f1978b, (Uri) this.f1981e);
                return;
            case 11:
                ((f1) this.f1979c).a((AppLovinNativeAdImpl) this.f1980d, (Activity) this.f1978b, (Uri) this.f1981e);
                return;
            case 12:
                ((C1643j) this.f1979c).a((C1643j.b) this.f1980d, (String) this.f1978b, (String) this.f1981e);
                return;
            case 13:
                ((MaxFullscreenAdImpl) this.f1979c).a((Activity) this.f1980d, (Context) this.f1978b, (EnumC1641i) this.f1981e);
                return;
            case 14:
                ((MaxFullscreenAdImpl) this.f1979c).a((String) this.f1980d, (String) this.f1978b, (Activity) this.f1981e);
                return;
            case 15:
                ((n2) this.f1979c).a((ViewGroup) this.f1980d, (Activity) this.f1978b, (AppLovinFullscreenAdViewObserver) this.f1981e);
                return;
            case 16:
                ((com.applovin.impl.privacy.cmp.a) this.f1979c).a((FormError) this.f1980d, (C1646k0) this.f1978b, (a.InterfaceC0018a) this.f1981e);
                return;
            case 17:
                ((r1) this.f1979c).a((String) this.f1980d, (String) this.f1978b, (Throwable) this.f1981e);
                return;
            case 18:
                ((EventServiceImpl) this.f1979c).b((String) this.f1980d, (Map) this.f1978b, (Map) this.f1981e);
                return;
            case 19:
                ((com.applovin.impl.sdk.c) this.f1979c).a((File) this.f1980d, (c.InterfaceC0021c) this.f1978b, (c.a) this.f1981e);
                return;
            case 20:
                ImageViewUtils.a((String) this.f1979c, (com.applovin.impl.sdk.k) this.f1980d, (ImageView) this.f1978b, (Uri) this.f1981e);
                return;
            case 21:
                t2.b((AppLovinAdViewEventListener) this.f1979c, (AppLovinAd) this.f1980d, (AppLovinAdView) this.f1978b, (AppLovinAdViewDisplayErrorCode) this.f1981e);
                return;
            case 22:
                ((Wa.h) this.f1979c).f15449c.b((String) this.f1980d, (String) this.f1978b, this.f1981e);
                return;
            case 23:
                C1915d c1915d = new C1915d(i11);
                T t10 = (T) this.f1979c;
                kd.r rVar = t10.f39614a;
                rVar.getClass();
                WebView webViewArg = (WebView) this.f1980d;
                AbstractC3340k.e(webViewArg, "webViewArg");
                WebResourceRequest requestArg = (WebResourceRequest) this.f1978b;
                AbstractC3340k.e(requestArg, "requestArg");
                AbstractC4463f errorArg = (AbstractC4463f) this.f1981e;
                AbstractC3340k.e(errorArg, "errorArg");
                i iVar = rVar.f39692a;
                iVar.getClass();
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), obj, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat").m(AbstractC3935e.D(t10, webViewArg, requestArg, errorArg), new C3293D(c1915d, 20));
                return;
            case 24:
                C1915d c1915d2 = new C1915d(i11);
                T t11 = (T) this.f1979c;
                t11.f39614a.j(t11, (WebView) this.f1980d, (WebResourceRequest) this.f1978b, (WebResourceResponse) this.f1981e, c1915d2);
                return;
            case 25:
                C1915d c1915d3 = new C1915d(i11);
                T t12 = (T) this.f1979c;
                t12.f39614a.b(t12, (WebView) this.f1980d, (Message) this.f1978b, (Message) this.f1981e, c1915d3);
                return;
            case 26:
                C1915d c1915d4 = new C1915d(i11);
                T t13 = (T) this.f1979c;
                t13.f39614a.l(t13, (WebView) this.f1980d, (SslErrorHandler) this.f1978b, (SslError) this.f1981e, c1915d4);
                return;
            case 27:
                C1915d c1915d5 = new C1915d(i10);
                kd.W w3 = (kd.W) this.f1979c;
                w3.f39626a.b(w3, (WebView) this.f1980d, (Message) this.f1978b, (Message) this.f1981e, c1915d5);
                return;
            case 28:
                C1915d c1915d6 = new C1915d(i10);
                kd.W w10 = (kd.W) this.f1979c;
                w10.f39626a.l(w10, (WebView) this.f1980d, (SslErrorHandler) this.f1978b, (SslError) this.f1981e, c1915d6);
                return;
            default:
                C1915d c1915d7 = new C1915d(i10);
                kd.W w11 = (kd.W) this.f1979c;
                kd.r rVar2 = w11.f39626a;
                rVar2.getClass();
                WebView webViewArg2 = (WebView) this.f1980d;
                AbstractC3340k.e(webViewArg2, "webViewArg");
                WebResourceRequest requestArg2 = (WebResourceRequest) this.f1978b;
                AbstractC3340k.e(requestArg2, "requestArg");
                WebResourceError errorArg2 = (WebResourceError) this.f1981e;
                AbstractC3340k.e(errorArg2, "errorArg");
                i iVar2 = rVar2.f39692a;
                iVar2.getClass();
                new X7((InterfaceC4269f) iVar2.f1940c, iVar2.q(), obj, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError").m(AbstractC3935e.D(w11, webViewArg2, requestArg2, errorArg2), new C3293D(c1915d7, 21));
                return;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i5) {
        this.f1977a = i5;
        this.f1979c = obj;
        this.f1980d = obj2;
        this.f1978b = obj3;
        this.f1981e = obj4;
    }
}
