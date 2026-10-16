package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kun {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.bsd b;

    static {
        defpackage.bcr bcrVar = defpackage.kta.a;
        defpackage.bcr bcrVar2 = defpackage.kta.a;
        b = new defpackage.bsd(bcrVar2, bcrVar2, bcrVar2);
    }

    public static final defpackage.bsd a(defpackage.bve bveVar) {
        defpackage.bsd bsdVar = b;
        defpackage.cld cldVar = bsdVar.a;
        defpackage.cld cldVar2 = bsdVar.b;
        defpackage.cld cldVar3 = bsdVar.c;
        boolean zC = bveVar.C(cldVar) | bveVar.C(cldVar2) | bveVar.C(cldVar3);
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        java.lang.Object objS = bwcVar.S();
        if (zC || objS == defpackage.bvd.a) {
            objS = new defpackage.bsd(cldVar, cldVar2, cldVar3);
            bwcVar.ad(objS);
        }
        return (defpackage.bsd) objS;
    }
}
