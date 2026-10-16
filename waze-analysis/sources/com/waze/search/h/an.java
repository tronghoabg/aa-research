package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class an {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35783a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35784b;

    public an(boolean z, boolean z2) {
        this.f35783a = z;
        this.f35784b = z2;
    }

    public final boolean a() {
        return this.f35784b;
    }

    public final boolean b() {
        return this.f35783a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        return this.f35783a == anVar.f35783a && this.f35784b == anVar.f35784b;
    }

    public final int hashCode() {
        return (a.a.a(this.f35783a) * 31) + a.a.a(this.f35784b);
    }

    public final String toString() {
        return "CTAs(contactsCTAEnabled=" + this.f35783a + ", calendarCTAEnabled=" + this.f35784b + ")";
    }
}
