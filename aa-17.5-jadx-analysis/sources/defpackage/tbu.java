package defpackage;

/* loaded from: classes3.dex */
public final class tbu implements afec {
    final /* synthetic */ eql a;
    final /* synthetic */ affq b;
    final /* synthetic */ afeg c;

    public tbu(eql eqlVar, affq affqVar, afeg afegVar) {
        this.a = eqlVar;
        this.b = affqVar;
        this.c = afegVar;
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        affq affqVar = this.b;
        eql eqlVar = this.a;
        Object objE = eqlVar.e();
        if (affqVar.a || ((objE == null && obj != null) || (objE != null && !((Boolean) this.c.invoke(objE, obj)).booleanValue()))) {
            affqVar.a = false;
            eqlVar.m(obj);
        }
        return afak.a;
    }
}
