package C6;

import D6.C0392q;
import D6.InterfaceC0407y;
import G6.L;
import N.O0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzfmi;
import gd.C2752g;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class i extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1841b;

    public /* synthetic */ i(Object obj, int i5) {
        this.f1840a = i5;
        this.f1841b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f1840a) {
            case 0:
                m mVar = (m) this.f1841b;
                InterfaceC0407y interfaceC0407y = mVar.f1855f;
                if (interfaceC0407y != null) {
                    try {
                        interfaceC0407y.zzd(zzfmi.zzd(1, null, null));
                    } catch (RemoteException e7) {
                        int i5 = L.f4523b;
                        H6.l.i("#007 Could not call remote method.", e7);
                    }
                }
                InterfaceC0407y interfaceC0407y2 = mVar.f1855f;
                if (interfaceC0407y2 != null) {
                    try {
                        interfaceC0407y2.zzc(0);
                        break;
                    } catch (RemoteException e10) {
                        int i10 = L.f4523b;
                        H6.l.i("#007 Could not call remote method.", e10);
                        return;
                    }
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.f1840a) {
            case 1:
                Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
                Qa.c cVar = (Qa.c) this.f1841b;
                if (cVar.e() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    cVar.f9930b = new O0(null);
                }
                webView.destroy();
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f1840a) {
            case 2:
                ((C2752g) this.f1841b).f35876a.f37187c.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public i(m mVar) {
        this.f1840a = 0;
        Objects.requireNonNull(mVar);
        this.f1841b = mVar;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Object obj = this.f1841b;
        switch (this.f1840a) {
            case 0:
                m mVar = (m) obj;
                int iB = 0;
                if (str.startsWith(mVar.S())) {
                    return false;
                }
                if (str.startsWith("gmsg://noAdLoaded")) {
                    InterfaceC0407y interfaceC0407y = mVar.f1855f;
                    if (interfaceC0407y != null) {
                        try {
                            interfaceC0407y.zzd(zzfmi.zzd(3, null, null));
                        } catch (RemoteException e7) {
                            int i5 = L.f4523b;
                            H6.l.i("#007 Could not call remote method.", e7);
                        }
                    }
                    InterfaceC0407y interfaceC0407y2 = mVar.f1855f;
                    if (interfaceC0407y2 != null) {
                        try {
                            interfaceC0407y2.zzc(3);
                        } catch (RemoteException e10) {
                            int i10 = L.f4523b;
                            H6.l.i("#007 Could not call remote method.", e10);
                        }
                    }
                    mVar.R(0);
                    return true;
                }
                if (str.startsWith("gmsg://scriptLoadFailed")) {
                    InterfaceC0407y interfaceC0407y3 = mVar.f1855f;
                    if (interfaceC0407y3 != null) {
                        try {
                            interfaceC0407y3.zzd(zzfmi.zzd(1, null, null));
                        } catch (RemoteException e11) {
                            int i11 = L.f4523b;
                            H6.l.i("#007 Could not call remote method.", e11);
                        }
                    }
                    InterfaceC0407y interfaceC0407y4 = mVar.f1855f;
                    if (interfaceC0407y4 != null) {
                        try {
                            interfaceC0407y4.zzc(0);
                        } catch (RemoteException e12) {
                            int i12 = L.f4523b;
                            H6.l.i("#007 Could not call remote method.", e12);
                        }
                    }
                    mVar.R(0);
                    return true;
                }
                boolean zStartsWith = str.startsWith("gmsg://adResized");
                Context context = mVar.f1852c;
                if (zStartsWith) {
                    InterfaceC0407y interfaceC0407y5 = mVar.f1855f;
                    if (interfaceC0407y5 != null) {
                        try {
                            interfaceC0407y5.zzf();
                        } catch (RemoteException e13) {
                            int i13 = L.f4523b;
                            H6.l.i("#007 Could not call remote method.", e13);
                        }
                    }
                    String queryParameter = Uri.parse(str).getQueryParameter("height");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        try {
                            H6.f fVar = C0392q.f2477g.f2478a;
                            iB = H6.f.b(context, Integer.parseInt(queryParameter));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    mVar.R(iB);
                    return true;
                }
                if (str.startsWith("gmsg://")) {
                    return true;
                }
                InterfaceC0407y interfaceC0407y6 = mVar.f1855f;
                if (interfaceC0407y6 != null) {
                    try {
                        interfaceC0407y6.zzh();
                        mVar.f1855f.zze();
                    } catch (RemoteException e14) {
                        int i14 = L.f4523b;
                        H6.l.i("#007 Could not call remote method.", e14);
                    }
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                context.startActivity(intent);
                return true;
            case 1:
            default:
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                ((C2752g) obj).f35876a.f37187c.loadUrl(str);
                return true;
        }
    }
}
