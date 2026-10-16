package defpackage;

import androidx.car.app.model.Alert;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class mnk {
    public static mnf l() {
        mnf mnfVar = new mnf();
        mnfVar.g = "--empty--";
        mnfVar.e = Alert.DURATION_SHOW_INDEFINITELY;
        mnfVar.h = true;
        mnfVar.f = true;
        mnfVar.i = (byte) 127;
        return mnfVar;
    }

    public static int n(int i, int i2) {
        return Math.min(i2, Math.max(i, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void o(PrintWriter printWriter, mni mniVar, boolean z, Set set) {
        int i;
        int i2 = ((yls) b()).c;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = mniVar.a(i3);
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
                mnh mnhVar = (mnh) b().get(i5);
                boolean z5 = mnhVar.e;
                if (i5 == 0) {
                    p(printWriter, mnhVar);
                    i5 = 0;
                }
                z3 |= z5;
                if (!set.contains(mnhVar)) {
                    roc.ax(printWriter, strSubstring, iIntValue, i4 == 1 && !z3);
                    p(printWriter, mnhVar);
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

    private static final void p(PrintWriter printWriter, mnh mnhVar) {
        char c = mnhVar.c;
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

    public final void m(PrintWriter printWriter) {
        Set set = Collections.EMPTY_SET;
        boolean z = set.size() == ((yls) b()).c || c().isEmpty();
        if (f()) {
            o(printWriter, new mni() { // from class: mne
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.mni
                public final String a(int i) {
                    return ((mnh) this.a.b().get(i)).a;
                }
            }, true, z ? Collections.EMPTY_SET : set);
        }
        if (z) {
            if (d() != null) {
                printWriter.println(d());
                return;
            }
            return;
        }
        yfq yfqVarC = c();
        int i = ((yls) yfqVarC).c;
        for (int i2 = 0; i2 < i; i2++) {
            List list = (List) yfqVarC.get(i2);
            if (list.size() != ((yls) b()).c) {
                throw new IllegalArgumentException("Row has fewer columns than required.");
            }
            o(printWriter, new mnj(list), false, set);
        }
    }
}
