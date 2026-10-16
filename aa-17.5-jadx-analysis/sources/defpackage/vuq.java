package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class vuq extends vzk {
    public vuq(ajgu ajguVar) {
        super(ajguVar);
    }

    private static double c(List list, int i, int i2, double d) {
        double d2 = d * i;
        int i3 = 0;
        while (i3 < list.size() && d2 > ((ajgk) list.get(i3)).c) {
            d2 -= ((ajgk) list.get(i3)).c;
            i3++;
        }
        int i4 = ((ajgk) list.get(i3)).d;
        int iAu = ((ajgk) list.get(i3)).e + 1;
        if (i3 == list.size() - 1) {
            iAu = wub.au(i2, iAu, i4);
        }
        return i4 + (((iAu - i4) * d2) / ((ajgk) list.get(i3)).c);
    }

    @Override // defpackage.vzk
    protected final void a(rju rjuVar) {
        int i;
        int i2;
        ajgu ajguVar = this.b;
        if ((ajguVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
            ajgl ajglVar = ajguVar.l;
            if (ajglVar == null) {
                ajglVar = ajgl.a;
            }
            if ((ajglVar.b & 1) != 0) {
                rjuVar.z("JFC", Integer.valueOf(ajglVar.c));
            }
            if ((ajglVar.b & 2) != 0) {
                rjuVar.z("RFC", Integer.valueOf(ajglVar.d));
            }
            if ((ajglVar.b & 8) != 0) {
                rjuVar.z("MFT", Integer.valueOf(ajglVar.f));
            }
            if ((ajglVar.b & 64) != 0) {
                rjuVar.z("JDM", Integer.valueOf(ajglVar.i));
            }
            int i3 = ajglVar.i;
            if (i3 > 0 && (i2 = ajglVar.d) > 0) {
                rjuVar.z("FPS", Double.valueOf(i2 / (i3 / 1000.0d)));
            }
            if ((ajglVar.b & 1) != 0 && (i = ajglVar.d) > 0) {
                rjuVar.z("JFR", Double.valueOf(ajglVar.c / i));
            }
            if (ajglVar.d <= 0 || ajglVar.k.size() <= 0) {
                return;
            }
            aboh abohVar = ajglVar.k;
            int i4 = ajglVar.d;
            int i5 = ajglVar.f;
            rjuVar.z("P50FT", Double.valueOf(c(abohVar, i4, i5, 0.5d)));
            rjuVar.z("P95FT", Double.valueOf(c(abohVar, i4, i5, 0.95d)));
            rjuVar.z("P99FT", Double.valueOf(c(abohVar, i4, i5, 0.99d)));
        }
    }
}
