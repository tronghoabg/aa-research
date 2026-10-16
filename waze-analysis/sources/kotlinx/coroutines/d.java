package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    private final c[] f51827a;

    public d(c[] cVarArr) {
        this.f51827a = cVarArr;
    }

    public final void a() {
        int i2 = 0;
        while (true) {
            c[] cVarArr = this.f51827a;
            if (i2 >= cVarArr.length) {
                return;
            }
            ax axVar = cVarArr[i2].f51781a;
            if (axVar == null) {
                h.g.b.x.j("handle");
                axVar = null;
            }
            axVar.dispose();
            i2++;
        }
    }

    @Override // kotlinx.coroutines.j
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f51827a + "]";
    }
}
