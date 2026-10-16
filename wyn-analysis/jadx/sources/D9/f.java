package D9;

import df.InterfaceC2432a;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class f implements InterfaceC2432a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2571a;

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f2571a) {
            case 0:
                return new d();
            case 1:
                return new i();
            case 2:
                return new N9.b(1L, TimeUnit.DAYS.toMillis(1L));
            default:
                return new M9.a();
        }
    }
}
