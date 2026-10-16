package defpackage;

import java.util.HashMap;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final class mpc extends eqm {
    public Supplier a = null;

    @Override // defpackage.eqj
    protected final void d() {
        if (this.a != null) {
            m(new HashMap());
            this.a = null;
        }
    }

    @Override // defpackage.eqj
    public final void m(Object obj) {
        super.m(obj);
        this.a = null;
    }
}
