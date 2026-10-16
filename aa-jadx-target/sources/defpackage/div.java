package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class div {
    public final java.lang.String a = "com.google.android.gms.fonts";
    public final java.lang.String b = "com.google.android.gms";
    private final java.util.List d = null;
    public final int c = 2130903050;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.div)) {
            return false;
        }
        defpackage.div divVar = (defpackage.div) obj;
        if (!defpackage.afga.f(this.a, divVar.a) || !defpackage.afga.f(this.b, divVar.b)) {
            return false;
        }
        java.util.List list = divVar.d;
        if (!defpackage.afga.f(null, null)) {
            return false;
        }
        int i = divVar.c;
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + 2130903050;
    }
}
