package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class fsk {
    public final long a;
    public final long b;
    public final boolean c;
    public final ajhv d;
    private final aezr e;
    private final aezr f;

    public fsk(ajna ajnaVar) throws NumberFormatException {
        this.e = woy.dH(3, new flm(this, 13));
        this.f = woy.dH(3, new flm(this, 14));
        ajnw ajnwVar = (ajnw) ajnaVar;
        this.a = Long.parseLong(ajnwVar.p(Long.MAX_VALUE));
        this.b = Long.parseLong(ajnwVar.p(Long.MAX_VALUE));
        this.c = Integer.parseInt(ajnwVar.p(Long.MAX_VALUE)) > 0;
        int i = Integer.parseInt(ajnwVar.p(Long.MAX_VALUE));
        erb erbVar = new erb((byte[]) null, (short[]) null);
        for (int i2 = 0; i2 < i; i2++) {
            String strP = ajnwVar.p(Long.MAX_VALUE);
            int iD = afyh.D(strP, ':', 0);
            if (iD == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strP));
            }
            String strSubstring = strP.substring(0, iD);
            strSubstring.getClass();
            String string = afyh.k(strSubstring).toString();
            String strSubstring2 = strP.substring(iD + 1);
            strSubstring2.getClass();
            erbVar.ab(string, strSubstring2);
        }
        this.d = ahdw.k(erbVar);
    }

    public final ajhg a() {
        return (ajhg) this.e.a();
    }

    public final ajhz b() {
        return (ajhz) this.f.a();
    }

    public final void c(ajmz ajmzVar) throws IOException {
        ajmzVar.Y(this.a);
        ajmzVar.W(10);
        ajmzVar.Y(this.b);
        ajmzVar.W(10);
        ajmzVar.Y(true != this.c ? 0L : 1L);
        ajmzVar.W(10);
        ajhv ajhvVar = this.d;
        ajmzVar.Y(ajhvVar.a());
        ajmzVar.W(10);
        int iA = ajhvVar.a();
        for (int i = 0; i < iA; i++) {
            ajmzVar.Z(ahdw.b(ajhvVar, i));
            ajmzVar.Z(": ");
            ajmzVar.Z(ahdw.c(ajhvVar, i));
            ajmzVar.W(10);
        }
    }

    public fsk(ajif ajifVar) {
        ajifVar.getClass();
        this.e = woy.dH(3, new flm(this, 13));
        this.f = woy.dH(3, new flm(this, 14));
        this.a = ajifVar.k;
        this.b = ajifVar.l;
        this.c = ajifVar.e != null;
        this.d = ajifVar.f;
    }
}
