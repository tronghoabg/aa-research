package com.google.firebase.crashlytics.a.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class am extends ce {

    /* renamed from: a, reason: collision with root package name */
    private final cb f9353a;

    /* renamed from: b, reason: collision with root package name */
    private final List f9354b;

    /* renamed from: c, reason: collision with root package name */
    private final List f9355c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f9356d;

    /* renamed from: e, reason: collision with root package name */
    private final cd f9357e;

    /* renamed from: f, reason: collision with root package name */
    private final List f9358f;

    /* renamed from: g, reason: collision with root package name */
    private final int f9359g;

    /* synthetic */ am(cb cbVar, List list, List list2, Boolean bool, cd cdVar, List list3, int i2) {
        this.f9353a = cbVar;
        this.f9354b = list;
        this.f9355c = list2;
        this.f9356d = bool;
        this.f9357e = cdVar;
        this.f9358f = list3;
        this.f9359g = i2;
    }

    @Override // com.google.firebase.crashlytics.a.e.ce
    public final int a() {
        return this.f9359g;
    }

    @Override // com.google.firebase.crashlytics.a.e.ce
    public final bp b() {
        return new bp(this);
    }

    @Override // com.google.firebase.crashlytics.a.e.ce
    public final cb c() {
        return this.f9353a;
    }

    @Override // com.google.firebase.crashlytics.a.e.ce
    public final cd d() {
        return this.f9357e;
    }

    @Override // com.google.firebase.crashlytics.a.e.ce
    public final Boolean e() {
        return this.f9356d;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        cd cdVar;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ce) {
            ce ceVar = (ce) obj;
            if (this.f9353a.equals(ceVar.c()) && ((list = this.f9354b) != null ? list.equals(ceVar.g()) : ceVar.g() == null) && ((list2 = this.f9355c) != null ? list2.equals(ceVar.h()) : ceVar.h() == null) && ((bool = this.f9356d) != null ? bool.equals(ceVar.e()) : ceVar.e() == null) && ((cdVar = this.f9357e) != null ? cdVar.equals(ceVar.d()) : ceVar.d() == null) && ((list3 = this.f9358f) != null ? list3.equals(ceVar.f()) : ceVar.f() == null) && this.f9359g == ceVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.a.e.ce
    public final List f() {
        return this.f9358f;
    }

    @Override // com.google.firebase.crashlytics.a.e.ce
    public final List g() {
        return this.f9354b;
    }

    @Override // com.google.firebase.crashlytics.a.e.ce
    public final List h() {
        return this.f9355c;
    }

    public final int hashCode() {
        int iHashCode = this.f9353a.hashCode() ^ 1000003;
        List list = this.f9354b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f9355c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f9356d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        cd cdVar = this.f9357e;
        int iHashCode5 = (iHashCode4 ^ (cdVar == null ? 0 : cdVar.hashCode())) * 1000003;
        List list3 = this.f9358f;
        return this.f9359g ^ ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        List list = this.f9358f;
        cd cdVar = this.f9357e;
        List list2 = this.f9355c;
        List list3 = this.f9354b;
        return "Application{execution=" + this.f9353a.toString() + ", customAttributes=" + String.valueOf(list3) + ", internalKeys=" + String.valueOf(list2) + ", background=" + this.f9356d + ", currentProcessDetails=" + String.valueOf(cdVar) + ", appProcessDetails=" + String.valueOf(list) + ", uiOrientation=" + this.f9359g + "}";
    }
}
