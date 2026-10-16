package re;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: re.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3980d {

    /* renamed from: a, reason: collision with root package name */
    public final String f44808a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44809b = "0.0.8";

    public C3980d(String str) {
        this.f44808a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3980d)) {
            return false;
        }
        C3980d c3980d = (C3980d) obj;
        return AbstractC3340k.a(this.f44808a, c3980d.f44808a) && AbstractC3340k.a(this.f44809b, c3980d.f44809b);
    }

    public final int hashCode() {
        return this.f44809b.hashCode() + (this.f44808a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PrimaryConfig(projectKey=");
        sb2.append(this.f44808a);
        sb2.append(", sdkVersion=");
        return wg.b.c(sb2, this.f44809b, ")");
    }
}
