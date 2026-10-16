package defpackage;

/* loaded from: classes3.dex */
public final class zin implements adiz {
    private final aezk a;
    private final Class b;
    private final Class c;

    public zin(aezk aezkVar, Class cls, Class cls2) {
        this.a = aezkVar;
        this.b = cls;
        this.c = cls2;
    }

    @Override // defpackage.adiz
    public final adqq b(admf admfVar, adiw adiwVar, adix adixVar) {
        try {
            Object objA = this.a.a();
            zkt.x(admfVar, this.b, true);
            zkt.x(admfVar, this.c, false);
            return new zix(new zis(adixVar, admfVar, adiwVar, (yfq) objA));
        } catch (adnr e) {
            return new zjb(adnq.c(e));
        }
    }
}
