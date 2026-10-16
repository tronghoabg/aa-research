package com.waze.uid.state_impl.add_id;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends com.waze.tide.s {

    /* renamed from: a, reason: collision with root package name */
    private final String f44586a;

    /* renamed from: b, reason: collision with root package name */
    private final String f44587b;

    public k(String str, String str2) {
        super((byte[]) null);
        this.f44586a = str;
        this.f44587b = str2;
    }

    public final String a() {
        return this.f44586a;
    }

    public final String b() {
        return this.f44587b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.g.b.x.n(this.f44586a, kVar.f44586a) && h.g.b.x.n(this.f44587b, kVar.f44587b);
    }

    public final int hashCode() {
        String str = this.f44586a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f44587b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AddHomeAndWorkFragmentUiState(homeAddress=" + this.f44586a + ", workAddress=" + this.f44587b + ")";
    }
}
