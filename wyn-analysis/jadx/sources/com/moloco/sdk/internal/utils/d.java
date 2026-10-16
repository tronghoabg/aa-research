package com.moloco.sdk.internal.utils;

import A.AbstractC0213f;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f29777a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29778b;

    public d(long j8, long j10) {
        this.f29777a = j8;
        this.f29778b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f29777a == dVar.f29777a && this.f29778b == dVar.f29778b;
    }

    public final int hashCode() {
        long j8 = this.f29777a;
        int i5 = ((int) (j8 ^ (j8 >>> 32))) * 31;
        long j10 = this.f29778b;
        return i5 + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StorageInfo(availableBytes=");
        sb2.append(this.f29777a);
        sb2.append(", totalBytes=");
        return AbstractC0213f.e(sb2, this.f29778b, ')');
    }
}
