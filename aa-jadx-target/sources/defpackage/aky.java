package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aky extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ defpackage.akv f;
    final /* synthetic */ defpackage.affg g;
    final /* synthetic */ java.lang.Object h;
    final /* synthetic */ defpackage.bil i;
    private /* synthetic */ java.lang.Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aky(defpackage.akv akvVar, defpackage.bil bilVar, defpackage.affg affgVar, java.lang.Object obj, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.f = akvVar;
        this.i = bilVar;
        this.g = affgVar;
        this.h = obj;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aky akyVar = new defpackage.aky(this.f, this.i, this.g, this.h, afdkVar);
        akyVar.j = obj;
        return akyVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.bil bilVar;
        java.lang.Object obj2;
        defpackage.affg affgVar;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Throwable th;
        defpackage.bil bilVar2;
        java.lang.Object obj6;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        ?? r1 = this.e;
        try {
            try {
                if (r1 == 0) {
                    defpackage.afga.cz(obj);
                    aiuw aiuwVar = (aiuw) this.j;
                    defpackage.akv akvVar = this.f;
                    aiwg aiwgVar = aiuwVar.c().get(aiwg.d);
                    aiwgVar.getClass();
                    bilVar = new defpackage.bil(akvVar, aiwgVar);
                    defpackage.bil bilVar3 = this.i;
                    bilVar3.ad(bilVar);
                    defpackage.affg affgVar2 = this.g;
                    java.lang.Object obj7 = this.h;
                    this.j = bilVar;
                    java.lang.Object obj8 = bilVar3.a;
                    this.a = obj8;
                    this.b = affgVar2;
                    this.c = obj7;
                    this.d = bilVar3;
                    this.e = 1;
                    if (((ajey) obj8).b(this) != afdrVar) {
                        obj2 = obj7;
                        affgVar = affgVar2;
                        obj3 = obj8;
                        obj4 = bilVar3;
                    }
                    return afdrVar;
                }
                if (r1 != 1) {
                    obj5 = (defpackage.bil) this.b;
                    obj3 = this.a;
                    bilVar2 = (defpackage.bil) this.j;
                    try {
                        defpackage.afga.cz(obj);
                        obj6 = obj5;
                        defpackage.a.p((java.util.concurrent.atomic.AtomicReference) ((defpackage.bil) obj6).b, bilVar2);
                        ((ajey) obj3).d();
                        return obj;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defpackage.a.p((java.util.concurrent.atomic.AtomicReference) ((defpackage.bil) obj5).b, bilVar2);
                        throw th;
                    }
                }
                java.lang.Object obj9 = this.d;
                obj2 = this.c;
                defpackage.affg affgVar3 = (defpackage.affg) this.b;
                java.lang.Object obj10 = this.a;
                defpackage.bil bilVar4 = (defpackage.bil) this.j;
                defpackage.afga.cz(obj);
                obj4 = obj9;
                obj3 = obj10;
                affgVar = affgVar3;
                bilVar = bilVar4;
                this.j = bilVar;
                this.a = obj3;
                this.b = obj4;
                this.c = null;
                this.d = null;
                this.e = 2;
                java.lang.Object objInvoke = affgVar.invoke(obj2, this);
                if (objInvoke != afdrVar) {
                    obj6 = obj4;
                    obj = objInvoke;
                    bilVar2 = bilVar;
                    defpackage.a.p((java.util.concurrent.atomic.AtomicReference) ((defpackage.bil) obj6).b, bilVar2);
                    ((ajey) obj3).d();
                    return obj;
                }
                return afdrVar;
            } catch (java.lang.Throwable th3) {
                obj5 = obj4;
                th = th3;
                bilVar2 = bilVar;
                defpackage.a.p((java.util.concurrent.atomic.AtomicReference) ((defpackage.bil) obj5).b, bilVar2);
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            ((ajey) r1).d();
            throw th4;
        }
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aky) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
