package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class bgz extends cwe implements cwc, cyg {
    public afeg a;
    public final bwq b;
    public final bwq c;

    public bgz(afeg afegVar) {
        this.a = afegVar;
        bxp bxpVar = bxp.c;
        this.b = new ParcelableSnapshotMutableState(null, bxpVar);
        this.c = new ParcelableSnapshotMutableState(null, bxpVar);
        W(new bgx(new bgb(this, 8)));
    }

    private final void b() {
        cjn.p(this, new beg(this, 11));
    }

    @Override // defpackage.cfx
    public final void er() {
        b();
    }

    @Override // defpackage.cyg
    public final void r() {
        b();
    }
}
