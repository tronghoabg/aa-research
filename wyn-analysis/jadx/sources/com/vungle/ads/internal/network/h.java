package com.vungle.ads.internal.network;

/* loaded from: classes5.dex */
public final class h {
    public static final void a(Throwable th) throws Throwable {
        if ((th instanceof ThreadDeath) || (th instanceof LinkageError)) {
            throw th;
        }
    }
}
