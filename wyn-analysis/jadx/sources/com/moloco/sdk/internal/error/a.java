package com.moloco.sdk.internal.error;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f28509a;

    public a(String str) {
        this.f28509a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && AbstractC3340k.a(this.f28509a, ((a) obj).f28509a);
    }

    public final int hashCode() {
        String str = this.f28509a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0279p0.n(new StringBuilder("ErrorMetadata(mtid="), this.f28509a, ')');
    }
}
