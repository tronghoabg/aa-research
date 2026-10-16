package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class iq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ii f47175a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ iw f47176b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ iv f47177c;

    iq(iv ivVar, ii iiVar, iw iwVar) {
        this.f47175a = iiVar;
        this.f47176b = iwVar;
        Objects.requireNonNull(ivVar);
        this.f47177c = ivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ii iiVar = this.f47175a;
        synchronized (iiVar.f47152a) {
            if (iiVar.f47154c) {
                return;
            }
            iiVar.a();
            this.f47177c.f47185b.f47204k.execute(new ip(this, this.f47176b));
        }
    }
}
