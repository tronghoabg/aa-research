package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class esw extends defpackage.ers {
    public static final defpackage.erw a = new defpackage.esv();
    public final defpackage.abb b = new defpackage.abb(null);
    public boolean c = false;

    public final est a(int i) {
        return (est) defpackage.abc.a(this.b, i);
    }

    final void b() {
        this.c = false;
    }

    @Override // defpackage.ers
    protected final void d() {
        defpackage.abb abbVar = this.b;
        int iC = abbVar.c();
        for (int i = 0; i < iC; i++) {
            ((est) abbVar.e(i)).a(true);
        }
        int i2 = abbVar.d;
        java.lang.Object[] objArr = abbVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        abbVar.d = 0;
        abbVar.a = false;
    }
}
