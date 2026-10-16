package com.moloco.sdk.acm.db;

import K3.o;
import N2.j;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k3.C3171c;
import k3.C3176h;
import l3.AbstractC3384a;
import o3.C3645b;

/* loaded from: classes4.dex */
public final class MetricsDb_Impl extends MetricsDb {

    /* renamed from: o, reason: collision with root package name */
    public volatile e f28345o;

    @Override // k3.AbstractC3181m
    public final C3176h d() {
        return new C3176h(this, new HashMap(0), new HashMap(0), "events");
    }

    @Override // k3.AbstractC3181m
    public final o3.d e(C3171c c3171c) {
        return c3171c.f39181c.c(new C3645b(c3171c.f39179a, c3171c.f39180b, new j(c3171c, new o(this), "b1f78eccdc6d7153084e9120766fe56b", "82d5e07fb1fc98c9c5bfa339c0f04693"), false, false));
    }

    @Override // k3.AbstractC3181m
    public final List f(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new AbstractC3384a[0]);
    }

    @Override // k3.AbstractC3181m
    public final Set h() {
        return new HashSet();
    }

    @Override // k3.AbstractC3181m
    public final Map i() {
        HashMap map = new HashMap();
        map.put(e.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.moloco.sdk.acm.db.MetricsDb
    public final e p() {
        e eVar;
        if (this.f28345o != null) {
            return this.f28345o;
        }
        synchronized (this) {
            try {
                if (this.f28345o == null) {
                    this.f28345o = new e(this);
                }
                eVar = this.f28345o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
