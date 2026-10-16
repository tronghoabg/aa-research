package com.google.firebase.crashlytics.a.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ar extends ca {

    /* renamed from: a, reason: collision with root package name */
    private final String f9377a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9378b;

    /* renamed from: c, reason: collision with root package name */
    private final List f9379c;

    /* synthetic */ ar(String str, int i2, List list) {
        this.f9377a = str;
        this.f9378b = i2;
        this.f9379c = list;
    }

    @Override // com.google.firebase.crashlytics.a.e.ca
    public final int a() {
        return this.f9378b;
    }

    @Override // com.google.firebase.crashlytics.a.e.ca
    public final String b() {
        return this.f9377a;
    }

    @Override // com.google.firebase.crashlytics.a.e.ca
    public final List c() {
        return this.f9379c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ca) {
            ca caVar = (ca) obj;
            if (this.f9377a.equals(caVar.b()) && this.f9378b == caVar.a() && this.f9379c.equals(caVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9377a.hashCode() ^ 1000003;
        List list = this.f9379c;
        return ((this.f9378b ^ (iHashCode * 1000003)) * 1000003) ^ list.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f9377a + ", importance=" + this.f9378b + ", frames=" + this.f9379c.toString() + "}";
    }
}
