package defpackage;

import java.io.Serializable;
import java.util.Locale;
import org.jni_zero.JniZero;

/* loaded from: classes2.dex */
public abstract class akdw implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    protected abstract long a();

    protected akcd b() {
        throw null;
    }

    public abstract akcf c();

    public final int d() {
        return c().a(a());
    }

    public final String e(Locale locale) {
        return c().l(a(), locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akdw)) {
            return false;
        }
        akdw akdwVar = (akdw) obj;
        return d() == akdwVar.d() && g().equals(akdwVar.g()) && JniZero.d(b(), akdwVar.b());
    }

    public final String f(Locale locale) {
        return c().n(a(), locale);
    }

    public final akch g() {
        return c().p();
    }

    public final int hashCode() {
        return (d() * 17) + g().hashCode() + b().hashCode();
    }

    public final String toString() {
        return "Property[" + c().o() + "]";
    }
}
