package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class n7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f22337a;

    /* renamed from: b, reason: collision with root package name */
    private String f22338b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22339c = a(a5.f20958l);

    /* renamed from: d, reason: collision with root package name */
    private final String f22340d = a(a5.f20959m);

    /* renamed from: e, reason: collision with root package name */
    private String f22341e = (String) b5.a(a5.f20960n, (Object) null, com.applovin.impl.sdk.k.o());

    /* renamed from: f, reason: collision with root package name */
    private String f22342f = (String) b5.a(a5.f20961o, (Object) null, com.applovin.impl.sdk.k.o());

    public n7(com.applovin.impl.sdk.k kVar) {
        this.f22337a = kVar;
        a(f());
    }

    private String f() {
        if (!((Boolean) this.f22337a.a(y4.f23668P3)).booleanValue()) {
            this.f22337a.c(a5.k);
        }
        String str = (String) this.f22337a.a(a5.k);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f22337a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f22337a.O().a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String a() {
        return this.f22340d;
    }

    public String b() {
        return this.f22341e;
    }

    public String c() {
        return this.f22339c;
    }

    public String d() {
        return this.f22342f;
    }

    public String e() {
        return this.f22338b;
    }

    private String a(a5 a5Var) {
        String str = (String) b5.a(a5Var, (Object) null, com.applovin.impl.sdk.k.o());
        if (StringUtils.isValidString(str)) {
            return str;
        }
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        b5.b(a5Var, lowerCase, com.applovin.impl.sdk.k.o());
        return lowerCase;
    }

    public void b(String str) {
        this.f22341e = str;
        b5.b(a5.f20960n, str, com.applovin.impl.sdk.k.o());
    }

    public void c(String str) {
        this.f22342f = str;
        b5.b(a5.f20961o, str, com.applovin.impl.sdk.k.o());
    }

    public void a(String str) {
        if (((Boolean) this.f22337a.a(y4.f23668P3)).booleanValue()) {
            this.f22337a.b(a5.k, str);
        }
        this.f22338b = str;
        this.f22337a.t().b(str, a());
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        a5 a5Var = a5.f20962p;
        String str = (String) kVar.a(a5Var);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        kVar.b(a5Var, strValueOf);
        return strValueOf;
    }
}
