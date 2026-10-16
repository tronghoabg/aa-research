package com.google.android.gms.internal.ads;

import Va.M6;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzids extends IOException {
    public zzids() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzids(long j8, long j10, int i5, Throwable th) {
        Locale locale = Locale.US;
        StringBuilder sbU = M6.u(j8, "Pos: ", ", limit: ");
        sbU.append(j10);
        sbU.append(", len: ");
        sbU.append(i5);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbU.toString()), th);
    }

    public zzids(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
