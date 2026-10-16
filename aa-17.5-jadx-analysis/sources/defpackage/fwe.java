package defpackage;

/* loaded from: classes2.dex */
public final class fwe {
    public final fwd a;
    public final fwd b;
    public final fwd c;
    public final fwd d;
    public final fwd e;
    public final fwd f;
    public final fwd g;
    public final fwd h;

    public fwe(fwd fwdVar, fwd fwdVar2, fwd fwdVar3, fwd fwdVar4, fwd fwdVar5, fwd fwdVar6, fwd fwdVar7, fwd fwdVar8) {
        this.a = fwdVar;
        this.b = fwdVar2;
        this.c = fwdVar3;
        this.d = fwdVar4;
        this.e = fwdVar5;
        this.f = fwdVar6;
        this.g = fwdVar7;
        this.h = fwdVar8;
    }

    public static final fwe a(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8) {
        return new fwe(fvr.i(num), fvr.i(num2), fvr.i(num3), fvr.i(num4), fvr.i(num5), fvr.i(num6), fvr.i(num7), fvr.i(num8));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwe)) {
            return false;
        }
        fwe fweVar = (fwe) obj;
        return affa.f(this.a, fweVar.a) && affa.f(this.b, fweVar.b) && affa.f(this.c, fweVar.c) && affa.f(this.d, fweVar.d) && affa.f(this.e, fweVar.e) && affa.f(this.f, fweVar.f) && affa.f(this.g, fweVar.g) && affa.f(this.h, fweVar.h);
    }

    public final int hashCode() {
        fwd fwdVar = this.a;
        int iHashCode = fwdVar == null ? 0 : fwdVar.hashCode();
        fwd fwdVar2 = this.b;
        int iHashCode2 = fwdVar2 == null ? 0 : fwdVar2.hashCode();
        int i = iHashCode * 31;
        fwd fwdVar3 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (fwdVar3 == null ? 0 : fwdVar3.hashCode())) * 31;
        fwd fwdVar4 = this.d;
        int iHashCode4 = (iHashCode3 + (fwdVar4 == null ? 0 : fwdVar4.hashCode())) * 31;
        fwd fwdVar5 = this.e;
        int iHashCode5 = (iHashCode4 + (fwdVar5 == null ? 0 : fwdVar5.hashCode())) * 31;
        fwd fwdVar6 = this.f;
        int iHashCode6 = (iHashCode5 + (fwdVar6 == null ? 0 : fwdVar6.hashCode())) * 31;
        fwd fwdVar7 = this.g;
        int iHashCode7 = (iHashCode6 + (fwdVar7 == null ? 0 : fwdVar7.hashCode())) * 31;
        fwd fwdVar8 = this.h;
        return iHashCode7 + (fwdVar8 != null ? fwdVar8.hashCode() : 0);
    }

    public final String toString() {
        return "ActionButtonColors(containerColor=" + this.a + ", contentColor=" + this.b + ", iconOnlyContentColor=" + this.c + ", focusRingColor=" + this.d + ", focusRingInnerColor=" + this.e + ", pressedContentColor=" + this.f + ", disabledContainerColor=" + this.g + ", disabledContentColor=" + this.h + ")";
    }

    public fwe() {
        this(null, null, null, null, null, null, null, null);
    }
}
