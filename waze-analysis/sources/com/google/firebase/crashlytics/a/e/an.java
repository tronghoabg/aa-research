package com.google.firebase.crashlytics.a.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class an extends cb {

    /* renamed from: a, reason: collision with root package name */
    private final List f9360a;

    /* renamed from: b, reason: collision with root package name */
    private final bu f9361b;

    /* renamed from: c, reason: collision with root package name */
    private final be f9362c;

    /* renamed from: d, reason: collision with root package name */
    private final bw f9363d;

    /* renamed from: e, reason: collision with root package name */
    private final List f9364e;

    /* synthetic */ an(List list, bu buVar, be beVar, bw bwVar, List list2) {
        this.f9360a = list;
        this.f9361b = buVar;
        this.f9362c = beVar;
        this.f9363d = bwVar;
        this.f9364e = list2;
    }

    @Override // com.google.firebase.crashlytics.a.e.cb
    public final be a() {
        return this.f9362c;
    }

    @Override // com.google.firebase.crashlytics.a.e.cb
    public final bu b() {
        return this.f9361b;
    }

    @Override // com.google.firebase.crashlytics.a.e.cb
    public final bw c() {
        return this.f9363d;
    }

    @Override // com.google.firebase.crashlytics.a.e.cb
    public final List d() {
        return this.f9364e;
    }

    @Override // com.google.firebase.crashlytics.a.e.cb
    public final List e() {
        return this.f9360a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cb) {
            cb cbVar = (cb) obj;
            List list = this.f9360a;
            if (list != null ? list.equals(cbVar.e()) : cbVar.e() == null) {
                bu buVar = this.f9361b;
                if (buVar != null ? buVar.equals(cbVar.b()) : cbVar.b() == null) {
                    be beVar = this.f9362c;
                    if (beVar != null ? beVar.equals(cbVar.a()) : cbVar.a() == null) {
                        if (this.f9363d.equals(cbVar.c()) && this.f9364e.equals(cbVar.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f9360a;
        int iHashCode = list == null ? 0 : list.hashCode();
        bu buVar = this.f9361b;
        int iHashCode2 = buVar == null ? 0 : buVar.hashCode();
        int i2 = iHashCode ^ 1000003;
        be beVar = this.f9362c;
        return this.f9364e.hashCode() ^ (((((((i2 * 1000003) ^ iHashCode2) * 1000003) ^ (beVar != null ? beVar.hashCode() : 0)) * 1000003) ^ this.f9363d.hashCode()) * 1000003);
    }

    public final String toString() {
        List list = this.f9364e;
        bw bwVar = this.f9363d;
        be beVar = this.f9362c;
        bu buVar = this.f9361b;
        return "Execution{threads=" + String.valueOf(this.f9360a) + ", exception=" + String.valueOf(buVar) + ", appExitInfo=" + String.valueOf(beVar) + ", signal=" + bwVar.toString() + ", binaries=" + list.toString() + "}";
    }
}
