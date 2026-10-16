package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cd implements bz {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f51643b;

    public cd(int i2) {
        this.f51643b = i2;
    }

    @Override // kotlinx.coroutines.b.bz
    public final k a(ch chVar) {
        return this.f51643b != 0 ? bl.r(bw.f51619a) : new aj(chVar, 5);
    }

    public final String toString() {
        return this.f51643b != 0 ? "SharingStarted.Eagerly" : "SharingStarted.Lazily";
    }
}
