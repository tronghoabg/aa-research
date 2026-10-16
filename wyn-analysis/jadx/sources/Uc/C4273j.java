package uc;

import java.util.concurrent.atomic.AtomicReference;
import ne.C3618a;

/* renamed from: uc.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4273j {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4269f f46752a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46753b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4282s f46754c;

    public C4273j(InterfaceC4269f interfaceC4269f, String str) {
        this(interfaceC4269f, str, C4287x.f46768b);
    }

    public final void a(InterfaceC4272i interfaceC4272i) {
        C3618a c3618a;
        if (interfaceC4272i == null) {
            c3618a = null;
        } else {
            C3618a c3618a2 = new C3618a();
            c3618a2.f41022c = this;
            c3618a2.f41021b = new AtomicReference(null);
            c3618a2.f41020a = interfaceC4272i;
            c3618a = c3618a2;
        }
        this.f46752a.l(this.f46753b, c3618a);
    }

    public C4273j(InterfaceC4269f interfaceC4269f, String str, InterfaceC4282s interfaceC4282s) {
        this.f46752a = interfaceC4269f;
        this.f46753b = str;
        this.f46754c = interfaceC4282s;
    }
}
