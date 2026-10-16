package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

@Deprecated
/* loaded from: classes2.dex */
public final class ajyk extends ajya {
    private static final String[] a = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};

    /* JADX WARN: Illegal instructions before constructor call */
    public ajyk(String[] strArr) {
        ajuh[] ajuhVarArr = new ajuh[7];
        ajuhVarArr[0] = new ajym();
        ajuhVarArr[1] = new ajyd();
        ajuhVarArr[2] = new ajyg();
        ajuhVarArr[3] = new ajyf(0);
        ajuhVarArr[4] = new ajyh();
        ajuhVarArr[5] = new ajyf(1);
        ajuhVarArr[6] = new ajye(strArr != null ? (String[]) strArr.clone() : a);
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
            String strC = ajuiVar.c();
            String strE = ajuiVar.e();
            if (ajuiVar.a() <= 0 || (strE != null && strE.startsWith("\"") && strE.endsWith("\""))) {
                akbhVar.f(strC);
                akbhVar.f("=");
                if (strE != null) {
                    akbhVar.f(strE);
                }
            } else {
                ajzy ajzyVar = new ajzy(strC, strE, null);
                String str = ajzyVar.a;
                String str2 = ajzyVar.b;
                int length = str.length();
                if (str2 != null) {
                    length += str2.length() + 3;
                }
                int iA = ajzyVar.a();
                if (iA > 0) {
                    for (int i2 = 0; i2 < iA; i2++) {
                        length += ahgm.g(ajzyVar.b(i2)) + 2;
                    }
                }
                akbhVar.j(length);
                akbhVar.f(str);
                if (str2 != null) {
                    akbhVar.e('=');
                    ahgm.f(akbhVar, str2, false);
                }
                int iA2 = ajzyVar.a();
                if (iA2 > 0) {
                    for (int i3 = 0; i3 < iA2; i3++) {
                        akbhVar.f("; ");
                        ahgm.h(akbhVar, ajzyVar.b(i3), false);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new akak(akbhVar));
        return arrayList;
    }

    @Override // defpackage.ajuo
    public final List c(ajoy ajoyVar, ajul ajulVar) throws ajut, ajpr {
        akbh akbhVar;
        akao akaoVar;
        ahgm.e(ajoyVar, "Header");
        if (!ajoyVar.b().equalsIgnoreCase("Set-Cookie")) {
            throw new ajut(a.bW(ajoyVar, "Unrecognized cookie header '", "'"));
        }
        ajzy[] ajzyVarArrA = ajoyVar.a();
        boolean z = false;
        boolean z2 = false;
        for (ajzy ajzyVar : ajzyVarArrA) {
            z2 |= !(ajzyVar.c("version") == null);
            z |= !(ajzyVar.c("expires") == null);
        }
        if (!z && z2) {
            return j(ajzyVarArrA, ajulVar);
        }
        boolean z3 = ajoyVar instanceof akak;
        ajyr ajyrVar = ajyr.a;
        if (z3) {
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
        ajzy ajzyVarA = ajyrVar.a(akbhVar, akaoVar);
        String str = ajzyVarA.a;
        String str2 = ajzyVarA.b;
        if (str.isEmpty()) {
            throw new ajut("Cookie name may not be empty");
        }
        ajyc ajycVar = new ajyc(str, str2);
        ajycVar.d = i(ajulVar);
        ajycVar.j(ajulVar.a);
        ajpp[] ajppVarArrD = ajzyVarA.d();
        int length = ajppVarArrD.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            ajpp ajppVar = ajppVarArrD[length];
            String lowerCase = ajppVar.b().toLowerCase(Locale.ROOT);
            ajycVar.o(lowerCase, ajppVar.c());
            ajuj ajujVarH = h(lowerCase);
            if (ajujVarH != null) {
                ajujVarH.b(ajycVar, ajppVar.c());
            }
        }
        if (z) {
            ajycVar.e = 0;
        }
        return Collections.singletonList(ajycVar);
    }

    @Override // defpackage.ajuo
    public final ajoy d() {
        return null;
    }

    public final String toString() {
        return "compatibility";
    }
}
