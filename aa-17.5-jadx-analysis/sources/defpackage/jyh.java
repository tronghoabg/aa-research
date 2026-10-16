package defpackage;

import android.content.Intent;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;

/* loaded from: classes.dex */
public final class jyh extends nyh {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("CarApp.H");
    private static final ygr c = new ymp(nyi.b);

    public jyh() {
        super("TemplateMessagingAppProvider");
    }

    @Override // defpackage.nyh
    public final yfq b(qrn qrnVar, nyj nyjVar) {
        if (acxa.U() && !jrk.b(mki.a.c)) {
            int i = yfq.d;
            return yls.a;
        }
        Intent intent = new Intent("androidx.car.app.CarAppService");
        intent.addCategory("androidx.car.app.category.MESSAGING");
        List listC = mjv.b().c(qrnVar, new nyk(intent, qpi.h, nyjVar.c(c)));
        ((ype) b.l().ai((char) 2826)).y("Raw list of messaging car apps found: %s", listC);
        Stream map = Collection.EL.stream(n(listC)).filter(new hmd(12)).map(new jxe(2));
        int i2 = yfq.d;
        return (yfq) map.collect(ycm.a);
    }
}
