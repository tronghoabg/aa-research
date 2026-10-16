package defpackage;

import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class ajor {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        String message;
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !afyh.u(message, "getsockname failed", false)) ? false : true;
    }
}
