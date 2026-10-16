package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class akg extends defpackage.cyc<defpackage.akj> {
    private final defpackage.ask a;

    public akg(defpackage.ask askVar) {
        this.a = askVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.akj(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.akj akjVar = (defpackage.akj) cgeVar;
        defpackage.ask askVar = akjVar.a;
        defpackage.ask askVar2 = this.a;
        if (defpackage.afga.f(askVar, askVar2)) {
            return;
        }
        akjVar.p();
        akjVar.a = askVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.akg) && defpackage.afga.f(((defpackage.akg) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
