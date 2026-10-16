package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f29514a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f29515b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f29516c;

    public q(Boolean bool, Long l10, Long l11) {
        this.f29514a = bool;
        this.f29515b = l10;
        this.f29516c = l11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return AbstractC3340k.a(this.f29514a, qVar.f29514a) && AbstractC3340k.a(this.f29515b, qVar.f29515b) && AbstractC3340k.a(this.f29516c, qVar.f29516c);
    }

    public final int hashCode() {
        Boolean bool = this.f29514a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l10 = this.f29515b;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f29516c;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    public final String toString() {
        return "MemoryInfoSignal(lowMemory=" + this.f29514a + ", threshold=" + this.f29515b + ", totalMem=" + this.f29516c + ')';
    }
}
