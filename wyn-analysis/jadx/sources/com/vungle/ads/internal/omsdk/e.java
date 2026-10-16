package com.vungle.ads.internal.omsdk;

import android.webkit.WebView;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.vungle.ads.BuildConfig;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class e implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final long f33468d = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33469a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33470b;

    /* renamed from: c, reason: collision with root package name */
    public AdSession f33471c;

    public e(boolean z2) {
        this.f33469a = z2;
    }

    public final void a() {
        if (this.f33469a && Omid.isActive()) {
            this.f33470b = true;
        }
    }

    public final void a(WebView webView) {
        AbstractC3340k.e(webView, "webView");
        if (this.f33470b && this.f33471c == null) {
            CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
            ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
            Owner owner = Owner.JAVASCRIPT;
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME), webView, null, null));
            this.f33471c = adSessionCreateAdSession;
            if (adSessionCreateAdSession != null) {
                adSessionCreateAdSession.registerAdView(webView);
            }
            AdSession adSession = this.f33471c;
            if (adSession != null) {
                adSession.start();
            }
        }
    }
}
