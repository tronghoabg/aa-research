package com.vungle.ads.internal;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class e extends h {
    public e() {
        super("NEW", 0, 0);
    }

    @Override // com.vungle.ads.internal.h
    public final boolean a(h adState) {
        AbstractC3340k.e(adState, "adState");
        return adState == h.f33009b || adState == h.f33010c || adState == h.f33014g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "idle";
    }
}
