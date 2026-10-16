package com.waze;

import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ji extends jj {

    /* renamed from: a, reason: collision with root package name */
    private final String f24941a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(String str) {
        super(null);
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f24941a = str;
    }

    public final String a() {
        return this.f24941a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji) && h.g.b.x.n(this.f24941a, ((ji) obj).f24941a);
    }

    public final int hashCode() {
        return this.f24941a.hashCode();
    }

    public final String toString() {
        return "Loader(title=" + this.f24941a + ")";
    }
}
