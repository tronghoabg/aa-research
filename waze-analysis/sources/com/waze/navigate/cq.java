package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cq {

    /* renamed from: a, reason: collision with root package name */
    private final cp f31181a;

    /* renamed from: b, reason: collision with root package name */
    private final cp f31182b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31183c;

    public cq(cp cpVar, cp cpVar2, boolean z) {
        h.g.b.x.f(cpVar, "currentInstruction");
        h.g.b.x.f(cpVar2, "nextInstruction");
        this.f31181a = cpVar;
        this.f31182b = cpVar2;
        this.f31183c = z;
    }

    public static /* synthetic */ cq d(cq cqVar, cp cpVar, cp cpVar2, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            cpVar = cqVar.f31181a;
        }
        if ((i2 & 2) != 0) {
            cpVar2 = cqVar.f31182b;
        }
        if ((i2 & 4) != 0) {
            z = cqVar.f31183c;
        }
        h.g.b.x.f(cpVar, "currentInstruction");
        h.g.b.x.f(cpVar2, "nextInstruction");
        return new cq(cpVar, cpVar2, z);
    }

    public final cp a() {
        return this.f31181a;
    }

    public final cp b() {
        return this.f31182b;
    }

    public final boolean c() {
        return this.f31183c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq)) {
            return false;
        }
        cq cqVar = (cq) obj;
        return h.g.b.x.n(this.f31181a, cqVar.f31181a) && h.g.b.x.n(this.f31182b, cqVar.f31182b) && this.f31183c == cqVar.f31183c;
    }

    public final int hashCode() {
        return (((this.f31181a.hashCode() * 31) + this.f31182b.hashCode()) * 31) + a.a.a(this.f31183c);
    }

    public final String toString() {
        return "InstructionState(currentInstruction=" + this.f31181a + ", nextInstruction=" + this.f31182b + ", nextInstructionDisplayArrowBeforeText=" + this.f31183c + ")";
    }

    public cq() {
        this(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ cq(byte[] bArr) {
        byte[] bArr2 = null;
        this(new cp(bArr2), new cp(bArr2), false);
    }
}
