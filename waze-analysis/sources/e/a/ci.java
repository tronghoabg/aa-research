package e.a;

import java.io.ByteArrayInputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ci extends ch {

    /* renamed from: b, reason: collision with root package name */
    private final ce f46529b;

    /* synthetic */ ci(ce ceVar) {
        super("token-bin", false, ceVar);
        com.google.d.b.an.s(true, "Binary header is named %s. It must end with %s", "token-bin", "-bin");
        com.google.d.b.an.m(true, "empty key name");
        this.f46529b = ceVar;
    }

    @Override // e.a.ch
    final Object a(byte[] bArr) {
        return this.f46529b.b(new ByteArrayInputStream(bArr));
    }

    @Override // e.a.ch
    final byte[] b(Object obj) {
        return cm.k(this.f46529b.a(obj));
    }

    @Override // e.a.ch
    final boolean f() {
        return true;
    }
}
