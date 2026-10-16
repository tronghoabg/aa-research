package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class atg implements defpackage.ath {
    private final /* synthetic */ int a;

    public atg(int i) {
        this.a = i;
    }

    @Override // defpackage.ath
    public final /* synthetic */ float a() {
        return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.ath
    public final void c(defpackage.dlo dloVar, int i, int[] iArr, int[] iArr2) {
        if (this.a != 0) {
            defpackage.ati.c(i, iArr, iArr2, false);
        } else {
            defpackage.ati.b(iArr, iArr2, false);
        }
    }

    public final java.lang.String toString() {
        return this.a != 0 ? "Arrangement#Bottom" : "Arrangement#Top";
    }
}
