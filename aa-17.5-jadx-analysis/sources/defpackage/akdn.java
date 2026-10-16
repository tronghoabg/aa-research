package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
final class akdn extends akdg {
    @Override // defpackage.akdx, defpackage.akcf
    public final int b(Locale locale) {
        return akdm.a(locale).l;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final String k(int i, Locale locale) {
        return akdm.a(locale).e[i];
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final String m(int i, Locale locale) {
        return akdm.a(locale).d[i];
    }

    @Override // defpackage.akdx
    protected final int y(String str, Locale locale) {
        Integer num = (Integer) akdm.a(locale).i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new akcp(akch.h, str);
    }
}
