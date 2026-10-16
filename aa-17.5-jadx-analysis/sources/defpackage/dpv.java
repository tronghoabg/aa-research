package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public class dpv extends dpp implements dqd {
    protected final dpz al;
    public final ArrayList am;
    public final int an;

    public dpv(dpz dpzVar, int i) {
        super(dpzVar);
        this.am = new ArrayList();
        this.al = dpzVar;
        this.an = i;
    }

    @Override // defpackage.dpp, defpackage.dpw
    public final dqn b() {
        return x();
    }

    public dqs x() {
        return null;
    }

    public final void y() {
        super.e();
    }

    public final void z(Object... objArr) {
        Collections.addAll(this.am, objArr);
    }

    @Override // defpackage.dpp, defpackage.dpw
    public void e() {
    }
}
