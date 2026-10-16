package uc;

/* renamed from: uc.r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4281r {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4269f f46761a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46762b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4282s f46763c;

    /* renamed from: d, reason: collision with root package name */
    public final ab.b f46764d;

    public C4281r(InterfaceC4269f interfaceC4269f, String str) {
        this(interfaceC4269f, str, C4287x.f46768b, null);
    }

    public final void a(String str, Object obj, InterfaceC4280q interfaceC4280q) {
        this.f46761a.j(this.f46762b, this.f46763c.d(new C4278o(str, obj)), interfaceC4280q == null ? null : new C4264a(1, this, interfaceC4280q));
    }

    public final void b(InterfaceC4279p interfaceC4279p) {
        String str = this.f46762b;
        InterfaceC4269f interfaceC4269f = this.f46761a;
        ab.b bVar = this.f46764d;
        if (bVar != null) {
            interfaceC4269f.i(str, interfaceC4279p != null ? new t6.q(this, interfaceC4279p) : null, bVar);
        } else {
            interfaceC4269f.l(str, interfaceC4279p != null ? new t6.q(this, interfaceC4279p) : null);
        }
    }

    public C4281r(InterfaceC4269f interfaceC4269f, String str, InterfaceC4282s interfaceC4282s, ab.b bVar) {
        this.f46761a = interfaceC4269f;
        this.f46762b = str;
        this.f46763c = interfaceC4282s;
        this.f46764d = bVar;
    }
}
