package com.vungle.ads.internal;

import com.vungle.ads.internal.model.i3;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.vungle.ads.internal.model.h0 f33893a;

    /* renamed from: b, reason: collision with root package name */
    public final i3 f33894b;

    /* renamed from: c, reason: collision with root package name */
    public final com.vungle.ads.internal.presenter.z f33895c;

    public y0(com.vungle.ads.internal.model.h0 adPayload, i3 placement, com.vungle.ads.internal.presenter.z zVar) {
        AbstractC3340k.e(adPayload, "adPayload");
        AbstractC3340k.e(placement, "placement");
        this.f33893a = adPayload;
        this.f33894b = placement;
        this.f33895c = zVar;
    }

    public final com.vungle.ads.internal.model.h0 a() {
        return this.f33893a;
    }

    public final i3 b() {
        return this.f33894b;
    }

    public final com.vungle.ads.internal.presenter.z c() {
        return this.f33895c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return AbstractC3340k.a(this.f33893a, y0Var.f33893a) && AbstractC3340k.a(this.f33894b, y0Var.f33894b) && AbstractC3340k.a(this.f33895c, y0Var.f33895c);
    }

    public final int hashCode() {
        int iHashCode = (this.f33894b.hashCode() + (this.f33893a.hashCode() * 31)) * 31;
        com.vungle.ads.internal.presenter.z zVar = this.f33895c;
        return iHashCode + (zVar == null ? 0 : zVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("PendingData(adPayload=");
        sbA.append(this.f33893a);
        sbA.append(", placement=");
        sbA.append(this.f33894b);
        sbA.append(", presenterDelegate=");
        sbA.append(this.f33895c);
        sbA.append(')');
        return sbA.toString();
    }
}
