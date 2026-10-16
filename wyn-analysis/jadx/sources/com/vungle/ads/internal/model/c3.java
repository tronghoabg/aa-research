package com.vungle.ads.internal.model;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f33148a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33149b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33150c;

    public c3(String description, boolean z2, boolean z10) {
        AbstractC3340k.e(description, "description");
        this.f33148a = description;
        this.f33149b = z2;
        this.f33150c = z10;
    }

    public final boolean a() {
        return this.f33149b;
    }

    public final boolean b() {
        return this.f33150c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return AbstractC3340k.a(this.f33148a, c3Var.f33148a) && this.f33149b == c3Var.f33149b && this.f33150c == c3Var.f33150c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.f33148a.hashCode() * 31;
        boolean z2 = this.f33149b;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i10 = (iHashCode + i5) * 31;
        boolean z10 = this.f33150c;
        return i10 + (z10 ? 1 : z10 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("ErrorInfo(description=");
        sbA.append(this.f33148a);
        sbA.append(", errorIsTerminal=");
        sbA.append(this.f33149b);
        sbA.append(", isRetryCode=");
        return AbstractC0279p0.p(sbA, this.f33150c, ')');
    }

    public /* synthetic */ c3(String str, boolean z2, boolean z10, int i5) {
        this(str, (i5 & 2) != 0 ? false : z2, (i5 & 4) != 0 ? false : z10);
    }
}
