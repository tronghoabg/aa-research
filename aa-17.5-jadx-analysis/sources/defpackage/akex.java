package defpackage;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
final class akex implements akfn, akfl {
    private final String a;

    public akex(String str) {
        this.a = str;
    }

    @Override // defpackage.akfl
    public final int a() {
        return this.a.length();
    }

    @Override // defpackage.akfn
    public final int b() {
        return this.a.length();
    }

    @Override // defpackage.akfl
    public final int c(akfh akfhVar, CharSequence charSequence, int i) {
        String str = this.a;
        return akfe.d(charSequence, i, str) ? i + str.length() : ~i;
    }

    @Override // defpackage.akfn
    public final void d(Appendable appendable, long j, akcd akcdVar, int i, akcl akclVar, Locale locale) throws IOException {
        appendable.append(this.a);
    }
}
