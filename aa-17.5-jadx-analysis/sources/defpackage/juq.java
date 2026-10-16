package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.car.control.CarAreaId;
import com.google.android.gms.car.control.CarProperty;

/* loaded from: classes2.dex */
public final class juq {
    /* JADX WARN: Removed duplicated region for block: B:116:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.gde r35, defpackage.cfy r36, defpackage.cil r37, defpackage.cil r38, defpackage.bux r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.juq.a(gde, cfy, cil, cil, bux, int, int):void");
    }

    public static final void b(qrq qrqVar, afeg afegVar) {
        View childAt = ((ViewGroup) qrqVar.C().getDecorView().findViewById(R.id.content)).getChildAt(0);
        daw dawVar = childAt instanceof daw ? (daw) childAt : null;
        if (dawVar != null) {
            dawVar.fq(null);
            dawVar.a(afegVar);
            return;
        }
        kmf kmfVar = new kmf(qrqVar);
        kmfVar.fq(null);
        kmfVar.a(afegVar);
        View decorView = qrqVar.C().getDecorView();
        decorView.getClass();
        if (ecw.d(decorView) == null) {
            ecw.e(decorView, qrqVar);
        }
        if (eee.j(decorView) == null) {
            eee.k(decorView, qrqVar);
        }
        if (ebi.j(decorView) == null) {
            ebi.k(decorView, qrqVar);
        }
        qrqVar.w(kmfVar);
    }

    public static final CarProperty c(klq klqVar) {
        klqVar.getClass();
        kll kllVar = klqVar.b;
        return new CarProperty(klqVar.a, new CarAreaId(kllVar.a(), kllVar.b()));
    }

    public static final boolean d(klq klqVar, CarProperty carProperty) {
        if (carProperty.a == klqVar.a) {
            return carProperty.b.a == klqVar.b.a();
        }
        return false;
    }

    private static final String e(bym bymVar) {
        return (String) bymVar.a();
    }
}
