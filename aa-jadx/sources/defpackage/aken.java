package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class aken extends defpackage.akeg {
    @Override // defpackage.akex, defpackage.akdf
    public final int b(java.util.Locale locale) {
        return defpackage.akem.a(locale).l;
    }

    @Override // defpackage.akex, defpackage.akdf
    public final java.lang.String k(int i, java.util.Locale locale) {
        return defpackage.akem.a(locale).e[i];
    }

    @Override // defpackage.akex, defpackage.akdf
    public final java.lang.String m(int i, java.util.Locale locale) {
        return defpackage.akem.a(locale).d[i];
    }

    @Override // defpackage.akex
    protected final int y(java.lang.String str, java.util.Locale locale) {
        java.lang.Integer num = (java.lang.Integer) defpackage.akem.a(locale).i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new defpackage.akdp(defpackage.akdh.h, str);
    }
}
