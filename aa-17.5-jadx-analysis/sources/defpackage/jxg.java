package defpackage;

import android.content.Intent;
import j$.util.Collection;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class jxg extends nyh implements lhg {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("CarApp.H");
    private static final ygr c = new ymp(nyi.b);
    private final Intent d;
    private final Map e;

    public jxg() {
        super("TemplateMediaAppProvider");
        this.e = new ConcurrentHashMap();
        Intent intent = new Intent("androidx.car.app.CarAppService");
        this.d = intent;
        intent.addCategory("androidx.car.app.category.MEDIA");
    }

    public static jxg a() {
        return (jxg) mki.a.b(jxg.class, new jqw(3));
    }

    @Override // defpackage.nyh
    public final yfq b(qrn qrnVar, nyj nyjVar) {
        boolean zT = acsx.t();
        Map map = this.e;
        if (!zT) {
            return (yfq) Map.EL.computeIfAbsent(map, nyjVar, new jxf(this, qrnVar, 0));
        }
        yfq yfqVar = (yfq) map.get(nyjVar);
        if (yfqVar != null) {
            return yfqVar;
        }
        yfq yfqVarE = e(qrnVar, nyjVar);
        if (!yfqVarE.isEmpty()) {
            map.put(nyjVar, yfqVarE);
        }
        return yfqVarE;
    }

    @Override // defpackage.lhg
    public final void c() {
        this.e.clear();
    }

    @Override // defpackage.lhg
    public final void d() {
        this.e.clear();
    }

    public final yfq e(qrn qrnVar, nyj nyjVar) {
        List listC = mjv.b().c(qrnVar, new nyk(this.d, qpi.h, nyjVar.c(c)));
        yph yphVar = b;
        ((ype) yphVar.l().ai((char) 2815)).y("Raw list of template media apps found: %s", listC);
        Stream map = Collection.EL.stream(n(listC)).filter(new hmd(8)).map(new jxe(0));
        int i = yfq.d;
        yfq yfqVar = (yfq) map.collect(ycm.a);
        ((ype) yphVar.l().ai((char) 2816)).y("External Template media apps found: %s", yfqVar);
        return yfqVar;
    }
}
