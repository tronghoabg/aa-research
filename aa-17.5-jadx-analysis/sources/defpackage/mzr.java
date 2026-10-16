package defpackage;

import android.support.v4.app.Fragment;

/* loaded from: classes2.dex */
public final class mzr implements afgl {
    final /* synthetic */ Fragment a;
    private final /* synthetic */ int b;

    public mzr(Fragment fragment, int i) {
        this.b = i;
        this.a = fragment;
    }

    @Override // defpackage.afgl
    public final /* synthetic */ Object getValue(Object obj, afia afiaVar) {
        int i = this.b;
        if (i == 0) {
            return tec.b(this.a, mzi.class);
        }
        if (i == 1) {
            return tec.b(this.a, mzi.class);
        }
        if (i == 2) {
            return tec.b(this.a, mzi.class);
        }
        if (i == 3) {
            return tec.b(this.a, noh.class);
        }
        if (i == 4) {
            return tec.b(this.a, nwm.class);
        }
        if (i != 5) {
            return tec.b(this.a, nzh.class);
        }
        return tec.b(this.a, nxp.class);
    }
}
