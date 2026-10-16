package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qsi implements defpackage.eqe {
    final /* synthetic */ defpackage.qsk a;
    final /* synthetic */ defpackage.bil b;

    public qsi(defpackage.qsk qskVar, defpackage.bil bilVar) {
        this.b = bilVar;
        this.a = qskVar;
    }

    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        if (epwVar == defpackage.epw.ON_CREATE) {
            this.b.z(ag$.ExternalSyntheticApiModelOutline0.m(this.a.C()));
        }
    }
}
