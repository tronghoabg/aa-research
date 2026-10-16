package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class asu implements asw {
    private final /* synthetic */ int a;

    public asu(int i) {
        this.a = i;
    }

    @Override // defpackage.asw
    public final /* synthetic */ float a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.asw
    public final void b(dlg dlgVar, int i, int[] iArr, dlr dlrVar, int[] iArr2) {
        int i2 = this.a;
        if (i2 == 0) {
            atd.c(i, iArr, iArr2, false);
            return;
        }
        if (i2 == 1) {
            atd.b(iArr, iArr2, false);
            return;
        }
        if (i2 != 2) {
            if (dlrVar == dlr.a) {
                atd.b(iArr, iArr2, false);
                return;
            } else {
                atd.c(i, iArr, iArr2, true);
                return;
            }
        }
        if (dlrVar == dlr.a) {
            atd.c(i, iArr, iArr2, false);
        } else {
            atd.b(iArr, iArr2, true);
        }
    }

    public final String toString() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? "Arrangement#Start" : "Arrangement#End" : "AbsoluteArrangement#Left" : "AbsoluteArrangement#Right";
    }
}
