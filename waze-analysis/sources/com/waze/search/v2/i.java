package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f36598a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36599b;

    public i(String str, String str2) {
        this.f36598a = str;
        this.f36599b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.g.b.x.n(this.f36598a, iVar.f36598a) && h.g.b.x.n(this.f36599b, iVar.f36599b);
    }

    public final int hashCode() {
        String str = this.f36598a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f36599b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SearchCategory(categoryId=" + this.f36598a + ", categoryGroupId=" + this.f36599b + ")";
    }
}
