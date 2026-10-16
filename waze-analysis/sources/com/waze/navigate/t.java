package com.waze.navigate;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final String f31815a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31816b;

    public t(String str, String str2) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str2, "price");
        this.f31815a = str;
        this.f31816b = str2;
    }

    public final String a() {
        return this.f31815a;
    }

    public final String b() {
        return this.f31816b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return h.g.b.x.n(this.f31815a, tVar.f31815a) && h.g.b.x.n(this.f31816b, tVar.f31816b);
    }

    public final int hashCode() {
        return (this.f31815a.hashCode() * 31) + this.f31816b.hashCode();
    }

    public final String toString() {
        return "ProductPrice(name=" + this.f31815a + ", price=" + this.f31816b + ")";
    }
}
