package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f29466a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f29467b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f29468c;

    /* renamed from: d, reason: collision with root package name */
    public final Float f29469d;

    public a(Boolean bool, Boolean bool2, Boolean bool3, Float f10) {
        this.f29466a = bool;
        this.f29467b = bool2;
        this.f29468c = bool3;
        this.f29469d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC3340k.a(this.f29466a, aVar.f29466a) && AbstractC3340k.a(this.f29467b, aVar.f29467b) && AbstractC3340k.a(this.f29468c, aVar.f29468c) && AbstractC3340k.a(this.f29469d, aVar.f29469d);
    }

    public final int hashCode() {
        Boolean bool = this.f29466a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f29467b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f29468c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Float f10 = this.f29469d;
        return iHashCode3 + (f10 != null ? f10.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilitySignal(accessibilityCaptioningEnabled=" + this.f29466a + ", accessibilityLargePointerIcon=" + this.f29467b + ", reduceBrightColorsActivated=" + this.f29468c + ", fontScale=" + this.f29469d + ')';
    }
}
