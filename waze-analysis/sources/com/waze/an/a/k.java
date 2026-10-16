package com.waze.an.a;

import com.waze.gas.GasNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final String f14589a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14590b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f14591c;

    /* renamed from: d, reason: collision with root package name */
    private final j f14592d;

    /* renamed from: e, reason: collision with root package name */
    private final List f14593e;

    public k(String str, String str2, Integer num, j jVar, List list) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "actions");
        this.f14589a = str;
        this.f14590b = str2;
        this.f14591c = num;
        this.f14592d = jVar;
        this.f14593e = list;
    }

    public static /* synthetic */ k f(k kVar, j jVar, List list) {
        String str = kVar.f14589a;
        String str2 = kVar.f14590b;
        Integer num = kVar.f14591c;
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(list, "actions");
        return new k(str, str2, num, jVar, list);
    }

    public final j a() {
        return this.f14592d;
    }

    public final Integer b() {
        return this.f14591c;
    }

    public final String c() {
        return this.f14590b;
    }

    public final String d() {
        return this.f14589a;
    }

    public final List e() {
        return this.f14593e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.g.b.x.n(this.f14589a, kVar.f14589a) && h.g.b.x.n(this.f14590b, kVar.f14590b) && h.g.b.x.n(this.f14591c, kVar.f14591c) && h.g.b.x.n(this.f14592d, kVar.f14592d) && h.g.b.x.n(this.f14593e, kVar.f14593e);
    }

    public final int hashCode() {
        int iHashCode = this.f14589a.hashCode() * 31;
        String str = this.f14590b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f14591c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        j jVar = this.f14592d;
        return ((iHashCode3 + (jVar != null ? jVar.hashCode() : 0)) * 31) + this.f14593e.hashCode();
    }

    public final String toString() {
        return "State(title=" + this.f14589a + ", description=" + this.f14590b + ", iconResId=" + this.f14591c + ", timeout=" + this.f14592d + ", actions=" + this.f14593e + ")";
    }
}
