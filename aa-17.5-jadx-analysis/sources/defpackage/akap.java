package defpackage;

import java.util.BitSet;

/* loaded from: classes2.dex */
public final class akap {
    public static final akap a = new akap();

    public static BitSet a(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i : iArr) {
            bitSet.set(i);
        }
        return bitSet;
    }

    public static boolean b(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }

    public static final void c(akbh akbhVar, akao akaoVar) {
        int i = akaoVar.b;
        int i2 = i;
        while (i < akaoVar.a && b(akbhVar.charAt(i))) {
            i2++;
            i++;
        }
        akaoVar.a(i2);
    }

    public static final String d(akbh akbhVar, akao akaoVar, BitSet bitSet) {
        StringBuilder sb = new StringBuilder();
        loop0: while (true) {
            boolean z = false;
            while (!akaoVar.b()) {
                char cCharAt = akbhVar.charAt(akaoVar.b);
                if (bitSet != null && bitSet.get(cCharAt)) {
                    break loop0;
                }
                if (b(cCharAt)) {
                    c(akbhVar, akaoVar);
                    z = true;
                } else {
                    if (z && sb.length() > 0) {
                        sb.append(' ');
                    }
                    int i = akaoVar.b;
                    int i2 = akaoVar.a;
                    int i3 = i;
                    while (i < i2) {
                        char cCharAt2 = akbhVar.charAt(i);
                        if ((bitSet == null || !bitSet.get(cCharAt2)) && !b(cCharAt2)) {
                            i3++;
                            sb.append(cCharAt2);
                            i++;
                        }
                    }
                    akaoVar.a(i3);
                }
            }
            break loop0;
        }
        return sb.toString();
    }
}
