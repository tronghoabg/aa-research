package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.apps.auto.components.carlocalmedia.CarLocalMediaBrowserService;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ljp extends nyh {
    public static final ljo a = new ljo();
    public static final yph b = yph.c("GH.MediaAppProvider");
    public static final afgl c = new kkp(mki.b, 11);
    public final ComponentName d;
    public ygr e;
    private boolean f;

    public ljp() {
        super("Media");
        this.d = new ComponentName("com.google.android.projection.gearhead", CarLocalMediaBrowserService.class.getName());
    }

    public static final ljp d() {
        return a.a();
    }

    private final yfq e(qrn qrnVar, nyj nyjVar) {
        return n(mjv.b().c(qrnVar, new nyk(new Intent("android.media.browse.MediaBrowserService"), qpi.c, nyjVar.c(new ymp(nyi.b)))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ComponentName a(ComponentName componentName, qrn qrnVar) {
        componentName.getClass();
        qrnVar.getClass();
        yfq yfqVarE = e(qrnVar, nyj.b());
        yfqVarE.getClass();
        ArrayList arrayList = new ArrayList();
        ynp ynpVarListIterator = yfqVarE.listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            E next = ynpVarListIterator.next();
            if (affa.f(((ComponentName) next).getPackageName(), componentName.getPackageName())) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.contains(componentName) ? componentName : (ComponentName) woy.bF(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList, java.util.Collection] */
    @Override // defpackage.nyh
    public final yfq b(qrn qrnVar, nyj nyjVar) {
        qrnVar.getClass();
        boolean zO = acsx.O();
        ygr ygrVarP = zO ? ygr.p(nyi.b, nyi.a) : new ymp(nyi.b);
        ygrVarP.getClass();
        mkc mkcVarB = mjv.b();
        Intent intent = new Intent("androidx.car.app.CarAppService");
        qpi qpiVar = qpi.h;
        yfq yfqVarN = n(mkcVarB.c(qrnVar, new nyk(intent, qpiVar, nyjVar.c(ygrVarP))));
        yfqVarN.getClass();
        ArrayList arrayList = new ArrayList();
        ynp ynpVarListIterator = yfqVarN.listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            Object next = ynpVarListIterator.next();
            if (!affa.f(((ComponentName) next).getPackageName(), "com.google.android.projection.gearhead")) {
                arrayList.add(next);
            }
        }
        yfq yfqVarT = wub.t(arrayList);
        mkc mkcVarB2 = mjv.b();
        Intent intent2 = new Intent("androidx.car.app.CarAppService");
        intent2.addCategory("androidx.car.app.category.SETTINGS");
        yfq yfqVarN2 = n(mkcVarB2.c(qrnVar, new nyk(intent2, qpiVar, nyjVar.c(ygrVarP))));
        mkc mkcVarB3 = mjv.b();
        Intent intent3 = new Intent("androidx.car.app.CarAppService");
        intent3.addCategory("androidx.car.app.category.MEDIA");
        yfq yfqVarN3 = n(mkcVarB3.c(qrnVar, new nyk(intent3, qpiVar, nyjVar.c(ygrVarP))));
        yfqVarN3.getClass();
        ArrayList arrayList2 = new ArrayList();
        ynp ynpVarListIterator2 = yfqVarN3.listIterator(0);
        while (ynpVarListIterator2.hasNext()) {
            Object next2 = ynpVarListIterator2.next();
            if (!affa.f(((ComponentName) next2).getPackageName(), "com.google.android.projection.gearhead")) {
                arrayList2.add(next2);
            }
        }
        yfq yfqVarT2 = wub.t(arrayList2);
        if (zO && nyjVar.f()) {
            ?? arrayList3 = new ArrayList();
            for (Object obj : yfqVarT2) {
                if (nrz.e().g((ComponentName) obj)) {
                    arrayList3.add(obj);
                }
            }
            yfqVarT2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : yfqVarT) {
            if (!yfqVarN2.contains((ComponentName) obj2)) {
                arrayList4.add(obj2);
            }
        }
        Object objCollect = Collection.EL.stream(e(qrnVar, nyjVar)).filter(new koh(new jzi(this, arrayList4, 9), 15)).collect(Collectors.toList());
        List list = (List) objCollect;
        if (acrz.s()) {
            try {
                mki.a.g();
                if (ols.t(qrnVar) != null) {
                    list.add(mkn.G);
                }
            } catch (IllegalStateException | qrz | qsa unused) {
            }
        }
        if (lej.a.a().d() && !lmi.a.a().e()) {
            list.add(this.d);
        }
        list.addAll(yfqVarT2);
        objCollect.getClass();
        Iterable<ComponentName> iterable = (Iterable) objCollect;
        ArrayList arrayList5 = new ArrayList(woy.bp(iterable, 10));
        for (ComponentName componentName : iterable) {
            componentName.getClass();
            arrayList5.add(new mqc(componentName, mpz.d, false, 28));
        }
        yfq yfqVarT3 = wub.t(arrayList5);
        if (!this.f) {
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.qY);
            ArrayList arrayList6 = new ArrayList(woy.bp(yfqVarT3, 10));
            Iterator it = yfqVarT3.iterator();
            while (it.hasNext()) {
                arrayList6.add(((mqc) it.next()).a());
            }
            rrbVarH.q(arrayList6);
            ohsVarJ.F(rrbVarH.l());
            this.f = true;
        }
        return yfqVarT3;
    }
}
