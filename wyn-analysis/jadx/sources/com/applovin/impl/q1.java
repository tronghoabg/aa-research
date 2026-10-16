package com.applovin.impl;

/* loaded from: classes.dex */
public class q1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f22597a;

    /* renamed from: b, reason: collision with root package name */
    private String f22598b;

    /* renamed from: c, reason: collision with root package name */
    private y2 f22599c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f22600d;

    public q1(Object obj, long j8) {
        this.f22597a = j8;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.f22600d = bVar;
            this.f22598b = bVar.getAdZone().d() != null ? this.f22600d.getAdZone().d().getLabel() : null;
        } else if (obj instanceof y2) {
            y2 y2Var = (y2) obj;
            this.f22599c = y2Var;
            this.f22598b = y2Var.getFormat().getLabel();
        }
    }

    public void a(Object obj) {
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            this.f22600d = (com.applovin.impl.sdk.ad.b) obj;
        } else if (obj instanceof y2) {
            this.f22599c = (y2) obj;
        }
    }

    public long b() {
        return this.f22597a;
    }

    public com.applovin.impl.sdk.ad.b c() {
        return this.f22600d;
    }

    public String d() {
        String str = this.f22598b;
        return str != null ? str : "Unknown";
    }

    public y2 e() {
        return this.f22599c;
    }

    public String f() {
        if (this.f22600d != null) {
            return "AppLovin";
        }
        y2 y2Var = this.f22599c;
        return y2Var != null ? y2Var.getNetworkName() : "Unknown";
    }

    public Object a() {
        com.applovin.impl.sdk.ad.b bVar = this.f22600d;
        return bVar != null ? bVar : this.f22599c;
    }
}
