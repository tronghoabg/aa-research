package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wda {
    public final com.google.android.gms.phenotype.ExperimentTokens a;
    public final java.lang.String b;

    public wda(com.google.android.gms.phenotype.ExperimentTokens experimentTokens, java.lang.String str) {
        str.getClass();
        this.a = experimentTokens;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.wda)) {
            return false;
        }
        defpackage.wda wdaVar = (defpackage.wda) obj;
        return defpackage.afga.f(this.a, wdaVar.a) && defpackage.afga.f(this.b, wdaVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ExperimentTokenData(experimentToken=" + this.a + ", configPackageName=" + this.b + ")";
    }
}
