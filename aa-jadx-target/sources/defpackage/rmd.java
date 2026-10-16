package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rmd {
    public final boolean a;
    public final int b;
    public final defpackage.rmo c;

    public rmd(boolean z, int i, defpackage.rmo rmoVar) {
        this.a = z;
        this.b = i;
        this.c = rmoVar;
    }

    public static defpackage.rmc a() {
        defpackage.rmc rmcVar = new defpackage.rmc();
        rmcVar.b(100);
        rmcVar.a = defpackage.rmo.a().a();
        return rmcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rmd) {
            defpackage.rmd rmdVar = (defpackage.rmd) obj;
            if (this.a == rmdVar.a && this.b == rmdVar.b && this.c.equals(rmdVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return this.c.hashCode() ^ ((((i ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final java.lang.String toString() {
        return "GalSnoopSettings{isEnabled=" + this.a + ", bufferSize=" + this.b + ", galMessageFilter=" + java.lang.String.valueOf(this.c) + "}";
    }

    public rmd() {
        throw null;
    }
}
