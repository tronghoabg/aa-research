package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class wgf implements zfk {
    public final List a;
    public final Executor b;

    public wgf(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    @Override // defpackage.zfk
    public final /* synthetic */ zgp a(Object obj) throws Exception {
        List list = this.a;
        int i = ((yls) list).c;
        wyd wydVar = (wyd) obj;
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        ynp ynpVarListIterator = ((yfq) list).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            arrayList.add(((wgc) ynpVarListIterator.next()).b());
        }
        zfk zfkVarB = xur.b(new wge(this, arrayList, i, 1));
        xti xtiVar = ((wgx) wydVar.a).c;
        zfq zfqVar = zfq.a;
        return zfb.g(woy.az(zfb.g(wub.Z(xtiVar.a()), xur.b(new pwg(wydVar, zfkVarB, zfqVar, 7)), zfqVar)), xur.b(new wge(this, i, arrayList, i2)), zfqVar);
    }
}
