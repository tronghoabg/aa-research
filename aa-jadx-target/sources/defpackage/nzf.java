package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nzf {
    public final defpackage.nze a;
    public final android.content.Intent b;
    public final defpackage.qqe c;

    public nzf(android.content.Intent intent, defpackage.qqe qqeVar, defpackage.nze nzeVar) {
        this.a = nzeVar;
        this.b = intent;
        this.c = qqeVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nzf)) {
            return false;
        }
        defpackage.nzf nzfVar = (defpackage.nzf) obj;
        return j$.util.Objects.equals(this.a, nzfVar.a) && j$.util.Objects.equals(this.b, nzfVar.b) && j$.util.Objects.equals(this.c, nzfVar.c);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c});
    }

    public final java.lang.String toString() {
        defpackage.xym xymVar = new defpackage.xym("AppProviderFilterQuery");
        xymVar.b("filters", this.a);
        xymVar.b("queryIntent", this.b);
        xymVar.b("applicationType", this.c);
        return xymVar.toString();
    }
}
