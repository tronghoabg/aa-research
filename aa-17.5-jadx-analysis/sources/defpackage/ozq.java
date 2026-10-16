package defpackage;

import android.net.TrafficStats;
import java.net.SocketException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

/* loaded from: classes2.dex */
public final class ozq extends ozn {
    private static final yph f = yph.c("GH.WirelessProxy");
    public String e;

    public ozq(String str, SocketChannel socketChannel, SelectionKey selectionKey, ozm ozmVar) throws SocketException {
        super(str, socketChannel, selectionKey, ozmVar);
        try {
            TrafficStats.tagSocket(socketChannel.socket());
        } catch (SocketException unused) {
            ((ype) ((ype) f.h()).ai((char) 6255)).u("Failed to tag socket");
        }
    }

    @Override // defpackage.ozn
    public final void b() throws SocketException {
        try {
            TrafficStats.untagSocket(this.a.socket());
        } catch (SocketException unused) {
            ((ype) ((ype) f.h()).ai((char) 6256)).u("Failed to untag socket");
        }
        super.b();
    }

    @Override // defpackage.ozn
    protected final void c(String str) {
        this.e = str;
    }
}
