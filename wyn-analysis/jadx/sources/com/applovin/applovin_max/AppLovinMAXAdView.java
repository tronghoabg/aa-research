package com.applovin.applovin_max;

import S8.b;
import android.content.Context;
import android.view.View;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.ads.MaxAdView;
import io.flutter.plugin.platform.e;
import java.util.HashMap;
import java.util.Map;
import ka.AbstractC3256n;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4280q;

/* loaded from: classes.dex */
public class AppLovinMAXAdView implements e {
    private final int adViewId;
    private final C4281r channel;
    private AppLovinMAXAdViewWidget widget;
    private static final Map<Integer, AppLovinMAXAdViewWidget> widgetInstances = new HashMap(2);
    private static final Map<Integer, AppLovinMAXAdViewWidget> preloadedWidgetInstances = new HashMap(2);

    public AppLovinMAXAdView(int i5, String str, int i10, MaxAdFormat maxAdFormat, boolean z2, boolean z10, String str2, String str3, Map<String, Object> map, Map<String, Object> map2, InterfaceC4269f interfaceC4269f, Context context) {
        C4281r c4281r = new C4281r(interfaceC4269f, AbstractC3256n.g(i5, "applovin_max/adview_"));
        this.channel = c4281r;
        c4281r.b(new b(this, 23));
        AppLovinMAXAdViewWidget appLovinMAXAdViewWidget = preloadedWidgetInstances.get(Integer.valueOf(i10));
        this.widget = appLovinMAXAdViewWidget;
        if (appLovinMAXAdViewWidget != null && !appLovinMAXAdViewWidget.hasContainerView()) {
            AppLovinMAX.d("Mounting the preloaded AdView (" + i10 + ") for Ad Unit ID " + str);
            this.adViewId = i10;
            this.widget.setAutoRefreshEnabled(z10);
            this.widget.attachAdView(this);
            return;
        }
        AppLovinMAXAdViewWidget appLovinMAXAdViewWidget2 = new AppLovinMAXAdViewWidget(str, maxAdFormat, z2, context);
        this.widget = appLovinMAXAdViewWidget2;
        int iHashCode = appLovinMAXAdViewWidget2.hashCode();
        this.adViewId = iHashCode;
        widgetInstances.put(Integer.valueOf(iHashCode), this.widget);
        AppLovinMAX.d("Mounting a new AdView (" + iHashCode + ") for Ad Unit ID " + str);
        this.widget.setPlacement(str2);
        this.widget.setCustomData(str3);
        this.widget.setExtraParameters(map);
        this.widget.setLocalExtraParameters(map2);
        this.widget.setAutoRefreshEnabled(z10);
        this.widget.attachAdView(this);
        this.widget.loadAd();
    }

    public static void destroyWidgetAdView(int i5, InterfaceC4280q interfaceC4280q) {
        Map<Integer, AppLovinMAXAdViewWidget> map = preloadedWidgetInstances;
        AppLovinMAXAdViewWidget appLovinMAXAdViewWidget = map.get(Integer.valueOf(i5));
        if (appLovinMAXAdViewWidget == null) {
            interfaceC4280q.b(AppLovinMAX.TAG, "No preloaded AdView found to destroy", null);
            return;
        }
        if (appLovinMAXAdViewWidget.hasContainerView()) {
            interfaceC4280q.b(AppLovinMAX.TAG, "Cannot destroy - the preloaded AdView is currently in use", null);
            return;
        }
        map.remove(Integer.valueOf(i5));
        appLovinMAXAdViewWidget.detachAdView();
        appLovinMAXAdViewWidget.destroy();
        interfaceC4280q.a(null);
    }

    public static MaxAdView getInstance(String str) {
        for (Map.Entry<Integer, AppLovinMAXAdViewWidget> entry : preloadedWidgetInstances.entrySet()) {
            if (entry.getValue().getAdUnitId().equals(str)) {
                return entry.getValue().getAdView();
            }
        }
        for (Map.Entry<Integer, AppLovinMAXAdViewWidget> entry2 : widgetInstances.entrySet()) {
            if (entry2.getValue().getAdUnitId().equals(str)) {
                return entry2.getValue().getAdView();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        if ("startAutoRefresh".equals(c4278o.f46759a)) {
            this.widget.setAutoRefreshEnabled(true);
            interfaceC4280q.a(null);
        } else if (!"stopAutoRefresh".equals(c4278o.f46759a)) {
            interfaceC4280q.c();
        } else {
            this.widget.setAutoRefreshEnabled(false);
            interfaceC4280q.a(null);
        }
    }

    public static void preloadWidgetAdView(String str, MaxAdFormat maxAdFormat, boolean z2, String str2, String str3, Map<String, Object> map, Map<String, Object> map2, InterfaceC4280q interfaceC4280q, Context context) {
        AppLovinMAXAdViewWidget appLovinMAXAdViewWidget = new AppLovinMAXAdViewWidget(str, maxAdFormat, z2, true, context);
        preloadedWidgetInstances.put(Integer.valueOf(appLovinMAXAdViewWidget.hashCode()), appLovinMAXAdViewWidget);
        appLovinMAXAdViewWidget.setPlacement(str2);
        appLovinMAXAdViewWidget.setCustomData(str3);
        appLovinMAXAdViewWidget.setExtraParameters(map);
        appLovinMAXAdViewWidget.setLocalExtraParameters(map2);
        appLovinMAXAdViewWidget.loadAd();
        interfaceC4280q.a(Integer.valueOf(appLovinMAXAdViewWidget.hashCode()));
    }

    @Override // io.flutter.plugin.platform.e
    public void dispose() {
        AppLovinMAXAdViewWidget appLovinMAXAdViewWidget = this.widget;
        if (appLovinMAXAdViewWidget != null) {
            appLovinMAXAdViewWidget.detachAdView();
            if (this.widget == preloadedWidgetInstances.get(Integer.valueOf(this.adViewId))) {
                AppLovinMAX.d("Unmounting the preloaded AdView (" + this.adViewId + ") for Ad Unit ID " + this.widget.getAdUnitId());
                this.widget.setAutoRefreshEnabled(false);
            } else {
                AppLovinMAX.d("Unmounting the AdView (" + this.adViewId + ") to destroy for Ad Unit ID " + this.widget.getAdUnitId());
                widgetInstances.remove(Integer.valueOf(this.adViewId));
                this.widget.destroy();
            }
        }
        C4281r c4281r = this.channel;
        if (c4281r != null) {
            c4281r.b(null);
        }
    }

    @Override // io.flutter.plugin.platform.e
    public View getView() {
        return this.widget;
    }

    @Override // io.flutter.plugin.platform.e
    public void onFlutterViewAttached(View view) {
    }

    @Override // io.flutter.plugin.platform.e
    public void onFlutterViewDetached() {
    }

    @Override // io.flutter.plugin.platform.e
    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
    }

    @Override // io.flutter.plugin.platform.e
    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
    }

    public void sendEvent(String str, Map<String, Object> map) {
        AppLovinMAX.getInstance().fireCallback(str, map, this.channel);
    }
}
