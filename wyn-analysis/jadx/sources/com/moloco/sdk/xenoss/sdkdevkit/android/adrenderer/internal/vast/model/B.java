package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final C f31434a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31435b;

    /* renamed from: c, reason: collision with root package name */
    public final y f31436c;

    public B(C event, String url, y yVar) {
        AbstractC3340k.e(event, "event");
        AbstractC3340k.e(url, "url");
        this.f31434a = event;
        this.f31435b = url;
        this.f31436c = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b5 = (B) obj;
        return this.f31434a == b5.f31434a && AbstractC3340k.a(this.f31435b, b5.f31435b) && AbstractC3340k.a(this.f31436c, b5.f31436c);
    }

    public final int hashCode() {
        int iC = N0.a.c(this.f31434a.hashCode() * 31, 31, this.f31435b);
        y yVar = this.f31436c;
        return iC + (yVar == null ? 0 : yVar.hashCode());
    }

    public final String toString() {
        return "Tracking(event=" + this.f31434a + ", url=" + this.f31435b + ", offset=" + this.f31436c + ')';
    }
}
