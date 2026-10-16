package com.waze.ui.d;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f42133a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42134b;

    /* renamed from: c, reason: collision with root package name */
    private final e f42135c;

    /* renamed from: d, reason: collision with root package name */
    private final int f42136d;

    public b(int i2, String str, e eVar, int i3) {
        x.f(str, "token");
        x.f(eVar, "uiData");
        this.f42133a = i2;
        this.f42134b = str;
        this.f42135c = eVar;
        this.f42136d = i3;
    }

    public static /* synthetic */ b d(b bVar) {
        int i2 = bVar.f42133a;
        String str = bVar.f42134b;
        e eVar = bVar.f42135c;
        int i3 = bVar.f42136d;
        x.f(str, "token");
        x.f(eVar, "uiData");
        return new b(i2, str, eVar, i3);
    }

    public final int a() {
        return this.f42136d;
    }

    public final e b() {
        return this.f42135c;
    }

    public final String c() {
        return this.f42134b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f42133a == bVar.f42133a && x.n(this.f42134b, bVar.f42134b) && x.n(this.f42135c, bVar.f42135c) && this.f42136d == bVar.f42136d;
    }

    public final int hashCode() {
        return (((((this.f42133a * 31) + this.f42134b.hashCode()) * 31) + this.f42135c.hashCode()) * 31) + this.f42136d;
    }

    public final String toString() {
        return "EnrichAlertAnswerUI(index=" + this.f42133a + ", token=" + this.f42134b + ", uiData=" + this.f42135c + ", pointsAwards=" + this.f42136d + ")";
    }
}
