package L9;

import J9.I;
import android.app.Application;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class f implements A9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7048a;

    /* renamed from: b, reason: collision with root package name */
    public final Xd.c f7049b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2432a f7050c;

    public /* synthetic */ f(Xd.c cVar, InterfaceC2432a interfaceC2432a, int i5) {
        this.f7048a = i5;
        this.f7049b = cVar;
        this.f7050c = interfaceC2432a;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f7048a) {
            case 0:
                Application application = (Application) this.f7050c.get();
                this.f7049b.getClass();
                return new I(application, "fiam_eligible_campaigns_cache_file");
            case 1:
                Application application2 = (Application) this.f7050c.get();
                this.f7049b.getClass();
                return new I(application2, "fiam_impressions_store_file");
            default:
                Application application3 = (Application) this.f7050c.get();
                this.f7049b.getClass();
                return new I(application3, "rate_limit_store_file");
        }
    }
}
