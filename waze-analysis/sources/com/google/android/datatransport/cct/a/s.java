package com.google.android.datatransport.cct.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class s extends ad {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f4055a;

    @Override // com.google.android.datatransport.cct.a.ad
    public final Integer a() {
        return this.f4055a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        Integer num = this.f4055a;
        return num == null ? adVar.a() == null : num.equals(adVar.a());
    }

    public final int hashCode() {
        Integer num = this.f4055a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f4055a + "}";
    }
}
