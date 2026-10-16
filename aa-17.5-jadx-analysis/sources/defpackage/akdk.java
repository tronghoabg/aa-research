package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
final class akdk extends akeh {
    private final akdc b;

    public akdk(akdc akdcVar, akcm akcmVar) {
        super(akch.m, akcmVar);
        this.b = akdcVar;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int a(long j) {
        return this.b.O(j);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int b(Locale locale) {
        return akdm.a(locale).k;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int c() {
        return 7;
    }

    @Override // defpackage.akeh, defpackage.akcf
    public final int d() {
        return 1;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final String k(int i, Locale locale) {
        return akdm.a(locale).c[i];
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final String m(int i, Locale locale) {
        return akdm.a(locale).b[i];
    }

    @Override // defpackage.akcf
    public final akcm s() {
        return this.b.d;
    }

    @Override // defpackage.akdx
    protected final int y(String str, Locale locale) {
        Integer num = (Integer) akdm.a(locale).h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new akcp(akch.m, str);
    }
}
