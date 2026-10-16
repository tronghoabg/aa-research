package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bie extends afde implements afeg {
    final /* synthetic */ Object a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bie(adb adbVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = adbVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.c;
        if (i == 0) {
            bie bieVar = new bie((jlb) this.a, afckVar, 0);
            bieVar.b = obj;
            return bieVar;
        }
        Object obj2 = this.a;
        if (i != 1) {
            bie bieVar2 = new bie((ehi) obj2, afckVar, 2);
            bieVar2.b = obj;
            return bieVar2;
        }
        bie bieVar3 = new bie((adb) obj2, afckVar, 1);
        bieVar3.b = obj;
        return bieVar3;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.c;
        boolean z = false;
        if (i == 0) {
            woy.dF(obj);
            aitx aitxVar = (aitx) this.b;
            jlb jlbVar = (jlb) this.a;
            AtomicReference atomicReference = (AtomicReference) jlbVar.c;
            return Boolean.valueOf(a.p(atomicReference, ahnc.d(aitxVar, null, 0, new beh((aivh) atomicReference.getAndSet(null), jlbVar, (afck) null, 3), 3)));
        }
        if (i != 1) {
            ehi ehiVar = (ehi) this.b;
            woy.dF(obj);
            if ((ehiVar instanceof ees) && ((ees) ehiVar).c <= ((ees) this.a).c) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        woy.dF(obj);
        aitx aitxVar2 = (aitx) this.b;
        adb adbVar = (adb) this.a;
        cyp cypVar = adbVar.r;
        if (cypVar.f()) {
            ahnc.d(aitxVar2, null, 0, new ada(adbVar, (afck) null, 1, (byte[]) null), 3);
        }
        if (cypVar.g()) {
            ahnc.d(aitxVar2, null, 0, new ada(adbVar, (afck) null, 0), 3);
        }
        if (cypVar.i()) {
            ahnc.d(aitxVar2, null, 0, new ada(adbVar, (afck) null, 2, (char[]) null), 3);
        }
        if (cypVar.h()) {
            ahnc.d(aitxVar2, null, 0, new ada(adbVar, (afck) null, 3, (short[]) null), 3);
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            return ((bie) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 1) {
            return ((bie) b((ehi) obj, (afck) obj2)).hT(afak.a);
        }
        return ((bie) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bie(ehi ehiVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = ehiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bie(jlb jlbVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = jlbVar;
    }
}
