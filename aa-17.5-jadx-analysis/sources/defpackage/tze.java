package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class tze implements tzg {
    final /* synthetic */ boolean a;
    final /* synthetic */ qrx b;
    private List c = null;

    public tze(qrx qrxVar, boolean z) {
        this.a = z;
        this.b = qrxVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.tzg
    public final void a(ukp ukpVar, int i, Collection collection) {
        List listO;
        if (i == 0 && collection != null) {
            qrx qrxVar = this.b;
            ((plb) qrxVar.c).n(ukpVar, collection);
            qrxVar.b(collection);
        }
        qrx qrxVar2 = this.b;
        synchronized (qrxVar2) {
            if (this.a && i == 2) {
                listO = this.c;
                if (listO == null) {
                    listO = (List) qrxVar2.f.get(ukpVar);
                }
                if (listO != null) {
                    listO = yfq.o(listO);
                }
            } else {
                List list = this.c;
                if (list == null) {
                    list = (List) qrxVar2.f.remove(ukpVar);
                    this.c = list;
                }
                listO = list;
            }
        }
        if (listO != null) {
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                ((tzg) it.next()).a(ukpVar, i, collection);
            }
        }
    }
}
