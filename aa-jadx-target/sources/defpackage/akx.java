package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class akx extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.affc e;
    final /* synthetic */ java.lang.Enum f;
    final /* synthetic */ java.lang.Object g;
    private /* synthetic */ java.lang.Object h;
    private final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akx(defpackage.afu afuVar, defpackage.bil bilVar, defpackage.affc affcVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.i = i;
        this.f = afuVar;
        this.g = bilVar;
        this.e = affcVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.i;
        java.lang.Enum r1 = this.f;
        if (i != 0) {
            defpackage.afu afuVar = (defpackage.afu) r1;
            defpackage.akx akxVar = new defpackage.akx(afuVar, (defpackage.bil) this.g, this.e, afdkVar, 1);
            akxVar.h = obj;
            return akxVar;
        }
        defpackage.akv akvVar = (defpackage.akv) r1;
        defpackage.akx akxVar2 = new defpackage.akx(akvVar, (defpackage.bil) this.g, this.e, afdkVar, 0);
        akxVar2.h = obj;
        return akxVar2;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [aiwg, java.lang.Object] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.bil bilVar;
        java.lang.Object obj2;
        defpackage.affc affcVar;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Throwable th;
        defpackage.bil bilVar2;
        java.lang.Object obj5;
        defpackage.bil bilVar3;
        defpackage.bil bilVar4;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        defpackage.bil bilVar5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        defpackage.affc affcVar2;
        java.lang.Object obj8;
        java.lang.Throwable th2;
        defpackage.bil bilVar6;
        java.lang.Object obj9;
        if (this.i == 0) {
            defpackage.afdr afdrVar = defpackage.afdr.a;
            int i = this.d;
            try {
                try {
                    if (i == 0) {
                        defpackage.afga.cz(obj);
                        aiuw aiuwVar = (aiuw) this.h;
                        java.lang.Enum r4 = this.f;
                        aiwg aiwgVar = aiuwVar.c().get(aiwg.d);
                        aiwgVar.getClass();
                        bilVar = new defpackage.bil(r4, aiwgVar);
                        obj2 = this.g;
                        defpackage.bil bilVar7 = (defpackage.bil) obj2;
                        bilVar7.ad(bilVar);
                        affcVar = this.e;
                        this.h = bilVar;
                        obj3 = bilVar7.a;
                        this.a = obj3;
                        this.b = affcVar;
                        this.c = obj2;
                        this.d = 1;
                        if (((ajey) obj3).b(this) != afdrVar) {
                        }
                        return afdrVar;
                    }
                    if (i != 1) {
                        obj4 = (defpackage.bil) this.b;
                        obj5 = this.a;
                        bilVar2 = (defpackage.bil) this.h;
                        try {
                            defpackage.afga.cz(obj);
                            defpackage.a.p((java.util.concurrent.atomic.AtomicReference) ((defpackage.bil) obj4).b, bilVar2);
                            ((ajey) obj5).d();
                            return obj;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            defpackage.a.p((java.util.concurrent.atomic.AtomicReference) ((defpackage.bil) obj4).b, bilVar2);
                            throw th;
                        }
                    }
                    java.lang.Object obj10 = this.c;
                    defpackage.affc affcVar3 = (defpackage.affc) this.b;
                    java.lang.Object obj11 = this.a;
                    defpackage.bil bilVar8 = (defpackage.bil) this.h;
                    defpackage.afga.cz(obj);
                    affcVar = affcVar3;
                    obj3 = obj11;
                    bilVar = bilVar8;
                    obj2 = obj10;
                    this.h = bilVar;
                    this.a = obj3;
                    this.b = obj2;
                    this.c = null;
                    this.d = 2;
                    java.lang.Object objInvoke = affcVar.invoke(this);
                    if (objInvoke != afdrVar) {
                        obj4 = obj2;
                        obj5 = obj3;
                        obj = objInvoke;
                        bilVar2 = bilVar;
                        defpackage.a.p((java.util.concurrent.atomic.AtomicReference) ((defpackage.bil) obj4).b, bilVar2);
                        ((ajey) obj5).d();
                        return obj;
                    }
                    return afdrVar;
                } catch (java.lang.Throwable th4) {
                    obj4 = obj2;
                    th = th4;
                    bilVar2 = bilVar;
                    defpackage.a.p((java.util.concurrent.atomic.AtomicReference) ((defpackage.bil) obj4).b, bilVar2);
                    throw th;
                }
            } catch (java.lang.Throwable th5) {
                ((ajey) 2).d();
                throw th5;
            }
        }
        defpackage.afdr afdrVar2 = defpackage.afdr.a;
        int i2 = this.d;
        try {
            try {
                if (i2 == 0) {
                    defpackage.afga.cz(obj);
                    aiuw aiuwVar2 = (aiuw) this.h;
                    java.lang.Enum r5 = this.f;
                    aiwg aiwgVar2 = aiuwVar2.c().get(aiwg.d);
                    aiwgVar2.getClass();
                    bilVar3 = new defpackage.bil(r5, aiwgVar2, (byte[]) null);
                    java.lang.Object obj12 = this.g;
                    do {
                        bilVar4 = (defpackage.bil) obj12;
                        atomicReference = (java.util.concurrent.atomic.AtomicReference) bilVar4.b;
                        bilVar5 = (defpackage.bil) atomicReference.get();
                        if (bilVar5 != null) {
                            if (((defpackage.afu) bilVar3.b).compareTo((java.lang.Enum) bilVar5.b) < 0) {
                                throw new java.util.concurrent.CancellationException("Current mutation had a higher priority");
                            }
                        }
                    } while (!defpackage.a.g(atomicReference, bilVar5, bilVar3));
                    if (bilVar5 != null) {
                        bilVar5.a.s(new defpackage.afv());
                    }
                    obj6 = bilVar4.a;
                    defpackage.affc affcVar4 = this.e;
                    this.h = bilVar3;
                    this.a = obj6;
                    this.b = affcVar4;
                    this.c = obj12;
                    this.d = 1;
                    if (((ajey) obj6).b(this) != afdrVar2) {
                        obj7 = obj12;
                        affcVar2 = affcVar4;
                    }
                    return afdrVar2;
                }
                if (i2 != 1) {
                    obj8 = (defpackage.bil) this.b;
                    obj9 = this.a;
                    bilVar6 = (defpackage.bil) this.h;
                    try {
                        defpackage.afga.cz(obj);
                        defpackage.a.p((java.util.concurrent.atomic.AtomicReference) ((defpackage.bil) obj8).b, bilVar6);
                        ((ajey) obj9).d();
                        return obj;
                    } catch (java.lang.Throwable th6) {
                        th2 = th6;
                        defpackage.a.p((java.util.concurrent.atomic.AtomicReference) ((defpackage.bil) obj8).b, bilVar6);
                        throw th2;
                    }
                }
                obj7 = this.c;
                affcVar2 = (defpackage.affc) this.b;
                java.lang.Object obj13 = this.a;
                defpackage.bil bilVar9 = (defpackage.bil) this.h;
                defpackage.afga.cz(obj);
                obj6 = obj13;
                bilVar3 = bilVar9;
                this.h = bilVar3;
                this.a = obj6;
                this.b = obj7;
                this.c = null;
                this.d = 2;
                java.lang.Object objInvoke2 = affcVar2.invoke(this);
                if (objInvoke2 != afdrVar2) {
                    obj9 = obj6;
                    obj8 = obj7;
                    obj = objInvoke2;
                    bilVar6 = bilVar3;
                    defpackage.a.p((java.util.concurrent.atomic.AtomicReference) ((defpackage.bil) obj8).b, bilVar6);
                    ((ajey) obj9).d();
                    return obj;
                }
                return afdrVar2;
            } catch (java.lang.Throwable th7) {
                obj8 = obj7;
                th2 = th7;
                bilVar6 = bilVar3;
                defpackage.a.p((java.util.concurrent.atomic.AtomicReference) ((defpackage.bil) obj8).b, bilVar6);
                throw th2;
            }
        } catch (java.lang.Throwable th8) {
            ((ajey) 2).d();
            throw th8;
        }
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.i != 0) {
            return ((defpackage.akx) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.akx) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akx(defpackage.akv akvVar, defpackage.bil bilVar, defpackage.affc affcVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.i = i;
        this.f = akvVar;
        this.g = bilVar;
        this.e = affcVar;
    }
}
