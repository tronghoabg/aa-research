package com.waze.bw.c.d.a;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am implements bw {

    /* renamed from: a, reason: collision with root package name */
    private final String f17887a;

    public am(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f17887a = str;
    }

    public final String a() {
        return this.f17887a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am) && h.g.b.x.n(this.f17887a, ((am) obj).f17887a);
    }

    public final int hashCode() {
        return this.f17887a.hashCode();
    }

    public final String toString() {
        return "RecentNonFavoriteSaveClicked(name=" + this.f17887a + ")";
    }
}
