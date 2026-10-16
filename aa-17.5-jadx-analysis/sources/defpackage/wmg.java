package defpackage;

import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class wmg extends ebx {
    private final View a;
    private int b;
    private int c;
    private final int[] d;

    public wmg(View view) {
        super(0);
        this.d = new int[2];
        this.a = view;
    }

    @Override // defpackage.ebx
    public final ecy b(ecy ecyVar, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((lds) it.next()).T() & 8) != 0) {
                this.a.setTranslationY(wkn.b(this.c, 0, r0.S()));
                break;
            }
        }
        return ecyVar;
    }

    @Override // defpackage.ebx
    public final ebw c(lds ldsVar, ebw ebwVar) {
        View view = this.a;
        int[] iArr = this.d;
        view.getLocationOnScreen(iArr);
        int i = this.b - iArr[1];
        this.c = i;
        view.setTranslationY(i);
        return ebwVar;
    }

    @Override // defpackage.ebx
    public final void d(lds ldsVar) {
        this.a.setTranslationY(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.ebx
    public final void e(lds ldsVar) {
        View view = this.a;
        int[] iArr = this.d;
        view.getLocationOnScreen(iArr);
        this.b = iArr[1];
    }
}
