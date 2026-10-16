package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class sop implements slf {
    final /* synthetic */ slg a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public sop(rju rjuVar, BasePendingResult basePendingResult, int i) {
        this.c = i;
        this.a = basePendingResult;
        this.b = rjuVar;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.slf
    public final void a(Status status) {
        if (this.c != 0) {
            ((rju) this.b).a.remove(this.a);
        } else if (status.c()) {
            this.a.c(0L, TimeUnit.MILLISECONDS);
            ((nok) this.b).e(null);
        } else {
            ((nok) this.b).d(oni.k(status));
        }
    }

    public sop(slg slgVar, nok nokVar, int i) {
        this.c = i;
        this.a = slgVar;
        this.b = nokVar;
    }
}
