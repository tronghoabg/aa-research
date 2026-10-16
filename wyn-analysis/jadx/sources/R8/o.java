package R8;

/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f10499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10500c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10501d;

    public /* synthetic */ o(s sVar, long j8, String str, int i5) {
        this.f10498a = i5;
        this.f10499b = sVar;
        this.f10500c = j8;
        this.f10501d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10498a) {
            case 0:
                m mVar = this.f10499b.f10517h;
                u uVar = mVar.f10489n;
                if (uVar == null || !uVar.f10536e.get()) {
                    ((T8.c) mVar.f10485i.f11792b).e(this.f10500c, this.f10501d);
                    break;
                }
                break;
            default:
                s sVar = this.f10499b;
                sVar.f10524p.f11035b.b(new o(sVar, this.f10500c, this.f10501d, 0));
                break;
        }
    }
}
