package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class atb implements atc {
    private final /* synthetic */ int a;

    public atb(int i) {
        this.a = i;
    }

    @Override // defpackage.atc
    public final /* synthetic */ float a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.atc
    public final void c(dlg dlgVar, int i, int[] iArr, int[] iArr2) {
        if (this.a != 0) {
            atd.c(i, iArr, iArr2, false);
        } else {
            atd.b(iArr, iArr2, false);
        }
    }

    public final String toString() {
        return this.a != 0 ? "Arrangement#Bottom" : "Arrangement#Top";
    }
}
