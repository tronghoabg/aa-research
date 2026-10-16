package com.google.android.gms.internal.ads;

import Va.M6;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzace extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzace(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String strConcat = th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : "";
        super(M6.t(new StringBuilder(strConcat.length() + simpleName.length() + 11), "Unexpected ", simpleName, strConcat), th);
    }
}
