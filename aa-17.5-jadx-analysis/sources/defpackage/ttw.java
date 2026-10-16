package defpackage;

/* loaded from: classes3.dex */
public class ttw implements ttx {
    private final xyc a;

    public ttw(xyc xycVar) {
        this.a = xycVar;
    }

    @Override // defpackage.ttx
    public ttv a(abgl abglVar, int i, boolean z, xxh xxhVar) {
        xyc xycVar = this.a;
        return z ? new tts(abglVar, i, (ukz) xycVar.gu()) : new ttu(abglVar, (ukz) xycVar.gu(), xxhVar);
    }
}
