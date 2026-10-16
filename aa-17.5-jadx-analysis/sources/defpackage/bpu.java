package defpackage;

/* loaded from: classes.dex */
public final class bpu {
    public final bcm a;
    public final bcm b;
    public final bcm c;
    public final bcm d;
    public final bcm e;
    public final bcm f;
    public final bcm g;
    public final bcm h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bpu() {
        this(bpt.a, bpt.b, bpt.c, bpt.d, bpt.f, bpt.e, bpt.g, bpt.h);
        bcm bcmVar = bpt.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpu)) {
            return false;
        }
        bpu bpuVar = (bpu) obj;
        return affa.f(this.a, bpuVar.a) && affa.f(this.b, bpuVar.b) && affa.f(this.c, bpuVar.c) && affa.f(this.d, bpuVar.d) && affa.f(this.e, bpuVar.e) && affa.f(this.f, bpuVar.f) && affa.f(this.g, bpuVar.g) && affa.f(this.h, bpuVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ")";
    }

    public bpu(bcm bcmVar, bcm bcmVar2, bcm bcmVar3, bcm bcmVar4, bcm bcmVar5, bcm bcmVar6, bcm bcmVar7, bcm bcmVar8) {
        this.a = bcmVar;
        this.b = bcmVar2;
        this.c = bcmVar3;
        this.d = bcmVar4;
        this.e = bcmVar5;
        this.f = bcmVar6;
        this.g = bcmVar7;
        this.h = bcmVar8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bpu(bcm bcmVar, bcm bcmVar2, bcm bcmVar3, bcm bcmVar4, bcm bcmVar5) {
        this(bcmVar, bcmVar2, bcmVar3, bcmVar4, bcmVar5, bpt.e, bpt.g, bpt.h);
        bcm bcmVar6 = bpt.a;
    }
}
