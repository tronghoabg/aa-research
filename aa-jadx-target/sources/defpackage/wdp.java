package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wdp {
    private final defpackage.xyd b;
    private defpackage.yhx c = defpackage.ynd.a;
    private boolean d = false;
    public boolean a = false;

    public wdp(defpackage.xyd xydVar) {
        this.b = xydVar;
    }

    public final defpackage.wdo a() {
        return new defpackage.wdo(new defpackage.wdi(this.b, this.d, this.a, this.c));
    }

    public final void b() {
        this.d = true;
    }

    public final void c(java.util.Set set) {
        this.c = defpackage.yhx.n(set);
    }
}
