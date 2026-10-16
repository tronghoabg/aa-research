package com.moloco.sdk.acm;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f28442a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28443b;

    public i(String str, String value) {
        AbstractC3340k.e(value, "value");
        this.f28442a = str;
        this.f28443b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC3340k.a(this.f28442a, iVar.f28442a) && AbstractC3340k.a(this.f28443b, iVar.f28443b);
    }

    public final int hashCode() {
        return this.f28443b.hashCode() + (this.f28442a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventTag(key=");
        sb2.append(this.f28442a);
        sb2.append(", value=");
        return AbstractC0279p0.n(sb2, this.f28443b, ')');
    }
}
