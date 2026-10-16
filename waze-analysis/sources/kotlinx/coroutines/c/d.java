package kotlinx.coroutines.c;

import androidx.credentials.provider.CredentialEntry;
import e.a.h.ad;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f51787a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f51788b = Boolean.parseBoolean(System.getProperty("kotlinx.coroutines.google.stacktrace.recovery", CredentialEntry.FALSE_STRING));

    public static final boolean a() {
        return f51788b;
    }

    public static final void b(Throwable th, h.c.b.a.d dVar) {
        x.f(th, "exception");
        x.f(dVar, "topFrame");
        a aVar = new a(dVar);
        Throwable[] suppressed = th.getSuppressed();
        x.e(suppressed, "getSuppressed(...)");
        for (Throwable th2 : suppressed) {
            if ((th2 instanceof a) && ((a) th2).a(aVar)) {
                return;
            }
        }
        ad.c(th, aVar);
    }
}
