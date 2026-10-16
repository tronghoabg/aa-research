package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class alm implements ckv {
    private final /* synthetic */ int c;
    public static final alm b = new alm(1);
    public static final alm a = new alm(0);

    private alm(int i) {
        this.c = i;
    }

    @Override // defpackage.ckv
    public final ckm a(long j, dlr dlrVar, dlg dlgVar) {
        if (this.c == 0) {
            float fEF = dlgVar.eF(30.0f);
            return new ckk(new cjb(-fEF, BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (j >> 32)) + fEF, Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        float fEF2 = dlgVar.eF(30.0f);
        return new ckk(new cjb(BitmapDescriptorFactory.HUE_RED, -fEF2, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fEF2));
    }
}
