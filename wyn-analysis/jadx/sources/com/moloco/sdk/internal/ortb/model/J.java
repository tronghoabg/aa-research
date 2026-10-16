package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.C1900n;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes4.dex */
public final class J {

    @NotNull
    public static final C1900n.b Companion = new C1900n.b();

    /* renamed from: a, reason: collision with root package name */
    public final String f28720a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f28721b;

    public /* synthetic */ J(String str, int i5, Integer num) {
        if ((i5 & 1) == 0) {
            this.f28720a = null;
        } else {
            this.f28720a = str;
        }
        if ((i5 & 2) == 0) {
            this.f28721b = null;
        } else {
            this.f28721b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j8 = (J) obj;
        return AbstractC3340k.a(this.f28720a, j8.f28720a) && AbstractC3340k.a(this.f28721b, j8.f28721b);
    }

    public final int hashCode() {
        String str = this.f28720a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f28721b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "DECAppNameSerializable(text=" + this.f28720a + ", fontSize=" + this.f28721b + ')';
    }
}
