package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajzc implements java.lang.Cloneable, java.io.Serializable, defpackage.ajvu, defpackage.ajvi {
    private static final long serialVersionUID = -3869795591041535538L;
    private final java.lang.String a;
    private final java.lang.String b;
    public java.util.Map c = new java.util.HashMap();
    public java.lang.String d;
    public int e;
    private java.lang.String f;
    private java.util.Date g;
    private boolean h;

    public ajzc(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ajvi
    public final int a() {
        return this.e;
    }

    @Override // defpackage.ajvi
    public final java.lang.String b() {
        return this.f;
    }

    @Override // defpackage.ajvi
    public final java.lang.String c() {
        return this.a;
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        defpackage.ajzc ajzcVar = (defpackage.ajzc) super.clone();
        ajzcVar.c = new java.util.HashMap(this.c);
        return ajzcVar;
    }

    @Override // defpackage.ajvi
    public final java.lang.String d() {
        return this.d;
    }

    @Override // defpackage.ajvi
    public final java.lang.String e() {
        return this.b;
    }

    @Override // defpackage.ajvi
    public final java.util.Date f() {
        return this.g;
    }

    public boolean g(java.util.Date date) {
        java.util.Date date2 = this.g;
        return date2 != null && date2.getTime() <= date.getTime();
    }

    @Override // defpackage.ajvi
    public final boolean h() {
        return this.h;
    }

    public int[] i() {
        return null;
    }

    @Override // defpackage.ajvu
    public final void j(java.lang.String str) {
        this.f = str != null ? str.toLowerCase(java.util.Locale.ROOT) : null;
    }

    @Override // defpackage.ajvu
    public final void k(java.util.Date date) {
        this.g = date;
    }

    @Override // defpackage.ajvu
    public final void l(java.lang.String str) {
        this.d = str;
    }

    @Override // defpackage.ajvu
    public final void m(int i) {
        this.e = i;
    }

    @Override // defpackage.ajvu
    public final void n() {
        this.h = true;
    }

    public final void o(java.lang.String str, java.lang.String str2) {
        this.c.put(str, str2);
    }

    public final boolean p(java.lang.String str) {
        return this.c.containsKey(str);
    }

    public final java.lang.String toString() {
        return "[version: " + java.lang.Integer.toString(this.e) + "][name: " + this.a + "][value: " + this.b + "][domain: " + this.f + "][path: " + this.d + "][expiry: " + this.g + "]";
    }
}
