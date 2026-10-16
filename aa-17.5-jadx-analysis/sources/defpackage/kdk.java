package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.auto.components.apphost.view.widgets.common.GridRowContainerView;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class kdk extends lt implements oxi {
    private static final yph f = yph.c("CarApp.H.Tem");
    public List a;
    public geu e;
    private final Context g;

    public kdk(Context context, List list) {
        this.g = context;
        this.a = list;
    }

    @Override // defpackage.lt
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.lt
    public final int d(int i) {
        return 1;
    }

    @Override // defpackage.lt
    public final mo f(ViewGroup viewGroup, int i) {
        if (i != 1) {
            ((ype) ((ype) f.g()).ai((char) 2932)).w("Invalid view type creating view holder: %d", i);
        }
        return new mo(LayoutInflater.from(this.g).inflate(R.layout.grid_row_container_view, viewGroup, false));
    }

    @Override // defpackage.lt
    public final void n(mo moVar, int i) {
        int i2 = moVar.f;
        if (i2 == 1) {
            ((GridRowContainerView) moVar.a).c(this.e, this.a, i);
        } else {
            ((ype) ((ype) f.g()).ai((char) 2931)).w("Invalid view type binding view holder: %d", i2);
        }
    }

    @Override // defpackage.oxi
    public final void b(int i) {
    }
}
