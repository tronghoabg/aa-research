package qe;

import kotlin.jvm.internal.AbstractC3340k;
import wg.b;

/* renamed from: qe.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3892a {

    /* renamed from: a, reason: collision with root package name */
    public final String f44260a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44261b;

    /* renamed from: c, reason: collision with root package name */
    public final String f44262c;

    public C3892a(String str, String str2, String str3) {
        this.f44260a = str;
        this.f44261b = str2;
        this.f44262c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3892a)) {
            return false;
        }
        C3892a c3892a = (C3892a) obj;
        return AbstractC3340k.a(this.f44260a, c3892a.f44260a) && AbstractC3340k.a(this.f44261b, c3892a.f44261b) && AbstractC3340k.a(this.f44262c, c3892a.f44262c);
    }

    public final int hashCode() {
        return this.f44262c.hashCode() + N0.a.c(this.f44260a.hashCode() * 31, 31, this.f44261b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NoCodeScreen(id=");
        sb2.append(this.f44260a);
        sb2.append(", body=");
        sb2.append(this.f44261b);
        sb2.append(", contextKey=");
        return b.c(sb2, this.f44262c, ")");
    }
}
