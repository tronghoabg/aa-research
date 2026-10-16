package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class pwb implements pwd {
    private final Set b;
    public final zhc a = new zhc();
    private final AtomicBoolean c = new AtomicBoolean(false);

    public pwb(Set set) {
        this.b = set;
    }

    @Override // defpackage.pwd
    public final pwe a() {
        return pwe.j;
    }

    @Override // defpackage.pwd
    public final pwn c() {
        try {
            zhc zhcVar = this.a;
            if (zhcVar.isDone()) {
                return (pwn) wub.af(zhcVar);
            }
            return null;
        } catch (ExecutionException e) {
            throw new zhl(e);
        }
    }

    @Override // defpackage.pwd
    public final zgp d() {
        if (!this.c.getAndSet(true)) {
            int i = yfq.d;
            yfl yflVar = new yfl(4);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                yflVar.i(((puv) it.next()).a());
            }
            zgh zghVarU = wub.U(yflVar.g());
            wdd wddVar = new wdd(1);
            zfq zfqVar = zfq.a;
            zghVarU.a(wddVar, zfqVar).c(new pru(this, 10), zfqVar);
        }
        return wub.Z(this.a);
    }

    @Override // defpackage.pwd
    public final /* synthetic */ void e() {
    }
}
