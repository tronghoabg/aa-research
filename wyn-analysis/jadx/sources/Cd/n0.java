package Cd;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;

/* loaded from: classes5.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public Long f2142a;

    /* renamed from: b, reason: collision with root package name */
    public Long f2143b;

    /* renamed from: c, reason: collision with root package name */
    public Long f2144c;

    static {
        KClass type = kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(n0.class);
        try {
            kotlin.jvm.internal.H.b(n0.class);
        } catch (Throwable unused) {
        }
        AbstractC3340k.e(type, "type");
        if (Bf.k.y0("TimeoutConfiguration")) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public n0() {
        this.f2142a = 0L;
        this.f2143b = 0L;
        this.f2144c = 0L;
        this.f2142a = null;
        this.f2143b = null;
        this.f2144c = null;
    }

    public static void a(Long l10) {
        if (l10 != null && l10.longValue() <= 0) {
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return AbstractC3340k.a(this.f2142a, n0Var.f2142a) && AbstractC3340k.a(this.f2143b, n0Var.f2143b) && AbstractC3340k.a(this.f2144c, n0Var.f2144c);
    }

    public final int hashCode() {
        Long l10 = this.f2142a;
        int iHashCode = (l10 != null ? l10.hashCode() : 0) * 31;
        Long l11 = this.f2143b;
        int iHashCode2 = (iHashCode + (l11 != null ? l11.hashCode() : 0)) * 31;
        Long l12 = this.f2144c;
        return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
    }
}
