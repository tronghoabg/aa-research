package defpackage;

import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class ajyr {
    public static final ajyr a = new ajyr();
    private static final BitSet b = akap.a(61, 59);
    private static final BitSet c = akap.a(59);

    private static final ajpp b(akbh akbhVar, akao akaoVar) {
        String strD = akap.d(akbhVar, akaoVar, b);
        if (akaoVar.b()) {
            return new akag(strD, null);
        }
        char cCharAt = akbhVar.charAt(akaoVar.b);
        akaoVar.a(akaoVar.b + 1);
        if (cCharAt != '=') {
            return new akag(strD, null);
        }
        String strD2 = akap.d(akbhVar, akaoVar, c);
        if (!akaoVar.b()) {
            akaoVar.a(akaoVar.b + 1);
        }
        return new akag(strD, strD2);
    }

    public final ajzy a(akbh akbhVar, akao akaoVar) throws ajpr {
        ahgm.e(akbhVar, "Char array buffer");
        ajpp ajppVarB = b(akbhVar, akaoVar);
        ArrayList arrayList = new ArrayList();
        while (!akaoVar.b()) {
            arrayList.add(b(akbhVar, akaoVar));
        }
        akag akagVar = (akag) ajppVarB;
        return new ajzy(akagVar.a, akagVar.b, (ajpp[]) arrayList.toArray(new ajpp[arrayList.size()]));
    }
}
