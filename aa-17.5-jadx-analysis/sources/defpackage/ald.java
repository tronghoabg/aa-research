package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* loaded from: classes.dex */
public final class ald implements ala {
    private final /* synthetic */ int c;
    public static final ald b = new ald(1);
    public static final ald a = new ald(0);

    private ald(int i) {
        this.c = i;
    }

    @Override // defpackage.ala
    public final boolean a() {
        return this.c == 0;
    }

    @Override // defpackage.ala
    public final /* synthetic */ alb b(View view, boolean z, long j, float f, float f2, boolean z2, dlg dlgVar, float f3) {
        if (this.c != 0) {
            return new alb(new Magnifier(view));
        }
        if (z) {
            return new alc(new Magnifier(view));
        }
        long jEH = dlgVar.eH(j);
        float fEA = dlgVar.eA(f);
        float fEA2 = dlgVar.eA(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jEH != 9205357640488583168L) {
            builder.setSize(afgi.k(Float.intBitsToFloat((int) (jEH >> 32))), afgi.k(Float.intBitsToFloat((int) (jEH & 4294967295L))));
        }
        if (!Float.isNaN(fEA)) {
            builder.setCornerRadius(fEA);
        }
        if (!Float.isNaN(fEA2)) {
            builder.setElevation(fEA2);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new alc(builder.build());
    }
}
