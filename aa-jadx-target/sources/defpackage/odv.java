package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class odv implements aizj {
    final /* synthetic */ aizj a;
    private final /* synthetic */ int b;

    public odv(aizj aizjVar, int i) {
        this.b = i;
        this.a = aizjVar;
    }

    public final java.lang.Object hd(aizk aizkVar, defpackage.afdk afdkVar) {
        if (this.b != 0) {
            java.lang.Object objHd = this.a.hd(new defpackage.byq(aizkVar, 2), afdkVar);
            return objHd == defpackage.afdr.a ? objHd : defpackage.afbk.a;
        }
        java.lang.Object objHd2 = this.a.hd(new defpackage.byq(aizkVar, 3), afdkVar);
        return objHd2 == defpackage.afdr.a ? objHd2 : defpackage.afbk.a;
    }
}
