package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
final class wud extends emn {
    private final int a;

    public wud(int i) {
        this.a = i;
    }

    @Override // defpackage.emn
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = wue.B;
        float[] fArr = ((wue) obj).z;
        return fArr != null ? fArr[this.a] : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.emn
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        wue wueVar = (wue) obj;
        int i = wue.B;
        float[] fArr = wueVar.z;
        if (fArr != null) {
            int i2 = this.a;
            if (fArr[i2] != f) {
                fArr[i2] = f;
                ykd ykdVar = wueVar.A;
                if (ykdVar != null) {
                    float fU = wueVar.u() * 0.11f;
                    MaterialButton materialButton = (MaterialButton) ykdVar.a;
                    int i3 = (int) fU;
                    if (materialButton.k != i3) {
                        materialButton.k = i3;
                        materialButton.o();
                        materialButton.invalidate();
                    }
                }
                wueVar.invalidateSelf();
            }
        }
    }
}
