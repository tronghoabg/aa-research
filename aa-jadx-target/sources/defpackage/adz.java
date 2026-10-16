package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adz extends defpackage.afee implements defpackage.affc {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.aeb d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ defpackage.aeg f;
    final /* synthetic */ long g;
    final /* synthetic */ defpackage.affc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adz(defpackage.aeb aebVar, java.lang.Object obj, defpackage.aeg aegVar, long j, defpackage.affc affcVar, defpackage.afdk afdkVar) {
        super(1, afdkVar);
        this.d = aebVar;
        this.e = obj;
        this.f = aegVar;
        this.g = j;
        this.h = affcVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [affc, java.lang.Object] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.adz adzVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.util.concurrent.CancellationException cancellationException;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (this.c != 0) {
            obj2 = this.b;
            obj3 = this.a;
            try {
                defpackage.afga.cz(obj);
                adzVar = this;
            } catch (java.util.concurrent.CancellationException e) {
                cancellationException = e;
                adzVar = this;
                adzVar.d.g();
                throw cancellationException;
            }
        } else {
            defpackage.afga.cz(obj);
            try {
                defpackage.aeb aebVar = this.d;
                defpackage.aek aekVar = aebVar.b;
                aekVar.a = (defpackage.aep) aebVar.g.b.invoke(this.e);
                defpackage.aeg aegVar = this.f;
                aebVar.i(((defpackage.agf) aegVar).a);
                aebVar.h(true);
                defpackage.aek aekVarD = defpackage.ca.D(aekVar, null, Long.MIN_VALUE, 23);
                defpackage.afgq afgqVar = new defpackage.afgq();
                long j = this.g;
                defpackage.afl aflVar = new defpackage.afl(aebVar, aekVarD, this.h, afgqVar, 1);
                this.a = aekVarD;
                this.b = afgqVar;
                this.c = 1;
                adzVar = this;
                try {
                    if (defpackage.afw.d(aekVarD, aegVar, j, aflVar, adzVar) == afdrVar) {
                        return afdrVar;
                    }
                    obj2 = afgqVar;
                    obj3 = aekVarD;
                } catch (java.util.concurrent.CancellationException e2) {
                    e = e2;
                    cancellationException = e;
                    adzVar.d.g();
                    throw cancellationException;
                }
            } catch (java.util.concurrent.CancellationException e3) {
                e = e3;
                adzVar = this;
                cancellationException = e;
                adzVar.d.g();
                throw cancellationException;
            }
        }
        int i = true != ((defpackage.afgq) obj2).a ? 2 : 1;
        adzVar.d.g();
        return new defpackage.aeh((defpackage.aek) obj3, i);
    }

    @Override // defpackage.affc
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return new defpackage.adz(this.d, this.e, this.f, this.g, this.h, (defpackage.afdk) obj).hf(defpackage.afbk.a);
    }
}
