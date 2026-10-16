package defpackage;

import java.util.EnumSet;

/* loaded from: classes.dex */
public final class mgs implements mgm {
    private final mgu a;
    private final EnumSet b;

    public mgs(mgu mguVar, EnumSet enumSet) {
        this.a = mguVar;
        EnumSet enumSetOf = EnumSet.of(mgl.b, mgl.d, mgl.a);
        this.b = enumSetOf;
        enumSetOf.addAll(enumSet);
    }

    @Override // defpackage.mgm
    public final void a(mgl mglVar) {
        if (this.b.contains(mglVar)) {
            ((ype) mgv.a.l().ai((char) 4902)).y("FinishListener Received event: %s, finishing", mglVar);
            this.a.finish();
        }
    }
}
