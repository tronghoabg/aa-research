package defpackage;

import android.content.Intent;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Collection;
import j$.util.stream.Stream;

/* loaded from: classes2.dex */
public final class jzd extends nyh {
    public static final /* synthetic */ int b = 0;
    private static final yph c = yph.c("GH.TempClusterAppPrvdr");
    private static final ygr d = new ymp(nyi.b);
    public tgw a;
    private boolean e;

    public jzd() {
        super("ClusterAppHost");
        this.e = false;
    }

    public static jzd a() {
        return (jzd) mki.a.b(jzd.class, new jqw(6));
    }

    @Override // defpackage.nyh
    @ResultIgnorabilityUnspecified
    public final yfq b(qrn qrnVar, nyj nyjVar) {
        yfq yfqVarM = m(mjv.b().c(qrnVar, new nyk(new Intent("androidx.car.app.CarAppService").addCategory("androidx.car.app.category.FEATURE_CLUSTER"), qpi.h, nyjVar.c(d))), aczc.c());
        if (!this.e) {
            rrb rrbVarA = kad.a(yzy.HL);
            rrbVarA.q(yfqVarM);
            kad.e(rrbVarA);
            ((ype) c.l().ai((char) 2866)).y("Template cluster navigation apps found: %s", yfqVarM);
            this.e = true;
        }
        Stream map = Collection.EL.stream(yfqVarM).filter(new ghp(this, 16)).map(new jxe(14));
        int i = yfq.d;
        return (yfq) map.collect(ycm.a);
    }
}
