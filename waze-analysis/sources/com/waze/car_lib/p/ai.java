package com.waze.car_lib.p;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ai extends com.waze.n.aq {

    /* renamed from: a, reason: collision with root package name */
    private final String f20544a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(String str) {
        super(null, null);
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f20544a = str;
    }

    public final String a() {
        return this.f20544a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ai) && h.g.b.x.n(this.f20544a, ((ai) obj).f20544a);
    }

    public final int hashCode() {
        return this.f20544a.hashCode();
    }

    public final String toString() {
        return "Close(title=" + this.f20544a + ")";
    }
}
