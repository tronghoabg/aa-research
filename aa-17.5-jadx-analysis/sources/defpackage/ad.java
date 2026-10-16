package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public class ad {
    public final cp a;

    public ad(cp cpVar) {
        this.a = cpVar;
    }

    public final boolean b() {
        cp cpVar = this.a;
        View view = cpVar.a.mView;
        int iJ = view != null ? ca.j(view) : 0;
        int i = cpVar.h;
        if (iJ != i) {
            return (iJ == 2 || i == 2) ? false : true;
        }
        return true;
    }
}
