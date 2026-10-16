package defpackage;

/* loaded from: classes3.dex */
public final class ure implements trx {
    private final urf a;

    public ure(tuy tuyVar, ackk ackkVar, xxh xxhVar) {
        tuyVar.o(ackkVar);
        woy.O(xxhVar.f(), "SharedRendererPickHandler must be present when GeoXP is enabled.");
        this.a = (urf) xxhVar.b();
    }

    @Override // defpackage.trx
    public final void a(piv pivVar) {
        urf urfVar = this.a;
        if (urfVar.a) {
            return;
        }
        urfVar.a = true;
        throw null;
    }
}
