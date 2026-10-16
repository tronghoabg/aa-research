package com.waze.bf.a;

import com.waze.b.u;
import com.waze.kt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16290a;

    /* renamed from: b, reason: collision with root package name */
    private final u f16291b;

    /* renamed from: c, reason: collision with root package name */
    private final kt f16292c;

    public a(u uVar) {
        x.f(uVar, "ageRestrictionRepository");
        this.f16290a = false;
        this.f16291b = uVar;
        this.f16292c = null;
    }

    public final u a() {
        return this.f16291b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        boolean z = aVar.f16290a;
        if (!x.n(this.f16291b, aVar.f16291b)) {
            return false;
        }
        kt ktVar = aVar.f16292c;
        return x.n(null, null);
    }

    public final int hashCode() {
        return (this.f16291b.hashCode() + 38347) * 31;
    }

    public final String toString() {
        return "PrivacyConsentRequest(fromSignUp=false, ageRestrictionRepository=" + this.f16291b + ", onDone=null)";
    }
}
