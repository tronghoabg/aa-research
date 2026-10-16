package defpackage;

import android.content.Intent;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;

/* loaded from: classes.dex */
public final class jzb extends nyh {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("CarApp.H");
    private static final ygr c = new ymp(nyi.b);
    private boolean d;

    public jzb() {
        super("AppHostNavigation");
        this.d = false;
    }

    public static jzb a() {
        return (jzb) mki.a.i(jzb.class);
    }

    @Override // defpackage.nyh
    @ResultIgnorabilityUnspecified
    public final yfq b(qrn qrnVar, nyj nyjVar) {
        List listC = mjv.b().c(qrnVar, new nyk(new Intent("androidx.car.app.CarAppService").addCategory("androidx.car.app.category.NAVIGATION"), qpi.h, nyjVar.c(c)));
        yph yphVar = b;
        ((ype) yphVar.l().ai((char) 2860)).y("Raw list of car navigation apps found: %s", listC);
        yfq yfqVarM = m(listC, aczc.c());
        if (!this.d) {
            rrb rrbVarA = kad.a(yzy.sj);
            rrbVarA.q(yfqVarM);
            kad.e(rrbVarA);
            ((ype) yphVar.l().ai((char) 2861)).y("Template navigation apps found: %s", yfqVarM);
            this.d = true;
        }
        Stream map = Collection.EL.stream(yfqVarM).map(new jxe(12));
        int i = yfq.d;
        return (yfq) map.collect(ycm.a);
    }
}
