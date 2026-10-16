package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class cvu extends cvr {
    private final bwq a = new ParcelableSnapshotMutableState(null, bxp.c);
    private final bzi b;

    public cvu(bzi bziVar) {
        this.b = bziVar;
    }

    @Override // defpackage.cvr
    public final Object a(bzi bziVar) {
        if (bziVar != this.b) {
            crt.c("Check failed.");
        }
        Object objA = this.a.a();
        if (objA == null) {
            return null;
        }
        return objA;
    }

    @Override // defpackage.cvr
    public final void b(bzi bziVar, Object obj) {
        if (bziVar != this.b) {
            crt.c("Check failed.");
        }
        this.a.b(obj);
    }

    @Override // defpackage.cvr
    public final boolean c(bzi bziVar) {
        return bziVar == this.b;
    }
}
