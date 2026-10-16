package D9;

import android.app.Application;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class b implements InterfaceC2432a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2564a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2432a f2565b;

    public /* synthetic */ b(InterfaceC2432a interfaceC2432a, int i5) {
        this.f2564a = i5;
        this.f2565b = interfaceC2432a;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f2564a) {
            case 0:
                return new a((Application) this.f2565b.get());
            default:
                return new g((com.bumptech.glide.h) this.f2565b.get());
        }
    }
}
