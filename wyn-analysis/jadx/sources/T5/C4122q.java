package t5;

import java.util.HashMap;
import kd.V;
import m9.B;
import q5.AbstractC3869d;
import q5.C3866a;
import q5.C3867b;
import q5.C3868c;
import q5.InterfaceC3871f;
import q5.InterfaceC3873h;
import y5.C4563a;

/* renamed from: t5.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4122q {

    /* renamed from: a, reason: collision with root package name */
    public final C4114i f45793a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45794b;

    /* renamed from: c, reason: collision with root package name */
    public final C3868c f45795c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3871f f45796d;

    /* renamed from: e, reason: collision with root package name */
    public final C4123r f45797e;

    public C4122q(C4114i c4114i, String str, C3868c c3868c, InterfaceC3871f interfaceC3871f, C4123r c4123r) {
        this.f45793a = c4114i;
        this.f45794b = str;
        this.f45795c = c3868c;
        this.f45796d = interfaceC3871f;
        this.f45797e = c4123r;
    }

    public final void a(AbstractC3869d abstractC3869d, InterfaceC3873h interfaceC3873h) {
        C4114i c4114i = this.f45793a;
        if (abstractC3869d == null) {
            throw new NullPointerException("Null event");
        }
        String str = this.f45794b;
        InterfaceC3871f interfaceC3871f = this.f45796d;
        if (interfaceC3871f == null) {
            throw new NullPointerException("Null transformer");
        }
        C3868c c3868c = this.f45795c;
        C4123r c4123r = this.f45797e;
        C3866a c3866a = (C3866a) abstractC3869d;
        C4114i c4114iB = c4114i.b(c3866a.f44121b);
        com.bumptech.glide.f fVar = new com.bumptech.glide.f();
        fVar.f24235f = new HashMap();
        fVar.f24233d = Long.valueOf(c4123r.f45799a.c());
        fVar.f24234e = Long.valueOf(c4123r.f45800b.c());
        fVar.f24230a = str;
        fVar.f24232c = new C4117l(c3868c, (byte[]) interfaceC3871f.apply(c3866a.f44120a));
        fVar.f24231b = null;
        C3867b c3867b = c3866a.f44122c;
        if (c3867b != null) {
            fVar.f24236g = c3867b.f44123a;
        }
        C4113h c4113hF = fVar.f();
        C4563a c4563a = (C4563a) c4123r.f45801c;
        c4563a.getClass();
        c4563a.f48027b.execute(new V(c4563a, c4114iB, interfaceC3873h, c4113hF, 3));
    }

    public final void b(AbstractC3869d abstractC3869d) {
        a(abstractC3869d, new B(23));
    }
}
