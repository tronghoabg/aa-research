package defpackage;

import android.support.v4.app.Fragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class niv implements ocp {
    public final /* synthetic */ Fragment a;
    private final /* synthetic */ int b;

    public /* synthetic */ niv(Fragment fragment, int i) {
        this.b = i;
        this.a = fragment;
    }

    @Override // defpackage.ocp
    public final void a() {
        int i = this.b;
        Fragment fragment = this.a;
        if (i != 0) {
            ((nhr) fragment).c = null;
            return;
        }
        niy niyVar = (niy) fragment;
        niyVar.o = null;
        niyVar.a().q.m(false);
    }
}
