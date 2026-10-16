package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bgn {
    public static final defpackage.affj a = new defpackage.ccz(636288403, false, new defpackage.bgm(0));
    public static final defpackage.affj b = new defpackage.ccz(-1357803046, false, new defpackage.bgm(2));

    public static /* synthetic */ defpackage.afbk a(defpackage.bgb bgbVar, defpackage.bhs bhsVar, defpackage.afer aferVar, defpackage.bve bveVar, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVar.C(bgbVar) : bveVar.E(bgbVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVar.C(bhsVar) : bveVar.E(bhsVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVar.E(aferVar) ? 128 : 256;
        }
        if (bveVar.I((i2 & 1171) != 1170, i2 & 1)) {
            defpackage.bgq.c(bgbVar, bhsVar, aferVar, bveVar, i2 & 1022);
        } else {
            bveVar.s();
        }
        return defpackage.afbk.a;
    }
}
