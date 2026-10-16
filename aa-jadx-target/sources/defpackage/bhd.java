package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bhd extends defpackage.cwo implements defpackage.cwm, defpackage.cyp {
    public defpackage.affg a;
    public final defpackage.bwx b;
    public final defpackage.bwx c;

    public bhd(defpackage.affg affgVar) {
        this.a = affgVar;
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, bxvVar);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, bxvVar);
        W(new defpackage.bhb(new defpackage.bge(this, 7)));
    }

    private final void b() {
        defpackage.dai.z(this, new defpackage.bfd(this, 8));
    }

    @Override // defpackage.cge
    public final void dz() {
        b();
    }

    @Override // defpackage.cyp
    public final void r() {
        b();
    }
}
