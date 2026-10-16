package L4;

/* loaded from: classes.dex */
public final class i extends k {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6902e;

    @Override // L4.k
    public final int a(int i5, int i10, int i11, int i12) {
        switch (this.f6902e) {
        }
        return 2;
    }

    @Override // L4.k
    public final float b(int i5, int i10, int i11, int i12) {
        switch (this.f6902e) {
            case 0:
                return Math.max(i11 / i5, i12 / i10);
            default:
                return 1.0f;
        }
    }
}
