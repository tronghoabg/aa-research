package com.vungle.ads.internal.network;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f33423a;

    /* renamed from: b, reason: collision with root package name */
    public g f33424b;

    /* renamed from: c, reason: collision with root package name */
    public Map f33425c;

    /* renamed from: d, reason: collision with root package name */
    public String f33426d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f33427e;

    /* renamed from: f, reason: collision with root package name */
    public int f33428f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f33429g;

    /* renamed from: h, reason: collision with root package name */
    public int f33430h;

    /* renamed from: i, reason: collision with root package name */
    public String f33431i;

    /* renamed from: j, reason: collision with root package name */
    public com.vungle.ads.internal.util.s f33432j;

    public p(String url) {
        AbstractC3340k.e(url, "url");
        this.f33423a = url;
        this.f33424b = g.GET;
        this.f33428f = 3;
        this.f33429g = true;
        this.f33430h = 5;
    }

    public final p a(g method) {
        AbstractC3340k.e(method, "method");
        this.f33424b = method;
        return this;
    }

    public final void b() {
        this.f33424b = g.GET;
    }

    public final void c() {
        this.f33424b = g.POST;
    }

    public final p d() {
        this.f33427e = Boolean.TRUE;
        return this;
    }

    public final p a(Map map) {
        this.f33425c = map;
        return this;
    }

    public final p b(String str) {
        this.f33431i = str;
        return this;
    }

    public final p a(String str) {
        this.f33426d = str;
        return this;
    }

    public final p a(boolean z2) {
        this.f33429g = z2;
        return this;
    }

    public final p a(com.vungle.ads.internal.util.s sVar) {
        this.f33432j = sVar;
        return this;
    }

    public final q a() {
        return new q(this.f33423a, this.f33424b, this.f33425c, this.f33426d, this.f33427e, this.f33428f, this.f33429g, this.f33430h, this.f33431i, this.f33432j);
    }
}
