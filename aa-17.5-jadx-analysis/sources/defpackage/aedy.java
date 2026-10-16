package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
final class aedy extends aedu {
    private static final adlc l = adlc.d("round_robin connecting: TCP/TLS handshake in progress to child balancers");
    private final AtomicInteger m;
    private adlg n;

    public aedy(adla adlaVar) {
        super(adlaVar);
        this.m = new AtomicInteger(new Random().nextInt());
        this.n = new adkz(l);
    }

    private final adlg g(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((aeds) it.next()).d);
        }
        return new aedx(arrayList, this.m);
    }

    private final void h(adjh adjhVar, adlg adlgVar) {
        if (adjhVar == this.k && adlgVar.equals(this.n)) {
            return;
        }
        this.h.f(adjhVar, adlgVar);
        this.k = adjhVar;
        this.n = adlgVar;
    }

    @Override // defpackage.aedu
    protected final aeds e(Object obj) {
        return new aedw(this, obj, this.j);
    }

    @Override // defpackage.aedu
    protected final void f() {
        ArrayList arrayList = new ArrayList();
        for (aeds aedsVar : this.g) {
            if (aedsVar.c == adjh.b) {
                arrayList.add(aedsVar);
            }
        }
        if (!arrayList.isEmpty()) {
            h(adjh.b, g(arrayList));
            return;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            adjh adjhVar = ((aeds) it.next()).c;
            adjh adjhVar2 = adjh.a;
            if (adjhVar == adjhVar2 || adjhVar == adjh.d) {
                h(adjhVar2, new adkz(l));
                return;
            }
        }
        h(adjh.c, g(this.g));
    }
}
