package L8;

import E5.Q;
import java.util.Set;
import l9.C3445a;
import l9.InterfaceC3447c;
import s8.C4026b;

/* loaded from: classes4.dex */
public final class u implements InterfaceC3447c {

    /* renamed from: a, reason: collision with root package name */
    public final Set f7034a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3447c f7035b;

    public u(Set set, InterfaceC3447c interfaceC3447c) {
        this.f7034a = set;
        this.f7035b = interfaceC3447c;
    }

    @Override // l9.InterfaceC3447c
    public final void a(C3445a c3445a) {
        if (this.f7034a.contains(C4026b.class)) {
            this.f7035b.a(c3445a);
            return;
        }
        throw new Q("Attempting to publish an undeclared event " + c3445a + ".", 3);
    }
}
