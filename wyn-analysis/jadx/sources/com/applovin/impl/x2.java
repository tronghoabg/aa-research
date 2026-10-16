package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
public class x2 extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a, reason: collision with root package name */
    private final int f23499a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxNativeAdLoader f23500b;

    /* renamed from: c, reason: collision with root package name */
    private final Queue f23501c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f23502d = false;

    /* renamed from: e, reason: collision with root package name */
    private final Object f23503e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private a f23504f;

    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public x2(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f23499a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f23504f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f23500b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, EnumC1641i.NATIVE_AD_PLACER);
    }

    public void a(MaxAd maxAd) {
        this.f23500b.destroy(maxAd);
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f23503e) {
            maxAd = null;
            while (!this.f23501c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                try {
                    maxAd = (MaxAd) this.f23501c.remove();
                } catch (Throwable th) {
                    throw th;
                }
            }
            e();
        }
        return maxAd;
    }

    public void c() {
        this.f23504f = null;
        a();
        this.f23500b.destroy();
    }

    public boolean d() {
        boolean z2;
        synchronized (this.f23503e) {
            z2 = !this.f23501c.isEmpty();
        }
        return z2;
    }

    public void e() {
        synchronized (this.f23503e) {
            try {
                if (!this.f23502d && this.f23501c.size() < this.f23499a) {
                    this.f23502d = true;
                    this.f23500b.loadAd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f23504f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f23504f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f23504f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f23503e) {
            this.f23501c.add(maxAd);
            this.f23502d = false;
            e();
        }
        a aVar = this.f23504f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public void a() {
        synchronized (this.f23503e) {
            try {
                Iterator it = this.f23501c.iterator();
                while (it.hasNext()) {
                    a((MaxAd) it.next());
                }
                this.f23501c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f23500b.render(maxNativeAdView, maxAd);
    }
}
