package com.applovin.impl;

import G5.RunnableC0534o;
import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import com.unity3d.services.UnityAdsConstants;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class l4 extends f4 {

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ boolean f21861p = true;

    /* renamed from: h, reason: collision with root package name */
    private final p7 f21862h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f21863i;

    /* renamed from: j, reason: collision with root package name */
    private MediaEvents f21864j;
    private final VastProperties k;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f21865l;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f21866m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f21867n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f21868o;

    public l4(p7 p7Var) {
        super(p7Var);
        this.f21863i = new AtomicBoolean();
        this.f21865l = new AtomicBoolean();
        this.f21866m = new AtomicBoolean();
        this.f21867n = new AtomicBoolean();
        this.f21868o = new AtomicBoolean();
        this.f21862h = p7Var;
        float fM1 = p7Var.m1();
        if (p7Var.m1() == -1) {
            this.k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.k = VastProperties.createVastPropertiesForSkippableMedia(fM1, true, Position.STANDALONE);
        }
    }

    public void A() {
        b("track resumed", new A0(this, 4));
    }

    public void B() {
        b("track skipped", new A0(this, 8));
    }

    public void C() {
        if (this.f21868o.compareAndSet(false, true)) {
            b("track third quartile", new A0(this, 2));
        }
    }

    @Override // com.applovin.impl.f4
    public AdSessionContext a(WebView webView) {
        if (!f21861p && this.f21862h.e1() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (q7 q7Var : this.f21862h.e1().b()) {
            List<w7> listC = q7Var.c();
            if (listC.isEmpty()) {
                b8.a(q7Var.b(), u7.FAILED_TO_LOAD_RESOURCE, this.f21547b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (w7 w7Var : listC) {
                    if ("omid".equalsIgnoreCase(w7Var.b())) {
                        arrayList2.add(w7Var);
                    }
                }
                if (arrayList2.isEmpty()) {
                    b8.a(q7Var.b(), u7.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f21547b);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((w7) it.next()).c()));
                        } catch (Throwable th) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f21548c.a(this.f21549d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        b8.a(q7Var.b(), u7.FAILED_TO_LOAD_RESOURCE, this.f21547b);
                    } else {
                        String strE = q7Var.e();
                        String strD = q7Var.d();
                        if (!StringUtils.isValidString(strE) || StringUtils.isValidString(strD)) {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                URL url = (URL) it2.next();
                                arrayList.add(StringUtils.isValidString(strE) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(strD, url, strE) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                            }
                        } else {
                            b8.a(q7Var.b(), u7.FAILED_TO_LOAD_RESOURCE, this.f21547b);
                        }
                    }
                }
            }
        }
        String strA = this.f21547b.e0().a();
        if (TextUtils.isEmpty(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21548c.b(this.f21549d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f21547b.e0().b(), strA, arrayList, this.f21862h.getOpenMeasurementContentUrl(), this.f21862h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f21548c.a(this.f21549d, "Failed to create ad session context", th2);
            return null;
        }
    }

    public void b(final float f10, final boolean z2) {
        if (this.f21865l.compareAndSet(false, true)) {
            b("track started", new Runnable() { // from class: com.applovin.impl.B0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20746a.a(f10, z2);
                }
            });
        }
    }

    @Override // com.applovin.impl.f4
    public void h() {
        b("track loaded", new A0(this, 5));
    }

    public void v() {
        b("track clicked", new A0(this, 10));
    }

    public void w() {
        b("track completed", new A0(this, 1));
    }

    public void x() {
        if (this.f21866m.compareAndSet(false, true)) {
            b("track first quartile", new A0(this, 3));
        }
    }

    public void y() {
        if (this.f21867n.compareAndSet(false, true)) {
            b("track midpoint", new A0(this, 9));
        }
    }

    public void z() {
        b("track paused", new A0(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.f21864j.bufferFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f21864j.bufferStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.f21864j.adUserInteraction(InteractionType.CLICK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.f21864j.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f21864j.firstQuartile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.f21552g.loaded(this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f21864j.midpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.f21864j.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f21864j.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f21864j.skipped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.f21864j.thirdQuartile();
    }

    public void i() {
        if (this.f21863i.compareAndSet(true, false)) {
            b("buffer finished", new A0(this, 0));
        }
    }

    public void j() {
        if (this.f21863i.compareAndSet(false, true)) {
            b("buffer started", new A0(this, 7));
        }
    }

    public void b(boolean z2) {
        b("track volume changed", new RunnableC0534o(3, this, z2));
    }

    @Override // com.applovin.impl.f4
    public AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f21548c.a(this.f21549d, "Failed to create ad session configuration", th);
            return null;
        }
    }

    @Override // com.applovin.impl.f4
    public void a(AdSession adSession) {
        try {
            this.f21864j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21548c.a(this.f21549d, "Failed to create media events", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f10, boolean z2) {
        this.f21864j.start(f10, z2 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2) {
        this.f21864j.volumeChange(z2 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
    }
}
