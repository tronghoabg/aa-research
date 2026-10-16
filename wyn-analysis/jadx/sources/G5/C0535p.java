package G5;

import android.os.Handler;

/* renamed from: G5.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0535p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4432a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f4433b;

    /* renamed from: c, reason: collision with root package name */
    public final E5.F f4434c;

    public /* synthetic */ C0535p(Handler handler, E5.F f10, int i5) {
        this.f4432a = i5;
        this.f4433b = handler;
        this.f4434c = f10;
    }

    private final void b(H5.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = this.f4433b;
        if (handler != null) {
            handler.post(new C8.d(9, this, eVar));
        }
    }

    public final void a(H5.e eVar) {
        switch (this.f4432a) {
            case 0:
                b(eVar);
                break;
            default:
                synchronized (eVar) {
                }
                Handler handler = this.f4433b;
                if (handler != null) {
                    handler.post(new ng.a(18, this, eVar));
                    break;
                }
                break;
        }
    }
}
