package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vzg {
    static final defpackage.vzh a = new defpackage.vyp(ajgy.a, true);
    private final java.util.Random b;
    private final defpackage.zfw c;
    private final defpackage.vyo d;

    public vzg(java.util.Random random, defpackage.vyo vyoVar, defpackage.zfw zfwVar) {
        this.b = random;
        this.c = zfwVar;
        this.d = vyoVar;
    }

    public final defpackage.vzh a(ajgy ajgyVar) {
        defpackage.zfw zfwVar;
        int iAs = defpackage.a.as(ajgyVar.e);
        if (iAs == 0) {
            iAs = 1;
        }
        int i = iAs - 1;
        if (i == 1) {
            return new vys(ajgyVar, defpackage.vzf.b(ajgyVar).d());
        }
        if (i == 3) {
            return new vyx(ajgyVar, this.b.nextDouble());
        }
        if (i != 4) {
            return new defpackage.vyp(ajgyVar, true);
        }
        defpackage.vyo vyoVar = this.d;
        return (vyoVar == null || (zfwVar = this.c) == null) ? a : new vyr(ajgyVar, defpackage.vzf.b(ajgyVar), this.b, vyoVar, zfwVar);
    }
}
