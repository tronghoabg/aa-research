package defpackage;

/* loaded from: classes3.dex */
public final class vws extends vmc {
    public vws(vmb vmbVar, ajgu ajguVar) {
        super(vmbVar, ajguVar);
    }

    @Override // defpackage.vmc
    protected final String e() {
        ajgt ajgtVar = this.a.q;
        if (ajgtVar == null) {
            ajgtVar = ajgt.a;
        }
        return ajgtVar.toString();
    }

    @Override // defpackage.vmc
    protected final String g() {
        return "StrictMode";
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return (this.a.b & 32768) != 0;
    }
}
