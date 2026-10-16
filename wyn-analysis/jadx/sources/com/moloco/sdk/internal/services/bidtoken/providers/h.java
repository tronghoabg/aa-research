package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f29481a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f29482b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f29483c;

    public h(Integer num, Integer num2, Boolean bool) {
        this.f29481a = num;
        this.f29482b = num2;
        this.f29483c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC3340k.a(this.f29481a, hVar.f29481a) && AbstractC3340k.a(this.f29482b, hVar.f29482b) && AbstractC3340k.a(this.f29483c, hVar.f29483c);
    }

    public final int hashCode() {
        Integer num = this.f29481a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f29482b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f29483c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BatteryInfoSignal(maxBatteryLevel=" + this.f29481a + ", batteryStatus=" + this.f29482b + ", isPowerSaveMode=" + this.f29483c + ')';
    }
}
