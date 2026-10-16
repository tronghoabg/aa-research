package defpackage;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.os.Process;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ozl implements ozk {
    private static final yph c = yph.c("GH.WirelessProxy");
    public boolean b;
    private Thread d;
    private final List f;
    private Selector g;
    private ServerSocketChannel h;
    public final Object a = new Object();
    private final Map e = new HashMap();

    public ozl(List list) {
        this.f = new ArrayList(list);
    }

    @Override // defpackage.ozk
    public final ozj a(Context context, long j) throws SecurityException {
        NetworkStatsManager networkStatsManager = (NetworkStatsManager) context.getSystemService(NetworkStatsManager.class);
        if (networkStatsManager == null) {
            return new ozj(-1L, -1L);
        }
        NetworkStats networkStatsQueryDetailsForUidTag = networkStatsManager.queryDetailsForUidTag(0, null, j, System.currentTimeMillis(), Process.myUid(), 11538176);
        NetworkStats.Bucket bucket = new NetworkStats.Bucket();
        long txBytes = 0;
        long rxBytes = 0;
        while (true) {
            if (!networkStatsQueryDetailsForUidTag.hasNextBucket()) {
                break;
            }
            if (!networkStatsQueryDetailsForUidTag.getNextBucket(bucket)) {
                ((ype) ((ype) c.h()).ai((char) 6221)).u("Failed to get next stats bucket");
                break;
            }
            txBytes += bucket.getTxBytes();
            rxBytes += bucket.getRxBytes();
        }
        return new ozj(txBytes, rxBytes);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0009, B:11:0x0024, B:15:0x0044, B:16:0x0046, B:18:0x004a, B:22:0x006a, B:23:0x006c, B:24:0x0071, B:27:0x0094, B:26:0x0079, B:21:0x004f, B:14:0x0029), top: B:34:0x0003, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ozk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            boolean r1 = r4.b     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            return
        L9:
            yph r1 = defpackage.ozl.c     // Catch: java.lang.Throwable -> L96
            yop r1 = r1.l()     // Catch: java.lang.Throwable -> L96
            r2 = 6231(0x1857, float:8.731E-42)
            yop r1 = r1.ai(r2)     // Catch: java.lang.Throwable -> L96
            ype r1 = (defpackage.ype) r1     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = "Stopping proxy server..."
            r1.u(r2)     // Catch: java.lang.Throwable -> L96
            r1 = 0
            r4.b = r1     // Catch: java.lang.Throwable -> L96
            java.nio.channels.Selector r1 = r4.g     // Catch: java.lang.Throwable -> L96
            r2 = 0
            if (r1 == 0) goto L46
            r1.close()     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L96
            goto L44
        L28:
            r1 = move-exception
            yph r3 = defpackage.ozl.c     // Catch: java.lang.Throwable -> L96
            yop r3 = r3.h()     // Catch: java.lang.Throwable -> L96
            ype r3 = (defpackage.ype) r3     // Catch: java.lang.Throwable -> L96
            yop r1 = r3.p(r1)     // Catch: java.lang.Throwable -> L96
            ype r1 = (defpackage.ype) r1     // Catch: java.lang.Throwable -> L96
            r3 = 6234(0x185a, float:8.736E-42)
            yop r1 = r1.ai(r3)     // Catch: java.lang.Throwable -> L96
            ype r1 = (defpackage.ype) r1     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = "Error on closing selector is ignored."
            r1.u(r3)     // Catch: java.lang.Throwable -> L96
        L44:
            r4.g = r2     // Catch: java.lang.Throwable -> L96
        L46:
            java.nio.channels.ServerSocketChannel r1 = r4.h     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L6c
            r1.close()     // Catch: java.io.IOException -> L4e java.lang.Throwable -> L96
            goto L6a
        L4e:
            r1 = move-exception
            yph r3 = defpackage.ozl.c     // Catch: java.lang.Throwable -> L96
            yop r3 = r3.h()     // Catch: java.lang.Throwable -> L96
            ype r3 = (defpackage.ype) r3     // Catch: java.lang.Throwable -> L96
            yop r1 = r3.p(r1)     // Catch: java.lang.Throwable -> L96
            ype r1 = (defpackage.ype) r1     // Catch: java.lang.Throwable -> L96
            r3 = 6233(0x1859, float:8.734E-42)
            yop r1 = r1.ai(r3)     // Catch: java.lang.Throwable -> L96
            ype r1 = (defpackage.ype) r1     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = "Error on closing sever is ignored"
            r1.u(r3)     // Catch: java.lang.Throwable -> L96
        L6a:
            r4.h = r2     // Catch: java.lang.Throwable -> L96
        L6c:
            java.lang.Thread r1 = r4.d     // Catch: java.lang.Throwable -> L96
            r1.interrupt()     // Catch: java.lang.Throwable -> L96
            java.lang.Thread r1 = r4.d     // Catch: java.lang.InterruptedException -> L79 java.lang.Throwable -> L96
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.join(r2)     // Catch: java.lang.InterruptedException -> L79 java.lang.Throwable -> L96
            goto L94
        L79:
            yph r1 = defpackage.ozl.c     // Catch: java.lang.Throwable -> L96
            yop r1 = r1.h()     // Catch: java.lang.Throwable -> L96
            ype r1 = (defpackage.ype) r1     // Catch: java.lang.Throwable -> L96
            r2 = 6232(0x1858, float:8.733E-42)
            yop r1 = r1.ai(r2)     // Catch: java.lang.Throwable -> L96
            ype r1 = (defpackage.ype) r1     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = "Failed to join thread %s"
            java.lang.Thread r4 = r4.d     // Catch: java.lang.Throwable -> L96
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L96
            r1.y(r2, r4)     // Catch: java.lang.Throwable -> L96
        L94:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            return
        L96:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozl.b():void");
    }

    @Override // defpackage.ozk
    @ResultIgnorabilityUnspecified
    public final boolean c() {
        synchronized (this.a) {
            if (this.b) {
                return true;
            }
            ((ype) c.l().ai(6228)).u("Starting up the server...");
            try {
                ServerSocketChannel serverSocketChannelOpen = ServerSocketChannel.open();
                serverSocketChannelOpen.configureBlocking(false);
                serverSocketChannelOpen.socket().bind(new InetSocketAddress(8990));
                Selector selectorOpen = Selector.open();
                try {
                    serverSocketChannelOpen.register(selectorOpen, 16);
                    this.b = true;
                    this.h = serverSocketChannelOpen;
                    this.g = selectorOpen;
                    Thread thread = new Thread(new oyy(this, 7), "ProxyServer");
                    this.d = thread;
                    thread.start();
                    return true;
                } catch (ClosedChannelException e) {
                    ((ype) ((ype) ((ype) c.g()).p(e)).ai(6229)).u("Failed to register selector");
                    return false;
                }
            } catch (IOException e2) {
                ((ype) ((ype) ((ype) c.g()).p(e2)).ai(6230)).u("Failed to start the server");
                return false;
            }
        }
    }

    public final void d() {
        Selector selector;
        ((ype) c.l().ai((char) 6222)).u("Selector loop started");
        while (true) {
            synchronized (this.a) {
                if (this.b && this.h != null && (selector = this.g) != null) {
                    try {
                        selector.select();
                    } catch (IOException e) {
                        ((ype) ((ype) ((ype) c.g()).p(e)).ai((char) 6227)).u("Selector select exception. Ignore.");
                    }
                    if (!selector.isOpen()) {
                        break;
                    }
                    try {
                        Iterator<SelectionKey> it = selector.selectedKeys().iterator();
                        while (it.hasNext()) {
                            SelectionKey next = it.next();
                            it.remove();
                            ozo ozoVar = (ozo) next.attachment();
                            if (next.isValid()) {
                                if (ozoVar == null) {
                                    ozoVar = new ozo(selector, this.f, new ajmd(this.e));
                                }
                                try {
                                    if (next.isAcceptable()) {
                                        SocketChannel socketChannelAccept = ((ServerSocketChannel) next.channel()).accept();
                                        socketChannelAccept.configureBlocking(false);
                                        ((ype) ozo.a.l().ai(6244)).y("Client connected: %s", socketChannelAccept.socket().getInetAddress());
                                        ozoVar.b = (ozp) ozoVar.c(ozp.class, socketChannelAccept);
                                    } else {
                                        ozp ozpVar = ozoVar.b;
                                        ozq ozqVar = ozoVar.c;
                                        if (ozpVar != null && next.equals(ozpVar.b)) {
                                            ozpVar.d();
                                        } else if (ozqVar != null && next.equals(ozqVar.b)) {
                                            if (ozpVar != null) {
                                                ozpVar.e();
                                                ozqVar.d();
                                            } else {
                                                ((ype) ((ype) ozo.a.g()).ai((char) 6249)).u("Got something from target, but client is no longer with us :-/");
                                                ozoVar.d();
                                            }
                                        }
                                    }
                                } catch (IOException e2) {
                                    ((ype) ((ype) ((ype) c.g()).p(e2)).ai((char) 6224)).u("Failed to handle key");
                                    ozoVar.d();
                                }
                            } else {
                                ((ype) ((ype) c.h()).ai((char) 6225)).y("SelectionKey is not valid %s", next);
                                if (ozoVar != null) {
                                    ozoVar.d();
                                }
                            }
                        }
                    } catch (ClosedSelectorException unused) {
                        ((ype) ((ype) c.h()).ai((char) 6226)).u("Selector closed");
                    }
                } else {
                    break;
                }
            }
        }
        ((ype) c.l().ai((char) 6223)).u("Selector loop finished");
    }

    public final String toString() {
        String str;
        synchronized (this.a) {
            str = "ProxyServer { started: " + this.b + ", port: 8990, header: " + this.e.toString() + "}";
        }
        return str;
    }
}
