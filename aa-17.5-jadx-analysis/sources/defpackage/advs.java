package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class advs extends adix {
    public final String b;
    final /* synthetic */ advv c;
    public final AtomicReference a = new AtomicReference(advv.e);
    private final adix d = new advp(this);

    public advs(advv advvVar, String str) {
        this.c = advvVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.adix
    public final String a() {
        return this.b;
    }

    final void b(adkk adkkVar) {
        Collection collection;
        AtomicReference atomicReference = this.a;
        adkk adkkVar2 = (adkk) atomicReference.get();
        atomicReference.set(adkkVar);
        if (adkkVar2 != advv.e || (collection = this.c.v) == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((advr) it.next()).bc();
        }
    }

    public final adqq c(admf admfVar, adiw adiwVar) {
        adkk adkkVar = (adkk) this.a.get();
        if (adkkVar == null) {
            return this.d.d(admfVar, adiwVar);
        }
        if (!(adkkVar instanceof adwf)) {
            return new advj(adkkVar, this.d, this.c.k, admfVar, adiwVar);
        }
        adwe adweVarB = ((adwf) adkkVar).b.b(admfVar);
        if (adweVarB != null) {
            adiwVar = adiwVar.f(adwe.a, adweVarB);
        }
        return this.d.d(admfVar, adiwVar);
    }

    @Override // defpackage.adix
    public final adqq d(admf admfVar, adiw adiwVar) {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        adkk adkkVar = advv.e;
        if (obj != adkkVar) {
            return c(admfVar, adiwVar);
        }
        advv advvVar = this.c;
        aduy aduyVar = new aduy(this, 9);
        adnw adnwVar = advvVar.m;
        adnwVar.execute(aduyVar);
        if (atomicReference.get() != adkkVar) {
            return c(admfVar, adiwVar);
        }
        if (advvVar.z.get()) {
            return new advq();
        }
        advr advrVar = new advr(this, adjq.k(), admfVar, adiwVar);
        adnwVar.execute(new adsy(this, advrVar, 17));
        return advrVar;
    }
}
