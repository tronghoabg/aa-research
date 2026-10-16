package com.vungle.ads.internal;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class a extends h {
    public a() {
        super("ERROR", 6, 0);
    }

    @Override // com.vungle.ads.internal.h
    public final boolean a(h adState) {
        AbstractC3340k.e(adState, "adState");
        return adState == h.f33013f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "failed";
    }
}
