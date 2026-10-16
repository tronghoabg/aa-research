package com.moloco.sdk.internal.ortb.model;

import A7.AbstractC0279p0;
import Wf.AbstractC1240b0;
import com.moloco.sdk.internal.ortb.model.C1905t;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes4.dex */
public final class W {

    @NotNull
    public static final C1905t.b Companion = new C1905t.b();

    /* renamed from: a, reason: collision with root package name */
    public final String f28751a;

    public W(int i5, String str) {
        if (1 == (i5 & 1)) {
            this.f28751a = str;
        } else {
            AbstractC1240b0.k(i5, 1, V.f28750b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W) && AbstractC3340k.a(this.f28751a, ((W) obj).f28751a);
    }

    public final int hashCode() {
        return this.f28751a.hashCode();
    }

    public final String toString() {
        return AbstractC0279p0.n(new StringBuilder("GradientColor(color="), this.f28751a, ')');
    }
}
