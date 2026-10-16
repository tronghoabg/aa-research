package com.iab.omid.library.vungle.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f28145c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.vungle.adsession.a> f28146a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.vungle.adsession.a> f28147b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f28145c;
    }

    public Collection<com.iab.omid.library.vungle.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f28147b);
    }

    public Collection<com.iab.omid.library.vungle.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f28146a);
    }

    public boolean d() {
        return this.f28147b.size() > 0;
    }

    public void a(com.iab.omid.library.vungle.adsession.a aVar) {
        this.f28146a.add(aVar);
    }

    public void b(com.iab.omid.library.vungle.adsession.a aVar) {
        boolean zD = d();
        this.f28146a.remove(aVar);
        this.f28147b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.vungle.adsession.a aVar) {
        boolean zD = d();
        this.f28147b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
