package defpackage;

/* loaded from: classes2.dex */
public final class fxe {
    public static final fxe a = new fxe(fxc.g, fxc.h, fxc.i, fxc.j, 48);
    public static final fxe b = new fxe(fxc.m, fxc.n, fxc.o, fxc.p, 48);
    public static final fxe c = new fxe(fxc.s, fxc.t, fxc.u, gcl.b, 48);
    public static final fxe d;
    public static final fxe e;
    public static final fxe f;
    public static final fxe g;
    public final afeg h;
    public final afeg i;
    public final afeg j;
    public final afeg k;
    public final afeg l;
    public final afeg m;

    static {
        afeg afegVar = null;
        d = new fxe(fxc.e, fxc.f, null, afegVar, 60);
        afeg afegVar2 = null;
        e = new fxe(fxc.c, fxc.d, afegVar, afegVar2, 60);
        afeg afegVar3 = null;
        f = new fxe(fxc.k, fxc.l, afegVar2, afegVar3, 60);
        g = new fxe(fxc.q, fxc.r, afegVar3, null, 60);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ fxe(afeg afegVar, afeg afegVar2, afeg afegVar3, afeg afegVar4, int i) {
        afeg afegVar5 = (i & 1) != 0 ? fxc.b : afegVar;
        afeg afegVar6 = (i & 2) != 0 ? fxc.a : afegVar2;
        this(afegVar5, afegVar6, (i & 4) != 0 ? afegVar5 : afegVar3, (i & 8) != 0 ? afegVar6 : afegVar4, new fxd(afegVar5, 1), new fxd(afegVar6, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxe)) {
            return false;
        }
        fxe fxeVar = (fxe) obj;
        return affa.f(this.h, fxeVar.h) && affa.f(this.i, fxeVar.i) && affa.f(this.j, fxeVar.j) && affa.f(this.k, fxeVar.k) && affa.f(this.l, fxeVar.l) && affa.f(this.m, fxeVar.m);
    }

    public final int hashCode() {
        return (((((((((this.h.hashCode() * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode();
    }

    public final String toString() {
        return "CarButtonColors(containerColor=" + this.h + ", contentColor=" + this.i + ", focusRingColor=" + this.j + ", focusRingInnerColor=" + this.k + ", disabledContainerColor=" + this.l + ", disabledContentColor=" + this.m + ")";
    }

    public fxe(afeg afegVar, afeg afegVar2, afeg afegVar3, afeg afegVar4, afeg afegVar5, afeg afegVar6) {
        afegVar.getClass();
        afegVar2.getClass();
        afegVar3.getClass();
        afegVar4.getClass();
        this.h = afegVar;
        this.i = afegVar2;
        this.j = afegVar3;
        this.k = afegVar4;
        this.l = afegVar5;
        this.m = afegVar6;
    }

    public fxe() {
        this(null, null, null, null, 63);
    }
}
