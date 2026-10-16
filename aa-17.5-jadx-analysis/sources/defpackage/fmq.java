package defpackage;

/* loaded from: classes2.dex */
public abstract class fmq implements fmt {
    public final fnc a;

    public fmq(fnc fncVar) {
        this.a = fncVar;
    }

    @Override // defpackage.fmt
    public final aiyk a(fja fjaVar) {
        fjaVar.getClass();
        return new aiyd(new dmx(this, (afck) null, 7));
    }

    @Override // defpackage.fmt
    public final boolean c(fod fodVar) {
        return b(fodVar) && e(this.a.b());
    }

    public abstract int d();

    public boolean e(Object obj) {
        throw null;
    }
}
