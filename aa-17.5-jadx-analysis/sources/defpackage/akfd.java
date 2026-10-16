package defpackage;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
final class akfd extends akev {
    @Override // defpackage.akfn
    public final int b() {
        return this.b;
    }

    @Override // defpackage.akfn
    public final void d(Appendable appendable, long j, akcd akcdVar, int i, akcl akclVar, Locale locale) throws IOException {
        try {
            int iA = this.a.a(akcdVar).a(j);
            int i2 = akfj.a;
            if (iA < 0) {
                appendable.append('-');
                if (iA == Integer.MIN_VALUE) {
                    appendable.append("2147483648");
                    return;
                }
                iA = -iA;
            }
            if (iA < 10) {
                appendable.append((char) (iA + 48));
            } else {
                if (iA >= 100) {
                    appendable.append(Integer.toString(iA));
                    return;
                }
                int i3 = ((iA + 1) * 13421772) >> 27;
                appendable.append((char) (i3 + 48));
                appendable.append((char) (((iA - (i3 << 3)) - (i3 + i3)) + 48));
            }
        } catch (RuntimeException unused) {
            appendable.append((char) 65533);
        }
    }
}
