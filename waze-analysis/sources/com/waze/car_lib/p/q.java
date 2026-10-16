package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q extends com.waze.n.ac {

    /* renamed from: a, reason: collision with root package name */
    private final String f20822a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20823b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, String str2) {
        super(null, null);
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "message");
        this.f20822a = str;
        this.f20823b = str2;
    }

    public final String a() {
        return this.f20823b;
    }

    public final String b() {
        return this.f20822a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return h.g.b.x.n(this.f20822a, qVar.f20822a) && h.g.b.x.n(this.f20823b, qVar.f20823b);
    }

    public final int hashCode() {
        return (this.f20822a.hashCode() * 31) + this.f20823b.hashCode();
    }

    public final String toString() {
        return "Loading(title=" + this.f20822a + ", message=" + this.f20823b + ")";
    }
}
