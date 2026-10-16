package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.services.G;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final G f29477a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f29478b;

    public f(G g9, Integer num) {
        this.f29477a = g9;
        this.f29478b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f29477a == fVar.f29477a && AbstractC3340k.a(this.f29478b, fVar.f29478b);
    }

    public final int hashCode() {
        G g9 = this.f29477a;
        int iHashCode = (g9 == null ? 0 : g9.hashCode()) * 31;
        Integer num = this.f29478b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "AudioSignal(muteSwitchState=" + this.f29477a + ", mediaVolume=" + this.f29478b + ')';
    }
}
