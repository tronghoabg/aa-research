package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nze {
    public final defpackage.yhx a;

    public nze(defpackage.yhx yhxVar) {
        this.a = yhxVar;
    }

    public static defpackage.nze a() {
        return d(defpackage.nzd.a, defpackage.nzd.b);
    }

    public static defpackage.nze b() {
        return new defpackage.nze(defpackage.ynd.a);
    }

    public static defpackage.nze d(defpackage.nzd... nzdVarArr) {
        return new defpackage.nze(defpackage.yhx.o(nzdVarArr));
    }

    public final defpackage.nze c(defpackage.yhx yhxVar) {
        defpackage.yhv yhvVar = new defpackage.yhv();
        defpackage.yot it = this.a.iterator();
        while (it.hasNext()) {
            defpackage.nzd nzdVar = (defpackage.nzd) it.next();
            if (!yhxVar.contains(nzdVar)) {
                yhvVar.c(nzdVar);
            }
        }
        return new defpackage.nze(yhvVar.g());
    }

    public final boolean e() {
        return this.a.contains(defpackage.nzd.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nze) {
            return j$.util.Objects.equals(this.a, ((defpackage.nze) obj).a);
        }
        return false;
    }

    public final boolean f() {
        return this.a.contains(defpackage.nzd.a);
    }

    public final int hashCode() {
        return j$.util.Objects.hashCode(this.a);
    }

    public final java.lang.String toString() {
        defpackage.xym xymVar = new defpackage.xym("AppProviderFilter");
        xymVar.b(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.OPTIONS, this.a);
        return xymVar.toString();
    }
}
