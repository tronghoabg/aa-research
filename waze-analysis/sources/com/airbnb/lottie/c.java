package com.airbnb.lottie;

import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements u {
    @Override // com.airbnb.lottie.u
    public final void a(Object obj) {
        Throwable th = (Throwable) obj;
        int i2 = LottieAnimationView.f1729a;
        int i3 = com.airbnb.lottie.g.k.f2415a;
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        com.airbnb.lottie.g.c.b("Unable to load composition.", th);
    }
}
