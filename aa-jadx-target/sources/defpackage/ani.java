package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ani extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.anj b;
    final /* synthetic */ defpackage.ark c;
    final /* synthetic */ defpackage.and d;
    final /* synthetic */ long e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ani(defpackage.anj anjVar, defpackage.ark arkVar, defpackage.and andVar, long j, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = anjVar;
        this.c = arkVar;
        this.d = andVar;
        this.e = j;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.ani aniVar = new defpackage.ani(this.b, this.c, this.d, this.e, afdkVar);
        aniVar.f = obj;
        return aniVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.afdr afdrVar = defpackage.afdr.a;
        java.util.concurrent.CancellationException cancellationException = null;
        try {
            try {
                if (this.a != 0) {
                    defpackage.afga.cz(obj);
                } else {
                    defpackage.afga.cz(obj);
                    aiwg aiwgVarQ = defpackage.afgz.q(((aiuw) this.f).c());
                    defpackage.anj anjVar = this.b;
                    anjVar.h = true;
                    defpackage.aqp aqpVar = anjVar.b;
                    defpackage.akv akvVar = defpackage.akv.a;
                    defpackage.anh anhVar = new defpackage.anh(this.c, anjVar, this.d, this.e, aiwgVarQ, null);
                    this.a = 1;
                    if (aqpVar.i(akvVar, anhVar, this) == afdrVar) {
                        return afdrVar;
                    }
                }
                java.lang.Object obj2 = this.b.i.a;
                defpackage.afia afiaVarM = defpackage.afqt.m(0, ((defpackage.bzc) obj2).b);
                int i = afiaVarM.a;
                int i2 = afiaVarM.b;
                if (i <= i2) {
                    while (true) {
                        ((defpackage.ang) ((defpackage.bzc) obj2).a[i]).b.w(defpackage.afbk.a);
                        if (i == i2) {
                            break;
                        }
                        i++;
                    }
                }
                ((defpackage.bzc) obj2).g();
                defpackage.anj anjVar2 = this.b;
                anjVar2.h = false;
                anjVar2.i.S(null);
                anjVar2.f = false;
                return defpackage.afbk.a;
            } catch (java.util.concurrent.CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            }
        } catch (java.lang.Throwable th) {
            defpackage.anj anjVar3 = this.b;
            anjVar3.h = false;
            anjVar3.i.S(cancellationException);
            anjVar3.f = false;
            throw th;
        }
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.ani) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
