package defpackage;

import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class akaa implements akam {
    public static final akaa a = new akaa();
    private static final BitSet b = akap.a(61, 59, 44);
    private static final BitSet c = akap.a(59, 44);

    public static final ajpp c(akbh akbhVar, akao akaoVar) {
        ahgm.e(akbhVar, "Char array buffer");
        ahgm.e(akaoVar, "Parser cursor");
        String strD = akap.d(akbhVar, akaoVar, b);
        if (akaoVar.b()) {
            return new akag(strD, null);
        }
        char cCharAt = akbhVar.charAt(akaoVar.b);
        akaoVar.a(akaoVar.b + 1);
        if (cCharAt != '=') {
            return new akag(strD, null);
        }
        BitSet bitSet = c;
        StringBuilder sb = new StringBuilder();
        loop0: while (true) {
            boolean z = false;
            while (!akaoVar.b()) {
                char cCharAt2 = akbhVar.charAt(akaoVar.b);
                if (bitSet != null && bitSet.get(cCharAt2)) {
                    break loop0;
                }
                if (akap.b(cCharAt2)) {
                    akap.c(akbhVar, akaoVar);
                    z = true;
                } else if (cCharAt2 == '\"') {
                    if (z && sb.length() > 0) {
                        sb.append(' ');
                    }
                    if (!akaoVar.b()) {
                        int i = akaoVar.b;
                        int i2 = akaoVar.a;
                        if (akbhVar.charAt(i) == '\"') {
                            int i3 = i + 1;
                            boolean z2 = false;
                            int i4 = i3;
                            while (i3 < i2) {
                                i4++;
                                char cCharAt3 = akbhVar.charAt(i3);
                                if (z2) {
                                    if (cCharAt3 != '\"' && cCharAt3 != '\\') {
                                        sb.append('\\');
                                    }
                                    sb.append(cCharAt3);
                                    z2 = false;
                                } else {
                                    if (cCharAt3 == '\"') {
                                        break;
                                    }
                                    if (cCharAt3 == '\\') {
                                        z2 = true;
                                    } else if (cCharAt3 != '\r' && cCharAt3 != '\n') {
                                        sb.append(cCharAt3);
                                    }
                                }
                                i3++;
                            }
                            akaoVar.a(i4);
                        }
                    }
                } else {
                    if (z && sb.length() > 0) {
                        sb.append(' ');
                    }
                    int i5 = akaoVar.b;
                    int i6 = akaoVar.a;
                    int i7 = i5;
                    while (i5 < i6) {
                        char cCharAt4 = akbhVar.charAt(i5);
                        if ((bitSet != null && bitSet.get(cCharAt4)) || akap.b(cCharAt4) || cCharAt4 == '\"') {
                            break;
                        }
                        i7++;
                        sb.append(cCharAt4);
                        i5++;
                    }
                    akaoVar.a(i7);
                }
            }
            break loop0;
        }
        String string = sb.toString();
        if (!akaoVar.b()) {
            akaoVar.a(akaoVar.b + 1);
        }
        return new akag(strD, string);
    }

    @Override // defpackage.akam
    public final ajzy a(akbh akbhVar, akao akaoVar) {
        ahgm.e(akbhVar, "Char array buffer");
        ahgm.e(akaoVar, "Parser cursor");
        ajpp ajppVarC = c(akbhVar, akaoVar);
        ajpp[] ajppVarArr = null;
        if (!akaoVar.b() && akbhVar.charAt(akaoVar.b - 1) != ',') {
            ahgm.e(akbhVar, "Char array buffer");
            ahgm.e(akaoVar, "Parser cursor");
            akap.c(akbhVar, akaoVar);
            ArrayList arrayList = new ArrayList();
            while (!akaoVar.b()) {
                arrayList.add(c(akbhVar, akaoVar));
                if (akbhVar.charAt(akaoVar.b - 1) == ',') {
                    break;
                }
            }
            ajppVarArr = (ajpp[]) arrayList.toArray(new ajpp[arrayList.size()]);
        }
        akag akagVar = (akag) ajppVarC;
        return new ajzy(akagVar.a, akagVar.b, ajppVarArr);
    }

    @Override // defpackage.akam
    public final ajzy[] b(akbh akbhVar, akao akaoVar) {
        ahgm.e(akbhVar, "Char array buffer");
        ArrayList arrayList = new ArrayList();
        while (!akaoVar.b()) {
            ajzy ajzyVarA = a(akbhVar, akaoVar);
            if (!ajzyVarA.a.isEmpty() || ajzyVarA.b != null) {
                arrayList.add(ajzyVarA);
            }
        }
        return (ajzy[]) arrayList.toArray(new ajzy[arrayList.size()]);
    }
}
