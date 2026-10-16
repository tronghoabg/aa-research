package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class jzc extends nyh {
    private static final yph a = yph.c("CarApp.H");
    private static final ygr b = new ymp(nyi.b);
    private boolean c;

    public jzc() {
        super("AppHostSettings");
        this.c = false;
    }

    public static jzc a() {
        return (jzc) mki.a.b(jzc.class, new jqw(5));
    }

    @Override // defpackage.nyh
    @ResultIgnorabilityUnspecified
    public final yfq b(qrn qrnVar, nyj nyjVar) {
        Intent intentAddCategory = new Intent("androidx.car.app.CarAppService").addCategory("androidx.car.app.category.SETTINGS");
        qpi qpiVar = qpi.h;
        ygr ygrVar = b;
        List<ResolveInfo> listC = mjv.b().c(qrnVar, new nyk(intentAddCategory, qpiVar, nyjVar.c(ygrVar)));
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 2862)).y("Raw list of car settings apps found: %s", listC);
        List listC2 = mjv.b().c(qrnVar, new nyk(new Intent("android.media.browse.MediaBrowserService"), qpi.c, nyjVar.c(ygrVar)));
        ygp ygpVar = new ygp();
        Iterator it = listC2.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = ((ResolveInfo) it.next()).serviceInfo;
            if (serviceInfo != null) {
                ygpVar.c(serviceInfo.packageName);
            }
        }
        ygr ygrVarG = ygpVar.g();
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listC) {
            if ("com.google.android.projection.gearhead".equals(resolveInfo.serviceInfo.packageName)) {
                String str = resolveInfo.serviceInfo.packageName;
                arrayList.add(resolveInfo);
            } else if (ygrVarG.contains(resolveInfo.serviceInfo.packageName)) {
                String str2 = resolveInfo.serviceInfo.packageName;
                arrayList.add(resolveInfo);
            }
        }
        yfq yfqVarM = m(arrayList, aczc.c());
        if (!this.c) {
            rrb rrbVarA = kad.a(yzy.sK);
            rrbVarA.q(yfqVarM);
            kad.e(rrbVarA);
            ((ype) yphVar.l().ai((char) 2863)).y("Template settings apps found: %s", yfqVarM);
            this.c = true;
        }
        Stream map = Collection.EL.stream(yfqVarM).map(new jxe(13));
        int i = yfq.d;
        return (yfq) map.collect(ycm.a);
    }
}
