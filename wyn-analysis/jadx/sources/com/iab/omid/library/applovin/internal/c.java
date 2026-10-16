package com.iab.omid.library.applovin.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f27860c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f27861a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f27862b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f27860c;
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f27862b);
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f27861a);
    }

    public boolean d() {
        return this.f27862b.size() > 0;
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar) {
        this.f27861a.add(aVar);
    }

    public void b(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean zD = d();
        this.f27861a.remove(aVar);
        this.f27862b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean zD = d();
        this.f27862b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
