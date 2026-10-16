package com.google.firebase.h;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f9905a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9906b;

    d(String str, String str2) {
        this.f9905a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f9906b = str2;
    }

    public final String a() {
        return this.f9905a;
    }

    public final String b() {
        return this.f9906b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f9905a.equals(dVar.f9905a) && this.f9906b.equals(dVar.f9906b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9905a.hashCode() ^ 1000003;
        return this.f9906b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "LibraryVersion{libraryName=" + this.f9905a + ", version=" + this.f9906b + "}";
    }

    d() {
        throw null;
    }
}
