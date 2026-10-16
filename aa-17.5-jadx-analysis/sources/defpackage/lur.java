package defpackage;

import android.content.Intent;
import j$.util.Collection;
import j$.util.stream.Stream;

/* loaded from: classes.dex */
public final class lur extends luq {
    public static final /* synthetic */ int b = 0;
    private static final ygr c = new ymp(nyi.b);

    @Override // defpackage.luq
    public final yfg a(qrn qrnVar, nyj nyjVar) {
        Stream map = Collection.EL.stream(mjv.b().c(qrnVar, new nyk(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER"), qpi.i, nyjVar.c(c)))).filter(new kxo(19)).map(new lka(20));
        int i = yfq.d;
        return (yfg) map.collect(ycm.a);
    }
}
