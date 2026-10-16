package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vvl extends defpackage.wag {
    public vvl(ajht ajhtVar) {
        super(ajhtVar);
    }

    private static double c(java.util.List list, int i, int i2, double d) {
        double d2 = d * ((double) i);
        int i3 = 0;
        while (i3 < list.size() && d2 > ((ajhj) list.get(i3)).c) {
            d2 -= (double) ((ajhj) list.get(i3)).c;
            i3++;
        }
        int i4 = ((ajhj) list.get(i3)).d;
        int iCM = ((ajhj) list.get(i3)).e + 1;
        if (i3 == list.size() - 1) {
            iCM = defpackage.ysr.cM(i2, iCM, i4);
        }
        return ((double) i4) + ((((double) (iCM - i4)) * d2) / ((double) ((ajhj) list.get(i3)).c));
    }

    @Override // defpackage.wag
    protected final void a(defpackage.rkq rkqVar) {
        int i;
        int i2;
        ajht ajhtVar = this.b;
        if ((ajhtVar.b & 512) != 0) {
            ajhk ajhkVar = ajhtVar.l;
            if (ajhkVar == null) {
                ajhkVar = ajhk.a;
            }
            if ((ajhkVar.b & 1) != 0) {
                rkqVar.z("JFC", java.lang.Integer.valueOf(ajhkVar.c));
            }
            if ((ajhkVar.b & 2) != 0) {
                rkqVar.z("RFC", java.lang.Integer.valueOf(ajhkVar.d));
            }
            if ((ajhkVar.b & 8) != 0) {
                rkqVar.z("MFT", java.lang.Integer.valueOf(ajhkVar.f));
            }
            if ((ajhkVar.b & 64) != 0) {
                rkqVar.z("JDM", java.lang.Integer.valueOf(ajhkVar.i));
            }
            int i3 = ajhkVar.i;
            if (i3 > 0 && (i2 = ajhkVar.d) > 0) {
                rkqVar.z("FPS", java.lang.Double.valueOf(((double) i2) / (((double) i3) / 1000.0d)));
            }
            if ((ajhkVar.b & 1) != 0 && (i = ajhkVar.d) > 0) {
                rkqVar.z("JFR", java.lang.Double.valueOf(((double) ajhkVar.c) / ((double) i)));
            }
            if (ajhkVar.d <= 0 || ajhkVar.k.size() <= 0) {
                return;
            }
            defpackage.abpj abpjVar = ajhkVar.k;
            int i4 = ajhkVar.d;
            int i5 = ajhkVar.f;
            rkqVar.z("P50FT", java.lang.Double.valueOf(c(abpjVar, i4, i5, 0.5d)));
            rkqVar.z("P95FT", java.lang.Double.valueOf(c(abpjVar, i4, i5, 0.95d)));
            rkqVar.z("P99FT", java.lang.Double.valueOf(c(abpjVar, i4, i5, 0.99d)));
        }
    }
}
