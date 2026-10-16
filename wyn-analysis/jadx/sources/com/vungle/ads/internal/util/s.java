package com.vungle.ads.internal.util;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public String f33862a;

    /* renamed from: b, reason: collision with root package name */
    public String f33863b;

    /* renamed from: c, reason: collision with root package name */
    public String f33864c;

    /* renamed from: d, reason: collision with root package name */
    public String f33865d;

    /* renamed from: e, reason: collision with root package name */
    public String f33866e;

    /* renamed from: f, reason: collision with root package name */
    public String f33867f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f33868g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f33869h;

    /* renamed from: i, reason: collision with root package name */
    public com.vungle.ads.internal.h f33870i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f33871j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public Long f33872l;

    /* renamed from: m, reason: collision with root package name */
    public String f33873m;

    public final void a(com.vungle.ads.internal.h hVar) {
        this.f33870i = hVar;
    }

    public final void b(String str) {
        this.f33865d = str;
    }

    public final void c(String str) {
        this.f33863b = str;
    }

    public final void d(String str) {
        this.f33864c = str;
    }

    public final void e(String str) {
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!s.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC3340k.c(obj, "null cannot be cast to non-null type com.vungle.ads.internal.util.LogEntry");
        s sVar = (s) obj;
        return AbstractC3340k.a(this.f33862a, sVar.f33862a) && AbstractC3340k.a(this.f33863b, sVar.f33863b) && AbstractC3340k.a(this.f33864c, sVar.f33864c) && AbstractC3340k.a(this.f33865d, sVar.f33865d) && AbstractC3340k.a(this.f33866e, sVar.f33866e) && AbstractC3340k.a(this.f33867f, sVar.f33867f) && AbstractC3340k.a(this.f33868g, sVar.f33868g) && AbstractC3340k.a(this.f33869h, sVar.f33869h) && this.f33870i == sVar.f33870i && AbstractC3340k.a(this.f33871j, sVar.f33871j) && AbstractC3340k.a(this.k, sVar.k) && AbstractC3340k.a(this.f33872l, sVar.f33872l) && AbstractC3340k.a(this.f33873m, sVar.f33873m);
    }

    public final void f(String str) {
        this.f33866e = str;
    }

    public final void g(String str) {
        this.f33862a = str;
    }

    public final String h() {
        return this.f33864c;
    }

    public final int hashCode() {
        int iA = (a(this.f33867f) + ((a(this.f33866e) + ((a(this.f33865d) + ((a(this.f33864c) + ((a(this.f33863b) + (a(this.f33862a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Boolean bool = this.f33868g;
        int iHashCode = (iA + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f33869h;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        com.vungle.ads.internal.h hVar = this.f33870i;
        int iHashCode3 = (iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Boolean bool3 = this.f33871j;
        int iA2 = (a(this.k) + ((iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31)) * 31;
        Long l10 = this.f33872l;
        return a(this.f33873m) + ((iA2 + (l10 != null ? l10.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.k;
    }

    public final String j() {
        return this.f33866e;
    }

    public final Boolean k() {
        return this.f33868g;
    }

    public final String l() {
        return this.f33862a;
    }

    public final String m() {
        return this.f33867f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogEntry(placementRefId=");
        sb2.append(this.f33862a);
        sb2.append(", creativeId=");
        sb2.append(this.f33863b);
        sb2.append(", eventId=");
        sb2.append(this.f33864c);
        sb2.append(", adSource=");
        sb2.append(this.f33865d);
        sb2.append(", mediationName=");
        sb2.append(this.f33866e);
        sb2.append(", vmVersion=");
        sb2.append(this.f33867f);
        sb2.append(", partialDownloadEnabled=");
        sb2.append(this.f33868g);
        sb2.append(", adoEnabled=");
        sb2.append(this.f33869h);
        sb2.append(", adState=");
        sb2.append(this.f33870i);
        sb2.append(" adPoddingEnabled=");
        sb2.append(this.f33871j);
        sb2.append(", experiments=");
        sb2.append(this.k);
        sb2.append(", adLoadType=");
        sb2.append(this.f33872l);
        sb2.append(", adapterAdFormat=");
        return AbstractC0279p0.n(sb2, this.f33873m, ')');
    }

    public final void a(Boolean bool) {
        this.f33871j = bool;
    }

    public final void b(Boolean bool) {
        this.f33869h = bool;
    }

    public final String c() {
        return this.f33865d;
    }

    public final com.vungle.ads.internal.h d() {
        return this.f33870i;
    }

    public final String e() {
        return this.f33873m;
    }

    public final Boolean f() {
        return this.f33869h;
    }

    public final String g() {
        return this.f33863b;
    }

    public final void h(String str) {
        this.f33867f = str;
    }

    public final Long a() {
        return this.f33872l;
    }

    public final Boolean b() {
        return this.f33871j;
    }

    public final void c(Boolean bool) {
        this.f33868g = bool;
    }

    public final void a(Long l10) {
        this.f33872l = l10;
    }

    public static int a(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
