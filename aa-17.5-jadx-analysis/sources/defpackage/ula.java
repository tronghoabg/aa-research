package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ula implements tqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ula(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.tqg
    public final void a(usy usyVar, ujk ujkVar) {
        if (this.b == 0) {
            vat vatVar = uqb.c;
            Object obj = this.a;
            ulc ulcVar = ((ulb) obj).c;
            synchronized (ulcVar.b) {
                List list = ((ulb) obj).a;
                list.clear();
                list.addAll(ulcVar.c.entrySet());
            }
            ulb ulbVar = (ulb) this.a;
            List list2 = ulbVar.a;
            yfu yfuVarH = yfy.h(list2.size());
            Iterator it = list2.iterator();
            if (it.hasNext()) {
                throw null;
            }
            yfuVarH.d(false);
            rhj rhjVar = ulbVar.c.g;
            rhjVar.a.clear();
            rhjVar.c.clear();
            rhjVar.b.clear();
            Collections.sort(list2, ulc.a);
            new usy(ttn.b(ttn.a(usyVar.o())), usyVar.k(), usyVar.j(), usyVar.f());
            Iterator it2 = list2.iterator();
            if (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                throw null;
            }
            return;
        }
        Object obj2 = this.a;
        twz twzVar = (twz) obj2;
        boolean z = twzVar.f.getAndSet(false) || ujkVar != twzVar.h.j;
        twzVar.h.j = ujkVar;
        synchronized (twzVar.a) {
            List list3 = ((twz) obj2).c;
            list3.clear();
            List list4 = ((twz) obj2).b;
            list3.addAll(list4);
            list4.clear();
            List list5 = ((twz) obj2).d;
            ((twz) obj2).d = ((twz) obj2).e;
            ((twz) obj2).e = list5;
            ((twz) obj2).d.clear();
        }
        Object obj3 = this.a;
        twz twzVar2 = (twz) obj3;
        Iterator it3 = twzVar2.c.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        int size = twzVar2.e.size();
        while (true) {
            size--;
            if (size < 0) {
                synchronized (twzVar2.a) {
                    ((twz) obj3).e.addAll(((twz) obj3).d);
                    List list6 = ((twz) obj3).d;
                    ((twz) obj3).d = ((twz) obj3).e;
                    ((twz) obj3).e = list6;
                    ((twz) obj3).e.clear();
                }
                return;
            }
            if (((tvu) twzVar2.e.get(size)).d()) {
                twzVar2.e.remove(size);
            } else if (z) {
                tvu tvuVar = (tvu) twzVar2.e.get(size);
                txe txeVar = twzVar2.h;
                txeVar.e.getClass();
                ueu ueuVar = txeVar.i;
                tvuVar.t();
            }
        }
    }
}
