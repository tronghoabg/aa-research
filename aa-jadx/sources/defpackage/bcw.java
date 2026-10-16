package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bcw {
    public static final defpackage.bcr a = d();

    public static final defpackage.bcr a(float f, float f2, float f3, float f4) {
        return new defpackage.bcr(new defpackage.bcv(f), new defpackage.bcv(f2), new defpackage.bcv(f3), new defpackage.bcv(f4));
    }

    public static final defpackage.bcr b(float f) {
        defpackage.bct bctVar = new defpackage.bct(f);
        return new defpackage.bcr(bctVar, bctVar, bctVar, bctVar);
    }

    public static final defpackage.bcr c(float f, float f2, float f3, float f4) {
        return new defpackage.bcr(new defpackage.bct(f), new defpackage.bct(f2), new defpackage.bct(f3), new defpackage.bct(f4));
    }

    public static final defpackage.bcr d() {
        defpackage.bcu bcuVar = new defpackage.bcu(50.0f);
        return new defpackage.bcr(bcuVar, bcuVar, bcuVar, bcuVar);
    }
}
