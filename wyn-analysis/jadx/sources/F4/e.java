package F4;

import A7.B0;

/* loaded from: classes.dex */
public final class e extends B0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3844b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i5) {
        super(2);
        this.f3844b = i5;
    }

    public final h e0() {
        switch (this.f3844b) {
            case 0:
                return new d(this);
            default:
                return new j(this);
        }
    }
}
