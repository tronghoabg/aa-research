package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akbi implements java.lang.Cloneable, java.io.Serializable {
    private static final long serialVersionUID = -2443303766890459269L;
    public final defpackage.ajqt a;
    public final int b;
    public final java.lang.String c;

    public akbi(defpackage.ajqt ajqtVar, int i, java.lang.String str) {
        defpackage.aguw.e(ajqtVar, "Version");
        this.a = ajqtVar;
        defpackage.aguw.d(i, "Status code");
        this.b = i;
        this.c = str;
    }

    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }

    public final java.lang.String toString() {
        defpackage.akch akchVarB = defpackage.akbd.b(null);
        defpackage.ajqt ajqtVar = this.a;
        int iA = defpackage.akbd.a(ajqtVar) + 5;
        java.lang.String str = this.c;
        if (str != null) {
            iA += str.length();
        }
        akchVarB.j(iA);
        defpackage.akbd.c(akchVarB, ajqtVar);
        akchVarB.e(' ');
        akchVarB.f(java.lang.Integer.toString(this.b));
        akchVarB.e(' ');
        if (str != null) {
            akchVarB.f(str);
        }
        return akchVarB.toString();
    }
}
