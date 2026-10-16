package com.google.b.d.b;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final k f7098a;

    /* renamed from: b, reason: collision with root package name */
    private final UUID f7099b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f7100c;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f7098a = new k(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    k(UUID uuid, long j2) {
        this.f7099b = uuid;
        this.f7100c = new AtomicLong((j2 ^ 25214903917L) & 281474976710655L);
    }

    static k b() {
        return f7098a;
    }

    final long a() {
        AtomicLong atomicLong;
        long j2;
        do {
            atomicLong = this.f7100c;
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, ((25214903917L * (((j2 * 25214903917L) + 11) & 281474976710655L)) + 11) & 281474976710655L));
        return (((int) (r5 >>> 16)) << 32) + ((int) (r3 >>> 16));
    }

    public final UUID c() {
        long jA = a() & (-61441);
        long jA2 = a() >>> 2;
        UUID uuid = this.f7099b;
        return new UUID(jA ^ uuid.getMostSignificantBits(), jA2 ^ uuid.getLeastSignificantBits());
    }
}
