package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cp {

    /* renamed from: a, reason: collision with root package name */
    private final ea f31175a;

    /* renamed from: b, reason: collision with root package name */
    private final de f31176b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f31177c;

    /* renamed from: d, reason: collision with root package name */
    private final es f31178d;

    /* renamed from: e, reason: collision with root package name */
    private final di f31179e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f31180f;

    public cp(ea eaVar, de deVar, Long l2, es esVar, di diVar, Integer num) {
        h.g.b.x.f(eaVar, "instructionType");
        this.f31175a = eaVar;
        this.f31176b = deVar;
        this.f31177c = l2;
        this.f31178d = esVar;
        this.f31179e = diVar;
        this.f31180f = num;
    }

    public static /* synthetic */ cp g(cp cpVar, ea eaVar, de deVar, Long l2, es esVar, di diVar, Integer num, int i2) {
        if ((i2 & 1) != 0) {
            eaVar = cpVar.f31175a;
        }
        ea eaVar2 = eaVar;
        if ((i2 & 2) != 0) {
            deVar = cpVar.f31176b;
        }
        de deVar2 = deVar;
        if ((i2 & 4) != 0) {
            l2 = cpVar.f31177c;
        }
        Long l3 = l2;
        if ((i2 & 8) != 0) {
            esVar = cpVar.f31178d;
        }
        es esVar2 = esVar;
        if ((i2 & 16) != 0) {
            diVar = cpVar.f31179e;
        }
        di diVar2 = diVar;
        if ((i2 & 32) != 0) {
            num = cpVar.f31180f;
        }
        h.g.b.x.f(eaVar2, "instructionType");
        return new cp(eaVar2, deVar2, l3, esVar2, diVar2, num);
    }

    public final de a() {
        return this.f31176b;
    }

    public final di b() {
        return this.f31179e;
    }

    public final ea c() {
        return this.f31175a;
    }

    public final es d() {
        return this.f31178d;
    }

    public final Integer e() {
        return this.f31180f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp)) {
            return false;
        }
        cp cpVar = (cp) obj;
        return this.f31175a == cpVar.f31175a && h.g.b.x.n(this.f31176b, cpVar.f31176b) && h.g.b.x.n(this.f31177c, cpVar.f31177c) && h.g.b.x.n(this.f31178d, cpVar.f31178d) && h.g.b.x.n(this.f31179e, cpVar.f31179e) && h.g.b.x.n(this.f31180f, cpVar.f31180f);
    }

    public final Long f() {
        return this.f31177c;
    }

    public final int hashCode() {
        int iHashCode = this.f31175a.hashCode() * 31;
        de deVar = this.f31176b;
        int iHashCode2 = (iHashCode + (deVar == null ? 0 : deVar.hashCode())) * 31;
        Long l2 = this.f31177c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        es esVar = this.f31178d;
        int iHashCode4 = (iHashCode3 + (esVar == null ? 0 : esVar.hashCode())) * 31;
        di diVar = this.f31179e;
        int iHashCode5 = (iHashCode4 + (diVar == null ? 0 : diVar.hashCode())) * 31;
        Integer num = this.f31180f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Instruction(instructionType=" + this.f31175a + ", distance=" + this.f31176b + ", etaSeconds=" + this.f31177c + ", streetInfo=" + this.f31178d + ", navigationLanes=" + this.f31179e + ", roundaboutExitNumber=" + this.f31180f + ")";
    }

    public cp() {
        this(null);
    }

    public /* synthetic */ cp(byte[] bArr) {
        this(ea.f31285a, null, null, null, null, null);
    }
}
