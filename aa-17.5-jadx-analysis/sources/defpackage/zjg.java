package defpackage;

/* loaded from: classes.dex */
public final class zjg implements yqt {
    private final yfq a;

    public zjg(yqt... yqtVarArr) {
        this.a = yfq.p(yqtVarArr);
    }

    @Override // defpackage.yqt
    public final ypp a(String str) {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        int i2 = 0;
        while (true) {
            yfq yfqVar = this.a;
            if (i2 >= ((yls) yfqVar).c) {
                return new zjf(str, yflVar.g());
            }
            yflVar.i(((yqt) yfqVar.get(i2)).a(str));
            i2++;
        }
    }
}
