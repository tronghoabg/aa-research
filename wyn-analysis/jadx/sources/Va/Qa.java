package Va;

/* loaded from: classes4.dex */
public final class Qa extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13637c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ String f13638d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ String f13639e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Ra f13640f;

    public /* synthetic */ Qa(int i5) {
        this.f13637c = i5;
    }

    @Override // Va.Ba
    public final void c() {
        switch (this.f13637c) {
            case 0:
                String str = this.f13638d;
                String str2 = this.f13639e;
                Ra ra2 = this.f13640f;
                ra2.q(str, str2);
                Ra.g(ra2);
                break;
            default:
                String str3 = this.f13638d;
                String str4 = this.f13639e;
                Ra ra3 = this.f13640f;
                ra3.r(str3, str4);
                Ra.g(ra3);
                break;
        }
    }
}
