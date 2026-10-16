package defpackage;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class hgg {
    public static final hgg a = new hgg();

    public static final hga a(geu geuVar, gzc gzcVar) {
        affv affvVar = new affv();
        affv affvVar2 = new affv();
        hgb hgbVar = new hgb(new hgf(affvVar, geuVar, affvVar2, 1), new hgf(affvVar2, geuVar, affvVar, 0));
        ges gesVarH = geuVar.h();
        gesVarH.getClass();
        ezb ezbVar = new ezb((Object) gesVarH, 4, (int[]) null);
        ges gesVarH2 = geuVar.h();
        gesVarH2.getClass();
        ezb ezbVar2 = new ezb(gesVarH2, 5, (boolean[]) null);
        ges gesVarH3 = geuVar.h();
        gesVarH3.getClass();
        dwx dwxVar = new dwx(gesVarH3, 4, (int[]) null);
        ges gesVarH4 = geuVar.h();
        gesVarH4.getClass();
        return new hga(ezbVar2, new ezb(gesVarH4, 6, (float[]) null), dwxVar, ezbVar, hgbVar.a, hgbVar.b, new fwc(geuVar, gzcVar, 19, null));
    }

    public static final void b(geu geuVar, Rect rect, Rect rect2) {
        if (rect == null || rect2 == null) {
            return;
        }
        geuVar.C().g(rect, rect2);
    }

    public static final hga c(geu geuVar, gzc gzcVar) {
        gzcVar.getClass();
        if (!((ggk) geuVar.F(ggk.class)).j()) {
            return a(geuVar, gzcVar);
        }
        hgh hghVar = (hgh) geuVar.F(hgh.class);
        hga hgaVar = hghVar.c;
        if (hgaVar != null && hghVar.b == gzcVar) {
            return hgaVar;
        }
        hga hgaVarA = a(hghVar.a, gzcVar);
        hghVar.c = hgaVarA;
        hghVar.b = gzcVar;
        return hgaVarA;
    }
}
