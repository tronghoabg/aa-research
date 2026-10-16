package com.applovin.mediation.nativeAds.adPlacer;

import E5.RunnableC0443c;
import Mb.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.adview.a;
import com.applovin.impl.d3;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.w2;
import com.applovin.impl.x2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public class MaxAdPlacer implements x2.a {

    /* renamed from: a, reason: collision with root package name */
    private AppLovinSdkUtils.Size f24128a;

    /* renamed from: b, reason: collision with root package name */
    private MaxNativeAdViewBinder f24129b;

    /* renamed from: c, reason: collision with root package name */
    private final w2 f24130c;

    /* renamed from: d, reason: collision with root package name */
    private final x2 f24131d;

    /* renamed from: e, reason: collision with root package name */
    private Listener f24132e;
    protected final o logger;
    protected final k sdk;

    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i5);

        void onAdRemoved(int i5);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings) {
        this(maxAdPlacerSettings, k.o());
    }

    public void clearAds() {
        a(this.f24130c.b(), new a(this, 8));
    }

    public Collection<Integer> clearTrailingAds(int i5) {
        Collection<Integer> collectionE = this.f24130c.e(i5);
        if (!collectionE.isEmpty()) {
            a(collectionE, new b(this, i5, collectionE, 3));
        }
        return collectionE;
    }

    public void destroy() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f24131d.c();
    }

    public long getAdItemId(int i5) {
        if (isFilledPosition(i5)) {
            return -System.identityHashCode(this.f24130c.a(i5));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i5) {
        if (isFilledPosition(i5)) {
            boolean z2 = this.f24128a != AppLovinSdkUtils.Size.ZERO;
            d3 d3Var = (d3) this.f24130c.a(i5);
            if (z2) {
                return this.f24128a;
            }
            if (d3Var.l0() != null) {
                View mainView = d3Var.l0().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i5) {
        return this.f24130c.b(i5);
    }

    public int getAdjustedPosition(int i5) {
        return this.f24130c.c(i5);
    }

    public int getOriginalPosition(int i5) {
        return this.f24130c.d(i5);
    }

    public void insertItem(int i5) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Inserting item at position: " + i5);
        }
        this.f24130c.f(i5);
    }

    public boolean isAdPosition(int i5) {
        return this.f24130c.g(i5);
    }

    public boolean isFilledPosition(int i5) {
        return this.f24130c.h(i5);
    }

    public void loadAds() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Loading ads");
        }
        this.f24131d.e();
    }

    public void moveItem(int i5, int i10) {
        this.f24130c.b(i5, i10);
    }

    @Override // com.applovin.impl.x2.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f24132e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.x2.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f24132e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.x2.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (o.a()) {
            this.logger.b("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.x2.a
    public void onNativeAdLoaded() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(int i5) {
        a(isFilledPosition(i5) ? Collections.singletonList(Integer.valueOf(i5)) : Collections.EMPTY_LIST, new RunnableC0443c(this, i5, 6));
    }

    public void renderAd(int i5, ViewGroup viewGroup) {
        MaxAd maxAdA = this.f24130c.a(i5);
        if (maxAdA == null) {
            if (o.a()) {
                this.logger.a("MaxAdPlacer", "An ad is not available for position: " + i5);
                return;
            }
            return;
        }
        MaxNativeAdView maxNativeAdViewL0 = ((d3) maxAdA).l0();
        if (maxNativeAdViewL0 == null) {
            if (this.f24129b == null) {
                if (o.a()) {
                    this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i5 + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                    return;
                }
                return;
            }
            maxNativeAdViewL0 = new MaxNativeAdView(this.f24129b, viewGroup.getContext());
            if (this.f24131d.a(maxNativeAdViewL0, maxAdA)) {
                if (o.a()) {
                    this.logger.a("MaxAdPlacer", "Rendered ad at position: " + i5);
                }
            } else if (o.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i5);
            }
        } else if (o.a()) {
            this.logger.a("MaxAdPlacer", "Using pre-rendered ad at position: " + i5);
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (maxNativeAdViewL0.getParent() != null) {
            ((ViewGroup) maxNativeAdViewL0.getParent()).removeView(maxNativeAdViewL0);
        }
        viewGroup.addView(maxNativeAdViewL0, -1, -1);
    }

    public void setAdSize(int i5, int i10) {
        this.f24128a = new AppLovinSdkUtils.Size(i5, i10);
    }

    public void setListener(Listener listener) {
        this.f24132e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f24129b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i5, int i10) {
        this.f24130c.c(i5, i10);
        if (i5 == -1 || i10 == -1) {
            return;
        }
        a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i5, Collection collection) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Clearing trailing ads after position " + i5);
        }
        this.f24130c.a(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.f24130c.a();
        this.f24131d.a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f24128a = AppLovinSdkUtils.Size.ZERO;
        k kVarA = appLovinSdk.a();
        this.sdk = kVarA;
        o oVarO = kVarA.O();
        this.logger = oVarO;
        this.f24130c = new w2(maxAdPlacerSettings);
        this.f24131d = new x2(maxAdPlacerSettings, context, this);
        if (o.a()) {
            oVarO.a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i5) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Removing item at position: " + i5);
        }
        this.f24130c.i(i5);
    }

    private void a() {
        int iC;
        while (this.f24131d.d() && (iC = this.f24130c.c()) != -1) {
            if (o.a()) {
                this.logger.a("MaxAdPlacer", "Placing ad at position: " + iC);
            }
            this.f24130c.a(this.f24131d.b(), iC);
            Listener listener = this.f24132e;
            if (listener != null) {
                listener.onAdLoaded(iC);
            }
        }
    }

    private void a(Collection collection, Runnable runnable) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f24131d.a(this.f24130c.a(((Integer) it.next()).intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.f24132e != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.f24132e.onAdRemoved(((Integer) it2.next()).intValue());
            }
        }
    }
}
