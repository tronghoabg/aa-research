package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class idb implements ida {
    final icz a;
    private final Context b;

    public idb(Context context, icz iczVar) {
        this.b = context.getApplicationContext();
        this.a = iczVar;
    }

    @Override // defpackage.idh
    public final void k() {
        ids.a(this.b).b(this.a);
    }

    @Override // defpackage.idh
    public final void l() {
        ids.a(this.b).c(this.a);
    }

    @Override // defpackage.idh
    public final void j() {
    }
}
