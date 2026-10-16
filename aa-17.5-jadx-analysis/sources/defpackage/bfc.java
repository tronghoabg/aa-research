package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
final class bfc {
    public dlg a;
    public dfw b;
    public final bwq c = new ParcelableSnapshotMutableState(true, bxp.c);
    public long d = 0;
    public wci e;
    private dlr f;
    private Object g;

    public bfc(dlr dlrVar, dlg dlgVar, wci wciVar, dfw dfwVar, Object obj) {
        this.f = dlrVar;
        this.a = dlgVar;
        this.e = wciVar;
        this.b = dfwVar;
        this.g = obj;
    }

    public static /* synthetic */ void c(bfc bfcVar, dlr dlrVar, dlg dlgVar, dfw dfwVar, int i) {
        if ((i & 1) != 0) {
            dlrVar = bfcVar.f;
        }
        if ((i & 2) != 0) {
            dlgVar = bfcVar.a;
        }
        wci wciVar = (i & 4) != 0 ? bfcVar.e : null;
        if ((i & 8) != 0) {
            dfwVar = bfcVar.b;
        }
        Object obj = bfcVar.g;
        if (dlrVar == bfcVar.f && affa.f(dlgVar, bfcVar.a) && affa.f(wciVar, bfcVar.e) && affa.f(dfwVar, bfcVar.b)) {
            bfcVar.b(obj);
            return;
        }
        bfcVar.f = dlrVar;
        bfcVar.a = dlgVar;
        bfcVar.e = wciVar;
        bfcVar.b = dfwVar;
        bfcVar.a(true);
    }

    public final void a(boolean z) {
        this.c.b(Boolean.valueOf(z));
    }

    public final void b(Object obj) {
        if (affa.f(obj, this.g)) {
            return;
        }
        this.g = obj;
        a(true);
    }
}
