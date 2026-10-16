package defpackage;

/* loaded from: classes.dex */
public final class akx {
    public static final bvf a = new bvh(new ajc(4));

    public static final aiu a(bux buxVar) {
        buxVar.v(282942128);
        aiv aivVar = (aiv) buxVar.f(a);
        if (aivVar == null) {
            ((bvv) buxVar).Y(false);
            return null;
        }
        boolean zC = buxVar.C(aivVar);
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        if (zC || objS == buw.a) {
            objS = aivVar.a();
            bvvVar.ad(objS);
        }
        aiu aiuVar = (aiu) objS;
        bvvVar.Y(false);
        return aiuVar;
    }
}
