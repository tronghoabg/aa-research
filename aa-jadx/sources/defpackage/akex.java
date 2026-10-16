package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class akex extends defpackage.akdf {
    public final defpackage.akdh g;

    protected akex(defpackage.akdh akdhVar) {
        if (akdhVar == null) {
            throw new java.lang.IllegalArgumentException("The type must not be null");
        }
        this.g = akdhVar;
    }

    @Override // defpackage.akdf
    public abstract int a(long j);

    @Override // defpackage.akdf
    public int b(java.util.Locale locale) {
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
        return java.lang.Integer.toString(iC).length();
    }

    @Override // defpackage.akdf
    public abstract int c();

    @Override // defpackage.akdf
    public long e(long j, int i) {
        return q().a(j, i);
    }

    @Override // defpackage.akdf
    public long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.akdf
    public abstract long g(long j);

    @Override // defpackage.akdf
    public abstract long h(long j, int i);

    @Override // defpackage.akdf
    public long i(long j, java.lang.String str, java.util.Locale locale) {
        return h(j, y(str, locale));
    }

    @Override // defpackage.akdf
    public java.lang.String k(int i, java.util.Locale locale) {
        return m(i, locale);
    }

    @Override // defpackage.akdf
    public java.lang.String l(long j, java.util.Locale locale) {
        return k(a(j), locale);
    }

    @Override // defpackage.akdf
    public java.lang.String m(int i, java.util.Locale locale) {
        return java.lang.Integer.toString(i);
    }

    @Override // defpackage.akdf
    public java.lang.String n(long j, java.util.Locale locale) {
        return m(a(j), locale);
    }

    @Override // defpackage.akdf
    public final java.lang.String o() {
        return this.g.y;
    }

    @Override // defpackage.akdf
    public final defpackage.akdh p() {
        return this.g;
    }

    @Override // defpackage.akdf
    public abstract defpackage.akdm q();

    @Override // defpackage.akdf
    public defpackage.akdm r() {
        return null;
    }

    @Override // defpackage.akdf
    public boolean t(long j) {
        return false;
    }

    public final java.lang.String toString() {
        return "DateTimeField[" + o() + "]";
    }

    @Override // defpackage.akdf
    public final boolean u() {
        return true;
    }

    public int w(long j) {
        return c();
    }

    protected int y(java.lang.String str, java.util.Locale locale) {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            throw new defpackage.akdp(this.g, str);
        }
    }
}
