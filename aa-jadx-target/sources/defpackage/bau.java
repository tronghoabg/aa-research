package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bau extends defpackage.bby {
    public static final defpackage.cdz b = defpackage.bxi.k(new defpackage.abw(6), new defpackage.awl(9));
    public final defpackage.bwx a;

    public bau(int i, float f, defpackage.afer aferVar) {
        super(i, f);
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(aferVar, defpackage.bxv.c);
    }

    @Override // defpackage.bby
    public final int b() {
        return ((java.lang.Number) ((defpackage.afer) this.a.a()).invoke()).intValue();
    }
}
