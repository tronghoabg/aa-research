package defpackage;

/* loaded from: classes3.dex */
public final class vwf extends vmc {
    public vwf(vmb vmbVar, ajgu ajguVar) {
        super(vmbVar, ajguVar);
    }

    @Override // defpackage.vmc
    protected final String e() {
        ajgu ajguVar = this.a;
        ajgs ajgsVar = ajguVar.s;
        if (ajgsVar == null) {
            ajgsVar = ajgs.a;
        }
        if (ajgsVar.b == 1) {
            ajgs ajgsVar2 = ajguVar.s;
            if (ajgsVar2 == null) {
                ajgsVar2 = ajgs.a;
            }
            return "Stall (" + f(Long.valueOf(ajgsVar2.b == 1 ? ((Long) ajgsVar2.c).longValue() : 0L)) + ")";
        }
        ajgs ajgsVar3 = ajguVar.s;
        if ((ajgsVar3 == null ? ajgs.a : ajgsVar3).b != 2) {
            return "Stall";
        }
        if (ajgsVar3 == null) {
            ajgsVar3 = ajgs.a;
        }
        return "Stall Recovery (" + f(Long.valueOf(ajgsVar3.b == 2 ? ((Long) ajgsVar3.c).longValue() : 0L)) + ")";
    }

    @Override // defpackage.vmc
    protected final String g() {
        return (String) xxh.g(c()).d("Stall");
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return (this.a.b & 131072) != 0;
    }
}
