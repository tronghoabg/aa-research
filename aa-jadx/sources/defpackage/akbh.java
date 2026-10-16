package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akbh implements java.lang.Cloneable, java.io.Serializable {
    private static final long serialVersionUID = 2810581718468737193L;
    public final defpackage.ajqt a;
    public final java.lang.String b;
    public final java.lang.String c;

    public akbh(java.lang.String str, java.lang.String str2, defpackage.ajqt ajqtVar) {
        defpackage.aguw.e(str, "Method");
        this.b = str;
        this.c = str2;
        defpackage.aguw.e(ajqtVar, "Version");
        this.a = ajqtVar;
    }

    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }

    public final java.lang.String toString() {
        return defpackage.akbd.e(null, this).toString();
    }
}
