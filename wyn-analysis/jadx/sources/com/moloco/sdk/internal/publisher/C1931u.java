package com.moloco.sdk.internal.publisher;

import ff.AbstractC2641B;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.internal.publisher.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1931u {

    /* renamed from: a, reason: collision with root package name */
    public final Map f29342a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29343b;

    public C1931u() {
        long jS;
        c0[] c0VarArrValues = c0.values();
        int iD = AbstractC2641B.D(c0VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD < 16 ? 16 : iD);
        for (c0 c0Var : c0VarArrValues) {
            switch (AbstractC1930t.f29341a[c0Var.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    jS = Fe.b.S(5, Cf.c.f2208d);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    jS = Fe.b.S(15, Cf.c.f2208d);
                    break;
                default:
                    throw new E5.Q((byte) 0, 9);
            }
            linkedHashMap.put(c0Var, new Cf.a(jS));
        }
        long jS2 = Fe.b.S(5, Cf.c.f2208d);
        this.f29342a = linkedHashMap;
        this.f29343b = jS2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1931u) {
            C1931u c1931u = (C1931u) obj;
            if (AbstractC3340k.a(this.f29342a, c1931u.f29342a)) {
                Cf.h hVar = Cf.a.f2200b;
                return this.f29343b == c1931u.f29343b;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f29342a.hashCode() * 31;
        Cf.h hVar = Cf.a.f2200b;
        long j8 = this.f29343b;
        return ((int) (j8 ^ (j8 >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "AdCreatorConfiguration(adTimeouts=" + this.f29342a + ", defaultTimeoutDuration=" + ((Object) Cf.a.j(this.f29343b)) + ')';
    }
}
