package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tyn {
    private defpackage.umu a;
    private int b;
    private byte c = 1;

    public tyn(defpackage.tyo tyoVar) {
        this.a = tyoVar.a;
        this.b = tyoVar.b;
    }

    public final defpackage.tyo a() {
        defpackage.umu umuVar;
        if (this.c != 1 || (umuVar = this.a) == null) {
            throw new java.lang.IllegalStateException();
        }
        return new defpackage.tyo(umuVar, this.b);
    }

    public final void b(defpackage.umu umuVar) {
        umuVar.getClass();
        this.a = umuVar;
    }

    public final void c(int i) {
        this.b = i;
        this.c = (byte) 1;
    }
}
