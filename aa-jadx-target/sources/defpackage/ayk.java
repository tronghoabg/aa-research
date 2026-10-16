package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ayk extends defpackage.cge {
    final /* synthetic */ defpackage.ayl a;
    public defpackage.der b;

    public ayk(defpackage.ayl aylVar) {
        this.a = aylVar;
    }

    public final void b() {
        this.b = defpackage.cjv.A(this, new defpackage.ajy(this, this.a, 12, null));
    }

    @Override // defpackage.cge
    public final void dz() {
        defpackage.ayl aylVar = this.a;
        aylVar.a = this;
        if (aylVar.b != null) {
            b();
        }
    }

    @Override // defpackage.cge
    public final void q() {
        defpackage.ayl aylVar = this.a;
        if (aylVar.a == this) {
            aylVar.a = null;
        }
        defpackage.der derVar = this.b;
        if (derVar != null) {
            derVar.b();
        }
        this.b = null;
    }
}
