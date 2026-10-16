package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bw extends l {

    /* renamed from: b, reason: collision with root package name */
    private final cf f51770b;

    public bw(h.c.e eVar, cf cfVar) {
        super(eVar, 1);
        this.f51770b = cfVar;
    }

    @Override // kotlinx.coroutines.l
    protected final String n() {
        return "AwaitContinuation";
    }

    @Override // kotlinx.coroutines.l
    public final Throwable o(br brVar) {
        Throwable thC;
        Object objBX = this.f51770b.bX();
        return (!(objBX instanceof by) || (thC = ((by) objBX).c()) == null) ? objBX instanceof u ? ((u) objBX).f52067a : brVar.n() : thC;
    }
}
