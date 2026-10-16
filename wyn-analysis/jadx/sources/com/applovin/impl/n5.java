package com.applovin.impl;

import android.net.Uri;
import cb.AbstractC1593a;
import com.applovin.impl.C1634e0;
import com.applovin.impl.m5;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class n5 extends m5 {

    /* renamed from: q, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f22331q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f22332r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f22333s;

    public class a implements C1634e0.a {
        public a() {
        }

        @Override // com.applovin.impl.C1634e0.a
        public void a(Uri uri) {
            if (uri != null) {
                n5.this.f22331q.m1();
                n5.this.f22331q.c(uri);
            }
        }
    }

    public class b implements m5.e {
        public b() {
        }

        @Override // com.applovin.impl.m5.e
        public void a(String str) {
            n5.this.f22331q.d(n5.this.d(str));
            n5.this.f22331q.b(true);
            com.applovin.impl.sdk.o oVar = n5.this.f21768c;
            if (com.applovin.impl.sdk.o.a()) {
                n5 n5Var = n5.this;
                n5Var.f21768c.a(n5Var.f21767b, "Finish caching non-video resources for ad #" + n5.this.f22331q.getAdIdNumber());
            }
            n5 n5Var2 = n5.this;
            n5Var2.f21768c.f(n5Var2.f21767b, "Ad updated with cachedHTML = " + n5.this.f22331q.g1());
        }
    }

    public n5(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, kVar, appLovinAdLoadListener);
        this.f22331q = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        if (o7.j(com.applovin.impl.sdk.k.o())) {
            str = o7.c(str);
        }
        if (!this.f22331q.isOpenMeasurementEnabled()) {
            return str;
        }
        return this.f21766a.e0().a(str, f2.a((AppLovinAdImpl) this.f21916g));
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Caching non-optional HTML resources...");
        }
        this.f22331q.d(d(a(this.f22331q.g1(), this.f22331q.S(), this.f22331q)));
        this.f22331q.b(true);
        a(this.f22331q);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Finish caching non-optional HTML resources for ad #" + this.f22331q.getAdIdNumber());
        }
        this.f21768c.f(this.f21767b, "Ad HTML updated to reference locally cached non-optional resources = " + this.f22331q.g1());
    }

    private void n() {
        Uri uriC;
        if (l() || (uriC = c(this.f22331q.k1())) == null) {
            return;
        }
        this.f22331q.m1();
        this.f22331q.c(uriC);
    }

    private C1632d0 o() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Caching HTML resources...");
        }
        return a(this.f22331q.g1(), this.f22331q.S(), new b());
    }

    private C1634e0 p() {
        return b(this.f22331q.k1(), new a());
    }

    private void q() {
        List<String> listH = this.f22331q.H();
        if (CollectionUtils.isEmpty(listH)) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Caching optional HTML resources...");
        }
        String strG1 = this.f22331q.g1();
        for (String str : listH) {
            if (com.applovin.impl.sdk.o.a()) {
                AbstractC1593a.s("Caching optional resource: ", str, this.f21768c, this.f21767b);
            }
            int iA = this.f21766a.G().a(str, this.f21916g);
            Map mapA = f2.a((AppLovinAdImpl) this.f21916g);
            String strA = this.f21766a.G().a(com.applovin.impl.sdk.k.o(), str, this.f22331q.getCachePrefix(), this.f22331q.S(), true, true, iA, this.f21918i, mapA);
            if (StringUtils.isValidString(strA)) {
                if (com.applovin.impl.sdk.o.a()) {
                    AbstractC1593a.s("Updating HTML with cached optional resource: ", strA, this.f21768c, this.f21767b);
                }
                this.f22331q.a(strA, str);
                strG1 = strG1.replace(str, strA);
                this.f22331q.d(strG1);
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.b(this.f21767b, "Failed to cache optional resource: " + str);
                }
                a(str, "cacheOptionalHtmlResource", mapA);
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Finish caching optional HTML resources for ad #" + this.f22331q.getAdIdNumber());
        }
    }

    public void b(boolean z2) {
        this.f22333s = z2;
    }

    public void c(boolean z2) {
        this.f22332r = z2;
    }

    @Override // com.applovin.impl.m5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zC0 = this.f22331q.C0();
        boolean z2 = this.f22333s;
        if (zC0 || z2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Begin caching for streaming ad #" + this.f22331q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f21766a.a(y4.f23650N0)).booleanValue()) {
                if (!AbstractC1654o0.e()) {
                    a(e());
                }
                ArrayList arrayList = new ArrayList();
                if (!zC0) {
                    f();
                    C1632d0 c1632d0O = o();
                    if (c1632d0O != null) {
                        arrayList.add(c1632d0O);
                    }
                } else if (this.f22332r) {
                    f();
                    C1632d0 c1632d0O2 = o();
                    if (c1632d0O2 != null) {
                        arrayList.add(c1632d0O2);
                    }
                    C1634e0 c1634e0P = p();
                    if (c1634e0P != null) {
                        arrayList.add(c1634e0P);
                    }
                } else {
                    C1632d0 c1632d0O3 = o();
                    if (c1632d0O3 != null) {
                        a(Arrays.asList(c1632d0O3));
                    }
                    f();
                    C1634e0 c1634e0P2 = p();
                    if (c1634e0P2 != null) {
                        arrayList.add(c1634e0P2);
                    }
                }
                a(arrayList);
                f();
            } else {
                j();
                if (zC0) {
                    if (this.f22332r) {
                        f();
                    }
                    m();
                    if (!this.f22332r) {
                        f();
                    }
                    n();
                } else {
                    f();
                    m();
                }
            }
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Begin processing for non-streaming ad #" + this.f22331q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.f21766a.a(y4.f23650N0)).booleanValue()) {
                ArrayList arrayList2 = new ArrayList();
                if (!AbstractC1654o0.e()) {
                    arrayList2.addAll(e());
                }
                C1632d0 c1632d0O4 = o();
                if (c1632d0O4 != null) {
                    arrayList2.add(c1632d0O4);
                }
                C1634e0 c1634e0P3 = p();
                if (c1634e0P3 != null) {
                    arrayList2.add(c1634e0P3);
                }
                a(arrayList2);
                f();
                q();
            } else {
                j();
                m();
                n();
                f();
                q();
            }
        }
        k();
    }
}
