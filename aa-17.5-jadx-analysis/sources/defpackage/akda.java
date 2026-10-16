package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
final class akda extends akeg {
    public akda() {
        super(akch.n, akdc.s, akdc.t);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int b(Locale locale) {
        return akdm.a(locale).m;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long i(long j, String str, Locale locale) {
        String[] strArr = akdm.a(locale).f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new akcp(akch.n, str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return h(j, length);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final String m(int i, Locale locale) {
        return akdm.a(locale).f[i];
    }
}
