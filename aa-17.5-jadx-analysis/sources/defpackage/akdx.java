package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class akdx extends akcf {
    public final akch g;

    protected akdx(akch akchVar) {
        if (akchVar == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.g = akchVar;
    }

    @Override // defpackage.akcf
    public abstract int a(long j);

    @Override // defpackage.akcf
    public int b(Locale locale) {
        int iC = c();
        if (iC >= 0) {
            if (iC < 10) {
                return 1;
            }
            if (iC < 100) {
                return 2;
            }
            if (iC < 1000) {
                return 3;
            }
        }
        return Integer.toString(iC).length();
    }

    @Override // defpackage.akcf
    public abstract int c();

    @Override // defpackage.akcf
    public long e(long j, int i) {
        return q().a(j, i);
    }

    @Override // defpackage.akcf
    public long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.akcf
    public abstract long g(long j);

    @Override // defpackage.akcf
    public abstract long h(long j, int i);

    @Override // defpackage.akcf
    public long i(long j, String str, Locale locale) {
        return h(j, y(str, locale));
    }

    @Override // defpackage.akcf
    public String k(int i, Locale locale) {
        return m(i, locale);
    }

    @Override // defpackage.akcf
    public String l(long j, Locale locale) {
        return k(a(j), locale);
    }

    @Override // defpackage.akcf
    public String m(int i, Locale locale) {
        return Integer.toString(i);
    }

    @Override // defpackage.akcf
    public String n(long j, Locale locale) {
        return m(a(j), locale);
    }

    @Override // defpackage.akcf
    public final String o() {
        return this.g.y;
    }

    @Override // defpackage.akcf
    public final akch p() {
        return this.g;
    }

    @Override // defpackage.akcf
    public abstract akcm q();

    @Override // defpackage.akcf
    public akcm r() {
        return null;
    }

    @Override // defpackage.akcf
    public boolean t(long j) {
        return false;
    }

    public final String toString() {
        return "DateTimeField[" + o() + "]";
    }

    @Override // defpackage.akcf
    public final boolean u() {
        return true;
    }

    public int w(long j) {
        return c();
    }

    protected int y(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new akcp(this.g, str);
        }
    }
}
