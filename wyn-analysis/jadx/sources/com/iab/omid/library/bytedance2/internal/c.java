package com.iab.omid.library.bytedance2.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f27993c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bytedance2.adsession.a> f27994a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bytedance2.adsession.a> f27995b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f27993c;
    }

    public Collection<com.iab.omid.library.bytedance2.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f27995b);
    }

    public Collection<com.iab.omid.library.bytedance2.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f27994a);
    }

    public boolean d() {
        return this.f27995b.size() > 0;
    }

    public void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        this.f27994a.add(aVar);
    }

    public void b(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean zD = d();
        this.f27994a.remove(aVar);
        this.f27995b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean zD = d();
        this.f27995b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
