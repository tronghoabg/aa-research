package com.moloco.sdk.internal.ilrd;

import A.AbstractC0213f;
import Wf.AbstractC1240b0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes4.dex */
public final class q {

    @NotNull
    public static final a$c$b Companion = new a$c$b();

    /* renamed from: a, reason: collision with root package name */
    public final String f28632a;

    /* renamed from: b, reason: collision with root package name */
    public final o f28633b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28634c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28635d;

    public q(int i5, String str, o oVar, boolean z2, long j8) {
        if (15 != (i5 & 15)) {
            AbstractC1240b0.k(i5, 15, p.f28610b);
            throw null;
        }
        this.f28632a = str;
        this.f28633b = oVar;
        this.f28634c = z2;
        this.f28635d = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return AbstractC3340k.a(this.f28632a, qVar.f28632a) && AbstractC3340k.a(this.f28633b, qVar.f28633b) && this.f28634c == qVar.f28634c && this.f28635d == qVar.f28635d;
    }

    public final int hashCode() {
        int iHashCode = (this.f28633b.hashCode() + (this.f28632a.hashCode() * 31)) * 31;
        int i5 = this.f28634c ? 1231 : 1237;
        long j8 = this.f28635d;
        return ((iHashCode + i5) * 31) + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionData(sessionId=");
        sb2.append(this.f28632a);
        sb2.append(", impressionCounts=");
        sb2.append(this.f28633b);
        sb2.append(", isExpired=");
        sb2.append(this.f28634c);
        sb2.append(", sessionStartTs=");
        return AbstractC0213f.e(sb2, this.f28635d, ')');
    }

    public q(String sessionId, o oVar, boolean z2, long j8) {
        AbstractC3340k.e(sessionId, "sessionId");
        this.f28632a = sessionId;
        this.f28633b = oVar;
        this.f28634c = z2;
        this.f28635d = j8;
    }
}
