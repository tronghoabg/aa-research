package Va;

import android.content.Context;

/* loaded from: classes4.dex */
public final class U extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Context f13735c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ String f13736d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Z0 f13737e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ String f13738f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ String f13739g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ AbstractC1127r9 f13740h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Ba f13741i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ V f13742j;

    @Override // Va.Ba
    public final void c() {
        B7 b7G = V.G(this.f13742j, this.f13735c, this.f13736d, this.f13737e);
        if (b7G == null) {
            Cb.e(this.f13741i);
            return;
        }
        Z0 z02 = this.f13737e;
        Ba ba2 = this.f13741i;
        V.N(this.f13742j, z02, b7G, this.f13740h, ba2, this.f13735c, this.f13738f, this.f13739g, true);
    }
}
