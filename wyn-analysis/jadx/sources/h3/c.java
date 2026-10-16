package h3;

import A7.AbstractC0279p0;
import R8.v;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f36045a;

    /* renamed from: b, reason: collision with root package name */
    public final long f36046b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36047c;

    public c(long j8, long j10, int i5) {
        this.f36045a = j8;
        this.f36046b = j10;
        this.f36047c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f36045a == cVar.f36045a && this.f36046b == cVar.f36046b && this.f36047c == cVar.f36047c;
    }

    public final int hashCode() {
        long j8 = this.f36045a;
        int i5 = ((int) (j8 ^ (j8 >>> 32))) * 31;
        long j10 = this.f36046b;
        return ((i5 + ((int) ((j10 >>> 32) ^ j10))) * 31) + this.f36047c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaxonomyVersion=");
        sb2.append(this.f36045a);
        sb2.append(", ModelVersion=");
        sb2.append(this.f36046b);
        sb2.append(", TopicCode=");
        return v.f("Topic { ", AbstractC0279p0.j(this.f36047c, " }", sb2));
    }
}
