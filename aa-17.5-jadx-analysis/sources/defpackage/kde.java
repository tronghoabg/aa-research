package defpackage;

import androidx.car.app.model.Action;

/* loaded from: classes2.dex */
final class kde {
    final Action a;
    final int b;
    final int c;
    boolean d = false;
    boolean e = false;
    final /* synthetic */ kdf f;

    public kde(kdf kdfVar, geu geuVar, Action action, int i, boolean z) {
        this.f = kdfVar;
        this.a = action;
        this.b = i;
        this.c = z ? gbt.k(geuVar, action.getBackgroundColor(), false, -1, ghv.a, 0) : -1;
    }
}
