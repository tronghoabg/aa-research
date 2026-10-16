package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ea extends ec {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28237a;

    /* renamed from: b, reason: collision with root package name */
    private final bs f28238b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea(boolean z, bs bsVar, int i2) {
        super(null);
        bsVar = (i2 & 2) != 0 ? bs.f28105a : bsVar;
        boolean z2 = 1 == ((z ? 1 : 0) | (i2 & 1));
        h.g.b.x.f(bsVar, "paddingDp");
        this.f28237a = z2;
        this.f28238b = bsVar;
    }

    public final boolean a() {
        return this.f28237a;
    }

    @Override // com.waze.map.b.ec
    public final bs b() {
        return this.f28238b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj;
        return this.f28237a == eaVar.f28237a && h.g.b.x.n(this.f28238b, eaVar.f28238b);
    }

    public final int hashCode() {
        return (a.a.a(this.f28237a) * 31) + this.f28238b.hashCode();
    }

    public final String toString() {
        return "Automatic(continuous=" + this.f28237a + ", paddingDp=" + this.f28238b + ")";
    }

    public ea() {
        this(false, null, 3);
    }
}
