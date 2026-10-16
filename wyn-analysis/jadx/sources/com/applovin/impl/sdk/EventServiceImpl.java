package com.applovin.impl.sdk;

import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import com.applovin.impl.e6;
import com.applovin.impl.i1;
import com.applovin.impl.j5;
import com.applovin.impl.o7;
import com.applovin.impl.s1;
import com.applovin.impl.s6;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.v4;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", "paused", "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* renamed from: a, reason: collision with root package name */
    private final k f22841a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f22842b = new AtomicBoolean();

    public EventServiceImpl(k kVar) {
        this.f22841a = kVar;
    }

    private void c(String str, Map map, Map map2) {
        if (map.containsKey("items")) {
            Object obj = map.get("items");
            if (!(obj instanceof List)) {
                a("Invalid 'items' value: expected a list.");
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Map)) {
                    a("Invalid element in 'items': expected a map.");
                    return;
                }
            }
        }
        this.f22841a.r0().a((j5) new s6(this.f22841a, false, R8.v.f("track_event:", str), new Cb.a(this, str, map, map2, 18)), e6.b.OTHER);
    }

    private String d() {
        return wg.b.c(new StringBuilder(), (String) this.f22841a.a(y4.f23915u0), "4.0/pix");
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f22842b.compareAndSet(false, true)) {
            this.f22841a.F().trackEvent("landing");
        }
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        map2.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEventSynchronously(String str) throws Settings.SettingNotFoundException {
        this.f22841a.O();
        if (o.a()) {
            this.f22841a.O().a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        s1 s1Var = new s1(str, new HashMap());
        boolean zContains = this.f22841a.c(y4.f23581E0).contains(s1Var.c());
        Map mapA = a(s1Var, true, zContains);
        HashMap map = new HashMap(s1Var.d());
        if (((Boolean) this.f22841a.a(y4.f23594F5)).booleanValue() || ((Boolean) this.f22841a.a(y4.f23556A5)).booleanValue()) {
            map.putAll(mapA);
            mapA = null;
        }
        this.f22841a.f0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).b(mapA).c(map).a(a(s1Var, zContains)).c(((Boolean) this.f22841a.a(y4.f23670P5)).booleanValue()).a(((Boolean) this.f22841a.a(y4.f23844l5)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            o.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.f22841a.D().a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent("iap", map2);
    }

    private void a(String str, Map map) {
        boolean zContains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        this.f22841a.r0().a((j5) new s6(this.f22841a, zContains, "submitTrackEventPostback", new Db.b(this, str, map, zContains)), e6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, Map map, Map map2) {
        Map map3 = CollectionUtils.map("AppLovin-Event", str);
        map3.put("AppLovin-SDK-Name", "AppLovin-MAX");
        d.b bVarD = com.applovin.impl.sdk.network.d.b().d(b()).a(a()).a(map3).c(a(str, map, map2)).a(((Boolean) this.f22841a.a(y4.f23844l5)).booleanValue()).a(v4.a.a(((Integer) this.f22841a.a(y4.f23931w5)).intValue())).d(false);
        if (this.f22841a.t0().c()) {
            bVarD.b(CollectionUtils.map("axon_test_code", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION));
        }
        this.f22841a.f0().e(bVarD.a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map) {
        trackEvent(str, map, new HashMap());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2) {
        if (TextUtils.isEmpty(str)) {
            a("Unable to track empty event");
        } else if (this.f22841a.c(y4.f23589F0).contains(str)) {
            c(str, map, map2);
        } else {
            a(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, boolean z2) throws Settings.SettingNotFoundException {
        s1 s1Var = new s1(str, map);
        boolean zContains = this.f22841a.c(y4.f23581E0).contains(s1Var.c());
        Map mapA = a(s1Var, false, zContains);
        HashMap map2 = new HashMap(s1Var.d());
        if (((Boolean) this.f22841a.a(y4.f23594F5)).booleanValue() || ((Boolean) this.f22841a.a(y4.f23556A5)).booleanValue()) {
            map2.putAll(mapA);
            mapA = null;
        }
        this.f22841a.f0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).a(a(s1Var, zContains)).b(mapA).c(map2).c(((Boolean) this.f22841a.a(y4.f23670P5)).booleanValue()).a(((Boolean) this.f22841a.a(y4.f23844l5)).booleanValue()).d(z2).a(v4.a.a(((Integer) this.f22841a.a(y4.f23925v5)).intValue())).a());
    }

    private String b() {
        return wg.b.c(new StringBuilder(), (String) this.f22841a.a(y4.f23928w0), "v1/app");
    }

    private String c() {
        return wg.b.c(new StringBuilder(), (String) this.f22841a.a(y4.v0), "4.0/pix");
    }

    private void a(String str) {
        o.h("AppLovinEventService", str);
        if (o7.c(this.f22841a)) {
            throw new IllegalArgumentException(str);
        }
    }

    private Map a(s1 s1Var, boolean z2, boolean z10) throws Settings.SettingNotFoundException {
        Map mapA = this.f22841a.A().a((Map) null, z2, false);
        mapA.put("event_id", s1Var.b());
        mapA.put("ts", Long.toString(s1Var.a()));
        if (z10) {
            mapA.put("event", s1Var.c());
        } else {
            mapA.put("event", "postinstall");
            mapA.put("sub_event", s1Var.c());
        }
        return o7.a(mapA);
    }

    private Map a(s1 s1Var, boolean z2) {
        HashMap map = new HashMap();
        if (z2) {
            map.put("AppLovin-Event", s1Var.c());
            return map;
        }
        map.put("AppLovin-Event", "postinstall");
        map.put("AppLovin-Sub-Event", s1Var.c());
        return map;
    }

    private Map a(String str, Map map, Map map2) {
        HashMap map3 = new HashMap();
        s1 s1Var = new s1(str, map);
        map3.put("id", s1Var.b());
        map3.put(MediationMetaData.KEY_NAME, s1Var.c());
        map3.put(JsonStorageKeyNames.DATA_KEY, s1Var.d());
        map3.put("timestamp", i1.a(s1Var.a()));
        Map mapF = this.f22841a.A().F();
        map3.put("app_info", mapF);
        map3.put("device_info", this.f22841a.A().p());
        CollectionUtils.putObjectToStringIfValid("dedupe_id", map2.get("dedupe_id"), map3);
        HashMap map4 = new HashMap();
        map4.put("connectEventKey", this.f22841a.q());
        CollectionUtils.putStringIfValid("eventId", this.f22841a.E(), map4);
        map4.put("version", AppLovinSdk.VERSION);
        map4.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f22841a.j0());
        map4.put("platform", this.f22841a.A().z());
        if (((Boolean) this.f22841a.a(y4.f23661O3)).booleanValue()) {
            CollectionUtils.putStringIfValid("art", this.f22841a.r(), map4);
        }
        HashMap map5 = new HashMap();
        map5.put("firstVisitTs", mapF.get("ia_v2"));
        map5.put("lastVisitTs", mapF.get("last_launch_ms"));
        map5.put("visitCount", mapF.get("app_launch_count"));
        map5.put("currentVisitStartTs", mapF.get("alts_ms"));
        map4.put("visitInfo", map5);
        map3.put("axon", map4);
        return map3;
    }

    private String a() {
        return wg.b.c(new StringBuilder(), (String) this.f22841a.a(y4.f23934x0), "v1/app");
    }
}
