package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ljd implements defpackage.lhn {
    public static final defpackage.ljc a = new defpackage.ljc();
    public static final defpackage.afhl b = new defpackage.lco(defpackage.mkp.b, 6);
    public final defpackage.xzg c;
    public int d;
    private final defpackage.eqp e;
    private final defpackage.afih f;

    public /* synthetic */ ljd(byte[] bArr) {
        this.e = defpackage.ebo.e(defpackage.lje.b().b);
        this.c = new defpackage.xzg((defpackage.xzo) defpackage.ojm.a().b);
        this.d = 1;
        this.f = new defpackage.eyx(this, 11, (boolean[][]) null);
    }

    public final void a() {
        defpackage.xzg xzgVar = this.c;
        if (xzgVar.a) {
            xzgVar.f();
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LOCATION, defpackage.zbd.LE);
            rrvVarH.u(xzgVar.c().toMillis());
            oimVarU.F(rrvVarH.l());
        }
    }

    @Override // defpackage.lhn
    public final void d() {
        if (this.d == 2) {
            a();
        }
        this.d = 1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [affc, afih] */
    @Override // defpackage.lhn
    public final void eQ() {
        this.e.eM(defpackage.ler.c(), new defpackage.ewl(this.f, 13, null));
    }

    public ljd() {
        this(null);
    }
}
