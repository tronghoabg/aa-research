package com.waze.ui.g;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final String f42358a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42359b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f42360c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f42361d;

    public t(String str, String str2, boolean z, boolean z2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f42358a = str;
        this.f42359b = str2;
        this.f42360c = z;
        this.f42361d = z2;
    }

    public final String a() {
        return this.f42359b;
    }

    public final String b() {
        return this.f42358a;
    }

    public final boolean c() {
        return this.f42361d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return h.g.b.x.n(this.f42358a, tVar.f42358a) && h.g.b.x.n(this.f42359b, tVar.f42359b) && this.f42360c == tVar.f42360c && this.f42361d == tVar.f42361d;
    }

    public final int hashCode() {
        int iHashCode = this.f42358a.hashCode() * 31;
        String str = this.f42359b;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + a.a.a(this.f42360c)) * 31) + a.a.a(this.f42361d);
    }

    public final String toString() {
        return "CopilotHeaderState(title=" + this.f42358a + ", shareMessage=" + this.f42359b + ", showBackButton=" + this.f42360c + ", showCloseButton=" + this.f42361d + ")";
    }

    public t() {
        this(null);
    }

    public /* synthetic */ t(byte[] bArr) {
        this("", null, true, true);
    }
}
