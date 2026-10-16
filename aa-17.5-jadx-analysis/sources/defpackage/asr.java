package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class asr implements awo {
    private final int a;
    private final String b;
    private final bwq c;
    private final bwq d;

    public asr(int i, String str) {
        this.a = i;
        this.b = str;
        dve dveVar = dve.a;
        bxp bxpVar = bxp.c;
        this.c = new ParcelableSnapshotMutableState(dveVar, bxpVar);
        this.d = new ParcelableSnapshotMutableState(true, bxpVar);
    }

    @Override // defpackage.awo
    public final int a(dlg dlgVar) {
        return e().e;
    }

    @Override // defpackage.awo
    public final int b(dlg dlgVar, dlr dlrVar) {
        return e().b;
    }

    @Override // defpackage.awo
    public final int c(dlg dlgVar, dlr dlrVar) {
        return e().d;
    }

    @Override // defpackage.awo
    public final int d(dlg dlgVar) {
        return e().c;
    }

    public final dve e() {
        return (dve) this.c.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof asr) && this.a == ((asr) obj).a;
    }

    public final void f(boolean z) {
        this.d.b(Boolean.valueOf(z));
    }

    public final void g(ecy ecyVar) {
        int i = this.a;
        this.c.b(ecyVar.f(i));
        f(ecyVar.z(i));
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + "(" + e().b + ", " + e().c + ", " + e().d + ", " + e().e + ")";
    }
}
