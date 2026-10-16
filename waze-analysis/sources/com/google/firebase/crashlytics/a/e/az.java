package com.google.firebase.crashlytics.a.e;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class az extends cq {

    /* renamed from: a, reason: collision with root package name */
    private final int f9403a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9404b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9405c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9406d;

    /* synthetic */ az(int i2, String str, String str2, boolean z) {
        this.f9403a = i2;
        this.f9404b = str;
        this.f9405c = str2;
        this.f9406d = z;
    }

    @Override // com.google.firebase.crashlytics.a.e.cq
    public final int a() {
        return this.f9403a;
    }

    @Override // com.google.firebase.crashlytics.a.e.cq
    public final String b() {
        return this.f9405c;
    }

    @Override // com.google.firebase.crashlytics.a.e.cq
    public final String c() {
        return this.f9404b;
    }

    @Override // com.google.firebase.crashlytics.a.e.cq
    public final boolean d() {
        return this.f9406d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cq) {
            cq cqVar = (cq) obj;
            if (this.f9403a == cqVar.a() && this.f9404b.equals(cqVar.c()) && this.f9405c.equals(cqVar.b()) && this.f9406d == cqVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f9406d ? DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER : DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS) ^ ((((((this.f9403a ^ 1000003) * 1000003) ^ this.f9404b.hashCode()) * 1000003) ^ this.f9405c.hashCode()) * 1000003);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f9403a + ", version=" + this.f9404b + ", buildVersion=" + this.f9405c + ", jailbroken=" + this.f9406d + "}";
    }
}
