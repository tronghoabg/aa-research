package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adlg {
    public java.lang.String a;
    public defpackage.adlh b;
    public defpackage.adlu c;
    private java.lang.Long d;

    public final defpackage.adli a() {
        java.lang.String str = this.a;
        str.getClass();
        defpackage.adlh adlhVar = this.b;
        adlhVar.getClass();
        java.lang.Long l = this.d;
        l.getClass();
        return new defpackage.adli(str, adlhVar, l.longValue(), this.c);
    }

    public final void b(long j) {
        this.d = java.lang.Long.valueOf(j);
    }
}
