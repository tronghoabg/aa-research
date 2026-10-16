package com.fasterxml.jackson.databind.util;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ExceptionUtil {
    private ExceptionUtil() {
    }

    private static <E extends Throwable> void _sneaky(Throwable th) throws Throwable {
        throw th;
    }

    private static boolean isFatal(Throwable th) {
        return (th instanceof VirtualMachineError) || (th instanceof ThreadDeath) || (th instanceof InterruptedException) || (th instanceof ClassCircularityError) || (th instanceof ClassFormatError) || (th instanceof IncompatibleClassChangeError) || "java.lang.BootstrapMethodError".equals(th.getClass().getName()) || (th instanceof VerifyError);
    }

    public static void rethrowIfFatal(Throwable th) {
        if (isFatal(th)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (!(th instanceof RuntimeException)) {
                throw new RuntimeException(th);
            }
            throw ((RuntimeException) th);
        }
    }

    public static <T> T throwSneaky(IOException iOException) throws Throwable {
        _sneaky(iOException);
        return null;
    }
}
