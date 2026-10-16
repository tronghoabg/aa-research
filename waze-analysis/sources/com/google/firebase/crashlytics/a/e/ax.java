package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ax extends cl {

    /* renamed from: a, reason: collision with root package name */
    private final String f9400a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9401b;

    /* synthetic */ ax(String str, String str2) {
        this.f9400a = str;
        this.f9401b = str2;
    }

    @Override // com.google.firebase.crashlytics.a.e.cl
    public final String a() {
        return this.f9400a;
    }

    @Override // com.google.firebase.crashlytics.a.e.cl
    public final String b() {
        return this.f9401b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cl) {
            cl clVar = (cl) obj;
            if (this.f9400a.equals(clVar.a()) && this.f9401b.equals(clVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9400a.hashCode() ^ 1000003;
        return this.f9401b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "RolloutVariant{rolloutId=" + this.f9400a + ", variantId=" + this.f9401b + "}";
    }
}
