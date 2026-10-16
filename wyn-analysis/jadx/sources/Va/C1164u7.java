package Va;

import java.util.List;

/* renamed from: Va.u7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1164u7 extends AbstractC1205xa {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14660c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ String f14661d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ List f14662e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ C1214y7 f14663f;

    public /* synthetic */ C1164u7(int i5) {
        this.f14660c = i5;
    }

    @Override // Va.Ba
    public final void c() {
        switch (this.f14660c) {
            case 0:
                C1214y7.s(this.f14663f, this.f14661d, false, false, this.f14662e);
                break;
            case 1:
                C1214y7.s(this.f14663f, this.f14661d, false, true, this.f14662e);
                break;
            default:
                C1214y7.s(this.f14663f, this.f14661d, true, false, this.f14662e);
                break;
        }
    }
}
