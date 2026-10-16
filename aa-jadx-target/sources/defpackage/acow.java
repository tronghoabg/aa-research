package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acow implements defpackage.acov {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.s("BufferPoolsFeature__crash_on_buffer_leak_threshold_video", 30L);
        b = rkqVar.v("BufferPoolsFeature__max_pool_capacities", new defpackage.acnn(6), "CijoB+gH6AfoB+gH6AfoB+gH6AfoB+gH6AfoB+gH6AfoB+gHZGRkKBQU");
    }

    @Override // defpackage.acov
    public final long a() {
        return ((java.lang.Long) a.fF()).longValue();
    }

    @Override // defpackage.acov
    public final defpackage.absv b() {
        return (defpackage.absv) b.fF();
    }
}
