package defpackage;

/* loaded from: classes3.dex */
public enum vmb implements abnz {
    EVENT_TYPE_UNKNOWN(0),
    MEMORY(1),
    TIMER(2),
    NETWORK(3),
    CRASH(4),
    JANK(5),
    BATTERY(6),
    PRIMES_INTERNAL(7),
    CPU(8),
    TRACE(9),
    CPU_PROFILING(10),
    STRICT_MODE(11),
    CLIENT_TRACING(12),
    CUI(13),
    DISK(14),
    APPLICATION_EXIT(15),
    STALL(16);

    public final int r;

    vmb(int i) {
        this.r = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
