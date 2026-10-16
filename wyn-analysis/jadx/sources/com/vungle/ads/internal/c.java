package com.vungle.ads.internal;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c extends h {
    public c() {
        super("IMPRESSION_LOGGED", 4, 0);
    }

    @Override // com.vungle.ads.internal.h
    public final boolean a(h adState) {
        AbstractC3340k.e(adState, "adState");
        return adState == h.f33013f || adState == h.f33014g || adState == h.f33010c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "impressionLogged";
    }
}
