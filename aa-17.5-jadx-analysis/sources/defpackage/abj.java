package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class abj implements cul {
    public final bwq a;
    public final bwq b;

    public abj(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        bxp bxpVar = bxp.c;
        this.a = new ParcelableSnapshotMutableState(boolValueOf, bxpVar);
        this.b = new ParcelableSnapshotMutableState(false, bxpVar);
    }

    @Override // defpackage.cfy
    public final /* synthetic */ cfy a(cfy cfyVar) {
        return czz.ac(this, cfyVar);
    }

    @Override // defpackage.cfy
    public final /* synthetic */ Object b(Object obj, afeg afegVar) {
        return afegVar.invoke(obj, this);
    }

    @Override // defpackage.cfy
    public final /* synthetic */ boolean c(afec afecVar) {
        return ((Boolean) afecVar.invoke(this)).booleanValue();
    }

    @Override // defpackage.cul
    public final Object d() {
        return this;
    }
}
