package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class nyj {
    public final ygr a;

    public nyj(ygr ygrVar) {
        this.a = ygrVar;
    }

    public static nyj a() {
        return d(nyi.a, nyi.b);
    }

    public static nyj b() {
        return new nyj(yly.a);
    }

    public static nyj d(nyi... nyiVarArr) {
        return new nyj(ygr.o(nyiVarArr));
    }

    public final nyj c(ygr ygrVar) {
        ygp ygpVar = new ygp();
        yno it = this.a.iterator();
        while (it.hasNext()) {
            nyi nyiVar = (nyi) it.next();
            if (!ygrVar.contains(nyiVar)) {
                ygpVar.c(nyiVar);
            }
        }
        return new nyj(ygpVar.g());
    }

    public final boolean e() {
        return this.a.contains(nyi.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nyj) {
            return Objects.equals(this.a, ((nyj) obj).a);
        }
        return false;
    }

    public final boolean f() {
        return this.a.contains(nyi.a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        xxg xxgVar = new xxg("AppProviderFilter");
        xxgVar.b(CloudRecognizerProtocolStrings.OPTIONS, this.a);
        return xxgVar.toString();
    }
}
