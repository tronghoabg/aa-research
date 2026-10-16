package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class dbp implements dcf {
    public bwq a;
    private afdr b;
    private final bwq c = new ParcelableSnapshotMutableState(false, bxp.c);

    @Override // defpackage.dcf
    public final long a() {
        if (this.a == null) {
            afdr afdrVar = this.b;
            this.a = new ParcelableSnapshotMutableState(afdrVar != null ? afdrVar.invoke() : dbd.a, bxp.c);
            this.b = null;
        }
        bwq bwqVar = this.a;
        bwqVar.getClass();
        return ((dbd) bwqVar.a()).b;
    }

    public final void b(afdr afdrVar) {
        if (this.a == null) {
            this.b = afdrVar;
        }
    }

    public final void c(boolean z) {
        this.c.b(Boolean.valueOf(z));
    }

    @Override // defpackage.dcf
    public final boolean d() {
        return ((Boolean) this.c.a()).booleanValue();
    }
}
