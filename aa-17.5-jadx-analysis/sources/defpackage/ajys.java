package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ajys extends ajya {
    /* JADX WARN: Illegal instructions before constructor call */
    public ajys(String[] strArr) {
        ajuh[] ajuhVarArr = new ajuh[5];
        ajuhVarArr[0] = new ajyg();
        ajuhVarArr[1] = new ajyq();
        ajuhVarArr[2] = new ajyh();
        ajuhVarArr[3] = new ajyf(1);
        ajuhVarArr[4] = new ajye(strArr != null ? (String[]) strArr.clone() : new String[]{"EEE, dd-MMM-yy HH:mm:ss z"});
        super(ajuhVarArr);
    }

    @Override // defpackage.ajuo
    public final int a() {
        return 0;
    }

    @Override // defpackage.ajuo
    public final List b(List list) {
        ahgm.c(list, "List of cookies");
        akbh akbhVar = new akbh(list.size() * 20);
        akbhVar.f("Cookie");
        akbhVar.f(": ");
        for (int i = 0; i < list.size(); i++) {
            ajui ajuiVar = (ajui) list.get(i);
            if (i > 0) {
                akbhVar.f("; ");
            }
            akbhVar.f(ajuiVar.c());
            String strE = ajuiVar.e();
            if (strE != null) {
                akbhVar.f("=");
                akbhVar.f(strE);
            }
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new akak(akbhVar));
        return arrayList;
    }

    @Override // defpackage.ajuo
    public final List c(ajoy ajoyVar, ajul ajulVar) throws ajut {
        akbh akbhVar;
        akao akaoVar;
        ahgm.e(ajoyVar, "Header");
        if (!ajoyVar.b().equalsIgnoreCase("Set-Cookie")) {
            throw new ajut(a.bW(ajoyVar, "Unrecognized cookie header '", "'"));
        }
        boolean z = ajoyVar instanceof akak;
        ajyr ajyrVar = ajyr.a;
        if (z) {
            akak akakVar = (akak) ajoyVar;
            akbhVar = akakVar.a;
            akaoVar = new akao(akakVar.b, akbhVar.b);
        } else {
            String strC = ajoyVar.c();
            if (strC == null) {
                throw new ajut("Header value is null");
            }
            akbhVar = new akbh(strC.length());
            akbhVar.f(strC);
            akaoVar = new akao(0, akbhVar.b);
        }
        return j(new ajzy[]{ajyrVar.a(akbhVar, akaoVar)}, ajulVar);
    }

    @Override // defpackage.ajuo
    public final ajoy d() {
        return null;
    }

    public final String toString() {
        return "netscape";
    }
}
