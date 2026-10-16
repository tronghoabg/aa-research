package defpackage;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class slm extends slq {
    protected final slt a;

    public slm(int i, slt sltVar) {
        super(i);
        this.a = sltVar;
    }

    @Override // defpackage.slq
    public final void f(Status status) {
        try {
            this.a.f(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.slq
    public final void g(Exception exc) {
        try {
            this.a.f(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage(), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.slq
    public final void h(sme smeVar) throws DeadObjectException {
        try {
            this.a.e(smeVar.b);
        } catch (RuntimeException e) {
            g(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.slq
    public final void i(rju rjuVar, boolean z) {
        slt sltVar = this.a;
        rjuVar.a.put(sltVar, Boolean.valueOf(z));
        sltVar.d(new sop(rjuVar, sltVar, 1));
    }
}
