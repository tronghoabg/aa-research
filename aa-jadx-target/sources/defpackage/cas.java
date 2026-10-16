package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cas extends defpackage.cbd {
    public static final defpackage.cas a = new defpackage.cas();

    private cas() {
        super(0, 0);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        if (bzpVar.m != 0) {
            defpackage.bvg.b("Cannot reset when inserting");
        }
        bzpVar.G();
        bzpVar.o = 0;
        bzpVar.p = bzpVar.e() - bzpVar.g;
        bzpVar.h = 0;
        bzpVar.i = 0;
        bzpVar.n = 0;
    }
}
