package defpackage;

/* loaded from: classes.dex */
public final class bgj {
    public static final afej a = new cct(636288403, false, new bgi(0));
    public static final afej b = new cct(-1357803046, false, new bgi(2));

    public static /* synthetic */ afak a(bfy bfyVar, bho bhoVar, afdr afdrVar, bux buxVar, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVar.C(bfyVar) : buxVar.E(bfyVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVar.C(bhoVar) : buxVar.E(bhoVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVar.E(afdrVar) ? 128 : 256;
        }
        if (buxVar.I((i2 & 1171) != 1170, i2 & 1)) {
            bgm.c(bfyVar, bhoVar, afdrVar, buxVar, i2 & 1022);
        } else {
            buxVar.s();
        }
        return afak.a;
    }
}
