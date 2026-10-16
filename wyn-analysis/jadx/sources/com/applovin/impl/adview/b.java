package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import cb.AbstractC1593a;
import com.applovin.impl.AbstractC1644j0;
import com.applovin.impl.AbstractC1654o0;
import com.applovin.impl.C;
import com.applovin.impl.C1664t;
import com.applovin.impl.f2;
import com.applovin.impl.o7;
import com.applovin.impl.p7;
import com.applovin.impl.p8;
import com.applovin.impl.s7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.impl.x7;
import com.applovin.impl.y4;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b extends AbstractC1644j0 {

    /* renamed from: j, reason: collision with root package name */
    private static final Set f21052j = Collections.newSetFromMap(new WeakHashMap());
    private static final Object k = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f21053c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21054d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f21055e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21056f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21057g;

    /* renamed from: h, reason: collision with root package name */
    private final List f21058h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f21059i;

    public class a extends u4 {
        public a() {
        }

        @Override // com.applovin.impl.u4
        public Map a() {
            return CollectionUtils.hashMap(MediationMetaData.KEY_NAME, "AdWebView");
        }
    }

    public b(c cVar, com.applovin.impl.sdk.k kVar, Context context) {
        super(context);
        this.f21058h = new ArrayList();
        this.f21059i = new Object();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f21054d = kVar;
        this.f21053c = kVar.O();
        Integer num = (Integer) kVar.a(y4.f23611H6);
        if (num.intValue() > 0) {
            synchronized (k) {
                Set set = f21052j;
                set.add(this);
                o7.a("AdWebView", set.size(), num.intValue(), kVar.D());
            }
        }
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(cVar != null ? cVar : new a());
        setWebChromeClient(new C1664t(cVar != null ? cVar.d() : null, kVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (AbstractC1654o0.j() && ((Boolean) kVar.a(y4.f23755a6)).booleanValue()) {
            setWebViewRenderProcessClient(new d(kVar).a());
        }
        setOnTouchListener(new C(1));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f21101a.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f21056f = true;
        this.f21057g = false;
        super.destroy();
    }

    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f21055e;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i5, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public void scrollTo(int i5, int i10) {
    }

    public void setAdHtmlLoaded(boolean z2) {
        this.f21057g = z2;
        if (z2 && ((Boolean) this.f21054d.a(y4.f23954z6)).booleanValue()) {
            b();
        }
    }

    private void b() {
        synchronized (this.f21059i) {
            try {
                Iterator it = this.f21058h.iterator();
                while (it.hasNext()) {
                    p8.a(this, (String) it.next(), "AdWebView", this.f21054d);
                }
                this.f21058h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (!com.applovin.impl.sdk.o.a()) {
            return true;
        }
        this.f21053c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String string;
        if (!this.f21056f) {
            this.f21055e = bVar;
            try {
                applySettings(bVar);
                if (o7.a(bVar.getSize())) {
                    setVisibility(0);
                }
                bVar.a(SystemClock.elapsedRealtime());
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    loadDataWithBaseURL(bVar.k(), ((com.applovin.impl.sdk.ad.a) bVar).g1(), "text/html", null, "");
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21053c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (bVar instanceof p7) {
                    p7 p7Var = (p7) bVar;
                    s7 s7VarG1 = p7Var.g1();
                    if (s7VarG1 != null) {
                        x7 x7VarE = s7VarG1.e();
                        Uri uriC = x7VarE.c();
                        if (uriC != null) {
                            string = uriC.toString();
                        } else {
                            string = "";
                        }
                        String strB = x7VarE.b();
                        String strI1 = p7Var.i1();
                        if (!StringUtils.isValidString(string) && !StringUtils.isValidString(strB)) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f21053c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (x7VarE.d() == x7.a.STATIC) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f21053c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String strA = a((String) this.f21054d.a(y4.O4), string);
                            if (p7Var.x1() && p7Var.isOpenMeasurementEnabled() && p7Var.y1()) {
                                strA = this.f21054d.e0().a(strA, f2.a((AppLovinAdImpl) bVar));
                            }
                            loadDataWithBaseURL(bVar.k(), strA, "text/html", null, "");
                            return;
                        }
                        if (x7VarE.d() == x7.a.HTML) {
                            if (StringUtils.isValidString(strB)) {
                                String strA2 = a(strI1, strB);
                                String str = StringUtils.isValidString(strA2) ? strA2 : strB;
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f21053c.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str);
                                }
                                loadDataWithBaseURL(bVar.k(), str, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(string)) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f21053c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(string, bVar.k(), strI1, this.f21054d, p7Var);
                                return;
                            }
                            return;
                        }
                        String str2 = string;
                        if (x7VarE.d() == x7.a.IFRAME) {
                            if (StringUtils.isValidString(str2)) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f21053c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(str2, bVar.k(), strI1, this.f21054d, p7Var);
                                return;
                            } else {
                                if (StringUtils.isValidString(strB)) {
                                    String strA3 = a(strI1, strB);
                                    String str3 = StringUtils.isValidString(strA3) ? strA3 : strB;
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.f21053c.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                                    }
                                    loadDataWithBaseURL(bVar.k(), str3, "text/html", null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f21053c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21053c.a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null") + ") - " + th);
            }
        }
        com.applovin.impl.sdk.o.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    public void a(String str) {
        if (((Boolean) this.f21054d.a(y4.f23954z6)).booleanValue()) {
            if (this.f21057g) {
                p8.a(this, str, "AdWebView", this.f21054d);
                return;
            }
            synchronized (this.f21058h) {
                this.f21058h.add(str);
            }
            return;
        }
        p8.a(this, str, "AdWebView", this.f21054d);
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.k kVar, p7 p7Var) {
        String strA = a(str3, str);
        if (StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                AbstractC1593a.s("Rendering webview for VAST ad with resourceContents : ", strA, this.f21053c, "AdWebView");
            }
            loadDataWithBaseURL(str2, strA, "text/html", null, "");
            return;
        }
        String strA2 = a((String) kVar.a(y4.f23669P4), str);
        if (StringUtils.isValidString(strA2)) {
            if (p7Var.x1() && p7Var.isOpenMeasurementEnabled()) {
                strA2 = kVar.e0().a(strA2, f2.a((AppLovinAdImpl) p7Var));
            }
            if (com.applovin.impl.sdk.o.a()) {
                AbstractC1593a.s("Rendering webview for VAST ad with resourceContents : ", strA2, this.f21053c, "AdWebView");
            }
            loadDataWithBaseURL(str2, strA2, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            AbstractC1593a.s("Rendering webview for VAST ad with resourceURL : ", str, this.f21053c, "AdWebView");
        }
        loadUrl(str);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }
}
