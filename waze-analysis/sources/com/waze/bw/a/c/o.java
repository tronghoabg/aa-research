package com.waze.bw.a.c;

import androidx.autofill.HintConstants;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final String f17661a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17662b;

    public o(String str, String str2) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f17661a = str;
        this.f17662b = str2;
    }

    public final String a() {
        return this.f17661a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return x.n(this.f17661a, oVar.f17661a) && x.n(this.f17662b, oVar.f17662b);
    }

    public final int hashCode() {
        int iHashCode = this.f17661a.hashCode() * 31;
        String str = this.f17662b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "StartStateCarUIVenueData(name=" + this.f17661a + ", image=" + this.f17662b + ")";
    }
}
