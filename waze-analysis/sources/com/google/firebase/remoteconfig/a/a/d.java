package com.google.firebase.remoteconfig.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private String f10594a;

    /* renamed from: b, reason: collision with root package name */
    private String f10595b;

    /* renamed from: c, reason: collision with root package name */
    private String f10596c;

    /* renamed from: d, reason: collision with root package name */
    private String f10597d;

    /* renamed from: e, reason: collision with root package name */
    private long f10598e;

    /* renamed from: f, reason: collision with root package name */
    private byte f10599f;

    public final e a() {
        if (this.f10599f == 1 && this.f10594a != null && this.f10595b != null && this.f10596c != null && this.f10597d != null) {
            return new c(this.f10594a, this.f10595b, this.f10596c, this.f10597d, this.f10598e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f10594a == null) {
            sb.append(" rolloutId");
        }
        if (this.f10595b == null) {
            sb.append(" variantId");
        }
        if (this.f10596c == null) {
            sb.append(" parameterKey");
        }
        if (this.f10597d == null) {
            sb.append(" parameterValue");
        }
        if (this.f10599f == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f10596c = str;
    }

    public final void c(String str) {
        this.f10597d = str;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f10594a = str;
    }

    public final void e(long j2) {
        this.f10598e = j2;
        this.f10599f = (byte) 1;
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f10595b = str;
    }
}
