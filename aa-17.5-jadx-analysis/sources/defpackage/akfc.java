package defpackage;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class akfc implements akfn, akfl {
    private final akch a;
    private final int b;
    private final boolean c;

    public akfc(akch akchVar, int i, boolean z) {
        this.a = akchVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.akfl
    public final int a() {
        return this.c ? 4 : 2;
    }

    @Override // defpackage.akfn
    public final int b() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x003b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0038 A[SYNTHETIC] */
    @Override // defpackage.akfl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(defpackage.akfh r12, java.lang.CharSequence r13, int r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akfc.c(akfh, java.lang.CharSequence, int):int");
    }

    @Override // defpackage.akfn
    public final void d(Appendable appendable, long j, akcd akcdVar, int i, akcl akclVar, Locale locale) throws IOException {
        int i2;
        try {
            int iA = this.a.a(akcdVar).a(j);
            if (iA < 0) {
                iA = -iA;
            }
            i2 = iA % 100;
        } catch (RuntimeException unused) {
            i2 = -1;
        }
        if (i2 >= 0) {
            akfj.b(appendable, i2, 2);
        } else {
            appendable.append((char) 65533);
            appendable.append((char) 65533);
        }
    }
}
