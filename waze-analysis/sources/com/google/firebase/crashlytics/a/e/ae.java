package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ae extends bg {

    /* renamed from: a, reason: collision with root package name */
    private final String f9314a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9315b;

    /* synthetic */ ae(String str, String str2) {
        this.f9314a = str;
        this.f9315b = str2;
    }

    @Override // com.google.firebase.crashlytics.a.e.bg
    public final String a() {
        return this.f9314a;
    }

    @Override // com.google.firebase.crashlytics.a.e.bg
    public final String b() {
        return this.f9315b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bg) {
            bg bgVar = (bg) obj;
            if (this.f9314a.equals(bgVar.a()) && this.f9315b.equals(bgVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9314a.hashCode() ^ 1000003;
        return this.f9315b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "CustomAttribute{key=" + this.f9314a + ", value=" + this.f9315b + "}";
    }
}
