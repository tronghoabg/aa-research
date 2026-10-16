package com.google.firebase.crashlytics.a.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ap extends bu {

    /* renamed from: a, reason: collision with root package name */
    private final String f9369a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9370b;

    /* renamed from: c, reason: collision with root package name */
    private final List f9371c;

    /* renamed from: d, reason: collision with root package name */
    private final bu f9372d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9373e;

    /* synthetic */ ap(String str, String str2, List list, bu buVar, int i2) {
        this.f9369a = str;
        this.f9370b = str2;
        this.f9371c = list;
        this.f9372d = buVar;
        this.f9373e = i2;
    }

    @Override // com.google.firebase.crashlytics.a.e.bu
    public final int a() {
        return this.f9373e;
    }

    @Override // com.google.firebase.crashlytics.a.e.bu
    public final bu b() {
        return this.f9372d;
    }

    @Override // com.google.firebase.crashlytics.a.e.bu
    public final String c() {
        return this.f9370b;
    }

    @Override // com.google.firebase.crashlytics.a.e.bu
    public final String d() {
        return this.f9369a;
    }

    @Override // com.google.firebase.crashlytics.a.e.bu
    public final List e() {
        return this.f9371c;
    }

    public final boolean equals(Object obj) {
        String str;
        bu buVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bu) {
            bu buVar2 = (bu) obj;
            if (this.f9369a.equals(buVar2.d()) && ((str = this.f9370b) != null ? str.equals(buVar2.c()) : buVar2.c() == null) && this.f9371c.equals(buVar2.e()) && ((buVar = this.f9372d) != null ? buVar.equals(buVar2.b()) : buVar2.b() == null) && this.f9373e == buVar2.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9369a.hashCode() ^ 1000003;
        String str = this.f9370b;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f9371c.hashCode()) * 1000003;
        bu buVar = this.f9372d;
        return this.f9373e ^ ((iHashCode2 ^ (buVar != null ? buVar.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        bu buVar = this.f9372d;
        return "Exception{type=" + this.f9369a + ", reason=" + this.f9370b + ", frames=" + this.f9371c.toString() + ", causedBy=" + String.valueOf(buVar) + ", overflowCount=" + this.f9373e + "}";
    }
}
