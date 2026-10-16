package t6;

import java.io.IOException;

/* renamed from: t6.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4128D extends IOException {
    public C4128D(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
    }
}
