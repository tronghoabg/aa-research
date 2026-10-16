package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class az implements bl {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f51375a;

    public az(boolean z) {
        this.f51375a = z;
    }

    @Override // kotlinx.coroutines.bl
    public final ck bL() {
        return null;
    }

    @Override // kotlinx.coroutines.bl
    public final boolean bM() {
        return this.f51375a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(true != this.f51375a ? "New" : "Active");
        sb.append("}");
        return sb.toString();
    }
}
