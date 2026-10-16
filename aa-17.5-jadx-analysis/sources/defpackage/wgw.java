package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class wgw implements zfj {
    public List a;
    public final /* synthetic */ wgx b;

    public wgw(wgx wgxVar) {
        this.b = wgxVar;
    }

    @Override // defpackage.zfj
    public final zgp a() throws Exception {
        wgx wgxVar = this.b;
        xua xuaVarAw = woy.aw("Initialize ".concat(String.valueOf(wgxVar.a)), xud.a, false);
        try {
            synchronized (wgxVar.d) {
                if (this.a == null) {
                    this.a = wgxVar.e;
                    wgxVar.e = Collections.EMPTY_LIST;
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            wyd wydVar = new wyd(this.b, null);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((zfk) it.next()).a(wydVar));
                } catch (Exception e) {
                    arrayList.add(new zhc(e));
                }
            }
            zgp zgpVarA = new zgh(true, yfq.n(arrayList)).a(new iml(this, 7), zfq.a);
            xuaVarAw.a(zgpVarA);
            xuaVarAw.close();
            return zgpVarA;
        } catch (Throwable th) {
            try {
                xuaVarAw.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
