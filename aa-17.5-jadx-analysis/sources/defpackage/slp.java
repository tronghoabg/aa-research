package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class slp extends sll {
    public final smp b;

    public slp(smp smpVar, nok nokVar) {
        super(4, nokVar);
        this.b = smpVar;
    }

    @Override // defpackage.slk
    public final int a(sme smeVar) {
        rjr rjrVar = (rjr) smeVar.e.get(this.b);
        if (rjrVar != null) {
            return ((smw) rjrVar.b).d;
        }
        return -1;
    }

    @Override // defpackage.slk
    public final boolean c(sme smeVar) {
        rjr rjrVar = (rjr) smeVar.e.get(this.b);
        return rjrVar != null && ((smw) rjrVar.b).c;
    }

    @Override // defpackage.slk
    public final Feature[] d(sme smeVar) {
        rjr rjrVar = (rjr) smeVar.e.get(this.b);
        if (rjrVar == null) {
            return null;
        }
        return ((smw) rjrVar.b).b;
    }

    @Override // defpackage.sll
    public final void e(sme smeVar) throws RemoteException {
        rjr rjrVar = (rjr) smeVar.e.remove(this.b);
        if (rjrVar == null) {
            this.a.e(false);
            return;
        }
        ((smx) ((ykd) rjrVar.c).a).b.a(smeVar.b, this.a);
        ((smw) rjrVar.b).a.a();
    }

    @Override // defpackage.sll, defpackage.slq
    public final /* bridge */ /* synthetic */ void i(rju rjuVar, boolean z) {
    }
}
