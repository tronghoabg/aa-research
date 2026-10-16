package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class btc implements awo {
    public final bwq a;

    public btc(awo awoVar) {
        this.a = new ParcelableSnapshotMutableState(awoVar, bxp.c);
    }

    @Override // defpackage.awo
    public final int a(dlg dlgVar) {
        return e().a(dlgVar);
    }

    @Override // defpackage.awo
    public final int b(dlg dlgVar, dlr dlrVar) {
        return e().b(dlgVar, dlrVar);
    }

    @Override // defpackage.awo
    public final int c(dlg dlgVar, dlr dlrVar) {
        return e().c(dlgVar, dlrVar);
    }

    @Override // defpackage.awo
    public final int d(dlg dlgVar) {
        return e().d(dlgVar);
    }

    public final awo e() {
        return (awo) this.a.a();
    }

    public btc() {
        this(new aue());
    }
}
