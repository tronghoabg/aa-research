package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class d1 extends s2 {

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.k f21249e;

    /* renamed from: f, reason: collision with root package name */
    private List f21250f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f21251g;

    /* renamed from: h, reason: collision with root package name */
    private List f21252h;

    public enum a {
        RECENT_ADS,
        COUNT
    }

    public d1(Context context) {
        super(context);
        this.f21251g = new AtomicBoolean();
        this.f21252h = new ArrayList();
    }

    public void a(List list, com.applovin.impl.sdk.k kVar) {
        Activity activityV0;
        this.f21249e = kVar;
        this.f21250f = list;
        if (!(this.f22761a instanceof Activity) && (activityV0 = kVar.v0()) != null) {
            this.f22761a = activityV0;
        }
        if (list != null && this.f21251g.compareAndSet(false, true)) {
            this.f21252h = a(this.f21250f);
        }
        AppLovinSdkUtils.runOnUiThread(new D0(this, 5));
    }

    @Override // com.applovin.impl.s2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    public List c(int i5) {
        return this.f21252h;
    }

    public List d() {
        return this.f21250f;
    }

    public com.applovin.impl.sdk.k e() {
        return this.f21249e;
    }

    public boolean f() {
        return this.f21252h.size() == 0;
    }

    public void g() {
        this.f21251g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f21251g.get() + "}";
    }

    @Override // com.applovin.impl.s2
    public int d(int i5) {
        return this.f21252h.size();
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i5) {
        return new w4("RECENT ADS");
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new p1((q1) it.next(), this.f22761a));
        }
        return arrayList;
    }
}
