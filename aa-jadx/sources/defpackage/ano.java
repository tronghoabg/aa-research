package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ano implements defpackage.aqk {
    public final defpackage.affc a;
    public final defpackage.bwx c;
    public final defpackage.bwx d;
    public final defpackage.bwx e;
    public final defpackage.apw b = new defpackage.ann(this);
    public final defpackage.bil f = new defpackage.bil((byte[]) null, (char[]) null);

    public ano(defpackage.affc affcVar) {
        this.a = affcVar;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
    }

    @Override // defpackage.aqk
    public final float a(float f) {
        return ((java.lang.Number) this.a.invoke(java.lang.Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.aqk
    public final java.lang.Object e(defpackage.akv akvVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        java.lang.Object objA = defpackage.ahoi.a(new defpackage.ait(this, akvVar, affgVar, (defpackage.afdk) null, 6), afdkVar);
        return objA == defpackage.afdr.a ? objA : defpackage.afbk.a;
    }

    @Override // defpackage.aqk
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // defpackage.aqk
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.aqk
    public final boolean i() {
        return ((java.lang.Boolean) this.c.a()).booleanValue();
    }
}
