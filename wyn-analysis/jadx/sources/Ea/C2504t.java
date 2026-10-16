package ea;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ea.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2504t {

    /* renamed from: a, reason: collision with root package name */
    public final String f34580a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34581b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34582c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34583d;

    public C2504t(String str, int i5, int i10, boolean z2) {
        this.f34580a = str;
        this.f34581b = i5;
        this.f34582c = i10;
        this.f34583d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2504t)) {
            return false;
        }
        C2504t c2504t = (C2504t) obj;
        return AbstractC3340k.a(this.f34580a, c2504t.f34580a) && this.f34581b == c2504t.f34581b && this.f34582c == c2504t.f34582c && this.f34583d == c2504t.f34583d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = ((((this.f34580a.hashCode() * 31) + this.f34581b) * 31) + this.f34582c) * 31;
        boolean z2 = this.f34583d;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        return iHashCode + i5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails(processName=");
        sb2.append(this.f34580a);
        sb2.append(", pid=");
        sb2.append(this.f34581b);
        sb2.append(", importance=");
        sb2.append(this.f34582c);
        sb2.append(", isDefaultProcess=");
        return AbstractC0279p0.p(sb2, this.f34583d, ')');
    }
}
