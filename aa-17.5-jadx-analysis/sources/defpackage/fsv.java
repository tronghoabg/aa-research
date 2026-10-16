package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class fsv extends ept implements eqa {
    public static final fsv b;
    private static final fsv c;
    private static final eps d;

    static {
        fsv fsvVar = new fsv();
        b = fsvVar;
        c = fsvVar;
        d = eps.e;
    }

    @Override // defpackage.ept
    public final eps a() {
        return d;
    }

    @Override // defpackage.ept
    public final void c(epz epzVar) {
        epzVar.getClass();
        if (!(epzVar instanceof epf)) {
            Objects.toString(epzVar);
            throw new IllegalArgumentException(epzVar.toString().concat(" must implement androidx.lifecycle.DefaultLifecycleObserver."));
        }
        epf epfVar = (epf) epzVar;
        epfVar.fv(this);
        epfVar.fy(this);
        epfVar.fx(this);
    }

    @Override // defpackage.ept
    public final void d(epz epzVar) {
        epzVar.getClass();
    }

    @Override // defpackage.eqa
    public final /* synthetic */ ept getLifecycle() {
        return c;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
