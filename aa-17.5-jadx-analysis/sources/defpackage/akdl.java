package defpackage;

import java.util.Locale;
import org.jni_zero.JniZero;

/* loaded from: classes2.dex */
final class akdl extends akdx {
    private final akdc a;

    public akdl(akdc akdcVar) {
        super(akch.b);
        this.a = akdcVar;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int a(long j) {
        return this.a.Y(j) <= 0 ? 0 : 1;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int b(Locale locale) {
        return akdm.a(locale).j;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int c() {
        return 1;
    }

    @Override // defpackage.akcf
    public final int d() {
        return 0;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long g(long j) {
        if (a(j) == 1) {
            return this.a.ae(0L, 1);
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long h(long j, int i) {
        JniZero.c(this, i, 0, 1);
        if (a(j) == i) {
            return j;
        }
        akdc akdcVar = this.a;
        return akdcVar.ae(j, -akdcVar.Y(j));
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long i(long j, String str, Locale locale) {
        Integer num = (Integer) akdm.a(locale).g.get(str);
        if (num != null) {
            return h(j, num.intValue());
        }
        throw new akcp(akch.b, str);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final String m(int i, Locale locale) {
        return akdm.a(locale).a[i];
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final akcm q() {
        return akem.h(akco.a);
    }

    @Override // defpackage.akcf
    public final akcm s() {
        return null;
    }

    @Override // defpackage.akcf
    public final void v() {
    }
}
