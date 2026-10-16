package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akgj {
    public static final /* synthetic */ int a = 0;
    private static final double b = 2.302585092994046d;

    static int a(java.lang.CharSequence charSequence, int i) {
        int iCharAt = charSequence.charAt(i) - '0';
        return (((iCharAt << 3) + (iCharAt + iCharAt)) + charSequence.charAt(i + 1)) - 48;
    }

    public static void b(java.lang.Appendable appendable, int i, int i2) throws java.io.IOException {
        int iLog;
        if (i < 0) {
            appendable.append('-');
            if (i == Integer.MIN_VALUE) {
                while (i2 > 10) {
                    appendable.append('0');
                    i2--;
                }
                appendable.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            while (i2 > 1) {
                appendable.append('0');
                i2--;
            }
            appendable.append((char) (i + 48));
            return;
        }
        if (i < 100) {
            while (i2 > 2) {
                appendable.append('0');
                i2--;
            }
            int i3 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i3 + 48));
            appendable.append((char) (((i - (i3 << 3)) - (i3 + i3)) + 48));
            return;
        }
        if (i < 1000) {
            iLog = 3;
        } else {
            iLog = i < 10000 ? 4 : ((int) (java.lang.Math.log(i) / b)) + 1;
        }
        while (i2 > iLog) {
            appendable.append('0');
            i2--;
        }
        appendable.append(java.lang.Integer.toString(i));
    }

    public static void c(java.lang.StringBuffer stringBuffer, int i, int i2) {
        try {
            b(stringBuffer, i, i2);
        } catch (java.io.IOException unused) {
        }
    }
}
