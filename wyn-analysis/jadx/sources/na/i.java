package na;

import hb.F;

/* loaded from: classes4.dex */
public final class i extends F {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f40973f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(l lVar, int i5) {
        super(lVar);
        this.f40973f = i5;
    }

    @Override // hb.F, java.util.Iterator
    public Object next() {
        switch (this.f40973f) {
            case 1:
                return b().f40981f;
            default:
                return super.next();
        }
    }
}
