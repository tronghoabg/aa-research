package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2079l {

    /* renamed from: a, reason: collision with root package name */
    public final List f31417a;

    /* renamed from: b, reason: collision with root package name */
    public final List f31418b;

    /* renamed from: c, reason: collision with root package name */
    public final List f31419c;

    public C2079l(List list, List errorUrls, List list2) {
        AbstractC3340k.e(errorUrls, "errorUrls");
        this.f31417a = list;
        this.f31418b = errorUrls;
        this.f31419c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2079l)) {
            return false;
        }
        C2079l c2079l = (C2079l) obj;
        return AbstractC3340k.a(this.f31417a, c2079l.f31417a) && AbstractC3340k.a(this.f31418b, c2079l.f31418b) && AbstractC3340k.a(this.f31419c, c2079l.f31419c);
    }

    public final int hashCode() {
        return this.f31419c.hashCode() + ((this.f31418b.hashCode() + (this.f31417a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AggregatedWrapperChainAdData(impressions=" + this.f31417a + ", errorUrls=" + this.f31418b + ", creativesPerWrapper=" + this.f31419c + ')';
    }
}
