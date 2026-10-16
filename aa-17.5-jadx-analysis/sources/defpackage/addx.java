package defpackage;

/* loaded from: classes3.dex */
public final class addx implements addw {
    private static final wcj a;
    private static final wcj b;
    private static final wcj c;

    static {
        rju rjuVar = addf.b;
        a = rjuVar.u("CoreMaps__enable_shared_labeler", false);
        b = rjuVar.u("45719940", false);
        c = rjuVar.s("45788255", 0L);
    }

    @Override // defpackage.addw
    public final long a() {
        return ((Long) c.gu()).longValue();
    }

    @Override // defpackage.addw
    public final boolean b() {
        return ((Boolean) a.gu()).booleanValue();
    }

    @Override // defpackage.addw
    public final boolean c() {
        return ((Boolean) b.gu()).booleanValue();
    }
}
