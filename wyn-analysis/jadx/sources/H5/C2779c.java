package h5;

import U8.v0;
import g5.C2709f;
import java.io.Serializable;
import java.util.HashMap;
import uc.InterfaceC4280q;

/* renamed from: h5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2779c extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2709f f36145a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4280q f36146b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f36147c;

    public C2779c(InterfaceC4280q interfaceC4280q, C2709f c2709f, Boolean bool) {
        this.f36146b = interfaceC4280q;
        this.f36145a = c2709f;
        this.f36147c = bool;
    }

    @Override // U8.v0
    public final Object H(String str) {
        return null;
    }

    @Override // U8.v0
    public final Boolean L() {
        return this.f36147c;
    }

    @Override // U8.v0
    public final C2709f N() {
        return this.f36145a;
    }

    @Override // h5.InterfaceC2781e
    public final void a(HashMap map, String str) {
        this.f36146b.b("sqlite_error", str, map);
    }

    @Override // h5.InterfaceC2781e
    public final void b(Serializable serializable) {
        this.f36146b.a(serializable);
    }
}
