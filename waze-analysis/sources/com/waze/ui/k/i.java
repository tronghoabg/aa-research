package com.waze.ui.k;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f42435a;

    /* renamed from: b, reason: collision with root package name */
    private final List f42436b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f42437c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f42438d;

    public i(String str, List list, boolean z, boolean z2) {
        x.f(str, "licensePlateSuffix");
        x.f(list, "permits");
        this.f42435a = str;
        this.f42436b = list;
        this.f42437c = z;
        this.f42438d = z2;
    }

    public static /* synthetic */ i e(i iVar, String str, List list, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            str = iVar.f42435a;
        }
        if ((i2 & 2) != 0) {
            list = iVar.f42436b;
        }
        if ((i2 & 4) != 0) {
            z = iVar.f42437c;
        }
        boolean z2 = iVar.f42438d;
        x.f(str, "licensePlateSuffix");
        x.f(list, "permits");
        return new i(str, list, z, z2);
    }

    public final String a() {
        return this.f42435a;
    }

    public final List b() {
        return this.f42436b;
    }

    public final boolean c() {
        return this.f42438d;
    }

    public final boolean d() {
        return this.f42437c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return x.n(this.f42435a, iVar.f42435a) && x.n(this.f42436b, iVar.f42436b) && this.f42437c == iVar.f42437c && this.f42438d == iVar.f42438d;
    }

    public final int hashCode() {
        return (((((this.f42435a.hashCode() * 31) + this.f42436b.hashCode()) * 31) + a.a.a(this.f42437c)) * 31) + a.a.a(this.f42438d);
    }

    public final String toString() {
        return "State(licensePlateSuffix=" + this.f42435a + ", permits=" + this.f42436b + ", isSaveEnabled=" + this.f42437c + ", showLearnMore=" + this.f42438d + ")";
    }
}
