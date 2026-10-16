package com.waze.ui.f;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am extends an {

    /* renamed from: a, reason: collision with root package name */
    private final String f42285a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.h f42286b;

    /* renamed from: c, reason: collision with root package name */
    private final int f42287c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(String str, com.airbnb.lottie.h hVar, int i2) {
        super(null);
        h.g.b.x.f(str, "label");
        this.f42285a = str;
        this.f42286b = hVar;
        this.f42287c = i2;
    }

    public static /* synthetic */ am d(am amVar, String str) {
        h.g.b.x.f(str, "label");
        return new am(str, amVar.f42286b, amVar.f42287c);
    }

    public final int a() {
        return this.f42287c;
    }

    @Override // com.waze.ui.f.an
    public final String b() {
        return this.f42285a;
    }

    public final com.airbnb.lottie.h c() {
        return this.f42286b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        return h.g.b.x.n(this.f42285a, amVar.f42285a) && h.g.b.x.n(this.f42286b, amVar.f42286b) && this.f42287c == amVar.f42287c;
    }

    public final int hashCode() {
        int iHashCode = this.f42285a.hashCode() * 31;
        com.airbnb.lottie.h hVar = this.f42286b;
        return ((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.f42287c;
    }

    public final String toString() {
        return "LottieUi(label=" + this.f42285a + ", composition=" + this.f42286b + ", iterations=" + this.f42287c + ")";
    }

    public /* synthetic */ am(String str, com.airbnb.lottie.h hVar) {
        this(str, hVar, Integer.MAX_VALUE);
    }
}
