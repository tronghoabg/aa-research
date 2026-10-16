package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
final class aeat implements adsm {
    final Executor a;
    final ScheduledExecutorService b;
    final SSLSocketFactory c;
    final aebt d;
    final erb e;
    private final adwt f;
    private final adwt g;
    private final adro h = new adro();
    private boolean i;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public aeat(adwt adwtVar, adwt adwtVar2, SSLSocketFactory sSLSocketFactory, aebt aebtVar, erb erbVar) {
        this.f = adwtVar;
        this.a = adwtVar.a();
        this.g = adwtVar2;
        this.b = (ScheduledExecutorService) adwtVar2.a();
        this.c = sSLSocketFactory;
        this.d = aebtVar;
        erbVar.getClass();
        this.e = erbVar;
    }

    @Override // defpackage.adsm
    public final adss a(SocketAddress socketAddress, adsl adslVar, adiy adiyVar) {
        if (this.i) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        adro adroVar = this.h;
        adyj adyjVar = new adyj(new adrn(adroVar, adroVar.c.get()), 4);
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        String str = adslVar.a;
        adis adisVar = adslVar.b;
        adke adkeVar = adslVar.d;
        xyc xycVar = adue.q;
        Logger logger = aeco.a;
        return new aebe(this, inetSocketAddress, str, adisVar, xycVar, adkeVar, adyjVar);
    }

    @Override // defpackage.adsm
    public final Collection b() {
        int i = aeau.i;
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.adsm
    public final ScheduledExecutorService c() {
        return this.b;
    }

    @Override // defpackage.adsm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f.b(this.a);
        this.g.b(this.b);
    }
}
