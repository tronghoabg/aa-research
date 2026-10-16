package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bll {
    public final java.lang.CharSequence a;
    public final long b;
    public final android.view.textclassifier.TextClassification c;
    public final java.util.List d;

    public bll(java.lang.CharSequence charSequence, long j, android.view.textclassifier.TextClassification textClassification, java.util.List list) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bll)) {
            return false;
        }
        defpackage.bll bllVar = (defpackage.bll) obj;
        if (!defpackage.afga.f(this.a, bllVar.a)) {
            return false;
        }
        long j = this.b;
        long j2 = bllVar.b;
        long j3 = defpackage.dgc.a;
        return defpackage.a.i(j, j2) && defpackage.afga.f(this.c, bllVar.c) && defpackage.afga.f(this.d, bllVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = defpackage.dgc.a;
        return ((((iHashCode + defpackage.a.f(this.b)) * 31) + a$.ExternalSyntheticApiModelOutline1.m(this.c)) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "TextClassificationResult(text=" + ((java.lang.Object) this.a) + ", selection=" + defpackage.dgc.f(this.b) + ", textClassification=" + this.c + ", icons=" + this.d + ")";
    }
}
