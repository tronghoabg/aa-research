package ue;

import Va.M6;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f46795a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46796b;

    /* renamed from: c, reason: collision with root package name */
    public final long f46797c;

    public c(long j8, int i5, boolean z2) {
        this.f46795a = z2;
        this.f46796b = i5;
        this.f46797c = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f46795a == cVar.f46795a && this.f46796b == cVar.f46796b && this.f46797c == cVar.f46797c;
    }

    public final int hashCode() {
        int i5 = (((this.f46795a ? 1231 : 1237) * 31) + this.f46796b) * 31;
        long j8 = this.f46797c;
        return i5 + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RetryConfig(shouldRetry=");
        sb2.append(this.f46795a);
        sb2.append(", attemptIndex=");
        sb2.append(this.f46796b);
        sb2.append(", delay=");
        return M6.s(sb2, this.f46797c, ")");
    }
}
