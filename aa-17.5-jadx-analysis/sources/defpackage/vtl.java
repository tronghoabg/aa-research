package defpackage;

/* loaded from: classes3.dex */
public final class vtl extends vmc {
    public vtl(vmb vmbVar, ajgu ajguVar) {
        super(vmbVar, ajguVar);
    }

    @Override // defpackage.vmc
    protected final String e() {
        ajgu ajguVar = this.a;
        ajgh ajghVar = ajguVar.i;
        if (ajghVar == null) {
            ajghVar = ajgh.a;
        }
        if (!ajghVar.c) {
            return "FIXME: Crash event without crash";
        }
        ajgh ajghVar2 = ajguVar.i;
        if (ajghVar2 == null) {
            ajghVar2 = ajgh.a;
        }
        ajfx ajfxVar = ajghVar2.d;
        if (ajfxVar == null) {
            ajfxVar = ajfx.a;
        }
        if ((ajfxVar.b & 1) == 0) {
            return "Crashed";
        }
        ajgc ajgcVar = ajguVar.z;
        if (ajgcVar == null) {
            ajgcVar = ajgc.a;
        }
        return "Crashed in process ".concat(String.valueOf(ajgcVar.g));
    }

    @Override // defpackage.vmc
    protected final String g() {
        return (String) xxh.g(c()).d("Crash");
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return (this.a.b & 64) != 0;
    }
}
