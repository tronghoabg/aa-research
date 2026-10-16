package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class awl implements awo {
    private final String a;
    private final bwq b;

    public awl(auy auyVar, String str) {
        this.a = str;
        this.b = new ParcelableSnapshotMutableState(auyVar, bxp.c);
    }

    @Override // defpackage.awo
    public final int a(dlg dlgVar) {
        return e().d;
    }

    @Override // defpackage.awo
    public final int b(dlg dlgVar, dlr dlrVar) {
        return e().a;
    }

    @Override // defpackage.awo
    public final int c(dlg dlgVar, dlr dlrVar) {
        return e().c;
    }

    @Override // defpackage.awo
    public final int d(dlg dlgVar) {
        return e().b;
    }

    public final auy e() {
        return (auy) this.b.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awl) {
            return affa.f(e(), ((awl) obj).e());
        }
        return false;
    }

    public final void f(auy auyVar) {
        this.b.b(auyVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ")";
    }
}
