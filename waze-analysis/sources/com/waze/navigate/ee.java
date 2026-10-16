package com.waze.navigate;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ee {

    /* renamed from: a, reason: collision with root package name */
    private final String f31306a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31307b;

    /* renamed from: c, reason: collision with root package name */
    private final List f31308c;

    /* renamed from: d, reason: collision with root package name */
    private final List f31309d;

    public ee(String str, String str2, List list, List list2) {
        h.g.b.x.f(str, "primaryMarkup");
        h.g.b.x.f(str2, "secondaryMarkup");
        h.g.b.x.f(list, "roadShields");
        h.g.b.x.f(list2, "exitSigns");
        this.f31306a = str;
        this.f31307b = str2;
        this.f31308c = list;
        this.f31309d = list2;
    }

    public final String a() {
        return this.f31306a;
    }

    public final String b() {
        return this.f31307b;
    }

    public final List c() {
        return this.f31309d;
    }

    public final List d() {
        return this.f31308c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee)) {
            return false;
        }
        ee eeVar = (ee) obj;
        return h.g.b.x.n(this.f31306a, eeVar.f31306a) && h.g.b.x.n(this.f31307b, eeVar.f31307b) && h.g.b.x.n(this.f31308c, eeVar.f31308c) && h.g.b.x.n(this.f31309d, eeVar.f31309d);
    }

    public final int hashCode() {
        return (((((this.f31306a.hashCode() * 31) + this.f31307b.hashCode()) * 31) + this.f31308c.hashCode()) * 31) + this.f31309d.hashCode();
    }

    public final String toString() {
        return "NavigationRoadSign(primaryMarkup=" + this.f31306a + ", secondaryMarkup=" + this.f31307b + ", roadShields=" + this.f31308c + ", exitSigns=" + this.f31309d + ")";
    }
}
