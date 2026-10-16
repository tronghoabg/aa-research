package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes2.dex */
public final class qrr extends rja {
    public static final ypf a = ols.R("CAR.DIAGNOSTICS");
    public final WeakReference b;
    private final rwb c;
    private final riy d = new riy(new qmr(this, 3));
    private final riy e = new riy(new qmr(this, 4));

    public qrr(Context context, rwb rwbVar) {
        this.b = new WeakReference(context);
        this.c = rwbVar;
    }

    @Override // defpackage.rjb
    public final List a() {
        return this.c.b();
    }

    @Override // defpackage.rjb
    public final void b(rje rjeVar) {
        this.d.a(rjeVar);
    }

    @Override // defpackage.rjb
    public final void c(rje rjeVar) {
        this.e.a(rjeVar);
    }
}
