package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;

/* loaded from: classes4.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final p f30318a = new p(512000, false, 1.0d);

    public static final g a(Exception exc) {
        return exc instanceof UnknownHostException ? f.f30280q : exc instanceof SocketException ? f.f30273i : exc instanceof SSLHandshakeException ? f.f30274j : exc instanceof IOException ? f.f30270f : exc instanceof SecurityException ? f.f30271g : exc instanceof r ? f.f30276m : exc instanceof NumberFormatException ? f.f30275l : f.f30281r;
    }
}
