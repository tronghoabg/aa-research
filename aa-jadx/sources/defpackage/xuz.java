package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xuz {
    public static final defpackage.xuz a;
    private final java.util.UUID b;
    private final java.util.concurrent.atomic.AtomicLong c;

    static {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            a = new defpackage.xuz(java.util.UUID.randomUUID(), new java.security.SecureRandom().nextLong());
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public xuz(java.util.UUID uuid, long j) {
        this.b = uuid;
        this.c = new java.util.concurrent.atomic.AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    final long a() {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j;
        long j2;
        long j3;
        do {
            atomicLong = this.c;
            j = atomicLong.get();
            j2 = ((j * 25214903917L) + 11) & 281474976710655L;
            j3 = ((25214903917L * j2) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j, j3));
        return (((long) ((int) (j2 >>> 16))) << 32) + ((long) ((int) (j3 >>> 16)));
    }

    public final java.util.UUID b() {
        long jA = a() & (-61441);
        long jA2 = a() >>> 2;
        java.util.UUID uuid = this.b;
        return new java.util.UUID(jA ^ uuid.getMostSignificantBits(), jA2 ^ uuid.getLeastSignificantBits());
    }
}
