package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class akt extends afde implements afeg {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ akq f;
    final /* synthetic */ afeg g;
    final /* synthetic */ Object h;
    final /* synthetic */ bii i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akt(akq akqVar, bii biiVar, afeg afegVar, Object obj, afck afckVar) {
        super(2, afckVar);
        this.f = akqVar;
        this.i = biiVar;
        this.g = afegVar;
        this.h = obj;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        akt aktVar = new akt(this.f, this.i, this.g, this.h, afckVar);
        aktVar.j = obj;
        return aktVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        bii biiVar;
        bii biiVar2;
        Object obj2;
        afeg afegVar;
        Object obj3;
        bii biiVar3;
        Throwable th;
        bii biiVar4;
        afcr afcrVar = afcr.a;
        ?? r1 = this.e;
        try {
            try {
                if (r1 == 0) {
                    woy.dF(obj);
                    aitx aitxVar = (aitx) this.j;
                    akq akqVar = this.f;
                    afcm afcmVar = aitxVar.c().get(aivh.d);
                    afcmVar.getClass();
                    biiVar = new bii(akqVar, (aivh) afcmVar);
                    biiVar2 = this.i;
                    biiVar2.ad(biiVar);
                    afeg afegVar2 = this.g;
                    Object obj4 = this.h;
                    this.j = biiVar;
                    Object obj5 = biiVar2.a;
                    this.a = obj5;
                    this.b = afegVar2;
                    this.c = obj4;
                    this.d = biiVar2;
                    this.e = 1;
                    if (((ajdz) obj5).b(this) != afcrVar) {
                        obj2 = obj4;
                        afegVar = afegVar2;
                        obj3 = obj5;
                    }
                    return afcrVar;
                }
                if (r1 != 1) {
                    biiVar3 = (bii) this.b;
                    obj3 = this.a;
                    biiVar4 = (bii) this.j;
                    try {
                        woy.dF(obj);
                        a.q((AtomicReference) biiVar3.b, biiVar4);
                        ((ajdz) obj3).d();
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        a.q((AtomicReference) biiVar3.b, biiVar4);
                        throw th;
                    }
                }
                Object obj6 = this.d;
                obj2 = this.c;
                afeg afegVar3 = (afeg) this.b;
                Object obj7 = this.a;
                bii biiVar5 = (bii) this.j;
                woy.dF(obj);
                biiVar2 = obj6;
                obj3 = obj7;
                afegVar = afegVar3;
                biiVar = biiVar5;
                this.j = biiVar;
                this.a = obj3;
                this.b = biiVar2;
                this.c = null;
                this.d = null;
                this.e = 2;
                Object objInvoke = afegVar.invoke(obj2, this);
                if (objInvoke != afcrVar) {
                    biiVar3 = biiVar2;
                    obj = objInvoke;
                    biiVar4 = biiVar;
                    a.q((AtomicReference) biiVar3.b, biiVar4);
                    ((ajdz) obj3).d();
                    return obj;
                }
                return afcrVar;
            } catch (Throwable th3) {
                biiVar3 = biiVar2;
                th = th3;
                biiVar4 = biiVar;
                a.q((AtomicReference) biiVar3.b, biiVar4);
                throw th;
            }
        } catch (Throwable th4) {
            ((ajdz) r1).d();
            throw th4;
        }
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((akt) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
