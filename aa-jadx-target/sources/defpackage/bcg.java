package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bcg extends defpackage.cge {
    private defpackage.bcf a;

    public bcg(defpackage.bcf bcfVar) {
        this.a = bcfVar;
    }

    private final void d() {
        defpackage.bcf bcfVar = this.a;
        if (bcfVar instanceof defpackage.bcf) {
            bcfVar.getClass();
            bcfVar.a.m(this);
        }
    }

    public final void b(defpackage.bcf bcfVar) {
        d();
        if (bcfVar instanceof defpackage.bcf) {
            bcfVar.a.n(this);
        }
        this.a = bcfVar;
    }

    @Override // defpackage.cge
    public final void dz() {
        b(this.a);
    }

    @Override // defpackage.cge
    public final void q() {
        d();
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }
}
