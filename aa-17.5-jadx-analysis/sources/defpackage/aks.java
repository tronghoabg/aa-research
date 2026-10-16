package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class aks extends afde implements afeg {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ afec e;
    final /* synthetic */ Enum f;
    final /* synthetic */ Object g;
    private /* synthetic */ Object h;
    private final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aks(afn afnVar, bii biiVar, afec afecVar, afck afckVar, int i) {
        super(2, afckVar);
        this.i = i;
        this.f = afnVar;
        this.g = biiVar;
        this.e = afecVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.i;
        Enum r1 = this.f;
        if (i != 0) {
            afn afnVar = (afn) r1;
            aks aksVar = new aks(afnVar, (bii) this.g, this.e, afckVar, 1);
            aksVar.h = obj;
            return aksVar;
        }
        akq akqVar = (akq) r1;
        aks aksVar2 = new aks(akqVar, (bii) this.g, this.e, afckVar, 0);
        aksVar2.h = obj;
        return aksVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r7v2, types: [aivh, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        bii biiVar;
        Object obj2;
        afec afecVar;
        Object obj3;
        Object obj4;
        Throwable th;
        bii biiVar2;
        Object obj5;
        bii biiVar3;
        bii biiVar4;
        AtomicReference atomicReference;
        bii biiVar5;
        Object obj6;
        Object obj7;
        afec afecVar2;
        Object obj8;
        Throwable th2;
        bii biiVar6;
        Object obj9;
        if (this.i == 0) {
            afcr afcrVar = afcr.a;
            int i = this.d;
            try {
                try {
                    if (i == 0) {
                        woy.dF(obj);
                        aitx aitxVar = (aitx) this.h;
                        Enum r4 = this.f;
                        afcm afcmVar = aitxVar.c().get(aivh.d);
                        afcmVar.getClass();
                        biiVar = new bii(r4, (aivh) afcmVar);
                        obj2 = this.g;
                        bii biiVar7 = (bii) obj2;
                        biiVar7.ad(biiVar);
                        afecVar = this.e;
                        this.h = biiVar;
                        obj3 = biiVar7.a;
                        this.a = obj3;
                        this.b = afecVar;
                        this.c = obj2;
                        this.d = 1;
                        if (((ajdz) obj3).b(this) != afcrVar) {
                        }
                        return afcrVar;
                    }
                    if (i != 1) {
                        obj4 = (bii) this.b;
                        obj5 = this.a;
                        biiVar2 = (bii) this.h;
                        try {
                            woy.dF(obj);
                            a.q((AtomicReference) ((bii) obj4).b, biiVar2);
                            ((ajdz) obj5).d();
                            return obj;
                        } catch (Throwable th3) {
                            th = th3;
                            a.q((AtomicReference) ((bii) obj4).b, biiVar2);
                            throw th;
                        }
                    }
                    Object obj10 = this.c;
                    afec afecVar3 = (afec) this.b;
                    Object obj11 = this.a;
                    bii biiVar8 = (bii) this.h;
                    woy.dF(obj);
                    afecVar = afecVar3;
                    obj3 = obj11;
                    biiVar = biiVar8;
                    obj2 = obj10;
                    this.h = biiVar;
                    this.a = obj3;
                    this.b = obj2;
                    this.c = null;
                    this.d = 2;
                    Object objInvoke = afecVar.invoke(this);
                    if (objInvoke != afcrVar) {
                        obj4 = obj2;
                        obj5 = obj3;
                        obj = objInvoke;
                        biiVar2 = biiVar;
                        a.q((AtomicReference) ((bii) obj4).b, biiVar2);
                        ((ajdz) obj5).d();
                        return obj;
                    }
                    return afcrVar;
                } catch (Throwable th4) {
                    obj4 = obj2;
                    th = th4;
                    biiVar2 = biiVar;
                    a.q((AtomicReference) ((bii) obj4).b, biiVar2);
                    throw th;
                }
            } finally {
            }
        }
        afcr afcrVar2 = afcr.a;
        int i2 = this.d;
        try {
            try {
                if (i2 == 0) {
                    woy.dF(obj);
                    aitx aitxVar2 = (aitx) this.h;
                    Enum r42 = this.f;
                    afcm afcmVar2 = aitxVar2.c().get(aivh.d);
                    afcmVar2.getClass();
                    biiVar3 = new bii(r42, (aivh) afcmVar2, (byte[]) null);
                    Object obj12 = this.g;
                    do {
                        biiVar4 = (bii) obj12;
                        atomicReference = (AtomicReference) biiVar4.b;
                        biiVar5 = (bii) atomicReference.get();
                        if (biiVar5 != null) {
                            if (((afn) biiVar3.b).compareTo((afn) biiVar5.b) < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                    } while (!a.h(atomicReference, biiVar5, biiVar3));
                    if (biiVar5 != null) {
                        biiVar5.a.s(new afo());
                    }
                    obj6 = biiVar4.a;
                    afec afecVar4 = this.e;
                    this.h = biiVar3;
                    this.a = obj6;
                    this.b = afecVar4;
                    this.c = obj12;
                    this.d = 1;
                    if (((ajdz) obj6).b(this) != afcrVar2) {
                        obj7 = obj12;
                        afecVar2 = afecVar4;
                    }
                    return afcrVar2;
                }
                if (i2 != 1) {
                    obj8 = (bii) this.b;
                    obj9 = this.a;
                    biiVar6 = (bii) this.h;
                    try {
                        woy.dF(obj);
                        a.q((AtomicReference) ((bii) obj8).b, biiVar6);
                        ((ajdz) obj9).d();
                        return obj;
                    } catch (Throwable th5) {
                        th2 = th5;
                        a.q((AtomicReference) ((bii) obj8).b, biiVar6);
                        throw th2;
                    }
                }
                obj7 = this.c;
                afecVar2 = (afec) this.b;
                Object obj13 = this.a;
                bii biiVar9 = (bii) this.h;
                woy.dF(obj);
                obj6 = obj13;
                biiVar3 = biiVar9;
                this.h = biiVar3;
                this.a = obj6;
                this.b = obj7;
                this.c = null;
                this.d = 2;
                Object objInvoke2 = afecVar2.invoke(this);
                if (objInvoke2 != afcrVar2) {
                    obj9 = obj6;
                    obj8 = obj7;
                    obj = objInvoke2;
                    biiVar6 = biiVar3;
                    a.q((AtomicReference) ((bii) obj8).b, biiVar6);
                    ((ajdz) obj9).d();
                    return obj;
                }
                return afcrVar2;
            } catch (Throwable th6) {
                obj8 = obj7;
                th2 = th6;
                biiVar6 = biiVar3;
                a.q((AtomicReference) ((bii) obj8).b, biiVar6);
                throw th2;
            }
        } finally {
        }
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.i != 0) {
            return ((aks) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((aks) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aks(akq akqVar, bii biiVar, afec afecVar, afck afckVar, int i) {
        super(2, afckVar);
        this.i = i;
        this.f = akqVar;
        this.g = biiVar;
        this.e = afecVar;
    }
}
