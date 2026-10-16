package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abq implements defpackage.cuu {
    public final defpackage.bwx a;
    public final defpackage.bwx b;

    public abq(boolean z) {
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(boolValueOf, bxvVar);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, bxvVar);
    }

    @Override // defpackage.cgf
    public final /* synthetic */ defpackage.cgf a(defpackage.cgf cgfVar) {
        return defpackage.bzo.l(this, cgfVar);
    }

    @Override // defpackage.cgf
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj, defpackage.affg affgVar) {
        return affgVar.invoke(obj, this);
    }

    @Override // defpackage.cgf
    public final /* synthetic */ boolean c(defpackage.affc affcVar) {
        return ((java.lang.Boolean) affcVar.invoke(this)).booleanValue();
    }

    @Override // defpackage.cuu
    public final java.lang.Object d() {
        return this;
    }
}
