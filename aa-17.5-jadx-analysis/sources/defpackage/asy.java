package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class asy implements asx {
    private final /* synthetic */ int a;

    public asy(int i) {
        this.a = i;
    }

    @Override // defpackage.asw
    public final float a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.asw
    public final void b(dlg dlgVar, int i, int[] iArr, dlr dlrVar, int[] iArr2) {
        int i2 = this.a;
        if (i2 == 0) {
            if (dlrVar == dlr.a) {
                atd.d(i, iArr, iArr2, false);
                return;
            } else {
                atd.d(i, iArr, iArr2, true);
                return;
            }
        }
        if (i2 == 1) {
            if (dlrVar == dlr.a) {
                atd.a(i, iArr, iArr2, false);
                return;
            } else {
                atd.a(i, iArr, iArr2, true);
                return;
            }
        }
        if (i2 != 2) {
            if (dlrVar == dlr.a) {
                atd.f(i, iArr, iArr2, false);
                return;
            } else {
                atd.f(i, iArr, iArr2, true);
                return;
            }
        }
        if (dlrVar == dlr.a) {
            atd.e(i, iArr, iArr2, false);
        } else {
            atd.e(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.atc
    public final void c(dlg dlgVar, int i, int[] iArr, int[] iArr2) {
        int i2 = this.a;
        if (i2 == 0) {
            atd.d(i, iArr, iArr2, false);
            return;
        }
        if (i2 == 1) {
            atd.a(i, iArr, iArr2, false);
        } else if (i2 != 2) {
            atd.f(i, iArr, iArr2, false);
        } else {
            atd.e(i, iArr, iArr2, false);
        }
    }

    public final String toString() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? "Arrangement#SpaceEvenly" : "Arrangement#SpaceBetween" : "Arrangement#Center" : "Arrangement#SpaceAround";
    }
}
