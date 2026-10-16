package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zki implements defpackage.yry {
    private final defpackage.ygw a;

    public zki(defpackage.yry... yryVarArr) {
        this.a = defpackage.ygw.p(yryVarArr);
    }

    @Override // defpackage.yry
    public final defpackage.yqu a(java.lang.String str) {
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        int i2 = 0;
        while (true) {
            defpackage.ygw ygwVar = this.a;
            if (i2 >= ((defpackage.ymx) ygwVar).c) {
                return new defpackage.zkh(str, ygrVar.g());
            }
            ygrVar.i(((defpackage.yry) ygwVar.get(i2)).a(str));
            i2++;
        }
    }
}
