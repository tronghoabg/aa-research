package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zyu extends tng {
    public final ExecutorService i;

    public zyu(Context context, tmb tmbVar, ExecutorService executorService, shv shvVar) {
        super(context, tmbVar, executorService, shvVar);
        this.i = executorService;
        d(new zte(this, 18));
    }

    private final void d(Runnable runnable) {
        svz svzVarA = zys.a();
        if (svzVarA != null) {
            svzVarA.n(new zyv(this, runnable, 1));
        }
    }

    @Override // defpackage.tng
    public final void a() {
        d(new zte(this, 17));
    }

    public final /* synthetic */ void c() {
        super.a();
    }
}
