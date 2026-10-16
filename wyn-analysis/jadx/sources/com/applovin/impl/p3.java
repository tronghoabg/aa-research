package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import cb.AbstractC1593a;
import com.applovin.impl.C1658q0;
import com.applovin.impl.e3;
import com.applovin.impl.e6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p3 implements C1658q0.e {

    /* renamed from: l, reason: collision with root package name */
    private static WeakReference f22482l;

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicBoolean f22483m = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f22484a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f22485b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f22486c;

    /* renamed from: d, reason: collision with root package name */
    private final o3 f22487d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22490g;

    /* renamed from: i, reason: collision with root package name */
    private boolean f22492i;

    /* renamed from: j, reason: collision with root package name */
    private Map f22493j;
    private final C1627b0 k;

    /* renamed from: e, reason: collision with root package name */
    private final Map f22488e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f22489f = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private int f22491h = 2;

    public class a extends AbstractC1626b {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC1626b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started mediation debugger");
                if (!p3.this.c() || p3.f22482l.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = p3.f22482l = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(p3.this.f22487d, p3.this.f22484a.e());
                }
                p3.f22483m.set(false);
            }
        }

        @Override // com.applovin.impl.AbstractC1626b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = p3.f22482l = null;
            }
        }
    }

    public p3(com.applovin.impl.sdk.k kVar) {
        this.f22484a = kVar;
        this.f22485b = kVar.O();
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f22486c = contextO;
        o3 o3Var = new o3(contextO);
        this.f22487d = o3Var;
        this.k = new C1627b0(kVar, o3Var);
    }

    private void f() {
        this.f22484a.e().a(new a());
    }

    public boolean g() {
        return this.f22490g;
    }

    public void h() {
        a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f22487d + "}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        WeakReference weakReference = f22482l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Activity activityV0 = this.f22484a.v0();
        if (activityV0 == null || activityV0.isFinishing()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        } else {
            new AlertDialog.Builder(activityV0).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new G0(this, 0)).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    public void e() {
        if (this.f22489f.compareAndSet(false, true)) {
            this.f22484a.r0().a((j5) new x5(this, this.f22484a), e6.b.OTHER);
        }
    }

    public void a(boolean z2, int i5) {
        this.f22490g = z2;
        this.f22491h = i5;
    }

    public void a(Map map) {
        this.f22493j = map;
        e();
        if (!c() && f22483m.compareAndSet(false, true)) {
            if (!this.f22492i) {
                f();
                this.f22492i = true;
            }
            Intent intent = new Intent(this.f22486c, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting mediation debugger...");
            this.f22486c.startActivity(intent);
            return;
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    public List a(String str) {
        Map map = this.f22493j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f22493j.get(str);
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (e3Var.A() && e3Var.q() == e3.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new F0(this, 1), TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i5) {
        h();
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArrayM = AbstractC1593a.m("networks", jSONObject);
        ArrayList arrayList = new ArrayList(jSONArrayM.length());
        for (int i5 = 0; i5 < jSONArrayM.length(); i5++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayM, i5, (JSONObject) null);
            if (jSONObject2 != null) {
                e3 e3Var = new e3(jSONObject2, kVar);
                arrayList.add(e3Var);
                this.f22488e.put(e3Var.b(), e3Var);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject, List list, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArrayM = AbstractC1593a.m("ad_units", jSONObject);
        ArrayList arrayList = new ArrayList(jSONArrayM.length());
        for (int i5 = 0; i5 < jSONArrayM.length(); i5++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayM, i5, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C1651n(jSONObject2, this.f22488e, kVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(List list, com.applovin.impl.sdk.k kVar) {
        List<String> adUnitIds = kVar.J() != null ? kVar.J().getAdUnitIds() : null;
        if (adUnitIds != null && !adUnitIds.isEmpty()) {
            ArrayList arrayList = new ArrayList(adUnitIds.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1651n c1651n = (C1651n) it.next();
                if (adUnitIds.contains(c1651n.c())) {
                    arrayList.add(c1651n);
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            C1624a0 c1624a0 = new C1624a0(str);
            if (c1624a0.h()) {
                arrayList.add(c1624a0);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f22485b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.C1658q0.e
    public void a(String str, JSONObject jSONObject, int i5) {
        List listA = a(jSONObject, this.f22484a);
        List listA2 = a(jSONObject, listA, this.f22484a);
        List listA3 = a(listA2, this.f22484a);
        List listA4 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f22487d.a(listA, listA2, listA3, listA4, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, PglCryptUtils.KEY_MESSAGE, null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f22484a);
        if (!listA4.isEmpty()) {
            this.k.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new F0(this, 0), TimeUnit.SECONDS.toMillis(this.f22491h));
        } else {
            a(listA);
        }
    }

    @Override // com.applovin.impl.C1658q0.e
    public void a(String str, int i5, String str2, JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f22485b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i5);
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f22484a.D().a("fetchMediationDebuggerInfo", str, i5, str2);
        this.f22487d.a(null, null, null, null, null, null, null, false, this.f22484a);
        this.f22489f.set(false);
    }
}
