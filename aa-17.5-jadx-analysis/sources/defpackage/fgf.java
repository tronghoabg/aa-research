package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
final class fgf extends fge {
    final /* synthetic */ yw a;
    final /* synthetic */ fgg b;

    public fgf(fgg fggVar, yw ywVar) {
        this.b = fggVar;
        this.a = ywVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fge, defpackage.ffz
    public final void b(fgc fgcVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(fgcVar);
        fgcVar.P(this);
    }
}
