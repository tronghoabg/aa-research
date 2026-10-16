package com.waze.sharedui.web;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    private final String f39325a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39326b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39327c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f39328d;

    public /* synthetic */ ao(String str, boolean z, boolean z2, int i2) {
        this(1 == (i2 & 1) ? "" : str, z | (!((i2 & 4) == 0)), z2 | (!((i2 & 8) == 0)));
    }

    public final String a() {
        return this.f39325a;
    }

    public final boolean b() {
        return this.f39328d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        if (!h.g.b.x.n(this.f39325a, aoVar.f39325a)) {
            return false;
        }
        String str = aoVar.f39326b;
        return h.g.b.x.n(null, null) && this.f39327c == aoVar.f39327c && this.f39328d == aoVar.f39328d;
    }

    public final int hashCode() {
        return (((this.f39325a.hashCode() * 961) + a.a.a(this.f39327c)) * 31) + a.a.a(this.f39328d);
    }

    public final String toString() {
        return "WebPageHeaderState(title=" + this.f39325a + ", shareMessage=null, showBackButton=" + this.f39327c + ", showCloseButton=" + this.f39328d + ")";
    }

    public ao(String str, boolean z, boolean z2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f39325a = str;
        this.f39326b = null;
        this.f39327c = z;
        this.f39328d = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ao() {
        boolean z = false;
        this(null, z, z, 15);
    }
}
