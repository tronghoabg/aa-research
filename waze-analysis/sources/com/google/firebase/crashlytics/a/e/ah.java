package com.google.firebase.crashlytics.a.e;

import com.waze.strings.DisplayStrings;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ah extends ct {

    /* renamed from: a, reason: collision with root package name */
    private final String f9320a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9321b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9322c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9323d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f9324e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9325f;

    /* renamed from: g, reason: collision with root package name */
    private final bl f9326g;

    /* renamed from: h, reason: collision with root package name */
    private final cs f9327h;

    /* renamed from: i, reason: collision with root package name */
    private final cq f9328i;

    /* renamed from: j, reason: collision with root package name */
    private final bo f9329j;

    /* renamed from: k, reason: collision with root package name */
    private final List f9330k;

    /* renamed from: l, reason: collision with root package name */
    private final int f9331l;

    /* synthetic */ ah(String str, String str2, String str3, long j2, Long l2, boolean z, bl blVar, cs csVar, cq cqVar, bo boVar, List list, int i2) {
        this.f9320a = str;
        this.f9321b = str2;
        this.f9322c = str3;
        this.f9323d = j2;
        this.f9324e = l2;
        this.f9325f = z;
        this.f9326g = blVar;
        this.f9327h = csVar;
        this.f9328i = cqVar;
        this.f9329j = boVar;
        this.f9330k = list;
        this.f9331l = i2;
    }

    @Override // com.google.firebase.crashlytics.a.e.ct
    public final int a() {
        return this.f9331l;
    }

    @Override // com.google.firebase.crashlytics.a.e.ct
    public final long b() {
        return this.f9323d;
    }

    @Override // com.google.firebase.crashlytics.a.e.ct
    public final bl c() {
        return this.f9326g;
    }

    @Override // com.google.firebase.crashlytics.a.e.ct
    public final bo d() {
        return this.f9329j;
    }

    @Override // com.google.firebase.crashlytics.a.e.ct
    public final cq e() {
        return this.f9328i;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l2;
        cs csVar;
        cq cqVar;
        bo boVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ct) {
            ct ctVar = (ct) obj;
            if (this.f9320a.equals(ctVar.i()) && this.f9321b.equals(ctVar.j()) && ((str = this.f9322c) != null ? str.equals(ctVar.h()) : ctVar.h() == null) && this.f9323d == ctVar.b() && ((l2 = this.f9324e) != null ? l2.equals(ctVar.g()) : ctVar.g() == null) && this.f9325f == ctVar.l() && this.f9326g.equals(ctVar.c()) && ((csVar = this.f9327h) != null ? csVar.equals(ctVar.f()) : ctVar.f() == null) && ((cqVar = this.f9328i) != null ? cqVar.equals(ctVar.e()) : ctVar.e() == null) && ((boVar = this.f9329j) != null ? boVar.equals(ctVar.d()) : ctVar.d() == null) && ((list = this.f9330k) != null ? list.equals(ctVar.k()) : ctVar.k() == null) && this.f9331l == ctVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.a.e.ct
    public final cs f() {
        return this.f9327h;
    }

    @Override // com.google.firebase.crashlytics.a.e.ct
    public final Long g() {
        return this.f9324e;
    }

    @Override // com.google.firebase.crashlytics.a.e.ct
    public final String h() {
        return this.f9322c;
    }

    public final int hashCode() {
        int iHashCode = ((this.f9320a.hashCode() ^ 1000003) * 1000003) ^ this.f9321b.hashCode();
        String str = this.f9322c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f9323d;
        int i2 = ((((iHashCode * 1000003) ^ iHashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l2 = this.f9324e;
        int iHashCode3 = (((((i2 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (true != this.f9325f ? DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER : DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS)) * 1000003) ^ this.f9326g.hashCode()) * 1000003;
        cs csVar = this.f9327h;
        int iHashCode4 = (iHashCode3 ^ (csVar == null ? 0 : csVar.hashCode())) * 1000003;
        cq cqVar = this.f9328i;
        int iHashCode5 = (iHashCode4 ^ (cqVar == null ? 0 : cqVar.hashCode())) * 1000003;
        bo boVar = this.f9329j;
        int iHashCode6 = (iHashCode5 ^ (boVar == null ? 0 : boVar.hashCode())) * 1000003;
        List list = this.f9330k;
        return this.f9331l ^ ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    @Override // com.google.firebase.crashlytics.a.e.ct
    public final String i() {
        return this.f9320a;
    }

    @Override // com.google.firebase.crashlytics.a.e.ct
    public final String j() {
        return this.f9321b;
    }

    @Override // com.google.firebase.crashlytics.a.e.ct
    public final List k() {
        return this.f9330k;
    }

    @Override // com.google.firebase.crashlytics.a.e.ct
    public final boolean l() {
        return this.f9325f;
    }

    public final String toString() {
        List list = this.f9330k;
        bo boVar = this.f9329j;
        cq cqVar = this.f9328i;
        cs csVar = this.f9327h;
        return "Session{generator=" + this.f9320a + ", identifier=" + this.f9321b + ", appQualitySessionId=" + this.f9322c + ", startedAt=" + this.f9323d + ", endedAt=" + this.f9324e + ", crashed=" + this.f9325f + ", app=" + this.f9326g.toString() + ", user=" + String.valueOf(csVar) + ", os=" + String.valueOf(cqVar) + ", device=" + String.valueOf(boVar) + ", events=" + String.valueOf(list) + ", generatorType=" + this.f9331l + "}";
    }
}
