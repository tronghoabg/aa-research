package com.google.firebase.crashlytics.a.e;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class at extends cd {

    /* renamed from: a, reason: collision with root package name */
    private final String f9385a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9386b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9387c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9388d;

    /* synthetic */ at(String str, int i2, int i3, boolean z) {
        this.f9385a = str;
        this.f9386b = i2;
        this.f9387c = i3;
        this.f9388d = z;
    }

    @Override // com.google.firebase.crashlytics.a.e.cd
    public final int a() {
        return this.f9387c;
    }

    @Override // com.google.firebase.crashlytics.a.e.cd
    public final int b() {
        return this.f9386b;
    }

    @Override // com.google.firebase.crashlytics.a.e.cd
    public final String c() {
        return this.f9385a;
    }

    @Override // com.google.firebase.crashlytics.a.e.cd
    public final boolean d() {
        return this.f9388d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cd) {
            cd cdVar = (cd) obj;
            if (this.f9385a.equals(cdVar.c()) && this.f9386b == cdVar.b() && this.f9387c == cdVar.a() && this.f9388d == cdVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9387c ^ ((((this.f9385a.hashCode() ^ 1000003) * 1000003) ^ this.f9386b) * 1000003)) * 1000003) ^ (true != this.f9388d ? DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER : DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f9385a + ", pid=" + this.f9386b + ", importance=" + this.f9387c + ", defaultProcess=" + this.f9388d + "}";
    }
}
