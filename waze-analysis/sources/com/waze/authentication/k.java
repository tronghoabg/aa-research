package com.waze.authentication;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k extends ax {

    /* renamed from: a, reason: collision with root package name */
    private final String f15764a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15765b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, String str2) {
        super(null);
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_USERNAME);
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
        this.f15764a = str;
        this.f15765b = str2;
    }

    public final String a() {
        return this.f15765b;
    }

    public final String b() {
        return this.f15764a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.g.b.x.n(this.f15764a, kVar.f15764a) && h.g.b.x.n(this.f15765b, kVar.f15765b);
    }

    public final int hashCode() {
        return (this.f15764a.hashCode() * 31) + this.f15765b.hashCode();
    }

    public final String toString() {
        return "UsernamePassword(username=" + this.f15764a + ", password=" + this.f15765b + ")";
    }
}
