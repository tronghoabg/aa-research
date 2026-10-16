package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class rfm implements rfd {
    private final int a;
    private final int b;
    private final rfd c;
    private final List d = new ArrayList();

    public rfm(rfk rfkVar) {
        this.a = rfkVar.a;
        this.b = rfkVar.b;
        rfd rfdVar = rfkVar.c;
        rfdVar.getClass();
        this.c = rfdVar;
    }

    @Override // defpackage.rfd
    public final synchronized void a(oub oubVar) {
        rfl rflVar;
        wer.c();
        int i = oubVar.c;
        List list = this.d;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                rflVar = new rfl(this.b);
                list.add(rflVar);
                break;
            } else {
                rflVar = (rfl) it.next();
                if (rflVar.e.c == i) {
                    break;
                }
            }
        }
        int i2 = this.b;
        int i3 = this.a;
        ydx ydxVar = rflVar.a;
        int size = ydxVar.size() + oubVar.g.size();
        ydxVar.addAll(oubVar.g);
        int i4 = size - i2;
        if (i4 > 0) {
            rflVar.b += i4;
        }
        rflVar.b += oubVar.h;
        oue oueVar = oubVar.f;
        if (oueVar == null) {
            oueVar = oue.a;
        }
        abms abmsVar = oueVar.j;
        int iD = (rflVar.c.d() + abmsVar.d()) - i3;
        if (iD > 0) {
            rflVar.c = rflVar.c.x(iD);
            rflVar.d += iD;
        }
        rflVar.c = rflVar.c.s(abmsVar);
        rflVar.d += oueVar.k;
        rflVar.e = oubVar;
        if (oubVar.e == 0) {
            this.c.a(rflVar.a());
            list.remove(rflVar);
        }
    }

    public final synchronized void b() {
        wer.c();
        List list = this.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.c.a(((rfl) it.next()).a());
        }
        list.clear();
    }
}
