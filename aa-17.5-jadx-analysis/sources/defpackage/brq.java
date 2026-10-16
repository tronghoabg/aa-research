package defpackage;

/* loaded from: classes2.dex */
final class brq extends cxt<brt> {
    private final ase a;
    private final boolean b;
    private final aew c;

    public brq(ase aseVar, boolean z, aew aewVar) {
        this.a = aseVar;
        this.b = z;
        this.c = aewVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new brt(this.a, this.b, this.c);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        brt brtVar = (brt) cfxVar;
        brtVar.a = this.a;
        boolean z = brtVar.b;
        boolean z2 = this.b;
        if (z != z2) {
            cjn.u(brtVar);
        }
        brtVar.b = z2;
        brtVar.c = this.c;
        if (brtVar.f == null && !Float.isNaN(brtVar.h)) {
            brtVar.f = adv.a(brtVar.h);
        }
        if (brtVar.e != null || Float.isNaN(brtVar.g)) {
            return;
        }
        brtVar.e = adv.a(brtVar.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brq)) {
            return false;
        }
        brq brqVar = (brq) obj;
        return affa.f(this.a, brqVar.a) && this.b == brqVar.b && affa.f(this.c, brqVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + a.f(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.b + ", animationSpec=" + this.c + ")";
    }
}
