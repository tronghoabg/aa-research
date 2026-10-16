package com.moloco.sdk.acm.db;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f28346a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28347b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28348c;

    /* renamed from: d, reason: collision with root package name */
    public final b f28349d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f28350e;

    /* renamed from: f, reason: collision with root package name */
    public final List f28351f;

    public a(long j8, String name, long j10, b eventType, Long l10, List tags) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(eventType, "eventType");
        AbstractC3340k.e(tags, "tags");
        this.f28346a = j8;
        this.f28347b = name;
        this.f28348c = j10;
        this.f28349d = eventType;
        this.f28350e = l10;
        this.f28351f = tags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f28346a == aVar.f28346a && AbstractC3340k.a(this.f28347b, aVar.f28347b) && this.f28348c == aVar.f28348c && this.f28349d == aVar.f28349d && AbstractC3340k.a(this.f28350e, aVar.f28350e) && AbstractC3340k.a(this.f28351f, aVar.f28351f);
    }

    public final int hashCode() {
        long j8 = this.f28346a;
        int iC = N0.a.c(((int) (j8 ^ (j8 >>> 32))) * 31, 31, this.f28347b);
        long j10 = this.f28348c;
        int iHashCode = (this.f28349d.hashCode() + ((iC + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31;
        Long l10 = this.f28350e;
        return this.f28351f.hashCode() + ((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31);
    }

    public final String toString() {
        return "EventEntity(id=" + this.f28346a + ", name=" + this.f28347b + ", timestamp=" + this.f28348c + ", eventType=" + this.f28349d + ", data=" + this.f28350e + ", tags=" + this.f28351f + ')';
    }
}
