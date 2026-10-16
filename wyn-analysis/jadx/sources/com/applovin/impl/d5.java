package com.applovin.impl;

import A7.AbstractC0279p0;
import com.applovin.mediation.MaxError;

/* loaded from: classes.dex */
public class d5 {

    /* renamed from: a, reason: collision with root package name */
    private final e5 f21368a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21369b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21370c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21371d;

    /* renamed from: e, reason: collision with root package name */
    private final MaxError f21372e;

    /* renamed from: f, reason: collision with root package name */
    private final long f21373f;

    /* renamed from: g, reason: collision with root package name */
    private final long f21374g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f21375h;

    public interface a {
        void a(d5 d5Var);
    }

    private d5(e5 e5Var, com.applovin.impl.mediation.h hVar, String str, MaxError maxError, long j8, long j10) {
        this(e5Var, str, maxError, j8, j10, hVar != null ? hVar.i() : null, hVar != null ? hVar.b() : null, false);
    }

    public static d5 a(e5 e5Var, com.applovin.impl.mediation.h hVar, String str, long j8, long j10) {
        if (e5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (hVar != null) {
            return new d5(e5Var, hVar, str, null, j8, j10);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public long b() {
        return this.f21374g;
    }

    public MaxError c() {
        return this.f21372e;
    }

    public String d() {
        return this.f21369b;
    }

    public String e() {
        return this.f21371d;
    }

    public e5 f() {
        return this.f21368a;
    }

    public boolean g() {
        return this.f21375h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SignalCollectionResult{mSignalProviderSpec=");
        sb2.append(this.f21368a);
        sb2.append(", mSdkVersion='");
        sb2.append(this.f21369b);
        sb2.append("', mAdapterVersion='");
        sb2.append(this.f21370c);
        sb2.append("', mSignalDataLength='");
        String str = this.f21371d;
        sb2.append(str != null ? str.length() : 0);
        sb2.append("', mErrorMessage=");
        MaxError maxError = this.f21372e;
        return AbstractC0279p0.n(sb2, maxError != null ? maxError.getMessage() : "", '}');
    }

    private d5(e5 e5Var, String str, MaxError maxError, long j8, long j10, String str2, String str3, boolean z2) {
        this.f21368a = e5Var;
        this.f21371d = str;
        this.f21372e = maxError;
        this.f21373f = j8;
        this.f21374g = j10;
        this.f21369b = str2;
        this.f21370c = str3;
        this.f21375h = z2;
    }

    public static d5 a(e5 e5Var, MaxError maxError) {
        return a(e5Var, (com.applovin.impl.mediation.h) null, maxError, -1L, -1L);
    }

    public static d5 a(e5 e5Var, com.applovin.impl.mediation.h hVar, MaxError maxError, long j8, long j10) {
        if (e5Var != null) {
            return new d5(e5Var, hVar, null, maxError, j8, j10);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static d5 a(d5 d5Var) {
        return new d5(d5Var.f(), d5Var.e(), d5Var.c(), d5Var.f21373f, d5Var.f21374g, d5Var.d(), d5Var.a(), true);
    }

    public String a() {
        return this.f21370c;
    }
}
