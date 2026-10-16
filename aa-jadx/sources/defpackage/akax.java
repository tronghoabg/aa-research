package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akax implements java.lang.Cloneable, java.io.Serializable, defpackage.ajpy {
    private static final defpackage.akay[] c = new defpackage.akay[0];
    private static final long serialVersionUID = -5427236326487562174L;
    public final java.lang.String a;
    private final java.lang.String b;

    public akax(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ajpy
    public final defpackage.akay[] a() throws defpackage.ajqr {
        java.lang.String str = this.b;
        if (str == null) {
            return c;
        }
        int length = str.length();
        defpackage.akba akbaVar = defpackage.akba.a;
        defpackage.akch akchVar = new defpackage.akch(length);
        akchVar.f(str);
        return defpackage.akba.a.b(akchVar, new defpackage.akbo(0, str.length()));
    }

    @Override // defpackage.ajqp
    public final java.lang.String b() {
        return this.a;
    }

    @Override // defpackage.ajqp
    public final java.lang.String c() {
        return this.b;
    }

    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }

    public final java.lang.String toString() {
        return defpackage.akbd.d(null, this).toString();
    }
}
