package com.google.android.gms.common.internal;

import android.accounts.Account;
import com.waze.navigate.di;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Account f5075a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f5076b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f5077c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f5078d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5079e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5080f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.m.c f5081g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f5082h;

    public p(Account account, Set set, String str, String str2, com.google.android.gms.m.c cVar) {
        this.f5075a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f5076b = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f5078d = map;
        this.f5079e = str;
        this.f5080f = str2;
        this.f5081g = cVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Object obj = ((di) it.next()).f31238a;
            hashSet.addAll(null);
        }
        this.f5077c = DesugarCollections.unmodifiableSet(hashSet);
    }

    public final Account a() {
        return this.f5075a;
    }

    public final Account b() {
        Account account = this.f5075a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public final com.google.android.gms.m.c c() {
        return this.f5081g;
    }

    public final Integer d() {
        return this.f5082h;
    }

    public final String e() {
        return this.f5080f;
    }

    public final String f() {
        return this.f5079e;
    }

    public final Set g() {
        return this.f5077c;
    }

    public final Set h() {
        return this.f5076b;
    }

    public final void i(Integer num) {
        this.f5082h = num;
    }
}
