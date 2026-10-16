package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fcn implements defpackage.fbr {
    public final defpackage.fbs f;
    public final java.lang.String g;
    public boolean h;

    public fcn(defpackage.fbs fbsVar, java.lang.String str) {
        this.f = fbsVar;
        this.g = str;
    }

    @Override // defpackage.fbr
    public /* synthetic */ boolean m() {
        return b(0) != 0;
    }

    protected final void n() {
        if (this.h) {
            defpackage.csc.l(21, "statement is closed");
            throw new defpackage.afap();
        }
    }

    protected final void o() {
        this.h = true;
    }
}
