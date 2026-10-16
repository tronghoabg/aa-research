package defpackage;

/* loaded from: classes2.dex */
public final class fnq implements fno {
    public final eyn a = new fnp();
    private final ezc b;

    public fnq(ezc ezcVar) {
        this.b = ezcVar;
    }

    @Override // defpackage.fno
    public final Long a(String str) {
        return (Long) ckf.m(this.b, true, false, new bpi(str, 20, (char[]) null));
    }

    @Override // defpackage.fno
    public final void b(fnn fnnVar) {
        ckf.m(this.b, false, true, new bpi(this, fnnVar, 19));
    }
}
