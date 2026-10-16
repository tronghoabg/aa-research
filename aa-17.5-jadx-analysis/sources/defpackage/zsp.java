package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zsp extends hqw {
    private static final Executor k = new oyd(3);
    private final zu l;
    private final hqm m;

    public zsp(tsu tsuVar, ieb iebVar, zu zuVar, hqz hqzVar) {
        super(tsuVar, iebVar, new zso(zuVar, hqzVar));
        this.l = zuVar;
        this.m = new hqm(k);
    }

    @Override // defpackage.hqw
    @ResultIgnorabilityUnspecified
    public final void a(hqt hqtVar) {
        scz sczVar = (scz) this.l.b(hqtVar.c);
        if (sczVar != null) {
            this.m.c(hqtVar, sczVar, null);
            return;
        }
        hqtVar.h = this;
        Set set = this.b;
        synchronized (set) {
            set.add(hqtVar);
        }
        hqtVar.g = Integer.valueOf(this.a.incrementAndGet());
        hqtVar.e("add-to-queue");
        b();
        if (hqtVar.i) {
            this.c.add(hqtVar);
        } else {
            this.d.add(hqtVar);
        }
    }
}
