package k.a;

import h.g.b.x;
import h.n.o;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f50785a = Logger.getLogger("okio.Okio");

    public static final boolean b(AssertionError assertionError) {
        String message;
        x.f(assertionError, "<this>");
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !o.F(message, "getsockname failed", false)) ? false : true;
    }
}
