package n9;

import w9.InterfaceC4395n;

/* renamed from: n9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C3606a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3607b f40943a;

    public /* synthetic */ C3606a(C3607b c3607b) {
        this.f40943a = c3607b;
    }

    public final void a(C8.c cVar) {
        C3607b c3607b = this.f40943a;
        synchronized (c3607b) {
            try {
                if (cVar.f1911b != null) {
                    Ba.c.p("FirebaseAppCheckTokenProvider", "Error getting App Check token; using placeholder token instead. Error: " + cVar.f1911b, 2, new Object[0]);
                }
                InterfaceC4395n interfaceC4395n = c3607b.f40944b;
                if (interfaceC4395n != null) {
                    interfaceC4395n.b(cVar.f1910a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
