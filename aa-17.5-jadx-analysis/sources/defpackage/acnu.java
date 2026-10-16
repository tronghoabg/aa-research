package defpackage;

/* loaded from: classes.dex */
public final class acnu implements acnt {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.s("BufferPoolsFeature__crash_on_buffer_leak_threshold_video", 30L);
        b = rjuVar.v("BufferPoolsFeature__max_pool_capacities", new acml(6), "CijoB+gH6AfoB+gH6AfoB+gH6AfoB+gH6AfoB+gH6AfoB+gHZGRkKBQU");
    }

    @Override // defpackage.acnt
    public final long a() {
        return ((Long) a.gu()).longValue();
    }

    @Override // defpackage.acnt
    public final abrs b() {
        return (abrs) b.gu();
    }
}
