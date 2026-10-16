package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class akew implements java.io.Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    protected abstract long a();

    protected defpackage.akdd b() {
        throw null;
    }

    public abstract defpackage.akdf c();

    public final int d() {
        return c().a(a());
    }

    public final java.lang.String e(java.util.Locale locale) {
        return c().l(a(), locale);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.akew)) {
            return false;
        }
        defpackage.akew akewVar = (defpackage.akew) obj;
        return d() == akewVar.d() && g().equals(akewVar.g()) && org.jni_zero.JniZero.d(b(), akewVar.b());
    }

    public final java.lang.String f(java.util.Locale locale) {
        return c().n(a(), locale);
    }

    public final defpackage.akdh g() {
        return c().p();
    }

    public final int hashCode() {
        return (d() * 17) + g().hashCode() + b().hashCode();
    }

    public final java.lang.String toString() {
        return "Property[" + c().o() + "]";
    }
}
