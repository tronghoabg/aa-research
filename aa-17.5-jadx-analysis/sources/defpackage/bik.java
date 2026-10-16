package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class bik extends cfx implements cwc, cwl, cwd {
    public bim a;
    public bed b;
    public blr c;
    public final bwq d = new ParcelableSnapshotMutableState(null, bxp.c);

    public bik(bim bimVar, bed bedVar, blr blrVar) {
        this.a = bimVar;
        this.b = bedVar;
        this.c = blrVar;
    }

    public final sm b() {
        return (sm) bzi.x(this, dbc.k);
    }

    @Override // defpackage.cfx
    public final void er() {
        this.a.k(this);
    }

    @Override // defpackage.cwl
    public final void es(cst cstVar) {
        this.d.b(cstVar);
    }

    @Override // defpackage.cfx
    public final void q() {
        this.a.l(this);
    }
}
