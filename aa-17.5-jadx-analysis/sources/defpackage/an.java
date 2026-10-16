package defpackage;

import android.app.Dialog;
import android.view.View;

/* loaded from: classes.dex */
final class an extends be {
    final /* synthetic */ be a;
    final /* synthetic */ ao b;

    public an(ao aoVar, be beVar) {
        this.b = aoVar;
        this.a = beVar;
    }

    @Override // defpackage.be
    public final View a(int i) {
        be beVar = this.a;
        if (beVar.b()) {
            return beVar.a(i);
        }
        Dialog dialog = this.b.e;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.be
    public final boolean b() {
        return this.a.b() || this.b.f;
    }
}
