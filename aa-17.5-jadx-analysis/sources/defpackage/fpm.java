package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class fpm {
    public static final String a = fjo.b("DiagnosticsWrkr");

    public static final String a(fnz fnzVar, fon fonVar, fnu fnuVar, List list) throws IOException {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fod fodVar = (fod) it.next();
            fnt fntVarA = fnuVar.a(dtb.l(fodVar));
            Integer numValueOf = fntVarA != null ? Integer.valueOf(fntVarA.c) : null;
            String str = fodVar.a;
            String strCu = woy.cu(fnzVar.a(str), ",", null, null, null, 62);
            String strCu2 = woy.cu(fonVar.a(str), ",", null, null, null, 62);
            sb.append("\n" + str + "\t " + fodVar.c + "\t " + numValueOf + "\t " + fodVar.b.name() + "\t " + strCu + "\t " + strCu2 + "\t");
        }
        return sb.toString();
    }
}
