package ga;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f35797a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f35798b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f35799c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f35800d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f35801e;

    public f(Boolean bool, Double d3, Integer num, Integer num2, Long l10) {
        this.f35797a = bool;
        this.f35798b = d3;
        this.f35799c = num;
        this.f35800d = num2;
        this.f35801e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC3340k.a(this.f35797a, fVar.f35797a) && AbstractC3340k.a(this.f35798b, fVar.f35798b) && AbstractC3340k.a(this.f35799c, fVar.f35799c) && AbstractC3340k.a(this.f35800d, fVar.f35800d) && AbstractC3340k.a(this.f35801e, fVar.f35801e);
    }

    public final int hashCode() {
        Boolean bool = this.f35797a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d3 = this.f35798b;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.f35799c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f35800d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f35801e;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f35797a + ", sessionSamplingRate=" + this.f35798b + ", sessionRestartTimeout=" + this.f35799c + ", cacheDuration=" + this.f35800d + ", cacheUpdatedTime=" + this.f35801e + ')';
    }
}
