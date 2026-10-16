package defpackage;

/* loaded from: classes.dex */
public final class kug {
    public static final /* synthetic */ int a = 0;
    private static final brx b;

    static {
        bcm bcmVar = kss.a;
        bcm bcmVar2 = kss.a;
        b = new brx(bcmVar2, bcmVar2, bcmVar2);
    }

    public static final brx a(bux buxVar) {
        brx brxVar = b;
        ckv ckvVar = brxVar.a;
        ckv ckvVar2 = brxVar.b;
        ckv ckvVar3 = brxVar.c;
        boolean zC = buxVar.C(ckvVar) | buxVar.C(ckvVar2) | buxVar.C(ckvVar3);
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        if (zC || objS == buw.a) {
            objS = new brx(ckvVar, ckvVar2, ckvVar3);
            bvvVar.ad(objS);
        }
        return (brx) objS;
    }
}
