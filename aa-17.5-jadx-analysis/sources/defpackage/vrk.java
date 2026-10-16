package defpackage;

/* loaded from: classes3.dex */
public final class vrk extends vri {
    public static final vrk a = new vrk();

    @Override // defpackage.vri
    public final /* synthetic */ abow a(String str, Object obj) {
        return vuf.s(str, lk$$ExternalSyntheticApiModelOutline0.m348m(obj));
    }

    @Override // defpackage.vri
    public final /* synthetic */ abow b(abow abowVar, abow abowVar2) {
        return vuf.r((ajet) abowVar, (ajet) abowVar2);
    }

    @Override // defpackage.vri
    public final /* bridge */ /* synthetic */ String c(abow abowVar) {
        ajet ajetVar = (ajet) abowVar;
        ajeo ajeoVar = ajetVar.e;
        if (ajeoVar == null) {
            ajeoVar = ajeo.a;
        }
        if ((ajeoVar.b & 2) != 0) {
            ajeo ajeoVar2 = ajetVar.e;
            if (ajeoVar2 == null) {
                ajeoVar2 = ajeo.a;
            }
            return ajeoVar2.d;
        }
        ajeo ajeoVar3 = ajetVar.e;
        if (ajeoVar3 == null) {
            ajeoVar3 = ajeo.a;
        }
        return Long.toHexString(ajeoVar3.c);
    }
}
