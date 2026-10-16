package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class eb extends ec {

    /* renamed from: a, reason: collision with root package name */
    private final bs f28239a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eb(byte[] bArr) {
        super(null);
        bs bsVar = bs.f28105a;
        h.g.b.x.f(bsVar, "paddingDp");
        this.f28239a = bsVar;
    }

    @Override // com.waze.map.b.ec
    public final bs b() {
        return this.f28239a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb) && h.g.b.x.n(this.f28239a, ((eb) obj).f28239a);
    }

    public final int hashCode() {
        return this.f28239a.hashCode();
    }

    public final String toString() {
        return "Fullscreen(paddingDp=" + this.f28239a + ")";
    }

    public eb() {
        this(null);
    }
}
