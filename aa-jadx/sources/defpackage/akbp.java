package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akbp {
    public static final defpackage.akbp a = new defpackage.akbp();

    public static java.util.BitSet a(int... iArr) {
        java.util.BitSet bitSet = new java.util.BitSet();
        for (int i : iArr) {
            bitSet.set(i);
        }
        return bitSet;
    }

    public static boolean b(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }

    public static final void c(defpackage.akch akchVar, defpackage.akbo akboVar) {
        int i = akboVar.b;
        int i2 = i;
        while (i < akboVar.a && b(akchVar.charAt(i))) {
            i2++;
            i++;
        }
        akboVar.a(i2);
    }

    public static final java.lang.String d(defpackage.akch akchVar, defpackage.akbo akboVar, java.util.BitSet bitSet) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (!akboVar.b()) {
                    char cCharAt = akchVar.charAt(akboVar.b);
                    if (bitSet != null && bitSet.get(cCharAt)) {
                        break loop0;
                    }
                    if (b(cCharAt)) {
                        c(akchVar, akboVar);
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
            if (z && sb.length() > 0) {
                sb.append(' ');
            }
            int i = akboVar.b;
            int i2 = akboVar.a;
            int i3 = i;
            while (i < i2) {
                char cCharAt2 = akchVar.charAt(i);
                if ((bitSet != null && bitSet.get(cCharAt2)) || b(cCharAt2)) {
                    break;
                }
                i3++;
                sb.append(cCharAt2);
                i++;
            }
            akboVar.a(i3);
        }
        return sb.toString();
    }
}
