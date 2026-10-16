package com.waze.navigate.location_preview;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f31477a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31478b;

    public a(String str, String str2) {
        h.g.b.x.f(str, "moodResource");
        h.g.b.x.f(str2, HintConstants.AUTOFILL_HINT_NAME);
        this.f31477a = str;
        this.f31478b = str2;
    }

    public final String a() {
        return this.f31477a;
    }

    public final String b() {
        return this.f31478b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.g.b.x.n(this.f31477a, aVar.f31477a) && h.g.b.x.n(this.f31478b, aVar.f31478b);
    }

    public final int hashCode() {
        return (this.f31477a.hashCode() * 31) + this.f31478b.hashCode();
    }

    public final String toString() {
        return "AttributionModel(moodResource=" + this.f31477a + ", name=" + this.f31478b + ")";
    }
}
