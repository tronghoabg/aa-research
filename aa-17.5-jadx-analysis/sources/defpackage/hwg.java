package defpackage;

/* loaded from: classes2.dex */
public final class hwg implements igb {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hwg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [hwo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [hwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [dzk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [dzk, java.lang.Object] */
    @Override // defpackage.igb
    public final /* synthetic */ Object a() {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            zit zitVar = (zit) obj;
            return new hvy((hwh) zitVar.a, zitVar.c);
        }
        gsv gsvVar = (gsv) obj;
        Object obj2 = gsvVar.e;
        Object obj3 = gsvVar.f;
        return new hwn((hye) obj2, (hye) obj3, (hye) gsvVar.b, gsvVar.a, gsvVar.d, gsvVar.c);
    }
}
