package hb;

/* loaded from: classes4.dex */
public final class D extends F {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f36242f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(H h10, int i5) {
        super(h10);
        this.f36242f = i5;
    }

    @Override // hb.F, java.util.Iterator
    public Object next() {
        switch (this.f36242f) {
            case 1:
                return a().f36255f;
            default:
                return super.next();
        }
    }
}
