package com.google.v;

import java.io.IOException;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ac extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    ac(int i2, int i3, int i4, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(i2), Long.valueOf(i3), Integer.valueOf(i4)))), th);
    }

    ac(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
