package com.waze.ui.af;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements v {

    /* renamed from: a, reason: collision with root package name */
    private final String f41909a;

    /* renamed from: b, reason: collision with root package name */
    private final List f41910b;

    /* renamed from: c, reason: collision with root package name */
    private final String f41911c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f41912d;

    public u(String str, List list, String str2, boolean z) {
        h.g.b.x.f(list, "filteredVoices");
        h.g.b.x.f(str2, "searchText");
        this.f41909a = str;
        this.f41910b = list;
        this.f41911c = str2;
        this.f41912d = z;
    }

    public static /* synthetic */ u d(u uVar, List list, boolean z, int i2) {
        String str = (i2 & 1) != 0 ? uVar.f41909a : null;
        if ((i2 & 2) != 0) {
            list = uVar.f41910b;
        }
        String str2 = (i2 & 4) != 0 ? uVar.f41911c : null;
        if ((i2 & 8) != 0) {
            z = uVar.f41912d;
        }
        h.g.b.x.f(list, "filteredVoices");
        h.g.b.x.f(str2, "searchText");
        return new u(str, list, str2, z);
    }

    @Override // com.waze.ui.af.v
    public final String a() {
        return this.f41909a;
    }

    public final String b() {
        return this.f41911c;
    }

    public final List c() {
        return this.f41910b;
    }

    @Override // com.waze.ui.af.v
    public final boolean e() {
        return this.f41912d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return h.g.b.x.n(this.f41909a, uVar.f41909a) && h.g.b.x.n(this.f41910b, uVar.f41910b) && h.g.b.x.n(this.f41911c, uVar.f41911c) && this.f41912d == uVar.f41912d;
    }

    public final int hashCode() {
        String str = this.f41909a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.f41910b.hashCode()) * 31) + this.f41911c.hashCode()) * 31) + a.a.a(this.f41912d);
    }

    public final String toString() {
        return "FilteredVoices(selectedVoiceId=" + this.f41909a + ", filteredVoices=" + this.f41910b + ", searchText=" + this.f41911c + ", typeWhileDrivingWarning=" + this.f41912d + ")";
    }

    public /* synthetic */ u(String str, List list, String str2, int i2) {
        this(1 == (i2 & 1) ? null : str, list, str2, false);
    }
}
