package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class wfg {
    public static final Long a = 10L;
    public static final Long b = 60000L;
    private final ConcurrentMap c = new ConcurrentHashMap();

    @Deprecated
    public wfg() {
    }

    public static xxh a(FileChannel fileChannel, boolean z) throws IOException {
        try {
            return xxh.h(new wfe(fileChannel.lock(0L, Long.MAX_VALUE, z), 1));
        } catch (IOException e) {
            if (e.getMessage().contains("Resource deadlock would occur")) {
                return xvy.a;
            }
            throw e;
        }
    }

    public final Semaphore b(String str) {
        return (Semaphore) ConcurrentMap.EL.computeIfAbsent(this.c, str, new kqm(20));
    }
}
