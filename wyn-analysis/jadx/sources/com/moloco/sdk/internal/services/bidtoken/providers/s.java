package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f29519a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f29520b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f29521c;

    /* renamed from: d, reason: collision with root package name */
    public final Ba.c f29522d;

    public s(Integer num, Integer num2, Boolean bool, Ba.c cVar) {
        this.f29519a = num;
        this.f29520b = num2;
        this.f29521c = bool;
        this.f29522d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return AbstractC3340k.a(this.f29519a, sVar.f29519a) && AbstractC3340k.a(this.f29520b, sVar.f29520b) && AbstractC3340k.a(this.f29521c, sVar.f29521c) && AbstractC3340k.a(this.f29522d, sVar.f29522d);
    }

    public final int hashCode() {
        Integer num = this.f29519a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f29520b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f29521c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Ba.c cVar = this.f29522d;
        return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkInfoSignal(mobileCountryCode=" + this.f29519a + ", mobileNetworkCode=" + this.f29520b + ", networkRestricted=" + this.f29521c + ", networkType=" + this.f29522d + ')';
    }
}
