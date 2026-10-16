package com.applovin.impl;

import A7.AbstractC0279p0;
import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public abstract class f4 {

    /* renamed from: a, reason: collision with root package name */
    protected final AppLovinAdBase f21546a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f21547b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f21548c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f21549d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f21550e;

    /* renamed from: f, reason: collision with root package name */
    protected AdSession f21551f;

    /* renamed from: g, reason: collision with root package name */
    protected AdEvents f21552g;

    public f4(AppLovinAdBase appLovinAdBase) {
        this.f21546a = appLovinAdBase;
        this.f21547b = appLovinAdBase.getSdk();
        this.f21548c = appLovinAdBase.getSdk().O();
        String string = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            StringBuilder sbQ = AbstractC0279p0.q(string, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sbQ.append(appLovinAdBase.getDspName());
            string = sbQ.toString();
        }
        this.f21549d = string;
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void h() {
        b("track loaded", new O(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        AdSessionContext adSessionContextA;
        if (!this.f21546a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21548c.d(this.f21549d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f21551f != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21548c.k(this.f21549d, "Attempting to start session again for ad: " + this.f21546a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21548c.a(this.f21549d, "Starting session");
        }
        AdSessionConfiguration adSessionConfigurationA = a();
        if (adSessionConfigurationA == null || (adSessionContextA = a(webView)) == null) {
            return;
        }
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationA, adSessionContextA);
            this.f21551f = adSessionCreateAdSession;
            try {
                this.f21552g = AdEvents.createAdEvents(adSessionCreateAdSession);
                a(this.f21551f);
                this.f21551f.start();
                this.f21550e = true;
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21548c.a(this.f21549d, "Session started");
                }
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21548c.a(this.f21549d, "Failed to create ad events", th);
                }
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21548c.a(this.f21549d, "Failed to create session", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f21552g.loaded();
    }

    public void a(AdSession adSession) {
    }

    public void c(WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new F(6, this, webView));
    }

    public void e() {
        c((WebView) null);
    }

    public void f() {
        b("stop session", new O(this, 2));
    }

    public void g() {
        b("track impression event", new O(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f21552g.impressionOccurred();
    }

    public void a(View view) {
        b(view, Collections.EMPTY_LIST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, List list) {
        this.f21551f.registerAdView(view);
        this.f21551f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h4 h4Var = (h4) it.next();
            if (h4Var.c() != null) {
                try {
                    this.f21551f.addFriendlyObstruction(h4Var.c(), h4Var.b(), h4Var.a());
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21548c.a(this.f21549d, "Failed to add friendly obstruction (" + h4Var + ")", th);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f21551f.error(ErrorType.VIDEO, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f21550e) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21548c.a(this.f21549d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21548c.a(this.f21549d, "Failed to run operation: " + str, th);
            }
        }
    }

    public void b(View view, List list) {
        b("update main view: " + view, new Ab.a(this, view, list, 25));
    }

    public void b(String str) {
        b("track error", new F(5, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f21550e = false;
        this.f21551f.finish();
        this.f21551f = null;
        this.f21552g = null;
    }

    public void b(String str, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Ab.a(this, str, runnable, 24));
    }
}
