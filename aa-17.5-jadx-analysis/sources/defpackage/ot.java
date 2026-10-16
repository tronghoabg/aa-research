package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class ot {
    private static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(ob obVar, afeg afegVar) {
        View childAt = ((ViewGroup) obVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        daw dawVar = childAt instanceof daw ? (daw) childAt : null;
        if (dawVar != null) {
            dawVar.fq(null);
            dawVar.a(afegVar);
            return;
        }
        daw dawVar2 = new daw(obVar);
        dawVar2.fq(null);
        dawVar2.a(afegVar);
        View decorView = obVar.getWindow().getDecorView();
        if (ecw.d(decorView) == null) {
            ecw.e(decorView, obVar);
        }
        if (eee.j(decorView) == null) {
            eee.k(decorView, obVar);
        }
        if (ebi.j(decorView) == null) {
            ebi.k(decorView, obVar);
        }
        obVar.setContentView(dawVar2, a);
    }
}
