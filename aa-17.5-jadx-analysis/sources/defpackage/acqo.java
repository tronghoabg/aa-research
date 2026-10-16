package defpackage;

/* loaded from: classes3.dex */
public final class acqo implements acqn {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.u("ExampleFeature__example_kill_switch", true);
        b = rjuVar.u("ExampleFeature__example_launch_param", false);
    }

    @Override // defpackage.acqn
    public final boolean a() {
        return ((Boolean) a.gu()).booleanValue();
    }

    @Override // defpackage.acqn
    public final boolean b() {
        return ((Boolean) b.gu()).booleanValue();
    }
}
