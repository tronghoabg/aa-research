package Ef;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Ef.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0482d implements InterfaceC0496k {

    /* renamed from: a, reason: collision with root package name */
    public final C0480c[] f3724a;

    public C0482d(C0480c[] c0480cArr) {
        this.f3724a = c0480cArr;
    }

    @Override // Ef.InterfaceC0496k
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (C0480c c0480c : this.f3724a) {
            U u10 = c0480c.f3718f;
            if (u10 == null) {
                AbstractC3340k.m("handle");
                throw null;
            }
            u10.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f3724a + ']';
    }
}
