package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y extends ab {

    /* renamed from: a, reason: collision with root package name */
    private final String f35969a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35970b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35971c;

    public y(String str, String str2, String str3) {
        super(null);
        this.f35969a = str;
        this.f35970b = str2;
        this.f35971c = str3;
    }

    public final String a() {
        return this.f35971c;
    }

    public final String b() {
        return this.f35970b;
    }

    public final String c() {
        return this.f35969a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return h.g.b.x.n(this.f35969a, yVar.f35969a) && h.g.b.x.n(this.f35970b, yVar.f35970b) && h.g.b.x.n(this.f35971c, yVar.f35971c);
    }

    public final int hashCode() {
        String str = this.f35969a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f35970b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode * 31;
        String str3 = this.f35971c;
        return ((i2 + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "OpenSearch(searchTerm=" + this.f35969a + ", categoryId=" + this.f35970b + ", categoryGroupId=" + this.f35971c + ")";
    }

    public /* synthetic */ y(String str) {
        this(str, null, null);
    }
}
