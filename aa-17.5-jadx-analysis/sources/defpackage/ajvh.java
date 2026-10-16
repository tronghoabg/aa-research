package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class ajvh implements ajqi {
    protected ajqh a;

    @Override // defpackage.ajpy
    public void d(ajoy ajoyVar) throws ajqm {
        akbh akbhVar;
        int i;
        ahgm.e(ajoyVar, "Header");
        String strB = ajoyVar.b();
        if (strB.equalsIgnoreCase("WWW-Authenticate")) {
            this.a = ajqh.a;
        } else {
            if (!strB.equalsIgnoreCase("Proxy-Authenticate")) {
                throw new ajqm("Unexpected header name: ".concat(strB));
            }
            this.a = ajqh.b;
        }
        if (ajoyVar instanceof akak) {
            akak akakVar = (akak) ajoyVar;
            akbhVar = akakVar.a;
            i = akakVar.b;
        } else {
            String strC = ajoyVar.c();
            if (strC == null) {
                throw new ajqm("Header value is null");
            }
            akbhVar = new akbh(strC.length());
            akbhVar.f(strC);
            i = 0;
        }
        while (i < akbhVar.b && akaz.a(akbhVar.charAt(i))) {
            i++;
        }
        int i2 = i;
        while (i2 < akbhVar.b && !akaz.a(akbhVar.charAt(i2))) {
            i2++;
        }
        String strC2 = akbhVar.c(i, i2);
        if (!strC2.equalsIgnoreCase(b())) {
            throw new ajqm("Invalid scheme identifier: ".concat(strC2));
        }
        h(akbhVar, i2, akbhVar.b);
    }

    @Override // defpackage.ajqi
    public ajoy g(ajqj ajqjVar, ajph ajphVar, akba akbaVar) throws ajqf {
        return c(ajqjVar, ajphVar);
    }

    protected abstract void h(akbh akbhVar, int i, int i2) throws ajqm;

    public final boolean i() {
        ajqh ajqhVar = this.a;
        return ajqhVar != null && ajqhVar == ajqh.b;
    }

    public String toString() {
        return b().toUpperCase(Locale.ROOT);
    }
}
