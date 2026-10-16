package defpackage;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
final class akeq implements akfn, akfl {
    private final char a;

    public akeq(char c) {
        this.a = c;
    }

    @Override // defpackage.akfl
    public final int a() {
        return 1;
    }

    @Override // defpackage.akfn
    public final int b() {
        return 1;
    }

    @Override // defpackage.akfl
    public final int c(akfh akfhVar, CharSequence charSequence, int i) {
        char upperCase;
        char upperCase2;
        if (i >= charSequence.length()) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        char c = this.a;
        return (cCharAt == c || (upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(c)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i + 1 : ~i;
    }

    @Override // defpackage.akfn
    public final void d(Appendable appendable, long j, akcd akcdVar, int i, akcl akclVar, Locale locale) throws IOException {
        appendable.append(this.a);
    }
}
