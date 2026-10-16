package v9;

/* renamed from: v9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC4334a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC4335b f47042b;

    public /* synthetic */ RunnableC4334a(AbstractC4335b abstractC4335b, int i5) {
        this.f47041a = i5;
        this.f47042b = abstractC4335b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC4335b abstractC4335b = this.f47042b;
        switch (this.f47041a) {
            case 0:
                r rVar = abstractC4335b.f47055h;
                A6.c.z(rVar == r.f47110f, "State should still be backoff but was %s", rVar);
                abstractC4335b.f47055h = r.f47105a;
                abstractC4335b.g();
                A6.c.z(abstractC4335b.d(), "Stream should have started", new Object[0]);
                break;
            default:
                if (abstractC4335b.c()) {
                    abstractC4335b.f47055h = r.f47108d;
                    break;
                }
                break;
        }
    }
}
