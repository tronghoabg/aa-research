package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ajza extends ajyv {
    /* JADX WARN: Illegal instructions before constructor call */
    public ajza(String[] strArr, boolean z) {
        ajuh[] ajuhVarArr = new ajuh[10];
        ajuhVarArr[0] = new ajyy(5);
        ajuhVarArr[1] = new ajyz();
        ajuhVarArr[2] = new ajyy(3);
        ajuhVarArr[3] = new ajyy(4);
        ajuhVarArr[4] = new ajyf(0);
        ajuhVarArr[5] = new ajyh();
        ajuhVarArr[6] = new ajyf(1);
        ajuhVarArr[7] = new ajye(strArr != null ? (String[]) strArr.clone() : a);
        ajuhVarArr[8] = new ajyy(0);
        ajuhVarArr[9] = new ajyy(2);
        super(z, ajuhVarArr);
    }

    private static ajul m(ajul ajulVar) {
        int i = 0;
        while (true) {
            String str = ajulVar.a;
            if (i >= str.length()) {
                String strValueOf = String.valueOf(str);
                return new ajul(strValueOf.concat(".local"), ajulVar.b, ajulVar.c, ajulVar.d);
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == ':') {
                break;
            }
            i++;
        }
        return ajulVar;
    }

    private final List n(ajzy[] ajzyVarArr, ajul ajulVar) throws ajut {
        ArrayList arrayList = new ArrayList(ajzyVarArr.length);
        for (ajzy ajzyVar : ajzyVarArr) {
            String str = ajzyVar.a;
            String str2 = ajzyVar.b;
            if (str.isEmpty()) {
                throw new ajut("Cookie name may not be empty");
            }
            ajyb ajybVar = new ajyb(str, str2);
            ajybVar.d = i(ajulVar);
            ajybVar.j(ajulVar.a);
            ajybVar.a = new int[]{ajulVar.b};
            ajpp[] ajppVarArrD = ajzyVar.d();
            int length = ajppVarArrD.length;
            HashMap map = new HashMap(length);
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                ajpp ajppVar = ajppVarArrD[length];
                map.put(ajppVar.b().toLowerCase(Locale.ROOT), ajppVar);
            }
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ajpp ajppVar2 = (ajpp) ((Map.Entry) it.next()).getValue();
                String lowerCase = ajppVar2.b().toLowerCase(Locale.ROOT);
                ajybVar.o(lowerCase, ajppVar2.c());
                ajuj ajujVarH = h(lowerCase);
                if (ajujVarH != null) {
                    ajujVarH.b(ajybVar, ajppVar2.c());
                }
            }
            arrayList.add(ajybVar);
        }
        return arrayList;
    }

    @Override // defpackage.ajyv, defpackage.ajuo
    public final int a() {
        return 1;
    }

    @Override // defpackage.ajyv, defpackage.ajuo
    public final List c(ajoy ajoyVar, ajul ajulVar) throws ajut {
        ahgm.e(ajoyVar, "Header");
        if (ajoyVar.b().equalsIgnoreCase("Set-Cookie2")) {
            return n(ajoyVar.a(), m(ajulVar));
        }
        throw new ajut(a.bW(ajoyVar, "Unrecognized cookie header '", "'"));
    }

    @Override // defpackage.ajyv, defpackage.ajuo
    public final ajoy d() {
        akbh akbhVar = new akbh(40);
        akbhVar.f("Cookie2");
        akbhVar.f(": ");
        akbhVar.f("$Version=");
        akbhVar.f(Integer.toString(1));
        return new akak(akbhVar);
    }

    @Override // defpackage.ajyv, defpackage.ajya, defpackage.ajuo
    public final void e(ajui ajuiVar, ajul ajulVar) throws ajut {
        ahgm.e(ajuiVar, "Cookie");
        super.e(ajuiVar, m(ajulVar));
    }

    @Override // defpackage.ajya, defpackage.ajuo
    public final boolean f(ajui ajuiVar, ajul ajulVar) {
        ahgm.e(ajuiVar, "Cookie");
        return super.f(ajuiVar, m(ajulVar));
    }

    @Override // defpackage.ajya
    protected final List j(ajzy[] ajzyVarArr, ajul ajulVar) throws ajut {
        return n(ajzyVarArr, m(ajulVar));
    }

    @Override // defpackage.ajyv
    protected final void k(akbh akbhVar, ajui ajuiVar, int i) {
        String str;
        int[] iArrI;
        super.k(akbhVar, ajuiVar, i);
        if (!(ajuiVar instanceof ajyc) || (str = (String) ((ajyc) ajuiVar).c.get("port")) == null) {
            return;
        }
        akbhVar.f("; $Port");
        akbhVar.f("=\"");
        if (!str.trim().isEmpty() && (iArrI = ajuiVar.i()) != null) {
            for (int i2 = 0; i2 < iArrI.length; i2++) {
                if (i2 > 0) {
                    akbhVar.f(",");
                }
                akbhVar.f(Integer.toString(iArrI[i2]));
            }
        }
        akbhVar.f("\"");
    }

    @Override // defpackage.ajyv
    public final String toString() {
        return "rfc2965";
    }
}
