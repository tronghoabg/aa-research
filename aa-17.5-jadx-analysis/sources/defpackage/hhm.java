package defpackage;

import java.io.PrintWriter;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class hhm {
    public static int m(int i, int i2) {
        return Math.min(i2, Math.max(i, 0));
    }

    private static final void n(PrintWriter printWriter, hhj hhjVar) {
        char c = hhjVar.c;
        if (c != 0) {
            printWriter.print(c);
        }
    }

    public abstract int a();

    public abstract yfq b();

    public abstract yfq c();

    public abstract String d();

    public abstract boolean e();

    public abstract boolean f();

    public yfq g() {
        throw null;
    }

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(PrintWriter printWriter, hhk hhkVar, boolean z, Set set) {
        int i;
        int i2 = ((yls) b()).c;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = hhkVar.a(i3);
        }
        boolean z2 = false;
        int i4 = 0;
        while (!z2) {
            i4++;
            boolean z3 = z;
            int i5 = 0;
            boolean z4 = true;
            while (i5 < i2) {
                String strSubstring = strArr[i5];
                if (strSubstring == null) {
                    strSubstring = "";
                }
                int iIntValue = ((Integer) g().get(i5)).intValue();
                int length = strSubstring.length();
                if (length <= iIntValue) {
                    strArr[i5] = null;
                } else if (e()) {
                    String strSubstring2 = strSubstring.substring(0, iIntValue);
                    strArr[i5] = strSubstring.substring(iIntValue);
                    strSubstring = strSubstring2;
                    z4 = false;
                } else {
                    if (z3) {
                        i = 0;
                        length = iIntValue;
                    } else {
                        i = length - iIntValue;
                    }
                    strSubstring = strSubstring.substring(i, length);
                    strArr[i5] = null;
                }
                hhj hhjVar = (hhj) b().get(i5);
                boolean z5 = hhjVar.e;
                if (i5 == 0) {
                    n(printWriter, hhjVar);
                    i5 = 0;
                }
                z3 |= z5;
                if (!set.contains(hhjVar)) {
                    roc.ax(printWriter, strSubstring, iIntValue, i4 == 1 && !z3);
                    n(printWriter, hhjVar);
                }
                i5++;
            }
            if (!z4) {
                printWriter.println();
            }
            z2 = z4;
            z = z3;
        }
        printWriter.println();
    }
}
