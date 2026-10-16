package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class anj implements aqf {
    public final afec a;
    public final bwq c;
    public final bwq d;
    public final bwq e;
    public final apr b = new ani(this);
    public final bii f = new bii((byte[]) null, (char[]) null);

    public anj(afec afecVar) {
        this.a = afecVar;
        bxp bxpVar = bxp.c;
        this.c = new ParcelableSnapshotMutableState(false, bxpVar);
        this.d = new ParcelableSnapshotMutableState(false, bxpVar);
        this.e = new ParcelableSnapshotMutableState(false, bxpVar);
    }

    @Override // defpackage.aqf
    public final float a(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.aqf
    public final Object e(akq akqVar, afeg afegVar, afck afckVar) {
        Object objA = ahni.a(new aio(this, akqVar, afegVar, (afck) null, 6), afckVar);
        return objA == afcr.a ? objA : afak.a;
    }

    @Override // defpackage.aqf
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // defpackage.aqf
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.aqf
    public final boolean i() {
        return ((Boolean) this.c.a()).booleanValue();
    }
}
