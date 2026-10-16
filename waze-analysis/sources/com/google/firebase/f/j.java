package com.google.firebase.f;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f9898a;

    /* renamed from: b, reason: collision with root package name */
    private final List f9899b;

    j(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f9898a = str;
        this.f9899b = list;
    }

    public final String a() {
        return this.f9898a;
    }

    public final List b() {
        return this.f9899b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f9898a.equals(jVar.f9898a) && this.f9899b.equals(jVar.f9899b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9898a.hashCode() ^ 1000003;
        return this.f9899b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f9898a + ", usedDates=" + this.f9899b.toString() + "}";
    }

    public j() {
        throw null;
    }
}
