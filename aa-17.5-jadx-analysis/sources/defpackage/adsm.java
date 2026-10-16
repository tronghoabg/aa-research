package defpackage;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public interface adsm extends Closeable {
    adss a(SocketAddress socketAddress, adsl adslVar, adiy adiyVar);

    Collection b();

    ScheduledExecutorService c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
