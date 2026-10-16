package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
final class akdt extends akdx {
    final akcf a;
    final akcl b;
    final akcm c;
    final boolean d;
    final akcm e;
    final akcm f;

    public akdt(akcf akcfVar, akcl akclVar, akcm akcmVar, akcm akcmVar2, akcm akcmVar3) {
        super(akcfVar.p());
        if (!akcfVar.u()) {
            throw new IllegalArgumentException();
        }
        this.a = akcfVar;
        this.b = akclVar;
        this.c = akcmVar;
        this.d = akdv.O(akcmVar);
        this.e = akcmVar2;
        this.f = akcmVar3;
    }

    private final int x(long j) {
        int iA = this.b.a(j);
        long j2 = iA;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return iA;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int a(long j) {
        return this.a.a(this.b.d(j));
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int b(Locale locale) {
        return this.a.b(locale);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.akcf
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long e(long j, int i) {
        if (this.d) {
            long jX = x(j);
            return this.a.e(j + jX, i) - jX;
        }
        akcl akclVar = this.b;
        return akclVar.m(this.a.e(akclVar.d(j), i), j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akdt) {
            akdt akdtVar = (akdt) obj;
            if (this.a.equals(akdtVar.a) && this.b.equals(akdtVar.b) && this.c.equals(akdtVar.c) && this.e.equals(akdtVar.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long f(long j) {
        return this.a.f(this.b.d(j));
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long g(long j) {
        if (this.d) {
            long jX = x(j);
            return this.a.g(j + jX) - jX;
        }
        akcl akclVar = this.b;
        return akclVar.m(this.a.g(akclVar.d(j)), j);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long h(long j, int i) {
        akcl akclVar = this.b;
        akcf akcfVar = this.a;
        long jH = akcfVar.h(akclVar.d(j), i);
        long jM = akclVar.m(jH, j);
        if (a(jM) == i) {
            return jM;
        }
        akcq akcqVar = new akcq(jH, akclVar.c);
        akcp akcpVar = new akcp(akcfVar.p(), Integer.valueOf(i), akcqVar.getMessage());
        akcpVar.initCause(akcqVar);
        throw akcpVar;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final long i(long j, String str, Locale locale) {
        akcf akcfVar = this.a;
        akcl akclVar = this.b;
        return akclVar.m(akcfVar.i(akclVar.d(j), str, locale), j);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final String k(int i, Locale locale) {
        return this.a.k(i, locale);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final String l(long j, Locale locale) {
        return this.a.l(this.b.d(j), locale);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final String m(int i, Locale locale) {
        return this.a.m(i, locale);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final String n(long j, Locale locale) {
        return this.a.n(this.b.d(j), locale);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final akcm q() {
        return this.c;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final akcm r() {
        return this.f;
    }

    @Override // defpackage.akcf
    public final akcm s() {
        return this.e;
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final boolean t(long j) {
        return this.a.t(this.b.d(j));
    }

    @Override // defpackage.akcf
    public final void v() {
    }
}
