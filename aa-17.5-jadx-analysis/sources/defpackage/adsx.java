package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class adsx extends adsu {
    final /* synthetic */ adtb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adsx(adtc adtcVar, adtb adtbVar) {
        super(adtcVar.c);
        this.a = adtbVar;
    }

    @Override // defpackage.adsu
    public final void a() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            adtb adtbVar = this.a;
            synchronized (adtbVar) {
                if (adtbVar.c.isEmpty()) {
                    adtbVar.c = null;
                    adtbVar.a = true;
                    return;
                } else {
                    list = adtbVar.c;
                    adtbVar.c = arrayList;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }
}
