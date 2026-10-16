package defpackage;

import com.google.android.apps.auto.sdk.ui.CarLayoutManager;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class owy extends mu {
    public final CarLayoutManager i;
    private final ajmd j = new ajmd(this, null);

    public owy(CarLayoutManager carLayoutManager) {
        this.i = carLayoutManager;
    }

    @Override // defpackage.mu
    public final boolean r(mo moVar, mo moVar2, int i, int i2, int i3, int i4) {
        float alpha = moVar2 != null ? moVar2.a.getAlpha() : BitmapDescriptorFactory.HUE_RED;
        boolean zR = super.r(moVar, moVar2, i, i2, i3, i4);
        if (moVar2 != moVar && moVar2 != null) {
            moVar2.a.setAlpha(alpha);
        }
        return zR;
    }

    @Override // defpackage.mu
    public final void u() {
        o(this.j);
    }
}
