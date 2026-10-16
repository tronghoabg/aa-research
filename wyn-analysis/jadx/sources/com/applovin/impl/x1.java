package com.applovin.impl;

import Va.M6;
import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.e6;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class x1 extends w1 {

    /* renamed from: M, reason: collision with root package name */
    private final y1 f23495M;

    /* renamed from: N, reason: collision with root package name */
    private C1638g0 f23496N;

    /* renamed from: O, reason: collision with root package name */
    private long f23497O;

    /* renamed from: P, reason: collision with root package name */
    private final AtomicBoolean f23498P;

    public x1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f23495M = new y1(this.f23427a, this.f23430d, this.f23428b);
        this.f23498P = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.f23498P.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.f23442q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.k;
        if (gVar != null) {
            arrayList.add(new h4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f23436j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f23436j;
            arrayList.add(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f23427a.getAdEventTracker().b(b(), arrayList);
    }

    @Override // com.applovin.impl.w1
    public void A() {
        this.f23495M.a(this.f23437l);
        this.f23442q = SystemClock.elapsedRealtime();
        this.f23498P.set(true);
    }

    public void I() {
        long jP;
        long millis = 0;
        if (this.f23427a.O() >= 0 || this.f23427a.P() >= 0) {
            if (this.f23427a.O() >= 0) {
                jP = this.f23427a.O();
            } else {
                if (this.f23427a.W0()) {
                    int iH1 = (int) ((com.applovin.impl.sdk.ad.a) this.f23427a).h1();
                    if (iH1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iH1);
                    } else {
                        int iR = (int) this.f23427a.r();
                        if (iR > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iR);
                        }
                    }
                }
                jP = (long) ((this.f23427a.P() / 100.0d) * millis);
            }
            c(jP);
        }
    }

    @Override // com.applovin.impl.w1
    public void a(ViewGroup viewGroup) {
        this.f23495M.a(this.k, this.f23436j, b(), viewGroup);
        if (((Boolean) this.f23428b.a(y4.f23741Y5)).booleanValue() || !a(false)) {
            com.applovin.impl.adview.k kVar = this.f23436j;
            if (kVar != null) {
                kVar.b();
            }
            b().renderAd(this.f23427a);
            a("javascript:al_onPoststitialShow();", this.f23427a.x());
            if (h()) {
                long jC = C();
                this.f23497O = jC;
                if (jC > 0) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f23429c.a("AppLovinFullscreenActivity", M6.s(new StringBuilder("Scheduling timer for ad fully watched in "), this.f23497O, "ms..."));
                    }
                    final int i5 = 0;
                    this.f23496N = C1638g0.a(this.f23497O, this.f23428b, new Runnable(this) { // from class: com.applovin.impl.Y0

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ x1 f20872b;

                        {
                            this.f20872b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    this.f20872b.F();
                                    break;
                                case 1:
                                    this.f20872b.G();
                                    break;
                                default:
                                    this.f20872b.H();
                                    break;
                            }
                        }
                    });
                }
            }
            if (this.k != null) {
                if (this.f23427a.r() >= 0) {
                    final int i10 = 1;
                    a(this.k, this.f23427a.r(), new Runnable(this) { // from class: com.applovin.impl.Y0

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ x1 f20872b;

                        {
                            this.f20872b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    this.f20872b.F();
                                    break;
                                case 1:
                                    this.f20872b.G();
                                    break;
                                default:
                                    this.f20872b.H();
                                    break;
                            }
                        }
                    });
                } else {
                    this.k.setVisibility(0);
                }
            }
            I();
            final int i11 = 2;
            this.f23428b.r0().a(new s6(this.f23428b, "updateMainViewOM", new Runnable(this) { // from class: com.applovin.impl.Y0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x1 f20872b;

                {
                    this.f20872b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.f20872b.F();
                            break;
                        case 1:
                            this.f20872b.G();
                            break;
                        default:
                            this.f20872b.H();
                            break;
                    }
                }
            }), e6.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
            p();
            super.c(o7.e(this.f23428b));
        }
    }

    @Override // com.applovin.impl.w1
    public void b(long j8) {
    }

    @Override // com.applovin.impl.w1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.w1
    public void f() {
        super.f();
        A();
    }

    @Override // com.applovin.impl.w1
    public void m() {
        super.a(D(), false, E(), -2L);
    }

    @Override // com.applovin.impl.w1
    public void v() {
    }

    @Override // com.applovin.impl.w1
    public void w() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.w1
    public void x() {
        super.x();
        this.f23498P.set(true);
    }

    private long C() {
        com.applovin.impl.sdk.ad.b bVar = this.f23427a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float fH1 = ((com.applovin.impl.sdk.ad.a) bVar).h1();
        if (fH1 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fH1 = this.f23427a.r();
        }
        return (long) ((this.f23427a.y() / 100.0d) * o7.c(fH1));
    }

    private int D() {
        C1638g0 c1638g0;
        int iMin = 100;
        if (h()) {
            if (((Boolean) this.f23428b.a(y4.f23849m1)).booleanValue() && !this.f23427a.hasShown()) {
                return 0;
            }
            if (!E() && (c1638g0 = this.f23496N) != null) {
                iMin = (int) Math.min(100.0d, ((this.f23497O - c1638g0.b()) / this.f23497O) * 100.0d);
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f23429c.a("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        return iMin;
    }

    public boolean E() {
        if (!(this.f23425J && this.f23427a.a1()) && h()) {
            return this.f23498P.get();
        }
        return true;
    }

    @Override // com.applovin.impl.w1
    public void a(String str) {
        if (!((Boolean) this.f23428b.a(y4.f23679Q6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f23427a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        C1638g0 c1638g0 = this.f23496N;
        if (c1638g0 != null) {
            c1638g0.a();
            this.f23496N = null;
        }
        super.a(str);
    }
}
